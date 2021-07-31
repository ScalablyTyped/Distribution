package typings.openapiTypes.mod.OpenAPIV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.openapiTypes.mod.OpenAPIV2.SecuritySchemeOauth2Implicit
  - typings.openapiTypes.mod.OpenAPIV2.SecuritySchemeOauth2AccessCode
  - typings.openapiTypes.mod.OpenAPIV2.SecuritySchemeOauth2Password
  - typings.openapiTypes.mod.OpenAPIV2.SecuritySchemeOauth2Application
*/
trait SecuritySchemeOauth2
  extends StObject
     with SecuritySchemeObject
object SecuritySchemeOauth2 {
  
  @scala.inline
  def SecuritySchemeOauth2AccessCode(authorizationUrl: String, scopes: ScopesObject, tokenUrl: String): typings.openapiTypes.mod.OpenAPIV2.SecuritySchemeOauth2AccessCode = {
    val __obj = js.Dynamic.literal(authorizationUrl = authorizationUrl.asInstanceOf[js.Any], flow = "accessCode", scopes = scopes.asInstanceOf[js.Any], tokenUrl = tokenUrl.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("oauth2")
    __obj.asInstanceOf[typings.openapiTypes.mod.OpenAPIV2.SecuritySchemeOauth2AccessCode]
  }
  
  @scala.inline
  def SecuritySchemeOauth2Application(scopes: ScopesObject, tokenUrl: String): typings.openapiTypes.mod.OpenAPIV2.SecuritySchemeOauth2Application = {
    val __obj = js.Dynamic.literal(flow = "application", scopes = scopes.asInstanceOf[js.Any], tokenUrl = tokenUrl.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("oauth2")
    __obj.asInstanceOf[typings.openapiTypes.mod.OpenAPIV2.SecuritySchemeOauth2Application]
  }
  
  @scala.inline
  def SecuritySchemeOauth2Implicit(authorizationUrl: String, scopes: ScopesObject): typings.openapiTypes.mod.OpenAPIV2.SecuritySchemeOauth2Implicit = {
    val __obj = js.Dynamic.literal(authorizationUrl = authorizationUrl.asInstanceOf[js.Any], flow = "implicit", scopes = scopes.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("oauth2")
    __obj.asInstanceOf[typings.openapiTypes.mod.OpenAPIV2.SecuritySchemeOauth2Implicit]
  }
  
  @scala.inline
  def SecuritySchemeOauth2Password(scopes: ScopesObject, tokenUrl: String): typings.openapiTypes.mod.OpenAPIV2.SecuritySchemeOauth2Password = {
    val __obj = js.Dynamic.literal(flow = "password", scopes = scopes.asInstanceOf[js.Any], tokenUrl = tokenUrl.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("oauth2")
    __obj.asInstanceOf[typings.openapiTypes.mod.OpenAPIV2.SecuritySchemeOauth2Password]
  }
}
