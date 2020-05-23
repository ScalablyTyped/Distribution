package typings.netlifyIdentityWidget.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApiURL extends js.Object {
  var _sameOrigin: js.UndefOr[Boolean] = js.undefined
  var apiURL: String
  var defaultHeaders: StringDictionary[js.UndefOr[String | js.Array[String]]]
}

object ApiURL {
  @scala.inline
  def apply(
    apiURL: String,
    defaultHeaders: StringDictionary[js.UndefOr[String | js.Array[String]]],
    _sameOrigin: js.UndefOr[Boolean] = js.undefined
  ): ApiURL = {
    val __obj = js.Dynamic.literal(apiURL = apiURL.asInstanceOf[js.Any], defaultHeaders = defaultHeaders.asInstanceOf[js.Any])
    if (!js.isUndefined(_sameOrigin)) __obj.updateDynamic("_sameOrigin")(_sameOrigin.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApiURL]
  }
}

