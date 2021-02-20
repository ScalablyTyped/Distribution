package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChatMessageMention extends StObject {
  
  /**
    * Index of an entity being mentioned in the specified chatMessage. Matches the {index} value in the corresponding
    * &amp;lt;at id='{index}'&amp;gt; tag in the message body.
    */
  var id: js.UndefOr[NullableOption[Double]] = js.native
  
  // String used to represent the mention. For example, a user's display name, a team name.
  var mentionText: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * The entity (user, application, team, or channel) that was mentioned. If it was a channel or team that was @mentioned,
    * the identitySet contains a conversation property giving the ID of the team/channel, and a conversationIdentityType
    * property that represents either the team or channel.
    */
  var mentioned: js.UndefOr[NullableOption[IdentitySet]] = js.native
}
object ChatMessageMention {
  
  @scala.inline
  def apply(): ChatMessageMention = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChatMessageMention]
  }
  
  @scala.inline
  implicit class ChatMessageMentionMutableBuilder[Self <: ChatMessageMention] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: NullableOption[Double]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdNull: Self = StObject.set(x, "id", null)
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setMentionText(value: NullableOption[String]): Self = StObject.set(x, "mentionText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMentionTextNull: Self = StObject.set(x, "mentionText", null)
    
    @scala.inline
    def setMentionTextUndefined: Self = StObject.set(x, "mentionText", js.undefined)
    
    @scala.inline
    def setMentioned(value: NullableOption[IdentitySet]): Self = StObject.set(x, "mentioned", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMentionedNull: Self = StObject.set(x, "mentioned", null)
    
    @scala.inline
    def setMentionedUndefined: Self = StObject.set(x, "mentioned", js.undefined)
  }
}
