package typings.nextAuth.anon

import typings.nextAuth.adaptersMod.TypeORMVerificationRequestModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModelVR[VR /* <: TypeORMVerificationRequestModel */] extends StObject {
  
  var model: VR
  
  var schema: typings.nextAuth.adaptersMod.Schema[VR]
}
object ModelVR {
  
  @scala.inline
  def apply[VR /* <: TypeORMVerificationRequestModel */](model: VR, schema: typings.nextAuth.adaptersMod.Schema[VR]): ModelVR[VR] = {
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelVR[VR]]
  }
  
  @scala.inline
  implicit class ModelVRMutableBuilder[Self <: ModelVR[?], VR /* <: TypeORMVerificationRequestModel */] (val x: Self & ModelVR[VR]) extends AnyVal {
    
    @scala.inline
    def setModel(value: VR): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchema(value: typings.nextAuth.adaptersMod.Schema[VR]): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
  }
}
