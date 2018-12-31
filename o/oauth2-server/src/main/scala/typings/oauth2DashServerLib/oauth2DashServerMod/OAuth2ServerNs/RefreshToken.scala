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

