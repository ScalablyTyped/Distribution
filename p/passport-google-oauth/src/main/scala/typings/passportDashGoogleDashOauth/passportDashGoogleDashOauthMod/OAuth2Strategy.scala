package typings.passportDashGoogleDashOauth.passportDashGoogleDashOauthMod

import typings.express.expressMod.Request
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import typings.passport.passportMod.Strategy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("passport-google-oauth", "OAuth2Strategy")
@js.native
class OAuth2Strategy protected () extends Strategy {
  def this(
    options: IOAuth2StrategyOptionWithRequest,
    verify: js.Function5[
        /* req */ Request[ParamsDictionary], 
        /* accessToken */ String, 
        /* refreshToken */ String, 
        /* profile */ Profile, 
        /* done */ VerifyFunction, 
        Unit
      ]
  ) = this()
  def this(
    options: IOAuth2StrategyOption,
    verify: js.Function4[
        /* accessToken */ String, 
        /* refreshToken */ String, 
        /* profile */ Profile, 
        /* done */ VerifyFunction, 
        Unit
      ]
  ) = this()
  @JSName("name")
  var name_OAuth2Strategy: String = js.native
  def authenticate(req: Request[ParamsDictionary]): Unit = js.native
  def authenticate(req: Request[ParamsDictionary], options: js.Object): Unit = js.native
}

