package typings.mobileMessagingCordova.MobileMessagingCordova

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MobileMessagingError extends js.Object {
  var code: String
  var message: String
}

object MobileMessagingError {
  @scala.inline
  def apply(code: String, message: String): MobileMessagingError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[MobileMessagingError]
  }
}

