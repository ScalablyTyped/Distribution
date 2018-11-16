package typings
package passportDashGithub2Lib.passportDashGithub2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("passport-github2", "Strategy")
@js.native
class Strategy protected ()
  extends passportDashOauth2Lib.passportDashOauth2Mod.OAuth2StrategyNs.Strategy {
  def this(options: StrategyOptionsWithRequest, verify: passportDashOauth2Lib.passportDashOauth2Mod.OAuth2StrategyNs.VerifyFunctionWithRequest) = this()
  def this(options: StrategyOptions, verify: passportDashOauth2Lib.passportDashOauth2Mod.OAuth2StrategyNs.VerifyFunction) = this()
  @JSName("name")
  var name_Strategy: java.lang.String = js.native
  def authenticate(
    req: expressLib.expressMod.eNs.Request,
    options: passportLib.passportMod.passportNs.AuthenticateOptions
  ): scala.Unit = js.native
}

