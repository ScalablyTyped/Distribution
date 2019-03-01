package typings
package plottableLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EndMiddle extends js.Object {
  var end: plottableLib.plottableLibStrings.end
  var middle: plottableLib.plottableLibStrings.middle
  var start: plottableLib.plottableLibStrings.start
}

object Anon_EndMiddle {
  @scala.inline
  def apply(
    end: plottableLib.plottableLibStrings.end,
    middle: plottableLib.plottableLibStrings.middle,
    start: plottableLib.plottableLibStrings.start
  ): Anon_EndMiddle = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("end")(end)
    __obj.updateDynamic("middle")(middle)
    __obj.updateDynamic("start")(start)
    __obj.asInstanceOf[Anon_EndMiddle]
  }
}

