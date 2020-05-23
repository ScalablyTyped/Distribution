package typings.nivoCalendar.mod

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
    value: js.UndefOr[Double] = js.undefined
  ): CalendarDayData = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], day = day.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalendarDayData]
  }
}

