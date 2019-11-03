package typings.passportDashGoogleDashOauth.passportDashGoogleDashOauthMod

import typings.express.expressMod.Request
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import typings.passport.passportMod.Strategy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("passport-google-oauth", "OAuthStrategy")
@js.native
class OAuthStrategy protected () extends Strategy {
  def this(
    options: IOAuthStrategyOption,
    verify: js.Function4[
        /* accessToken */ String, 
        /* refreshToken */ String, 
        /* profile */ Profile, 
        /* done */ VerifyFunction, 
        Unit
      ]
  ) = this()
  @JSName("name")
  var name_OAuthStrategy: String = js.native
  def authenticate(req: Request[ParamsDictionary]): Unit = js.native
  def authenticate(req: Request[ParamsDictionary], options: js.Object): Unit = js.native
}

