package typings.micro

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Error & {  statusCode  :number,   originalError ? :std.Error} */
trait ErrorstatusCodenumberorig extends js.Object {
  var message: String
  var name: String
  var originalError: js.UndefOr[Error] = js.undefined
  var stack: js.UndefOr[String] = js.undefined
  var statusCode: Double
}

object ErrorstatusCodenumberorig {
  @scala.inline
  def apply(
    message: String,
    name: String,
    statusCode: Double,
    originalError: Error = null,
    stack: String = null
  ): ErrorstatusCodenumberorig = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    if (originalError != null) __obj.updateDynamic("originalError")(originalError.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorstatusCodenumberorig]
  }
}

