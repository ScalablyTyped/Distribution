package typings.openapiTypes.mod.OpenAPIV2

import typings.openapiTypes.openapiTypesStrings.application
import typings.openapiTypes.openapiTypesStrings.oauth2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SecuritySchemeOauth2Application
  extends SecuritySchemeOauth2Base
     with SecuritySchemeOauth2 {
  
  @JSName("flow")
  var flow_SecuritySchemeOauth2Application: application = js.native
  
  var tokenUrl: String = js.native
}
object SecuritySchemeOauth2Application {
  
  @scala.inline
  def apply(flow: application, scopes: ScopesObject, tokenUrl: String, `type`: oauth2): SecuritySchemeOauth2Application = {
    val __obj = js.Dynamic.literal(flow = flow.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any], tokenUrl = tokenUrl.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecuritySchemeOauth2Application]
  }
  
  @scala.inline
  implicit class SecuritySchemeOauth2ApplicationMutableBuilder[Self <: SecuritySchemeOauth2Application] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFlow(value: application): Self = StObject.set(x, "flow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokenUrl(value: String): Self = StObject.set(x, "tokenUrl", value.asInstanceOf[js.Any])
  }
}
