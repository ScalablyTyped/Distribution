package typings.openfin.mod.fin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorInfo extends js.Object {
  var message: String
  var stack: String
}

object ErrorInfo {
  @scala.inline
  def apply(message: String, stack: String): ErrorInfo = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ErrorInfo]
  }
}

