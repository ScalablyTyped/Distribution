package typings.nodeDownloaderHelper.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorStats extends StObject {
  
  /** Http body response if available */
  var body: js.UndefOr[String] = js.undefined
  
  /** Error message */
  var message: String
  
  /** Http status response if available */
  var status: js.UndefOr[Double] = js.undefined
}
object ErrorStats {
  
  inline def apply(message: String): ErrorStats = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorStats]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ErrorStats] (val x: Self) extends AnyVal {
    
    inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
