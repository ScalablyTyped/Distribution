package typings.minecraftScriptingTypesServer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This event is used to execute a slash command on the server with the World Owner permission level. The event data contains the slash command as a string. The slash command will be processed and will run after the event is sent.
  */
trait IExecuteCommandParameters extends StObject {
  
  /**
    * The command that will be run
    */
  var command: String
}
object IExecuteCommandParameters {
  
  inline def apply(command: String): IExecuteCommandParameters = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any])
    __obj.asInstanceOf[IExecuteCommandParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IExecuteCommandParameters] (val x: Self) extends AnyVal {
    
    inline def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
  }
}
