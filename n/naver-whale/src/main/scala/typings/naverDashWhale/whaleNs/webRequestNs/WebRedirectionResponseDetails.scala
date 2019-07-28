package typings.naverDashWhale.whaleNs.webRequestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebRedirectionResponseDetails
  extends typings.chrome.chromeNs.webRequestNs.WebResponseCacheDetails {
  /** The new URL. */
  var redirectUrl: String
}

object WebRedirectionResponseDetails {
  @scala.inline
  def apply(
    frameId: Double,
    fromCache: Boolean,
    method: String,
    parentFrameId: Double,
    redirectUrl: String,
    requestId: String,
    statusCode: Double,
    statusLine: String,
    tabId: Double,
    timeStamp: Double,
    `type`: typings.chrome.chromeNs.webRequestNs.ResourceType,
    url: String,
    initiator: String = null,
    ip: String = null,
    responseHeaders: js.Array[typings.chrome.chromeNs.webRequestNs.HttpHeader] = null
  ): WebRedirectionResponseDetails = {
    val __obj = js.Dynamic.literal(frameId = frameId, fromCache = fromCache, method = method, parentFrameId = parentFrameId, redirectUrl = redirectUrl, requestId = requestId, statusCode = statusCode, statusLine = statusLine, tabId = tabId, timeStamp = timeStamp, url = url)
    __obj.updateDynamic("type")(`type`)
    if (initiator != null) __obj.updateDynamic("initiator")(initiator)
    if (ip != null) __obj.updateDynamic("ip")(ip)
    if (responseHeaders != null) __obj.updateDynamic("responseHeaders")(responseHeaders)
    __obj.asInstanceOf[WebRedirectionResponseDetails]
  }
}

