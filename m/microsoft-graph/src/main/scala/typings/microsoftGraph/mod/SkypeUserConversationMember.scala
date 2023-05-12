package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SkypeUserConversationMember
  extends StObject
     with ConversationMember {
  
  // Skype ID of the user.
  var skypeId: js.UndefOr[NullableOption[String]] = js.undefined
}
object SkypeUserConversationMember {
  
  inline def apply(): SkypeUserConversationMember = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SkypeUserConversationMember]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SkypeUserConversationMember] (val x: Self) extends AnyVal {
    
    inline def setSkypeId(value: NullableOption[String]): Self = StObject.set(x, "skypeId", value.asInstanceOf[js.Any])
    
    inline def setSkypeIdNull: Self = StObject.set(x, "skypeId", null)
    
    inline def setSkypeIdUndefined: Self = StObject.set(x, "skypeId", js.undefined)
  }
}
