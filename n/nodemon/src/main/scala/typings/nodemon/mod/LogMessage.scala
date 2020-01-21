package typings.nodemon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogMessage extends js.Object {
  var colour: String
  var message: String
  var `type`: String
}

object LogMessage {
  @scala.inline
  def apply(colour: String, message: String, `type`: String): LogMessage = {
    val __obj = js.Dynamic.literal(colour = colour.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogMessage]
  }
}

