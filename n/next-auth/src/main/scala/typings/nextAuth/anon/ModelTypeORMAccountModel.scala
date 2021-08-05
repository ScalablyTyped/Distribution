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
  
  inline def apply(model: TypeORMAccountModel, schema: typings.nextAuth.adaptersMod.Schema[TypeORMAccountModel]): ModelTypeORMAccountModel = {
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelTypeORMAccountModel]
  }
  
  extension [Self <: ModelTypeORMAccountModel](x: Self) {
    
    inline def setModel(value: TypeORMAccountModel): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setSchema(value: typings.nextAuth.adaptersMod.Schema[TypeORMAccountModel]): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
  }
}
