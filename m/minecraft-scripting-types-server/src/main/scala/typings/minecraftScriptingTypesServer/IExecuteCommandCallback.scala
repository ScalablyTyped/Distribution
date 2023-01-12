package typings.minecraftScriptingTypesServer

import typings.minecraftScriptingTypesServer.anon.Message
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IExecuteCommandCallback extends StObject {
  
  var command: String
  
  var data: Message
}
object IExecuteCommandCallback {
  
  inline def apply(command: String, data: Message): IExecuteCommandCallback = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[IExecuteCommandCallback]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IExecuteCommandCallback] (val x: Self) extends AnyVal {
    
    inline def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    inline def setData(value: Message): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
