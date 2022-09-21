package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChatMessageMention extends StObject {
  
  /**
    * Index of an entity being mentioned in the specified chatMessage. Matches the {index} value in the corresponding
    * &amp;lt;at id='{index}'&amp;gt; tag in the message body.
    */
  var id: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // String used to represent the mention. For example, a user's display name, a team name.
  var mentionText: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The entity (user, application, team, or channel) that was @mentioned.
  var mentioned: js.UndefOr[NullableOption[ChatMessageMentionedIdentitySet]] = js.undefined
}
object ChatMessageMention {
  
  inline def apply(): ChatMessageMention = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChatMessageMention]
  }
  
  extension [Self <: ChatMessageMention](x: Self) {
    
    inline def setId(value: NullableOption[Double]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setMentionText(value: NullableOption[String]): Self = StObject.set(x, "mentionText", value.asInstanceOf[js.Any])
    
    inline def setMentionTextNull: Self = StObject.set(x, "mentionText", null)
    
    inline def setMentionTextUndefined: Self = StObject.set(x, "mentionText", js.undefined)
    
    inline def setMentioned(value: NullableOption[ChatMessageMentionedIdentitySet]): Self = StObject.set(x, "mentioned", value.asInstanceOf[js.Any])
    
    inline def setMentionedNull: Self = StObject.set(x, "mentioned", null)
    
    inline def setMentionedUndefined: Self = StObject.set(x, "mentioned", js.undefined)
  }
}
