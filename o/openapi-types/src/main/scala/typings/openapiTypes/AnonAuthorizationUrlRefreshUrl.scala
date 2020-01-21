package typings.openapiTypes

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAuthorizationUrlRefreshUrl extends js.Object {
  var authorizationUrl: String
  var refreshUrl: js.UndefOr[String] = js.undefined
  var scopes: StringDictionary[String]
  var tokenUrl: String
}

object AnonAuthorizationUrlRefreshUrl {
  @scala.inline
  def apply(
    authorizationUrl: String,
    scopes: StringDictionary[String],
    tokenUrl: String,
    refreshUrl: String = null
  ): AnonAuthorizationUrlRefreshUrl = {
    val __obj = js.Dynamic.literal(authorizationUrl = authorizationUrl.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any], tokenUrl = tokenUrl.asInstanceOf[js.Any])
    if (refreshUrl != null) __obj.updateDynamic("refreshUrl")(refreshUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAuthorizationUrlRefreshUrl]
  }
}

