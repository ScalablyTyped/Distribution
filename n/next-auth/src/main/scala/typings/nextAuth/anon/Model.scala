package typings.nextAuth.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Model extends StObject {
  
  var model: js.Any
  
  var schema: typings.nextAuth.adaptersMod.Schema[js.Any]
}
object Model {
  
  inline def apply(model: js.Any, schema: typings.nextAuth.adaptersMod.Schema[js.Any]): Model = {
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[Model]
  }
  
  extension [Self <: Model](x: Self) {
    
    inline def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setSchema(value: typings.nextAuth.adaptersMod.Schema[js.Any]): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
  }
}
