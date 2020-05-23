package typings.openapiTypes.mod.OpenAPIV3

import typings.openapiTypes.anon.AuthorizationCode
import typings.openapiTypes.openapiTypesStrings.oauth2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OAuth2SecurityScheme extends SecuritySchemeObject {
  var flows: AuthorizationCode
  var `type`: oauth2
}

object OAuth2SecurityScheme {
  @scala.inline
  def apply(flows: AuthorizationCode, `type`: oauth2): OAuth2SecurityScheme = {
    val __obj = js.Dynamic.literal(flows = flows.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OAuth2SecurityScheme]
  }
}

