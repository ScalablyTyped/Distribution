package typings.mjmlReact.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MjmlBreakpointProps extends js.Object {
  var width: js.UndefOr[String | Double] = js.native
}

object MjmlBreakpointProps {
  @scala.inline
  def apply(): MjmlBreakpointProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MjmlBreakpointProps]
  }
  @scala.inline
  implicit class MjmlBreakpointPropsOps[Self <: MjmlBreakpointProps] (val x: Self) extends AnyVal {
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
    def setWidth(value: String | Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

