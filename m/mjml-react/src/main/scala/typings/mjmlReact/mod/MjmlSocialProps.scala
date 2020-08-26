package typings.mjmlReact.mod

import typings.csstype.mod.Property.BackgroundColor
import typings.csstype.mod.Property.Color
import typings.mjmlReact.mjmlReactStrings.horizontal
import typings.mjmlReact.mjmlReactStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MjmlSocialProps extends js.Object {
  var align: js.UndefOr[String] = js.native
  var borderRadius: js.UndefOr[String | Double] = js.native
  var color: js.UndefOr[Color] = js.native
  var containerBackgroundColor: js.UndefOr[BackgroundColor] = js.native
  var fontFamily: js.UndefOr[String] = js.native
  var fontSize: js.UndefOr[String | Double] = js.native
  var iconHeight: js.UndefOr[String] = js.native
  var iconSize: js.UndefOr[String] = js.native
  var innerPadding: js.UndefOr[String] = js.native
  var lineHeight: js.UndefOr[String | Double] = js.native
  var mode: js.UndefOr[vertical | horizontal] = js.native
  var textDecoration: js.UndefOr[String] = js.native
}

object MjmlSocialProps {
  @scala.inline
  def apply(): MjmlSocialProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MjmlSocialProps]
  }
  @scala.inline
  implicit class MjmlSocialPropsOps[Self <: MjmlSocialProps] (val x: Self) extends AnyVal {
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
    def setBorderRadius(value: String | Double): Self = this.set("borderRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderRadius: Self = this.set("borderRadius", js.undefined)
    @scala.inline
    def setColor(value: Color): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setContainerBackgroundColor(value: BackgroundColor): Self = this.set("containerBackgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainerBackgroundColor: Self = this.set("containerBackgroundColor", js.undefined)
    @scala.inline
    def setFontFamily(value: String): Self = this.set("fontFamily", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontFamily: Self = this.set("fontFamily", js.undefined)
    @scala.inline
    def setFontSize(value: String | Double): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontSize: Self = this.set("fontSize", js.undefined)
    @scala.inline
    def setIconHeight(value: String): Self = this.set("iconHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconHeight: Self = this.set("iconHeight", js.undefined)
    @scala.inline
    def setIconSize(value: String): Self = this.set("iconSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconSize: Self = this.set("iconSize", js.undefined)
    @scala.inline
    def setInnerPadding(value: String): Self = this.set("innerPadding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInnerPadding: Self = this.set("innerPadding", js.undefined)
    @scala.inline
    def setLineHeight(value: String | Double): Self = this.set("lineHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineHeight: Self = this.set("lineHeight", js.undefined)
    @scala.inline
    def setMode(value: vertical | horizontal): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    @scala.inline
    def setTextDecoration(value: String): Self = this.set("textDecoration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextDecoration: Self = this.set("textDecoration", js.undefined)
  }
  
}

