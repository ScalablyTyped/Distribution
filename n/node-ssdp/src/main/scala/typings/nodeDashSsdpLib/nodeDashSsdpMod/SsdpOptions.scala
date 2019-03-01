package typings
package nodeDashSsdpLib.nodeDashSsdpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SsdpOptions extends js.Object {
  /** A logger function to use instead of the default. The first argument to the function can contain a format string. */
  var customLogger: js.UndefOr[js.Function2[/* format */ java.lang.String, /* repeated */ js.Any, scala.Unit]] = js.undefined
  /** Path to SSDP description file */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /** Additional headers */
  var headers: js.UndefOr[SsdpHeaders] = js.undefined
  /**
  	 * SSDP multicast group
  	 * @default '239.255.255.250'
  	 */
  var ssdpIp: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * SSDP port
  	 * @default 1900
  	 */
  var ssdpPort: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * SSDP signature
  	 * @default 'node.js/NODE_VERSION UPnP/1.1 node-ssdp/PACKAGE_VERSION'
  	 */
  var ssdpSig: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Multicast TTL
  	 * @default 4
  	 */
  var ssdpTtl: js.UndefOr[scala.Double] = js.undefined
}

object SsdpOptions {
  @scala.inline
  def apply(
    customLogger: js.Function2[/* format */ java.lang.String, /* repeated */ js.Any, scala.Unit] = null,
    description: java.lang.String = null,
    headers: SsdpHeaders = null,
    ssdpIp: java.lang.String = null,
    ssdpPort: scala.Int | scala.Double = null,
    ssdpSig: java.lang.String = null,
    ssdpTtl: scala.Int | scala.Double = null
  ): SsdpOptions = {
    val __obj = js.Dynamic.literal()
    if (customLogger != null) __obj.updateDynamic("customLogger")(customLogger)
    if (description != null) __obj.updateDynamic("description")(description)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (ssdpIp != null) __obj.updateDynamic("ssdpIp")(ssdpIp)
    if (ssdpPort != null) __obj.updateDynamic("ssdpPort")(ssdpPort.asInstanceOf[js.Any])
    if (ssdpSig != null) __obj.updateDynamic("ssdpSig")(ssdpSig)
    if (ssdpTtl != null) __obj.updateDynamic("ssdpTtl")(ssdpTtl.asInstanceOf[js.Any])
    __obj.asInstanceOf[SsdpOptions]
  }
}

