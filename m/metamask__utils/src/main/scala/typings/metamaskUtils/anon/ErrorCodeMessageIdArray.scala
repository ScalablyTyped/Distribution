package typings.metamaskUtils.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorCodeMessageIdArray extends StObject {
  
  var error: CodeMessage
  
  var id: js.Array[scala.Nothing]
  
  var jsonrpc: String
}
object ErrorCodeMessageIdArray {
  
  inline def apply(error: CodeMessage, id: js.Array[scala.Nothing], jsonrpc: String): ErrorCodeMessageIdArray = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], jsonrpc = jsonrpc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorCodeMessageIdArray]
  }
  
  extension [Self <: ErrorCodeMessageIdArray](x: Self) {
    
    inline def setError(value: CodeMessage): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setId(value: js.Array[scala.Nothing]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdVarargs(value: scala.Nothing*): Self = StObject.set(x, "id", js.Array(value*))
    
    inline def setJsonrpc(value: String): Self = StObject.set(x, "jsonrpc", value.asInstanceOf[js.Any])
  }
}
