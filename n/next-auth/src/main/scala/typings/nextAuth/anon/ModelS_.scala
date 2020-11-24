package typings.nextAuth.anon

import typings.nextAuth.adaptersMod.TypeORMSessionModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModelS_[S /* <: TypeORMSessionModel */] extends js.Object {
  
  var model: S = js.native
  
  var schema: typings.nextAuth.adaptersMod.Schema[S] = js.native
}
object ModelS_ {
  
  @scala.inline
  def apply[S /* <: TypeORMSessionModel */](model: S, schema: typings.nextAuth.adaptersMod.Schema[S]): ModelS_[S] = {
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelS_[S]]
  }
  
  @scala.inline
  implicit class ModelS_Ops[Self <: ModelS_[_], S /* <: TypeORMSessionModel */] (val x: Self with ModelS_[S]) extends AnyVal {
    
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
    def setModel(value: S): Self = this.set("model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchema(value: typings.nextAuth.adaptersMod.Schema[S]): Self = this.set("schema", value.asInstanceOf[js.Any])
  }
}
