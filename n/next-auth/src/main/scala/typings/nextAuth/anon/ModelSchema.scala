package typings.nextAuth.anon

import typings.nextAuth.adaptersMod.TypeORMUserModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModelSchema[U /* <: TypeORMUserModel */] extends js.Object {
  
  var model: U = js.native
  
  var schema: typings.nextAuth.adaptersMod.Schema[U] = js.native
}
object ModelSchema {
  
  @scala.inline
  def apply[U /* <: TypeORMUserModel */](model: U, schema: typings.nextAuth.adaptersMod.Schema[U]): ModelSchema[U] = {
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelSchema[U]]
  }
  
  @scala.inline
  implicit class ModelSchemaOps[Self <: ModelSchema[_], U /* <: TypeORMUserModel */] (val x: Self with ModelSchema[U]) extends AnyVal {
    
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
    def setModel(value: U): Self = this.set("model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchema(value: typings.nextAuth.adaptersMod.Schema[U]): Self = this.set("schema", value.asInstanceOf[js.Any])
  }
}
