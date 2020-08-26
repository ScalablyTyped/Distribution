package typings.navermaps.naver.maps

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InfoWindowOptions extends js.Object {
  var anchorColor: js.UndefOr[String] = js.native
  var anchorSize: js.UndefOr[Size | SizeLiteral] = js.native
  var anchorSkew: js.UndefOr[Boolean] = js.native
  var backgroundColor: js.UndefOr[String] = js.native
  var borderColor: js.UndefOr[String] = js.native
  var borderWidth: js.UndefOr[Double] = js.native
  var content: String | HTMLElement = js.native
  var disableAnchor: js.UndefOr[Boolean] = js.native
  var disableAutoPan: js.UndefOr[Boolean] = js.native
  var maxWidth: js.UndefOr[Double] = js.native
  var pixelOffset: js.UndefOr[Point | PointLiteral] = js.native
  var position: js.UndefOr[Coord | CoordLiteral] = js.native
  var zIndex: js.UndefOr[Double] = js.native
}

object InfoWindowOptions {
  @scala.inline
  def apply(content: String | HTMLElement): InfoWindowOptions = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[InfoWindowOptions]
  }
  @scala.inline
  implicit class InfoWindowOptionsOps[Self <: InfoWindowOptions] (val x: Self) extends AnyVal {
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
    def setAnchorColor(value: String): Self = this.set("anchorColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnchorColor: Self = this.set("anchorColor", js.undefined)
    @scala.inline
    def setAnchorSize(value: Size | SizeLiteral): Self = this.set("anchorSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnchorSize: Self = this.set("anchorSize", js.undefined)
    @scala.inline
    def setAnchorSkew(value: Boolean): Self = this.set("anchorSkew", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnchorSkew: Self = this.set("anchorSkew", js.undefined)
    @scala.inline
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    @scala.inline
    def setBorderColor(value: String): Self = this.set("borderColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderColor: Self = this.set("borderColor", js.undefined)
    @scala.inline
    def setBorderWidth(value: Double): Self = this.set("borderWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderWidth: Self = this.set("borderWidth", js.undefined)
    @scala.inline
    def setDisableAnchor(value: Boolean): Self = this.set("disableAnchor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableAnchor: Self = this.set("disableAnchor", js.undefined)
    @scala.inline
    def setDisableAutoPan(value: Boolean): Self = this.set("disableAutoPan", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableAutoPan: Self = this.set("disableAutoPan", js.undefined)
    @scala.inline
    def setMaxWidth(value: Double): Self = this.set("maxWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxWidth: Self = this.set("maxWidth", js.undefined)
    @scala.inline
    def setPixelOffset(value: Point | PointLiteral): Self = this.set("pixelOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePixelOffset: Self = this.set("pixelOffset", js.undefined)
    @scala.inline
    def setPosition(value: Coord | CoordLiteral): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setZIndex(value: Double): Self = this.set("zIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZIndex: Self = this.set("zIndex", js.undefined)
  }
  
}

