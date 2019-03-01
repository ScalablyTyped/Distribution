package typings
package mongoritoLib.mongoritoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateIndexAction extends Action {
  var args: js.Array[_]
  var `type`: ActionTypes
}

object CreateIndexAction {
  @scala.inline
  def apply(args: js.Array[_], `type`: ActionTypes): CreateIndexAction = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("args")(args)
    __obj.asInstanceOf[CreateIndexAction]
  }
}

