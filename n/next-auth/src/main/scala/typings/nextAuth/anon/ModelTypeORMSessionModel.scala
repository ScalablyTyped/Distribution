package typings.nextAuth.anon

import typings.nextAuth.adaptersMod.TypeORMSessionModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModelTypeORMSessionModel extends StObject {
  
  var model: TypeORMSessionModel
  
  var schema: typings.nextAuth.adaptersMod.Schema[TypeORMSessionModel]
}
object ModelTypeORMSessionModel {
  
  inline def apply(model: TypeORMSessionModel, schema: typings.nextAuth.adaptersMod.Schema[TypeORMSessionModel]): ModelTypeORMSessionModel = {
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelTypeORMSessionModel]
  }
  
  extension [Self <: ModelTypeORMSessionModel](x: Self) {
    
    inline def setModel(value: TypeORMSessionModel): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setSchema(value: typings.nextAuth.adaptersMod.Schema[TypeORMSessionModel]): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
  }
}
