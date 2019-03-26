package typings
package openapiDashTypesLib.openapiDashTypesMod.OpenAPIV2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SecuritySchemeOauth2Implicit
  extends SecuritySchemeOauth2Base
     with SecuritySchemeOauth2 {
  var authorizationUrl: java.lang.String
  @JSName("flow")
  var flow_SecuritySchemeOauth2Implicit: openapiDashTypesLib.openapiDashTypesLibStrings.`implicit`
}

object SecuritySchemeOauth2Implicit {
  @scala.inline
  def apply(
    authorizationUrl: java.lang.String,
    flow: openapiDashTypesLib.openapiDashTypesLibStrings.`implicit`,
    scopes: ScopesObject,
    `type`: openapiDashTypesLib.openapiDashTypesLibStrings.basic | openapiDashTypesLib.openapiDashTypesLibStrings.apiKey | openapiDashTypesLib.openapiDashTypesLibStrings.oauth2,
    description: java.lang.String = null
  ): SecuritySchemeOauth2Implicit = {
    val __obj = js.Dynamic.literal(authorizationUrl = authorizationUrl, flow = flow, scopes = scopes)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description)
    __obj.asInstanceOf[SecuritySchemeOauth2Implicit]
  }
}

