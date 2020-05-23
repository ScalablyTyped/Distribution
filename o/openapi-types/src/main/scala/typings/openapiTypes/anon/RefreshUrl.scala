package typings.openapiTypes.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RefreshUrl extends js.Object {
  var refreshUrl: js.UndefOr[String] = js.undefined
  var scopes: StringDictionary[String]
  var tokenUrl: String
}

object RefreshUrl {
  @scala.inline
  def apply(scopes: StringDictionary[String], tokenUrl: String, refreshUrl: String = null): RefreshUrl = {
    val __obj = js.Dynamic.literal(scopes = scopes.asInstanceOf[js.Any], tokenUrl = tokenUrl.asInstanceOf[js.Any])
    if (refreshUrl != null) __obj.updateDynamic("refreshUrl")(refreshUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefreshUrl]
  }
}

