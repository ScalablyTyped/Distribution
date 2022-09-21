package typings.openapiResponseValidator

import typings.openapiTypes.mod.OpenAPIV3.SchemaObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Errors extends StObject {
    
    var errors: Any
    
    var message: String
  }
  object Errors {
    
    inline def apply(errors: Any, message: String): Errors = {
      val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[Errors]
    }
    
    extension [Self <: Errors](x: Self) {
      
      inline def setErrors(value: Any): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
  
  trait Schema extends StObject {
    
    var schema: typings.openapiTypes.mod.OpenAPIV2.Schema | SchemaObject
  }
  object Schema {
    
    inline def apply(schema: typings.openapiTypes.mod.OpenAPIV2.Schema | SchemaObject): Schema = {
      val __obj = js.Dynamic.literal(schema = schema.asInstanceOf[js.Any])
      __obj.asInstanceOf[Schema]
    }
    
    extension [Self <: Schema](x: Self) {
      
      inline def setSchema(value: typings.openapiTypes.mod.OpenAPIV2.Schema | SchemaObject): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    }
  }
}
