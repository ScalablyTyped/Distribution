package typings
package passportDashOauth2Lib.passportDashOauth2Mod.OAuth2StrategyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InternalOAuthError
  extends stdLib.Error {
  var oauthError: js.Any
}

object InternalOAuthError {
  @scala.inline
  def apply(
    message: java.lang.String,
    name: java.lang.String,
    oauthError: js.Any,
    stack: java.lang.String = null
  ): InternalOAuthError = {
    val __obj = js.Dynamic.literal(message = message, name = name, oauthError = oauthError)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[InternalOAuthError]
  }
}

