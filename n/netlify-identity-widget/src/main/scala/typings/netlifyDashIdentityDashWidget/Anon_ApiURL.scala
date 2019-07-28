package typings.netlifyDashIdentityDashWidget

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ApiURL extends js.Object {
  var _sameOrigin: js.UndefOr[Boolean] = js.undefined
  var apiURL: String
  var defaultHeaders: StringDictionary[js.UndefOr[String | js.Array[String]]]
}

object Anon_ApiURL {
  @scala.inline
  def apply(
    apiURL: String,
    defaultHeaders: StringDictionary[js.UndefOr[String | js.Array[String]]],
    _sameOrigin: js.UndefOr[Boolean] = js.undefined
  ): Anon_ApiURL = {
    val __obj = js.Dynamic.literal(apiURL = apiURL, defaultHeaders = defaultHeaders)
    if (!js.isUndefined(_sameOrigin)) __obj.updateDynamic("_sameOrigin")(_sameOrigin)
    __obj.asInstanceOf[Anon_ApiURL]
  }
}

