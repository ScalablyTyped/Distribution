package typings.passportDashNaver.passportDashNaverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("passport-naver", "Strategy")
@js.native
class Strategy protected ()
  extends typings.passport.passportMod.Strategy {
  def this(options: StrategyOptionWithRequest, verify: VerifyFunctionWithRequest) = this()
  def this(options: StrategyOption, verify: VerifyFunction) = this()
  def authorizationParams(options: js.Any): js.Any = js.native
  def userProfile(accessToken: String, done: js.Function2[/* error */ js.Any, /* user */ js.UndefOr[js.Any], Unit]): Unit = js.native
}

