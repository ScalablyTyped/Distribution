package typings
package mongoritoLib.mongoritoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SaveAction extends Action {
  var fields: js.Object
  var `type`: ActionTypes
}

object SaveAction {
  @scala.inline
  def apply(fields: js.Object, `type`: ActionTypes): SaveAction = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("fields")(fields)
    __obj.asInstanceOf[SaveAction]
  }
}

