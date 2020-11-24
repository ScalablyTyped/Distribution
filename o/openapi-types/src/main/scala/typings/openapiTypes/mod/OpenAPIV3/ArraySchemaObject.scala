package typings.openapiTypes.mod.OpenAPIV3

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
  implicit class ArraySchemaObjectOps[Self <: ArraySchemaObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setItems(value: ReferenceObject | SchemaObject): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ArraySchemaObjectType): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
