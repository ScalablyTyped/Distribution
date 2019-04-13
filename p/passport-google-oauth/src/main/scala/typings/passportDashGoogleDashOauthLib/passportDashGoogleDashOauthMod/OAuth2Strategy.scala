package typings
package passportDashGoogleDashOauthLib.passportDashGoogleDashOauthMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("passport-google-oauth", "OAuth2Strategy")
@js.native
class OAuth2Strategy protected ()
  extends passportLib.passportMod.Strategy {
  def this(options: IOAuth2StrategyOptionWithRequest, verify: js.Function5[
      /* req */ expressLib.expressMod.Request, 
      /* accessToken */ java.lang.String, 
      /* refreshToken */ java.lang.String, 
      /* profile */ Profile, 
      /* done */ js.Function2[/* error */ js.Any, /* user */ js.UndefOr[js.Any], scala.Unit], 
      scala.Unit
    ]) = this()
  def this(options: IOAuth2StrategyOption, verify: js.Function4[
      /* accessToken */ java.lang.String, 
      /* refreshToken */ java.lang.String, 
      /* profile */ Profile, 
      /* done */ js.Function2[/* error */ js.Any, /* user */ js.UndefOr[js.Any], scala.Unit], 
      scala.Unit
    ]) = this()
  @JSName("name")
  var name_OAuth2Strategy: java.lang.String = js.native
  def authenticate(req: expressLib.expressMod.Request): scala.Unit = js.native
  def authenticate(req: expressLib.expressMod.Request, options: js.Object): scala.Unit = js.native
}

