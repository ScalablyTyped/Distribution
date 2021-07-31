package typings.nextAuth.anon

import typings.nextAuth.adaptersMod.TypeORMAccountModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModelTypeORMAccountModel extends StObject {
  
  var model: TypeORMAccountModel
  
  var schema: typings.nextAuth.adaptersMod.Schema[TypeORMAccountModel]
}
object ModelTypeORMAccountModel {
  
  @scala.inline
  def apply(model: TypeORMAccountModel, schema: typings.nextAuth.adaptersMod.Schema[TypeORMAccountModel]): ModelTypeORMAccountModel = {
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelTypeORMAccountModel]
  }
  
  @scala.inline
  implicit class ModelTypeORMAccountModelMutableBuilder[Self <: ModelTypeORMAccountModel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setModel(value: TypeORMAccountModel): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchema(value: typings.nextAuth.adaptersMod.Schema[TypeORMAccountModel]): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
  }
}
