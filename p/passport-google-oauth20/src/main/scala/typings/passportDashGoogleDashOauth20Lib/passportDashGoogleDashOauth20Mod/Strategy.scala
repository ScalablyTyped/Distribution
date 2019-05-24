package typings
package passportDashGoogleDashOauth20Lib.passportDashGoogleDashOauth20Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("passport-google-oauth20", "Strategy")
@js.native
class Strategy protected ()
  extends passportDashOauth2Lib.passportDashOauth2Mod.Strategy {
  def this(options: StrategyOptionsWithRequest, verify: js.Function5[
      /* req */ expressLib.expressMod.Request, 
      /* accessToken */ java.lang.String, 
      /* refreshToken */ java.lang.String, 
      /* profile */ Profile, 
      /* done */ passportDashOauth2Lib.passportDashOauth2Mod.VerifyCallback, 
      scala.Unit
    ]) = this()
  def this(options: StrategyOptions, verify: js.Function4[
      /* accessToken */ java.lang.String, 
      /* refreshToken */ java.lang.String, 
      /* profile */ Profile, 
      /* done */ passportDashOauth2Lib.passportDashOauth2Mod.VerifyCallback, 
      scala.Unit
    ]) = this()
}

