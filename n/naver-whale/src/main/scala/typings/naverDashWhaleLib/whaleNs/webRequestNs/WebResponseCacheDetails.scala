package typings
package naverDashWhaleLib.whaleNs.webRequestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebResponseCacheDetails
  extends chromeLib.chromeNs.webRequestNs.WebResponseHeadersDetails {
  /** Indicates if this response was fetched from disk cache. */
  var fromCache: scala.Boolean
  /**
    * Optional.
    * The server IP address that the request was actually sent to. Note that it may be a literal IPv6 address.
    */
  var ip: js.UndefOr[java.lang.String] = js.undefined
}

object WebResponseCacheDetails {
  @scala.inline
  def apply(
    frameId: scala.Double,
    fromCache: scala.Boolean,
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
    ip: java.lang.String = null,
    responseHeaders: js.Array[chromeLib.chromeNs.webRequestNs.HttpHeader] = null
  ): WebResponseCacheDetails = {
    val __obj = js.Dynamic.literal(frameId = frameId, fromCache = fromCache, method = method, parentFrameId = parentFrameId, requestId = requestId, statusCode = statusCode, statusLine = statusLine, tabId = tabId, timeStamp = timeStamp, url = url)
    __obj.updateDynamic("type")(`type`)
    if (initiator != null) __obj.updateDynamic("initiator")(initiator)
    if (ip != null) __obj.updateDynamic("ip")(ip)
    if (responseHeaders != null) __obj.updateDynamic("responseHeaders")(responseHeaders)
    __obj.asInstanceOf[WebResponseCacheDetails]
  }
}

