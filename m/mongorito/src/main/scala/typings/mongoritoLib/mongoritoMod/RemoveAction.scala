package typings
package mongoritoLib.mongoritoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoveAction extends Action {
  var `type`: ActionTypes
}

object RemoveAction {
  @scala.inline
  def apply(`type`: ActionTypes): RemoveAction = {
    val __obj = js.Dynamic.literal(`type` = `type`)
  
    __obj.asInstanceOf[RemoveAction]
  }
}

