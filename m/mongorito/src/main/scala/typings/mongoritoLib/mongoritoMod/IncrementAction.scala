package typings
package mongoritoLib.mongoritoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IncrementAction extends Action {
  var fields: js.Object
  var `type`: mongoritoLib.mongoritoMod.ActionTypes.INCREMENT
}

object IncrementAction {
  @scala.inline
  def apply(fields: js.Object, `type`: mongoritoLib.mongoritoMod.ActionTypes.INCREMENT): IncrementAction = {
    val __obj = js.Dynamic.literal(fields = fields)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IncrementAction]
  }
}

