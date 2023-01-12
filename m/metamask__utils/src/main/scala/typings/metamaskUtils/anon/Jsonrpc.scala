package typings.metamaskUtils.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Jsonrpc extends StObject {
  
  var jsonrpc: String
  
  var method: String
  
  var params: Unit
}
object Jsonrpc {
  
  inline def apply(jsonrpc: String, method: String, params: Unit): Jsonrpc = {
    val __obj = js.Dynamic.literal(jsonrpc = jsonrpc.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.asInstanceOf[Jsonrpc]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Jsonrpc] (val x: Self) extends AnyVal {
    
    inline def setJsonrpc(value: String): Self = StObject.set(x, "jsonrpc", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setParams(value: Unit): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
  }
}
