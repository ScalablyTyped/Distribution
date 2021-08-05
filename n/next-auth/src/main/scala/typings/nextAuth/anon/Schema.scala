package typings.nextAuth.anon

import typings.nextAuth.adaptersMod.TypeORMAccountModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Schema[A /* <: TypeORMAccountModel */] extends StObject {
  
  var model: A
  
  var schema: typings.nextAuth.adaptersMod.Schema[A]
}
object Schema {
  
  inline def apply[A /* <: TypeORMAccountModel */](model: A, schema: typings.nextAuth.adaptersMod.Schema[A]): Schema[A] = {
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema[A]]
  }
  
  extension [Self <: Schema[?], A /* <: TypeORMAccountModel */](x: Self & Schema[A]) {
    
    inline def setModel(value: A): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setSchema(value: typings.nextAuth.adaptersMod.Schema[A]): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
  }
}
