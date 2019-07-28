package typings.officeDashJs.OfficeNs

import typings.officeDashJs.OfficeNs.MailboxEnumsNs.Days
import typings.officeDashJs.OfficeNs.MailboxEnumsNs.Month
import typings.officeDashJs.OfficeNs.MailboxEnumsNs.WeekNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the properties of the recurrence.
  * 
  * [Api set: Mailbox 1.7]
  * 
  * @remarks
  * 
  * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: ReadItem
  * 
  * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Compose or Read
  */
trait RecurrenceProperties extends js.Object {
  /**
    * Represents the day of the month.
    */
  var dayOfMonth: Double
  /**
    * Represents the day of the week or type of day, for example, weekend day vs weekday.
    */
  var dayOfWeek: Days | String
  /**
    * Represents the set of days for this recurrence. Valid values are: 'Mon', 'Tue', 'Wed', 'Thu', 'Fri', 'Sat', and 'Sun'.
    */
  var days: js.Array[Days | String]
  /**
    * Represents your chosen first day of the week otherwise the default is the value in the current user's settings. 
    * Valid values are: 'Mon', 'Tue', 'Wed', 'Thu', 'Fri', 'Sat', and 'Sun'.
    */
  var firstDayOfWeek: Days | String
  /**
    * Represents the period between instances of the same recurring series.
    */
  var interval: Double
  /**
    * Represents the month.
    */
  var month: Month | String
  /**
    * Represents the number of the week in the selected month e.g. 'first' for first week of the month.
    */
  var weekNumber: WeekNumber | String
}

object RecurrenceProperties {
  @scala.inline
  def apply(
    dayOfMonth: Double,
    dayOfWeek: Days | String,
    days: js.Array[Days | String],
    firstDayOfWeek: Days | String,
    interval: Double,
    month: Month | String,
    weekNumber: WeekNumber | String
  ): RecurrenceProperties = {
    val __obj = js.Dynamic.literal(dayOfMonth = dayOfMonth, dayOfWeek = dayOfWeek.asInstanceOf[js.Any], days = days, firstDayOfWeek = firstDayOfWeek.asInstanceOf[js.Any], interval = interval, month = month.asInstanceOf[js.Any], weekNumber = weekNumber.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RecurrenceProperties]
  }
}

