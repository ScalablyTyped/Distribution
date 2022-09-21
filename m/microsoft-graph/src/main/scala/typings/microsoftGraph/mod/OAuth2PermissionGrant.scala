package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OAuth2PermissionGrant
  extends StObject
     with Entity {
  
  /**
    * The id of the client service principal for the application which is authorized to act on behalf of a signed-in user
    * when accessing an API. Required. Supports $filter (eq only).
    */
  var clientId: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates if authorization is granted for the client application to impersonate all users or only a specific user.
    * AllPrincipals indicates authorization to impersonate all users. Principal indicates authorization to impersonate a
    * specific user. Consent on behalf of all users can be granted by an administrator. Non-admin users may be authorized to
    * consent on behalf of themselves in some cases, for some delegated permissions. Required. Supports $filter (eq only).
    */
  var consentType: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * The id of the user on behalf of whom the client is authorized to access the resource, when consentType is Principal. If
    * consentType is AllPrincipals this value is null. Required when consentType is Principal. Supports $filter (eq only).
    */
  var principalId: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * The id of the resource service principal to which access is authorized. This identifies the API which the client is
    * authorized to attempt to call on behalf of a signed-in user. Supports $filter (eq only).
    */
  var resourceId: js.UndefOr[String] = js.undefined
  
  /**
    * A space-separated list of the claim values for delegated permissions which should be included in access tokens for the
    * resource application (the API). For example, openid User.Read GroupMember.Read.All. Each claim value should match the
    * value field of one of the delegated permissions defined by the API, listed in the oauth2PermissionScopes property of
    * the resource service principal.
    */
  var scope: js.UndefOr[NullableOption[String]] = js.undefined
}
object OAuth2PermissionGrant {
  
  inline def apply(): OAuth2PermissionGrant = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OAuth2PermissionGrant]
  }
  
  extension [Self <: OAuth2PermissionGrant](x: Self) {
    
    inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    inline def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
    
    inline def setConsentType(value: NullableOption[String]): Self = StObject.set(x, "consentType", value.asInstanceOf[js.Any])
    
    inline def setConsentTypeNull: Self = StObject.set(x, "consentType", null)
    
    inline def setConsentTypeUndefined: Self = StObject.set(x, "consentType", js.undefined)
    
    inline def setPrincipalId(value: NullableOption[String]): Self = StObject.set(x, "principalId", value.asInstanceOf[js.Any])
    
    inline def setPrincipalIdNull: Self = StObject.set(x, "principalId", null)
    
    inline def setPrincipalIdUndefined: Self = StObject.set(x, "principalId", js.undefined)
    
    inline def setResourceId(value: String): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
    
    inline def setResourceIdUndefined: Self = StObject.set(x, "resourceId", js.undefined)
    
    inline def setScope(value: NullableOption[String]): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeNull: Self = StObject.set(x, "scope", null)
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
  }
}
