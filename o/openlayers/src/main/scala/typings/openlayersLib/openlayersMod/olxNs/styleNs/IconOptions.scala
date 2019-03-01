package typings
package openlayersLib.openlayersMod.olxNs.styleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IconOptions extends js.Object {
  var anchor: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var anchorOrigin: js.UndefOr[openlayersLib.openlayersMod.styleNs.IconOrigin] = js.undefined
  var anchorXUnits: js.UndefOr[openlayersLib.openlayersMod.styleNs.IconAnchorUnits] = js.undefined
  var anchorYUnits: js.UndefOr[openlayersLib.openlayersMod.styleNs.IconAnchorUnits] = js.undefined
  var color: js.UndefOr[openlayersLib.openlayersMod.Color | java.lang.String] = js.undefined
  var crossOrigin: js.UndefOr[java.lang.String] = js.undefined
  var img: js.UndefOr[stdLib.HTMLImageElement | stdLib.HTMLCanvasElement] = js.undefined
  var imgSize: js.UndefOr[openlayersLib.openlayersMod.Size] = js.undefined
  var offset: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var offsetOrigin: js.UndefOr[openlayersLib.openlayersMod.styleNs.IconOrigin] = js.undefined
  var opacity: js.UndefOr[scala.Double] = js.undefined
  var rotateWithView: js.UndefOr[scala.Boolean] = js.undefined
  var rotation: js.UndefOr[scala.Double] = js.undefined
  var scale: js.UndefOr[scala.Double] = js.undefined
  var size: js.UndefOr[openlayersLib.openlayersMod.Size] = js.undefined
  var snapToPixel: js.UndefOr[scala.Boolean] = js.undefined
  var src: js.UndefOr[java.lang.String] = js.undefined
}

object IconOptions {
  @scala.inline
  def apply(
    anchor: js.Array[scala.Double] = null,
    anchorOrigin: openlayersLib.openlayersMod.styleNs.IconOrigin = null,
    anchorXUnits: openlayersLib.openlayersMod.styleNs.IconAnchorUnits = null,
    anchorYUnits: openlayersLib.openlayersMod.styleNs.IconAnchorUnits = null,
    color: openlayersLib.openlayersMod.Color | java.lang.String = null,
    crossOrigin: java.lang.String = null,
    img: stdLib.HTMLImageElement | stdLib.HTMLCanvasElement = null,
    imgSize: openlayersLib.openlayersMod.Size = null,
    offset: js.Array[scala.Double] = null,
    offsetOrigin: openlayersLib.openlayersMod.styleNs.IconOrigin = null,
    opacity: scala.Int | scala.Double = null,
    rotateWithView: js.UndefOr[scala.Boolean] = js.undefined,
    rotation: scala.Int | scala.Double = null,
    scale: scala.Int | scala.Double = null,
    size: openlayersLib.openlayersMod.Size = null,
    snapToPixel: js.UndefOr[scala.Boolean] = js.undefined,
    src: java.lang.String = null
  ): IconOptions = {
    val __obj = js.Dynamic.literal()
    if (anchor != null) __obj.updateDynamic("anchor")(anchor)
    if (anchorOrigin != null) __obj.updateDynamic("anchorOrigin")(anchorOrigin)
    if (anchorXUnits != null) __obj.updateDynamic("anchorXUnits")(anchorXUnits)
    if (anchorYUnits != null) __obj.updateDynamic("anchorYUnits")(anchorYUnits)
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (crossOrigin != null) __obj.updateDynamic("crossOrigin")(crossOrigin)
    if (img != null) __obj.updateDynamic("img")(img.asInstanceOf[js.Any])
    if (imgSize != null) __obj.updateDynamic("imgSize")(imgSize)
    if (offset != null) __obj.updateDynamic("offset")(offset)
    if (offsetOrigin != null) __obj.updateDynamic("offsetOrigin")(offsetOrigin)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (!js.isUndefined(rotateWithView)) __obj.updateDynamic("rotateWithView")(rotateWithView)
    if (rotation != null) __obj.updateDynamic("rotation")(rotation.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size)
    if (!js.isUndefined(snapToPixel)) __obj.updateDynamic("snapToPixel")(snapToPixel)
    if (src != null) __obj.updateDynamic("src")(src)
    __obj.asInstanceOf[IconOptions]
  }
}

