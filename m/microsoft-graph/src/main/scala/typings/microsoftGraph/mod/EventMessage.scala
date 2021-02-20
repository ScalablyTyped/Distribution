package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventMessage extends Message {
  
  var endDateTime: js.UndefOr[NullableOption[DateTimeTimeZone]] = js.native
  
  /**
    * The event associated with the event message. The assumption for attendees or room resources is that the Calendar
    * Attendant is set to automatically update the calendar with an event when meeting request event messages arrive.
    * Navigation property. Read-only.
    */
  var event: js.UndefOr[NullableOption[Event]] = js.native
  
  var isAllDay: js.UndefOr[NullableOption[Boolean]] = js.native
  
  // True if this meeting request is accessible to a delegate, false otherwise. Default is false.
  var isDelegated: js.UndefOr[NullableOption[Boolean]] = js.native
  
  var isOutOfDate: js.UndefOr[NullableOption[Boolean]] = js.native
  
  var location: js.UndefOr[NullableOption[Location]] = js.native
  
  /**
    * The type of event message: none, meetingRequest, meetingCancelled, meetingAccepted, meetingTenativelyAccepted,
    * meetingDeclined.
    */
  var meetingMessageType: js.UndefOr[NullableOption[MeetingMessageType]] = js.native
  
  var recurrence: js.UndefOr[NullableOption[PatternedRecurrence]] = js.native
  
  var startDateTime: js.UndefOr[NullableOption[DateTimeTimeZone]] = js.native
  
  var `type`: js.UndefOr[NullableOption[EventType]] = js.native
}
object EventMessage {
  
  @scala.inline
  def apply(): EventMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventMessage]
  }
  
  @scala.inline
  implicit class EventMessageMutableBuilder[Self <: EventMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndDateTime(value: NullableOption[DateTimeTimeZone]): Self = StObject.set(x, "endDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndDateTimeNull: Self = StObject.set(x, "endDateTime", null)
    
    @scala.inline
    def setEndDateTimeUndefined: Self = StObject.set(x, "endDateTime", js.undefined)
    
    @scala.inline
    def setEvent(value: NullableOption[Event]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventNull: Self = StObject.set(x, "event", null)
    
    @scala.inline
    def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    @scala.inline
    def setIsAllDay(value: NullableOption[Boolean]): Self = StObject.set(x, "isAllDay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsAllDayNull: Self = StObject.set(x, "isAllDay", null)
    
    @scala.inline
    def setIsAllDayUndefined: Self = StObject.set(x, "isAllDay", js.undefined)
    
    @scala.inline
    def setIsDelegated(value: NullableOption[Boolean]): Self = StObject.set(x, "isDelegated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDelegatedNull: Self = StObject.set(x, "isDelegated", null)
    
    @scala.inline
    def setIsDelegatedUndefined: Self = StObject.set(x, "isDelegated", js.undefined)
    
    @scala.inline
    def setIsOutOfDate(value: NullableOption[Boolean]): Self = StObject.set(x, "isOutOfDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsOutOfDateNull: Self = StObject.set(x, "isOutOfDate", null)
    
    @scala.inline
    def setIsOutOfDateUndefined: Self = StObject.set(x, "isOutOfDate", js.undefined)
    
    @scala.inline
    def setLocation(value: NullableOption[Location]): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationNull: Self = StObject.set(x, "location", null)
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setMeetingMessageType(value: NullableOption[MeetingMessageType]): Self = StObject.set(x, "meetingMessageType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeetingMessageTypeNull: Self = StObject.set(x, "meetingMessageType", null)
    
    @scala.inline
    def setMeetingMessageTypeUndefined: Self = StObject.set(x, "meetingMessageType", js.undefined)
    
    @scala.inline
    def setRecurrence(value: NullableOption[PatternedRecurrence]): Self = StObject.set(x, "recurrence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecurrenceNull: Self = StObject.set(x, "recurrence", null)
    
    @scala.inline
    def setRecurrenceUndefined: Self = StObject.set(x, "recurrence", js.undefined)
    
    @scala.inline
    def setStartDateTime(value: NullableOption[DateTimeTimeZone]): Self = StObject.set(x, "startDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartDateTimeNull: Self = StObject.set(x, "startDateTime", null)
    
    @scala.inline
    def setStartDateTimeUndefined: Self = StObject.set(x, "startDateTime", js.undefined)
    
    @scala.inline
    def setType(value: NullableOption[EventType]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeNull: Self = StObject.set(x, "type", null)
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
