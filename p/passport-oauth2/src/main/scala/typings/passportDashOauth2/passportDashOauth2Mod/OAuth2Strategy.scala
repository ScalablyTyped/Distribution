package typings.passportDashOauth2.passportDashOauth2Mod

import typings.express.expressMod.Request
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import typings.oauth.oauthMod.OAuth2
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OAuth2Strategy extends js.Object {
  /**
    *   NOTE: The _oauth2 property is considered "protected".  Subclasses are
    *         allowed to use it when making protected resource requests to retrieve
    *         the user profile.
    */
  var _oauth2: OAuth2 = js.native
  var name: String = js.native
  def authenticate(req: Request[ParamsDictionary]): Unit = js.native
  def authenticate(req: Request[ParamsDictionary], options: js.Any): Unit = js.native
  def authorizationParams(options: js.Any): js.Object = js.native
  def parseErrorResponse(body: js.Any, status: Double): Error | Null = js.native
  def tokenParams(options: js.Any): js.Object = js.native
  def userProfile(
    accessToken: String,
    done: js.Function2[/* err */ js.UndefOr[Error | Null], /* profile */ js.UndefOr[js.Any], Unit]
  ): Unit = js.native
}

