package typings.minecraftScriptingTypesServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMessage extends js.Object {
  var message: String
  var statusCode: Double
}

object AnonMessage {
  @scala.inline
  def apply(message: String, statusCode: Double): AnonMessage = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonMessage]
  }
}

