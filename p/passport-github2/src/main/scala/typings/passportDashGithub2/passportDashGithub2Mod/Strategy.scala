package typings.passportDashGithub2.passportDashGithub2Mod

import typings.express.expressMod.Request
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import typings.passport.passportMod.AuthenticateOptions
import typings.passportDashOauth2.passportDashOauth2Mod.VerifyFunction
import typings.passportDashOauth2.passportDashOauth2Mod.VerifyFunctionWithRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("passport-github2", "Strategy")
@js.native
class Strategy protected ()
  extends typings.passportDashOauth2.passportDashOauth2Mod.Strategy {
  def this(options: StrategyOptionsWithRequest, verify: VerifyFunctionWithRequest) = this()
  def this(options: StrategyOptions, verify: VerifyFunction) = this()
  def authenticate(req: Request[ParamsDictionary], options: AuthenticateOptions): Unit = js.native
}

