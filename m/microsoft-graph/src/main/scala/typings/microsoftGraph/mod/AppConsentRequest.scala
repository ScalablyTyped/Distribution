package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppConsentRequest
  extends StObject
     with Entity {
  
  // The display name of the app for which consent is requested. Required. Supports $filter (eq only) and $orderby.
  var appDisplayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The identifier of the application. Required. Supports $filter (eq only) and $orderby.
  var appId: js.UndefOr[String] = js.undefined
  
  // A list of pending scopes waiting for approval. Required.
  var pendingScopes: js.UndefOr[NullableOption[js.Array[AppConsentRequestScope]]] = js.undefined
  
  // A list of pending user consent requests. Supports $filter (eq).
  var userConsentRequests: js.UndefOr[NullableOption[js.Array[UserConsentRequest]]] = js.undefined
}
object AppConsentRequest {
  
  inline def apply(): AppConsentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppConsentRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppConsentRequest] (val x: Self) extends AnyVal {
    
    inline def setAppDisplayName(value: NullableOption[String]): Self = StObject.set(x, "appDisplayName", value.asInstanceOf[js.Any])
    
    inline def setAppDisplayNameNull: Self = StObject.set(x, "appDisplayName", null)
    
    inline def setAppDisplayNameUndefined: Self = StObject.set(x, "appDisplayName", js.undefined)
    
    inline def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    inline def setAppIdUndefined: Self = StObject.set(x, "appId", js.undefined)
    
    inline def setPendingScopes(value: NullableOption[js.Array[AppConsentRequestScope]]): Self = StObject.set(x, "pendingScopes", value.asInstanceOf[js.Any])
    
    inline def setPendingScopesNull: Self = StObject.set(x, "pendingScopes", null)
    
    inline def setPendingScopesUndefined: Self = StObject.set(x, "pendingScopes", js.undefined)
    
    inline def setPendingScopesVarargs(value: AppConsentRequestScope*): Self = StObject.set(x, "pendingScopes", js.Array(value*))
    
    inline def setUserConsentRequests(value: NullableOption[js.Array[UserConsentRequest]]): Self = StObject.set(x, "userConsentRequests", value.asInstanceOf[js.Any])
    
    inline def setUserConsentRequestsNull: Self = StObject.set(x, "userConsentRequests", null)
    
    inline def setUserConsentRequestsUndefined: Self = StObject.set(x, "userConsentRequests", js.undefined)
    
    inline def setUserConsentRequestsVarargs(value: UserConsentRequest*): Self = StObject.set(x, "userConsentRequests", js.Array(value*))
  }
}
