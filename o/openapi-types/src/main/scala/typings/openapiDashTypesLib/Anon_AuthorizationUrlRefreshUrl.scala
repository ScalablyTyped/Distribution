package typings
package openapiDashTypesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AuthorizationUrlRefreshUrl extends js.Object {
  var authorizationUrl: java.lang.String
  var refreshUrl: js.UndefOr[java.lang.String] = js.undefined
  var scopes: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  var tokenUrl: java.lang.String
}

object Anon_AuthorizationUrlRefreshUrl {
  @scala.inline
  def apply(
    authorizationUrl: java.lang.String,
    scopes: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    tokenUrl: java.lang.String,
    refreshUrl: java.lang.String = null
  ): Anon_AuthorizationUrlRefreshUrl = {
    val __obj = js.Dynamic.literal(authorizationUrl = authorizationUrl, scopes = scopes, tokenUrl = tokenUrl)
    if (refreshUrl != null) __obj.updateDynamic("refreshUrl")(refreshUrl)
    __obj.asInstanceOf[Anon_AuthorizationUrlRefreshUrl]
  }
}

