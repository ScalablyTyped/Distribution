package typings
package plottableLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Day extends js.Object {
  var day: plottableLib.plottableLibStrings.day
  var hour: plottableLib.plottableLibStrings.hour
  var minute: plottableLib.plottableLibStrings.minute
  var month: plottableLib.plottableLibStrings.month
  var second: plottableLib.plottableLibStrings.second
  var week: plottableLib.plottableLibStrings.week
  var year: plottableLib.plottableLibStrings.year
}

object Anon_Day {
  @scala.inline
  def apply(
    day: plottableLib.plottableLibStrings.day,
    hour: plottableLib.plottableLibStrings.hour,
    minute: plottableLib.plottableLibStrings.minute,
    month: plottableLib.plottableLibStrings.month,
    second: plottableLib.plottableLibStrings.second,
    week: plottableLib.plottableLibStrings.week,
    year: plottableLib.plottableLibStrings.year
  ): Anon_Day = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("day")(day)
    __obj.updateDynamic("hour")(hour)
    __obj.updateDynamic("minute")(minute)
    __obj.updateDynamic("month")(month)
    __obj.updateDynamic("second")(second)
    __obj.updateDynamic("week")(week)
    __obj.updateDynamic("year")(year)
    __obj.asInstanceOf[Anon_Day]
  }
}

