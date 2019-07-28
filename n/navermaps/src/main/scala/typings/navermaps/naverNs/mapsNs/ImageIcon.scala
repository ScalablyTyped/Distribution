package typings.navermaps.naverNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageIcon extends js.Object {
  var anchor: js.UndefOr[Point | PointLiteral | Position] = js.undefined
  var origin: js.UndefOr[Point | PointLiteral] = js.undefined
  var scaledSize: js.UndefOr[Size | SizeLiteral] = js.undefined
  var size: js.UndefOr[Size | SizeLiteral] = js.undefined
  var url: String
}

object ImageIcon {
  @scala.inline
  def apply(
    url: String,
    anchor: Point | PointLiteral | Position = null,
    origin: Point | PointLiteral = null,
    scaledSize: Size | SizeLiteral = null,
    size: Size | SizeLiteral = null
  ): ImageIcon = {
    val __obj = js.Dynamic.literal(url = url)
    if (anchor != null) __obj.updateDynamic("anchor")(anchor.asInstanceOf[js.Any])
    if (origin != null) __obj.updateDynamic("origin")(origin.asInstanceOf[js.Any])
    if (scaledSize != null) __obj.updateDynamic("scaledSize")(scaledSize.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageIcon]
  }
}

