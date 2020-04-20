package typings.microsoftLiveConnect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCode extends js.Object {
  /**
    * The error code.
    */
  var code: String
  /**
    * The error message.
    */
  var message: String
}

object AnonCode {
  @scala.inline
  def apply(code: String, message: String): AnonCode = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCode]
  }
}

