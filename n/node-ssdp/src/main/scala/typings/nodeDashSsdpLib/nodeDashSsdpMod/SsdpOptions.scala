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

