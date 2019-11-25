package typings.nodemailerDashSmtpDashPool.nodemailerDashSmtpDashPoolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthOptions extends js.Object {
  var pass: js.UndefOr[String] = js.undefined
  var user: js.UndefOr[String] = js.undefined
  var xoauth2: js.UndefOr[js.Any] = js.undefined
}

object AuthOptions {
  @scala.inline
  def apply(pass: String = null, user: String = null, xoauth2: js.Any = null): AuthOptions = {
    val __obj = js.Dynamic.literal()
    if (pass != null) __obj.updateDynamic("pass")(pass.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    if (xoauth2 != null) __obj.updateDynamic("xoauth2")(xoauth2.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthOptions]
  }
}

