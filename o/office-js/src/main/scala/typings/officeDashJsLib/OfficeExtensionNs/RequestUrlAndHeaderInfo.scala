package typings
package officeDashJsLib.OfficeExtensionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request URL and headers
  */
trait RequestUrlAndHeaderInfo extends js.Object {
  /** Request headers */
  var headers: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  /** Request URL */
  var url: java.lang.String
}

object RequestUrlAndHeaderInfo {
  @scala.inline
  def apply(
    url: java.lang.String,
    headers: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null
  ): RequestUrlAndHeaderInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("url")(url)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    __obj.asInstanceOf[RequestUrlAndHeaderInfo]
  }
}

