package typings.nwGui.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShortcutOption extends js.Object {
  var active: js.Function = js.native
  var failed: js.Function = js.native
  var key: String = js.native
}

object ShortcutOption {
  @scala.inline
  def apply(active: js.Function, failed: js.Function, key: String): ShortcutOption = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], failed = failed.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShortcutOption]
  }
  @scala.inline
  implicit class ShortcutOptionOps[Self <: ShortcutOption] (val x: Self) extends AnyVal {
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
    def setActive(value: js.Function): Self = this.set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def setFailed(value: js.Function): Self = this.set("failed", value.asInstanceOf[js.Any])
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
  }
  
}

