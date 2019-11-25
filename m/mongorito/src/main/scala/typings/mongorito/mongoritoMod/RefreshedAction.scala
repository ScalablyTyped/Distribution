package typings.mongorito.mongoritoMod

import typings.mongorito.mongoritoMod.ActionTypes.REFRESHED
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RefreshedAction extends Action {
  var fields: js.Object
  var `type`: REFRESHED
}

object RefreshedAction {
  @scala.inline
  def apply(fields: js.Object, `type`: REFRESHED): RefreshedAction = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefreshedAction]
  }
}

