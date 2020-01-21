package typings.openapiRequestValidator.mod

import org.scalablytyped.runtime.StringDictionary
import typings.ajv.mod.ErrorObject
import typings.ajv.mod.FormatDefinition
import typings.ajv.mod.FormatValidator
import typings.openapiTypes.mod.IJsonSchema
import typings.openapiTypes.mod.OpenAPI.Parameters
import typings.openapiTypes.mod.OpenAPIV3.RequestBodyObject
import typings.tsLog.mod.Logger
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
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    if (componentSchemas != null) __obj.updateDynamic("componentSchemas")(componentSchemas.asInstanceOf[js.Any])
    if (customFormats != null) __obj.updateDynamic("customFormats")(customFormats.asInstanceOf[js.Any])
    if (errorTransformer != null) __obj.updateDynamic("errorTransformer")(js.Any.fromFunction2(errorTransformer))
    if (externalSchemas != null) __obj.updateDynamic("externalSchemas")(externalSchemas.asInstanceOf[js.Any])
    if (logger != null) __obj.updateDynamic("logger")(logger.asInstanceOf[js.Any])
    if (loggingKey != null) __obj.updateDynamic("loggingKey")(loggingKey.asInstanceOf[js.Any])
    if (requestBody != null) __obj.updateDynamic("requestBody")(requestBody.asInstanceOf[js.Any])
    if (schemas != null) __obj.updateDynamic("schemas")(schemas.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenAPIRequestValidatorArgs]
  }
}

