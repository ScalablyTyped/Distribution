package typings
package atNivoCalendarLib.atNivoCalendarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CalendarDayData extends js.Object {
  var color: java.lang.String
  var date: stdLib.Date
  var day: java.lang.String
  var size: scala.Double
  var value: js.UndefOr[scala.Double] = js.undefined
  var x: scala.Double
  var y: scala.Double
}

object CalendarDayData {
  @scala.inline
  def apply(
    color: java.lang.String,
    date: stdLib.Date,
    day: java.lang.String,
    size: scala.Double,
    x: scala.Double,
    y: scala.Double,
    value: scala.Int | scala.Double = null
  ): CalendarDayData = {
    val __obj = js.Dynamic.literal(color = color, date = date, day = day, size = size, x = x, y = y)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalendarDayData]
  }
}

