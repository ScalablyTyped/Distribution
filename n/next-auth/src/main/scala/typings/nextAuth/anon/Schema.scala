package typings.nextAuth.anon

import typings.nextAuth.adaptersMod.TypeORMAccountModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Schema[A /* <: TypeORMAccountModel */] extends js.Object {
  
  var model: A = js.native
  
  var schema: typings.nextAuth.adaptersMod.Schema[A] = js.native
}
object Schema {
  
  @scala.inline
  def apply[A /* <: TypeORMAccountModel */](model: A, schema: typings.nextAuth.adaptersMod.Schema[A]): Schema[A] = {
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema[A]]
  }
  
  @scala.inline
  implicit class SchemaOps[Self <: Schema[_], A /* <: TypeORMAccountModel */] (val x: Self with Schema[A]) extends AnyVal {
    
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
    def setModel(value: A): Self = this.set("model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchema(value: typings.nextAuth.adaptersMod.Schema[A]): Self = this.set("schema", value.asInstanceOf[js.Any])
  }
}
