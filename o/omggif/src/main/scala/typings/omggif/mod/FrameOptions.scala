package typings.omggif.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FrameOptions extends js.Object {
  var delay: js.UndefOr[Double] = js.undefined
  var disposal: js.UndefOr[Double] = js.undefined
  var palette: js.UndefOr[js.Array[Double] | Null] = js.undefined
  var transparent: js.UndefOr[Double] = js.undefined
}

object FrameOptions {
  @scala.inline
  def apply(
    delay: js.UndefOr[Double] = js.undefined,
    disposal: js.UndefOr[Double] = js.undefined,
    palette: js.UndefOr[Null | js.Array[Double]] = js.undefined,
    transparent: js.UndefOr[Double] = js.undefined
  ): FrameOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(delay)) __obj.updateDynamic("delay")(delay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disposal)) __obj.updateDynamic("disposal")(disposal.get.asInstanceOf[js.Any])
    if (!js.isUndefined(palette)) __obj.updateDynamic("palette")(palette.asInstanceOf[js.Any])
    if (!js.isUndefined(transparent)) __obj.updateDynamic("transparent")(transparent.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FrameOptions]
  }
}

