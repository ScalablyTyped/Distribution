package typings.openapiTypes.mod.OpenAPIV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArraySchemaObject
  extends BaseSchemaObject
     with SchemaObject {
  
  var items: ReferenceObject | SchemaObject = js.native
  
  var `type`: ArraySchemaObjectType = js.native
}
object ArraySchemaObject {
  
  @scala.inline
  def apply(items: ReferenceObject | SchemaObject, `type`: ArraySchemaObjectType): ArraySchemaObject = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArraySchemaObject]
  }
  
  @scala.inline
  implicit class ArraySchemaObjectMutableBuilder[Self <: ArraySchemaObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: ReferenceObject | SchemaObject): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ArraySchemaObjectType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
