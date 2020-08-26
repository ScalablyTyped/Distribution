package typings.mpvScript.mp

import typings.mpvScript.mpvScriptStrings.down
import typings.mpvScript.mpvScriptStrings.press
import typings.mpvScript.mpvScriptStrings.repeat
import typings.mpvScript.mpvScriptStrings.up
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddKeyBindingFlags extends js.Object {
  var complex: js.UndefOr[Boolean] = js.native
  var event: js.UndefOr[down | repeat | up | press] = js.native
  var is_mouse: js.UndefOr[Boolean] = js.native
  var key_name: js.UndefOr[String] = js.native
  var key_text: js.UndefOr[String] = js.native
  var repeatable: js.UndefOr[Boolean] = js.native
}

object AddKeyBindingFlags {
  @scala.inline
  def apply(): AddKeyBindingFlags = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddKeyBindingFlags]
  }
  @scala.inline
  implicit class AddKeyBindingFlagsOps[Self <: AddKeyBindingFlags] (val x: Self) extends AnyVal {
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
    def setComplex(value: Boolean): Self = this.set("complex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComplex: Self = this.set("complex", js.undefined)
    @scala.inline
    def setEvent(value: down | repeat | up | press): Self = this.set("event", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvent: Self = this.set("event", js.undefined)
    @scala.inline
    def setIs_mouse(value: Boolean): Self = this.set("is_mouse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIs_mouse: Self = this.set("is_mouse", js.undefined)
    @scala.inline
    def setKey_name(value: String): Self = this.set("key_name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey_name: Self = this.set("key_name", js.undefined)
    @scala.inline
    def setKey_text(value: String): Self = this.set("key_text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey_text: Self = this.set("key_text", js.undefined)
    @scala.inline
    def setRepeatable(value: Boolean): Self = this.set("repeatable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRepeatable: Self = this.set("repeatable", js.undefined)
  }
  
}

