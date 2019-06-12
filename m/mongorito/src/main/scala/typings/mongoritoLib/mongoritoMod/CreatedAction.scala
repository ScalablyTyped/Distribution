package typings
package mongoritoLib.mongoritoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreatedAction extends Action {
  var id: js.Object
  var `type`: mongoritoLib.mongoritoMod.ActionTypes.CREATED
}

object CreatedAction {
  @scala.inline
  def apply(id: js.Object, `type`: mongoritoLib.mongoritoMod.ActionTypes.CREATED): CreatedAction = {
    val __obj = js.Dynamic.literal(id = id)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[CreatedAction]
  }
}

