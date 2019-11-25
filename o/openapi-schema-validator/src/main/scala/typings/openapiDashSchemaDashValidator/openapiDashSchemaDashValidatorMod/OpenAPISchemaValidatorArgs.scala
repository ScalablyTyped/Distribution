package typings.openapiDashSchemaDashValidator.openapiDashSchemaDashValidatorMod

import typings.openapiDashTypes.openapiDashTypesMod.IJsonSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenAPISchemaValidatorArgs extends js.Object {
  var extensions: js.UndefOr[IJsonSchema] = js.undefined
  var version: Double | String
}

object OpenAPISchemaValidatorArgs {
  @scala.inline
  def apply(version: Double | String, extensions: IJsonSchema = null): OpenAPISchemaValidatorArgs = {
    val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenAPISchemaValidatorArgs]
  }
}

