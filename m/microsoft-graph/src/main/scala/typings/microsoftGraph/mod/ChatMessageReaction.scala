package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChatMessageReaction extends StObject {
  
  /**
    * The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example,
    * midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
    */
  var createdDateTime: js.UndefOr[String] = js.undefined
  
  // Supported values are like, angry, sad, laugh, heart, surprised.
  var reactionType: js.UndefOr[String] = js.undefined
  
  // The user who reacted to the message.
  var user: js.UndefOr[ChatMessageReactionIdentitySet] = js.undefined
}
object ChatMessageReaction {
  
  inline def apply(): ChatMessageReaction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChatMessageReaction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChatMessageReaction] (val x: Self) extends AnyVal {
    
    inline def setCreatedDateTime(value: String): Self = StObject.set(x, "createdDateTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedDateTimeUndefined: Self = StObject.set(x, "createdDateTime", js.undefined)
    
    inline def setReactionType(value: String): Self = StObject.set(x, "reactionType", value.asInstanceOf[js.Any])
    
    inline def setReactionTypeUndefined: Self = StObject.set(x, "reactionType", js.undefined)
    
    inline def setUser(value: ChatMessageReactionIdentitySet): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
  }
}
