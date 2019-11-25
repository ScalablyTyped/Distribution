package typings.omggif.omggifMod

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
    delay: Int | Double = null,
    disposal: Int | Double = null,
    palette: js.Array[Double] = null,
    transparent: Int | Double = null
  ): FrameOptions = {
    val __obj = js.Dynamic.literal()
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (disposal != null) __obj.updateDynamic("disposal")(disposal.asInstanceOf[js.Any])
    if (palette != null) __obj.updateDynamic("palette")(palette.asInstanceOf[js.Any])
    if (transparent != null) __obj.updateDynamic("transparent")(transparent.asInstanceOf[js.Any])
    __obj.asInstanceOf[FrameOptions]
  }
}

