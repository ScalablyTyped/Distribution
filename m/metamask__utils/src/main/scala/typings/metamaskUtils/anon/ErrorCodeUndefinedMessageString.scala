package typings.metamaskUtils.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorCodeUndefinedMessageString extends StObject {
  
  var error: CodeUndefinedMessageString
  
  var id: Double
  
  var jsonrpc: String
}
object ErrorCodeUndefinedMessageString {
  
  inline def apply(error: CodeUndefinedMessageString, id: Double, jsonrpc: String): ErrorCodeUndefinedMessageString = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], jsonrpc = jsonrpc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorCodeUndefinedMessageString]
  }
  
  extension [Self <: ErrorCodeUndefinedMessageString](x: Self) {
    
    inline def setError(value: CodeUndefinedMessageString): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setJsonrpc(value: String): Self = StObject.set(x, "jsonrpc", value.asInstanceOf[js.Any])
  }
}
