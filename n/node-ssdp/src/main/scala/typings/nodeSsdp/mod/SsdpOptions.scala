package typings.nodeSsdp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SsdpOptions extends js.Object {
  /** A logger function to use instead of the default. The first argument to the function can contain a format string. */
  var customLogger: js.UndefOr[js.Function2[/* format */ String, /* repeated */ js.Any, Unit]] = js.native
  /** Path to SSDP description file */
  var description: js.UndefOr[String] = js.native
  /** Additional headers */
  var headers: js.UndefOr[SsdpHeaders] = js.native
  /**
    * SSDP multicast group
    * @default '239.255.255.250'
    */
  var ssdpIp: js.UndefOr[String] = js.native
  /**
    * SSDP port
    * @default 1900
    */
  var ssdpPort: js.UndefOr[Double] = js.native
  /**
    * SSDP signature
    * @default 'node.js/NODE_VERSION UPnP/1.1 node-ssdp/PACKAGE_VERSION'
    */
  var ssdpSig: js.UndefOr[String] = js.native
  /**
    * Multicast TTL
    * @default 4
    */
  var ssdpTtl: js.UndefOr[Double] = js.native
}

object SsdpOptions {
  @scala.inline
  def apply(): SsdpOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SsdpOptions]
  }
  @scala.inline
  implicit class SsdpOptionsOps[Self <: SsdpOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCustomLogger(value: (/* format */ String, /* repeated */ js.Any) => Unit): Self = this.set("customLogger", js.Any.fromFunction2(value))
    @scala.inline
    def deleteCustomLogger: Self = this.set("customLogger", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setHeaders(value: SsdpHeaders): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setSsdpIp(value: String): Self = this.set("ssdpIp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSsdpIp: Self = this.set("ssdpIp", js.undefined)
    @scala.inline
    def setSsdpPort(value: Double): Self = this.set("ssdpPort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSsdpPort: Self = this.set("ssdpPort", js.undefined)
    @scala.inline
    def setSsdpSig(value: String): Self = this.set("ssdpSig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSsdpSig: Self = this.set("ssdpSig", js.undefined)
    @scala.inline
    def setSsdpTtl(value: Double): Self = this.set("ssdpTtl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSsdpTtl: Self = this.set("ssdpTtl", js.undefined)
  }
  
}

