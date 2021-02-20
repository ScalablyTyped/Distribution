package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChatMessageReaction extends StObject {
  
  var createdDateTime: js.UndefOr[String] = js.native
  
  var reactionType: js.UndefOr[String] = js.native
  
  var user: js.UndefOr[IdentitySet] = js.native
}
object ChatMessageReaction {
  
  @scala.inline
  def apply(): ChatMessageReaction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChatMessageReaction]
  }
  
  @scala.inline
  implicit class ChatMessageReactionMutableBuilder[Self <: ChatMessageReaction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreatedDateTime(value: String): Self = StObject.set(x, "createdDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedDateTimeUndefined: Self = StObject.set(x, "createdDateTime", js.undefined)
    
    @scala.inline
    def setReactionType(value: String): Self = StObject.set(x, "reactionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReactionTypeUndefined: Self = StObject.set(x, "reactionType", js.undefined)
    
    @scala.inline
    def setUser(value: IdentitySet): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
  }
}
