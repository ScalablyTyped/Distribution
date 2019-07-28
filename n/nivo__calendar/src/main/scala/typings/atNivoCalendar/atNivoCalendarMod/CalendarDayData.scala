package typings.atNivoCalendar.atNivoCalendarMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CalendarDayData extends js.Object {
  var color: String
  var date: Date
  var day: String
  var size: Double
  var value: js.UndefOr[Double] = js.undefined
  var x: Double
  var y: Double
}

object CalendarDayData {
  @scala.inline
  def apply(
    color: String,
    date: Date,
    day: String,
    size: Double,
    x: Double,
    y: Double,
    value: Int | Double = null
  ): CalendarDayData = {
    val __obj = js.Dynamic.literal(color = color, date = date, day = day, size = size, x = x, y = y)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalendarDayData]
  }
}

