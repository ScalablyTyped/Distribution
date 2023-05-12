package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChatMembersNotificationRecipient
  extends StObject
     with TeamworkNotificationRecipient {
  
  // The unique identifier for the chat whose members should receive the notifications.
  var chatId: js.UndefOr[String] = js.undefined
}
object ChatMembersNotificationRecipient {
  
  inline def apply(): ChatMembersNotificationRecipient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChatMembersNotificationRecipient]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChatMembersNotificationRecipient] (val x: Self) extends AnyVal {
    
    inline def setChatId(value: String): Self = StObject.set(x, "chatId", value.asInstanceOf[js.Any])
    
    inline def setChatIdUndefined: Self = StObject.set(x, "chatId", js.undefined)
  }
}
