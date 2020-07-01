package typings.pixiJs.anon

import typings.pixiJs.PIXI.ALPHA_MODES
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateBitmap extends js.Object {
  var alphaMode: js.UndefOr[ALPHA_MODES] = js.undefined
  var autoLoad: js.UndefOr[Boolean] = js.undefined
  var createBitmap: js.UndefOr[Boolean] = js.undefined
  var crossorigin: js.UndefOr[Boolean] = js.undefined
}

object CreateBitmap {
  @scala.inline
  def apply(
    alphaMode: ALPHA_MODES = null,
    autoLoad: js.UndefOr[Boolean] = js.undefined,
    createBitmap: js.UndefOr[Boolean] = js.undefined,
    crossorigin: js.UndefOr[Boolean] = js.undefined
  ): CreateBitmap = {
    val __obj = js.Dynamic.literal()
    if (alphaMode != null) __obj.updateDynamic("alphaMode")(alphaMode.asInstanceOf[js.Any])
    if (!js.isUndefined(autoLoad)) __obj.updateDynamic("autoLoad")(autoLoad.get.asInstanceOf[js.Any])
    if (!js.isUndefined(createBitmap)) __obj.updateDynamic("createBitmap")(createBitmap.get.asInstanceOf[js.Any])
    if (!js.isUndefined(crossorigin)) __obj.updateDynamic("crossorigin")(crossorigin.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateBitmap]
  }
}

