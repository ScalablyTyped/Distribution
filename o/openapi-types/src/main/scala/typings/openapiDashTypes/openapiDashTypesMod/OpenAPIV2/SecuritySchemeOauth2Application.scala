package typings.openapiDashTypes.openapiDashTypesMod.OpenAPIV2

import typings.openapiDashTypes.openapiDashTypesStrings.apiKey
import typings.openapiDashTypes.openapiDashTypesStrings.application
import typings.openapiDashTypes.openapiDashTypesStrings.basic
import typings.openapiDashTypes.openapiDashTypesStrings.oauth2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SecuritySchemeOauth2Application
  extends SecuritySchemeOauth2Base
     with SecuritySchemeOauth2 {
  @JSName("flow")
  var flow_SecuritySchemeOauth2Application: application
  var tokenUrl: String
}

object SecuritySchemeOauth2Application {
  @scala.inline
  def apply(
    flow: application,
    scopes: ScopesObject,
    tokenUrl: String,
    `type`: basic | apiKey | oauth2,
    description: String = null
  ): SecuritySchemeOauth2Application = {
    val __obj = js.Dynamic.literal(flow = flow, scopes = scopes, tokenUrl = tokenUrl)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description)
    __obj.asInstanceOf[SecuritySchemeOauth2Application]
  }
}

