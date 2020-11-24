package typings.microsoftGraph.mod

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
  implicit class EventMessageOps[Self <: EventMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEndDateTime(value: NullableOption[DateTimeTimeZone]): Self = this.set("endDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndDateTime: Self = this.set("endDateTime", js.undefined)
    
    @scala.inline
    def setEndDateTimeNull: Self = this.set("endDateTime", null)
    
    @scala.inline
    def setEvent(value: NullableOption[Event]): Self = this.set("event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvent: Self = this.set("event", js.undefined)
    
    @scala.inline
    def setEventNull: Self = this.set("event", null)
    
    @scala.inline
    def setIsAllDay(value: NullableOption[Boolean]): Self = this.set("isAllDay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsAllDay: Self = this.set("isAllDay", js.undefined)
    
    @scala.inline
    def setIsAllDayNull: Self = this.set("isAllDay", null)
    
    @scala.inline
    def setIsDelegated(value: NullableOption[Boolean]): Self = this.set("isDelegated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsDelegated: Self = this.set("isDelegated", js.undefined)
    
    @scala.inline
    def setIsDelegatedNull: Self = this.set("isDelegated", null)
    
    @scala.inline
    def setIsOutOfDate(value: NullableOption[Boolean]): Self = this.set("isOutOfDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsOutOfDate: Self = this.set("isOutOfDate", js.undefined)
    
    @scala.inline
    def setIsOutOfDateNull: Self = this.set("isOutOfDate", null)
    
    @scala.inline
    def setLocation(value: NullableOption[Location]): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    
    @scala.inline
    def setLocationNull: Self = this.set("location", null)
    
    @scala.inline
    def setMeetingMessageType(value: NullableOption[MeetingMessageType]): Self = this.set("meetingMessageType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMeetingMessageType: Self = this.set("meetingMessageType", js.undefined)
    
    @scala.inline
    def setMeetingMessageTypeNull: Self = this.set("meetingMessageType", null)
    
    @scala.inline
    def setRecurrence(value: NullableOption[PatternedRecurrence]): Self = this.set("recurrence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecurrence: Self = this.set("recurrence", js.undefined)
    
    @scala.inline
    def setRecurrenceNull: Self = this.set("recurrence", null)
    
    @scala.inline
    def setStartDateTime(value: NullableOption[DateTimeTimeZone]): Self = this.set("startDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartDateTime: Self = this.set("startDateTime", js.undefined)
    
    @scala.inline
    def setStartDateTimeNull: Self = this.set("startDateTime", null)
    
    @scala.inline
    def setType(value: NullableOption[EventType]): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setTypeNull: Self = this.set("type", null)
  }
}
