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
  def apply(
    background: js.UndefOr[Double] = js.undefined,
    loop: js.UndefOr[Double] = js.undefined,
    palette: js.Array[Double] = null
  ): GifOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(background)) __obj.updateDynamic("background")(background.get.asInstanceOf[js.Any])
    if (!js.isUndefined(loop)) __obj.updateDynamic("loop")(loop.get.asInstanceOf[js.Any])
    if (palette != null) __obj.updateDynamic("palette")(palette.asInstanceOf[js.Any])
    __obj.asInstanceOf[GifOptions]
  }
}

