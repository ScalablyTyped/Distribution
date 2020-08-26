package typings.nodeTelegramBotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReplyListener extends js.Object {
  var chatId: Double | String = js.native
  var id: Double = js.native
  var messageId: Double | String = js.native
  def callback(msg: Message): Unit = js.native
}

object ReplyListener {
  @scala.inline
  def apply(callback: Message => Unit, chatId: Double | String, id: Double, messageId: Double | String): ReplyListener = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction1(callback), chatId = chatId.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], messageId = messageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplyListener]
  }
  @scala.inline
  implicit class ReplyListenerOps[Self <: ReplyListener] (val x: Self) extends AnyVal {
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
    def setCallback(value: Message => Unit): Self = this.set("callback", js.Any.fromFunction1(value))
    @scala.inline
    def setChatId(value: Double | String): Self = this.set("chatId", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessageId(value: Double | String): Self = this.set("messageId", value.asInstanceOf[js.Any])
  }
  
}

