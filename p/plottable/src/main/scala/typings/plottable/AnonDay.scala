package typings.plottable

import typings.plottable.plottableStrings.day
import typings.plottable.plottableStrings.hour
import typings.plottable.plottableStrings.minute
import typings.plottable.plottableStrings.month
import typings.plottable.plottableStrings.second
import typings.plottable.plottableStrings.week
import typings.plottable.plottableStrings.year
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDay extends js.Object {
  var day: typings.plottable.plottableStrings.day
  var hour: typings.plottable.plottableStrings.hour
  var minute: typings.plottable.plottableStrings.minute
  var month: typings.plottable.plottableStrings.month
  var second: typings.plottable.plottableStrings.second
  var week: typings.plottable.plottableStrings.week
  var year: typings.plottable.plottableStrings.year
}

object AnonDay {
  @scala.inline
  def apply(day: day, hour: hour, minute: minute, month: month, second: second, week: week, year: year): AnonDay = {
    val __obj = js.Dynamic.literal(day = day.asInstanceOf[js.Any], hour = hour.asInstanceOf[js.Any], minute = minute.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], second = second.asInstanceOf[js.Any], week = week.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDay]
  }
}

