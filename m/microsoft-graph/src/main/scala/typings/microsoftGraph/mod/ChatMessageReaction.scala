package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChatMessageReaction extends StObject {
  
  var createdDateTime: js.UndefOr[String] = js.undefined
  
  var reactionType: js.UndefOr[String] = js.undefined
  
  var user: js.UndefOr[IdentitySet] = js.undefined
}
object ChatMessageReaction {
  
  inline def apply(): ChatMessageReaction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChatMessageReaction]
  }
  
  extension [Self <: ChatMessageReaction](x: Self) {
    
    inline def setCreatedDateTime(value: String): Self = StObject.set(x, "createdDateTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedDateTimeUndefined: Self = StObject.set(x, "createdDateTime", js.undefined)
    
    inline def setReactionType(value: String): Self = StObject.set(x, "reactionType", value.asInstanceOf[js.Any])
    
    inline def setReactionTypeUndefined: Self = StObject.set(x, "reactionType", js.undefined)
    
    inline def setUser(value: IdentitySet): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
  }
}
