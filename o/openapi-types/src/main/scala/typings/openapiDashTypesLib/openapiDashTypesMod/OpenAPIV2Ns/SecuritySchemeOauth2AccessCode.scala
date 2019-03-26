package typings
package openapiDashTypesLib.openapiDashTypesMod.OpenAPIV2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SecuritySchemeOauth2AccessCode
  extends SecuritySchemeOauth2Base
     with SecuritySchemeOauth2 {
  var authorizationUrl: java.lang.String
  @JSName("flow")
  var flow_SecuritySchemeOauth2AccessCode: openapiDashTypesLib.openapiDashTypesLibStrings.accessCode
  var tokenUrl: java.lang.String
}

object SecuritySchemeOauth2AccessCode {
  @scala.inline
  def apply(
    authorizationUrl: java.lang.String,
    flow: openapiDashTypesLib.openapiDashTypesLibStrings.accessCode,
    scopes: ScopesObject,
    tokenUrl: java.lang.String,
    `type`: openapiDashTypesLib.openapiDashTypesLibStrings.basic | openapiDashTypesLib.openapiDashTypesLibStrings.apiKey | openapiDashTypesLib.openapiDashTypesLibStrings.oauth2,
    description: java.lang.String = null
  ): SecuritySchemeOauth2AccessCode = {
    val __obj = js.Dynamic.literal(authorizationUrl = authorizationUrl, flow = flow, scopes = scopes, tokenUrl = tokenUrl)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description)
    __obj.asInstanceOf[SecuritySchemeOauth2AccessCode]
  }
}

