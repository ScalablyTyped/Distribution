package typings.mjml.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MJMLParseError extends js.Object {
  var formattedMessage: String
  var line: Double
  var message: String
  var tagName: String
}

object MJMLParseError {
  @scala.inline
  def apply(formattedMessage: String, line: Double, message: String, tagName: String): MJMLParseError = {
    val __obj = js.Dynamic.literal(formattedMessage = formattedMessage.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], tagName = tagName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MJMLParseError]
  }
}

