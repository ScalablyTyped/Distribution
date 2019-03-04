package typings
package mongoritoLib.mongoritoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RefreshAction extends Action {
  var `type`: ActionTypes
}

object RefreshAction {
  @scala.inline
  def apply(`type`: ActionTypes): RefreshAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[RefreshAction]
  }
}

