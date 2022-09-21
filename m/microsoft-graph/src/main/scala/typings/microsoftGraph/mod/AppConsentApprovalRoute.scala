package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppConsentApprovalRoute
  extends StObject
     with Entity {
  
  // A collection of userConsentRequest objects for a specific application.
  var appConsentRequests: js.UndefOr[NullableOption[js.Array[AppConsentRequest]]] = js.undefined
}
object AppConsentApprovalRoute {
  
  inline def apply(): AppConsentApprovalRoute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppConsentApprovalRoute]
  }
  
  extension [Self <: AppConsentApprovalRoute](x: Self) {
    
    inline def setAppConsentRequests(value: NullableOption[js.Array[AppConsentRequest]]): Self = StObject.set(x, "appConsentRequests", value.asInstanceOf[js.Any])
    
    inline def setAppConsentRequestsNull: Self = StObject.set(x, "appConsentRequests", null)
    
    inline def setAppConsentRequestsUndefined: Self = StObject.set(x, "appConsentRequests", js.undefined)
    
    inline def setAppConsentRequestsVarargs(value: AppConsentRequest*): Self = StObject.set(x, "appConsentRequests", js.Array(value*))
  }
}
