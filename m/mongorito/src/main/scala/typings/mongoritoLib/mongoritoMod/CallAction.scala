package typings
package mongoritoLib.mongoritoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CallAction extends Action {
  var args: js.Array[mongoritoLib.Anon_Args]
  var method: java.lang.String
  var `type`: ActionTypes
}

object CallAction {
  @scala.inline
  def apply(args: js.Array[mongoritoLib.Anon_Args], method: java.lang.String, `type`: ActionTypes): CallAction = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("args")(args)
    __obj.updateDynamic("method")(method)
    __obj.asInstanceOf[CallAction]
  }
}

