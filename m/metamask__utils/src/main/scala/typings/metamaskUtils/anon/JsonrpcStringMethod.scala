package typings.metamaskUtils.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JsonrpcStringMethod extends StObject {
  
  var id: Double
  
  var jsonrpc: String
  
  var params: Unit
}
object JsonrpcStringMethod {
  
  inline def apply(id: Double, jsonrpc: String, params: Unit): JsonrpcStringMethod = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], jsonrpc = jsonrpc.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsonrpcStringMethod]
  }
  
  extension [Self <: JsonrpcStringMethod](x: Self) {
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setJsonrpc(value: String): Self = StObject.set(x, "jsonrpc", value.asInstanceOf[js.Any])
    
    inline def setParams(value: Unit): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
  }
}
