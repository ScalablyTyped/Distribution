package typings
package openapiDashTypesLib.openapiDashTypesMod.OpenAPIV3Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApiKeySecurityScheme extends SecuritySchemeObject {
  var description: js.UndefOr[java.lang.String] = js.undefined
  var in: java.lang.String
  var name: java.lang.String
  var `type`: openapiDashTypesLib.openapiDashTypesLibStrings.apiKey
}

object ApiKeySecurityScheme {
  @scala.inline
  def apply(
    in: java.lang.String,
    name: java.lang.String,
    `type`: openapiDashTypesLib.openapiDashTypesLibStrings.apiKey,
    description: java.lang.String = null
  ): ApiKeySecurityScheme = {
    val __obj = js.Dynamic.literal(in = in, name = name)
    __obj.updateDynamic("type")(`type`)
    if (description != null) __obj.updateDynamic("description")(description)
    __obj.asInstanceOf[ApiKeySecurityScheme]
  }
}

