package typings.openapiDashTypes

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AuthorizationUrlRefreshUrl extends js.Object {
  var authorizationUrl: String
  var refreshUrl: js.UndefOr[String] = js.undefined
  var scopes: StringDictionary[String]
  var tokenUrl: String
}

object Anon_AuthorizationUrlRefreshUrl {
  @scala.inline
  def apply(
    authorizationUrl: String,
    scopes: StringDictionary[String],
    tokenUrl: String,
    refreshUrl: String = null
  ): Anon_AuthorizationUrlRefreshUrl = {
    val __obj = js.Dynamic.literal(authorizationUrl = authorizationUrl, scopes = scopes, tokenUrl = tokenUrl)
    if (refreshUrl != null) __obj.updateDynamic("refreshUrl")(refreshUrl)
    __obj.asInstanceOf[Anon_AuthorizationUrlRefreshUrl]
  }
}

