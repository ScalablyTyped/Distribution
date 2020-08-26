package typings.mjmlReact.mod

import typings.csstype.mod.Property.BackgroundColor
import typings.csstype.mod.Property.BorderColor
import typings.csstype.mod.Property.BorderStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MjmlDividerProps extends js.Object {
  var borderColor: js.UndefOr[BorderColor] = js.native
  var borderStyle: js.UndefOr[BorderStyle] = js.native
  var borderWidth: js.UndefOr[String | Double] = js.native
  var containerBackgroundColor: js.UndefOr[BackgroundColor] = js.native
  var width: js.UndefOr[String | Double] = js.native
}

object MjmlDividerProps {
  @scala.inline
  def apply(): MjmlDividerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MjmlDividerProps]
  }
  @scala.inline
  implicit class MjmlDividerPropsOps[Self <: MjmlDividerProps] (val x: Self) extends AnyVal {
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
    def setBorderColor(value: BorderColor): Self = this.set("borderColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderColor: Self = this.set("borderColor", js.undefined)
    @scala.inline
    def setBorderStyle(value: BorderStyle): Self = this.set("borderStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderStyle: Self = this.set("borderStyle", js.undefined)
    @scala.inline
    def setBorderWidth(value: String | Double): Self = this.set("borderWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderWidth: Self = this.set("borderWidth", js.undefined)
    @scala.inline
    def setContainerBackgroundColor(value: BackgroundColor): Self = this.set("containerBackgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainerBackgroundColor: Self = this.set("containerBackgroundColor", js.undefined)
    @scala.inline
    def setWidth(value: String | Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

