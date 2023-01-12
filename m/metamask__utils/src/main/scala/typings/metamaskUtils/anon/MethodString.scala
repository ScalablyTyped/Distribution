package typings.metamaskUtils.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MethodString extends StObject {
  
  var id: Unit
  
  var jsonrpc: String
  
  var method: String
  
  var params: Boolean
}
object MethodString {
  
  inline def apply(id: Unit, jsonrpc: String, method: String, params: Boolean): MethodString = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], jsonrpc = jsonrpc.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.asInstanceOf[MethodString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MethodString] (val x: Self) extends AnyVal {
    
    inline def setId(value: Unit): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setJsonrpc(value: String): Self = StObject.set(x, "jsonrpc", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setParams(value: Boolean): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
  }
}
