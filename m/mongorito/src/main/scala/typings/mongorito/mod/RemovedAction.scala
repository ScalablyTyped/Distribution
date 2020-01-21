package typings.mongorito.mod

import typings.mongorito.mod.ActionTypes.REMOVED
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
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemovedAction]
  }
}

