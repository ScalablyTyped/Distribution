package typings.mongorito.mongoritoMod

import typings.mongorito.mongoritoMod.ActionTypes.UPDATE
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
    val __obj = js.Dynamic.literal(fields = fields)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[UpdateAction]
  }
}

