package typings
package minecraftDashScriptingDashTypesDashServerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IExecuteCommandCallback extends js.Object {
  var command: java.lang.String
  var data: Anon_Message
}

object IExecuteCommandCallback {
  @scala.inline
  def apply(command: java.lang.String, data: Anon_Message): IExecuteCommandCallback = {
    val __obj = js.Dynamic.literal(command = command, data = data)
  
    __obj.asInstanceOf[IExecuteCommandCallback]
  }
}

