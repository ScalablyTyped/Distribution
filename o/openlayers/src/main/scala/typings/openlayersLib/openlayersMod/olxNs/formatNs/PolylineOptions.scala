package typings
package openlayersLib.openlayersMod.olxNs.formatNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolylineOptions extends js.Object {
  var factor: js.UndefOr[scala.Double] = js.undefined
  var geometryLayout: js.UndefOr[openlayersLib.openlayersMod.geomNs.GeometryLayout] = js.undefined
}

object PolylineOptions {
  @scala.inline
  def apply(
    factor: scala.Int | scala.Double = null,
    geometryLayout: openlayersLib.openlayersMod.geomNs.GeometryLayout = null
  ): PolylineOptions = {
    val __obj = js.Dynamic.literal()
    if (factor != null) __obj.updateDynamic("factor")(factor.asInstanceOf[js.Any])
    if (geometryLayout != null) __obj.updateDynamic("geometryLayout")(geometryLayout)
    __obj.asInstanceOf[PolylineOptions]
  }
}

