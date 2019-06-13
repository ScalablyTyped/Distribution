package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DomainDnsTxtRecord extends DomainDnsRecord {
  /** Value used when configuring the text property at the DNS host. */
  var text: js.UndefOr[java.lang.String] = js.undefined
}

object DomainDnsTxtRecord {
  @scala.inline
  def apply(
    id: java.lang.String = null,
    isOptional: js.UndefOr[scala.Boolean] = js.undefined,
    label: java.lang.String = null,
    recordType: java.lang.String = null,
    supportedService: java.lang.String = null,
    text: java.lang.String = null,
    ttl: scala.Int | scala.Double = null
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

