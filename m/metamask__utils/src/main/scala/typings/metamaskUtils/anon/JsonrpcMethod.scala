package typings.metamaskUtils.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JsonrpcMethod extends StObject {
  
  var jsonrpc: String
  
  var method: String
  
  var params: js.Array[String]
}
object JsonrpcMethod {
  
  inline def apply(jsonrpc: String, method: String, params: js.Array[String]): JsonrpcMethod = {
    val __obj = js.Dynamic.literal(jsonrpc = jsonrpc.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsonrpcMethod]
  }
  
  extension [Self <: JsonrpcMethod](x: Self) {
    
    inline def setJsonrpc(value: String): Self = StObject.set(x, "jsonrpc", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setParams(value: js.Array[String]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsVarargs(value: String*): Self = StObject.set(x, "params", js.Array(value*))
  }
}
