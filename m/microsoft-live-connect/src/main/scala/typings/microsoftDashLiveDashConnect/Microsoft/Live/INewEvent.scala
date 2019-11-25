package typings.microsoftDashLiveDashConnect.Microsoft.Live

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a new event.
  */
trait INewEvent extends js.Object {
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
  def apply(
    description: String,
    name: String,
    start_time: js.Any,
    availability: String = null,
    end_time: js.Any = null,
    is_all_day_event: js.UndefOr[Boolean] = js.undefined,
    location: String = null,
    reminder_time: Int | Double = null,
    visibility: String = null
  ): INewEvent = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], start_time = start_time.asInstanceOf[js.Any])
    if (availability != null) __obj.updateDynamic("availability")(availability.asInstanceOf[js.Any])
    if (end_time != null) __obj.updateDynamic("end_time")(end_time.asInstanceOf[js.Any])
    if (!js.isUndefined(is_all_day_event)) __obj.updateDynamic("is_all_day_event")(is_all_day_event.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (reminder_time != null) __obj.updateDynamic("reminder_time")(reminder_time.asInstanceOf[js.Any])
    if (visibility != null) __obj.updateDynamic("visibility")(visibility.asInstanceOf[js.Any])
    __obj.asInstanceOf[INewEvent]
  }
}

