package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChatMessageMentionedIdentitySet
  extends StObject
     with IdentitySet {
  
  // If present, represents a conversation (for example, team or channel) @mentioned in a message.
  var conversation: js.UndefOr[NullableOption[TeamworkConversationIdentity]] = js.undefined
}
object ChatMessageMentionedIdentitySet {
  
  inline def apply(): ChatMessageMentionedIdentitySet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChatMessageMentionedIdentitySet]
  }
  
  extension [Self <: ChatMessageMentionedIdentitySet](x: Self) {
    
    inline def setConversation(value: NullableOption[TeamworkConversationIdentity]): Self = StObject.set(x, "conversation", value.asInstanceOf[js.Any])
    
    inline def setConversationNull: Self = StObject.set(x, "conversation", null)
    
    inline def setConversationUndefined: Self = StObject.set(x, "conversation", js.undefined)
  }
}
