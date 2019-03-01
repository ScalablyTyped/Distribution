package typings
package overlayscrollbarsLib.overlayscrollbarsMod.OverlayScrollbarsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OverflowChangedArgs extends js.Object {
  var clipped: scala.Boolean
  var x: scala.Boolean
  var xScrollable: scala.Boolean
  var y: scala.Boolean
  var yScrollable: scala.Boolean
}

object OverflowChangedArgs {
  @scala.inline
  def apply(
    clipped: scala.Boolean,
    x: scala.Boolean,
    xScrollable: scala.Boolean,
    y: scala.Boolean,
    yScrollable: scala.Boolean
  ): OverflowChangedArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clipped")(clipped)
    __obj.updateDynamic("x")(x)
    __obj.updateDynamic("xScrollable")(xScrollable)
    __obj.updateDynamic("y")(y)
    __obj.updateDynamic("yScrollable")(yScrollable)
    __obj.asInstanceOf[OverflowChangedArgs]
  }
}

