package typings
package passportDashGithubLib.passportDashGithubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("passport-github", "Strategy")
@js.native
class Strategy protected ()
  extends passportLib.passportMod.passportNs.Strategy {
  def this(options: StrategyOptionWithRequest, verify: js.Function5[
      /* req */ expressLib.expressMod.eNs.Request, 
      /* accessToken */ java.lang.String, 
      /* refreshToken */ java.lang.String, 
      /* profile */ Profile, 
      /* done */ js.Function2[/* error */ js.Any, /* user */ js.UndefOr[js.Any], scala.Unit], 
      scala.Unit
    ]) = this()
  def this(options: StrategyOption, verify: js.Function4[
      /* accessToken */ java.lang.String, 
      /* refreshToken */ java.lang.String, 
      /* profile */ Profile, 
      /* done */ js.Function2[/* error */ js.Any, /* user */ js.UndefOr[js.Any], scala.Unit], 
      scala.Unit
    ]) = this()
  @JSName("name")
  var name_Strategy: java.lang.String = js.native
  def authenticate(req: expressLib.expressMod.eNs.Request): scala.Unit = js.native
  def authenticate(
    req: expressLib.expressMod.eNs.Request,
    options: passportLib.passportMod.passportNs.AuthenticateOptions
  ): scala.Unit = js.native
  def userProfile(accessToken: java.lang.String): scala.Unit = js.native
  def userProfile(
    accessToken: java.lang.String,
    done: js.Function2[/* error */ js.Any, /* profile */ Profile, scala.Unit]
  ): scala.Unit = js.native
}

