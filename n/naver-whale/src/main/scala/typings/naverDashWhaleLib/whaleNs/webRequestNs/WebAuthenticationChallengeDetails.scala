package typings
package naverDashWhaleLib.whaleNs.webRequestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebAuthenticationChallengeDetails
  extends chromeLib.chromeNs.webRequestNs.WebResponseHeadersDetails {
  /** The server requesting authentication. */
  var challenger: chromeLib.chromeNs.webRequestNs.WebAuthChallenger
  /** True for Proxy-Authenticate, false for WWW-Authenticate. */
  var isProxy: scala.Boolean
  /** The authentication realm provided by the server, if there is one. */
  var realm: js.UndefOr[java.lang.String] = js.undefined
  /** The authentication scheme, e.g. Basic or Digest. */
  var scheme: java.lang.String
}

object WebAuthenticationChallengeDetails {
  @scala.inline
  def apply(
    challenger: chromeLib.chromeNs.webRequestNs.WebAuthChallenger,
    frameId: scala.Double,
    isProxy: scala.Boolean,
    method: java.lang.String,
    parentFrameId: scala.Double,
    requestId: java.lang.String,
    scheme: java.lang.String,
    statusCode: scala.Double,
    statusLine: java.lang.String,
    tabId: scala.Double,
    timeStamp: scala.Double,
    `type`: chromeLib.chromeNs.webRequestNs.ResourceType,
    url: java.lang.String,
    initiator: java.lang.String = null,
    realm: java.lang.String = null,
    responseHeaders: js.Array[chromeLib.chromeNs.webRequestNs.HttpHeader] = null
  ): WebAuthenticationChallengeDetails = {
    val __obj = js.Dynamic.literal(challenger = challenger, frameId = frameId, isProxy = isProxy, method = method, parentFrameId = parentFrameId, requestId = requestId, scheme = scheme, statusCode = statusCode, statusLine = statusLine, tabId = tabId, timeStamp = timeStamp, url = url)
    __obj.updateDynamic("type")(`type`)
    if (initiator != null) __obj.updateDynamic("initiator")(initiator)
    if (realm != null) __obj.updateDynamic("realm")(realm)
    if (responseHeaders != null) __obj.updateDynamic("responseHeaders")(responseHeaders)
    __obj.asInstanceOf[WebAuthenticationChallengeDetails]
  }
}

