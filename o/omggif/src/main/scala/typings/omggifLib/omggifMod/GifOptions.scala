package typings
package omggifLib.omggifMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GifOptions extends js.Object {
  var background: js.UndefOr[scala.Double] = js.undefined
  var loop: js.UndefOr[scala.Double] = js.undefined
  var palette: js.UndefOr[js.Array[scala.Double]] = js.undefined
}

object GifOptions {
  @scala.inline
  def apply(
    background: scala.Int | scala.Double = null,
    loop: scala.Int | scala.Double = null,
    palette: js.Array[scala.Double] = null
  ): GifOptions = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (loop != null) __obj.updateDynamic("loop")(loop.asInstanceOf[js.Any])
    if (palette != null) __obj.updateDynamic("palette")(palette)
    __obj.asInstanceOf[GifOptions]
  }
}

