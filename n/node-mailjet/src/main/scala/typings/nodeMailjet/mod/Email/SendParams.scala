package typings.nodeMailjet.mod.Email

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// request params
@js.native
trait SendParams extends StObject {
  
  var Messages: js.Array[SendParamsMessage] = js.native
  
  var SandboxMode: js.UndefOr[Boolean] = js.native
}
object SendParams {
  
  @scala.inline
  def apply(Messages: js.Array[SendParamsMessage]): SendParams = {
    val __obj = js.Dynamic.literal(Messages = Messages.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendParams]
  }
  
  @scala.inline
  implicit class SendParamsMutableBuilder[Self <: SendParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessages(value: js.Array[SendParamsMessage]): Self = StObject.set(x, "Messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessagesVarargs(value: SendParamsMessage*): Self = StObject.set(x, "Messages", js.Array(value :_*))
    
    @scala.inline
    def setSandboxMode(value: Boolean): Self = StObject.set(x, "SandboxMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSandboxModeUndefined: Self = StObject.set(x, "SandboxMode", js.undefined)
  }
}
