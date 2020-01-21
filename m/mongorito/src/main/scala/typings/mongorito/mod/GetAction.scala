package typings.mongorito.mod

import typings.mongorito.mod.ActionTypes.GET
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetAction extends Action {
  var key: js.UndefOr[String] = js.undefined
  var `type`: GET
}

object GetAction {
  @scala.inline
  def apply(`type`: GET, key: String = null): GetAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAction]
  }
}

