package typings.openapiDashTypes.openapiDashTypesMod.OpenAPIV3

import typings.openapiDashTypes.openapiDashTypesStrings.openIdConnect
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
    val __obj = js.Dynamic.literal(openIdConnectUrl = openIdConnectUrl)
    __obj.updateDynamic("type")(`type`)
    if (description != null) __obj.updateDynamic("description")(description)
    __obj.asInstanceOf[OpenIdSecurityScheme]
  }
}

