package typings.microsoftLiveConnect.Microsoft.Live

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
@js.native
trait ICalendar extends js.Object {
  /**
    * The time, in ISO 8601 format, at which the calendar was created.
    */
  var created_time: String = js.native
  /**
    * Description of the calendar.
    */
  var description: String = js.native
  /**
    * Info about the user who owns the calendar.
    */
  var from: IUserInfo = js.native
  /**
    * The Calendar object's ID.
    */
  var id: String = js.native
  /**
    * A value that indicates whether this calendar is the default calendar.
    * If this calendar is the default calendar, this value is true;
    * otherwise, it is false.
    */
  var is_default: Boolean = js.native
  /**
    * Name of the calendar.
    */
  var name: String = js.native
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
  var permissions: String = js.native
  /**
    * A public subscription URL with which Live Connect will synchronize
    * properties and events periodically for this calendar. A NULL value
    * indicates that this is not a subscribed calendar.
    */
  var subscription_location: String = js.native
  /**
    * The time, in ISO 8601 format, that the calendar was last updated.
    */
  var updated_time: String = js.native
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
    val __obj = js.Dynamic.literal(created_time = created_time.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], is_default = is_default.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any], subscription_location = subscription_location.asInstanceOf[js.Any], updated_time = updated_time.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICalendar]
  }
  @scala.inline
  implicit class ICalendarOps[Self <: ICalendar] (val x: Self) extends AnyVal {
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
    def setCreated_time(value: String): Self = this.set("created_time", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setFrom(value: IUserInfo): Self = this.set("from", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setIs_default(value: Boolean): Self = this.set("is_default", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setPermissions(value: String): Self = this.set("permissions", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubscription_location(value: String): Self = this.set("subscription_location", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdated_time(value: String): Self = this.set("updated_time", value.asInstanceOf[js.Any])
  }
  
}

