package typings.mongorito.mod

import typings.mongorito.mod.ActionTypes.UPDATED
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdatedAction extends Action {
  var fields: js.Object
  var `type`: UPDATED
}

object UpdatedAction {
  @scala.inline
  def apply(fields: js.Object, `type`: UPDATED): UpdatedAction = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatedAction]
  }
}

