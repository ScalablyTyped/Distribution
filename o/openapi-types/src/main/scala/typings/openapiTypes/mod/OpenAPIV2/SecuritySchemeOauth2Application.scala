package typings.openapiTypes.mod.OpenAPIV2

import typings.openapiTypes.openapiTypesStrings.application
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecuritySchemeOauth2Application
  extends StObject
     with SecuritySchemeOauth2Base
     with SecuritySchemeOauth2 {
  
  @JSName("flow")
  var flow_SecuritySchemeOauth2Application: application
  
  var tokenUrl: String
}
object SecuritySchemeOauth2Application {
  
  inline def apply(scopes: ScopesObject, tokenUrl: String): SecuritySchemeOauth2Application = {
    val __obj = js.Dynamic.literal(flow = "application", scopes = scopes.asInstanceOf[js.Any], tokenUrl = tokenUrl.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("oauth2")
    __obj.asInstanceOf[SecuritySchemeOauth2Application]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SecuritySchemeOauth2Application] (val x: Self) extends AnyVal {
    
    inline def setFlow(value: application): Self = StObject.set(x, "flow", value.asInstanceOf[js.Any])
    
    inline def setTokenUrl(value: String): Self = StObject.set(x, "tokenUrl", value.asInstanceOf[js.Any])
  }
}
