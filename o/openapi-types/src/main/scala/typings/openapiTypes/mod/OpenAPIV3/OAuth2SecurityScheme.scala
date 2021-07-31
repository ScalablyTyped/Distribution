package typings.openapiTypes.mod.OpenAPIV3

import typings.openapiTypes.anon.AuthorizationCode
import typings.openapiTypes.openapiTypesStrings.oauth2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OAuth2SecurityScheme
  extends StObject
     with SecuritySchemeObject {
  
  var flows: AuthorizationCode
  
  var `type`: oauth2
}
object OAuth2SecurityScheme {
  
  @scala.inline
  def apply(flows: AuthorizationCode): OAuth2SecurityScheme = {
    val __obj = js.Dynamic.literal(flows = flows.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("oauth2")
    __obj.asInstanceOf[OAuth2SecurityScheme]
  }
  
  @scala.inline
  implicit class OAuth2SecuritySchemeMutableBuilder[Self <: OAuth2SecurityScheme] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFlows(value: AuthorizationCode): Self = StObject.set(x, "flows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: oauth2): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
