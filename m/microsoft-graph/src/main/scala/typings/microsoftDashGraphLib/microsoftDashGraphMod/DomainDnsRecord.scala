package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DomainDnsRecord extends Entity {
  /**
    * If false, this record must be configured by the customer at the DNS host for Microsoft Online Services to operate
    * correctly with the domain.
    */
  var isOptional: js.UndefOr[scala.Boolean] = js.undefined
  // Value used when configuring the name of the DNS record at the DNS host.
  var label: js.UndefOr[java.lang.String] = js.undefined
  // Indicates what type of DNS record this entity represents.The value can be one of the following: CName, Mx, Srv, TxtKey
  var recordType: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Microsoft Online Service or feature that has a dependency on this DNS record.Can be one of the following values: null,
    * Email, Sharepoint, EmailInternalRelayOnly, OfficeCommunicationsOnline, SharePointDefaultDomain, FullRedelegation,
    * SharePointPublic, OrgIdAuthentication, Yammer, Intune
    */
  var supportedService: js.UndefOr[java.lang.String] = js.undefined
  // Value to use when configuring the time-to-live (ttl) property of the DNS record at the DNS host. Not nullable
  var ttl: js.UndefOr[scala.Double] = js.undefined
}

object DomainDnsRecord {
  @scala.inline
  def apply(
    id: java.lang.String = null,
    isOptional: js.UndefOr[scala.Boolean] = js.undefined,
    label: java.lang.String = null,
    recordType: java.lang.String = null,
    supportedService: java.lang.String = null,
    ttl: scala.Int | scala.Double = null
  ): DomainDnsRecord = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(isOptional)) __obj.updateDynamic("isOptional")(isOptional)
    if (label != null) __obj.updateDynamic("label")(label)
    if (recordType != null) __obj.updateDynamic("recordType")(recordType)
    if (supportedService != null) __obj.updateDynamic("supportedService")(supportedService)
    if (ttl != null) __obj.updateDynamic("ttl")(ttl.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomainDnsRecord]
  }
}

