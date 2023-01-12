package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TeamworkConversationIdentity
  extends StObject
     with Identity {
  
  // Type of conversation. Possible values are: team, channel, chat, and unknownFutureValue.
  var conversationIdentityType: js.UndefOr[NullableOption[TeamworkConversationIdentityType]] = js.undefined
}
object TeamworkConversationIdentity {
  
  inline def apply(): TeamworkConversationIdentity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TeamworkConversationIdentity]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TeamworkConversationIdentity] (val x: Self) extends AnyVal {
    
    inline def setConversationIdentityType(value: NullableOption[TeamworkConversationIdentityType]): Self = StObject.set(x, "conversationIdentityType", value.asInstanceOf[js.Any])
    
    inline def setConversationIdentityTypeNull: Self = StObject.set(x, "conversationIdentityType", null)
    
    inline def setConversationIdentityTypeUndefined: Self = StObject.set(x, "conversationIdentityType", js.undefined)
  }
}
