package typings.metamaskUtils.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Params extends StObject {
  
  var jsonrpc: String
  
  var method: String
  
  var params: Foo
}
object Params {
  
  inline def apply(jsonrpc: String, method: String, params: Foo): Params = {
    val __obj = js.Dynamic.literal(jsonrpc = jsonrpc.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.asInstanceOf[Params]
  }
  
  extension [Self <: Params](x: Self) {
    
    inline def setJsonrpc(value: String): Self = StObject.set(x, "jsonrpc", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setParams(value: Foo): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
  }
}
