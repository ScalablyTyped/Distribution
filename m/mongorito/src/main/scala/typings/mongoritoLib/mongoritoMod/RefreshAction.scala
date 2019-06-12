package typings
package mongoritoLib.mongoritoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RefreshAction extends Action {
  var `type`: mongoritoLib.mongoritoMod.ActionTypes.REFRESH
}

object RefreshAction {
  @scala.inline
  def apply(`type`: mongoritoLib.mongoritoMod.ActionTypes.REFRESH): RefreshAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[RefreshAction]
  }
}

