package typings.microsoftAjax.Sys

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides a class for command events.
  * Event handlers can use the cancel property to cancel the operation in progress. The semantics of canceling an event depend on the event source.
  * @see {@link http://msdn.microsoft.com/en-us/library/dd393715(v=vs.100).aspx
  */
trait CommandEventArgs
  extends StObject
     with EventArgs {
  
  /**
    * Gets a value that represents the command argument.
    */
  def get_commandArgument(): js.Any
  
  //#endregion
  //#region Properties
  /**
    * Gets a string that specifies the command name.
    */
  def get_commandName(): String
  
  /**
    * Gets a value that represents the command source.
    */
  def get_commandSource(): js.Any
}
object CommandEventArgs {
  
  inline def apply(
    Empty: EventArgs,
    get_commandArgument: () => js.Any,
    get_commandName: () => String,
    get_commandSource: () => js.Any
  ): CommandEventArgs = {
    val __obj = js.Dynamic.literal(Empty = Empty.asInstanceOf[js.Any], get_commandArgument = js.Any.fromFunction0(get_commandArgument), get_commandName = js.Any.fromFunction0(get_commandName), get_commandSource = js.Any.fromFunction0(get_commandSource))
    __obj.asInstanceOf[CommandEventArgs]
  }
  
  extension [Self <: CommandEventArgs](x: Self) {
    
    inline def setGet_commandArgument(value: () => js.Any): Self = StObject.set(x, "get_commandArgument", js.Any.fromFunction0(value))
    
    inline def setGet_commandName(value: () => String): Self = StObject.set(x, "get_commandName", js.Any.fromFunction0(value))
    
    inline def setGet_commandSource(value: () => js.Any): Self = StObject.set(x, "get_commandSource", js.Any.fromFunction0(value))
  }
}
