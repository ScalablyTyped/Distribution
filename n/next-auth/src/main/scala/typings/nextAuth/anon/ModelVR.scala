package typings.nextAuth.anon

import typings.nextAuth.adaptersMod.TypeORMVerificationRequestModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModelVR[VR /* <: TypeORMVerificationRequestModel */] extends js.Object {
  
  var model: VR = js.native
  
  var schema: typings.nextAuth.adaptersMod.Schema[VR] = js.native
}
object ModelVR {
  
  @scala.inline
  def apply[VR /* <: TypeORMVerificationRequestModel */](model: VR, schema: typings.nextAuth.adaptersMod.Schema[VR]): ModelVR[VR] = {
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelVR[VR]]
  }
  
  @scala.inline
  implicit class ModelVROps[Self <: ModelVR[_], VR /* <: TypeORMVerificationRequestModel */] (val x: Self with ModelVR[VR]) extends AnyVal {
    
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
    def setModel(value: VR): Self = this.set("model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchema(value: typings.nextAuth.adaptersMod.Schema[VR]): Self = this.set("schema", value.asInstanceOf[js.Any])
  }
}
