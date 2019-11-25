package typings.mongorito.mongoritoMod

import typings.mongorito.mongoritoMod.ActionTypes.SET
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetAction extends Action {
  var fields: js.Object
  var `type`: SET
}

object SetAction {
  @scala.inline
  def apply(fields: js.Object, `type`: SET): SetAction = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetAction]
  }
}

