package typings
package navermapsLib.naverNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageTileOptions extends js.Object {
  var imgonerror: js.UndefOr[js.Function0[_]] = js.undefined
  var imgonload: js.UndefOr[js.Function0[_]] = js.undefined
  var offset: js.UndefOr[Point] = js.undefined
  var opacity: js.UndefOr[scala.Double] = js.undefined
  var pane: js.UndefOr[stdLib.HTMLElement] = js.undefined
  var size: js.UndefOr[Size] = js.undefined
  var transition: js.UndefOr[scala.Boolean] = js.undefined
  var urls: js.Array[java.lang.String]
  var zIndex: js.UndefOr[scala.Double] = js.undefined
}

object ImageTileOptions {
  @scala.inline
  def apply(
    urls: js.Array[java.lang.String],
    imgonerror: js.Function0[_] = null,
    imgonload: js.Function0[_] = null,
    offset: Point = null,
    opacity: scala.Int | scala.Double = null,
    pane: stdLib.HTMLElement = null,
    size: Size = null,
    transition: js.UndefOr[scala.Boolean] = js.undefined,
    zIndex: scala.Int | scala.Double = null
  ): ImageTileOptions = {
    val __obj = js.Dynamic.literal(urls = urls)
    if (imgonerror != null) __obj.updateDynamic("imgonerror")(imgonerror)
    if (imgonload != null) __obj.updateDynamic("imgonload")(imgonload)
    if (offset != null) __obj.updateDynamic("offset")(offset)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (pane != null) __obj.updateDynamic("pane")(pane)
    if (size != null) __obj.updateDynamic("size")(size)
    if (!js.isUndefined(transition)) __obj.updateDynamic("transition")(transition)
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageTileOptions]
  }
}

