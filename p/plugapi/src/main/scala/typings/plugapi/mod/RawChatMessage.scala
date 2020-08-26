package typings.plugapi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RawChatMessage extends js.Object {
  var cid: String = js.native
  var message: String = js.native
  var sub: Double = js.native
  var uid: Double = js.native
  var un: String = js.native
}

object RawChatMessage {
  @scala.inline
  def apply(cid: String, message: String, sub: Double, uid: Double, un: String): RawChatMessage = {
    val __obj = js.Dynamic.literal(cid = cid.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], sub = sub.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any], un = un.asInstanceOf[js.Any])
    __obj.asInstanceOf[RawChatMessage]
  }
  @scala.inline
  implicit class RawChatMessageOps[Self <: RawChatMessage] (val x: Self) extends AnyVal {
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
    def setCid(value: String): Self = this.set("cid", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setSub(value: Double): Self = this.set("sub", value.asInstanceOf[js.Any])
    @scala.inline
    def setUid(value: Double): Self = this.set("uid", value.asInstanceOf[js.Any])
    @scala.inline
    def setUn(value: String): Self = this.set("un", value.asInstanceOf[js.Any])
  }
  
}

