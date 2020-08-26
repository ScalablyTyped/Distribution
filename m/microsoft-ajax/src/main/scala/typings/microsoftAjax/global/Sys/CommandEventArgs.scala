package typings.microsoftAjax.global.Sys

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
class CommandEventArgs protected ()
  extends typings.microsoftAjax.Sys.CommandEventArgs {
  //#region Constructors
  def this(commandName: String, commandArgument: js.Any, commandSource: js.Any) = this()
}

