package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DomainDnsSrvRecord extends DomainDnsRecord {
  /** Value to use when configuring the Target property of the SRV record at the DNS host. */
  var nameTarget: js.UndefOr[java.lang.String] = js.undefined
  /** Value to use when configuring the port property of the SRV record at the DNS host. */
  var port: js.UndefOr[scala.Double] = js.undefined
  /** Value to use when configuring the priority property of the SRV record at the DNS host. */
  var priority: js.UndefOr[scala.Double] = js.undefined
  /** Value to use when configuring the protocol property of the SRV record at the DNS host. */
  var protocol: js.UndefOr[java.lang.String] = js.undefined
  /** Value to use when configuring the service property of the SRV record at the DNS host. */
  var service: js.UndefOr[java.lang.String] = js.undefined
  /** Value to use when configuring the weight property of the SRV record at the DNS host. */
  var weight: js.UndefOr[scala.Double] = js.undefined
}

object DomainDnsSrvRecord {
  @scala.inline
  def apply(
    id: java.lang.String = null,
    isOptional: js.UndefOr[scala.Boolean] = js.undefined,
    label: java.lang.String = null,
    nameTarget: java.lang.String = null,
    port: scala.Int | scala.Double = null,
    priority: scala.Int | scala.Double = null,
    protocol: java.lang.String = null,
    recordType: java.lang.String = null,
    service: java.lang.String = null,
    supportedService: java.lang.String = null,
    ttl: scala.Int | scala.Double = null,
    weight: scala.Int | scala.Double = null
  ): DomainDnsSrvRecord = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(isOptional)) __obj.updateDynamic("isOptional")(isOptional)
    if (label != null) __obj.updateDynamic("label")(label)
    if (nameTarget != null) __obj.updateDynamic("nameTarget")(nameTarget)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol)
    if (recordType != null) __obj.updateDynamic("recordType")(recordType)
    if (service != null) __obj.updateDynamic("service")(service)
    if (supportedService != null) __obj.updateDynamic("supportedService")(supportedService)
    if (ttl != null) __obj.updateDynamic("ttl")(ttl.asInstanceOf[js.Any])
    if (weight != null) __obj.updateDynamic("weight")(weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomainDnsSrvRecord]
  }
}

