package typings.passportDashKakao.passportDashKakaoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("passport-kakao", "Strategy")
@js.native
class Strategy protected ()
  extends typings.passport.passportMod.Strategy {
  def this(options: StrategyOptionWithRequest, verify: VerifyFunctionWithRequest) = this()
  def this(options: StrategyOption, verify: VerifyFunction) = this()
  def userProfile(accessToken: String, done: js.Function2[/* error */ js.Any, /* user */ js.UndefOr[js.Any], Unit]): Unit = js.native
}

