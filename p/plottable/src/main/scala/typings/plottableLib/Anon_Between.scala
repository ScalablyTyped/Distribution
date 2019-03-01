package typings
package plottableLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Between extends js.Object {
  var between: plottableLib.plottableLibStrings.between
  var center: plottableLib.plottableLibStrings.center
}

object Anon_Between {
  @scala.inline
  def apply(between: plottableLib.plottableLibStrings.between, center: plottableLib.plottableLibStrings.center): Anon_Between = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("between")(between)
    __obj.updateDynamic("center")(center)
    __obj.asInstanceOf[Anon_Between]
  }
}

