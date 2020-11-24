package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DomainDnsRecord extends Entity {
  
  /**
    * If false, this record must be configured by the customer at the DNS host for Microsoft Online Services to operate
    * correctly with the domain.
    */
  var isOptional: js.UndefOr[Boolean] = js.native
  
  // Value used when configuring the name of the DNS record at the DNS host.
  var label: js.UndefOr[String] = js.native
  
  // Indicates what type of DNS record this entity represents.The value can be one of the following: CName, Mx, Srv, TxtKey
  var recordType: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * Microsoft Online Service or feature that has a dependency on this DNS record.Can be one of the following values: null,
    * Email, Sharepoint, EmailInternalRelayOnly, OfficeCommunicationsOnline, SharePointDefaultDomain, FullRedelegation,
    * SharePointPublic, OrgIdAuthentication, Yammer, Intune
    */
  var supportedService: js.UndefOr[String] = js.native
  
  // Value to use when configuring the time-to-live (ttl) property of the DNS record at the DNS host. Not nullable
  var ttl: js.UndefOr[Double] = js.native
}
object DomainDnsRecord {
  
  @scala.inline
  def apply(): DomainDnsRecord = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainDnsRecord]
  }
  
  @scala.inline
  implicit class DomainDnsRecordOps[Self <: DomainDnsRecord] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setIsOptional(value: Boolean): Self = this.set("isOptional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsOptional: Self = this.set("isOptional", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setRecordType(value: NullableOption[String]): Self = this.set("recordType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecordType: Self = this.set("recordType", js.undefined)
    
    @scala.inline
    def setRecordTypeNull: Self = this.set("recordType", null)
    
    @scala.inline
    def setSupportedService(value: String): Self = this.set("supportedService", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupportedService: Self = this.set("supportedService", js.undefined)
    
    @scala.inline
    def setTtl(value: Double): Self = this.set("ttl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTtl: Self = this.set("ttl", js.undefined)
  }
}
