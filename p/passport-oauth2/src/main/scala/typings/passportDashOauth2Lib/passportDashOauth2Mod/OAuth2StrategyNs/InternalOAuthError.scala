package typings
package passportDashOauth2Lib.passportDashOauth2Mod.OAuth2StrategyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InternalOAuthError
  extends nodeLib.Error {
  var oauthError: js.Any
}

object InternalOAuthError {
  @scala.inline
  def apply(oauthError: js.Any, stack: java.lang.String = null): InternalOAuthError = {
    val __obj = js.Dynamic.literal(oauthError = oauthError)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[InternalOAuthError]
  }
}

