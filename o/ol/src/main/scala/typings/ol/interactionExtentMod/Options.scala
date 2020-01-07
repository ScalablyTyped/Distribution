package typings.ol.interactionExtentMod

import typings.ol.styleStyleMod.StyleLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var boxStyle: js.UndefOr[StyleLike] = js.undefined
  var extent: js.UndefOr[typings.ol.extentMod.Extent] = js.undefined
  var pixelTolerance: js.UndefOr[Double] = js.undefined
  var pointerStyle: js.UndefOr[StyleLike] = js.undefined
  var wrapX: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    boxStyle: StyleLike = null,
    extent: typings.ol.extentMod.Extent = null,
    pixelTolerance: Int | Double = null,
    pointerStyle: StyleLike = null,
    wrapX: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (boxStyle != null) __obj.updateDynamic("boxStyle")(boxStyle.asInstanceOf[js.Any])
    if (extent != null) __obj.updateDynamic("extent")(extent.asInstanceOf[js.Any])
    if (pixelTolerance != null) __obj.updateDynamic("pixelTolerance")(pixelTolerance.asInstanceOf[js.Any])
    if (pointerStyle != null) __obj.updateDynamic("pointerStyle")(pointerStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(wrapX)) __obj.updateDynamic("wrapX")(wrapX.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

