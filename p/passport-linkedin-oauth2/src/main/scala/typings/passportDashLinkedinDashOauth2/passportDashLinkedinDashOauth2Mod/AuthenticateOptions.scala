package typings.passportDashLinkedinDashOauth2.passportDashLinkedinDashOauth2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthenticateOptions extends js.Object {
  var authType: js.UndefOr[String] = js.undefined
}

object AuthenticateOptions {
  @scala.inline
  def apply(authType: String = null): AuthenticateOptions = {
    val __obj = js.Dynamic.literal()
    if (authType != null) __obj.updateDynamic("authType")(authType)
    __obj.asInstanceOf[AuthenticateOptions]
  }
}

