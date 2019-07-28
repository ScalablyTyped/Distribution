package typings.oauth2DashServer.oauth2DashServerMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An interface representing the authorization code and associated data.
  */
trait AuthorizationCode
  extends /* key */ StringDictionary[js.Any] {
  var authorizationCode: String
  var client: Client
  var expiresAt: Date
  var redirectUri: String
  var scope: js.UndefOr[String | js.Array[String]] = js.undefined
  var user: User
}

object AuthorizationCode {
  @scala.inline
  def apply(
    authorizationCode: String,
    client: Client,
    expiresAt: Date,
    redirectUri: String,
    user: User,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    scope: String | js.Array[String] = null
  ): AuthorizationCode = {
    val __obj = js.Dynamic.literal(authorizationCode = authorizationCode, client = client, expiresAt = expiresAt, redirectUri = redirectUri, user = user)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthorizationCode]
  }
}

