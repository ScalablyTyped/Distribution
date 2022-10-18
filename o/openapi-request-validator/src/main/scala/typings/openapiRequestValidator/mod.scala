package typings.openapiRequestValidator

import org.scalablytyped.runtime.StringDictionary
import typings.ajv.distCoreMod.Options
import typings.ajv.distTypesMod.ErrorObject
import typings.ajv.distTypesMod.Format
import typings.ajv.distTypesMod.FormatDefinition
import typings.ajv.distTypesMod.KeywordDefinition
import typings.openapiTypes.mod.IJsonSchema
import typings.openapiTypes.mod.OpenAPI.Parameters
import typings.openapiTypes.mod.OpenAPI.Request
import typings.openapiTypes.mod.OpenAPIV2.Parameter
import typings.openapiTypes.mod.OpenAPIV3.RequestBodyObject
import typings.openapiTypes.mod.OpenAPIV31.ParameterObject
import typings.openapiTypes.mod.OpenAPIV31.ReferenceObject
import typings.std.Record
import typings.tsLog.mod.Logger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("openapi-request-validator", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with OpenAPIRequestValidator {
    def this(args: OpenAPIRequestValidatorArgs) = this()
    
    /* private */ /* CompleteClass */
    var addSchemaProperties: Any = js.native
    
    /* private */ /* CompleteClass */
    var bodySchema: Any = js.native
    
    /* private */ /* CompleteClass */
    var enableHeadersLowercase: Any = js.native
    
    /* private */ /* CompleteClass */
    var errorMapper: Any = js.native
    
    /* private */ /* CompleteClass */
    var isBodyRequired: Any = js.native
    
    /* private */ /* CompleteClass */
    var logger: Any = js.native
    
    /* private */ /* CompleteClass */
    var loggingKey: Any = js.native
    
    /* private */ /* CompleteClass */
    var requestBody: Any = js.native
    
    /* private */ /* CompleteClass */
    var requestBodyValidators: Any = js.native
    
    /* CompleteClass */
    override def validate(request: Any): Unit = js.native
    
    /* private */ /* CompleteClass */
    var validateBody: Any = js.native
    
    /* private */ /* CompleteClass */
    var validateFormData: Any = js.native
    
    /* private */ /* CompleteClass */
    var validateHeaders: Any = js.native
    
    /* private */ /* CompleteClass */
    var validatePath: Any = js.native
    
    /* private */ /* CompleteClass */
    var validateQuery: Any = js.native
    
    /* CompleteClass */
    override def validateRequest(request: Any): Any = js.native
    /* CompleteClass */
    override def validateRequest(request: Request): Any = js.native
  }
  
  trait IOpenAPIRequestValidator extends StObject {
    
    def validateRequest(request: Request): Any
  }
  object IOpenAPIRequestValidator {
    
    inline def apply(validateRequest: Request => Any): IOpenAPIRequestValidator = {
      val __obj = js.Dynamic.literal(validateRequest = js.Any.fromFunction1(validateRequest))
      __obj.asInstanceOf[IOpenAPIRequestValidator]
    }
    
    extension [Self <: IOpenAPIRequestValidator](x: Self) {
      
      inline def setValidateRequest(value: Request => Any): Self = StObject.set(x, "validateRequest", js.Any.fromFunction1(value))
    }
  }
  
  trait OpenAPIRequestValidator
    extends StObject
       with IOpenAPIRequestValidator {
    
    /* private */ var addSchemaProperties: Any
    
    /* private */ var bodySchema: Any
    
    /* private */ var enableHeadersLowercase: Any
    
    /* private */ var errorMapper: Any
    
    /* private */ var isBodyRequired: Any
    
    /* private */ var logger: Any
    
    /* private */ var loggingKey: Any
    
    /* private */ var requestBody: Any
    
    /* private */ var requestBodyValidators: Any
    
    def validate(request: Any): Unit
    
    /* private */ var validateBody: Any
    
    /* private */ var validateFormData: Any
    
    /* private */ var validateHeaders: Any
    
    /* private */ var validatePath: Any
    
    /* private */ var validateQuery: Any
    
    def validateRequest(request: Any): Any
  }
  object OpenAPIRequestValidator {
    
    inline def apply(
      addSchemaProperties: Any,
      bodySchema: Any,
      enableHeadersLowercase: Any,
      errorMapper: Any,
      isBodyRequired: Any,
      logger: Any,
      loggingKey: Any,
      requestBody: Any,
      requestBodyValidators: Any,
      validate: Any => Unit,
      validateBody: Any,
      validateFormData: Any,
      validateHeaders: Any,
      validatePath: Any,
      validateQuery: Any,
      validateRequest: Any => Any
    ): OpenAPIRequestValidator = {
      val __obj = js.Dynamic.literal(addSchemaProperties = addSchemaProperties.asInstanceOf[js.Any], bodySchema = bodySchema.asInstanceOf[js.Any], enableHeadersLowercase = enableHeadersLowercase.asInstanceOf[js.Any], errorMapper = errorMapper.asInstanceOf[js.Any], isBodyRequired = isBodyRequired.asInstanceOf[js.Any], logger = logger.asInstanceOf[js.Any], loggingKey = loggingKey.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], requestBodyValidators = requestBodyValidators.asInstanceOf[js.Any], validate = js.Any.fromFunction1(validate), validateBody = validateBody.asInstanceOf[js.Any], validateFormData = validateFormData.asInstanceOf[js.Any], validateHeaders = validateHeaders.asInstanceOf[js.Any], validatePath = validatePath.asInstanceOf[js.Any], validateQuery = validateQuery.asInstanceOf[js.Any], validateRequest = js.Any.fromFunction1(validateRequest))
      __obj.asInstanceOf[OpenAPIRequestValidator]
    }
    
    extension [Self <: OpenAPIRequestValidator](x: Self) {
      
      inline def setAddSchemaProperties(value: Any): Self = StObject.set(x, "addSchemaProperties", value.asInstanceOf[js.Any])
      
      inline def setBodySchema(value: Any): Self = StObject.set(x, "bodySchema", value.asInstanceOf[js.Any])
      
      inline def setEnableHeadersLowercase(value: Any): Self = StObject.set(x, "enableHeadersLowercase", value.asInstanceOf[js.Any])
      
      inline def setErrorMapper(value: Any): Self = StObject.set(x, "errorMapper", value.asInstanceOf[js.Any])
      
      inline def setIsBodyRequired(value: Any): Self = StObject.set(x, "isBodyRequired", value.asInstanceOf[js.Any])
      
      inline def setLogger(value: Any): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      inline def setLoggingKey(value: Any): Self = StObject.set(x, "loggingKey", value.asInstanceOf[js.Any])
      
      inline def setRequestBody(value: Any): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
      
      inline def setRequestBodyValidators(value: Any): Self = StObject.set(x, "requestBodyValidators", value.asInstanceOf[js.Any])
      
      inline def setValidate(value: Any => Unit): Self = StObject.set(x, "validate", js.Any.fromFunction1(value))
      
      inline def setValidateBody(value: Any): Self = StObject.set(x, "validateBody", value.asInstanceOf[js.Any])
      
      inline def setValidateFormData(value: Any): Self = StObject.set(x, "validateFormData", value.asInstanceOf[js.Any])
      
      inline def setValidateHeaders(value: Any): Self = StObject.set(x, "validateHeaders", value.asInstanceOf[js.Any])
      
      inline def setValidatePath(value: Any): Self = StObject.set(x, "validatePath", value.asInstanceOf[js.Any])
      
      inline def setValidateQuery(value: Any): Self = StObject.set(x, "validateQuery", value.asInstanceOf[js.Any])
      
      inline def setValidateRequest(value: Any => Any): Self = StObject.set(x, "validateRequest", js.Any.fromFunction1(value))
    }
  }
  
  trait OpenAPIRequestValidatorArgs extends StObject {
    
    var additionalQueryProperties: js.UndefOr[Boolean] = js.undefined
    
    var ajvOptions: js.UndefOr[Options] = js.undefined
    
    var componentSchemas: js.UndefOr[js.Array[IJsonSchema]] = js.undefined
    
    var customFormats: js.UndefOr[StringDictionary[Format | (FormatDefinition[String | Double])]] = js.undefined
    
    var customKeywords: js.UndefOr[StringDictionary[KeywordDefinition]] = js.undefined
    
    var enableHeadersLowercase: js.UndefOr[Boolean] = js.undefined
    
    var errorTransformer: js.UndefOr[
        js.Function2[
          /* openAPIResponseValidatorValidationError */ OpenAPIRequestValidatorError, 
          /* ajvError */ ErrorObject[String, Record[String, Any], Any], 
          Any
        ]
      ] = js.undefined
    
    var externalSchemas: js.UndefOr[StringDictionary[IJsonSchema]] = js.undefined
    
    var logger: js.UndefOr[Logger] = js.undefined
    
    var loggingKey: js.UndefOr[String] = js.undefined
    
    var parameters: js.UndefOr[Parameters] = js.undefined
    
    var requestBody: js.UndefOr[RequestBodyObject] = js.undefined
    
    var schemas: js.UndefOr[js.Array[IJsonSchema]] = js.undefined
  }
  object OpenAPIRequestValidatorArgs {
    
    inline def apply(): OpenAPIRequestValidatorArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OpenAPIRequestValidatorArgs]
    }
    
    extension [Self <: OpenAPIRequestValidatorArgs](x: Self) {
      
      inline def setAdditionalQueryProperties(value: Boolean): Self = StObject.set(x, "additionalQueryProperties", value.asInstanceOf[js.Any])
      
      inline def setAdditionalQueryPropertiesUndefined: Self = StObject.set(x, "additionalQueryProperties", js.undefined)
      
      inline def setAjvOptions(value: Options): Self = StObject.set(x, "ajvOptions", value.asInstanceOf[js.Any])
      
      inline def setAjvOptionsUndefined: Self = StObject.set(x, "ajvOptions", js.undefined)
      
      inline def setComponentSchemas(value: js.Array[IJsonSchema]): Self = StObject.set(x, "componentSchemas", value.asInstanceOf[js.Any])
      
      inline def setComponentSchemasUndefined: Self = StObject.set(x, "componentSchemas", js.undefined)
      
      inline def setComponentSchemasVarargs(value: IJsonSchema*): Self = StObject.set(x, "componentSchemas", js.Array(value*))
      
      inline def setCustomFormats(value: StringDictionary[Format | (FormatDefinition[String | Double])]): Self = StObject.set(x, "customFormats", value.asInstanceOf[js.Any])
      
      inline def setCustomFormatsUndefined: Self = StObject.set(x, "customFormats", js.undefined)
      
      inline def setCustomKeywords(value: StringDictionary[KeywordDefinition]): Self = StObject.set(x, "customKeywords", value.asInstanceOf[js.Any])
      
      inline def setCustomKeywordsUndefined: Self = StObject.set(x, "customKeywords", js.undefined)
      
      inline def setEnableHeadersLowercase(value: Boolean): Self = StObject.set(x, "enableHeadersLowercase", value.asInstanceOf[js.Any])
      
      inline def setEnableHeadersLowercaseUndefined: Self = StObject.set(x, "enableHeadersLowercase", js.undefined)
      
      inline def setErrorTransformer(
        value: (/* openAPIResponseValidatorValidationError */ OpenAPIRequestValidatorError, /* ajvError */ ErrorObject[String, Record[String, Any], Any]) => Any
      ): Self = StObject.set(x, "errorTransformer", js.Any.fromFunction2(value))
      
      inline def setErrorTransformerUndefined: Self = StObject.set(x, "errorTransformer", js.undefined)
      
      inline def setExternalSchemas(value: StringDictionary[IJsonSchema]): Self = StObject.set(x, "externalSchemas", value.asInstanceOf[js.Any])
      
      inline def setExternalSchemasUndefined: Self = StObject.set(x, "externalSchemas", js.undefined)
      
      inline def setLogger(value: Logger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
      
      inline def setLoggingKey(value: String): Self = StObject.set(x, "loggingKey", value.asInstanceOf[js.Any])
      
      inline def setLoggingKeyUndefined: Self = StObject.set(x, "loggingKey", js.undefined)
      
      inline def setParameters(value: Parameters): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
      
      inline def setParametersVarargs(
        value: (Parameter | ParameterObject | typings.openapiTypes.mod.OpenAPIV3.ParameterObject | ReferenceObject | typings.openapiTypes.mod.OpenAPIV3.ReferenceObject | typings.openapiTypes.mod.OpenAPIV2.ReferenceObject)*
      ): Self = StObject.set(x, "parameters", js.Array(value*))
      
      inline def setRequestBody(value: RequestBodyObject): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
      
      inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
      
      inline def setSchemas(value: js.Array[IJsonSchema]): Self = StObject.set(x, "schemas", value.asInstanceOf[js.Any])
      
      inline def setSchemasUndefined: Self = StObject.set(x, "schemas", js.undefined)
      
      inline def setSchemasVarargs(value: IJsonSchema*): Self = StObject.set(x, "schemas", js.Array(value*))
    }
  }
  
  trait OpenAPIRequestValidatorError extends StObject {
    
    var errorCode: String
    
    var location: js.UndefOr[String] = js.undefined
    
    var message: String
    
    var path: js.UndefOr[String] = js.undefined
    
    var schema: js.UndefOr[Any] = js.undefined
  }
  object OpenAPIRequestValidatorError {
    
    inline def apply(errorCode: String, message: String): OpenAPIRequestValidatorError = {
      val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[OpenAPIRequestValidatorError]
    }
    
    extension [Self <: OpenAPIRequestValidatorError](x: Self) {
      
      inline def setErrorCode(value: String): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
      
      inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setSchema(value: Any): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
      
      inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    }
  }
}
