package typings
package mongoritoLib.mongoritoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropIndexAction extends Action {
  var args: js.Array[_]
  var `type`: mongoritoLib.mongoritoMod.ActionTypes.DROP_INDEX
}

object DropIndexAction {
  @scala.inline
  def apply(args: js.Array[_], `type`: mongoritoLib.mongoritoMod.ActionTypes.DROP_INDEX): DropIndexAction = {
    val __obj = js.Dynamic.literal(args = args)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[DropIndexAction]
  }
}

