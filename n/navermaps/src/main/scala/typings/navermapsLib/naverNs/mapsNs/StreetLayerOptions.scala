package typings
package navermapsLib.naverNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StreetLayerOptions extends js.Object {
  var overlayMap: js.UndefOr[scala.Boolean]
  var zIndex: js.UndefOr[scala.Double]
}

object StreetLayerOptions {
  @scala.inline
  def apply(overlayMap: js.UndefOr[scala.Boolean] = js.undefined, zIndex: scala.Int | scala.Double = null): StreetLayerOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(overlayMap)) __obj.updateDynamic("overlayMap")(overlayMap)
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreetLayerOptions]
  }
}

