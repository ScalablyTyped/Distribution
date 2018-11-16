package typings
package microsoftDashAjaxLib.SysNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
    * Provides a class for command events.
    * Event handlers can use the cancel property to cancel the operation in progress. The semantics of canceling an event depend on the event source.
    * @see {@link http://msdn.microsoft.com/en-us/library/dd393715(v=vs.100).aspx
    */
@JSGlobal("Sys.CommandEventArgs")
@js.native
class CommandEventArgs protected () extends EventArgs {
  //#region Constructors
  def this(commandName: java.lang.String, commandArgument: js.Any, commandSource: js.Any) = this()
  /**
          * Gets a value that represents the command argument.
          */
  def get_commandArgument(): js.Any = js.native
  //#endregion
  //#region Properties
  /**
          * Gets a string that specifies the command name.
          */
  def get_commandName(): java.lang.String = js.native
  /**
          * Gets a value that represents the command source.
          */
  def get_commandSource(): js.Any = js.native
}

