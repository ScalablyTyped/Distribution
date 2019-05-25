package typings
package olLib.formatPolylineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var factor: js.UndefOr[scala.Double] = js.undefined
  var geometryLayout: js.UndefOr[olLib.geomGeometryLayoutMod.GeometryLayout] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    factor: scala.Int | scala.Double = null,
    geometryLayout: olLib.geomGeometryLayoutMod.GeometryLayout = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (factor != null) __obj.updateDynamic("factor")(factor.asInstanceOf[js.Any])
    if (geometryLayout != null) __obj.updateDynamic("geometryLayout")(geometryLayout)
    __obj.asInstanceOf[Options]
  }
}

