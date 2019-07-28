package typings.nodeDashSsdp.nodeDashSsdpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientOptions extends SsdpOptions {
  /** Bind sockets to each discovered interface explicitly instead of relying on the system. Might help with issues with multiple NICs. */
  var explicitSocketBind: js.UndefOr[Boolean] = js.undefined
  /** List of interfaces to explicitly bind. By default, bind to all available interfaces. */
  var interfaces: js.UndefOr[js.Array[String]] = js.undefined
  /**
  	 * When true socket.bind() will reuse the address, even if another process has already bound a socket on it.
  	 * @default true
  	 */
  var reuseAddr: js.UndefOr[Boolean] = js.undefined
}

object ClientOptions {
  @scala.inline
  def apply(
    customLogger: (/* format */ String, /* repeated */ js.Any) => Unit = null,
    description: String = null,
    explicitSocketBind: js.UndefOr[Boolean] = js.undefined,
    headers: SsdpHeaders = null,
    interfaces: js.Array[String] = null,
    reuseAddr: js.UndefOr[Boolean] = js.undefined,
    ssdpIp: String = null,
    ssdpPort: Int | Double = null,
    ssdpSig: String = null,
    ssdpTtl: Int | Double = null
  ): ClientOptions = {
    val __obj = js.Dynamic.literal()
    if (customLogger != null) __obj.updateDynamic("customLogger")(js.Any.fromFunction2(customLogger))
    if (description != null) __obj.updateDynamic("description")(description)
    if (!js.isUndefined(explicitSocketBind)) __obj.updateDynamic("explicitSocketBind")(explicitSocketBind)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (interfaces != null) __obj.updateDynamic("interfaces")(interfaces)
    if (!js.isUndefined(reuseAddr)) __obj.updateDynamic("reuseAddr")(reuseAddr)
    if (ssdpIp != null) __obj.updateDynamic("ssdpIp")(ssdpIp)
    if (ssdpPort != null) __obj.updateDynamic("ssdpPort")(ssdpPort.asInstanceOf[js.Any])
    if (ssdpSig != null) __obj.updateDynamic("ssdpSig")(ssdpSig)
    if (ssdpTtl != null) __obj.updateDynamic("ssdpTtl")(ssdpTtl.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientOptions]
  }
}

