package typings.mediumEditor.MediumEditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyboardCommandOptions extends js.Object {
  var alt: Boolean = js.native
  var command: String = js.native
  var key: String = js.native
  var meta: Boolean = js.native
  var shift: Boolean = js.native
}

object KeyboardCommandOptions {
  @scala.inline
  def apply(alt: Boolean, command: String, key: String, meta: Boolean, shift: Boolean): KeyboardCommandOptions = {
    val __obj = js.Dynamic.literal(alt = alt.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], shift = shift.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyboardCommandOptions]
  }
  @scala.inline
  implicit class KeyboardCommandOptionsOps[Self <: KeyboardCommandOptions] (val x: Self) extends AnyVal {
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
    def setAlt(value: Boolean): Self = this.set("alt", value.asInstanceOf[js.Any])
    @scala.inline
    def setCommand(value: String): Self = this.set("command", value.asInstanceOf[js.Any])
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setMeta(value: Boolean): Self = this.set("meta", value.asInstanceOf[js.Any])
    @scala.inline
    def setShift(value: Boolean): Self = this.set("shift", value.asInstanceOf[js.Any])
  }
  
}

