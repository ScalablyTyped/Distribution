package typings.openapiTypes.mod.OpenAPIV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.openapiTypes.mod.OpenAPIV2.SecuritySchemeBasic
  - typings.openapiTypes.mod.OpenAPIV2.SecuritySchemeApiKey
  - typings.openapiTypes.mod.OpenAPIV2.SecuritySchemeOauth2
*/
trait SecuritySchemeObject extends StObject
object SecuritySchemeObject {
  
  inline def SecuritySchemeApiKey(in: String, name: String): typings.openapiTypes.mod.OpenAPIV2.SecuritySchemeApiKey = {
    val __obj = js.Dynamic.literal(in = in.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("apiKey")
    __obj.asInstanceOf[typings.openapiTypes.mod.OpenAPIV2.SecuritySchemeApiKey]
  }
  
  inline def SecuritySchemeBasic(): typings.openapiTypes.mod.OpenAPIV2.SecuritySchemeBasic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("basic")
    __obj.asInstanceOf[typings.openapiTypes.mod.OpenAPIV2.SecuritySchemeBasic]
  }
  
  inline def SecuritySchemeOauth2AccessCode(authorizationUrl: String, scopes: ScopesObject, tokenUrl: String): typings.openapiTypes.mod.OpenAPIV2.SecuritySchemeOauth2AccessCode = {
    val __obj = js.Dynamic.literal(authorizationUrl = authorizationUrl.asInstanceOf[js.Any], flow = "accessCode", scopes = scopes.asInstanceOf[js.Any], tokenUrl = tokenUrl.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("oauth2")
    __obj.asInstanceOf[typings.openapiTypes.mod.OpenAPIV2.SecuritySchemeOauth2AccessCode]
  }
  
  inline def SecuritySchemeOauth2Application(scopes: ScopesObject, tokenUrl: String): typings.openapiTypes.mod.OpenAPIV2.SecuritySchemeOauth2Application = {
    val __obj = js.Dynamic.literal(flow = "application", scopes = scopes.asInstanceOf[js.Any], tokenUrl = tokenUrl.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("oauth2")
    __obj.asInstanceOf[typings.openapiTypes.mod.OpenAPIV2.SecuritySchemeOauth2Application]
  }
  
  inline def SecuritySchemeOauth2Implicit(authorizationUrl: String, scopes: ScopesObject): typings.openapiTypes.mod.OpenAPIV2.SecuritySchemeOauth2Implicit = {
    val __obj = js.Dynamic.literal(authorizationUrl = authorizationUrl.asInstanceOf[js.Any], flow = "implicit", scopes = scopes.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("oauth2")
    __obj.asInstanceOf[typings.openapiTypes.mod.OpenAPIV2.SecuritySchemeOauth2Implicit]
  }
  
  inline def SecuritySchemeOauth2Password(scopes: ScopesObject, tokenUrl: String): typings.openapiTypes.mod.OpenAPIV2.SecuritySchemeOauth2Password = {
    val __obj = js.Dynamic.literal(flow = "password", scopes = scopes.asInstanceOf[js.Any], tokenUrl = tokenUrl.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("oauth2")
    __obj.asInstanceOf[typings.openapiTypes.mod.OpenAPIV2.SecuritySchemeOauth2Password]
  }
}
