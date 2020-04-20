package typings.passportOauth2ClientPassword.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrategyOptionsWithRequestInterface extends js.Object {
  var passReqToCallback: Boolean
}

object StrategyOptionsWithRequestInterface {
  @scala.inline
  def apply(passReqToCallback: Boolean): StrategyOptionsWithRequestInterface = {
    val __obj = js.Dynamic.literal(passReqToCallback = passReqToCallback.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrategyOptionsWithRequestInterface]
  }
}

