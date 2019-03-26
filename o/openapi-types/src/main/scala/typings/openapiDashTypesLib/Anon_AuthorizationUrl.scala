package typings
package openapiDashTypesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AuthorizationUrl extends js.Object {
  var authorizationUrl: java.lang.String
  var refreshUrl: js.UndefOr[java.lang.String] = js.undefined
  var scopes: org.scalablytyped.runtime.StringDictionary[java.lang.String]
}

object Anon_AuthorizationUrl {
  @scala.inline
  def apply(
    authorizationUrl: java.lang.String,
    scopes: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    refreshUrl: java.lang.String = null
  ): Anon_AuthorizationUrl = {
    val __obj = js.Dynamic.literal(authorizationUrl = authorizationUrl, scopes = scopes)
    if (refreshUrl != null) __obj.updateDynamic("refreshUrl")(refreshUrl)
    __obj.asInstanceOf[Anon_AuthorizationUrl]
  }
}

