package typings
package mongoritoLib.mongoritoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateAction extends Action {
  var id: js.Object
  var `type`: ActionTypes
}

object CreateAction {
  @scala.inline
  def apply(id: js.Object, `type`: ActionTypes): CreateAction = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[CreateAction]
  }
}

