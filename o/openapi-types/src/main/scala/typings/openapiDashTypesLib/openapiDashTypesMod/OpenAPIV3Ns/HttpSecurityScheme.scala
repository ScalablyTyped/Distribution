package typings
package openapiDashTypesLib.openapiDashTypesMod.OpenAPIV3Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpSecurityScheme extends SecuritySchemeObject {
  var bearerFormat: js.UndefOr[java.lang.String] = js.undefined
  var description: js.UndefOr[java.lang.String] = js.undefined
  var scheme: java.lang.String
  var `type`: openapiDashTypesLib.openapiDashTypesLibStrings.http
}

object HttpSecurityScheme {
  @scala.inline
  def apply(
    scheme: java.lang.String,
    `type`: openapiDashTypesLib.openapiDashTypesLibStrings.http,
    bearerFormat: java.lang.String = null,
    description: java.lang.String = null
  ): HttpSecurityScheme = {
    val __obj = js.Dynamic.literal(scheme = scheme)
    __obj.updateDynamic("type")(`type`)
    if (bearerFormat != null) __obj.updateDynamic("bearerFormat")(bearerFormat)
    if (description != null) __obj.updateDynamic("description")(description)
    __obj.asInstanceOf[HttpSecurityScheme]
  }
}

