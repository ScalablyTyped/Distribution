package typings.ol.renderMod

import typings.ol.sizeMod.Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToContextOptions extends js.Object {
  var pixelRatio: js.UndefOr[Double] = js.undefined
  var size: js.UndefOr[Size] = js.undefined
}

object ToContextOptions {
  @scala.inline
  def apply(pixelRatio: Int | Double = null, size: Size = null): ToContextOptions = {
    val __obj = js.Dynamic.literal()
    if (pixelRatio != null) __obj.updateDynamic("pixelRatio")(pixelRatio.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToContextOptions]
  }
}

