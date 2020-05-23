package typings.phonegap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobalizationError extends js.Object {
  var code: Double
  var message: String
}

object GlobalizationError {
  @scala.inline
  def apply(code: Double, message: String): GlobalizationError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalizationError]
  }
}

