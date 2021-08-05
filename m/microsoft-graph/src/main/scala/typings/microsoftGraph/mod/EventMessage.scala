package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventMessage
  extends StObject
     with Message {
  
  var endDateTime: js.UndefOr[NullableOption[DateTimeTimeZone]] = js.undefined
  
  /**
    * The event associated with the event message. The assumption for attendees or room resources is that the Calendar
    * Attendant is set to automatically update the calendar with an event when meeting request event messages arrive.
    * Navigation property. Read-only.
    */
  var event: js.UndefOr[NullableOption[Event]] = js.undefined
  
  var isAllDay: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // True if this meeting request is accessible to a delegate, false otherwise. Default is false.
  var isDelegated: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  var isOutOfDate: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  var location: js.UndefOr[NullableOption[Location]] = js.undefined
  
  /**
    * The type of event message: none, meetingRequest, meetingCancelled, meetingAccepted, meetingTenativelyAccepted,
    * meetingDeclined.
    */
  var meetingMessageType: js.UndefOr[NullableOption[MeetingMessageType]] = js.undefined
  
  var recurrence: js.UndefOr[NullableOption[PatternedRecurrence]] = js.undefined
  
  var startDateTime: js.UndefOr[NullableOption[DateTimeTimeZone]] = js.undefined
  
  var `type`: js.UndefOr[NullableOption[EventType]] = js.undefined
}
object EventMessage {
  
  inline def apply(): EventMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventMessage]
  }
  
  extension [Self <: EventMessage](x: Self) {
    
    inline def setEndDateTime(value: NullableOption[DateTimeTimeZone]): Self = StObject.set(x, "endDateTime", value.asInstanceOf[js.Any])
    
    inline def setEndDateTimeNull: Self = StObject.set(x, "endDateTime", null)
    
    inline def setEndDateTimeUndefined: Self = StObject.set(x, "endDateTime", js.undefined)
    
    inline def setEvent(value: NullableOption[Event]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setEventNull: Self = StObject.set(x, "event", null)
    
    inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    inline def setIsAllDay(value: NullableOption[Boolean]): Self = StObject.set(x, "isAllDay", value.asInstanceOf[js.Any])
    
    inline def setIsAllDayNull: Self = StObject.set(x, "isAllDay", null)
    
    inline def setIsAllDayUndefined: Self = StObject.set(x, "isAllDay", js.undefined)
    
    inline def setIsDelegated(value: NullableOption[Boolean]): Self = StObject.set(x, "isDelegated", value.asInstanceOf[js.Any])
    
    inline def setIsDelegatedNull: Self = StObject.set(x, "isDelegated", null)
    
    inline def setIsDelegatedUndefined: Self = StObject.set(x, "isDelegated", js.undefined)
    
    inline def setIsOutOfDate(value: NullableOption[Boolean]): Self = StObject.set(x, "isOutOfDate", value.asInstanceOf[js.Any])
    
    inline def setIsOutOfDateNull: Self = StObject.set(x, "isOutOfDate", null)
    
    inline def setIsOutOfDateUndefined: Self = StObject.set(x, "isOutOfDate", js.undefined)
    
    inline def setLocation(value: NullableOption[Location]): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationNull: Self = StObject.set(x, "location", null)
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setMeetingMessageType(value: NullableOption[MeetingMessageType]): Self = StObject.set(x, "meetingMessageType", value.asInstanceOf[js.Any])
    
    inline def setMeetingMessageTypeNull: Self = StObject.set(x, "meetingMessageType", null)
    
    inline def setMeetingMessageTypeUndefined: Self = StObject.set(x, "meetingMessageType", js.undefined)
    
    inline def setRecurrence(value: NullableOption[PatternedRecurrence]): Self = StObject.set(x, "recurrence", value.asInstanceOf[js.Any])
    
    inline def setRecurrenceNull: Self = StObject.set(x, "recurrence", null)
    
    inline def setRecurrenceUndefined: Self = StObject.set(x, "recurrence", js.undefined)
    
    inline def setStartDateTime(value: NullableOption[DateTimeTimeZone]): Self = StObject.set(x, "startDateTime", value.asInstanceOf[js.Any])
    
    inline def setStartDateTimeNull: Self = StObject.set(x, "startDateTime", null)
    
    inline def setStartDateTimeUndefined: Self = StObject.set(x, "startDateTime", js.undefined)
    
    inline def setType(value: NullableOption[EventType]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
