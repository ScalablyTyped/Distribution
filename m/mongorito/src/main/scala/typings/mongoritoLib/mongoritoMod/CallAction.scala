package typings
package mongoritoLib.mongoritoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CallAction extends Action {
  var args: js.Array[mongoritoLib.Anon_Args]
  var method: java.lang.String
  var `type`: mongoritoLib.mongoritoMod.ActionTypes.CALL
}

object CallAction {
  @scala.inline
  def apply(
    args: js.Array[mongoritoLib.Anon_Args],
    method: java.lang.String,
    `type`: mongoritoLib.mongoritoMod.ActionTypes.CALL
  ): CallAction = {
    val __obj = js.Dynamic.literal(args = args, method = method)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[CallAction]
  }
}

