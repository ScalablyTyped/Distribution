package typings
package navermapsLib.naverNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrafficLayerOptions extends js.Object {
  var interval: scala.Double
  var overlayMap: js.UndefOr[scala.Boolean]
  var zIndex: js.UndefOr[scala.Double]
}

object TrafficLayerOptions {
  @scala.inline
  def apply(
    interval: scala.Double,
    overlayMap: js.UndefOr[scala.Boolean] = js.undefined,
    zIndex: scala.Int | scala.Double = null
  ): TrafficLayerOptions = {
    val __obj = js.Dynamic.literal(interval = interval)
    if (!js.isUndefined(overlayMap)) __obj.updateDynamic("overlayMap")(overlayMap)
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrafficLayerOptions]
  }
}

