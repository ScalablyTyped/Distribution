package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DomainDnsUnavailableRecord extends DomainDnsRecord {
  // Provides the reason why the DomainDnsUnavailableRecord entity is returned.
  var description: js.UndefOr[java.lang.String] = js.undefined
}

object DomainDnsUnavailableRecord {
  @scala.inline
  def apply(
    description: java.lang.String = null,
    id: java.lang.String = null,
    isOptional: js.UndefOr[scala.Boolean] = js.undefined,
    label: java.lang.String = null,
    recordType: java.lang.String = null,
    supportedService: java.lang.String = null,
    ttl: scala.Int | scala.Double = null
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

