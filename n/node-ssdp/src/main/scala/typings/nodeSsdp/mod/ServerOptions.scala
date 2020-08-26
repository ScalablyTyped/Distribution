package typings.nodeSsdp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerOptions extends ClientOptions {
  /**
    * Interval at which to send out advertisement (ms)
    * @default 10000
    */
  var adInterval: js.UndefOr[Double] = js.native
  /**
    * Allow wildcards in M-SEARCH packets (non-standard)
    * @default false
    */
  var allowWildcards: js.UndefOr[Boolean] = js.native
  /**
    * URL pointing to description of your service, or a function that returns that URL.
    * For cases where there are multiple network interfaces or the IP of the host isn't known in advance,
    * it's possible to specify location as an object. Host will be set to the IP of the responding interface.
    */
  var location: js.UndefOr[String | ServiceDescriptionLocation] = js.native
  /**
    * When true the SSDP server will not advertise the root device (i.e. the bare UDN). In some scenarios, this advertisement is not needed.
    * @default false
    */
  var suppressRootDeviceAdvertisements: js.UndefOr[Boolean] = js.native
  /**
    * Packet TTL
    * @default 1800
    */
  var ttl: js.UndefOr[Double] = js.native
  /**
    * SSDP Unique Device Name
    * @default 'uuid:f40c2981-7329-40b7-8b04-27f187aecfb5'
    */
  var udn: js.UndefOr[String] = js.native
}

object ServerOptions {
  @scala.inline
  def apply(): ServerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerOptions]
  }
  @scala.inline
  implicit class ServerOptionsOps[Self <: ServerOptions] (val x: Self) extends AnyVal {
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
    def setAdInterval(value: Double): Self = this.set("adInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdInterval: Self = this.set("adInterval", js.undefined)
    @scala.inline
    def setAllowWildcards(value: Boolean): Self = this.set("allowWildcards", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowWildcards: Self = this.set("allowWildcards", js.undefined)
    @scala.inline
    def setLocation(value: String | ServiceDescriptionLocation): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    @scala.inline
    def setSuppressRootDeviceAdvertisements(value: Boolean): Self = this.set("suppressRootDeviceAdvertisements", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuppressRootDeviceAdvertisements: Self = this.set("suppressRootDeviceAdvertisements", js.undefined)
    @scala.inline
    def setTtl(value: Double): Self = this.set("ttl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTtl: Self = this.set("ttl", js.undefined)
    @scala.inline
    def setUdn(value: String): Self = this.set("udn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUdn: Self = this.set("udn", js.undefined)
  }
  
}

