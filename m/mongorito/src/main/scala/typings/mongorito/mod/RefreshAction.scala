package typings.mongorito.mod

import typings.mongorito.mod.ActionTypes.REFRESH
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RefreshAction extends Action {
  var `type`: REFRESH = js.native
}

object RefreshAction {
  @scala.inline
  def apply(`type`: REFRESH): RefreshAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefreshAction]
  }
  @scala.inline
  implicit class RefreshActionOps[Self <: RefreshAction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setType(value: REFRESH): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

