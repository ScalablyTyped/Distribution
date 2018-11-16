package typings
package passportDashGoogleDashOauthLib.passportDashGoogleDashOauthMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("passport-google-oauth", "OAuthStrategy")
@js.native
class OAuthStrategy protected ()
  extends passportLib.passportMod.passportNs.Strategy {
  def this(options: IOAuthStrategyOption, verify: js.Function4[
      /* accessToken */ java.lang.String, 
      /* refreshToken */ java.lang.String, 
      /* profile */ Profile, 
      /* done */ VerifyFunction, 
      scala.Unit
    ]) = this()
  @JSName("name")
  var name_OAuthStrategy: java.lang.String = js.native
  def authenticate(req: expressLib.expressMod.eNs.Request): scala.Unit = js.native
  def authenticate(req: expressLib.expressMod.eNs.Request, options: js.Object): scala.Unit = js.native
}

