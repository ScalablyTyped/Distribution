package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DomainDnsSrvRecord extends DomainDnsRecord {
  // Value to use when configuring the Target property of the SRV record at the DNS host.
  var nameTarget: js.UndefOr[String] = js.native
  // Value to use when configuring the port property of the SRV record at the DNS host.
  var port: js.UndefOr[Double] = js.native
  // Value to use when configuring the priority property of the SRV record at the DNS host.
  var priority: js.UndefOr[Double] = js.native
  // Value to use when configuring the protocol property of the SRV record at the DNS host.
  var protocol: js.UndefOr[String] = js.native
  // Value to use when configuring the service property of the SRV record at the DNS host.
  var service: js.UndefOr[String] = js.native
  // Value to use when configuring the weight property of the SRV record at the DNS host.
  var weight: js.UndefOr[Double] = js.native
}

object DomainDnsSrvRecord {
  @scala.inline
  def apply(): DomainDnsSrvRecord = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainDnsSrvRecord]
  }
  @scala.inline
  implicit class DomainDnsSrvRecordOps[Self <: DomainDnsSrvRecord] (val x: Self) extends AnyVal {
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
    def setNameTarget(value: String): Self = this.set("nameTarget", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNameTarget: Self = this.set("nameTarget", js.undefined)
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    @scala.inline
    def setPriority(value: Double): Self = this.set("priority", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePriority: Self = this.set("priority", js.undefined)
    @scala.inline
    def setProtocol(value: String): Self = this.set("protocol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProtocol: Self = this.set("protocol", js.undefined)
    @scala.inline
    def setService(value: String): Self = this.set("service", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteService: Self = this.set("service", js.undefined)
    @scala.inline
    def setWeight(value: Double): Self = this.set("weight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWeight: Self = this.set("weight", js.undefined)
  }
  
}

