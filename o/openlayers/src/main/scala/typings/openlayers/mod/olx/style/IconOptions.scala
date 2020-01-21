package typings.openlayers.mod.olx.style

import typings.openlayers.mod.Color_
import typings.openlayers.mod.Size
import typings.openlayers.mod.style.IconAnchorUnits
import typings.openlayers.mod.style.IconOrigin
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IconOptions extends js.Object {
  var anchor: js.UndefOr[js.Array[Double]] = js.undefined
  var anchorOrigin: js.UndefOr[IconOrigin] = js.undefined
  var anchorXUnits: js.UndefOr[IconAnchorUnits] = js.undefined
  var anchorYUnits: js.UndefOr[IconAnchorUnits] = js.undefined
  var color: js.UndefOr[Color_ | String] = js.undefined
  var crossOrigin: js.UndefOr[String] = js.undefined
  var img: js.UndefOr[HTMLImageElement | HTMLCanvasElement] = js.undefined
  var imgSize: js.UndefOr[Size] = js.undefined
  var offset: js.UndefOr[js.Array[Double]] = js.undefined
  var offsetOrigin: js.UndefOr[IconOrigin] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
  var rotateWithView: js.UndefOr[Boolean] = js.undefined
  var rotation: js.UndefOr[Double] = js.undefined
  var scale: js.UndefOr[Double] = js.undefined
  var size: js.UndefOr[Size] = js.undefined
  var snapToPixel: js.UndefOr[Boolean] = js.undefined
  var src: js.UndefOr[String] = js.undefined
}

object IconOptions {
  @scala.inline
  def apply(
    anchor: js.Array[Double] = null,
    anchorOrigin: IconOrigin = null,
    anchorXUnits: IconAnchorUnits = null,
    anchorYUnits: IconAnchorUnits = null,
    color: Color_ | String = null,
    crossOrigin: String = null,
    img: HTMLImageElement | HTMLCanvasElement = null,
    imgSize: Size = null,
    offset: js.Array[Double] = null,
    offsetOrigin: IconOrigin = null,
    opacity: Int | Double = null,
    rotateWithView: js.UndefOr[Boolean] = js.undefined,
    rotation: Int | Double = null,
    scale: Int | Double = null,
    size: Size = null,
    snapToPixel: js.UndefOr[Boolean] = js.undefined,
    src: String = null
  ): IconOptions = {
    val __obj = js.Dynamic.literal()
    if (anchor != null) __obj.updateDynamic("anchor")(anchor.asInstanceOf[js.Any])
    if (anchorOrigin != null) __obj.updateDynamic("anchorOrigin")(anchorOrigin.asInstanceOf[js.Any])
    if (anchorXUnits != null) __obj.updateDynamic("anchorXUnits")(anchorXUnits.asInstanceOf[js.Any])
    if (anchorYUnits != null) __obj.updateDynamic("anchorYUnits")(anchorYUnits.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (crossOrigin != null) __obj.updateDynamic("crossOrigin")(crossOrigin.asInstanceOf[js.Any])
    if (img != null) __obj.updateDynamic("img")(img.asInstanceOf[js.Any])
    if (imgSize != null) __obj.updateDynamic("imgSize")(imgSize.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (offsetOrigin != null) __obj.updateDynamic("offsetOrigin")(offsetOrigin.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (!js.isUndefined(rotateWithView)) __obj.updateDynamic("rotateWithView")(rotateWithView.asInstanceOf[js.Any])
    if (rotation != null) __obj.updateDynamic("rotation")(rotation.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (!js.isUndefined(snapToPixel)) __obj.updateDynamic("snapToPixel")(snapToPixel.asInstanceOf[js.Any])
    if (src != null) __obj.updateDynamic("src")(src.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconOptions]
  }
}

