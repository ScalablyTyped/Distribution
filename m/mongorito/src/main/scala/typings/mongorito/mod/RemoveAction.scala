package typings.mongorito.mod

import typings.mongorito.mod.ActionTypes.REMOVE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoveAction extends Action {
  var `type`: REMOVE
}

object RemoveAction {
  @scala.inline
  def apply(`type`: REMOVE): RemoveAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveAction]
  }
}

