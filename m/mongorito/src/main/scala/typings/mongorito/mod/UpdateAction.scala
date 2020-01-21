package typings.mongorito.mod

import typings.mongorito.mod.ActionTypes.UPDATE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateAction extends Action {
  var fields: js.Object
  var `type`: UPDATE
}

object UpdateAction {
  @scala.inline
  def apply(fields: js.Object, `type`: UPDATE): UpdateAction = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAction]
  }
}

