package typings.mongorito.mod

import typings.mongorito.anon.Args
import typings.mongorito.mod.ActionTypes.CALL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CallAction extends Action {
  var args: js.Array[Args] = js.native
  var method: String = js.native
  var `type`: CALL = js.native
}

object CallAction {
  @scala.inline
  def apply(args: js.Array[Args], method: String, `type`: CALL): CallAction = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallAction]
  }
  @scala.inline
  implicit class CallActionOps[Self <: CallAction] (val x: Self) extends AnyVal {
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
    def setArgsVarargs(value: Args*): Self = this.set("args", js.Array(value :_*))
    @scala.inline
    def setArgs(value: js.Array[Args]): Self = this.set("args", value.asInstanceOf[js.Any])
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: CALL): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

