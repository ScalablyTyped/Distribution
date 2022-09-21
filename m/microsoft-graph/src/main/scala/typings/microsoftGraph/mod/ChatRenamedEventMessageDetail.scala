package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChatRenamedEventMessageDetail
  extends StObject
     with EventMessageDetail {
  
  // The updated name of the chat.
  var chatDisplayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Unique identifier of the chat.
  var chatId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Initiator of the event.
  var initiator: js.UndefOr[NullableOption[IdentitySet]] = js.undefined
}
object ChatRenamedEventMessageDetail {
  
  inline def apply(): ChatRenamedEventMessageDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChatRenamedEventMessageDetail]
  }
  
  extension [Self <: ChatRenamedEventMessageDetail](x: Self) {
    
    inline def setChatDisplayName(value: NullableOption[String]): Self = StObject.set(x, "chatDisplayName", value.asInstanceOf[js.Any])
    
    inline def setChatDisplayNameNull: Self = StObject.set(x, "chatDisplayName", null)
    
    inline def setChatDisplayNameUndefined: Self = StObject.set(x, "chatDisplayName", js.undefined)
    
    inline def setChatId(value: NullableOption[String]): Self = StObject.set(x, "chatId", value.asInstanceOf[js.Any])
    
    inline def setChatIdNull: Self = StObject.set(x, "chatId", null)
    
    inline def setChatIdUndefined: Self = StObject.set(x, "chatId", js.undefined)
    
    inline def setInitiator(value: NullableOption[IdentitySet]): Self = StObject.set(x, "initiator", value.asInstanceOf[js.Any])
    
    inline def setInitiatorNull: Self = StObject.set(x, "initiator", null)
    
    inline def setInitiatorUndefined: Self = StObject.set(x, "initiator", js.undefined)
  }
}
