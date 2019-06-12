package typings
package mongoritoLib.mongoritoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoveAction extends Action {
  var `type`: mongoritoLib.mongoritoMod.ActionTypes.REMOVE
}

object RemoveAction {
  @scala.inline
  def apply(`type`: mongoritoLib.mongoritoMod.ActionTypes.REMOVE): RemoveAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[RemoveAction]
  }
}

