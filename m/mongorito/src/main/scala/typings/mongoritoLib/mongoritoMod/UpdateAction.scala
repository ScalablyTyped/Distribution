package typings
package mongoritoLib.mongoritoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateAction extends Action {
  var fields: js.Object
  var `type`: ActionTypes
}

object UpdateAction {
  @scala.inline
  def apply(fields: js.Object, `type`: ActionTypes): UpdateAction = {
    val __obj = js.Dynamic.literal(fields = fields)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[UpdateAction]
  }
}

