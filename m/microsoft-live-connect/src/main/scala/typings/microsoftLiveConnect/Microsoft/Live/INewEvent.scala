package typings.microsoftLiveConnect.Microsoft.Live

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a new event.
  */
@js.native
trait INewEvent extends js.Object {
  /**
    * The user's availability status for the event. Valid values are:
    * - free
    * - busy
    * - tentative
    * - out_of_office
    * @default "free"
    */
  var availability: js.UndefOr[String] = js.native
  /**
    * A description of the event, with a maximum length of 32,768
    * characters. This structure is required.
    */
  var description: String = js.native
  /**
    * The end time of the event. If no end time is specified, the default
    * value is 30 minutes after start_time. This structure is optional when
    * creating an event. When the event is being read, the time will be the
    * user's local time, in ISO 8601 format.
    * Can be a date string, or a Date object.
    */
  var end_time: js.UndefOr[js.Any] = js.native
  /**
    * A value that specifies whether the event is an all-day event. If the
    * event is an all-day event, this value is true; otherwise, it is
    * false. If this structure is missing, the default value is false.
    */
  var is_all_day_event: js.UndefOr[Boolean] = js.native
  /**
    * The name of the location at which the event will take place. The
    * maximum length is 1,000 characters.
    */
  var location: js.UndefOr[String] = js.native
  /**
    * The name of the event, with a maximum length of 255 characters. This
    * structure is required.
    */
  var name: String = js.native
  /**
    * The time, in minutes, before the event for the reminder alarm.
    */
  var reminder_time: js.UndefOr[Double] = js.native
  /**
    * The start time of the event. When the event is being read, the time
    * will be the user's local time, in ISO 8601 format.
    * Can be a date string, or a Date object.
    */
  var start_time: js.Any = js.native
  /**
    * A value that specifies whether the event is publicly visible. Valid
    * values are:
    * - public  the event is visible to anyone who can view the calendar.
    * - private the event is visible only to the event owner.
    * @default "public"
    */
  var visibility: js.UndefOr[String] = js.native
}

object INewEvent {
  @scala.inline
  def apply(description: String, name: String, start_time: js.Any): INewEvent = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], start_time = start_time.asInstanceOf[js.Any])
    __obj.asInstanceOf[INewEvent]
  }
  @scala.inline
  implicit class INewEventOps[Self <: INewEvent] (val x: Self) extends AnyVal {
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setStart_time(value: js.Any): Self = this.set("start_time", value.asInstanceOf[js.Any])
    @scala.inline
    def setAvailability(value: String): Self = this.set("availability", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvailability: Self = this.set("availability", js.undefined)
    @scala.inline
    def setEnd_time(value: js.Any): Self = this.set("end_time", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnd_time: Self = this.set("end_time", js.undefined)
    @scala.inline
    def setIs_all_day_event(value: Boolean): Self = this.set("is_all_day_event", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIs_all_day_event: Self = this.set("is_all_day_event", js.undefined)
    @scala.inline
    def setLocation(value: String): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    @scala.inline
    def setReminder_time(value: Double): Self = this.set("reminder_time", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReminder_time: Self = this.set("reminder_time", js.undefined)
    @scala.inline
    def setVisibility(value: String): Self = this.set("visibility", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisibility: Self = this.set("visibility", js.undefined)
  }
  
}

