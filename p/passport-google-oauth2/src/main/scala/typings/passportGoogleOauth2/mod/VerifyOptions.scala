package typings.passportGoogleOauth2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VerifyOptions extends js.Object {
  var message: String
}

object VerifyOptions {
  @scala.inline
  def apply(message: String): VerifyOptions = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VerifyOptions]
  }
}

