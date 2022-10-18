package typings.metamaskUtils.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JsonrpcNumber extends StObject {
  
  var error: CodeMessage
  
  var id: Double
  
  var jsonrpc: Double
}
object JsonrpcNumber {
  
  inline def apply(error: CodeMessage, id: Double, jsonrpc: Double): JsonrpcNumber = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], jsonrpc = jsonrpc.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsonrpcNumber]
  }
  
  extension [Self <: JsonrpcNumber](x: Self) {
    
    inline def setError(value: CodeMessage): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setJsonrpc(value: Double): Self = StObject.set(x, "jsonrpc", value.asInstanceOf[js.Any])
  }
}
