package typings
package nodeDashSsdpLib.nodeDashSsdpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ServerOptions extends ClientOptions {
  /**
  	 * Interval at which to send out advertisement (ms)
  	 * @default 10000
  	 */
  var adInterval: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Allow wildcards in M-SEARCH packets (non-standard)
  	 * @default false
  	 */
  var allowWildcards: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * URL pointing to description of your service, or a function that returns that URL.
  	 * For cases where there are multiple network interfaces or the IP of the host isn't known in advance,
  	 * it's possible to specify location as an object. Host will be set to the IP of the responding interface.
  	 */
  var location: js.UndefOr[java.lang.String | ServiceDescriptionLocation] = js.undefined
  /**
  	 * When true the SSDP server will not advertise the root device (i.e. the bare UDN). In some scenarios, this advertisement is not needed.
  	 * @default false
  	 */
  var suppressRootDeviceAdvertisements: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Packet TTL
  	 * @default 1800
  	 */
  var ttl: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * SSDP Unique Device Name
  	 * @default 'uuid:f40c2981-7329-40b7-8b04-27f187aecfb5'
  	 */
  var udn: js.UndefOr[java.lang.String] = js.undefined
}

