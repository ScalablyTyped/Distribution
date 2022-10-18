package typings.metamaskUtils.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorIdJsonrpc extends StObject {
  
  var error: Unit
  
  var id: Unit
  
  var jsonrpc: Unit
}
object ErrorIdJsonrpc {
  
  inline def apply(error: Unit, id: Unit, jsonrpc: Unit): ErrorIdJsonrpc = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], jsonrpc = jsonrpc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorIdJsonrpc]
  }
  
  extension [Self <: ErrorIdJsonrpc](x: Self) {
    
    inline def setError(value: Unit): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setId(value: Unit): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setJsonrpc(value: Unit): Self = StObject.set(x, "jsonrpc", value.asInstanceOf[js.Any])
  }
}
