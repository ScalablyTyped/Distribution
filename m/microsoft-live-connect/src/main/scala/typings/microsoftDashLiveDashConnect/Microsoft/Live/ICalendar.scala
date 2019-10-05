package typings.microsoftDashLiveDashConnect.Microsoft.Live

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Calendar object contains info about a user's Outlook.com calendar.
  * The Live Connect REST API supports creating, reading, updating, and
  * deleting calendars. Use the wl.calendars scope to read a user's Calendar
  * objects. Use the wl.calendars_update scope to create Calendar objects for
  * a user. Use the wl.contacts_calendars scope to read a user's friends'
  * Calendar objects.
  */
trait ICalendar extends js.Object {
  /**
    * The time, in ISO 8601 format, at which the calendar was created.
    */
  var created_time: String
  /**
    * Description of the calendar.
    */
  var description: String
  /**
    * Info about the user who owns the calendar.
    */
  var from: IUserInfo
  /**
    * The Calendar object's ID.
    */
  var id: String
  /**
    * A value that indicates whether this calendar is the default calendar.
    * If this calendar is the default calendar, this value is true;
    * otherwise, it is false.
    */
  var is_default: Boolean
  /**
    * Name of the calendar.
    */
  var name: String
  /**
    * Role and permissions that are granted to the user for the calendar.
    * The possible values are:
    * - free_busy: The user can see only free/busy info.
    * - limited_details: The user can see a subset of all details.
    * - read: The user can only read the content of the calendar events.
    * - read_write: The user can read and write calendar and events.
    * - co_owner: The user is co-owner of this calendar.
    * - owner: The user is the owner of this calendar.
    */
  var permissions: String
  /**
    * A public subscription URL with which Live Connect will synchronize
    * properties and events periodically for this calendar. A NULL value
    * indicates that this is not a subscribed calendar.
    */
  var subscription_location: String
  /**
    * The time, in ISO 8601 format, that the calendar was last updated.
    */
  var updated_time: String
}

object ICalendar {
  @scala.inline
  def apply(
    created_time: String,
    description: String,
    from: IUserInfo,
    id: String,
    is_default: Boolean,
    name: String,
    permissions: String,
    subscription_location: String,
    updated_time: String
  ): ICalendar = {
    val __obj = js.Dynamic.literal(created_time = created_time, description = description, from = from, id = id, is_default = is_default, name = name, permissions = permissions, subscription_location = subscription_location, updated_time = updated_time)
  
    __obj.asInstanceOf[ICalendar]
  }
}

