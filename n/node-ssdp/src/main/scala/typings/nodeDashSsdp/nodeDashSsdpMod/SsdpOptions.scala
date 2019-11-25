package typings.nodeDashSsdp.nodeDashSsdpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SsdpOptions extends js.Object {
  /** A logger function to use instead of the default. The first argument to the function can contain a format string. */
  var customLogger: js.UndefOr[js.Function2[/* format */ String, /* repeated */ js.Any, Unit]] = js.undefined
  /** Path to SSDP description file */
  var description: js.UndefOr[String] = js.undefined
  /** Additional headers */
  var headers: js.UndefOr[SsdpHeaders] = js.undefined
  /**
  	 * SSDP multicast group
  	 * @default '239.255.255.250'
  	 */
  var ssdpIp: js.UndefOr[String] = js.undefined
  /**
  	 * SSDP port
  	 * @default 1900
  	 */
  var ssdpPort: js.UndefOr[Double] = js.undefined
  /**
  	 * SSDP signature
  	 * @default 'node.js/NODE_VERSION UPnP/1.1 node-ssdp/PACKAGE_VERSION'
  	 */
  var ssdpSig: js.UndefOr[String] = js.undefined
  /**
  	 * Multicast TTL
  	 * @default 4
  	 */
  var ssdpTtl: js.UndefOr[Double] = js.undefined
}

object SsdpOptions {
  @scala.inline
  def apply(
    customLogger: (/* format */ String, /* repeated */ js.Any) => Unit = null,
    description: String = null,
    headers: SsdpHeaders = null,
    ssdpIp: String = null,
    ssdpPort: Int | Double = null,
    ssdpSig: String = null,
    ssdpTtl: Int | Double = null
  ): SsdpOptions = {
    val __obj = js.Dynamic.literal()
    if (customLogger != null) __obj.updateDynamic("customLogger")(js.Any.fromFunction2(customLogger))
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (ssdpIp != null) __obj.updateDynamic("ssdpIp")(ssdpIp.asInstanceOf[js.Any])
    if (ssdpPort != null) __obj.updateDynamic("ssdpPort")(ssdpPort.asInstanceOf[js.Any])
    if (ssdpSig != null) __obj.updateDynamic("ssdpSig")(ssdpSig.asInstanceOf[js.Any])
    if (ssdpTtl != null) __obj.updateDynamic("ssdpTtl")(ssdpTtl.asInstanceOf[js.Any])
    __obj.asInstanceOf[SsdpOptions]
  }
}

