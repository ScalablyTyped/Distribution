package typings
package mongoritoLib.mongoritoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateIndexAction extends Action {
  var args: js.Array[_]
  var `type`: mongoritoLib.mongoritoMod.ActionTypes.CREATE_INDEX
}

object CreateIndexAction {
  @scala.inline
  def apply(args: js.Array[_], `type`: mongoritoLib.mongoritoMod.ActionTypes.CREATE_INDEX): CreateIndexAction = {
    val __obj = js.Dynamic.literal(args = args)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[CreateIndexAction]
  }
}

