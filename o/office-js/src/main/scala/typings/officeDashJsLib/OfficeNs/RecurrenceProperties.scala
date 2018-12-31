package typings
package officeDashJsLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecurrenceProperties extends js.Object {
  /**
    * Represents the day of the month.
    */
  var dayOfMonth: scala.Double
  /**
    * Represents the day of the week or type of day, for example, weekend day vs weekday.
    */
  var dayOfWeek: officeDashJsLib.OfficeNs.MailboxEnumsNs.Days
  /**
    * Represents the set of days for this recurrence. Valid values are: 'Mon', 'Tue', 'Wed', 'Thu', 'Fri', 'Sat', and 'Sun'.
    */
  var days: js.Array[officeDashJsLib.OfficeNs.MailboxEnumsNs.Days]
  /**
    * Represents your chosen first day of the week otherwise the default is the value in the current user's settings. 
    * Valid values are: 'Mon', 'Tue', 'Wed', 'Thu', 'Fri', 'Sat', and 'Sun'.
    */
  var firstDayOfWeek: officeDashJsLib.OfficeNs.MailboxEnumsNs.Days
  /**
    * Represents the period between instances of the same recurring series.
    */
  var interval: scala.Double
  /**
    * Represents the month.
    */
  var month: officeDashJsLib.OfficeNs.MailboxEnumsNs.Month
  /**
    * Represents the number of the week in the selected month e.g. 'first' for first week of the month.
    */
  var weekNumber: officeDashJsLib.OfficeNs.MailboxEnumsNs.WeekNumber
}

