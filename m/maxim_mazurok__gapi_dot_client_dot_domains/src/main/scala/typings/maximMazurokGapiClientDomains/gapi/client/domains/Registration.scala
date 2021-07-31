package typings.maximMazurokGapiClientDomains.gapi.client.domains

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Registration extends StObject {
  
  /**
    * Required. Settings for contact information linked to the `Registration`. You cannot update these with the `UpdateRegistration` method. To update these settings, use the
    * `ConfigureContactSettings` method.
    */
  var contactSettings: js.UndefOr[ContactSettings] = js.undefined
  
  /** Output only. The creation timestamp of the `Registration` resource. */
  var createTime: js.UndefOr[String] = js.undefined
  
  /**
    * Settings controlling the DNS configuration of the `Registration`. You cannot update these with the `UpdateRegistration` method. To update these settings, use the
    * `ConfigureDnsSettings` method.
    */
  var dnsSettings: js.UndefOr[DnsSettings] = js.undefined
  
  /** Required. Immutable. The domain name. Unicode domain names must be expressed in Punycode format. */
  var domainName: js.UndefOr[String] = js.undefined
  
  /** Output only. The expiration timestamp of the `Registration`. */
  var expireTime: js.UndefOr[String] = js.undefined
  
  /** Output only. The set of issues with the `Registration` that require attention. */
  var issues: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Set of labels associated with the `Registration`. */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientDomains.maximMazurokGapiClientDomainsStrings.Registration & TopLevel[js.Any]
  ] = js.undefined
  
  /**
    * Settings for management of the `Registration`, including renewal, billing, and transfer. You cannot update these with the `UpdateRegistration` method. To update these settings, use
    * the `ConfigureManagementSettings` method.
    */
  var managementSettings: js.UndefOr[ManagementSettings] = js.undefined
  
  /** Output only. Name of the `Registration` resource, in the format `projects/∗/locations/∗/registrations/`. */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. Pending contact settings for the `Registration`. Updates to the `contact_settings` field that change its `registrant_contact` or `privacy` fields require email
    * confirmation by the `registrant_contact` before taking effect. This field is set only if there are pending updates to the `contact_settings` that have not yet been confirmed. To
    * confirm the changes, the `registrant_contact` must follow the instructions in the email they receive.
    */
  var pendingContactSettings: js.UndefOr[ContactSettings] = js.undefined
  
  /** Output only. The state of the `Registration` */
  var state: js.UndefOr[String] = js.undefined
  
  /** Output only. Set of options for the `contact_settings.privacy` field that this `Registration` supports. */
  var supportedPrivacy: js.UndefOr[js.Array[String]] = js.undefined
}
object Registration {
  
  @scala.inline
  def apply(): Registration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Registration]
  }
  
  @scala.inline
  implicit class RegistrationMutableBuilder[Self <: Registration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContactSettings(value: ContactSettings): Self = StObject.set(x, "contactSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContactSettingsUndefined: Self = StObject.set(x, "contactSettings", js.undefined)
    
    @scala.inline
    def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    @scala.inline
    def setDnsSettings(value: DnsSettings): Self = StObject.set(x, "dnsSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDnsSettingsUndefined: Self = StObject.set(x, "dnsSettings", js.undefined)
    
    @scala.inline
    def setDomainName(value: String): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainNameUndefined: Self = StObject.set(x, "domainName", js.undefined)
    
    @scala.inline
    def setExpireTime(value: String): Self = StObject.set(x, "expireTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpireTimeUndefined: Self = StObject.set(x, "expireTime", js.undefined)
    
    @scala.inline
    def setIssues(value: js.Array[String]): Self = StObject.set(x, "issues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIssuesUndefined: Self = StObject.set(x, "issues", js.undefined)
    
    @scala.inline
    def setIssuesVarargs(value: String*): Self = StObject.set(x, "issues", js.Array(value :_*))
    
    @scala.inline
    def setLabels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientDomains.maximMazurokGapiClientDomainsStrings.Registration & TopLevel[js.Any]
    ): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setManagementSettings(value: ManagementSettings): Self = StObject.set(x, "managementSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManagementSettingsUndefined: Self = StObject.set(x, "managementSettings", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPendingContactSettings(value: ContactSettings): Self = StObject.set(x, "pendingContactSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPendingContactSettingsUndefined: Self = StObject.set(x, "pendingContactSettings", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    @scala.inline
    def setSupportedPrivacy(value: js.Array[String]): Self = StObject.set(x, "supportedPrivacy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedPrivacyUndefined: Self = StObject.set(x, "supportedPrivacy", js.undefined)
    
    @scala.inline
    def setSupportedPrivacyVarargs(value: String*): Self = StObject.set(x, "supportedPrivacy", js.Array(value :_*))
  }
}
