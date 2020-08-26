package typings.openapiTypes.mod.OpenAPIV2

import typings.openapiTypes.openapiTypesStrings.`implicit`
import typings.openapiTypes.openapiTypesStrings.accessCode
import typings.openapiTypes.openapiTypesStrings.apiKey
import typings.openapiTypes.openapiTypesStrings.application
import typings.openapiTypes.openapiTypesStrings.basic
import typings.openapiTypes.openapiTypesStrings.oauth2
import typings.openapiTypes.openapiTypesStrings.password
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.openapiTypes.mod.OpenAPIV2.SecuritySchemeBasic
  - typings.openapiTypes.mod.OpenAPIV2.SecuritySchemeApiKey
  - typings.openapiTypes.mod.OpenAPIV2.SecuritySchemeOauth2
*/
trait SecuritySchemeObject extends js.Object

object SecuritySchemeObject {
  @scala.inline
  def SecuritySchemeOauth2Password(flow: password, scopes: ScopesObject, tokenUrl: String, `type`: oauth2): SecuritySchemeObject = {
    val __obj = js.Dynamic.literal(flow = flow.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any], tokenUrl = tokenUrl.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecuritySchemeObject]
  }
  @scala.inline
  def SecuritySchemeApiKey(in: String, name: String, `type`: apiKey): SecuritySchemeObject = {
    val __obj = js.Dynamic.literal(in = in.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecuritySchemeObject]
  }
  @scala.inline
  def SecuritySchemeBasic(`type`: basic): SecuritySchemeObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecuritySchemeObject]
  }
  @scala.inline
  def SecuritySchemeOauth2Application(flow: application, scopes: ScopesObject, tokenUrl: String, `type`: oauth2): SecuritySchemeObject = {
    val __obj = js.Dynamic.literal(flow = flow.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any], tokenUrl = tokenUrl.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecuritySchemeObject]
  }
  @scala.inline
  def SecuritySchemeOauth2AccessCode(authorizationUrl: String, flow: accessCode, scopes: ScopesObject, tokenUrl: String, `type`: oauth2): SecuritySchemeObject = {
    val __obj = js.Dynamic.literal(authorizationUrl = authorizationUrl.asInstanceOf[js.Any], flow = flow.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any], tokenUrl = tokenUrl.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecuritySchemeObject]
  }
  @scala.inline
  def SecuritySchemeOauth2Implicit(authorizationUrl: String, flow: `implicit`, scopes: ScopesObject, `type`: oauth2): SecuritySchemeObject = {
    val __obj = js.Dynamic.literal(authorizationUrl = authorizationUrl.asInstanceOf[js.Any], flow = flow.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecuritySchemeObject]
  }
}

