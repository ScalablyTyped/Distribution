package typings.openapiTypes.mod.OpenAPIV31

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArraySchemaObject
  extends StObject
     with BaseSchemaObject
     with SchemaObject {
  
  var items: ReferenceObject | SchemaObject
  
  var `type`: ArraySchemaObjectType
}
object ArraySchemaObject {
  
  inline def apply(items: ReferenceObject | SchemaObject, `type`: ArraySchemaObjectType): ArraySchemaObject = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArraySchemaObject]
  }
  
  extension [Self <: ArraySchemaObject](x: Self) {
    
    inline def setItems(value: ReferenceObject | SchemaObject): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setType(value: ArraySchemaObjectType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
