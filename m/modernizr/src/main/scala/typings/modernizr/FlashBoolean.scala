package typings.modernizr

import typings.std.Boolean
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlashBoolean extends Boolean {
  var blocked: scala.Boolean = js.native
}

object FlashBoolean {
  @scala.inline
  def apply(blocked: scala.Boolean): FlashBoolean = {
    val __obj = js.Dynamic.literal(blocked = blocked.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlashBoolean]
  }
  @scala.inline
  implicit class FlashBooleanOps[Self <: FlashBoolean] (val x: Self) extends AnyVal {
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
    def setBlocked(value: scala.Boolean): Self = this.set("blocked", value.asInstanceOf[js.Any])
  }
  
}

