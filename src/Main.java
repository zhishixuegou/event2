import java.text.ParseException;  
  
public class Main {    
    public static void main(String[] args) {    
        Event event = new Event();    
  
        try {    
            event.organizeEvent();    
        } catch (ParseException e) {    
            System.out.println("Error parsing event date. Please enter a valid date in the format yyyy-MM-dd.");    
            e.printStackTrace();    
        }    
    }    
}