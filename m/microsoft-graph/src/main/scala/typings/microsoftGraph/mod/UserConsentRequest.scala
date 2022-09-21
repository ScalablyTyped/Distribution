package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserConsentRequest
  extends StObject
     with Request {
  
  // Approval decisions associated with a request.
  var approval: js.UndefOr[NullableOption[Approval]] = js.undefined
  
  // The user's justification for requiring access to the app. Supports $filter (eq only) and $orderby.
  var reason: js.UndefOr[NullableOption[String]] = js.undefined
}
object UserConsentRequest {
  
  inline def apply(): UserConsentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserConsentRequest]
  }
  
  extension [Self <: UserConsentRequest](x: Self) {
    
    inline def setApproval(value: NullableOption[Approval]): Self = StObject.set(x, "approval", value.asInstanceOf[js.Any])
    
    inline def setApprovalNull: Self = StObject.set(x, "approval", null)
    
    inline def setApprovalUndefined: Self = StObject.set(x, "approval", js.undefined)
    
    inline def setReason(value: NullableOption[String]): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonNull: Self = StObject.set(x, "reason", null)
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
  }
}
