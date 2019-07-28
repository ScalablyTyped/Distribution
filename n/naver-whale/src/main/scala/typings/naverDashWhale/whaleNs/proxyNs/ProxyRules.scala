package typings.naverDashWhale.whaleNs.proxyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProxyRules extends js.Object {
  /** Optional. List of servers to connect to without a proxy server. */
  var bypassList: js.UndefOr[js.Array[String]] = js.undefined
  /** Optional. The proxy server to be used for everthing else or if any of the specific proxyFor... is not specified. */
  var fallbackProxy: js.UndefOr[typings.chrome.chromeNs.proxyNs.ProxyServer] = js.undefined
  /** Optional. The proxy server to be used for FTP requests. */
  var proxyForFtp: js.UndefOr[typings.chrome.chromeNs.proxyNs.ProxyServer] = js.undefined
  /** Optional. The proxy server to be used for HTTP requests. */
  var proxyForHttp: js.UndefOr[typings.chrome.chromeNs.proxyNs.ProxyServer] = js.undefined
  /** Optional. The proxy server to be used for HTTPS requests. */
  var proxyForHttps: js.UndefOr[typings.chrome.chromeNs.proxyNs.ProxyServer] = js.undefined
  /** Optional. The proxy server to be used for all per-URL requests (that is http, https, and ftp). */
  var singleProxy: js.UndefOr[typings.chrome.chromeNs.proxyNs.ProxyServer] = js.undefined
}

object ProxyRules {
  @scala.inline
  def apply(
    bypassList: js.Array[String] = null,
    fallbackProxy: typings.chrome.chromeNs.proxyNs.ProxyServer = null,
    proxyForFtp: typings.chrome.chromeNs.proxyNs.ProxyServer = null,
    proxyForHttp: typings.chrome.chromeNs.proxyNs.ProxyServer = null,
    proxyForHttps: typings.chrome.chromeNs.proxyNs.ProxyServer = null,
    singleProxy: typings.chrome.chromeNs.proxyNs.ProxyServer = null
  ): ProxyRules = {
    val __obj = js.Dynamic.literal()
    if (bypassList != null) __obj.updateDynamic("bypassList")(bypassList)
    if (fallbackProxy != null) __obj.updateDynamic("fallbackProxy")(fallbackProxy)
    if (proxyForFtp != null) __obj.updateDynamic("proxyForFtp")(proxyForFtp)
    if (proxyForHttp != null) __obj.updateDynamic("proxyForHttp")(proxyForHttp)
    if (proxyForHttps != null) __obj.updateDynamic("proxyForHttps")(proxyForHttps)
    if (singleProxy != null) __obj.updateDynamic("singleProxy")(singleProxy)
    __obj.asInstanceOf[ProxyRules]
  }
}

