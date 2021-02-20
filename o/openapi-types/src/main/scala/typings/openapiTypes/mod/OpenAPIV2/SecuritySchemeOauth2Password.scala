package typings.openapiTypes.mod.OpenAPIV2

import typings.openapiTypes.openapiTypesStrings.oauth2
import typings.openapiTypes.openapiTypesStrings.password
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SecuritySchemeOauth2Password
  extends SecuritySchemeOauth2Base
     with SecuritySchemeOauth2 {
  
  @JSName("flow")
  var flow_SecuritySchemeOauth2Password: password = js.native
  
  var tokenUrl: String = js.native
}
object SecuritySchemeOauth2Password {
  
  @scala.inline
  def apply(flow: password, scopes: ScopesObject, tokenUrl: String, `type`: oauth2): SecuritySchemeOauth2Password = {
    val __obj = js.Dynamic.literal(flow = flow.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any], tokenUrl = tokenUrl.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecuritySchemeOauth2Password]
  }
  
  @scala.inline
  implicit class SecuritySchemeOauth2PasswordMutableBuilder[Self <: SecuritySchemeOauth2Password] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFlow(value: password): Self = StObject.set(x, "flow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokenUrl(value: String): Self = StObject.set(x, "tokenUrl", value.asInstanceOf[js.Any])
  }
}
