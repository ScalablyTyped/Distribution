package typings.officeDashJsDashPreview.OfficeExtension

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request URL and headers
  */
trait RequestUrlAndHeaderInfo extends js.Object {
  /** Request headers */
  var headers: js.UndefOr[StringDictionary[String]] = js.undefined
  /** Request URL */
  var url: String
}

object RequestUrlAndHeaderInfo {
  @scala.inline
  def apply(url: String, headers: StringDictionary[String] = null): RequestUrlAndHeaderInfo = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestUrlAndHeaderInfo]
  }
}

