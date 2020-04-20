package typings.minecraftScriptingTypesServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IExecuteCommandCallback extends js.Object {
  var command: String
  var data: AnonMessage
}

object IExecuteCommandCallback {
  @scala.inline
  def apply(command: String, data: AnonMessage): IExecuteCommandCallback = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[IExecuteCommandCallback]
  }
}

