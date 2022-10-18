package typings.metamaskUtils.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JsonrpcNumberResultString extends StObject {
  
  var id: Double
  
  var jsonrpc: Double
  
  var result: String
}
object JsonrpcNumberResultString {
  
  inline def apply(id: Double, jsonrpc: Double, result: String): JsonrpcNumberResultString = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], jsonrpc = jsonrpc.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsonrpcNumberResultString]
  }
  
  extension [Self <: JsonrpcNumberResultString](x: Self) {
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setJsonrpc(value: Double): Self = StObject.set(x, "jsonrpc", value.asInstanceOf[js.Any])
    
    inline def setResult(value: String): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}
