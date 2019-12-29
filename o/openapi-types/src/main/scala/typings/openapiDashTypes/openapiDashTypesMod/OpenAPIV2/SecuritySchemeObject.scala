package typings.openapiDashTypes.openapiDashTypesMod.OpenAPIV2

import typings.openapiDashTypes.openapiDashTypesStrings.`implicit`
import typings.openapiDashTypes.openapiDashTypesStrings.accessCode
import typings.openapiDashTypes.openapiDashTypesStrings.apiKey
import typings.openapiDashTypes.openapiDashTypesStrings.application
import typings.openapiDashTypes.openapiDashTypesStrings.basic
import typings.openapiDashTypes.openapiDashTypesStrings.oauth2
import typings.openapiDashTypes.openapiDashTypesStrings.password
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.openapiDashTypes.openapiDashTypesMod.OpenAPIV2.SecuritySchemeBasic
  - typings.openapiDashTypes.openapiDashTypesMod.OpenAPIV2.SecuritySchemeApiKey
  - typings.openapiDashTypes.openapiDashTypesMod.OpenAPIV2.SecuritySchemeOauth2
*/
trait SecuritySchemeObject extends js.Object

object SecuritySchemeObject {
  @scala.inline
  def SecuritySchemeOauth2Password(
    flow: password,
    scopes: ScopesObject,
    tokenUrl: String,
    `type`: basic | apiKey | oauth2,
    description: String = null
  ): SecuritySchemeObject = {
    val __obj = js.Dynamic.literal(flow = flow.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any], tokenUrl = tokenUrl.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecuritySchemeObject]
  }
  @scala.inline
  def SecuritySchemeOauth2Implicit(
    authorizationUrl: String,
    flow: `implicit`,
    scopes: ScopesObject,
    `type`: basic | apiKey | oauth2,
    description: String = null
  ): SecuritySchemeObject = {
    val __obj = js.Dynamic.literal(authorizationUrl = authorizationUrl.asInstanceOf[js.Any], flow = flow.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecuritySchemeObject]
  }
  @scala.inline
  def SecuritySchemeOauth2Application(
    flow: application,
    scopes: ScopesObject,
    tokenUrl: String,
    `type`: basic | apiKey | oauth2,
    description: String = null
  ): SecuritySchemeObject = {
    val __obj = js.Dynamic.literal(flow = flow.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any], tokenUrl = tokenUrl.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecuritySchemeObject]
  }
  @scala.inline
  def SecuritySchemeApiKey(in: String, name: String, `type`: apiKey, description: String = null): SecuritySchemeObject = {
    val __obj = js.Dynamic.literal(in = in.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecuritySchemeObject]
  }
  @scala.inline
  def SecuritySchemeBasic(`type`: basic, description: String = null): SecuritySchemeObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecuritySchemeObject]
  }
  @scala.inline
  def SecuritySchemeOauth2AccessCode(
    authorizationUrl: String,
    flow: accessCode,
    scopes: ScopesObject,
    tokenUrl: String,
    `type`: basic | apiKey | oauth2,
    description: String = null
  ): SecuritySchemeObject = {
    val __obj = js.Dynamic.literal(authorizationUrl = authorizationUrl.asInstanceOf[js.Any], flow = flow.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any], tokenUrl = tokenUrl.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecuritySchemeObject]
  }
}

