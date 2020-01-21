package typings.mongorito.mod

import typings.mongorito.mod.ActionTypes.LIST_INDEXES
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
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListIndexesAction]
  }
}

