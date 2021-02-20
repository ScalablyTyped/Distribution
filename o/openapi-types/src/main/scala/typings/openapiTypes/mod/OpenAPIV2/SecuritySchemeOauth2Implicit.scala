package typings.openapiTypes.mod.OpenAPIV2

import typings.openapiTypes.openapiTypesStrings.`implicit`
import typings.openapiTypes.openapiTypesStrings.oauth2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SecuritySchemeOauth2Implicit
  extends SecuritySchemeOauth2Base
     with SecuritySchemeOauth2 {
  
  var authorizationUrl: String = js.native
  
  @JSName("flow")
  var flow_SecuritySchemeOauth2Implicit: `implicit` = js.native
}
object SecuritySchemeOauth2Implicit {
  
  @scala.inline
  def apply(authorizationUrl: String, flow: `implicit`, scopes: ScopesObject, `type`: oauth2): SecuritySchemeOauth2Implicit = {
    val __obj = js.Dynamic.literal(authorizationUrl = authorizationUrl.asInstanceOf[js.Any], flow = flow.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecuritySchemeOauth2Implicit]
  }
  
  @scala.inline
  implicit class SecuritySchemeOauth2ImplicitMutableBuilder[Self <: SecuritySchemeOauth2Implicit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthorizationUrl(value: String): Self = StObject.set(x, "authorizationUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlow(value: `implicit`): Self = StObject.set(x, "flow", value.asInstanceOf[js.Any])
  }
}
