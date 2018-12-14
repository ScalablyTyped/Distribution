package typings
package oauth2DashServerLib.oauth2DashServerMod.OAuth2ServerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * An interface representing the authorization code and associated data.
     */

trait AuthorizationCode
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var authorizationCode: java.lang.String
  var client: Client
  var expiresAt: stdLib.Date
  var redirectUri: java.lang.String
  var scope: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var user: User
}

