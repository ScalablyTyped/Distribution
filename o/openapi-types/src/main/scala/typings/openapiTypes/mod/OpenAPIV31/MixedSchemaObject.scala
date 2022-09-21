package typings.openapiTypes.mod.OpenAPIV31

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MixedSchemaObject
  extends StObject
     with BaseSchemaObject
     with SchemaObject {
  
  var items: js.UndefOr[ReferenceObject | SchemaObject] = js.undefined
  
  var `type`: js.UndefOr[js.Array[ArraySchemaObjectType | NonArraySchemaObjectType]] = js.undefined
}
object MixedSchemaObject {
  
  inline def apply(): MixedSchemaObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MixedSchemaObject]
  }
  
  extension [Self <: MixedSchemaObject](x: Self) {
    
    inline def setItems(value: ReferenceObject | SchemaObject): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setType(value: js.Array[ArraySchemaObjectType | NonArraySchemaObjectType]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setTypeVarargs(value: (ArraySchemaObjectType | NonArraySchemaObjectType)*): Self = StObject.set(x, "type", js.Array(value*))
  }
}
