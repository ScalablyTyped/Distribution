package typings
package mongoritoLib.mongoritoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemovedAction extends Action {
  var `type`: ActionTypes
}

object RemovedAction {
  @scala.inline
  def apply(`type`: ActionTypes): RemovedAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[RemovedAction]
  }
}

