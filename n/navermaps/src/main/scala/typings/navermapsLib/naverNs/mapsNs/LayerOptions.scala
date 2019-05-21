package typings
package navermapsLib.naverNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayerOptions extends js.Object {
  var hd: scala.Boolean
  var overlayMap: js.UndefOr[scala.Boolean] = js.undefined
  var zIndex: js.UndefOr[scala.Double] = js.undefined
}

object LayerOptions {
  @scala.inline
  def apply(
    hd: scala.Boolean,
    overlayMap: js.UndefOr[scala.Boolean] = js.undefined,
    zIndex: scala.Int | scala.Double = null
  ): LayerOptions = {
    val __obj = js.Dynamic.literal(hd = hd)
    if (!js.isUndefined(overlayMap)) __obj.updateDynamic("overlayMap")(overlayMap)
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayerOptions]
  }
}

