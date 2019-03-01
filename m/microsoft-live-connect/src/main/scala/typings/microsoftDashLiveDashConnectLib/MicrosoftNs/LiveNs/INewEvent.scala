package typings
package microsoftDashLiveDashConnectLib.MicrosoftNs.LiveNs

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
  var availability: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A description of the event, with a maximum length of 32,768
    * characters. This structure is required.
    */
  var description: java.lang.String
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
  var is_all_day_event: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The name of the location at which the event will take place. The
    * maximum length is 1,000 characters.
    */
  var location: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The name of the event, with a maximum length of 255 characters. This
    * structure is required.
    */
  var name: java.lang.String
  /**
    * The time, in minutes, before the event for the reminder alarm.
    */
  var reminder_time: js.UndefOr[scala.Double] = js.undefined
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
  var visibility: js.UndefOr[java.lang.String] = js.undefined
}

object INewEvent {
  @scala.inline
  def apply(
    description: java.lang.String,
    name: java.lang.String,
    start_time: js.Any,
    availability: java.lang.String = null,
    end_time: js.Any = null,
    is_all_day_event: js.UndefOr[scala.Boolean] = js.undefined,
    location: java.lang.String = null,
    reminder_time: scala.Int | scala.Double = null,
    visibility: java.lang.String = null
  ): INewEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("description")(description)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("start_time")(start_time)
    if (availability != null) __obj.updateDynamic("availability")(availability)
    if (end_time != null) __obj.updateDynamic("end_time")(end_time)
    if (!js.isUndefined(is_all_day_event)) __obj.updateDynamic("is_all_day_event")(is_all_day_event)
    if (location != null) __obj.updateDynamic("location")(location)
    if (reminder_time != null) __obj.updateDynamic("reminder_time")(reminder_time.asInstanceOf[js.Any])
    if (visibility != null) __obj.updateDynamic("visibility")(visibility)
    __obj.asInstanceOf[INewEvent]
  }
}

