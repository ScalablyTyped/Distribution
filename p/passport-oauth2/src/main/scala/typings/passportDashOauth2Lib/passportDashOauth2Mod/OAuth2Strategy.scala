package typings
package passportDashOauth2Lib.passportDashOauth2Mod

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
  var _oauth2: oauthLib.oauthMod.OAuth2 = js.native
  var name: java.lang.String = js.native
  def authenticate(req: expressLib.expressMod.Request): scala.Unit = js.native
  def authenticate(req: expressLib.expressMod.Request, options: js.Any): scala.Unit = js.native
  def authorizationParams(options: js.Any): js.Object = js.native
  def parseErrorResponse(body: js.Any, status: scala.Double): stdLib.Error | scala.Null = js.native
  def tokenParams(options: js.Any): js.Object = js.native
  def userProfile(
    accessToken: java.lang.String,
    done: js.Function2[
      /* err */ js.UndefOr[stdLib.Error | scala.Null], 
      /* profile */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ): scala.Unit = js.native
}

