package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AadUserConversationMemberResult
  extends StObject
     with ActionResultPart {
  
  var userId: js.UndefOr[NullableOption[String]] = js.undefined
}
object AadUserConversationMemberResult {
  
  inline def apply(): AadUserConversationMemberResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AadUserConversationMemberResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AadUserConversationMemberResult] (val x: Self) extends AnyVal {
    
    inline def setUserId(value: NullableOption[String]): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    inline def setUserIdNull: Self = StObject.set(x, "userId", null)
    
    inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
  }
}
