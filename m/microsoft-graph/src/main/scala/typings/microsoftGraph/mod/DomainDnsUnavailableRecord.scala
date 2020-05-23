package typings.microsoftGraph.mod

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
    ttl: js.UndefOr[Double] = js.undefined
  ): DomainDnsUnavailableRecord = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(isOptional)) __obj.updateDynamic("isOptional")(isOptional.get.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (recordType != null) __obj.updateDynamic("recordType")(recordType.asInstanceOf[js.Any])
    if (supportedService != null) __obj.updateDynamic("supportedService")(supportedService.asInstanceOf[js.Any])
    if (!js.isUndefined(ttl)) __obj.updateDynamic("ttl")(ttl.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomainDnsUnavailableRecord]
  }
}

