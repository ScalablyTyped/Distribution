package typings.nodeDashTelegramDashBotDashApi.nodeDashTelegramDashBotDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReplyListener extends js.Object {
  var chatId: Double | String
  var id: Double
  var messageId: Double | String
  def callback(msg: Message): Unit
}

object ReplyListener {
  @scala.inline
  def apply(callback: Message => Unit, chatId: Double | String, id: Double, messageId: Double | String): ReplyListener = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction1(callback), chatId = chatId.asInstanceOf[js.Any], id = id, messageId = messageId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReplyListener]
  }
}

