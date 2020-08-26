package typings.mjmlReact.mod

import typings.csstype.mod.Property.BackgroundColor
import typings.csstype.mod.Property.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MjmlTextProps extends js.Object {
  var align: js.UndefOr[String] = js.native
  var color: js.UndefOr[Color] = js.native
  var containerBackgroundColor: js.UndefOr[BackgroundColor] = js.native
  var fontFamily: js.UndefOr[String] = js.native
  var fontSize: js.UndefOr[String | Double] = js.native
  var fontStyle: js.UndefOr[String] = js.native
  var fontWeight: js.UndefOr[Double] = js.native
  var height: js.UndefOr[String | Double] = js.native
  var letterSpacing: js.UndefOr[String] = js.native
  var lineHeight: js.UndefOr[String] = js.native
  var textDecoration: js.UndefOr[String] = js.native
  var textTransform: js.UndefOr[String] = js.native
}

object MjmlTextProps {
  @scala.inline
  def apply(): MjmlTextProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MjmlTextProps]
  }
  @scala.inline
  implicit class MjmlTextPropsOps[Self <: MjmlTextProps] (val x: Self) extends AnyVal {
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
    def setFontStyle(value: String): Self = this.set("fontStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontStyle: Self = this.set("fontStyle", js.undefined)
    @scala.inline
    def setFontWeight(value: Double): Self = this.set("fontWeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontWeight: Self = this.set("fontWeight", js.undefined)
    @scala.inline
    def setHeight(value: String | Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setLetterSpacing(value: String): Self = this.set("letterSpacing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLetterSpacing: Self = this.set("letterSpacing", js.undefined)
    @scala.inline
    def setLineHeight(value: String): Self = this.set("lineHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineHeight: Self = this.set("lineHeight", js.undefined)
    @scala.inline
    def setTextDecoration(value: String): Self = this.set("textDecoration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextDecoration: Self = this.set("textDecoration", js.undefined)
    @scala.inline
    def setTextTransform(value: String): Self = this.set("textTransform", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextTransform: Self = this.set("textTransform", js.undefined)
  }
  
}

