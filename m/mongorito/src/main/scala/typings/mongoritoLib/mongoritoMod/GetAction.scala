package typings
package mongoritoLib.mongoritoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetAction extends Action {
  var key: js.UndefOr[java.lang.String] = js.undefined
  var `type`: mongoritoLib.mongoritoMod.ActionTypes.GET
}

object GetAction {
  @scala.inline
  def apply(`type`: mongoritoLib.mongoritoMod.ActionTypes.GET, key: java.lang.String = null): GetAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (key != null) __obj.updateDynamic("key")(key)
    __obj.asInstanceOf[GetAction]
  }
}

