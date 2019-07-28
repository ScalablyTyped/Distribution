package typings.pngjs.pngjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseOptions extends js.Object {
  var fill: js.UndefOr[Boolean] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object BaseOptions {
  @scala.inline
  def apply(fill: js.UndefOr[Boolean] = js.undefined, height: Int | Double = null, width: Int | Double = null): BaseOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(fill)) __obj.updateDynamic("fill")(fill)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseOptions]
  }
}

