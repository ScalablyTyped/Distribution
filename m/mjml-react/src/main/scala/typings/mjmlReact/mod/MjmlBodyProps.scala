package typings.mjmlReact.mod

import typings.csstype.mod.Property.BackgroundColor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MjmlBodyProps extends js.Object {
  var backgroundColor: js.UndefOr[BackgroundColor] = js.native
  var width: js.UndefOr[Double] = js.native
}

object MjmlBodyProps {
  @scala.inline
  def apply(): MjmlBodyProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MjmlBodyProps]
  }
  @scala.inline
  implicit class MjmlBodyPropsOps[Self <: MjmlBodyProps] (val x: Self) extends AnyVal {
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
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

