package typings
package netlifyDashIdentityDashWidgetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ApiURL extends js.Object {
  var _sameOrigin: js.UndefOr[scala.Boolean] = js.undefined
  var apiURL: java.lang.String
  var defaultHeaders: org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String | js.Array[java.lang.String]]]
}

object Anon_ApiURL {
  @scala.inline
  def apply(
    apiURL: java.lang.String,
    defaultHeaders: org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String | js.Array[java.lang.String]]],
    _sameOrigin: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_ApiURL = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("apiURL")(apiURL)
    __obj.updateDynamic("defaultHeaders")(defaultHeaders)
    if (!js.isUndefined(_sameOrigin)) __obj.updateDynamic("_sameOrigin")(_sameOrigin)
    __obj.asInstanceOf[Anon_ApiURL]
  }
}

