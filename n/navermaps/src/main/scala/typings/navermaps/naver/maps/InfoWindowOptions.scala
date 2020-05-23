package typings.navermaps.naver.maps

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InfoWindowOptions extends js.Object {
  var anchorColor: js.UndefOr[String] = js.undefined
  var anchorSize: js.UndefOr[Size | SizeLiteral] = js.undefined
  var anchorSkew: js.UndefOr[Boolean] = js.undefined
  var backgroundColor: js.UndefOr[String] = js.undefined
  var borderColor: js.UndefOr[String] = js.undefined
  var borderWidth: js.UndefOr[Double] = js.undefined
  var content: String | HTMLElement
  var disableAnchor: js.UndefOr[Boolean] = js.undefined
  var disableAutoPan: js.UndefOr[Boolean] = js.undefined
  var maxWidth: js.UndefOr[Double] = js.undefined
  var pixelOffset: js.UndefOr[Point | PointLiteral] = js.undefined
  var position: js.UndefOr[Coord | CoordLiteral] = js.undefined
  var zIndex: js.UndefOr[Double] = js.undefined
}

object InfoWindowOptions {
  @scala.inline
  def apply(
    content: String | HTMLElement,
    anchorColor: String = null,
    anchorSize: Size | SizeLiteral = null,
    anchorSkew: js.UndefOr[Boolean] = js.undefined,
    backgroundColor: String = null,
    borderColor: String = null,
    borderWidth: js.UndefOr[Double] = js.undefined,
    disableAnchor: js.UndefOr[Boolean] = js.undefined,
    disableAutoPan: js.UndefOr[Boolean] = js.undefined,
    maxWidth: js.UndefOr[Double] = js.undefined,
    pixelOffset: Point | PointLiteral = null,
    position: Coord | CoordLiteral = null,
    zIndex: js.UndefOr[Double] = js.undefined
  ): InfoWindowOptions = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    if (anchorColor != null) __obj.updateDynamic("anchorColor")(anchorColor.asInstanceOf[js.Any])
    if (anchorSize != null) __obj.updateDynamic("anchorSize")(anchorSize.asInstanceOf[js.Any])
    if (!js.isUndefined(anchorSkew)) __obj.updateDynamic("anchorSkew")(anchorSkew.get.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (!js.isUndefined(borderWidth)) __obj.updateDynamic("borderWidth")(borderWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disableAnchor)) __obj.updateDynamic("disableAnchor")(disableAnchor.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disableAutoPan)) __obj.updateDynamic("disableAutoPan")(disableAutoPan.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxWidth)) __obj.updateDynamic("maxWidth")(maxWidth.get.asInstanceOf[js.Any])
    if (pixelOffset != null) __obj.updateDynamic("pixelOffset")(pixelOffset.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(zIndex)) __obj.updateDynamic("zIndex")(zIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[InfoWindowOptions]
  }
}

