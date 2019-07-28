package typings.mongorito.mongoritoMod

import typings.mongorito.Anon_Args
import typings.mongorito.mongoritoMod.ActionTypes.CALL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CallAction extends Action {
  var args: js.Array[Anon_Args]
  var method: String
  var `type`: CALL
}

object CallAction {
  @scala.inline
  def apply(args: js.Array[Anon_Args], method: String, `type`: CALL): CallAction = {
    val __obj = js.Dynamic.literal(args = args, method = method)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[CallAction]
  }
}

