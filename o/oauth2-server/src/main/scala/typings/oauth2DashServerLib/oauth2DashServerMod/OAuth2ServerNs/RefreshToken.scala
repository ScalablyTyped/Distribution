package typings
package oauth2DashServerLib.oauth2DashServerMod.OAuth2ServerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An interface representing the refresh token and associated data.
  */
trait RefreshToken
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var client: Client
  var refreshToken: java.lang.String
  var refreshTokenExpiresAt: js.UndefOr[stdLib.Date] = js.undefined
  var scope: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var user: User
}

object RefreshToken {
  @scala.inline
  def apply(
    client: Client,
    refreshToken: java.lang.String,
    user: User,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    refreshTokenExpiresAt: stdLib.Date = null,
    scope: java.lang.String | js.Array[java.lang.String] = null
  ): RefreshToken = {
    val __obj = js.Dynamic.literal(client = client, refreshToken = refreshToken, user = user)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (refreshTokenExpiresAt != null) __obj.updateDynamic("refreshTokenExpiresAt")(refreshTokenExpiresAt)
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefreshToken]
  }
}

