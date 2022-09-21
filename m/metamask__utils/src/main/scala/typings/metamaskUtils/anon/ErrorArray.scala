package typings.metamaskUtils.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorArray extends StObject {
  
  var error: js.Array[scala.Nothing]
  
  var id: Double
  
  var jsonrpc: String
}
object ErrorArray {
  
  inline def apply(error: js.Array[scala.Nothing], id: Double, jsonrpc: String): ErrorArray = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], jsonrpc = jsonrpc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorArray]
  }
  
  extension [Self <: ErrorArray](x: Self) {
    
    inline def setError(value: js.Array[scala.Nothing]): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorVarargs(value: scala.Nothing*): Self = StObject.set(x, "error", js.Array(value*))
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setJsonrpc(value: String): Self = StObject.set(x, "jsonrpc", value.asInstanceOf[js.Any])
  }
}
