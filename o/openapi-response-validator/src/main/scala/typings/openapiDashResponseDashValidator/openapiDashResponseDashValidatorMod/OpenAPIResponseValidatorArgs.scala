package typings.openapiDashResponseDashValidator.openapiDashResponseDashValidatorMod

import org.scalablytyped.runtime.StringDictionary
import typings.ajv.ajvMod.ErrorObject
import typings.ajv.ajvMod.FormatDefinition
import typings.ajv.ajvMod.FormatValidator
import typings.openapiDashResponseDashValidator.Anon_Schema
import typings.openapiDashTypes.openapiDashTypesMod.IJsonSchema
import typings.openapiDashTypes.openapiDashTypesMod.OpenAPIV3.ComponentsObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenAPIResponseValidatorArgs extends js.Object {
  var components: js.UndefOr[ComponentsObject] = js.undefined
  var customFormats: StringDictionary[FormatValidator | FormatDefinition]
  var definitions: StringDictionary[IJsonSchema]
  var errorTransformer: js.UndefOr[
    js.Function2[
      /* openAPIResponseValidatorValidationError */ OpenAPIResponseValidatorError, 
      /* ajvError */ ErrorObject, 
      _
    ]
  ] = js.undefined
  var externalSchemas: StringDictionary[IJsonSchema]
  var loggingKey: String
  var responses: StringDictionary[Anon_Schema]
}

object OpenAPIResponseValidatorArgs {
  @scala.inline
  def apply(
    customFormats: StringDictionary[FormatValidator | FormatDefinition],
    definitions: StringDictionary[IJsonSchema],
    externalSchemas: StringDictionary[IJsonSchema],
    loggingKey: String,
    responses: StringDictionary[Anon_Schema],
    components: ComponentsObject = null,
    errorTransformer: (/* openAPIResponseValidatorValidationError */ OpenAPIResponseValidatorError, /* ajvError */ ErrorObject) => _ = null
  ): OpenAPIResponseValidatorArgs = {
    val __obj = js.Dynamic.literal(customFormats = customFormats, definitions = definitions, externalSchemas = externalSchemas, loggingKey = loggingKey, responses = responses)
    if (components != null) __obj.updateDynamic("components")(components)
    if (errorTransformer != null) __obj.updateDynamic("errorTransformer")(js.Any.fromFunction2(errorTransformer))
    __obj.asInstanceOf[OpenAPIResponseValidatorArgs]
  }
}

