package typings
package olLib.renderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToContextOptions extends js.Object {
  var pixelRatio: js.UndefOr[scala.Double] = js.undefined
  var size: js.UndefOr[olLib.sizeMod.Size] = js.undefined
}

object ToContextOptions {
  @scala.inline
  def apply(pixelRatio: scala.Int | scala.Double = null, size: olLib.sizeMod.Size = null): ToContextOptions = {
    val __obj = js.Dynamic.literal()
    if (pixelRatio != null) __obj.updateDynamic("pixelRatio")(pixelRatio.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size)
    __obj.asInstanceOf[ToContextOptions]
  }
}

