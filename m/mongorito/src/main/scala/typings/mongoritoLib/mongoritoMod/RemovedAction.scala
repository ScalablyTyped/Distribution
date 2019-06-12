package typings
package mongoritoLib.mongoritoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemovedAction extends Action {
  var `type`: mongoritoLib.mongoritoMod.ActionTypes.REMOVED
}

object RemovedAction {
  @scala.inline
  def apply(`type`: mongoritoLib.mongoritoMod.ActionTypes.REMOVED): RemovedAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[RemovedAction]
  }
}

