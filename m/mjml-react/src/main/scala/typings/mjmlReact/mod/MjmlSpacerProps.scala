package typings.mjmlReact.mod

import typings.csstype.mod.Property.BackgroundColor
import typings.csstype.mod.Property.VerticalAlign
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MjmlSpacerProps extends js.Object {
  var containerBackgroundColor: js.UndefOr[BackgroundColor] = js.native
  var height: js.UndefOr[String | Double] = js.native
  var verticalAlign: js.UndefOr[VerticalAlign[String | Double]] = js.native
  var width: js.UndefOr[String | Double] = js.native
}

object MjmlSpacerProps {
  @scala.inline
  def apply(): MjmlSpacerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MjmlSpacerProps]
  }
  @scala.inline
  implicit class MjmlSpacerPropsOps[Self <: MjmlSpacerProps] (val x: Self) extends AnyVal {
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
    def setContainerBackgroundColor(value: BackgroundColor): Self = this.set("containerBackgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainerBackgroundColor: Self = this.set("containerBackgroundColor", js.undefined)
    @scala.inline
    def setHeight(value: String | Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setVerticalAlign(value: VerticalAlign[String | Double]): Self = this.set("verticalAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerticalAlign: Self = this.set("verticalAlign", js.undefined)
    @scala.inline
    def setWidth(value: String | Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

