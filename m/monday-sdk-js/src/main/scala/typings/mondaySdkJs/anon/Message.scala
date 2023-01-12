package typings.mondaySdkJs.anon

import typings.mondaySdkJs.mondaySdkJsStrings.error
import typings.mondaySdkJs.mondaySdkJsStrings.info
import typings.mondaySdkJs.mondaySdkJsStrings.success
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Message extends StObject {
  
  /**
    * The message to display
    */
  var message: String
  
  /**
    * The number of milliseconds to show the message until it closes
    * Defaults to 5000
    */
  var timeout: js.UndefOr[Double] = js.undefined
  
  /**
    * The type of message to display. Can be "success" (green), "error" (red) or "info" (blue)
    * Defaults to "info"
    */
  var `type`: js.UndefOr[success | error | info] = js.undefined
}
object Message {
  
  inline def apply(message: String): Message = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[Message]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Message] (val x: Self) extends AnyVal {
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setType(value: success | error | info): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
