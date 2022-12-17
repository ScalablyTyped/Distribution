package typings.metamaskUtils.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdNumberJsonrpcNumber extends StObject {
  
  var id: Double
  
  var jsonrpc: Double
  
  var result: String
}
object IdNumberJsonrpcNumber {
  
  inline def apply(id: Double, jsonrpc: Double, result: String): IdNumberJsonrpcNumber = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], jsonrpc = jsonrpc.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdNumberJsonrpcNumber]
  }
  
  extension [Self <: IdNumberJsonrpcNumber](x: Self) {
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setJsonrpc(value: Double): Self = StObject.set(x, "jsonrpc", value.asInstanceOf[js.Any])
    
    inline def setResult(value: String): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}
