package typings.metamaskUtils.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JsonrpcArray extends StObject {
  
  var error: CodeMessage
  
  var id: Double
  
  var jsonrpc: js.Array[scala.Nothing]
}
object JsonrpcArray {
  
  inline def apply(error: CodeMessage, id: Double, jsonrpc: js.Array[scala.Nothing]): JsonrpcArray = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], jsonrpc = jsonrpc.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsonrpcArray]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JsonrpcArray] (val x: Self) extends AnyVal {
    
    inline def setError(value: CodeMessage): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setJsonrpc(value: js.Array[scala.Nothing]): Self = StObject.set(x, "jsonrpc", value.asInstanceOf[js.Any])
    
    inline def setJsonrpcVarargs(value: scala.Nothing*): Self = StObject.set(x, "jsonrpc", js.Array(value*))
  }
}
