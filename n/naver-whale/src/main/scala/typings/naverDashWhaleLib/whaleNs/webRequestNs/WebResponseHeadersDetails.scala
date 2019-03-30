package typings
package naverDashWhaleLib.whaleNs.webRequestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebResponseHeadersDetails
  extends chromeLib.chromeNs.webRequestNs.WebResponseDetails {
  var method: java.lang.String
  /** Optional. The HTTP response headers that have been received with this response. */
  var responseHeaders: js.UndefOr[js.Array[chromeLib.chromeNs.webRequestNs.HttpHeader]] = js.undefined
}

object WebResponseHeadersDetails {
  @scala.inline
  def apply(
    frameId: scala.Double,
    method: java.lang.String,
    parentFrameId: scala.Double,
    requestId: java.lang.String,
    statusCode: scala.Double,
    statusLine: java.lang.String,
    tabId: scala.Double,
    timeStamp: scala.Double,
    `type`: chromeLib.chromeNs.webRequestNs.ResourceType,
    url: java.lang.String,
    initiator: java.lang.String = null,
    responseHeaders: js.Array[chromeLib.chromeNs.webRequestNs.HttpHeader] = null
  ): WebResponseHeadersDetails = {
    val __obj = js.Dynamic.literal(frameId = frameId, method = method, parentFrameId = parentFrameId, requestId = requestId, statusCode = statusCode, statusLine = statusLine, tabId = tabId, timeStamp = timeStamp, url = url)
    __obj.updateDynamic("type")(`type`)
    if (initiator != null) __obj.updateDynamic("initiator")(initiator)
    if (responseHeaders != null) __obj.updateDynamic("responseHeaders")(responseHeaders)
    __obj.asInstanceOf[WebResponseHeadersDetails]
  }
}

