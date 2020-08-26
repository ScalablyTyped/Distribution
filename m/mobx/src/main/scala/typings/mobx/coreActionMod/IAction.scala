package typings.mobx.coreActionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAction extends js.Object {
  var isMobxAction: Boolean = js.native
}

object IAction {
  @scala.inline
  def apply(isMobxAction: Boolean): IAction = {
    val __obj = js.Dynamic.literal(isMobxAction = isMobxAction.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAction]
  }
  @scala.inline
  implicit class IActionOps[Self <: IAction] (val x: Self) extends AnyVal {
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
    def setIsMobxAction(value: Boolean): Self = this.set("isMobxAction", value.asInstanceOf[js.Any])
  }
  
}

