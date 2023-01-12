package typings.metamaskUtils.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorCodeNull extends StObject {
  
  var error: CodeNull
  
  var id: Double
  
  var jsonrpc: String
}
object ErrorCodeNull {
  
  inline def apply(error: CodeNull, id: Double, jsonrpc: String): ErrorCodeNull = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], jsonrpc = jsonrpc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorCodeNull]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ErrorCodeNull] (val x: Self) extends AnyVal {
    
    inline def setError(value: CodeNull): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setJsonrpc(value: String): Self = StObject.set(x, "jsonrpc", value.asInstanceOf[js.Any])
  }
}
