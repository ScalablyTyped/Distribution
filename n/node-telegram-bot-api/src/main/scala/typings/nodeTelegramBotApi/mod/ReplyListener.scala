package typings.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplyListener extends StObject {
  
  def callback(msg: Message): Unit
  
  var chatId: Double | String
  
  var id: Double
  
  var messageId: Double | String
}
object ReplyListener {
  
  @scala.inline
  def apply(callback: Message => Unit, chatId: Double | String, id: Double, messageId: Double | String): ReplyListener = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction1(callback), chatId = chatId.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], messageId = messageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplyListener]
  }
  
  @scala.inline
  implicit class ReplyListenerMutableBuilder[Self <: ReplyListener] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCallback(value: Message => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChatId(value: Double | String): Self = StObject.set(x, "chatId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageId(value: Double | String): Self = StObject.set(x, "messageId", value.asInstanceOf[js.Any])
  }
}
