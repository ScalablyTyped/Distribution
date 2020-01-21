package typings.openapiTypes.mod.OpenAPIV3

import typings.openapiTypes.openapiTypesStrings.http
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpSecurityScheme extends SecuritySchemeObject {
  var bearerFormat: js.UndefOr[String] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var scheme: String
  var `type`: http
}

object HttpSecurityScheme {
  @scala.inline
  def apply(scheme: String, `type`: http, bearerFormat: String = null, description: String = null): HttpSecurityScheme = {
    val __obj = js.Dynamic.literal(scheme = scheme.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (bearerFormat != null) __obj.updateDynamic("bearerFormat")(bearerFormat.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpSecurityScheme]
  }
}

