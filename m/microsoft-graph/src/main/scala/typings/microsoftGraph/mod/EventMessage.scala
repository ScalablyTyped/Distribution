package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventMessage extends Message {
  var endDateTime: js.UndefOr[DateTimeTimeZone] = js.native
  /**
    * The event associated with the event message. The assumption for attendees or room resources is that the Calendar
    * Attendant is set to automatically update the calendar with an event when meeting request event messages arrive.
    * Navigation property. Read-only.
    */
  var event: js.UndefOr[Event] = js.native
  var isAllDay: js.UndefOr[Boolean] = js.native
  var isDelegated: js.UndefOr[Boolean] = js.native
  var isOutOfDate: js.UndefOr[Boolean] = js.native
  var location: js.UndefOr[Location] = js.native
  /**
    * The type of event message: none, meetingRequest, meetingCancelled, meetingAccepted, meetingTenativelyAccepted,
    * meetingDeclined.
    */
  var meetingMessageType: js.UndefOr[MeetingMessageType] = js.native
  var recurrence: js.UndefOr[PatternedRecurrence] = js.native
  var startDateTime: js.UndefOr[DateTimeTimeZone] = js.native
  var `type`: js.UndefOr[EventType] = js.native
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
    def setEndDateTime(value: DateTimeTimeZone): Self = this.set("endDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndDateTime: Self = this.set("endDateTime", js.undefined)
    @scala.inline
    def setEvent(value: Event): Self = this.set("event", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvent: Self = this.set("event", js.undefined)
    @scala.inline
    def setIsAllDay(value: Boolean): Self = this.set("isAllDay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsAllDay: Self = this.set("isAllDay", js.undefined)
    @scala.inline
    def setIsDelegated(value: Boolean): Self = this.set("isDelegated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsDelegated: Self = this.set("isDelegated", js.undefined)
    @scala.inline
    def setIsOutOfDate(value: Boolean): Self = this.set("isOutOfDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsOutOfDate: Self = this.set("isOutOfDate", js.undefined)
    @scala.inline
    def setLocation(value: Location): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    @scala.inline
    def setMeetingMessageType(value: MeetingMessageType): Self = this.set("meetingMessageType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMeetingMessageType: Self = this.set("meetingMessageType", js.undefined)
    @scala.inline
    def setRecurrence(value: PatternedRecurrence): Self = this.set("recurrence", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecurrence: Self = this.set("recurrence", js.undefined)
    @scala.inline
    def setStartDateTime(value: DateTimeTimeZone): Self = this.set("startDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartDateTime: Self = this.set("startDateTime", js.undefined)
    @scala.inline
    def setType(value: EventType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

