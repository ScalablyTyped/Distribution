package typings.openapiTypes.mod.OpenAPIV3

import typings.openapiTypes.openapiTypesStrings.apiKey
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
    val __obj = js.Dynamic.literal(in = in.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApiKeySecurityScheme]
  }
}

