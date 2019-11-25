package typings.oauth2DashServer.oauth2DashServerMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An interface representing the refresh token and associated data.
  */
trait RefreshToken
  extends /* key */ StringDictionary[js.Any] {
  var client: Client
  var refreshToken: String
  var refreshTokenExpiresAt: js.UndefOr[Date] = js.undefined
  var scope: js.UndefOr[String | js.Array[String]] = js.undefined
  var user: User
}

object RefreshToken {
  @scala.inline
  def apply(
    client: Client,
    refreshToken: String,
    user: User,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    refreshTokenExpiresAt: Date = null,
    scope: String | js.Array[String] = null
  ): RefreshToken = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], refreshToken = refreshToken.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (refreshTokenExpiresAt != null) __obj.updateDynamic("refreshTokenExpiresAt")(refreshTokenExpiresAt.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefreshToken]
  }
}

