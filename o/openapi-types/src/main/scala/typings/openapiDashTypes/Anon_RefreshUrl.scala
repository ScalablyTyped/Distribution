package typings.openapiDashTypes

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_RefreshUrl extends js.Object {
  var refreshUrl: js.UndefOr[String] = js.undefined
  var scopes: StringDictionary[String]
  var tokenUrl: String
}

object Anon_RefreshUrl {
  @scala.inline
  def apply(scopes: StringDictionary[String], tokenUrl: String, refreshUrl: String = null): Anon_RefreshUrl = {
    val __obj = js.Dynamic.literal(scopes = scopes.asInstanceOf[js.Any], tokenUrl = tokenUrl.asInstanceOf[js.Any])
    if (refreshUrl != null) __obj.updateDynamic("refreshUrl")(refreshUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_RefreshUrl]
  }
}

