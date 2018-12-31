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

