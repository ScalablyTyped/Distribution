package typings.pixiJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAutoLoad extends js.Object {
  var autoLoad: js.UndefOr[Boolean] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var scale: js.UndefOr[Double] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object AnonAutoLoad {
  @scala.inline
  def apply(
    autoLoad: js.UndefOr[Boolean] = js.undefined,
    height: Int | Double = null,
    scale: Int | Double = null,
    width: Int | Double = null
  ): AnonAutoLoad = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoLoad)) __obj.updateDynamic("autoLoad")(autoLoad.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAutoLoad]
  }
}

