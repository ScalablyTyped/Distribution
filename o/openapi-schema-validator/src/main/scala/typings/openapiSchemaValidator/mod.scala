package typings.openapiSchemaValidator

import typings.ajv.mod.ErrorObject
import typings.openapiTypes.mod.IJsonSchema
import typings.openapiTypes.mod.OpenAPI.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("openapi-schema-validator", JSImport.Default)
  @js.native
  class default protected () extends OpenAPISchemaValidator {
    def this(args: OpenAPISchemaValidatorArgs) = this()
  }
  
  @js.native
  trait IOpenAPISchemaValidator extends StObject {
    
    /**
      * Validate the provided OpenAPI doc against this validator's schema version and
      * return the results.
      */
    def validate(doc: Document): OpenAPISchemaValidatorResult = js.native
  }
  object IOpenAPISchemaValidator {
    
    @scala.inline
    def apply(validate: Document => OpenAPISchemaValidatorResult): IOpenAPISchemaValidator = {
      val __obj = js.Dynamic.literal(validate = js.Any.fromFunction1(validate))
      __obj.asInstanceOf[IOpenAPISchemaValidator]
    }
    
    @scala.inline
    implicit class IOpenAPISchemaValidatorMutableBuilder[Self <: IOpenAPISchemaValidator] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setValidate(value: Document => OpenAPISchemaValidatorResult): Self = StObject.set(x, "validate", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait OpenAPISchemaValidator extends IOpenAPISchemaValidator {
    
    var validator: js.Any = js.native
  }
  object OpenAPISchemaValidator {
    
    @scala.inline
    def apply(validate: Document => OpenAPISchemaValidatorResult, validator: js.Any): OpenAPISchemaValidator = {
      val __obj = js.Dynamic.literal(validate = js.Any.fromFunction1(validate), validator = validator.asInstanceOf[js.Any])
      __obj.asInstanceOf[OpenAPISchemaValidator]
    }
    
    @scala.inline
    implicit class OpenAPISchemaValidatorMutableBuilder[Self <: OpenAPISchemaValidator] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setValidator(value: js.Any): Self = StObject.set(x, "validator", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait OpenAPISchemaValidatorArgs extends StObject {
    
    var extensions: js.UndefOr[IJsonSchema] = js.native
    
    var version: Double | String = js.native
  }
  object OpenAPISchemaValidatorArgs {
    
    @scala.inline
    def apply(version: Double | String): OpenAPISchemaValidatorArgs = {
      val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[OpenAPISchemaValidatorArgs]
    }
    
    @scala.inline
    implicit class OpenAPISchemaValidatorArgsMutableBuilder[Self <: OpenAPISchemaValidatorArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExtensions(value: IJsonSchema): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
      
      @scala.inline
      def setVersion(value: Double | String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait OpenAPISchemaValidatorResult extends StObject {
    
    var errors: js.Array[ErrorObject] = js.native
  }
  object OpenAPISchemaValidatorResult {
    
    @scala.inline
    def apply(errors: js.Array[ErrorObject]): OpenAPISchemaValidatorResult = {
      val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any])
      __obj.asInstanceOf[OpenAPISchemaValidatorResult]
    }
    
    @scala.inline
    implicit class OpenAPISchemaValidatorResultMutableBuilder[Self <: OpenAPISchemaValidatorResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setErrors(value: js.Array[ErrorObject]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorsVarargs(value: ErrorObject*): Self = StObject.set(x, "errors", js.Array(value :_*))
    }
  }
}
