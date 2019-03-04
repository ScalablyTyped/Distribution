package typings
package phantomjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceResponse extends js.Object {
  var bodySize: scala.Double
  var contentType: js.UndefOr[java.lang.String] = js.undefined
  var headers: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  var id: scala.Double
  var redirectURL: js.UndefOr[java.lang.String] = js.undefined
  var stage: java.lang.String
  var status: scala.Double
  var statusText: java.lang.String
  var time: stdLib.Date
  var url: java.lang.String
}

object ResourceResponse {
  @scala.inline
  def apply(
    bodySize: scala.Double,
    headers: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    id: scala.Double,
    stage: java.lang.String,
    status: scala.Double,
    statusText: java.lang.String,
    time: stdLib.Date,
    url: java.lang.String,
    contentType: java.lang.String = null,
    redirectURL: java.lang.String = null
  ): ResourceResponse = {
    val __obj = js.Dynamic.literal(bodySize = bodySize, headers = headers, id = id, stage = stage, status = status, statusText = statusText, time = time, url = url)
    if (contentType != null) __obj.updateDynamic("contentType")(contentType)
    if (redirectURL != null) __obj.updateDynamic("redirectURL")(redirectURL)
    __obj.asInstanceOf[ResourceResponse]
  }
}

