package typings
package olLib.renderWebglPolygonReplayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolygonVertex extends js.Object {
  var i: scala.Double
  var reflex: js.UndefOr[scala.Boolean] = js.undefined
  var x: scala.Double
  var y: scala.Double
}

object PolygonVertex {
  @scala.inline
  def apply(
    i: scala.Double,
    x: scala.Double,
    y: scala.Double,
    reflex: js.UndefOr[scala.Boolean] = js.undefined
  ): PolygonVertex = {
    val __obj = js.Dynamic.literal(i = i, x = x, y = y)
    if (!js.isUndefined(reflex)) __obj.updateDynamic("reflex")(reflex)
    __obj.asInstanceOf[PolygonVertex]
  }
}

