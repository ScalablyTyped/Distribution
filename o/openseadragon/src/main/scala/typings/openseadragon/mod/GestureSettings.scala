package typings.openseadragon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GestureSettings extends js.Object {
  var clickToZoom: js.UndefOr[Boolean] = js.undefined
  var dblClickToZoom: js.UndefOr[Boolean] = js.undefined
  var flickEnabled: js.UndefOr[Boolean] = js.undefined
  var flickMinSpeed: js.UndefOr[Double] = js.undefined
  var flickMomentum: js.UndefOr[Double] = js.undefined
  var pinchToZoom: js.UndefOr[Boolean] = js.undefined
  var scrollToZoom: js.UndefOr[Boolean] = js.undefined
}

object GestureSettings {
  @scala.inline
  def apply(
    clickToZoom: js.UndefOr[Boolean] = js.undefined,
    dblClickToZoom: js.UndefOr[Boolean] = js.undefined,
    flickEnabled: js.UndefOr[Boolean] = js.undefined,
    flickMinSpeed: js.UndefOr[Double] = js.undefined,
    flickMomentum: js.UndefOr[Double] = js.undefined,
    pinchToZoom: js.UndefOr[Boolean] = js.undefined,
    scrollToZoom: js.UndefOr[Boolean] = js.undefined
  ): GestureSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(clickToZoom)) __obj.updateDynamic("clickToZoom")(clickToZoom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(dblClickToZoom)) __obj.updateDynamic("dblClickToZoom")(dblClickToZoom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(flickEnabled)) __obj.updateDynamic("flickEnabled")(flickEnabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(flickMinSpeed)) __obj.updateDynamic("flickMinSpeed")(flickMinSpeed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(flickMomentum)) __obj.updateDynamic("flickMomentum")(flickMomentum.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pinchToZoom)) __obj.updateDynamic("pinchToZoom")(pinchToZoom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollToZoom)) __obj.updateDynamic("scrollToZoom")(scrollToZoom.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GestureSettings]
  }
}

