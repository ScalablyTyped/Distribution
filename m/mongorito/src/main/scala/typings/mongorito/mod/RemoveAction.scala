package typings.mongorito.mod

import typings.mongorito.mod.ActionTypes.REMOVE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoveAction extends Action {
  var `type`: REMOVE = js.native
}

object RemoveAction {
  @scala.inline
  def apply(`type`: REMOVE): RemoveAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveAction]
  }
  @scala.inline
  implicit class RemoveActionOps[Self <: RemoveAction] (val x: Self) extends AnyVal {
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
    def setType(value: REMOVE): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

