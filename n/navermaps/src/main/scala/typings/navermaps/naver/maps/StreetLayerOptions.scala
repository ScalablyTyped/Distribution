package typings.navermaps.naver.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StreetLayerOptions extends js.Object {
  var overlayMap: js.UndefOr[Boolean] = js.undefined
  var zIndex: js.UndefOr[Double] = js.undefined
}

object StreetLayerOptions {
  @scala.inline
  def apply(overlayMap: js.UndefOr[Boolean] = js.undefined, zIndex: js.UndefOr[Double] = js.undefined): StreetLayerOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(overlayMap)) __obj.updateDynamic("overlayMap")(overlayMap.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zIndex)) __obj.updateDynamic("zIndex")(zIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreetLayerOptions]
  }
}

