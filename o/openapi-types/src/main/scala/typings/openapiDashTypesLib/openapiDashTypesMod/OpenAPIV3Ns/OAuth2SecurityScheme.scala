package typings
package openapiDashTypesLib.openapiDashTypesMod.OpenAPIV3Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OAuth2SecurityScheme extends SecuritySchemeObject {
  var flows: openapiDashTypesLib.Anon_AuthorizationCode
  var `type`: openapiDashTypesLib.openapiDashTypesLibStrings.oauth2
}

object OAuth2SecurityScheme {
  @scala.inline
  def apply(
    flows: openapiDashTypesLib.Anon_AuthorizationCode,
    `type`: openapiDashTypesLib.openapiDashTypesLibStrings.oauth2
  ): OAuth2SecurityScheme = {
    val __obj = js.Dynamic.literal(flows = flows)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[OAuth2SecurityScheme]
  }
}

