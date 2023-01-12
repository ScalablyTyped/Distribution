package typings.metamaskUtils.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorMessageUndefined extends StObject {
  
  var error: MessageUndefined
  
  var id: Double
  
  var jsonrpc: String
}
object ErrorMessageUndefined {
  
  inline def apply(error: MessageUndefined, id: Double, jsonrpc: String): ErrorMessageUndefined = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], jsonrpc = jsonrpc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorMessageUndefined]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ErrorMessageUndefined] (val x: Self) extends AnyVal {
    
    inline def setError(value: MessageUndefined): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setJsonrpc(value: String): Self = StObject.set(x, "jsonrpc", value.asInstanceOf[js.Any])
  }
}
