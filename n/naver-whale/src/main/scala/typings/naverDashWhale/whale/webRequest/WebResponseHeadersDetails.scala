package typings.naverDashWhale.whale.webRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebResponseHeadersDetails
  extends typings.chrome.chrome.webRequest.WebResponseDetails {
  var method: String
  /** Optional. The HTTP response headers that have been received with this response. */
  var responseHeaders: js.UndefOr[js.Array[typings.chrome.chrome.webRequest.HttpHeader]] = js.undefined
}

object WebResponseHeadersDetails {
  @scala.inline
  def apply(
    frameId: Double,
    method: String,
    parentFrameId: Double,
    requestId: String,
    statusCode: Double,
    statusLine: String,
    tabId: Double,
    timeStamp: Double,
    `type`: typings.chrome.chrome.webRequest.ResourceType,
    url: String,
    initiator: String = null,
    responseHeaders: js.Array[typings.chrome.chrome.webRequest.HttpHeader] = null
  ): WebResponseHeadersDetails = {
    val __obj = js.Dynamic.literal(frameId = frameId, method = method, parentFrameId = parentFrameId, requestId = requestId, statusCode = statusCode, statusLine = statusLine, tabId = tabId, timeStamp = timeStamp, url = url)
    __obj.updateDynamic("type")(`type`)
    if (initiator != null) __obj.updateDynamic("initiator")(initiator)
    if (responseHeaders != null) __obj.updateDynamic("responseHeaders")(responseHeaders)
    __obj.asInstanceOf[WebResponseHeadersDetails]
  }
}

