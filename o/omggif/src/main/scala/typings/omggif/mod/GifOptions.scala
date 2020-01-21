package typings.omggif.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GifOptions extends js.Object {
  var background: js.UndefOr[Double] = js.undefined
  var loop: js.UndefOr[Double] = js.undefined
  var palette: js.UndefOr[js.Array[Double]] = js.undefined
}

object GifOptions {
  @scala.inline
  def apply(background: Int | Double = null, loop: Int | Double = null, palette: js.Array[Double] = null): GifOptions = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (loop != null) __obj.updateDynamic("loop")(loop.asInstanceOf[js.Any])
    if (palette != null) __obj.updateDynamic("palette")(palette.asInstanceOf[js.Any])
    __obj.asInstanceOf[GifOptions]
  }
}

