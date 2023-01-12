package typings.metamaskUtils.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdNumberJsonrpcUndefined extends StObject {
  
  var id: Double
  
  var jsonrpc: Unit
  
  var result: String
}
object IdNumberJsonrpcUndefined {
  
  inline def apply(id: Double, jsonrpc: Unit, result: String): IdNumberJsonrpcUndefined = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], jsonrpc = jsonrpc.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdNumberJsonrpcUndefined]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IdNumberJsonrpcUndefined] (val x: Self) extends AnyVal {
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setJsonrpc(value: Unit): Self = StObject.set(x, "jsonrpc", value.asInstanceOf[js.Any])
    
    inline def setResult(value: String): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}
