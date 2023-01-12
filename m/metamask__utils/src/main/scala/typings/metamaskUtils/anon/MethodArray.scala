package typings.metamaskUtils.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MethodArray extends StObject {
  
  var id: Double
  
  var jsonrpc: String
  
  var method: js.Array[scala.Nothing]
  
  var params: Unit
}
object MethodArray {
  
  inline def apply(id: Double, jsonrpc: String, method: js.Array[scala.Nothing], params: Unit): MethodArray = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], jsonrpc = jsonrpc.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.asInstanceOf[MethodArray]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MethodArray] (val x: Self) extends AnyVal {
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setJsonrpc(value: String): Self = StObject.set(x, "jsonrpc", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: js.Array[scala.Nothing]): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodVarargs(value: scala.Nothing*): Self = StObject.set(x, "method", js.Array(value*))
    
    inline def setParams(value: Unit): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
  }
}
