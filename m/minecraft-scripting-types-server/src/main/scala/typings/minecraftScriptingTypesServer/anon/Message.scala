package typings.minecraftScriptingTypesServer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Message extends js.Object {
  var message: String
  var statusCode: Double
}

object Message {
  @scala.inline
  def apply(message: String, statusCode: Double): Message = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Message]
  }
}

