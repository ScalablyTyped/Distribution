package typings.officeDashJsDashPreview.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a date and time in the local client's time zone. Read mode only.
  *
  * @remarks
  *
  * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: ReadItem
  * 
  * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Read
  */
trait LocalClientTime extends js.Object {
  /**
    * Integer value representing the day of the month.
    */
  var date: Double
  /**
    * Integer value representing the hour on a 24-hour clock.
    */
  var hours: Double
  /**
    * Integer value representing the milliseconds.
    */
  var milliseconds: Double
  /**
    * Integer value representing the minutes.
    */
  var minutes: Double
  /**
    * Integer value representing the month, beginning with 0 for January to 11 for December.
    */
  var month: Double
  /**
    * Integer value representing the seconds.
    */
  var seconds: Double
  /**
    * Integer value representing the number of minutes difference between the local time zone and UTC.
    */
  var timezoneOffset: Double
  /**
    * Integer value representing the year.
    */
  var year: Double
}

object LocalClientTime {
  @scala.inline
  def apply(
    date: Double,
    hours: Double,
    milliseconds: Double,
    minutes: Double,
    month: Double,
    seconds: Double,
    timezoneOffset: Double,
    year: Double
  ): LocalClientTime = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], hours = hours.asInstanceOf[js.Any], milliseconds = milliseconds.asInstanceOf[js.Any], minutes = minutes.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], seconds = seconds.asInstanceOf[js.Any], timezoneOffset = timezoneOffset.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LocalClientTime]
  }
}

