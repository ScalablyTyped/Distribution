package typings.mongorito.mod

import typings.mongorito.mod.ActionTypes.SAVE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SaveAction extends Action {
  var fields: js.Object
  var `type`: SAVE
}

object SaveAction {
  @scala.inline
  def apply(fields: js.Object, `type`: SAVE): SaveAction = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SaveAction]
  }
}

