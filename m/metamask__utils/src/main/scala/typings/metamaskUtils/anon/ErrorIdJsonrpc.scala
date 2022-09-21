package typings.metamaskUtils.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorIdJsonrpc extends StObject {
  
  var error: Message
  
  var id: String
  
  var jsonrpc: String
}
object ErrorIdJsonrpc {
  
  inline def apply(error: Message, id: String, jsonrpc: String): ErrorIdJsonrpc = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], jsonrpc = jsonrpc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorIdJsonrpc]
  }
  
  extension [Self <: ErrorIdJsonrpc](x: Self) {
    
    inline def setError(value: Message): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setJsonrpc(value: String): Self = StObject.set(x, "jsonrpc", value.asInstanceOf[js.Any])
  }
}
