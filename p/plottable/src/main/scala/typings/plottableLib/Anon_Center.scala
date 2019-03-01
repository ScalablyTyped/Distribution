package typings
package plottableLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Center extends js.Object {
  var center: plottableLib.plottableLibStrings.center
  var left: plottableLib.plottableLibStrings.left
  var right: plottableLib.plottableLibStrings.right
}

object Anon_Center {
  @scala.inline
  def apply(
    center: plottableLib.plottableLibStrings.center,
    left: plottableLib.plottableLibStrings.left,
    right: plottableLib.plottableLibStrings.right
  ): Anon_Center = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("center")(center)
    __obj.updateDynamic("left")(left)
    __obj.updateDynamic("right")(right)
    __obj.asInstanceOf[Anon_Center]
  }
}

