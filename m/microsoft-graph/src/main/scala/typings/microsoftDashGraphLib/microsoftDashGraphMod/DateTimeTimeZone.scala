package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateTimeTimeZone extends js.Object {
  /**
    * A single point of time in a combined date and time representation ({date}T{time}; for example,
    * 2017-08-29T04:00:00.0000000).
    */
  var dateTime: js.UndefOr[java.lang.String] = js.undefined
  // One of the following time zone names.
  var timeZone: js.UndefOr[java.lang.String] = js.undefined
}

object DateTimeTimeZone {
  @scala.inline
  def apply(dateTime: java.lang.String = null, timeZone: java.lang.String = null): DateTimeTimeZone = {
    val __obj = js.Dynamic.literal()
    if (dateTime != null) __obj.updateDynamic("dateTime")(dateTime)
    if (timeZone != null) __obj.updateDynamic("timeZone")(timeZone)
    __obj.asInstanceOf[DateTimeTimeZone]
  }
}

