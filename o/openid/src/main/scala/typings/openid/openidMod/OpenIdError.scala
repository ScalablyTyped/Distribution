package typings.openid.openidMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenIdError extends js.Object {
  var message: String
}

object OpenIdError {
  @scala.inline
  def apply(message: String): OpenIdError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OpenIdError]
  }
}

