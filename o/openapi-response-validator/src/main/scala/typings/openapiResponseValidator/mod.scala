package typings.openapiResponseValidator

import org.scalablytyped.runtime.StringDictionary
import typings.ajv.distTypesMod.ErrorObject
import typings.ajv.distTypesMod.Format
import typings.ajv.distTypesMod.FormatDefinition
import typings.openapiResponseValidator.anon.Errors
import typings.openapiResponseValidator.anon.Schema
import typings.openapiTypes.mod.IJsonSchema
import typings.openapiTypes.mod.OpenAPIV3.ComponentsObject
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("openapi-response-validator", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with OpenAPIResponseValidator {
    def this(args: OpenAPIResponseValidatorArgs) = this()
    
    /* private */ /* CompleteClass */
    var errorMapper: Any = js.native
    
    /* CompleteClass */
    override def validateResponse(statusCode: String, response: Any): Unit | OpenAPIResponseValidatorValidationError = js.native
    /* CompleteClass */
    override def validateResponse(statusCode: Any, response: Any): Errors = js.native
    
    /* private */ /* CompleteClass */
    var validators: Any = js.native
  }
  
  trait IOpenAPIResponseValidator extends StObject {
    
    def validateResponse(statusCode: String, response: Any): Unit | OpenAPIResponseValidatorValidationError
  }
  object IOpenAPIResponseValidator {
    
    inline def apply(validateResponse: (String, Any) => Unit | OpenAPIResponseValidatorValidationError): IOpenAPIResponseValidator = {
      val __obj = js.Dynamic.literal(validateResponse = js.Any.fromFunction2(validateResponse))
      __obj.asInstanceOf[IOpenAPIResponseValidator]
    }
    
    extension [Self <: IOpenAPIResponseValidator](x: Self) {
      
      inline def setValidateResponse(value: (String, Any) => Unit | OpenAPIResponseValidatorValidationError): Self = StObject.set(x, "validateResponse", js.Any.fromFunction2(value))
    }
  }
  
  trait OpenAPIResponseValidator
    extends StObject
       with IOpenAPIResponseValidator {
    
    /* private */ var errorMapper: Any
    
    def validateResponse(statusCode: Any, response: Any): Errors
    
    /* private */ var validators: Any
  }
  object OpenAPIResponseValidator {
    
    inline def apply(errorMapper: Any, validateResponse: (Any, Any) => Errors, validators: Any): OpenAPIResponseValidator = {
      val __obj = js.Dynamic.literal(errorMapper = errorMapper.asInstanceOf[js.Any], validateResponse = js.Any.fromFunction2(validateResponse), validators = validators.asInstanceOf[js.Any])
      __obj.asInstanceOf[OpenAPIResponseValidator]
    }
    
    extension [Self <: OpenAPIResponseValidator](x: Self) {
      
      inline def setErrorMapper(value: Any): Self = StObject.set(x, "errorMapper", value.asInstanceOf[js.Any])
      
      inline def setValidateResponse(value: (Any, Any) => Errors): Self = StObject.set(x, "validateResponse", js.Any.fromFunction2(value))
      
      inline def setValidators(value: Any): Self = StObject.set(x, "validators", value.asInstanceOf[js.Any])
    }
  }
  
  trait OpenAPIResponseValidatorArgs extends StObject {
    
    var components: js.UndefOr[ComponentsObject] = js.undefined
    
    var customFormats: js.UndefOr[StringDictionary[Format | (FormatDefinition[String | Double])]] = js.undefined
    
    var definitions: js.UndefOr[StringDictionary[IJsonSchema]] = js.undefined
    
    var errorTransformer: js.UndefOr[
        js.Function2[
          /* openAPIResponseValidatorValidationError */ OpenAPIResponseValidatorError, 
          /* ajvError */ ErrorObject[String, Record[String, Any], Any], 
          Any
        ]
      ] = js.undefined
    
    var externalSchemas: js.UndefOr[StringDictionary[IJsonSchema]] = js.undefined
    
    var loggingKey: js.UndefOr[String] = js.undefined
    
    var responses: StringDictionary[Schema]
  }
  object OpenAPIResponseValidatorArgs {
    
    inline def apply(responses: StringDictionary[Schema]): OpenAPIResponseValidatorArgs = {
      val __obj = js.Dynamic.literal(responses = responses.asInstanceOf[js.Any])
      __obj.asInstanceOf[OpenAPIResponseValidatorArgs]
    }
    
    extension [Self <: OpenAPIResponseValidatorArgs](x: Self) {
      
      inline def setComponents(value: ComponentsObject): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
      
      inline def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
      
      inline def setCustomFormats(value: StringDictionary[Format | (FormatDefinition[String | Double])]): Self = StObject.set(x, "customFormats", value.asInstanceOf[js.Any])
      
      inline def setCustomFormatsUndefined: Self = StObject.set(x, "customFormats", js.undefined)
      
      inline def setDefinitions(value: StringDictionary[IJsonSchema]): Self = StObject.set(x, "definitions", value.asInstanceOf[js.Any])
      
      inline def setDefinitionsUndefined: Self = StObject.set(x, "definitions", js.undefined)
      
      inline def setErrorTransformer(
        value: (/* openAPIResponseValidatorValidationError */ OpenAPIResponseValidatorError, /* ajvError */ ErrorObject[String, Record[String, Any], Any]) => Any
      ): Self = StObject.set(x, "errorTransformer", js.Any.fromFunction2(value))
      
      inline def setErrorTransformerUndefined: Self = StObject.set(x, "errorTransformer", js.undefined)
      
      inline def setExternalSchemas(value: StringDictionary[IJsonSchema]): Self = StObject.set(x, "externalSchemas", value.asInstanceOf[js.Any])
      
      inline def setExternalSchemasUndefined: Self = StObject.set(x, "externalSchemas", js.undefined)
      
      inline def setLoggingKey(value: String): Self = StObject.set(x, "loggingKey", value.asInstanceOf[js.Any])
      
      inline def setLoggingKeyUndefined: Self = StObject.set(x, "loggingKey", js.undefined)
      
      inline def setResponses(value: StringDictionary[Schema]): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
    }
  }
  
  trait OpenAPIResponseValidatorError extends StObject {
    
    var errorCode: String
    
    var message: String
    
    var path: js.UndefOr[String] = js.undefined
  }
  object OpenAPIResponseValidatorError {
    
    inline def apply(errorCode: String, message: String): OpenAPIResponseValidatorError = {
      val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[OpenAPIResponseValidatorError]
    }
    
    extension [Self <: OpenAPIResponseValidatorError](x: Self) {
      
      inline def setErrorCode(value: String): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    }
  }
  
  trait OpenAPIResponseValidatorValidationError extends StObject {
    
    var errors: js.UndefOr[js.Array[Any]] = js.undefined
    
    var message: String
  }
  object OpenAPIResponseValidatorValidationError {
    
    inline def apply(message: String): OpenAPIResponseValidatorValidationError = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[OpenAPIResponseValidatorValidationError]
    }
    
    extension [Self <: OpenAPIResponseValidatorValidationError](x: Self) {
      
      inline def setErrors(value: js.Array[Any]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
      
      inline def setErrorsVarargs(value: Any*): Self = StObject.set(x, "errors", js.Array(value*))
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
}
