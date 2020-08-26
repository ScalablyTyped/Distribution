package typings.navermaps.naver.maps

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HtmlIcon extends js.Object {
  var anchor: js.UndefOr[Point | PointLiteral | Position] = js.native
  var content: String | HTMLElement = js.native
  var size: js.UndefOr[Size | SizeLiteral] = js.native
}

object HtmlIcon {
  @scala.inline
  def apply(content: String | HTMLElement): HtmlIcon = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[HtmlIcon]
  }
  @scala.inline
  implicit class HtmlIconOps[Self <: HtmlIcon] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setContent(value: String | HTMLElement): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def setAnchor(value: Point | PointLiteral | Position): Self = this.set("anchor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnchor: Self = this.set("anchor", js.undefined)
    @scala.inline
    def setSize(value: Size | SizeLiteral): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
  
}

