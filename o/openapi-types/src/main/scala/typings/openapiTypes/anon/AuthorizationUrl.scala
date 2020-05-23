package typings.openapiTypes.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthorizationUrl extends js.Object {
  var authorizationUrl: String
  var refreshUrl: js.UndefOr[String] = js.undefined
  var scopes: StringDictionary[String]
}

object AuthorizationUrl {
  @scala.inline
  def apply(authorizationUrl: String, scopes: StringDictionary[String], refreshUrl: String = null): AuthorizationUrl = {
    val __obj = js.Dynamic.literal(authorizationUrl = authorizationUrl.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any])
    if (refreshUrl != null) __obj.updateDynamic("refreshUrl")(refreshUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthorizationUrl]
  }
}

