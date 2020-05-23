package typings.openlayers.mod.olx.format

import typings.openlayers.mod.geom.GeometryLayout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolylineOptions extends js.Object {
  var factor: js.UndefOr[Double] = js.undefined
  var geometryLayout: js.UndefOr[GeometryLayout] = js.undefined
}

object PolylineOptions {
  @scala.inline
  def apply(factor: js.UndefOr[Double] = js.undefined, geometryLayout: GeometryLayout = null): PolylineOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(factor)) __obj.updateDynamic("factor")(factor.get.asInstanceOf[js.Any])
    if (geometryLayout != null) __obj.updateDynamic("geometryLayout")(geometryLayout.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolylineOptions]
  }
}

