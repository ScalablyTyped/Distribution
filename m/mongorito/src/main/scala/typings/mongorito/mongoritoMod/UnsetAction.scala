package typings.mongorito.mongoritoMod

import typings.mongorito.mongoritoMod.ActionTypes.UNSET
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnsetAction extends Action {
  var keys: String | js.Array[String]
  var `type`: UNSET
}

object UnsetAction {
  @scala.inline
  def apply(keys: String | js.Array[String], `type`: UNSET): UnsetAction = {
    val __obj = js.Dynamic.literal(keys = keys.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[UnsetAction]
  }
}

