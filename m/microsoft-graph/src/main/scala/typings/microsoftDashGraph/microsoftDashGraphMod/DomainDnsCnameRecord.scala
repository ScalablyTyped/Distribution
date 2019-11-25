package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DomainDnsCnameRecord extends DomainDnsRecord {
  // The canonical name of the CNAME record. Used to configure the CNAME record at the DNS host.
  var canonicalName: js.UndefOr[String] = js.undefined
}

object DomainDnsCnameRecord {
  @scala.inline
  def apply(
    canonicalName: String = null,
    id: String = null,
    isOptional: js.UndefOr[Boolean] = js.undefined,
    label: String = null,
    recordType: String = null,
    supportedService: String = null,
    ttl: Int | Double = null
  ): DomainDnsCnameRecord = {
    val __obj = js.Dynamic.literal()
    if (canonicalName != null) __obj.updateDynamic("canonicalName")(canonicalName.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(isOptional)) __obj.updateDynamic("isOptional")(isOptional.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (recordType != null) __obj.updateDynamic("recordType")(recordType.asInstanceOf[js.Any])
    if (supportedService != null) __obj.updateDynamic("supportedService")(supportedService.asInstanceOf[js.Any])
    if (ttl != null) __obj.updateDynamic("ttl")(ttl.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomainDnsCnameRecord]
  }
}

