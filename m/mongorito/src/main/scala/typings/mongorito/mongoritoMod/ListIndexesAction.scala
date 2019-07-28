package typings.mongorito.mongoritoMod

import typings.mongorito.mongoritoMod.ActionTypes.LIST_INDEXES
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListIndexesAction extends Action {
  var args: js.Array[_]
  var `type`: LIST_INDEXES
}

object ListIndexesAction {
  @scala.inline
  def apply(args: js.Array[_], `type`: LIST_INDEXES): ListIndexesAction = {
    val __obj = js.Dynamic.literal(args = args)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ListIndexesAction]
  }
}

