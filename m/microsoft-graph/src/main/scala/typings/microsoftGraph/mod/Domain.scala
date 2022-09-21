package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Domain
  extends StObject
     with Entity {
  
  /**
    * Indicates the configured authentication type for the domain. The value is either Managed or Federated. Managed
    * indicates a cloud managed domain where Azure AD performs user authentication. Federated indicates authentication is
    * federated with an identity provider such as the tenant's on-premises Active Directory via Active Directory Federation
    * Services. This property is read-only and is not nullable.
    */
  var authenticationType: js.UndefOr[String] = js.undefined
  
  /**
    * This property is always null except when the verify action is used. When the verify action is used, a domain entity is
    * returned in the response. The availabilityStatus property of the domain entity in the response is either
    * AvailableImmediately or EmailVerifiedDomainTakeoverScheduled.
    */
  var availabilityStatus: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * The objects such as users and groups that reference the domain ID. Read-only, Nullable. Supports $expand and $filter by
    * the OData type of objects returned. For example /domains/{domainId}/domainNameReferences/microsoft.graph.user and
    * /domains/{domainId}/domainNameReferences/microsoft.graph.group.
    */
  var domainNameReferences: js.UndefOr[NullableOption[js.Array[DirectoryObject]]] = js.undefined
  
  // Domain settings configured by a customer when federated with Azure AD. Supports $expand.
  var federationConfiguration: js.UndefOr[NullableOption[js.Array[InternalDomainFederation]]] = js.undefined
  
  /**
    * The value of the property is false if the DNS record management of the domain has been delegated to Microsoft 365.
    * Otherwise, the value is true. Not nullable
    */
  var isAdminManaged: js.UndefOr[Boolean] = js.undefined
  
  /**
    * true if this is the default domain that is used for user creation. There is only one default domain per company. Not
    * nullable
    */
  var isDefault: js.UndefOr[Boolean] = js.undefined
  
  /**
    * true if this is the initial domain created by Microsoft Online Services (companyname.onmicrosoft.com). There is only
    * one initial domain per company. Not nullable
    */
  var isInitial: js.UndefOr[Boolean] = js.undefined
  
  // true if the domain is a verified root domain. Otherwise, false if the domain is a subdomain or unverified. Not nullable
  var isRoot: js.UndefOr[Boolean] = js.undefined
  
  // true if the domain has completed domain ownership verification. Not nullable
  var isVerified: js.UndefOr[Boolean] = js.undefined
  
  var manufacturer: js.UndefOr[NullableOption[String]] = js.undefined
  
  var model: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Specifies the number of days before a user receives notification that their password will expire. If the property is
    * not set, a default value of 14 days will be used.
    */
  var passwordNotificationWindowInDays: js.UndefOr[NullableOption[Double]] = js.undefined
  
  /**
    * Specifies the length of time that a password is valid before it must be changed. If the property is not set, a default
    * value of 90 days will be used.
    */
  var passwordValidityPeriodInDays: js.UndefOr[NullableOption[Double]] = js.undefined
  
  /**
    * DNS records the customer adds to the DNS zone file of the domain before the domain can be used by Microsoft Online
    * services. Read-only, Nullable. Supports $expand.
    */
  var serviceConfigurationRecords: js.UndefOr[NullableOption[js.Array[DomainDnsRecord]]] = js.undefined
  
  // Status of asynchronous operations scheduled for the domain.
  var state: js.UndefOr[NullableOption[DomainState]] = js.undefined
  
  /**
    * The capabilities assigned to the domain. Can include 0, 1 or more of following values: Email, Sharepoint,
    * EmailInternalRelayOnly, OfficeCommunicationsOnline, SharePointDefaultDomain, FullRedelegation, SharePointPublic,
    * OrgIdAuthentication, Yammer, Intune. The values which you can add/remove using Graph API include: Email,
    * OfficeCommunicationsOnline, Yammer. Not nullable.
    */
  var supportedServices: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * DNS records that the customer adds to the DNS zone file of the domain before the customer can complete domain ownership
    * verification with Azure AD. Read-only, Nullable. Supports $expand.
    */
  var verificationDnsRecords: js.UndefOr[NullableOption[js.Array[DomainDnsRecord]]] = js.undefined
}
object Domain {
  
