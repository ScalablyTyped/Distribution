package typings.maximMazurokGapiClientDomains.gapi.client.domains

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Registration extends js.Object {
  
  /**
    * Required. Settings for contact information linked to the `Registration`. You cannot update these with the `UpdateRegistration` method. To update these settings, use the
    * `ConfigureContactSettings` method.
    */
  var contactSettings: js.UndefOr[ContactSettings] = js.native
  
  /** Output only. The creation timestamp of the `Registration` resource. */
  var createTime: js.UndefOr[String] = js.native
  
  /**
    * Settings controlling the DNS configuration of the `Registration`. You cannot update these with the `UpdateRegistration` method. To update these settings, use the
    * `ConfigureDnsSettings` method.
    */
  var dnsSettings: js.UndefOr[DnsSettings] = js.native
  
  /** Required. Immutable. The domain name. Unicode domain names must be expressed in Punycode format. */
  var domainName: js.UndefOr[String] = js.native
  
  /** Output only. The expiration timestamp of the `Registration`. */
  var expireTime: js.UndefOr[String] = js.native
  
  /** Output only. The set of issues with the `Registration` that require attention. */
  var issues: js.UndefOr[js.Array[String]] = js.native
  
  /** Set of labels associated with the `Registration`. */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientDomains.maximMazurokGapiClientDomainsStrings.Registration with TopLevel[js.Any]
  ] = js.native
  
  /**
    * Settings for management of the `Registration`, including renewal, billing, and transfer. You cannot update these with the `UpdateRegistration` method. To update these settings, use
    * the `ConfigureManagementSettings` method.
    */
  var managementSettings: js.UndefOr[ManagementSettings] = js.native
  
  /** Output only. Name of the `Registration` resource, in the format `projects/∗/locations/∗/registrations/`. */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Output only. Pending contact settings for the `Registration`. Updates to the `contact_settings` field that change its `registrant_contact` or `privacy` fields require email
    * confirmation by the `registrant_contact` before taking effect. This field is set only if there are pending updates to the `contact_settings` that have not yet been confirmed. To
    * confirm the changes, the `registrant_contact` must follow the instructions in the email they receive.
    */
  var pendingContactSettings: js.UndefOr[ContactSettings] = js.native
  
  /** Output only. The state of the `Registration` */
  var state: js.UndefOr[String] = js.native
  
  /** Output only. Set of options for the `contact_settings.privacy` field that this `Registration` supports. */
  var supportedPrivacy: js.UndefOr[js.Array[String]] = js.native
}
object Registration {
  
  @scala.inline
  def apply(): Registration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Registration]
  }
  
  @scala.inline
  implicit class RegistrationOps[Self <: Registration] (val x: Self) extends AnyVal {
    
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
    def setContactSettings(value: ContactSettings): Self = this.set("contactSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContactSettings: Self = this.set("contactSettings", js.undefined)
    
    @scala.inline
    def setCreateTime(value: String): Self = this.set("createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    
    @scala.inline
    def setDnsSettings(value: DnsSettings): Self = this.set("dnsSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDnsSettings: Self = this.set("dnsSettings", js.undefined)
    
    @scala.inline
    def setDomainName(value: String): Self = this.set("domainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomainName: Self = this.set("domainName", js.undefined)
    
    @scala.inline
    def setExpireTime(value: String): Self = this.set("expireTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpireTime: Self = this.set("expireTime", js.undefined)
    
    @scala.inline
    def setIssuesVarargs(value: String*): Self = this.set("issues", js.Array(value :_*))
    
    @scala.inline
    def setIssues(value: js.Array[String]): Self = this.set("issues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIssues: Self = this.set("issues", js.undefined)
    
    @scala.inline
    def setLabels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientDomains.maximMazurokGapiClientDomainsStrings.Registration with TopLevel[js.Any]
    ): Self = this.set("labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    
    @scala.inline
    def setManagementSettings(value: ManagementSettings): Self = this.set("managementSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManagementSettings: Self = this.set("managementSettings", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPendingContactSettings(value: ContactSettings): Self = this.set("pendingContactSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePendingContactSettings: Self = this.set("pendingContactSettings", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    
    @scala.inline
    def setSupportedPrivacyVarargs(value: String*): Self = this.set("supportedPrivacy", js.Array(value :_*))
    
    @scala.inline
    def setSupportedPrivacy(value: js.Array[String]): Self = this.set("supportedPrivacy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupportedPrivacy: Self = this.set("supportedPrivacy", js.undefined)
  }
}
