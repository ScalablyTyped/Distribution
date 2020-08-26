package typings.mongorito.mod

import typings.mongorito.mod.ActionTypes.DROP_INDEX
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DropIndexAction extends Action {
  var args: js.Array[_] = js.native
  var `type`: DROP_INDEX = js.native
}

object DropIndexAction {
  @scala.inline
  def apply(args: js.Array[_], `type`: DROP_INDEX): DropIndexAction = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropIndexAction]
  }
  @scala.inline
  implicit class DropIndexActionOps[Self <: DropIndexAction] (val x: Self) extends AnyVal {
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
    def setArgsVarargs(value: js.Any*): Self = this.set("args", js.Array(value :_*))
    @scala.inline
    def setArgs(value: js.Array[_]): Self = this.set("args", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: DROP_INDEX): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

