package typings.npmlog.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessageObject extends js.Object {
  var id: Double = js.native
  var level: String = js.native
  var message: String = js.native
  var messageRaw: String = js.native
  var prefix: String = js.native
}

object MessageObject {
  @scala.inline
  def apply(id: Double, level: String, message: String, messageRaw: String, prefix: String): MessageObject = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], messageRaw = messageRaw.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageObject]
  }
  @scala.inline
  implicit class MessageObjectOps[Self <: MessageObject] (val x: Self) extends AnyVal {
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
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLevel(value: String): Self = this.set("level", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessageRaw(value: String): Self = this.set("messageRaw", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
  }
  
}

