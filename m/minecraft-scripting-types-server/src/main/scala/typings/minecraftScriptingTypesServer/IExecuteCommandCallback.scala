package typings.minecraftScriptingTypesServer

import typings.minecraftScriptingTypesServer.anon.Message
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IExecuteCommandCallback extends StObject {
  
  var command: String = js.native
  
  var data: Message = js.native
}
object IExecuteCommandCallback {
  
  @scala.inline
  def apply(command: String, data: Message): IExecuteCommandCallback = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[IExecuteCommandCallback]
  }
  
  @scala.inline
  implicit class IExecuteCommandCallbackMutableBuilder[Self <: IExecuteCommandCallback] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: Message): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
