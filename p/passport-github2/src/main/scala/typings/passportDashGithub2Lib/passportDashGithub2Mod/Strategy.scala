package typings
package passportDashGithub2Lib.passportDashGithub2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("passport-github2", "Strategy")
@js.native
class Strategy protected ()
  extends passportDashOauth2Lib.passportDashOauth2Mod.Strategy {
  def this(options: StrategyOptionsWithRequest, verify: passportDashOauth2Lib.passportDashOauth2Mod.VerifyFunctionWithRequest) = this()
  def this(options: StrategyOptions, verify: passportDashOauth2Lib.passportDashOauth2Mod.VerifyFunction) = this()
  def authenticate(req: expressLib.expressMod.Request, options: passportLib.passportMod.AuthenticateOptions): scala.Unit = js.native
}

