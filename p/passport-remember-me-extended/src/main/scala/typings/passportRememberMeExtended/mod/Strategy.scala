package typings.passportRememberMeExtended.mod

import typings.express.mod.Request_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.passport.mod.AuthenticateOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("passport-remember-me-extended", "Strategy")
@js.native
class Strategy protected ()
  extends typings.passport.mod.Strategy {
  def this(verify: VerifyFunction, issue: IssueFunction) = this()
  def this(
    options: StrategyOptionWithRequest,
    verify: VerifyFunctionWithRequest,
    issue: IssueFunctionWithRequest
  ) = this()
  def this(options: StrategyOption, verify: VerifyFunction, issue: IssueFunction) = this()
  def authenticate(req: Request_[ParamsDictionary], options: AuthenticateOptions): Unit = js.native
}

