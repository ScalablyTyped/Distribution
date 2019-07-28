package typings.mongorito.mongoritoMod

import typings.mongorito.mongoritoMod.ActionTypes.CREATE_INDEX
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateIndexAction extends Action {
  var args: js.Array[_]
  var `type`: CREATE_INDEX
}

object CreateIndexAction {
  @scala.inline
  def apply(args: js.Array[_], `type`: CREATE_INDEX): CreateIndexAction = {
    val __obj = js.Dynamic.literal(args = args)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[CreateIndexAction]
  }
}

