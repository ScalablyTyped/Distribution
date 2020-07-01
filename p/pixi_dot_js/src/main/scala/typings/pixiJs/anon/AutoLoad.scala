package typings.pixiJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoLoad extends js.Object {
  var autoLoad: js.UndefOr[Double] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var linkBaseTexture: js.UndefOr[Double] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object AutoLoad {
  @scala.inline
  def apply(
    autoLoad: js.UndefOr[Double] = js.undefined,
    height: js.UndefOr[Double] = js.undefined,
    linkBaseTexture: js.UndefOr[Double] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): AutoLoad = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoLoad)) __obj.updateDynamic("autoLoad")(autoLoad.get.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(linkBaseTexture)) __obj.updateDynamic("linkBaseTexture")(linkBaseTexture.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoLoad]
  }
}

