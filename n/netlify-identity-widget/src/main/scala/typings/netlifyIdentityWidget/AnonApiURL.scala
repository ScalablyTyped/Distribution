package typings.netlifyIdentityWidget

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonApiURL extends js.Object {
  var _sameOrigin: js.UndefOr[Boolean] = js.undefined
  var apiURL: String
  var defaultHeaders: StringDictionary[js.UndefOr[String | js.Array[String]]]
}

object AnonApiURL {
  @scala.inline
  def apply(
    apiURL: String,
    defaultHeaders: StringDictionary[js.UndefOr[String | js.Array[String]]],
    _sameOrigin: js.UndefOr[Boolean] = js.undefined
  ): AnonApiURL = {
    val __obj = js.Dynamic.literal(apiURL = apiURL.asInstanceOf[js.Any], defaultHeaders = defaultHeaders.asInstanceOf[js.Any])
    if (!js.isUndefined(_sameOrigin)) __obj.updateDynamic("_sameOrigin")(_sameOrigin.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonApiURL]
  }
}

