package typings.onfidoSdkUi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SdkError extends StObject {
  
  var message: String
  
  var `type`: FatalErrorTypes
}
object SdkError {
  
  inline def apply(message: String, `type`: FatalErrorTypes): SdkError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SdkError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SdkError] (val x: Self) extends AnyVal {
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setType(value: FatalErrorTypes): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
