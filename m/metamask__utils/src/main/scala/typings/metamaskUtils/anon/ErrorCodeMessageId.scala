package typings.metamaskUtils.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorCodeMessageId extends StObject {
  
  var error: CodeMessage
  
  var jsonrpc: String
}
object ErrorCodeMessageId {
  
  inline def apply(error: CodeMessage, jsonrpc: String): ErrorCodeMessageId = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], jsonrpc = jsonrpc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorCodeMessageId]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ErrorCodeMessageId] (val x: Self) extends AnyVal {
    
    inline def setError(value: CodeMessage): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setJsonrpc(value: String): Self = StObject.set(x, "jsonrpc", value.asInstanceOf[js.Any])
  }
}
