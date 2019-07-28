package typings.mongorito.mongoritoMod

import typings.mongorito.mongoritoMod.ActionTypes.REMOVED
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemovedAction extends Action {
  var `type`: REMOVED
}

object RemovedAction {
  @scala.inline
  def apply(`type`: REMOVED): RemovedAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[RemovedAction]
  }
}

