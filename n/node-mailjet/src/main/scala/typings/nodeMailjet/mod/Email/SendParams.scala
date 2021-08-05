package typings.nodeMailjet.mod.Email

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// request params
trait SendParams extends StObject {
  
  var Messages: js.Array[SendParamsMessage]
  
  var SandboxMode: js.UndefOr[Boolean] = js.undefined
}
object SendParams {
  
  inline def apply(Messages: js.Array[SendParamsMessage]): SendParams = {
    val __obj = js.Dynamic.literal(Messages = Messages.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendParams]
  }
  
  extension [Self <: SendParams](x: Self) {
    
    inline def setMessages(value: js.Array[SendParamsMessage]): Self = StObject.set(x, "Messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesVarargs(value: SendParamsMessage*): Self = StObject.set(x, "Messages", js.Array(value :_*))
    
    inline def setSandboxMode(value: Boolean): Self = StObject.set(x, "SandboxMode", value.asInstanceOf[js.Any])
    
    inline def setSandboxModeUndefined: Self = StObject.set(x, "SandboxMode", js.undefined)
  }
}
