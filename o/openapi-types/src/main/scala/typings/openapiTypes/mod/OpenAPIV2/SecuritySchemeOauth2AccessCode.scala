package typings.openapiTypes.mod.OpenAPIV2

import typings.openapiTypes.openapiTypesStrings.accessCode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecuritySchemeOauth2AccessCode
  extends StObject
     with SecuritySchemeOauth2Base
     with SecuritySchemeOauth2 {
  
  var authorizationUrl: String
  
  @JSName("flow")
  var flow_SecuritySchemeOauth2AccessCode: accessCode
  
  var tokenUrl: String
}
object SecuritySchemeOauth2AccessCode {
  
  @scala.inline
  def apply(authorizationUrl: String, scopes: ScopesObject, tokenUrl: String): SecuritySchemeOauth2AccessCode = {
    val __obj = js.Dynamic.literal(authorizationUrl = authorizationUrl.asInstanceOf[js.Any], flow = "accessCode", scopes = scopes.asInstanceOf[js.Any], tokenUrl = tokenUrl.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("oauth2")
    __obj.asInstanceOf[SecuritySchemeOauth2AccessCode]
  }
  
  @scala.inline
  implicit class SecuritySchemeOauth2AccessCodeMutableBuilder[Self <: SecuritySchemeOauth2AccessCode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthorizationUrl(value: String): Self = StObject.set(x, "authorizationUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlow(value: accessCode): Self = StObject.set(x, "flow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokenUrl(value: String): Self = StObject.set(x, "tokenUrl", value.asInstanceOf[js.Any])
  }
}
