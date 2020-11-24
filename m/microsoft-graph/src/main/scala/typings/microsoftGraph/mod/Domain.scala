package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Domain extends Entity {
  
  /**
    * Indicates the configured authentication type for the domain. The value is either Managed or Federated. Managed
    * indicates a cloud managed domain where Azure AD performs user authentication.Federated indicates authentication is
    * federated with an identity provider such as the tenant's on-premises Active Directory via Active Directory Federation
    * Services. This property is read-only and is not nullable.
    */
  var authenticationType: js.UndefOr[String] = js.native
  
  /**
    * This property is always null except when the verify action is used. When the verify action is used, a domain entity is
    * returned in the response. The availabilityStatus property of the domain entity in the response is either
    * AvailableImmediately or EmailVerifiedDomainTakeoverScheduled.
    */
  var availabilityStatus: js.UndefOr[NullableOption[String]] = js.native
  
  // Read-only, Nullable
  var domainNameReferences: js.UndefOr[NullableOption[js.Array[DirectoryObject]]] = js.native
  
  /**
    * The value of the property is false if the DNS record management of the domain has been delegated to Microsoft 365.
    * Otherwise, the value is true. Not nullable
    */
  var isAdminManaged: js.UndefOr[Boolean] = js.native
  
  /**
    * True if this is the default domain that is used for user creation. There is only one default domain per company. Not
    * nullable
    */
  var isDefault: js.UndefOr[Boolean] = js.native
  
  /**
    * True if this is the initial domain created by Microsoft Online Services (companyname.onmicrosoft.com). There is only
    * one initial domain per company. Not nullable
    */
  var isInitial: js.UndefOr[Boolean] = js.native
  
  // True if the domain is a verified root domain. Otherwise, false if the domain is a subdomain or unverified. Not nullable
  var isRoot: js.UndefOr[Boolean] = js.native
  
  // True if the domain has completed domain ownership verification. Not nullable
  var isVerified: js.UndefOr[Boolean] = js.native
  
  var manufacturer: js.UndefOr[NullableOption[String]] = js.native
  
  var model: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * Specifies the number of days before a user receives notification that their password will expire. If the property is
    * not set, a default value of 14 days will be used.
    */
  var passwordNotificationWindowInDays: js.UndefOr[NullableOption[Double]] = js.native
  
  /**
    * Specifies the length of time that a password is valid before it must be changed. If the property is not set, a default
    * value of 90 days will be used.
    */
  var passwordValidityPeriodInDays: js.UndefOr[NullableOption[Double]] = js.native
  
  /**
    * DNS records the customer adds to the DNS zone file of the domain before the domain can be used by Microsoft Online
    * services.Read-only, Nullable
    */
  var serviceConfigurationRecords: js.UndefOr[NullableOption[js.Array[DomainDnsRecord]]] = js.native
  
  // Status of asynchronous operations scheduled for the domain.
  var state: js.UndefOr[NullableOption[DomainState]] = js.native
  
  /**
    * The capabilities assigned to the domain.Can include 0, 1 or more of following values: Email, Sharepoint,
    * EmailInternalRelayOnly, OfficeCommunicationsOnline, SharePointDefaultDomain, FullRedelegation, SharePointPublic,
    * OrgIdAuthentication, Yammer, Intune The values which you can add/remove using Graph API include: Email,
    * OfficeCommunicationsOnline, YammerNot nullable
    */
  var supportedServices: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * DNS records that the customer adds to the DNS zone file of the domain before the customer can complete domain ownership
    * verification with Azure AD.Read-only, Nullable
    */
  var verificationDnsRecords: js.UndefOr[NullableOption[js.Array[DomainDnsRecord]]] = js.native
}
object Domain {
  
