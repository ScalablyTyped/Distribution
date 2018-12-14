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

