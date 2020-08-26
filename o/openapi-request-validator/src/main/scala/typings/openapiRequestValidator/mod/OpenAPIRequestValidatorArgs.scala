package typings.openapiRequestValidator.mod

import org.scalablytyped.runtime.StringDictionary
import typings.ajv.mod.ErrorObject
import typings.ajv.mod.FormatDefinition
import typings.ajv.mod.FormatValidator
import typings.openapiTypes.mod.IJsonSchema
import typings.openapiTypes.mod.OpenAPI.Parameters
import typings.openapiTypes.mod.OpenAPIV2.Parameter
import typings.openapiTypes.mod.OpenAPIV3.ParameterObject
import typings.openapiTypes.mod.OpenAPIV3.ReferenceObject
import typings.openapiTypes.mod.OpenAPIV3.RequestBodyObject
import typings.tsLog.mod.Logger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpenAPIRequestValidatorArgs extends js.Object {
  var componentSchemas: js.UndefOr[js.Array[IJsonSchema]] = js.native
  var customFormats: js.UndefOr[StringDictionary[FormatValidator | FormatDefinition]] = js.native
  var errorTransformer: js.UndefOr[
    js.Function2[
      /* openAPIResponseValidatorValidationError */ OpenAPIRequestValidatorError, 
      /* ajvError */ ErrorObject, 
      _
    ]
  ] = js.native
  var externalSchemas: js.UndefOr[StringDictionary[IJsonSchema]] = js.native
  var logger: js.UndefOr[Logger] = js.native
  var loggingKey: js.UndefOr[String] = js.native
  var parameters: Parameters = js.native
  var requestBody: js.UndefOr[RequestBodyObject] = js.native
  var schemas: js.UndefOr[js.Array[IJsonSchema]] = js.native
}

object OpenAPIRequestValidatorArgs {
  @scala.inline
  def apply(parameters: Parameters): OpenAPIRequestValidatorArgs = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenAPIRequestValidatorArgs]
  }
  @scala.inline
  implicit class OpenAPIRequestValidatorArgsOps[Self <: OpenAPIRequestValidatorArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setParametersVarargs(
      value: (Parameter | ParameterObject | ReferenceObject | typings.openapiTypes.mod.OpenAPIV2.ReferenceObject)*
    ): Self = this.set("parameters", js.Array(value :_*))
    @scala.inline
    def setParameters(value: Parameters): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setComponentSchemasVarargs(value: IJsonSchema*): Self = this.set("componentSchemas", js.Array(value :_*))
    @scala.inline
    def setComponentSchemas(value: js.Array[IJsonSchema]): Self = this.set("componentSchemas", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComponentSchemas: Self = this.set("componentSchemas", js.undefined)
    @scala.inline
    def setCustomFormats(value: StringDictionary[FormatValidator | FormatDefinition]): Self = this.set("customFormats", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomFormats: Self = this.set("customFormats", js.undefined)
    @scala.inline
    def setErrorTransformer(
      value: (/* openAPIResponseValidatorValidationError */ OpenAPIRequestValidatorError, /* ajvError */ ErrorObject) => _
    ): Self = this.set("errorTransformer", js.Any.fromFunction2(value))
    @scala.inline
    def deleteErrorTransformer: Self = this.set("errorTransformer", js.undefined)
    @scala.inline
    def setExternalSchemas(value: StringDictionary[IJsonSchema]): Self = this.set("externalSchemas", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExternalSchemas: Self = this.set("externalSchemas", js.undefined)
    @scala.inline
    def setLogger(value: Logger): Self = this.set("logger", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogger: Self = this.set("logger", js.undefined)
    @scala.inline
    def setLoggingKey(value: String): Self = this.set("loggingKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoggingKey: Self = this.set("loggingKey", js.undefined)
    @scala.inline
    def setRequestBody(value: RequestBodyObject): Self = this.set("requestBody", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestBody: Self = this.set("requestBody", js.undefined)
    @scala.inline
    def setSchemasVarargs(value: IJsonSchema*): Self = this.set("schemas", js.Array(value :_*))
    @scala.inline
    def setSchemas(value: js.Array[IJsonSchema]): Self = this.set("schemas", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSchemas: Self = this.set("schemas", js.undefined)
  }
  
}

