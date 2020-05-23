package typings.pixiJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Resolution extends js.Object {
  var height: js.UndefOr[Double] = js.undefined
  var resolution: js.UndefOr[Double] = js.undefined
  var scaleMode: js.UndefOr[Double] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object Resolution {
  @scala.inline
  def apply(
    height: js.UndefOr[Double] = js.undefined,
    resolution: js.UndefOr[Double] = js.undefined,
    scaleMode: js.UndefOr[Double] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): Resolution = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(resolution)) __obj.updateDynamic("resolution")(resolution.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scaleMode)) __obj.updateDynamic("scaleMode")(scaleMode.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resolution]
  }
}

