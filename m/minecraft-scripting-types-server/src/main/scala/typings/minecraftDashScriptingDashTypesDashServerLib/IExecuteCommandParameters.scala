package typings
package minecraftDashScriptingDashTypesDashServerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This event is used to execute a slash command on the server with the World Owner permission level. The event data contains the slash command as a string. The slash command will be processed and will run after the event is sent.
  */
trait IExecuteCommandParameters extends js.Object {
  /**
    * The command that will be run
    */
  var command: java.lang.String
}

object IExecuteCommandParameters {
  @scala.inline
  def apply(command: java.lang.String): IExecuteCommandParameters = {
    val __obj = js.Dynamic.literal(command = command)
  
    __obj.asInstanceOf[IExecuteCommandParameters]
  }
}

