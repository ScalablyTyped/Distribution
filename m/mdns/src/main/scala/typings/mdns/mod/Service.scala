package typings.mdns.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// --- Services ---
@js.native
trait Service extends js.Object {
  var addresses: js.Array[String] = js.native
  var flags: Double = js.native
  var fullname: String = js.native
  var host: String = js.native
  var interfaceIndex: Double = js.native
  var name: js.UndefOr[String] = js.native
  var networkInterface: String = js.native
  var port: Double = js.native
  var rawTxtRecord: js.UndefOr[Buffer] = js.native
  var replyDomain: String = js.native
  var txtRecord: js.UndefOr[js.Any] = js.native
  var `type`: ServiceType = js.native
}

object Service {
  @scala.inline
  def apply(
    addresses: js.Array[String],
    flags: Double,
    fullname: String,
    host: String,
    interfaceIndex: Double,
    networkInterface: String,
    port: Double,
    replyDomain: String,
    `type`: ServiceType
  ): Service = {
    val __obj = js.Dynamic.literal(addresses = addresses.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], fullname = fullname.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], interfaceIndex = interfaceIndex.asInstanceOf[js.Any], networkInterface = networkInterface.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], replyDomain = replyDomain.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Service]
  }
  @scala.inline
  implicit class ServiceOps[Self <: Service] (val x: Self) extends AnyVal {
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
    def setAddressesVarargs(value: String*): Self = this.set("addresses", js.Array(value :_*))
    @scala.inline
    def setAddresses(value: js.Array[String]): Self = this.set("addresses", value.asInstanceOf[js.Any])
    @scala.inline
    def setFlags(value: Double): Self = this.set("flags", value.asInstanceOf[js.Any])
    @scala.inline
    def setFullname(value: String): Self = this.set("fullname", value.asInstanceOf[js.Any])
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    @scala.inline
    def setInterfaceIndex(value: Double): Self = this.set("interfaceIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setNetworkInterface(value: String): Self = this.set("networkInterface", value.asInstanceOf[js.Any])
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    @scala.inline
    def setReplyDomain(value: String): Self = this.set("replyDomain", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: ServiceType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setRawTxtRecord(value: Buffer): Self = this.set("rawTxtRecord", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRawTxtRecord: Self = this.set("rawTxtRecord", js.undefined)
    @scala.inline
    def setTxtRecord(value: js.Any): Self = this.set("txtRecord", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTxtRecord: Self = this.set("txtRecord", js.undefined)
  }
  
}

