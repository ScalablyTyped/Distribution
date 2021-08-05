package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WriteOpResult extends StObject {
  
  var connection: js.Any
  
  var ops: js.Array[js.Any]
  
  var result: js.Any
}
object WriteOpResult {
  
  inline def apply(connection: js.Any, ops: js.Array[js.Any], result: js.Any): WriteOpResult = {
    val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], ops = ops.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[WriteOpResult]
  }
  
  extension [Self <: WriteOpResult](x: Self) {
    
    inline def setConnection(value: js.Any): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
    
    inline def setOps(value: js.Array[js.Any]): Self = StObject.set(x, "ops", value.asInstanceOf[js.Any])
    
    inline def setOpsVarargs(value: js.Any*): Self = StObject.set(x, "ops", js.Array(value :_*))
    
    inline def setResult(value: js.Any): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}
