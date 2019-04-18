package typings
package officeDashJsDashPreviewLib.OfficeNs

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
  var dayOfMonth: scala.Double
  /**
    * Represents the day of the week or type of day, for example, weekend day vs weekday.
    */
  var dayOfWeek: officeDashJsDashPreviewLib.OfficeNs.MailboxEnumsNs.Days
  /**
    * Represents the set of days for this recurrence. Valid values are: 'Mon', 'Tue', 'Wed', 'Thu', 'Fri', 'Sat', and 'Sun'.
    */
  var days: js.Array[officeDashJsDashPreviewLib.OfficeNs.MailboxEnumsNs.Days]
  /**
    * Represents your chosen first day of the week otherwise the default is the value in the current user's settings. 
    * Valid values are: 'Mon', 'Tue', 'Wed', 'Thu', 'Fri', 'Sat', and 'Sun'.
    */
  var firstDayOfWeek: officeDashJsDashPreviewLib.OfficeNs.MailboxEnumsNs.Days
  /**
    * Represents the period between instances of the same recurring series.
    */
  var interval: scala.Double
  /**
    * Represents the month.
    */
  var month: officeDashJsDashPreviewLib.OfficeNs.MailboxEnumsNs.Month
  /**
    * Represents the number of the week in the selected month e.g. 'first' for first week of the month.
    */
  var weekNumber: officeDashJsDashPreviewLib.OfficeNs.MailboxEnumsNs.WeekNumber
}

object RecurrenceProperties {
  @scala.inline
  def apply(
    dayOfMonth: scala.Double,
    dayOfWeek: officeDashJsDashPreviewLib.OfficeNs.MailboxEnumsNs.Days,
    days: js.Array[officeDashJsDashPreviewLib.OfficeNs.MailboxEnumsNs.Days],
    firstDayOfWeek: officeDashJsDashPreviewLib.OfficeNs.MailboxEnumsNs.Days,
    interval: scala.Double,
    month: officeDashJsDashPreviewLib.OfficeNs.MailboxEnumsNs.Month,
    weekNumber: officeDashJsDashPreviewLib.OfficeNs.MailboxEnumsNs.WeekNumber
  ): RecurrenceProperties = {
    val __obj = js.Dynamic.literal(dayOfMonth = dayOfMonth, dayOfWeek = dayOfWeek, days = days, firstDayOfWeek = firstDayOfWeek, interval = interval, month = month, weekNumber = weekNumber)
  
    __obj.asInstanceOf[RecurrenceProperties]
  }
}

