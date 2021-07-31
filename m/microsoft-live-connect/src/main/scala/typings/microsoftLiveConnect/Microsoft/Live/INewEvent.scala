package typings.microsoftLiveConnect.Microsoft.Live

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a new event.
  */
trait INewEvent extends StObject {
  
  /**
    * The user's availability status for the event. Valid values are:
    * - free
    * - busy
    * - tentative
    * - out_of_office
    * @default "free"
    */
  var availability: js.UndefOr[String] = js.undefined
  
  /**
    * A description of the event, with a maximum length of 32,768
    * characters. This structure is required.
    */
  var description: String
  
  /**
    * The end time of the event. If no end time is specified, the default
    * value is 30 minutes after start_time. This structure is optional when
    * creating an event. When the event is being read, the time will be the
    * user's local time, in ISO 8601 format.
    * Can be a date string, or a Date object.
    */
  var end_time: js.UndefOr[js.Any] = js.undefined
  
  /**
    * A value that specifies whether the event is an all-day event. If the
    * event is an all-day event, this value is true; otherwise, it is
    * false. If this structure is missing, the default value is false.
    */
  var is_all_day_event: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The name of the location at which the event will take place. The
    * maximum length is 1,000 characters.
    */
  var location: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the event, with a maximum length of 255 characters. This
    * structure is required.
    */
  var name: String
  
  /**
    * The time, in minutes, before the event for the reminder alarm.
    */
  var reminder_time: js.UndefOr[Double] = js.undefined
  
  /**
    * The start time of the event. When the event is being read, the time
    * will be the user's local time, in ISO 8601 format.
    * Can be a date string, or a Date object.
    */
  var start_time: js.Any
  
  /**
    * A value that specifies whether the event is publicly visible. Valid
    * values are:
    * - public  the event is visible to anyone who can view the calendar.
    * - private the event is visible only to the event owner.
    * @default "public"
    */
  var visibility: js.UndefOr[String] = js.undefined
}
object INewEvent {
  
  @scala.inline
  def apply(description: String, name: String, start_time: js.Any): INewEvent = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], start_time = start_time.asInstanceOf[js.Any])
    __obj.asInstanceOf[INewEvent]
  }
  
  @scala.inline
  implicit class INewEventMutableBuilder[Self <: INewEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvailability(value: String): Self = StObject.set(x, "availability", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailabilityUndefined: Self = StObject.set(x, "availability", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnd_time(value: js.Any): Self = StObject.set(x, "end_time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnd_timeUndefined: Self = StObject.set(x, "end_time", js.undefined)
    
    @scala.inline
    def setIs_all_day_event(value: Boolean): Self = StObject.set(x, "is_all_day_event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_all_day_eventUndefined: Self = StObject.set(x, "is_all_day_event", js.undefined)
    
    @scala.inline
    def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReminder_time(value: Double): Self = StObject.set(x, "reminder_time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReminder_timeUndefined: Self = StObject.set(x, "reminder_time", js.undefined)
    
    @scala.inline
    def setStart_time(value: js.Any): Self = StObject.set(x, "start_time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibility(value: String): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
  }
}
