package typings.metamaskUtils.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdJsonrpcResult extends StObject {
  
  var id: String
  
  var jsonrpc: String
  
  var result: Null
}
object IdJsonrpcResult {
  
  inline def apply(id: String, jsonrpc: String, result: Null): IdJsonrpcResult = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], jsonrpc = jsonrpc.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdJsonrpcResult]
  }
  
  extension [Self <: IdJsonrpcResult](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setJsonrpc(value: String): Self = StObject.set(x, "jsonrpc", value.asInstanceOf[js.Any])
    
    inline def setResult(value: Null): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}
