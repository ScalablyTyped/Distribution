package typings.oauth2DashServer.oauth2DashServerMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An interface representing the token(s) and associated data.
  */
trait Token
  extends /* key */ StringDictionary[js.Any] {
  var accessToken: String
  var accessTokenExpiresAt: js.UndefOr[Date] = js.undefined
  var client: Client
  var refreshToken: js.UndefOr[String] = js.undefined
  var refreshTokenExpiresAt: js.UndefOr[Date] = js.undefined
  var scope: js.UndefOr[String | js.Array[String]] = js.undefined
  var user: User
}

object Token {
  @scala.inline
  def apply(
    accessToken: String,
    client: Client,
    user: User,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    accessTokenExpiresAt: Date = null,
    refreshToken: String = null,
    refreshTokenExpiresAt: Date = null,
    scope: String | js.Array[String] = null
  ): Token = {
    val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any], client = client.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (accessTokenExpiresAt != null) __obj.updateDynamic("accessTokenExpiresAt")(accessTokenExpiresAt.asInstanceOf[js.Any])
    if (refreshToken != null) __obj.updateDynamic("refreshToken")(refreshToken.asInstanceOf[js.Any])
    if (refreshTokenExpiresAt != null) __obj.updateDynamic("refreshTokenExpiresAt")(refreshTokenExpiresAt.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
}

