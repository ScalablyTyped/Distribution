package typings.navermaps.naver.maps

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HtmlIcon extends js.Object {
  var anchor: js.UndefOr[Point | PointLiteral | Position] = js.undefined
  var content: String | HTMLElement
  var size: js.UndefOr[Size | SizeLiteral] = js.undefined
}

object HtmlIcon {
  @scala.inline
  def apply(
    content: String | HTMLElement,
    anchor: Point | PointLiteral | Position = null,
    size: Size | SizeLiteral = null
  ): HtmlIcon = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    if (anchor != null) __obj.updateDynamic("anchor")(anchor.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[HtmlIcon]
  }
}

