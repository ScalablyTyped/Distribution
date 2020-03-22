package typings.pixiJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCreateBitmap extends js.Object {
  var autoLoad: js.UndefOr[Boolean] = js.undefined
  var autoPlay: js.UndefOr[Boolean] = js.undefined
  var createBitmap: js.UndefOr[Boolean] = js.undefined
  var crossorigin: js.UndefOr[Boolean] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var scale: js.UndefOr[Double] = js.undefined
  var updateFPS: js.UndefOr[Double] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object AnonCreateBitmap {
  @scala.inline
  def apply(
    autoLoad: js.UndefOr[Boolean] = js.undefined,
    autoPlay: js.UndefOr[Boolean] = js.undefined,
    createBitmap: js.UndefOr[Boolean] = js.undefined,
    crossorigin: js.UndefOr[Boolean] = js.undefined,
    height: Int | Double = null,
    scale: Int | Double = null,
    updateFPS: Int | Double = null,
    width: Int | Double = null
  ): AnonCreateBitmap = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoLoad)) __obj.updateDynamic("autoLoad")(autoLoad.asInstanceOf[js.Any])
    if (!js.isUndefined(autoPlay)) __obj.updateDynamic("autoPlay")(autoPlay.asInstanceOf[js.Any])
    if (!js.isUndefined(createBitmap)) __obj.updateDynamic("createBitmap")(createBitmap.asInstanceOf[js.Any])
    if (!js.isUndefined(crossorigin)) __obj.updateDynamic("crossorigin")(crossorigin.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (updateFPS != null) __obj.updateDynamic("updateFPS")(updateFPS.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCreateBitmap]
  }
}

