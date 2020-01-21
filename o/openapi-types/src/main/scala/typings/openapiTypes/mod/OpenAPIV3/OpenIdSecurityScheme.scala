package typings.openapiTypes.mod.OpenAPIV3

import typings.openapiTypes.openapiTypesStrings.openIdConnect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenIdSecurityScheme extends SecuritySchemeObject {
  var description: js.UndefOr[String] = js.undefined
  var openIdConnectUrl: String
  var `type`: openIdConnect
}

object OpenIdSecurityScheme {
  @scala.inline
  def apply(openIdConnectUrl: String, `type`: openIdConnect, description: String = null): OpenIdSecurityScheme = {
    val __obj = js.Dynamic.literal(openIdConnectUrl = openIdConnectUrl.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenIdSecurityScheme]
  }
}

