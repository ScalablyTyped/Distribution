package typings
package mongoritoLib.mongoritoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetAction extends Action {
  var fields: js.Object
  var `type`: mongoritoLib.mongoritoMod.ActionTypes.SET
}

object SetAction {
  @scala.inline
  def apply(fields: js.Object, `type`: mongoritoLib.mongoritoMod.ActionTypes.SET): SetAction = {
    val __obj = js.Dynamic.literal(fields = fields)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[SetAction]
  }
}