  @scala.inline
  def apply(): Domain = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Domain]
  }
  
  @scala.inline
  implicit class DomainOps[Self <: Domain] (val x: Self) extends AnyVal {
    
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
    def setAuthenticationType(value: String): Self = this.set("authenticationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthenticationType: Self = this.set("authenticationType", js.undefined)
    
    @scala.inline
    def setAvailabilityStatus(value: NullableOption[String]): Self = this.set("availabilityStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvailabilityStatus: Self = this.set("availabilityStatus", js.undefined)
    
    @scala.inline
    def setAvailabilityStatusNull: Self = this.set("availabilityStatus", null)
    
    @scala.inline
    def setDomainNameReferencesVarargs(value: DirectoryObject*): Self = this.set("domainNameReferences", js.Array(value :_*))
    
    @scala.inline
    def setDomainNameReferences(value: NullableOption[js.Array[DirectoryObject]]): Self = this.set("domainNameReferences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomainNameReferences: Self = this.set("domainNameReferences", js.undefined)
    
    @scala.inline
    def setDomainNameReferencesNull: Self = this.set("domainNameReferences", null)
    
    @scala.inline
    def setIsAdminManaged(value: Boolean): Self = this.set("isAdminManaged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsAdminManaged: Self = this.set("isAdminManaged", js.undefined)
    
    @scala.inline
    def setIsDefault(value: Boolean): Self = this.set("isDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsDefault: Self = this.set("isDefault", js.undefined)
    
    @scala.inline
    def setIsInitial(value: Boolean): Self = this.set("isInitial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsInitial: Self = this.set("isInitial", js.undefined)
    
    @scala.inline
    def setIsRoot(value: Boolean): Self = this.set("isRoot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsRoot: Self = this.set("isRoot", js.undefined)
    
    @scala.inline
    def setIsVerified(value: Boolean): Self = this.set("isVerified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsVerified: Self = this.set("isVerified", js.undefined)
    
    @scala.inline
    def setManufacturer(value: NullableOption[String]): Self = this.set("manufacturer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManufacturer: Self = this.set("manufacturer", js.undefined)
    
    @scala.inline
    def setManufacturerNull: Self = this.set("manufacturer", null)
    
    @scala.inline
    def setModel(value: NullableOption[String]): Self = this.set("model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    
    @scala.inline
    def setModelNull: Self = this.set("model", null)
    
    @scala.inline
    def setPasswordNotificationWindowInDays(value: NullableOption[Double]): Self = this.set("passwordNotificationWindowInDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePasswordNotificationWindowInDays: Self = this.set("passwordNotificationWindowInDays", js.undefined)
    
    @scala.inline
    def setPasswordNotificationWindowInDaysNull: Self = this.set("passwordNotificationWindowInDays", null)
    
    @scala.inline
    def setPasswordValidityPeriodInDays(value: NullableOption[Double]): Self = this.set("passwordValidityPeriodInDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePasswordValidityPeriodInDays: Self = this.set("passwordValidityPeriodInDays", js.undefined)
    
    @scala.inline
    def setPasswordValidityPeriodInDaysNull: Self = this.set("passwordValidityPeriodInDays", null)
    
    @scala.inline
    def setServiceConfigurationRecordsVarargs(value: DomainDnsRecord*): Self = this.set("serviceConfigurationRecords", js.Array(value :_*))
    
    @scala.inline
    def setServiceConfigurationRecords(value: NullableOption[js.Array[DomainDnsRecord]]): Self = this.set("serviceConfigurationRecords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceConfigurationRecords: Self = this.set("serviceConfigurationRecords", js.undefined)
    
    @scala.inline
    def setServiceConfigurationRecordsNull: Self = this.set("serviceConfigurationRecords", null)
    
    @scala.inline
    def setState(value: NullableOption[DomainState]): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    
    @scala.inline
    def setStateNull: Self = this.set("state", null)
    
    @scala.inline
    def setSupportedServicesVarargs(value: String*): Self = this.set("supportedServices", js.Array(value :_*))
    
    @scala.inline
    def setSupportedServices(value: js.Array[String]): Self = this.set("supportedServices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupportedServices: Self = this.set("supportedServices", js.undefined)
    
    @scala.inline
    def setVerificationDnsRecordsVarargs(value: DomainDnsRecord*): Self = this.set("verificationDnsRecords", js.Array(value :_*))
    
    @scala.inline
    def setVerificationDnsRecords(value: NullableOption[js.Array[DomainDnsRecord]]): Self = this.set("verificationDnsRecords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerificationDnsRecords: Self = this.set("verificationDnsRecords", js.undefined)
    
    @scala.inline
    def setVerificationDnsRecordsNull: Self = this.set("verificationDnsRecords", null)
  }
}
