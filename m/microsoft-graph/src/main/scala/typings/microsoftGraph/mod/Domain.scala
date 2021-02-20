package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
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
  implicit class DomainMutableBuilder[Self <: Domain] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthenticationType(value: String): Self = StObject.set(x, "authenticationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthenticationTypeUndefined: Self = StObject.set(x, "authenticationType", js.undefined)
    
    @scala.inline
    def setAvailabilityStatus(value: NullableOption[String]): Self = StObject.set(x, "availabilityStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailabilityStatusNull: Self = StObject.set(x, "availabilityStatus", null)
    
    @scala.inline
    def setAvailabilityStatusUndefined: Self = StObject.set(x, "availabilityStatus", js.undefined)
    
    @scala.inline
    def setDomainNameReferences(value: NullableOption[js.Array[DirectoryObject]]): Self = StObject.set(x, "domainNameReferences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainNameReferencesNull: Self = StObject.set(x, "domainNameReferences", null)
    
    @scala.inline
    def setDomainNameReferencesUndefined: Self = StObject.set(x, "domainNameReferences", js.undefined)
    
    @scala.inline
    def setDomainNameReferencesVarargs(value: DirectoryObject*): Self = StObject.set(x, "domainNameReferences", js.Array(value :_*))
    
    @scala.inline
    def setIsAdminManaged(value: Boolean): Self = StObject.set(x, "isAdminManaged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsAdminManagedUndefined: Self = StObject.set(x, "isAdminManaged", js.undefined)
    
    @scala.inline
    def setIsDefault(value: Boolean): Self = StObject.set(x, "isDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDefaultUndefined: Self = StObject.set(x, "isDefault", js.undefined)
    
    @scala.inline
    def setIsInitial(value: Boolean): Self = StObject.set(x, "isInitial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsInitialUndefined: Self = StObject.set(x, "isInitial", js.undefined)
    
    @scala.inline
    def setIsRoot(value: Boolean): Self = StObject.set(x, "isRoot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsRootUndefined: Self = StObject.set(x, "isRoot", js.undefined)
    
    @scala.inline
    def setIsVerified(value: Boolean): Self = StObject.set(x, "isVerified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsVerifiedUndefined: Self = StObject.set(x, "isVerified", js.undefined)
    
    @scala.inline
    def setManufacturer(value: NullableOption[String]): Self = StObject.set(x, "manufacturer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManufacturerNull: Self = StObject.set(x, "manufacturer", null)
    
    @scala.inline
    def setManufacturerUndefined: Self = StObject.set(x, "manufacturer", js.undefined)
    
    @scala.inline
    def setModel(value: NullableOption[String]): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelNull: Self = StObject.set(x, "model", null)
    
    @scala.inline
    def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    @scala.inline
    def setPasswordNotificationWindowInDays(value: NullableOption[Double]): Self = StObject.set(x, "passwordNotificationWindowInDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordNotificationWindowInDaysNull: Self = StObject.set(x, "passwordNotificationWindowInDays", null)
    
    @scala.inline
    def setPasswordNotificationWindowInDaysUndefined: Self = StObject.set(x, "passwordNotificationWindowInDays", js.undefined)
    
    @scala.inline
    def setPasswordValidityPeriodInDays(value: NullableOption[Double]): Self = StObject.set(x, "passwordValidityPeriodInDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordValidityPeriodInDaysNull: Self = StObject.set(x, "passwordValidityPeriodInDays", null)
    
    @scala.inline
    def setPasswordValidityPeriodInDaysUndefined: Self = StObject.set(x, "passwordValidityPeriodInDays", js.undefined)
    
    @scala.inline
    def setServiceConfigurationRecords(value: NullableOption[js.Array[DomainDnsRecord]]): Self = StObject.set(x, "serviceConfigurationRecords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceConfigurationRecordsNull: Self = StObject.set(x, "serviceConfigurationRecords", null)
    
    @scala.inline
    def setServiceConfigurationRecordsUndefined: Self = StObject.set(x, "serviceConfigurationRecords", js.undefined)
    
    @scala.inline
    def setServiceConfigurationRecordsVarargs(value: DomainDnsRecord*): Self = StObject.set(x, "serviceConfigurationRecords", js.Array(value :_*))
    
    @scala.inline
    def setState(value: NullableOption[DomainState]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateNull: Self = StObject.set(x, "state", null)
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    @scala.inline
    def setSupportedServices(value: js.Array[String]): Self = StObject.set(x, "supportedServices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedServicesUndefined: Self = StObject.set(x, "supportedServices", js.undefined)
    
    @scala.inline
    def setSupportedServicesVarargs(value: String*): Self = StObject.set(x, "supportedServices", js.Array(value :_*))
    
    @scala.inline
    def setVerificationDnsRecords(value: NullableOption[js.Array[DomainDnsRecord]]): Self = StObject.set(x, "verificationDnsRecords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerificationDnsRecordsNull: Self = StObject.set(x, "verificationDnsRecords", null)
    
    @scala.inline
    def setVerificationDnsRecordsUndefined: Self = StObject.set(x, "verificationDnsRecords", js.undefined)
    
    @scala.inline
    def setVerificationDnsRecordsVarargs(value: DomainDnsRecord*): Self = StObject.set(x, "verificationDnsRecords", js.Array(value :_*))
  }
}
