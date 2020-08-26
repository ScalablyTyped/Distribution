package typings.mjmlReact.mod

import typings.csstype.mod.Property.BackgroundColor
import typings.csstype.mod.Property.Border
import typings.csstype.mod.Property.BorderRadius
import typings.mjmlReact.mjmlReactStrings.hidden
import typings.mjmlReact.mjmlReactStrings.visible
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MjmlCarouselProps extends js.Object {
  var align: js.UndefOr[String] = js.native
  var backgroundColor: js.UndefOr[BackgroundColor] = js.native
  var borderRadius: js.UndefOr[String | Double] = js.native
  var iconWidth: js.UndefOr[String] = js.native
  var leftIcon: js.UndefOr[String] = js.native
  var rightIcon: js.UndefOr[String] = js.native
  var tbBorder: js.UndefOr[Border[String | Double]] = js.native
  var tbBorderRadius: js.UndefOr[BorderRadius[String | Double]] = js.native
  var tbHoverBorderColor: js.UndefOr[String] = js.native
  var tbSelectedBorderColor: js.UndefOr[String] = js.native
  var tbWidth: js.UndefOr[String] = js.native
  var thumbnails: js.UndefOr[hidden | visible] = js.native
}

object MjmlCarouselProps {
  @scala.inline
  def apply(): MjmlCarouselProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MjmlCarouselProps]
  }
  @scala.inline
  implicit class MjmlCarouselPropsOps[Self <: MjmlCarouselProps] (val x: Self) extends AnyVal {
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
    def setAlign(value: String): Self = this.set("align", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    @scala.inline
    def setBackgroundColor(value: BackgroundColor): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    @scala.inline
    def setBorderRadius(value: String | Double): Self = this.set("borderRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderRadius: Self = this.set("borderRadius", js.undefined)
    @scala.inline
    def setIconWidth(value: String): Self = this.set("iconWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconWidth: Self = this.set("iconWidth", js.undefined)
    @scala.inline
    def setLeftIcon(value: String): Self = this.set("leftIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeftIcon: Self = this.set("leftIcon", js.undefined)
    @scala.inline
    def setRightIcon(value: String): Self = this.set("rightIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRightIcon: Self = this.set("rightIcon", js.undefined)
    @scala.inline
    def setTbBorder(value: Border[String | Double]): Self = this.set("tbBorder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTbBorder: Self = this.set("tbBorder", js.undefined)
    @scala.inline
    def setTbBorderRadius(value: BorderRadius[String | Double]): Self = this.set("tbBorderRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTbBorderRadius: Self = this.set("tbBorderRadius", js.undefined)
    @scala.inline
    def setTbHoverBorderColor(value: String): Self = this.set("tbHoverBorderColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTbHoverBorderColor: Self = this.set("tbHoverBorderColor", js.undefined)
    @scala.inline
    def setTbSelectedBorderColor(value: String): Self = this.set("tbSelectedBorderColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTbSelectedBorderColor: Self = this.set("tbSelectedBorderColor", js.undefined)
    @scala.inline
    def setTbWidth(value: String): Self = this.set("tbWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTbWidth: Self = this.set("tbWidth", js.undefined)
    @scala.inline
    def setThumbnails(value: hidden | visible): Self = this.set("thumbnails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThumbnails: Self = this.set("thumbnails", js.undefined)
  }
  
}

