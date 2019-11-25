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
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallAction]
  }
}

