package typings.passportDashBnet.passportDashBnetMod

import typings.passportDashOauth2.passportDashOauth2Mod.OAuth2Strategy
import typings.passportDashOauth2.passportDashOauth2Mod.VerifyFunction
import typings.passportDashOauth2.passportDashOauth2Mod.VerifyFunctionWithRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("passport-bnet", JSImport.Namespace)
@js.native
class ^ protected () extends OAuth2Strategy {
  def this(options: StrategyOptionsWithRequest, verify: VerifyFunctionWithRequest) = this()
  def this(options: StrategyOptions, verify: VerifyFunction) = this()
}

