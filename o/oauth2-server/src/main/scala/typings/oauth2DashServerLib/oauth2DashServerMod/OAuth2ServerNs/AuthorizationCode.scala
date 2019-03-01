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

object AuthorizationCode {
  @scala.inline
  def apply(
    authorizationCode: java.lang.String,
    client: Client,
    expiresAt: stdLib.Date,
    redirectUri: java.lang.String,
    user: User,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    scope: java.lang.String | js.Array[java.lang.String] = null
  ): AuthorizationCode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("authorizationCode")(authorizationCode)
    __obj.updateDynamic("client")(client)
    __obj.updateDynamic("expiresAt")(expiresAt)
    __obj.updateDynamic("redirectUri")(redirectUri)
    __obj.updateDynamic("user")(user)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthorizationCode]
  }
}

