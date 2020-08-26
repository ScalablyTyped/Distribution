package typings.mjmlReact.mod

import typings.csstype.mod.Property.BackgroundColor
import typings.csstype.mod.Property.Color
import typings.mjmlReact.mjmlReactStrings.auto
import typings.mjmlReact.mjmlReactStrings.center
import typings.mjmlReact.mjmlReactStrings.fixed
import typings.mjmlReact.mjmlReactStrings.inherit
import typings.mjmlReact.mjmlReactStrings.initial
import typings.mjmlReact.mjmlReactStrings.left
import typings.mjmlReact.mjmlReactStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MjmlTableProps extends js.Object {
  var align: js.UndefOr[left | right | center] = js.native
  var cellpadding: js.UndefOr[String] = js.native
  var cellspacing: js.UndefOr[String] = js.native
  var color: js.UndefOr[Color] = js.native
  var containerBackgroundColor: js.UndefOr[BackgroundColor] = js.native
  var fontFamily: js.UndefOr[String] = js.native
  var fontSize: js.UndefOr[String | Double] = js.native
  var fontStyle: js.UndefOr[String] = js.native
  var lineHeight: js.UndefOr[String | Double] = js.native
  var tableLayout: js.UndefOr[auto | fixed | initial | inherit] = js.native
  var width: js.UndefOr[String | Double] = js.native
}

object MjmlTableProps {
  @scala.inline
  def apply(): MjmlTableProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MjmlTableProps]
  }
  @scala.inline
  implicit class MjmlTablePropsOps[Self <: MjmlTableProps] (val x: Self) extends AnyVal {
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
    def setAlign(value: left | right | center): Self = this.set("align", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    @scala.inline
    def setCellpadding(value: String): Self = this.set("cellpadding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCellpadding: Self = this.set("cellpadding", js.undefined)
    @scala.inline
    def setCellspacing(value: String): Self = this.set("cellspacing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCellspacing: Self = this.set("cellspacing", js.undefined)
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
    def setLineHeight(value: String | Double): Self = this.set("lineHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineHeight: Self = this.set("lineHeight", js.undefined)
    @scala.inline
    def setTableLayout(value: auto | fixed | initial | inherit): Self = this.set("tableLayout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTableLayout: Self = this.set("tableLayout", js.undefined)
    @scala.inline
    def setWidth(value: String | Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

