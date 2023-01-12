package typings.metamaskUtils.anon

import typings.metamaskUtils.metamaskUtilsStrings.`2Dot0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorDataMessage extends StObject {
  
  var error: DataMessage
  
  var id: String | Double | Null
  
  var jsonrpc: `2Dot0`
}
object ErrorDataMessage {
  
  inline def apply(error: DataMessage): ErrorDataMessage = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], jsonrpc = "2.0", id = null)
    __obj.asInstanceOf[ErrorDataMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ErrorDataMessage] (val x: Self) extends AnyVal {
    
    inline def setError(value: DataMessage): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setJsonrpc(value: `2Dot0`): Self = StObject.set(x, "jsonrpc", value.asInstanceOf[js.Any])
  }
}
