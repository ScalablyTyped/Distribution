package typings
package officeDashJsDashPreviewLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a date and time in the local client's time zone. Read mode only.
  *
  * [Api set: Mailbox 1.0]
  *
  * @remarks
  *
  * <table>
  *   <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}</td><td>ReadItem</td></tr>
  *   <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}</td><td>Read</td></tr>
  * </table>
  */
trait LocalClientTime extends js.Object {
  /**
    * Integer value representing the day of the month.
    */
  var date: scala.Double
  /**
    * Integer value representing the hour on a 24-hour clock.
    */
  var hours: scala.Double
  /**
    * Integer value representing the milliseconds.
    */
  var milliseconds: scala.Double
  /**
    * Integer value representing the minutes.
    */
  var minutes: scala.Double
  /**
    * Integer value representing the month, beginning with 0 for January to 11 for December.
    */
  var month: scala.Double
  /**
    * Integer value representing the seconds.
    */
  var seconds: scala.Double
  /**
    * Integer value representing the number of minutes difference between the local time zone and UTC.
    */
  var timezoneOffset: scala.Double
  /**
    * Integer value representing the year.
    */
  var year: scala.Double
}

object LocalClientTime {
  @scala.inline
  def apply(
    date: scala.Double,
    hours: scala.Double,
    milliseconds: scala.Double,
    minutes: scala.Double,
    month: scala.Double,
    seconds: scala.Double,
    timezoneOffset: scala.Double,
    year: scala.Double
  ): LocalClientTime = {
    val __obj = js.Dynamic.literal(date = date, hours = hours, milliseconds = milliseconds, minutes = minutes, month = month, seconds = seconds, timezoneOffset = timezoneOffset, year = year)
  
    __obj.asInstanceOf[LocalClientTime]
  }
}

