package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DomainDnsSrvRecord extends DomainDnsRecord {
  // Value to use when configuring the Target property of the SRV record at the DNS host.
  var nameTarget: js.UndefOr[String] = js.undefined
  // Value to use when configuring the port property of the SRV record at the DNS host.
  var port: js.UndefOr[Double] = js.undefined
  // Value to use when configuring the priority property of the SRV record at the DNS host.
  var priority: js.UndefOr[Double] = js.undefined
  // Value to use when configuring the protocol property of the SRV record at the DNS host.
  var protocol: js.UndefOr[String] = js.undefined
  // Value to use when configuring the service property of the SRV record at the DNS host.
  var service: js.UndefOr[String] = js.undefined
  // Value to use when configuring the weight property of the SRV record at the DNS host.
  var weight: js.UndefOr[Double] = js.undefined
}

object DomainDnsSrvRecord {
  @scala.inline
  def apply(
    id: String = null,
    isOptional: js.UndefOr[Boolean] = js.undefined,
    label: String = null,
    nameTarget: String = null,
    port: Int | Double = null,
    priority: Int | Double = null,
    protocol: String = null,
    recordType: String = null,
    service: String = null,
    supportedService: String = null,
    ttl: Int | Double = null,
    weight: Int | Double = null
  ): DomainDnsSrvRecord = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(isOptional)) __obj.updateDynamic("isOptional")(isOptional.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (nameTarget != null) __obj.updateDynamic("nameTarget")(nameTarget.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    if (recordType != null) __obj.updateDynamic("recordType")(recordType.asInstanceOf[js.Any])
    if (service != null) __obj.updateDynamic("service")(service.asInstanceOf[js.Any])
    if (supportedService != null) __obj.updateDynamic("supportedService")(supportedService.asInstanceOf[js.Any])
    if (ttl != null) __obj.updateDynamic("ttl")(ttl.asInstanceOf[js.Any])
    if (weight != null) __obj.updateDynamic("weight")(weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomainDnsSrvRecord]
  }
}

