package typings.pixiJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateBitmap extends js.Object {
  var autoLoad: js.UndefOr[Boolean] = js.undefined
  var autoPlay: js.UndefOr[Boolean] = js.undefined
  var createBitmap: js.UndefOr[Boolean] = js.undefined
  var crossorigin: js.UndefOr[Boolean] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var scale: js.UndefOr[Double] = js.undefined
  var updateFPS: js.UndefOr[Double] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object CreateBitmap {
  @scala.inline
  def apply(
    autoLoad: js.UndefOr[Boolean] = js.undefined,
    autoPlay: js.UndefOr[Boolean] = js.undefined,
    createBitmap: js.UndefOr[Boolean] = js.undefined,
    crossorigin: js.UndefOr[Boolean] = js.undefined,
    height: js.UndefOr[Double] = js.undefined,
    scale: js.UndefOr[Double] = js.undefined,
    updateFPS: js.UndefOr[Double] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): CreateBitmap = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoLoad)) __obj.updateDynamic("autoLoad")(autoLoad.get.asInstanceOf[js.Any])
    if (!js.isUndefined(autoPlay)) __obj.updateDynamic("autoPlay")(autoPlay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(createBitmap)) __obj.updateDynamic("createBitmap")(createBitmap.get.asInstanceOf[js.Any])
    if (!js.isUndefined(crossorigin)) __obj.updateDynamic("crossorigin")(crossorigin.get.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scale)) __obj.updateDynamic("scale")(scale.get.asInstanceOf[js.Any])
    if (!js.isUndefined(updateFPS)) __obj.updateDynamic("updateFPS")(updateFPS.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateBitmap]
  }
}

