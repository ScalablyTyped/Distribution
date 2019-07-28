package typings.passportDashRememberDashMeDashExtended.passportDashRememberDashMeDashExtendedMod

import typings.express.expressMod.Request
import typings.passport.passportMod.AuthenticateOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("passport-remember-me-extended", "Strategy")
@js.native
class Strategy protected ()
  extends typings.passport.passportMod.Strategy {
  def this(verify: VerifyFunction, issue: IssueFunction) = this()
  def this(
    options: StrategyOptionWithRequest,
    verify: VerifyFunctionWithRequest,
    issue: IssueFunctionWithRequest
  ) = this()
  def this(options: StrategyOption, verify: VerifyFunction, issue: IssueFunction) = this()
  def authenticate(req: Request): Unit = js.native
  def authenticate(req: Request, options: AuthenticateOptions): Unit = js.native
}

