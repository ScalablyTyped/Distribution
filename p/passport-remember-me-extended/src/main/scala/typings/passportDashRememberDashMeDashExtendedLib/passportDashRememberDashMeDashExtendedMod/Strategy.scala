package typings
package passportDashRememberDashMeDashExtendedLib.passportDashRememberDashMeDashExtendedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("passport-remember-me-extended", "Strategy")
@js.native
class Strategy protected ()
  extends passportLib.passportMod.Strategy {
  def this(verify: VerifyFunction, issue: IssueFunction) = this()
  def this(options: StrategyOptionWithRequest, verify: VerifyFunctionWithRequest, issue: IssueFunctionWithRequest) = this()
  def this(options: StrategyOption, verify: VerifyFunction, issue: IssueFunction) = this()
  def authenticate(req: expressLib.expressMod.Request): scala.Unit = js.native
  def authenticate(req: expressLib.expressMod.Request, options: passportLib.passportMod.AuthenticateOptions): scala.Unit = js.native
}

