package typings.openapiDashRequestDashValidator.openapiDashRequestDashValidatorMod

import org.scalablytyped.runtime.StringDictionary
import typings.ajv.ajvMod.ErrorObject
import typings.ajv.ajvMod.FormatDefinition
import typings.ajv.ajvMod.FormatValidator
import typings.openapiDashTypes.openapiDashTypesMod.IJsonSchema
import typings.openapiDashTypes.openapiDashTypesMod.OpenAPI.Parameters
import typings.openapiDashTypes.openapiDashTypesMod.OpenAPIV3.RequestBodyObject
import typings.tsDashLog.tsDashLogMod.Logger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenAPIRequestValidatorArgs extends js.Object {
  var componentSchemas: js.UndefOr[js.Array[IJsonSchema]] = js.undefined
  var customFormats: js.UndefOr[StringDictionary[FormatValidator | FormatDefinition]] = js.undefined
  var errorTransformer: js.UndefOr[
    js.Function2[
      /* openAPIResponseValidatorValidationError */ OpenAPIRequestValidatorError, 
      /* ajvError */ ErrorObject, 
      _
    ]
  ] = js.undefined
  var externalSchemas: js.UndefOr[StringDictionary[IJsonSchema]] = js.undefined
  var logger: js.UndefOr[Logger] = js.undefined
  var loggingKey: js.UndefOr[String] = js.undefined
  var parameters: Parameters
  var requestBody: js.UndefOr[RequestBodyObject] = js.undefined
  var schemas: js.UndefOr[js.Array[IJsonSchema]] = js.undefined
}

object OpenAPIRequestValidatorArgs {
  @scala.inline
  def apply(
    parameters: Parameters,
    componentSchemas: js.Array[IJsonSchema] = null,
    customFormats: StringDictionary[FormatValidator | FormatDefinition] = null,
    errorTransformer: (/* openAPIResponseValidatorValidationError */ OpenAPIRequestValidatorError, /* ajvError */ ErrorObject) => _ = null,
    externalSchemas: StringDictionary[IJsonSchema] = null,
    logger: Logger = null,
    loggingKey: String = null,
    requestBody: RequestBodyObject = null,
    schemas: js.Array[IJsonSchema] = null
  ): OpenAPIRequestValidatorArgs = {
    val __obj = js.Dynamic.literal(parameters = parameters)
    if (componentSchemas != null) __obj.updateDynamic("componentSchemas")(componentSchemas)
    if (customFormats != null) __obj.updateDynamic("customFormats")(customFormats)
    if (errorTransformer != null) __obj.updateDynamic("errorTransformer")(js.Any.fromFunction2(errorTransformer))
    if (externalSchemas != null) __obj.updateDynamic("externalSchemas")(externalSchemas)
    if (logger != null) __obj.updateDynamic("logger")(logger)
    if (loggingKey != null) __obj.updateDynamic("loggingKey")(loggingKey)
    if (requestBody != null) __obj.updateDynamic("requestBody")(requestBody)
    if (schemas != null) __obj.updateDynamic("schemas")(schemas)
    __obj.asInstanceOf[OpenAPIRequestValidatorArgs]
  }
}

