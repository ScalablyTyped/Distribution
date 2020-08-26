package typings.mjmlReact.mod

import typings.csstype.mod.Property.BackgroundColor
import typings.csstype.mod.Property.VerticalAlign
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MjmlGroupProps extends js.Object {
  var backgroundColor: js.UndefOr[BackgroundColor] = js.native
  var verticalAlign: js.UndefOr[VerticalAlign[String | Double]] = js.native
  var width: js.UndefOr[String | Double] = js.native
}

object MjmlGroupProps {
  @scala.inline
  def apply(): MjmlGroupProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MjmlGroupProps]
  }
  @scala.inline
  implicit class MjmlGroupPropsOps[Self <: MjmlGroupProps] (val x: Self) extends AnyVal {
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
    def setBackgroundColor(value: BackgroundColor): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
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

