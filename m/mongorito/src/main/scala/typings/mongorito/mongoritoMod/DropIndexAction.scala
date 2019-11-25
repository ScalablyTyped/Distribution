package typings.mongorito.mongoritoMod

import typings.mongorito.mongoritoMod.ActionTypes.DROP_INDEX
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropIndexAction extends Action {
  var args: js.Array[_]
  var `type`: DROP_INDEX
}

object DropIndexAction {
  @scala.inline
  def apply(args: js.Array[_], `type`: DROP_INDEX): DropIndexAction = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropIndexAction]
  }
}

