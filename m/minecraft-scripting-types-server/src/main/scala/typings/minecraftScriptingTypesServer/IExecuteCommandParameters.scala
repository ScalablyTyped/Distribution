package typings.minecraftScriptingTypesServer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This event is used to execute a slash command on the server with the World Owner permission level. The event data contains the slash command as a string. The slash command will be processed and will run after the event is sent.
  */
@js.native
trait IExecuteCommandParameters extends StObject {
  
  /**
    * The command that will be run
    */
  var command: String = js.native
}
object IExecuteCommandParameters {
  
  @scala.inline
  def apply(command: String): IExecuteCommandParameters = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any])
    __obj.asInstanceOf[IExecuteCommandParameters]
  }
  
  @scala.inline
  implicit class IExecuteCommandParametersMutableBuilder[Self <: IExecuteCommandParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
  }
}
