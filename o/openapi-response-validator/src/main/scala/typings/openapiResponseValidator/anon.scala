package typings.openapiResponseValidator

import typings.openapiTypes.mod.OpenAPIV3.SchemaObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Errors extends StObject {
    
    var errors: js.Any = js.native
    
    var message: String = js.native
  }
  object Errors {
    
    @scala.inline
    def apply(errors: js.Any, message: String): Errors = {
      val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[Errors]
    }
    
    @scala.inline
    implicit class ErrorsMutableBuilder[Self <: Errors] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setErrors(value: js.Any): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Schema extends StObject {
    
    var schema: typings.openapiTypes.mod.OpenAPIV2.Schema | SchemaObject = js.native
  }
  object Schema {
    
    @scala.inline
    def apply(schema: typings.openapiTypes.mod.OpenAPIV2.Schema | SchemaObject): Schema = {
      val __obj = js.Dynamic.literal(schema = schema.asInstanceOf[js.Any])
      __obj.asInstanceOf[Schema]
    }
    
    @scala.inline
    implicit class SchemaMutableBuilder[Self <: Schema] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSchema(value: typings.openapiTypes.mod.OpenAPIV2.Schema | SchemaObject): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    }
  }
}
