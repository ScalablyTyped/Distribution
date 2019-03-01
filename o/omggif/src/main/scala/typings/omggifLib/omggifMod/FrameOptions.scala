package typings
package omggifLib.omggifMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FrameOptions extends js.Object {
  var delay: js.UndefOr[scala.Double] = js.undefined
  var disposal: js.UndefOr[scala.Double] = js.undefined
  var palette: js.UndefOr[js.Array[scala.Double] | scala.Null] = js.undefined
  var transparent: js.UndefOr[scala.Double] = js.undefined
}

object FrameOptions {
  @scala.inline
  def apply(
    delay: scala.Int | scala.Double = null,
    disposal: scala.Int | scala.Double = null,
    palette: js.Array[scala.Double] = null,
    transparent: scala.Int | scala.Double = null
  ): FrameOptions = {
    val __obj = js.Dynamic.literal()
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (disposal != null) __obj.updateDynamic("disposal")(disposal.asInstanceOf[js.Any])
    if (palette != null) __obj.updateDynamic("palette")(palette)
    if (transparent != null) __obj.updateDynamic("transparent")(transparent.asInstanceOf[js.Any])
    __obj.asInstanceOf[FrameOptions]
  }
}

