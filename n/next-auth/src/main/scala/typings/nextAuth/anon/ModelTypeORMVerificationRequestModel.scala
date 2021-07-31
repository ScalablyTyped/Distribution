package typings.nextAuth.anon

import typings.nextAuth.adaptersMod.TypeORMVerificationRequestModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModelTypeORMVerificationRequestModel extends StObject {
  
  var model: TypeORMVerificationRequestModel
  
  var schema: typings.nextAuth.adaptersMod.Schema[TypeORMVerificationRequestModel]
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
  implicit class ModelTypeORMVerificationRequestModelMutableBuilder[Self <: ModelTypeORMVerificationRequestModel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setModel(value: TypeORMVerificationRequestModel): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchema(value: typings.nextAuth.adaptersMod.Schema[TypeORMVerificationRequestModel]): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
  }
}
