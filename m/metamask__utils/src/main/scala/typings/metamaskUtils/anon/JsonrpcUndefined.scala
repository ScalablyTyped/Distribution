package typings.metamaskUtils.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JsonrpcUndefined extends StObject {
  
  var id: Unit
  
  var jsonrpc: Unit
  
  var result: Unit
}
object JsonrpcUndefined {
  
  inline def apply(id: Unit, jsonrpc: Unit, result: Unit): JsonrpcUndefined = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], jsonrpc = jsonrpc.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsonrpcUndefined]
  }
  
  extension [Self <: JsonrpcUndefined](x: Self) {
    
    inline def setId(value: Unit): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setJsonrpc(value: Unit): Self = StObject.set(x, "jsonrpc", value.asInstanceOf[js.Any])
    
    inline def setResult(value: Unit): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}
