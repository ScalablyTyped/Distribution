package typings.microsoftLiveConnect.Microsoft.Live

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response received after successfully creating a new event.
  */
trait INewEventResponse extends StObject {
  
  /**
    * The user's availability status for the event. Valid values are:
    * - free
    * - busy
    * - tentative
    * - out_of_office
    * @default "free"
    */
  var availability: String
  
  /**
    * A description of the event, with a maximum length of 32,768
    * characters. This structure is required.
    */
  var description: String
  
  /**
    * The end time, in ISO 8601 format, of the event. If no end time is
    * specified, the default value is 30 minutes after start_time. This
    * structure is optional when creating an event. When the event is being
    * read, the time will be the user's local time, in ISO 8601 format.
    */
  var end_time: String
  
  /**
    * A value that specifies whether the event is an all-day event. If the
    * event is an all-day event, this value is true; otherwise, it is
    * false. If this structure is missing, the default value is false.
    */
  var is_all_day_event: Boolean
  
  /**
    * A value that specifies whether the event is recurring. If the event
    * is recurring, this value is true; otherwise, it is false.
    */
  var is_recurrent: Boolean
  
  /**
    * The name of the location at which the event will take place. The
    * maximum length is 1,000 characters.
    */
  var location: String
  
  /**
    * The name of the event, with a maximum length of 255 characters. This
    * structure is required.
    */
  var name: String
  
  /**
    * The text description of the recurrence pattern, for example, "Occurs
    * every week on Tuesday". The value is Null if this is not a recurrent
    * event.
    */
  var recurrence: String
  
  /**
    * The time, in minutes, before the event for the reminder alarm.
    */
  var reminder_time: Double
  
  /**
    * The start time, in ISO 8601 format, of the event. When the event is
    * being read, the time will be the user's local time, in ISO 8601
    * format.
    */
  var start_time: String
  
  /**
    * The time, in ISO 8601 format, at which the event was updated. This
    * structure is visible only in the Event object that is returned if the
    * event was successfully created.
    */
  var updated_time: String
  
  /**
    * A value that specifies whether the event is publicly visible. Valid
    * values are:
    * - public  the event is visible to anyone who can view the calendar.
    * - private the event is visible only to the event owner.
    * @default "public"
    */
  var visibility: String
}
object INewEventResponse {
  
  inline def apply(
    availability: String,
    description: String,
    end_time: String,
    is_all_day_event: Boolean,
    is_recurrent: Boolean,
    location: String,
    name: String,
    recurrence: String,
    reminder_time: Double,
    start_time: String,
    updated_time: String,
    visibility: String
  ): INewEventResponse = {
    val __obj = js.Dynamic.literal(availability = availability.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], end_time = end_time.asInstanceOf[js.Any], is_all_day_event = is_all_day_event.asInstanceOf[js.Any], is_recurrent = is_recurrent.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], recurrence = recurrence.asInstanceOf[js.Any], reminder_time = reminder_time.asInstanceOf[js.Any], start_time = start_time.asInstanceOf[js.Any], updated_time = updated_time.asInstanceOf[js.Any], visibility = visibility.asInstanceOf[js.Any])
    __obj.asInstanceOf[INewEventResponse]
  }
  
  extension [Self <: INewEventResponse](x: Self) {
    
    inline def setAvailability(value: String): Self = StObject.set(x, "availability", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setEnd_time(value: String): Self = StObject.set(x, "end_time", value.asInstanceOf[js.Any])
    
    inline def setIs_all_day_event(value: Boolean): Self = StObject.set(x, "is_all_day_event", value.asInstanceOf[js.Any])
    
    inline def setIs_recurrent(value: Boolean): Self = StObject.set(x, "is_recurrent", value.asInstanceOf[js.Any])
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRecurrence(value: String): Self = StObject.set(x, "recurrence", value.asInstanceOf[js.Any])
    
    inline def setReminder_time(value: Double): Self = StObject.set(x, "reminder_time", value.asInstanceOf[js.Any])
    
    inline def setStart_time(value: String): Self = StObject.set(x, "start_time", value.asInstanceOf[js.Any])
    
    inline def setUpdated_time(value: String): Self = StObject.set(x, "updated_time", value.asInstanceOf[js.Any])
    
    inline def setVisibility(value: String): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
  }
}
