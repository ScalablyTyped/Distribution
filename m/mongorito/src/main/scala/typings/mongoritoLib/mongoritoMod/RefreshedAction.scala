package typings
package mongoritoLib.mongoritoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RefreshedAction extends Action {
  var fields: js.Object
  var `type`: ActionTypes
}

object RefreshedAction {
  @scala.inline
  def apply(fields: js.Object, `type`: ActionTypes): RefreshedAction = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("fields")(fields)
    __obj.asInstanceOf[RefreshedAction]
  }
}

