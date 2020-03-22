package typings.pixiJs

import typings.pixiJs.PIXI.SCALE_MODES
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHeight extends js.Object {
  var height: js.UndefOr[Double] = js.undefined
  var resolution: js.UndefOr[Double] = js.undefined
  var scaleMode: js.UndefOr[SCALE_MODES] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object AnonHeight {
  @scala.inline
  def apply(
    height: Int | Double = null,
    resolution: Int | Double = null,
    scaleMode: SCALE_MODES = null,
    width: Int | Double = null
  ): AnonHeight = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (resolution != null) __obj.updateDynamic("resolution")(resolution.asInstanceOf[js.Any])
    if (scaleMode != null) __obj.updateDynamic("scaleMode")(scaleMode.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHeight]
  }
}

