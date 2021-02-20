package typings.nextAuth.anon

import typings.nextAuth.adaptersMod.TypeORMVerificationRequestModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModelVR[VR /* <: TypeORMVerificationRequestModel */] extends StObject {
  
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
  implicit class ModelVRMutableBuilder[Self <: ModelVR[_], VR /* <: TypeORMVerificationRequestModel */] (val x: Self with ModelVR[VR]) extends AnyVal {
    
    @scala.inline
    def setModel(value: VR): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchema(value: typings.nextAuth.adaptersMod.Schema[VR]): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
  }
}
