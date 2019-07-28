package typings.oauth2DashServer.oauth2DashServerMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An interface representing the client and associated data
  */
trait Client
  extends /* key */ StringDictionary[js.Any] {
  var accessTokenLifetime: js.UndefOr[Double] = js.undefined
  var grants: String | js.Array[String]
  var id: String
  var redirectUris: js.UndefOr[String | js.Array[String]] = js.undefined
  var refreshTokenLifetime: js.UndefOr[Double] = js.undefined
}

object Client {
  @scala.inline
  def apply(
    grants: String | js.Array[String],
    id: String,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    accessTokenLifetime: Int | Double = null,
    redirectUris: String | js.Array[String] = null,
    refreshTokenLifetime: Int | Double = null
  ): Client = {
    val __obj = js.Dynamic.literal(grants = grants.asInstanceOf[js.Any], id = id)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (accessTokenLifetime != null) __obj.updateDynamic("accessTokenLifetime")(accessTokenLifetime.asInstanceOf[js.Any])
    if (redirectUris != null) __obj.updateDynamic("redirectUris")(redirectUris.asInstanceOf[js.Any])
    if (refreshTokenLifetime != null) __obj.updateDynamic("refreshTokenLifetime")(refreshTokenLifetime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Client]
  }
}

