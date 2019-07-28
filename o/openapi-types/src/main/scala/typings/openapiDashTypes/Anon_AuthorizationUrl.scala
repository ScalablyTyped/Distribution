package typings.openapiDashTypes

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AuthorizationUrl extends js.Object {
  var authorizationUrl: String
  var refreshUrl: js.UndefOr[String] = js.undefined
  var scopes: StringDictionary[String]
}

object Anon_AuthorizationUrl {
  @scala.inline
  def apply(authorizationUrl: String, scopes: StringDictionary[String], refreshUrl: String = null): Anon_AuthorizationUrl = {
    val __obj = js.Dynamic.literal(authorizationUrl = authorizationUrl, scopes = scopes)
    if (refreshUrl != null) __obj.updateDynamic("refreshUrl")(refreshUrl)
    __obj.asInstanceOf[Anon_AuthorizationUrl]
  }
}

