package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MicrosoftAccountUserConversationMember
  extends StObject
     with ConversationMember {
  
  // Microsoft Account ID of the user.
  var userId: js.UndefOr[NullableOption[String]] = js.undefined
}
object MicrosoftAccountUserConversationMember {
  
  inline def apply(): MicrosoftAccountUserConversationMember = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MicrosoftAccountUserConversationMember]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MicrosoftAccountUserConversationMember] (val x: Self) extends AnyVal {
    
    inline def setUserId(value: NullableOption[String]): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    inline def setUserIdNull: Self = StObject.set(x, "userId", null)
    
    inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
  }
}
