package typings.navermaps.naver.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrafficLayerOptions extends js.Object {
  var interval: Double
  var overlayMap: js.UndefOr[Boolean] = js.undefined
  var zIndex: js.UndefOr[Double] = js.undefined
}

object TrafficLayerOptions {
  @scala.inline
  def apply(
    interval: Double,
    overlayMap: js.UndefOr[Boolean] = js.undefined,
    zIndex: js.UndefOr[Double] = js.undefined
  ): TrafficLayerOptions = {
    val __obj = js.Dynamic.literal(interval = interval.asInstanceOf[js.Any])
    if (!js.isUndefined(overlayMap)) __obj.updateDynamic("overlayMap")(overlayMap.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zIndex)) __obj.updateDynamic("zIndex")(zIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrafficLayerOptions]
  }
}

