package typings
package mongoritoLib.mongoritoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListIndexesAction extends Action {
  var args: js.Array[_]
  var `type`: mongoritoLib.mongoritoMod.ActionTypes.LIST_INDEXES
}

object ListIndexesAction {
  @scala.inline
  def apply(args: js.Array[_], `type`: mongoritoLib.mongoritoMod.ActionTypes.LIST_INDEXES): ListIndexesAction = {
    val __obj = js.Dynamic.literal(args = args)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ListIndexesAction]
  }
}

