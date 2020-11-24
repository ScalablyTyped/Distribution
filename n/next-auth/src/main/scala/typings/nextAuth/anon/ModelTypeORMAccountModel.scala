package typings.nextAuth.anon

import typings.nextAuth.adaptersMod.TypeORMAccountModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModelTypeORMAccountModel extends js.Object {
  
  var model: TypeORMAccountModel = js.native
  
  var schema: typings.nextAuth.adaptersMod.Schema[TypeORMAccountModel] = js.native
}
object ModelTypeORMAccountModel {
  
  @scala.inline
  def apply(model: TypeORMAccountModel, schema: typings.nextAuth.adaptersMod.Schema[TypeORMAccountModel]): ModelTypeORMAccountModel = {
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelTypeORMAccountModel]
  }
  
  @scala.inline
  implicit class ModelTypeORMAccountModelOps[Self <: ModelTypeORMAccountModel] (val x: Self) extends AnyVal {
    
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
    def setModel(value: TypeORMAccountModel): Self = this.set("model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchema(value: typings.nextAuth.adaptersMod.Schema[TypeORMAccountModel]): Self = this.set("schema", value.asInstanceOf[js.Any])
  }
}
