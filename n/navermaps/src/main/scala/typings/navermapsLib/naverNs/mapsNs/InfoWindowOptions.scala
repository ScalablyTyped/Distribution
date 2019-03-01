package typings
package navermapsLib.naverNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InfoWindowOptions extends js.Object {
  var anchorColor: js.UndefOr[java.lang.String] = js.undefined
  var anchorSize: js.UndefOr[Size | SizeLiteral] = js.undefined
  var anchorSkew: js.UndefOr[scala.Boolean] = js.undefined
  var backgroundColor: js.UndefOr[java.lang.String] = js.undefined
  var borderColor: js.UndefOr[java.lang.String] = js.undefined
  var borderWidth: js.UndefOr[scala.Double] = js.undefined
  var content: java.lang.String | stdLib.HTMLElement
  var disableAnchor: js.UndefOr[scala.Boolean] = js.undefined
  var disableAutoPan: js.UndefOr[scala.Boolean] = js.undefined
  var maxWidth: js.UndefOr[scala.Double] = js.undefined
  var pixelOffset: js.UndefOr[Point | PointLiteral] = js.undefined
  var position: js.UndefOr[Coord | CoordLiteral] = js.undefined
  var zIndex: js.UndefOr[scala.Double] = js.undefined
}

object InfoWindowOptions {
  @scala.inline
  def apply(
    content: java.lang.String | stdLib.HTMLElement,
    anchorColor: java.lang.String = null,
    anchorSize: Size | SizeLiteral = null,
    anchorSkew: js.UndefOr[scala.Boolean] = js.undefined,
    backgroundColor: java.lang.String = null,
    borderColor: java.lang.String = null,
    borderWidth: scala.Int | scala.Double = null,
    disableAnchor: js.UndefOr[scala.Boolean] = js.undefined,
    disableAutoPan: js.UndefOr[scala.Boolean] = js.undefined,
    maxWidth: scala.Int | scala.Double = null,
    pixelOffset: Point | PointLiteral = null,
    position: Coord | CoordLiteral = null,
    zIndex: scala.Int | scala.Double = null
  ): InfoWindowOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (anchorColor != null) __obj.updateDynamic("anchorColor")(anchorColor)
    if (anchorSize != null) __obj.updateDynamic("anchorSize")(anchorSize.asInstanceOf[js.Any])
    if (!js.isUndefined(anchorSkew)) __obj.updateDynamic("anchorSkew")(anchorSkew)
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor)
    if (borderWidth != null) __obj.updateDynamic("borderWidth")(borderWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(disableAnchor)) __obj.updateDynamic("disableAnchor")(disableAnchor)
    if (!js.isUndefined(disableAutoPan)) __obj.updateDynamic("disableAutoPan")(disableAutoPan)
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (pixelOffset != null) __obj.updateDynamic("pixelOffset")(pixelOffset.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[InfoWindowOptions]
  }
}

