package typings.metamaskUtils.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorMessageNull extends StObject {
  
  var error: MessageNull
  
  var id: Double
  
  var jsonrpc: String
}
object ErrorMessageNull {
  
  inline def apply(error: MessageNull, id: Double, jsonrpc: String): ErrorMessageNull = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], jsonrpc = jsonrpc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorMessageNull]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ErrorMessageNull] (val x: Self) extends AnyVal {
    
    inline def setError(value: MessageNull): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setJsonrpc(value: String): Self = StObject.set(x, "jsonrpc", value.asInstanceOf[js.Any])
  }
}
