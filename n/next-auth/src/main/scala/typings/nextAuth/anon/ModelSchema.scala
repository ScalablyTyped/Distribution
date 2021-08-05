package typings.nextAuth.anon

import typings.nextAuth.adaptersMod.TypeORMUserModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModelSchema[U /* <: TypeORMUserModel */] extends StObject {
  
  var model: U
  
  var schema: typings.nextAuth.adaptersMod.Schema[U]
}
object ModelSchema {
  
  inline def apply[U /* <: TypeORMUserModel */](model: U, schema: typings.nextAuth.adaptersMod.Schema[U]): ModelSchema[U] = {
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelSchema[U]]
  }
  
  extension [Self <: ModelSchema[?], U /* <: TypeORMUserModel */](x: Self & ModelSchema[U]) {
    
    inline def setModel(value: U): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setSchema(value: typings.nextAuth.adaptersMod.Schema[U]): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
  }
}
