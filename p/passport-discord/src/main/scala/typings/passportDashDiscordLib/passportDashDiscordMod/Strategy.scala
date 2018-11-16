package typings
package passportDashDiscordLib.passportDashDiscordMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("passport-discord", "Strategy")
@js.native
class Strategy protected ()
  extends passportLib.passportMod.passportNs.Strategy {
  def this(options: passportDashDiscordLib.passportDashDiscordMod.StrategyNs.StrategyOption, verify: js.Function4[
      /* accessToken */ java.lang.String, 
      /* refreshToken */ java.lang.String, 
      /* profile */ passportDashDiscordLib.passportDashDiscordMod.StrategyNs.Profile, 
      /* done */ js.Function2[/* error */ js.Any, /* user */ js.UndefOr[js.Any], scala.Unit], 
      scala.Unit
    ]) = this()
  @JSName("name")
  var name_Strategy: java.lang.String = js.native
  def authenticate(req: expressLib.expressMod.eNs.Request): scala.Unit = js.native
  def authenticate(req: expressLib.expressMod.eNs.Request, options: js.Object): scala.Unit = js.native
  def authorizationParams(options: js.Any): js.Any = js.native
  def checkScope(scope: js.Any, accessToken: js.Any, cb: js.Any): js.Any = js.native
  def parseErrorResponse(body: js.Any, status: js.Any): js.Any = js.native
  def tokenParams(options: js.Any): js.Any = js.native
  def userProfile(accessToken: js.Any, done: js.Any): js.Any = js.native
}

