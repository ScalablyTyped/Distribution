package typings.navermaps.naver.maps

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TileOptions extends js.Object {
  var offset: js.UndefOr[Point] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
  var pane: js.UndefOr[HTMLElement] = js.undefined
  var size: js.UndefOr[Size] = js.undefined
  var transition: js.UndefOr[Boolean] = js.undefined
  var zIndex: js.UndefOr[Double] = js.undefined
}

object TileOptions {
  @scala.inline
  def apply(
    offset: Point = null,
    opacity: Int | Double = null,
    pane: HTMLElement = null,
    size: Size = null,
    transition: js.UndefOr[Boolean] = js.undefined,
    zIndex: Int | Double = null
  ): TileOptions = {
    val __obj = js.Dynamic.literal()
    if (offset != null) __obj.updateDynamic("offset")(offset)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (pane != null) __obj.updateDynamic("pane")(pane)
    if (size != null) __obj.updateDynamic("size")(size)
    if (!js.isUndefined(transition)) __obj.updateDynamic("transition")(transition)
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[TileOptions]
  }
}

