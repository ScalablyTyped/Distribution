package typings.nvd3.mod

import typings.d3Dispatch.mod.Dispatch_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait State extends js.Object {
  var dispatch: Dispatch_[js.Object] = js.native
}

object State {
  @scala.inline
  def apply(dispatch: Dispatch_[js.Object]): State = {
    val __obj = js.Dynamic.literal(dispatch = dispatch.asInstanceOf[js.Any])
    __obj.asInstanceOf[State]
  }
  @scala.inline
  implicit class StateOps[Self <: State] (val x: Self) extends AnyVal {
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
    def setDispatch(value: Dispatch_[js.Object]): Self = this.set("dispatch", value.asInstanceOf[js.Any])
  }
  
}

