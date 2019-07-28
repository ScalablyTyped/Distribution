package typings.openapiDashTypes.openapiDashTypesMod.OpenAPIV3Ns

import typings.openapiDashTypes.openapiDashTypesStrings.apiKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApiKeySecurityScheme extends SecuritySchemeObject {
  var description: js.UndefOr[String] = js.undefined
  var in: String
  var name: String
  var `type`: apiKey
}

object ApiKeySecurityScheme {
  @scala.inline
  def apply(in: String, name: String, `type`: apiKey, description: String = null): ApiKeySecurityScheme = {
    val __obj = js.Dynamic.literal(in = in, name = name)
    __obj.updateDynamic("type")(`type`)
    if (description != null) __obj.updateDynamic("description")(description)
    __obj.asInstanceOf[ApiKeySecurityScheme]
  }
}

