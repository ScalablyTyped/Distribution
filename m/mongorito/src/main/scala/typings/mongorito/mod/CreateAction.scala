package typings.mongorito.mod

import typings.mongorito.mod.ActionTypes.CREATE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateAction extends Action {
  var id: js.Object
  var `type`: CREATE
}

object CreateAction {
  @scala.inline
  def apply(id: js.Object, `type`: CREATE): CreateAction = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAction]
  }
}

