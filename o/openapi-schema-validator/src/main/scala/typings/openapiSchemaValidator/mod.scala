package typings.openapiSchemaValidator

import typings.ajv.distTypesMod.ErrorObject
import typings.openapiTypes.mod.IJsonSchema
import typings.openapiTypes.mod.OpenAPI.Document
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("openapi-schema-validator", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with OpenAPISchemaValidator {
    def this(args: OpenAPISchemaValidatorArgs) = this()
    
    /**
      * Validate the provided OpenAPI doc against this validator's schema version and
      * return the results.
      */
    /* CompleteClass */
    override def validate(doc: Document[js.Object]): OpenAPISchemaValidatorResult = js.native
    
    /* private */ /* CompleteClass */
    var validator: Any = js.native
  }
  
  trait IOpenAPISchemaValidator extends StObject {
    
    /**
      * Validate the provided OpenAPI doc against this validator's schema version and
      * return the results.
      */
    def validate(doc: Document[js.Object]): OpenAPISchemaValidatorResult
  }
  object IOpenAPISchemaValidator {
    
    inline def apply(validate: Document[js.Object] => OpenAPISchemaValidatorResult): IOpenAPISchemaValidator = {
      val __obj = js.Dynamic.literal(validate = js.Any.fromFunction1(validate))
      __obj.asInstanceOf[IOpenAPISchemaValidator]
    }
    
    extension [Self <: IOpenAPISchemaValidator](x: Self) {
      
      inline def setValidate(value: Document[js.Object] => OpenAPISchemaValidatorResult): Self = StObject.set(x, "validate", js.Any.fromFunction1(value))
    }
  }
  
  trait OpenAPISchemaValidator
    extends StObject
       with IOpenAPISchemaValidator {
    
    /* private */ var validator: Any
  }
  object OpenAPISchemaValidator {
    
    inline def apply(validate: Document[js.Object] => OpenAPISchemaValidatorResult, validator: Any): OpenAPISchemaValidator = {
      val __obj = js.Dynamic.literal(validate = js.Any.fromFunction1(validate), validator = validator.asInstanceOf[js.Any])
      __obj.asInstanceOf[OpenAPISchemaValidator]
    }
    
    extension [Self <: OpenAPISchemaValidator](x: Self) {
      
      inline def setValidator(value: Any): Self = StObject.set(x, "validator", value.asInstanceOf[js.Any])
    }
  }
  
  trait OpenAPISchemaValidatorArgs extends StObject {
    
    var extensions: js.UndefOr[IJsonSchema] = js.undefined
    
    var version: Double | String
  }
  object OpenAPISchemaValidatorArgs {
    
    inline def apply(version: Double | String): OpenAPISchemaValidatorArgs = {
      val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[OpenAPISchemaValidatorArgs]
    }
    
    extension [Self <: OpenAPISchemaValidatorArgs](x: Self) {
      
      inline def setExtensions(value: IJsonSchema): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
      
      inline def setVersion(value: Double | String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait OpenAPISchemaValidatorResult extends StObject {
    
    var errors: js.Array[ErrorObject[String, Record[String, Any], Any]]
  }
  object OpenAPISchemaValidatorResult {
    
    inline def apply(errors: js.Array[ErrorObject[String, Record[String, Any], Any]]): OpenAPISchemaValidatorResult = {
      val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any])
      __obj.asInstanceOf[OpenAPISchemaValidatorResult]
    }
    
    extension [Self <: OpenAPISchemaValidatorResult](x: Self) {
      
      inline def setErrors(value: js.Array[ErrorObject[String, Record[String, Any], Any]]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setErrorsVarargs(value: (ErrorObject[String, Record[String, Any], Any])*): Self = StObject.set(x, "errors", js.Array(value*))
    }
  }
}
