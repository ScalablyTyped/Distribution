package typings
package naverDashWhaleLib.whaleNs.webRequestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebResponseErrorDetails
  extends chromeLib.chromeNs.webRequestNs.WebResponseCacheDetails {
  /** The error description. This string is not guaranteed to remain backwards compatible between releases. You must not parse and act based upon its content. */
  var error: java.lang.String
}

object WebResponseErrorDetails {
  @scala.inline
  def apply(
    error: java.lang.String,
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
  ): WebResponseErrorDetails = {
    val __obj = js.Dynamic.literal(error = error, frameId = frameId, fromCache = fromCache, method = method, parentFrameId = parentFrameId, requestId = requestId, statusCode = statusCode, statusLine = statusLine, tabId = tabId, timeStamp = timeStamp, url = url)
    __obj.updateDynamic("type")(`type`)
    if (initiator != null) __obj.updateDynamic("initiator")(initiator)
    if (ip != null) __obj.updateDynamic("ip")(ip)
    if (responseHeaders != null) __obj.updateDynamic("responseHeaders")(responseHeaders)
    __obj.asInstanceOf[WebResponseErrorDetails]
  }
}

