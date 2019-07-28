package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DomainDnsMxRecord extends DomainDnsRecord {
  // Value used when configuring the answer/destination/value of the MX record at the DNS host.
  var mailExchange: js.UndefOr[String] = js.undefined
  // Value used when configuring the Preference/Priority property of the MX record at the DNS host.
  var preference: js.UndefOr[Double] = js.undefined
}

object DomainDnsMxRecord {
  @scala.inline
  def apply(
    id: String = null,
    isOptional: js.UndefOr[Boolean] = js.undefined,
    label: String = null,
    mailExchange: String = null,
    preference: Int | Double = null,
    recordType: String = null,
    supportedService: String = null,
    ttl: Int | Double = null
  ): DomainDnsMxRecord = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(isOptional)) __obj.updateDynamic("isOptional")(isOptional)
    if (label != null) __obj.updateDynamic("label")(label)
    if (mailExchange != null) __obj.updateDynamic("mailExchange")(mailExchange)
    if (preference != null) __obj.updateDynamic("preference")(preference.asInstanceOf[js.Any])
    if (recordType != null) __obj.updateDynamic("recordType")(recordType)
    if (supportedService != null) __obj.updateDynamic("supportedService")(supportedService)
    if (ttl != null) __obj.updateDynamic("ttl")(ttl.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomainDnsMxRecord]
  }
}

