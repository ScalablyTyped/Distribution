package typings.openapiTypes.mod.OpenAPIV2

import typings.openapiTypes.openapiTypesStrings.`implicit`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecuritySchemeOauth2Implicit
  extends StObject
     with SecuritySchemeOauth2Base
     with SecuritySchemeOauth2 {
  
  var authorizationUrl: String
  
  @JSName("flow")
  var flow_SecuritySchemeOauth2Implicit: `implicit`
}
object SecuritySchemeOauth2Implicit {
  
  inline def apply(authorizationUrl: String, scopes: ScopesObject): SecuritySchemeOauth2Implicit = {
    val __obj = js.Dynamic.literal(authorizationUrl = authorizationUrl.asInstanceOf[js.Any], flow = "implicit", scopes = scopes.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("oauth2")
    __obj.asInstanceOf[SecuritySchemeOauth2Implicit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SecuritySchemeOauth2Implicit] (val x: Self) extends AnyVal {
    
    inline def setAuthorizationUrl(value: String): Self = StObject.set(x, "authorizationUrl", value.asInstanceOf[js.Any])
    
    inline def setFlow(value: `implicit`): Self = StObject.set(x, "flow", value.asInstanceOf[js.Any])
  }
}
