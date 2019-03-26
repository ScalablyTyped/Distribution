package typings
package openapiDashTypesLib.openapiDashTypesMod.OpenAPIV3Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenIdSecurityScheme extends SecuritySchemeObject {
  var description: js.UndefOr[java.lang.String] = js.undefined
  var openIdConnectUrl: java.lang.String
  var `type`: openapiDashTypesLib.openapiDashTypesLibStrings.openIdConnect
}

object OpenIdSecurityScheme {
  @scala.inline
  def apply(
    openIdConnectUrl: java.lang.String,
    `type`: openapiDashTypesLib.openapiDashTypesLibStrings.openIdConnect,
    description: java.lang.String = null
  ): OpenIdSecurityScheme = {
    val __obj = js.Dynamic.literal(openIdConnectUrl = openIdConnectUrl)
    __obj.updateDynamic("type")(`type`)
    if (description != null) __obj.updateDynamic("description")(description)
    __obj.asInstanceOf[OpenIdSecurityScheme]
  }
}

