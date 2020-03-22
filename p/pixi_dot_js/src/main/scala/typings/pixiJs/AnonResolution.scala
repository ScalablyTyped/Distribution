package typings.pixiJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonResolution extends js.Object {
  var height: js.UndefOr[Double] = js.undefined
  var resolution: js.UndefOr[Double] = js.undefined
  var scaleMode: js.UndefOr[Double] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object AnonResolution {
  @scala.inline
  def apply(
    height: Int | Double = null,
    resolution: Int | Double = null,
    scaleMode: Int | Double = null,
    width: Int | Double = null
  ): AnonResolution = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (resolution != null) __obj.updateDynamic("resolution")(resolution.asInstanceOf[js.Any])
    if (scaleMode != null) __obj.updateDynamic("scaleMode")(scaleMode.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonResolution]
  }
}

