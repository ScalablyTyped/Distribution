package typings.maximMazurokGapiClientServicenetworking.gapi.client.servicenetworking

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthenticationRule extends StObject {
  
  /** If true, the service accepts API keys without any other credential. This flag only applies to HTTP and gRPC requests. */
  var allowWithoutCredential: js.UndefOr[Boolean] = js.undefined
  
  /** The requirements for OAuth credentials. */
  var oauth: js.UndefOr[OAuthRequirements] = js.undefined
  
  /** Requirements for additional authentication providers. */
  var requirements: js.UndefOr[js.Array[AuthRequirement]] = js.undefined
  
  /** Selects the methods to which this rule applies. Refer to selector for syntax details. */
  var selector: js.UndefOr[String] = js.undefined
}
object AuthenticationRule {
  
  inline def apply(): AuthenticationRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthenticationRule]
  }
  
  extension [Self <: AuthenticationRule](x: Self) {
    
    inline def setAllowWithoutCredential(value: Boolean): Self = StObject.set(x, "allowWithoutCredential", value.asInstanceOf[js.Any])
    
    inline def setAllowWithoutCredentialUndefined: Self = StObject.set(x, "allowWithoutCredential", js.undefined)
    
    inline def setOauth(value: OAuthRequirements): Self = StObject.set(x, "oauth", value.asInstanceOf[js.Any])
    
    inline def setOauthUndefined: Self = StObject.set(x, "oauth", js.undefined)
    
    inline def setRequirements(value: js.Array[AuthRequirement]): Self = StObject.set(x, "requirements", value.asInstanceOf[js.Any])
    
    inline def setRequirementsUndefined: Self = StObject.set(x, "requirements", js.undefined)
    
    inline def setRequirementsVarargs(value: AuthRequirement*): Self = StObject.set(x, "requirements", js.Array(value*))
    
    inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    inline def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
  }
}
