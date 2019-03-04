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
    val __obj = js.Dynamic.literal(fields = fields)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[RefreshedAction]
  }
}

