package typings
package olLib.interactionExtentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var boxStyle: js.UndefOr[olLib.styleStyleMod.StyleLike] = js.undefined
  var extent: js.UndefOr[olLib.extentMod.Extent] = js.undefined
  var pixelTolerance: js.UndefOr[scala.Double] = js.undefined
  var pointerStyle: js.UndefOr[olLib.styleStyleMod.StyleLike] = js.undefined
  var wrapX: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    boxStyle: olLib.styleStyleMod.StyleLike = null,
    extent: olLib.extentMod.Extent = null,
    pixelTolerance: scala.Int | scala.Double = null,
    pointerStyle: olLib.styleStyleMod.StyleLike = null,
    wrapX: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (boxStyle != null) __obj.updateDynamic("boxStyle")(boxStyle.asInstanceOf[js.Any])
    if (extent != null) __obj.updateDynamic("extent")(extent)
    if (pixelTolerance != null) __obj.updateDynamic("pixelTolerance")(pixelTolerance.asInstanceOf[js.Any])
    if (pointerStyle != null) __obj.updateDynamic("pointerStyle")(pointerStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(wrapX)) __obj.updateDynamic("wrapX")(wrapX)
    __obj.asInstanceOf[Options]
  }
}

