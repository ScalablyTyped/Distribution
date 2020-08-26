package typings.plugapi.mod.Event

import typings.plugapi.mod.User.DJ
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DJListUpdate extends js.Object {
  var djs: js.Array[DJ] = js.native
  var remove: String = js.native
}

object DJListUpdate {
  @scala.inline
  def apply(djs: js.Array[DJ], remove: String): DJListUpdate = {
    val __obj = js.Dynamic.literal(djs = djs.asInstanceOf[js.Any], remove = remove.asInstanceOf[js.Any])
    __obj.asInstanceOf[DJListUpdate]
  }
  @scala.inline
  implicit class DJListUpdateOps[Self <: DJListUpdate] (val x: Self) extends AnyVal {
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
    def setDjsVarargs(value: DJ*): Self = this.set("djs", js.Array(value :_*))
    @scala.inline
    def setDjs(value: js.Array[DJ]): Self = this.set("djs", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemove(value: String): Self = this.set("remove", value.asInstanceOf[js.Any])
  }
  
}

