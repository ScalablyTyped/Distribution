package typings
package passportDashLinkedinDashOauth2Lib.passportDashLinkedinDashOauth2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthenticateOptions extends js.Object {
  var authType: js.UndefOr[java.lang.String] = js.undefined
}

object AuthenticateOptions {
  @scala.inline
  def apply(authType: java.lang.String = null): AuthenticateOptions = {
    val __obj = js.Dynamic.literal()
    if (authType != null) __obj.updateDynamic("authType")(authType)
    __obj.asInstanceOf[AuthenticateOptions]
  }
}

