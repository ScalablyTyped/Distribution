package typings.mjml.mjmlMod

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
    val __obj = js.Dynamic.literal(formattedMessage = formattedMessage, line = line, message = message, tagName = tagName)
  
    __obj.asInstanceOf[MJMLParseError]
  }
}