  inline def apply(): Domain = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Domain]
  }
  
  extension [Self <: Domain](x: Self) {
    
    inline def setAuthenticationType(value: String): Self = StObject.set(x, "authenticationType", value.asInstanceOf[js.Any])
    
    inline def setAuthenticationTypeUndefined: Self = StObject.set(x, "authenticationType", js.undefined)
    
    inline def setAvailabilityStatus(value: NullableOption[String]): Self = StObject.set(x, "availabilityStatus", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityStatusNull: Self = StObject.set(x, "availabilityStatus", null)
    
    inline def setAvailabilityStatusUndefined: Self = StObject.set(x, "availabilityStatus", js.undefined)
    
    inline def setDomainNameReferences(value: NullableOption[js.Array[DirectoryObject]]): Self = StObject.set(x, "domainNameReferences", value.asInstanceOf[js.Any])
    
    inline def setDomainNameReferencesNull: Self = StObject.set(x, "domainNameReferences", null)
    
    inline def setDomainNameReferencesUndefined: Self = StObject.set(x, "domainNameReferences", js.undefined)
    
    inline def setDomainNameReferencesVarargs(value: DirectoryObject*): Self = StObject.set(x, "domainNameReferences", js.Array(value*))
    
    inline def setFederationConfiguration(value: NullableOption[js.Array[InternalDomainFederation]]): Self = StObject.set(x, "federationConfiguration", value.asInstanceOf[js.Any])
    
    inline def setFederationConfigurationNull: Self = StObject.set(x, "federationConfiguration", null)
    
    inline def setFederationConfigurationUndefined: Self = StObject.set(x, "federationConfiguration", js.undefined)
    
    inline def setFederationConfigurationVarargs(value: InternalDomainFederation*): Self = StObject.set(x, "federationConfiguration", js.Array(value*))
    
    inline def setIsAdminManaged(value: Boolean): Self = StObject.set(x, "isAdminManaged", value.asInstanceOf[js.Any])
    
    inline def setIsAdminManagedUndefined: Self = StObject.set(x, "isAdminManaged", js.undefined)
    
    inline def setIsDefault(value: Boolean): Self = StObject.set(x, "isDefault", value.asInstanceOf[js.Any])
    
    inline def setIsDefaultUndefined: Self = StObject.set(x, "isDefault", js.undefined)
    
    inline def setIsInitial(value: Boolean): Self = StObject.set(x, "isInitial", value.asInstanceOf[js.Any])
    
    inline def setIsInitialUndefined: Self = StObject.set(x, "isInitial", js.undefined)
    
    inline def setIsRoot(value: Boolean): Self = StObject.set(x, "isRoot", value.asInstanceOf[js.Any])
    
    inline def setIsRootUndefined: Self = StObject.set(x, "isRoot", js.undefined)
    
    inline def setIsVerified(value: Boolean): Self = StObject.set(x, "isVerified", value.asInstanceOf[js.Any])
    
    inline def setIsVerifiedUndefined: Self = StObject.set(x, "isVerified", js.undefined)
    
    inline def setManufacturer(value: NullableOption[String]): Self = StObject.set(x, "manufacturer", value.asInstanceOf[js.Any])
    
    inline def setManufacturerNull: Self = StObject.set(x, "manufacturer", null)
    
    inline def setManufacturerUndefined: Self = StObject.set(x, "manufacturer", js.undefined)
    
    inline def setModel(value: NullableOption[String]): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setModelNull: Self = StObject.set(x, "model", null)
    
    inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    inline def setPasswordNotificationWindowInDays(value: NullableOption[Double]): Self = StObject.set(x, "passwordNotificationWindowInDays", value.asInstanceOf[js.Any])
    
    inline def setPasswordNotificationWindowInDaysNull: Self = StObject.set(x, "passwordNotificationWindowInDays", null)
    
    inline def setPasswordNotificationWindowInDaysUndefined: Self = StObject.set(x, "passwordNotificationWindowInDays", js.undefined)
    
    inline def setPasswordValidityPeriodInDays(value: NullableOption[Double]): Self = StObject.set(x, "passwordValidityPeriodInDays", value.asInstanceOf[js.Any])
    
    inline def setPasswordValidityPeriodInDaysNull: Self = StObject.set(x, "passwordValidityPeriodInDays", null)
    
    inline def setPasswordValidityPeriodInDaysUndefined: Self = StObject.set(x, "passwordValidityPeriodInDays", js.undefined)
    
    inline def setServiceConfigurationRecords(value: NullableOption[js.Array[DomainDnsRecord]]): Self = StObject.set(x, "serviceConfigurationRecords", value.asInstanceOf[js.Any])
    
    inline def setServiceConfigurationRecordsNull: Self = StObject.set(x, "serviceConfigurationRecords", null)
    
    inline def setServiceConfigurationRecordsUndefined: Self = StObject.set(x, "serviceConfigurationRecords", js.undefined)
    
    inline def setServiceConfigurationRecordsVarargs(value: DomainDnsRecord*): Self = StObject.set(x, "serviceConfigurationRecords", js.Array(value*))
    
    inline def setState(value: NullableOption[DomainState]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setSupportedServices(value: js.Array[String]): Self = StObject.set(x, "supportedServices", value.asInstanceOf[js.Any])
    
    inline def setSupportedServicesUndefined: Self = StObject.set(x, "supportedServices", js.undefined)
    
    inline def setSupportedServicesVarargs(value: String*): Self = StObject.set(x, "supportedServices", js.Array(value*))
    
    inline def setVerificationDnsRecords(value: NullableOption[js.Array[DomainDnsRecord]]): Self = StObject.set(x, "verificationDnsRecords", value.asInstanceOf[js.Any])
    
    inline def setVerificationDnsRecordsNull: Self = StObject.set(x, "verificationDnsRecords", null)
    
    inline def setVerificationDnsRecordsUndefined: Self = StObject.set(x, "verificationDnsRecords", js.undefined)
    
    inline def setVerificationDnsRecordsVarargs(value: DomainDnsRecord*): Self = StObject.set(x, "verificationDnsRecords", js.Array(value*))
  }
}
