package typings
package openapiDashTypesLib.openapiDashTypesMod.OpenAPIV2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SecuritySchemeOauth2Application
  extends SecuritySchemeOauth2Base
     with SecuritySchemeOauth2 {
  @JSName("flow")
  var flow_SecuritySchemeOauth2Application: openapiDashTypesLib.openapiDashTypesLibStrings.application
  var tokenUrl: java.lang.String
}

object SecuritySchemeOauth2Application {
  @scala.inline
  def apply(
    flow: openapiDashTypesLib.openapiDashTypesLibStrings.application,
    scopes: ScopesObject,
    tokenUrl: java.lang.String,
    `type`: openapiDashTypesLib.openapiDashTypesLibStrings.basic | openapiDashTypesLib.openapiDashTypesLibStrings.apiKey | openapiDashTypesLib.openapiDashTypesLibStrings.oauth2,
    description: java.lang.String = null
  ): SecuritySchemeOauth2Application = {
    val __obj = js.Dynamic.literal(flow = flow, scopes = scopes, tokenUrl = tokenUrl)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description)
    __obj.asInstanceOf[SecuritySchemeOauth2Application]
  }
}

