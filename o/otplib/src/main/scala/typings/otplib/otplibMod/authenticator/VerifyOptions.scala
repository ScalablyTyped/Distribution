package typings.otplib.otplibMod.authenticator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VerifyOptions extends js.Object {
  var secret: String
  var token: String
}

object VerifyOptions {
  @scala.inline
  def apply(secret: String, token: String): VerifyOptions = {
    val __obj = js.Dynamic.literal(secret = secret, token = token)
  
    __obj.asInstanceOf[VerifyOptions]
  }
}

