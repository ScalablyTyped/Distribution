package typings
package plottableLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_End extends js.Object {
  var end: plottableLib.plottableLibStrings.end
  var middle: plottableLib.plottableLibStrings.middle
  var outside: plottableLib.plottableLibStrings.outside
  var start: plottableLib.plottableLibStrings.start
}

object Anon_End {
  @scala.inline
  def apply(
    end: plottableLib.plottableLibStrings.end,
    middle: plottableLib.plottableLibStrings.middle,
    outside: plottableLib.plottableLibStrings.outside,
    start: plottableLib.plottableLibStrings.start
  ): Anon_End = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("end")(end)
    __obj.updateDynamic("middle")(middle)
    __obj.updateDynamic("outside")(outside)
    __obj.updateDynamic("start")(start)
    __obj.asInstanceOf[Anon_End]
  }
}

