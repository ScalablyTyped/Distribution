package typings.oauth2Server

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<oauth2-server.oauth2-server.AuthorizationCode, 'authorizationCode' | 'expiresAt' | 'redirectUri' | 'scope'> */
trait PickAuthorizationCodeauth extends js.Object {
  var authorizationCode: String
  var expiresAt: Date
  var redirectUri: String
  var scope: js.UndefOr[String | js.Array[String]] = js.undefined
}

object PickAuthorizationCodeauth {
  @scala.inline
  def apply(
    authorizationCode: String,
    expiresAt: Date,
    redirectUri: String,
    scope: String | js.Array[String] = null
  ): PickAuthorizationCodeauth = {
    val __obj = js.Dynamic.literal(authorizationCode = authorizationCode.asInstanceOf[js.Any], expiresAt = expiresAt.asInstanceOf[js.Any], redirectUri = redirectUri.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickAuthorizationCodeauth]
  }
}

