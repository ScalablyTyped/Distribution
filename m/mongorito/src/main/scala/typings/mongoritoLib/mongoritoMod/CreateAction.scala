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
    val __obj = js.Dynamic.literal(id = id)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[CreateAction]
  }
}

