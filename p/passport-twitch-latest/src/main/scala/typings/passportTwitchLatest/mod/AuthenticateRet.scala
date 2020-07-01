package typings.passportTwitchLatest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthenticateRet extends js.Object {
  var force_verify: js.UndefOr[Boolean] = js.undefined
}

object AuthenticateRet {
  @scala.inline
  def apply(force_verify: js.UndefOr[Boolean] = js.undefined): AuthenticateRet = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(force_verify)) __obj.updateDynamic("force_verify")(force_verify.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthenticateRet]
  }
}

