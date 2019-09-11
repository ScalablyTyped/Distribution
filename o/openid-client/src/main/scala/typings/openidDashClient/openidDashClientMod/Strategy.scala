package typings.openidDashClient.openidDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openid-client", "Strategy")
@js.native
class Strategy[TUser, TClient /* <: Client */] protected () extends js.Object {
  def this(
    options: StrategyOptions[TClient],
    verify: StrategyVerifyCallbackReq[TUser] | StrategyVerifyCallbackUserInfo[TUser]
  ) = this()
  def this(options: StrategyOptions[TClient], verify: StrategyVerifyCallback[TUser]) = this()
  def this(options: StrategyOptions[TClient], verify: StrategyVerifyCallbackReqUserInfo[TUser]) = this()
}

