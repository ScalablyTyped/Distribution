package typings.metamaskUtils.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorCodeMessageIdUndefined extends StObject {
  
  var error: CodeMessage
  
  var id: Unit
  
  var jsonrpc: String
}
object ErrorCodeMessageIdUndefined {
  
  inline def apply(error: CodeMessage, id: Unit, jsonrpc: String): ErrorCodeMessageIdUndefined = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], jsonrpc = jsonrpc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorCodeMessageIdUndefined]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ErrorCodeMessageIdUndefined] (val x: Self) extends AnyVal {
    
    inline def setError(value: CodeMessage): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setId(value: Unit): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setJsonrpc(value: String): Self = StObject.set(x, "jsonrpc", value.asInstanceOf[js.Any])
  }
}
