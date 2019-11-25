package typings.mongorito.mongoritoMod

import typings.mongorito.mongoritoMod.ActionTypes.CREATED
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreatedAction extends Action {
  var id: js.Object
  var `type`: CREATED
}

object CreatedAction {
  @scala.inline
  def apply(id: js.Object, `type`: CREATED): CreatedAction = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatedAction]
  }
}

