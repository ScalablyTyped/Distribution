package typings.otplib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TotpVerifyOptionsInterface extends js.Object {
  var secret: js.UndefOr[String] = js.undefined
  var token: js.UndefOr[String] = js.undefined
}

object TotpVerifyOptionsInterface {
  @scala.inline
  def apply(secret: String = null, token: String = null): TotpVerifyOptionsInterface = {
    val __obj = js.Dynamic.literal()
    if (secret != null) __obj.updateDynamic("secret")(secret.asInstanceOf[js.Any])
    if (token != null) __obj.updateDynamic("token")(token.asInstanceOf[js.Any])
    __obj.asInstanceOf[TotpVerifyOptionsInterface]
  }
}

