package typings
package mongoritoLib.mongoritoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdatedAction extends Action {
  var fields: js.Object
  var `type`: mongoritoLib.mongoritoMod.ActionTypes.UPDATED
}

object UpdatedAction {
  @scala.inline
  def apply(fields: js.Object, `type`: mongoritoLib.mongoritoMod.ActionTypes.UPDATED): UpdatedAction = {
    val __obj = js.Dynamic.literal(fields = fields)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[UpdatedAction]
  }
}

