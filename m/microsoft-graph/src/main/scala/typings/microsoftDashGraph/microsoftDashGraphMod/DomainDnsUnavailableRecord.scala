package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DomainDnsUnavailableRecord extends DomainDnsRecord {
  // Provides the reason why the DomainDnsUnavailableRecord entity is returned.
  var description: js.UndefOr[String] = js.undefined
}

object DomainDnsUnavailableRecord {
  @scala.inline
  def apply(
    description: String = null,
    id: String = null,
    isOptional: js.UndefOr[Boolean] = js.undefined,
    label: String = null,
    recordType: String = null,
    supportedService: String = null,
    ttl: Int | Double = null
  ): DomainDnsUnavailableRecord = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description)
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(isOptional)) __obj.updateDynamic("isOptional")(isOptional)
    if (label != null) __obj.updateDynamic("label")(label)
    if (recordType != null) __obj.updateDynamic("recordType")(recordType)
    if (supportedService != null) __obj.updateDynamic("supportedService")(supportedService)
    if (ttl != null) __obj.updateDynamic("ttl")(ttl.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomainDnsUnavailableRecord]
  }
}

