package typings
package mjmlLib.mjmlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MJMLParseError extends js.Object {
  var formattedMessage: java.lang.String
  var line: scala.Double
  var message: java.lang.String
  var tagName: java.lang.String
}

object MJMLParseError {
  @scala.inline
  def apply(
    formattedMessage: java.lang.String,
    line: scala.Double,
    message: java.lang.String,
    tagName: java.lang.String
  ): MJMLParseError = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("formattedMessage")(formattedMessage)
    __obj.updateDynamic("line")(line)
    __obj.updateDynamic("message")(message)
    __obj.updateDynamic("tagName")(tagName)
    __obj.asInstanceOf[MJMLParseError]
  }
}

