package typings.openapiResponseValidator

import org.scalablytyped.runtime.StringDictionary
import typings.ajv.mod.ErrorObject
import typings.ajv.mod.FormatDefinition
import typings.ajv.mod.FormatValidator
import typings.openapiResponseValidator.anon.Errors
import typings.openapiResponseValidator.anon.Schema
import typings.openapiTypes.mod.IJsonSchema
import typings.openapiTypes.mod.OpenAPIV3.ComponentsObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("openapi-response-validator", JSImport.Default)
  @js.native
  class default protected () extends OpenAPIResponseValidator {
    def this(args: OpenAPIResponseValidatorArgs) = this()
  }
  
  @js.native
  trait IOpenAPIResponseValidator extends StObject {
    
    def validateResponse(statusCode: String, response: js.Any): Unit | OpenAPIResponseValidatorValidationError = js.native
  }
  object IOpenAPIResponseValidator {
    
    @scala.inline
    def apply(validateResponse: (String, js.Any) => Unit | OpenAPIResponseValidatorValidationError): IOpenAPIResponseValidator = {
      val __obj = js.Dynamic.literal(validateResponse = js.Any.fromFunction2(validateResponse))
      __obj.asInstanceOf[IOpenAPIResponseValidator]
    }
    
    @scala.inline
    implicit class IOpenAPIResponseValidatorMutableBuilder[Self <: IOpenAPIResponseValidator] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setValidateResponse(value: (String, js.Any) => Unit | OpenAPIResponseValidatorValidationError): Self = StObject.set(x, "validateResponse", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait OpenAPIResponseValidator extends IOpenAPIResponseValidator {
    
    var errorMapper: js.Any = js.native
    
    def validateResponse(statusCode: js.Any, response: js.Any): Errors = js.native
    
    var validators: js.Any = js.native
  }
  object OpenAPIResponseValidator {
    
    @scala.inline
    def apply(errorMapper: js.Any, validateResponse: (js.Any, js.Any) => Errors, validators: js.Any): OpenAPIResponseValidator = {
      val __obj = js.Dynamic.literal(errorMapper = errorMapper.asInstanceOf[js.Any], validateResponse = js.Any.fromFunction2(validateResponse), validators = validators.asInstanceOf[js.Any])
      __obj.asInstanceOf[OpenAPIResponseValidator]
    }
    
    @scala.inline
    implicit class OpenAPIResponseValidatorMutableBuilder[Self <: OpenAPIResponseValidator] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setErrorMapper(value: js.Any): Self = StObject.set(x, "errorMapper", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidateResponse(value: (js.Any, js.Any) => Errors): Self = StObject.set(x, "validateResponse", js.Any.fromFunction2(value))
      
      @scala.inline
      def setValidators(value: js.Any): Self = StObject.set(x, "validators", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait OpenAPIResponseValidatorArgs extends StObject {
    
    var components: js.UndefOr[ComponentsObject] = js.native
    
    var customFormats: StringDictionary[FormatValidator | FormatDefinition] = js.native
    
    var definitions: StringDictionary[IJsonSchema] = js.native
    
    var errorTransformer: js.UndefOr[
        js.Function2[
          /* openAPIResponseValidatorValidationError */ OpenAPIResponseValidatorError, 
          /* ajvError */ ErrorObject, 
          _
        ]
      ] = js.native
    
    var externalSchemas: StringDictionary[IJsonSchema] = js.native
    
    var loggingKey: String = js.native
    
    var responses: StringDictionary[Schema] = js.native
  }
  object OpenAPIResponseValidatorArgs {
    
    @scala.inline
    def apply(
      customFormats: StringDictionary[FormatValidator | FormatDefinition],
      definitions: StringDictionary[IJsonSchema],
      externalSchemas: StringDictionary[IJsonSchema],
      loggingKey: String,
      responses: StringDictionary[Schema]
    ): OpenAPIResponseValidatorArgs = {
      val __obj = js.Dynamic.literal(customFormats = customFormats.asInstanceOf[js.Any], definitions = definitions.asInstanceOf[js.Any], externalSchemas = externalSchemas.asInstanceOf[js.Any], loggingKey = loggingKey.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
      __obj.asInstanceOf[OpenAPIResponseValidatorArgs]
    }
    
    @scala.inline
    implicit class OpenAPIResponseValidatorArgsMutableBuilder[Self <: OpenAPIResponseValidatorArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComponents(value: ComponentsObject): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
      
      @scala.inline
      def setCustomFormats(value: StringDictionary[FormatValidator | FormatDefinition]): Self = StObject.set(x, "customFormats", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefinitions(value: StringDictionary[IJsonSchema]): Self = StObject.set(x, "definitions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorTransformer(
        value: (/* openAPIResponseValidatorValidationError */ OpenAPIResponseValidatorError, /* ajvError */ ErrorObject) => _
      ): Self = StObject.set(x, "errorTransformer", js.Any.fromFunction2(value))
      
      @scala.inline
      def setErrorTransformerUndefined: Self = StObject.set(x, "errorTransformer", js.undefined)
      
      @scala.inline
      def setExternalSchemas(value: StringDictionary[IJsonSchema]): Self = StObject.set(x, "externalSchemas", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoggingKey(value: String): Self = StObject.set(x, "loggingKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponses(value: StringDictionary[Schema]): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait OpenAPIResponseValidatorError extends StObject {
    
    var errorCode: String = js.native
    
    var message: String = js.native
    
    var path: js.UndefOr[String] = js.native
  }
  object OpenAPIResponseValidatorError {
    
    @scala.inline
    def apply(errorCode: String, message: String): OpenAPIResponseValidatorError = {
      val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[OpenAPIResponseValidatorError]
    }
    
    @scala.inline
    implicit class OpenAPIResponseValidatorErrorMutableBuilder[Self <: OpenAPIResponseValidatorError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setErrorCode(value: String): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    }
  }
  
  @js.native
  trait OpenAPIResponseValidatorValidationError extends StObject {
    
    var errors: js.UndefOr[js.Array[_]] = js.native
    
    var message: String = js.native
  }
  object OpenAPIResponseValidatorValidationError {
    
    @scala.inline
    def apply(message: String): OpenAPIResponseValidatorValidationError = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[OpenAPIResponseValidatorValidationError]
    }
    
    @scala.inline
    implicit class OpenAPIResponseValidatorValidationErrorMutableBuilder[Self <: OpenAPIResponseValidatorValidationError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setErrors(value: js.Array[_]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
      
      @scala.inline
      def setErrorsVarargs(value: js.Any*): Self = StObject.set(x, "errors", js.Array(value :_*))
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
}
