package typings.metamaskUtils.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdNumberJsonrpc extends StObject {
  
  var error: CodeMessage
  
  var id: Double
}
object IdNumberJsonrpc {
  
  inline def apply(error: CodeMessage, id: Double): IdNumberJsonrpc = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdNumberJsonrpc]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IdNumberJsonrpc] (val x: Self) extends AnyVal {
    
    inline def setError(value: CodeMessage): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
