package typings.openseadragon.mod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OverlayOptions extends js.Object {
  var checkResize: js.UndefOr[Boolean] = js.undefined
  var element: HTMLElement
  var height: js.UndefOr[Double] = js.undefined
  var location: Point | Rect
  var onDraw: js.UndefOr[OnDrawCallback] = js.undefined
  var placement: js.UndefOr[Placement] = js.undefined
  var rotationMode: js.UndefOr[Boolean] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object OverlayOptions {
  @scala.inline
  def apply(
    element: HTMLElement,
    location: Point | Rect,
    checkResize: js.UndefOr[Boolean] = js.undefined,
    height: js.UndefOr[Double] = js.undefined,
    onDraw: (/* position */ Point, /* size */ Point, /* element */ HTMLElement) => Unit = null,
    placement: Placement = null,
    rotationMode: js.UndefOr[Boolean] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): OverlayOptions = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
    if (!js.isUndefined(checkResize)) __obj.updateDynamic("checkResize")(checkResize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (onDraw != null) __obj.updateDynamic("onDraw")(js.Any.fromFunction3(onDraw))
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (!js.isUndefined(rotationMode)) __obj.updateDynamic("rotationMode")(rotationMode.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[OverlayOptions]
  }
}

