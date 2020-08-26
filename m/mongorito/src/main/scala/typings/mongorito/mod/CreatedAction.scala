package typings.mongorito.mod

import typings.mongorito.mod.ActionTypes.CREATED
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreatedAction extends Action {
  var id: js.Object = js.native
  var `type`: CREATED = js.native
}

object CreatedAction {
  @scala.inline
  def apply(id: js.Object, `type`: CREATED): CreatedAction = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatedAction]
  }
  @scala.inline
  implicit class CreatedActionOps[Self <: CreatedAction] (val x: Self) extends AnyVal {
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
    def setId(value: js.Object): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: CREATED): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

