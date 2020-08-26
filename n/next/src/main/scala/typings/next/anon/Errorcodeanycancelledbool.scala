package typings.next.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Error & {  code :any,   cancelled :boolean} */
@js.native
trait Errorcodeanycancelledbool extends js.Object {
  var cancelled: Boolean = js.native
  var code: js.Any = js.native
  var message: String = js.native
  var name: String = js.native
  var stack: js.UndefOr[String] = js.native
}

object Errorcodeanycancelledbool {
  @scala.inline
  def apply(cancelled: Boolean, code: js.Any, message: String, name: String): Errorcodeanycancelledbool = {
    val __obj = js.Dynamic.literal(cancelled = cancelled.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Errorcodeanycancelledbool]
  }
  @scala.inline
  implicit class ErrorcodeanycancelledboolOps[Self <: Errorcodeanycancelledbool] (val x: Self) extends AnyVal {
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
    def setCancelled(value: Boolean): Self = this.set("cancelled", value.asInstanceOf[js.Any])
    @scala.inline
    def setCode(value: js.Any): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setStack(value: String): Self = this.set("stack", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStack: Self = this.set("stack", js.undefined)
  }
  
}

