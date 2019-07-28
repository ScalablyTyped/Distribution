package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DomainDnsTxtRecord extends DomainDnsRecord {
  // Value used when configuring the text property at the DNS host.
  var text: js.UndefOr[String] = js.undefined
}

object DomainDnsTxtRecord {
  @scala.inline
  def apply(
    id: String = null,
    isOptional: js.UndefOr[Boolean] = js.undefined,
    label: String = null,
    recordType: String = null,
    supportedService: String = null,
    text: String = null,
    ttl: Int | Double = null
  ): DomainDnsTxtRecord = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(isOptional)) __obj.updateDynamic("isOptional")(isOptional)
    if (label != null) __obj.updateDynamic("label")(label)
    if (recordType != null) __obj.updateDynamic("recordType")(recordType)
    if (supportedService != null) __obj.updateDynamic("supportedService")(supportedService)
    if (text != null) __obj.updateDynamic("text")(text)
    if (ttl != null) __obj.updateDynamic("ttl")(ttl.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomainDnsTxtRecord]
  }
}

