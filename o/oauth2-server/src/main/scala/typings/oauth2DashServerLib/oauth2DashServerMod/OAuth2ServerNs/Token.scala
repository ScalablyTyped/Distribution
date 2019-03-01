package typings
package oauth2DashServerLib.oauth2DashServerMod.OAuth2ServerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An interface representing the token(s) and associated data.
  */
trait Token
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var accessToken: java.lang.String
  var accessTokenExpiresAt: js.UndefOr[stdLib.Date] = js.undefined
  var client: Client
  var refreshToken: js.UndefOr[java.lang.String] = js.undefined
  var refreshTokenExpiresAt: js.UndefOr[stdLib.Date] = js.undefined
  var scope: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var user: User
}

object Token {
  @scala.inline
  def apply(
    accessToken: java.lang.String,
    client: Client,
    user: User,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    accessTokenExpiresAt: stdLib.Date = null,
    refreshToken: java.lang.String = null,
    refreshTokenExpiresAt: stdLib.Date = null,
    scope: java.lang.String | js.Array[java.lang.String] = null
  ): Token = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("accessToken")(accessToken)
    __obj.updateDynamic("client")(client)
    __obj.updateDynamic("user")(user)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (accessTokenExpiresAt != null) __obj.updateDynamic("accessTokenExpiresAt")(accessTokenExpiresAt)
    if (refreshToken != null) __obj.updateDynamic("refreshToken")(refreshToken)
    if (refreshTokenExpiresAt != null) __obj.updateDynamic("refreshTokenExpiresAt")(refreshTokenExpiresAt)
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
}

