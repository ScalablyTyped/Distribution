package typings.microsoftAjax.Sys

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides a class for command events.
  * Event handlers can use the cancel property to cancel the operation in progress. The semantics of canceling an event depend on the event source.
  * @see {@link http://msdn.microsoft.com/en-us/library/dd393715(v=vs.100).aspx
  */
@js.native
trait CommandEventArgs extends EventArgs {
  
  /**
    * Gets a value that represents the command argument.
    */
  def get_commandArgument(): js.Any = js.native
  
  //#endregion
  //#region Properties
  /**
    * Gets a string that specifies the command name.
    */
  def get_commandName(): String = js.native
  
  /**
    * Gets a value that represents the command source.
    */
  def get_commandSource(): js.Any = js.native
}
object CommandEventArgs {
  
  @scala.inline
  def apply(
    Empty: EventArgs,
    get_commandArgument: () => js.Any,
    get_commandName: () => String,
    get_commandSource: () => js.Any
  ): CommandEventArgs = {
    val __obj = js.Dynamic.literal(Empty = Empty.asInstanceOf[js.Any], get_commandArgument = js.Any.fromFunction0(get_commandArgument), get_commandName = js.Any.fromFunction0(get_commandName), get_commandSource = js.Any.fromFunction0(get_commandSource))
    __obj.asInstanceOf[CommandEventArgs]
  }
  
  @scala.inline
  implicit class CommandEventArgsOps[Self <: CommandEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGet_commandArgument(value: () => js.Any): Self = this.set("get_commandArgument", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_commandName(value: () => String): Self = this.set("get_commandName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_commandSource(value: () => js.Any): Self = this.set("get_commandSource", js.Any.fromFunction0(value))
  }
}
