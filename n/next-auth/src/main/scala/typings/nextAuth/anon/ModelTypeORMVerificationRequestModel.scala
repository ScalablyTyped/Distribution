package typings.nextAuth.anon

import typings.nextAuth.adaptersMod.TypeORMVerificationRequestModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModelTypeORMVerificationRequestModel extends js.Object {
  
  var model: TypeORMVerificationRequestModel = js.native
  
  var schema: typings.nextAuth.adaptersMod.Schema[TypeORMVerificationRequestModel] = js.native
}
object ModelTypeORMVerificationRequestModel {
  
  @scala.inline
  def apply(
    model: TypeORMVerificationRequestModel,
    schema: typings.nextAuth.adaptersMod.Schema[TypeORMVerificationRequestModel]
  ): ModelTypeORMVerificationRequestModel = {
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelTypeORMVerificationRequestModel]
  }
  
  @scala.inline
  implicit class ModelTypeORMVerificationRequestModelOps[Self <: ModelTypeORMVerificationRequestModel] (val x: Self) extends AnyVal {
    
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
    def setModel(value: TypeORMVerificationRequestModel): Self = this.set("model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchema(value: typings.nextAuth.adaptersMod.Schema[TypeORMVerificationRequestModel]): Self = this.set("schema", value.asInstanceOf[js.Any])
  }
}
