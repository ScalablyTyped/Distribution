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
  - typings.openapiDashTypes.openapiDashTypesMod.OpenAPIV2.SecuritySchemeOauth2Implicit
  - typings.openapiDashTypes.openapiDashTypesMod.OpenAPIV2.SecuritySchemeOauth2AccessCode
  - typings.openapiDashTypes.openapiDashTypesMod.OpenAPIV2.SecuritySchemeOauth2Password
  - typings.openapiDashTypes.openapiDashTypesMod.OpenAPIV2.SecuritySchemeOauth2Application
*/
trait SecuritySchemeOauth2 extends SecuritySchemeObject

object SecuritySchemeOauth2 {
  @scala.inline
  def SecuritySchemeOauth2Implicit(
    authorizationUrl: String,
    flow: `implicit`,
    scopes: ScopesObject,
    `type`: basic | apiKey | oauth2,
    description: String = null
  ): SecuritySchemeOauth2 = {
    val __obj = js.Dynamic.literal(authorizationUrl = authorizationUrl.asInstanceOf[js.Any], flow = flow.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecuritySchemeOauth2]
  }
  @scala.inline
  def SecuritySchemeOauth2AccessCode(
    authorizationUrl: String,
    flow: accessCode,
    scopes: ScopesObject,
    tokenUrl: String,
    `type`: basic | apiKey | oauth2,
    description: String = null
  ): SecuritySchemeOauth2 = {
    val __obj = js.Dynamic.literal(authorizationUrl = authorizationUrl.asInstanceOf[js.Any], flow = flow.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any], tokenUrl = tokenUrl.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecuritySchemeOauth2]
  }
  @scala.inline
  def SecuritySchemeOauth2Password(
    flow: password,
    scopes: ScopesObject,
    tokenUrl: String,
    `type`: basic | apiKey | oauth2,
    description: String = null
  ): SecuritySchemeOauth2 = {
    val __obj = js.Dynamic.literal(flow = flow.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any], tokenUrl = tokenUrl.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecuritySchemeOauth2]
  }
  @scala.inline
  def SecuritySchemeOauth2Application(
    flow: application,
    scopes: ScopesObject,
    tokenUrl: String,
    `type`: basic | apiKey | oauth2,
    description: String = null
  ): SecuritySchemeOauth2 = {
    val __obj = js.Dynamic.literal(flow = flow.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any], tokenUrl = tokenUrl.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecuritySchemeOauth2]
  }
}

