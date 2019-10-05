package typings.navermaps.naver.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CadastralLayerOptions extends js.Object {
  var overlayMap: js.UndefOr[Boolean] = js.undefined
  var zIndex: js.UndefOr[Double] = js.undefined
}

object CadastralLayerOptions {
  @scala.inline
  def apply(overlayMap: js.UndefOr[Boolean] = js.undefined, zIndex: Int | Double = null): CadastralLayerOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(overlayMap)) __obj.updateDynamic("overlayMap")(overlayMap)
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[CadastralLayerOptions]
  }
}

