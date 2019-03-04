package typings
package oauth2DashServerLib.oauth2DashServerMod.OAuth2ServerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An interface representing the client and associated data
  */
trait Client
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var accessTokenLifetime: js.UndefOr[scala.Double] = js.undefined
  var grants: java.lang.String | js.Array[java.lang.String]
  var id: java.lang.String
  var redirectUris: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var refreshTokenLifetime: js.UndefOr[scala.Double] = js.undefined
}

object Client {
  @scala.inline
  def apply(
    grants: java.lang.String | js.Array[java.lang.String],
    id: java.lang.String,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    accessTokenLifetime: scala.Int | scala.Double = null,
    redirectUris: java.lang.String | js.Array[java.lang.String] = null,
    refreshTokenLifetime: scala.Int | scala.Double = null
  ): Client = {
    val __obj = js.Dynamic.literal(grants = grants.asInstanceOf[js.Any], id = id)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (accessTokenLifetime != null) __obj.updateDynamic("accessTokenLifetime")(accessTokenLifetime.asInstanceOf[js.Any])
    if (redirectUris != null) __obj.updateDynamic("redirectUris")(redirectUris.asInstanceOf[js.Any])
    if (refreshTokenLifetime != null) __obj.updateDynamic("refreshTokenLifetime")(refreshTokenLifetime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Client]
  }
}

