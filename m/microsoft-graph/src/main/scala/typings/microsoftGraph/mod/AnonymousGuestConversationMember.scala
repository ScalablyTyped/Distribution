package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnonymousGuestConversationMember
  extends StObject
     with ConversationMember {
  
  /**
    * Unique ID that represents the user. Note: This ID can change if the user leaves and rejoins the meeting, or joins from
    * a different device.
    */
  var anonymousGuestId: js.UndefOr[NullableOption[String]] = js.undefined
}
object AnonymousGuestConversationMember {
  
  inline def apply(): AnonymousGuestConversationMember = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonymousGuestConversationMember]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnonymousGuestConversationMember] (val x: Self) extends AnyVal {
    
    inline def setAnonymousGuestId(value: NullableOption[String]): Self = StObject.set(x, "anonymousGuestId", value.asInstanceOf[js.Any])
    
    inline def setAnonymousGuestIdNull: Self = StObject.set(x, "anonymousGuestId", null)
    
    inline def setAnonymousGuestIdUndefined: Self = StObject.set(x, "anonymousGuestId", js.undefined)
  }
}
