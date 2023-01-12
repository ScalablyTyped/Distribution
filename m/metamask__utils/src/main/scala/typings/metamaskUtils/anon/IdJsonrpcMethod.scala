package typings.metamaskUtils.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdJsonrpcMethod extends StObject {
  
  var id: Unit
  
  var jsonrpc: String
  
  var params: Unit
}
object IdJsonrpcMethod {
  
  inline def apply(id: Unit, jsonrpc: String, params: Unit): IdJsonrpcMethod = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], jsonrpc = jsonrpc.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdJsonrpcMethod]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IdJsonrpcMethod] (val x: Self) extends AnyVal {
    
    inline def setId(value: Unit): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setJsonrpc(value: String): Self = StObject.set(x, "jsonrpc", value.asInstanceOf[js.Any])
    
    inline def setParams(value: Unit): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
  }
}
