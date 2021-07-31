package typings.nextAuth.anon

import typings.nextAuth.adaptersMod.TypeORMUserModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModelTypeORMUserModel extends StObject {
  
  var model: TypeORMUserModel
  
  var schema: typings.nextAuth.adaptersMod.Schema[TypeORMUserModel]
}
object ModelTypeORMUserModel {
  
  @scala.inline
  def apply(model: TypeORMUserModel, schema: typings.nextAuth.adaptersMod.Schema[TypeORMUserModel]): ModelTypeORMUserModel = {
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelTypeORMUserModel]
  }
  
  @scala.inline
  implicit class ModelTypeORMUserModelMutableBuilder[Self <: ModelTypeORMUserModel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setModel(value: TypeORMUserModel): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchema(value: typings.nextAuth.adaptersMod.Schema[TypeORMUserModel]): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
  }
}
