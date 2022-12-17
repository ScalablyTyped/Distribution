package typings.metamaskUtils.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdNumberJsonrpcString extends StObject {
  
  var id: Double
  
  var jsonrpc: String
  
  var method: Double
  
  var params: Unit
}
object IdNumberJsonrpcString {
  
  inline def apply(id: Double, jsonrpc: String, method: Double, params: Unit): IdNumberJsonrpcString = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], jsonrpc = jsonrpc.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdNumberJsonrpcString]
  }
  
  extension [Self <: IdNumberJsonrpcString](x: Self) {
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setJsonrpc(value: String): Self = StObject.set(x, "jsonrpc", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: Double): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setParams(value: Unit): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
  }
}
