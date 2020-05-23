package typings.microsoftAjax.Sys

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides a class for command events.
  * Event handlers can use the cancel property to cancel the operation in progress. The semantics of canceling an event depend on the event source.
  * @see {@link http://msdn.microsoft.com/en-us/library/dd393715(v=vs.100).aspx
  */
trait CommandEventArgs extends EventArgs {
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
}

