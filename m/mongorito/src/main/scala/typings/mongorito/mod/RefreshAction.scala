package typings.mongorito.mod

import typings.mongorito.mod.ActionTypes.REFRESH
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RefreshAction extends Action {
  var `type`: REFRESH
}

object RefreshAction {
  @scala.inline
  def apply(`type`: REFRESH): RefreshAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefreshAction]
  }
}

