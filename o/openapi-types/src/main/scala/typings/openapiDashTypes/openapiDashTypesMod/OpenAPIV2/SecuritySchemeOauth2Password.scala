package typings.openapiDashTypes.openapiDashTypesMod.OpenAPIV2

import typings.openapiDashTypes.openapiDashTypesStrings.apiKey
import typings.openapiDashTypes.openapiDashTypesStrings.basic
import typings.openapiDashTypes.openapiDashTypesStrings.oauth2
import typings.openapiDashTypes.openapiDashTypesStrings.password
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SecuritySchemeOauth2Password
  extends SecuritySchemeOauth2Base
     with SecuritySchemeOauth2 {
  @JSName("flow")
  var flow_SecuritySchemeOauth2Password: password
  var tokenUrl: String
}

object SecuritySchemeOauth2Password {
  @scala.inline
  def apply(
    flow: password,
    scopes: ScopesObject,
    tokenUrl: String,
    `type`: basic | apiKey | oauth2,
    description: String = null
  ): SecuritySchemeOauth2Password = {
    val __obj = js.Dynamic.literal(flow = flow.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any], tokenUrl = tokenUrl.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecuritySchemeOauth2Password]
  }
}

