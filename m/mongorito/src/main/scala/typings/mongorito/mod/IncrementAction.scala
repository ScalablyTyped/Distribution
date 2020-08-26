package typings.mongorito.mod

import typings.mongorito.mod.ActionTypes.INCREMENT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IncrementAction extends Action {
  var fields: js.Object = js.native
  var `type`: INCREMENT = js.native
}

object IncrementAction {
  @scala.inline
  def apply(fields: js.Object, `type`: INCREMENT): IncrementAction = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncrementAction]
  }
  @scala.inline
  implicit class IncrementActionOps[Self <: IncrementAction] (val x: Self) extends AnyVal {
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
    def setFields(value: js.Object): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: INCREMENT): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

