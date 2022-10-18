package typings.metamaskUtils.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorId extends StObject {
  
  var error: Stack
  
  var id: String
  
  var jsonrpc: String
}
object ErrorId {
  
  inline def apply(error: Stack, id: String, jsonrpc: String): ErrorId = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], jsonrpc = jsonrpc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorId]
  }
  
  extension [Self <: ErrorId](x: Self) {
    
    inline def setError(value: Stack): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setJsonrpc(value: String): Self = StObject.set(x, "jsonrpc", value.asInstanceOf[js.Any])
  }
}
