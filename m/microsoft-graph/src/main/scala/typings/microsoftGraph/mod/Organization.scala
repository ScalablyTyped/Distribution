package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Organization
  extends StObject
     with DirectoryObject {
  
  // The collection of service plans associated with the tenant. Not nullable.
  var assignedPlans: js.UndefOr[js.Array[AssignedPlan]] = js.undefined
  
  /**
    * Telephone number for the organization. NOTE: Although this is a string collection, only one number can be set for this
    * property.
    */
  var businessPhones: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Navigation property to manage certificate-based authentication configuration. Only a single instance of
    * certificateBasedAuthConfiguration can be created in the collection.
    */
  var certificateBasedAuthConfiguration: js.UndefOr[NullableOption[js.Array[CertificateBasedAuthConfiguration]]] = js.undefined
  
  // City name of the address for the organization.
  var city: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Country/region name of the address for the organization.
  var country: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Country/region abbreviation for the organization.
  var countryLetterCode: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Timestamp of when the organization was created. The value cannot be modified and is automatically populated when the
    * organization is created. The Timestamp type represents date and time information using ISO 8601 format and is always in
    * UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'. Read-only.
    */
  var createdDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The display name for the tenant.
  var displayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The collection of open extensions defined for the organization. Read-only. Nullable.
  var extensions: js.UndefOr[NullableOption[js.Array[Extension]]] = js.undefined
  
  // Not nullable.
  var marketingNotificationEmails: js.UndefOr[js.Array[String]] = js.undefined
  
  // Mobile device management authority. Possible values are: unknown, intune, sccm, office365.
  var mobileDeviceManagementAuthority: js.UndefOr[MdmAuthority] = js.undefined
  
  /**
    * The time and date at which the tenant was last synced with the on-premise directory. The Timestamp type represents date
    * and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would
    * look like this: '2014-01-01T00:00:00Z'. Read-only.
    */
  var onPremisesLastSyncDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * true if this object is synced from an on-premises directory; false if this object was originally synced from an
    * on-premises directory but is no longer synced; null if this object has never been synced from an on-premises directory
    * (default).
    */
  var onPremisesSyncEnabled: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // Postal code of the address for the organization.
  var postalCode: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The preferred language for the organization. Should follow ISO 639-1 Code; for example 'en'.
  var preferredLanguage: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The privacy profile of an organization.
  var privacyProfile: js.UndefOr[NullableOption[PrivacyProfile]] = js.undefined
  
  // Not nullable.
  var provisionedPlans: js.UndefOr[js.Array[ProvisionedPlan]] = js.undefined
  
  var securityComplianceNotificationMails: js.UndefOr[js.Array[String]] = js.undefined
  
  var securityComplianceNotificationPhones: js.UndefOr[js.Array[String]] = js.undefined
  
  // State name of the address for the organization.
  var state: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Street name of the address for organization.
  var street: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Not nullable.
  var technicalNotificationMails: js.UndefOr[js.Array[String]] = js.undefined
  
  var tenantType: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The collection of domains associated with this tenant. Not nullable.
  var verifiedDomains: js.UndefOr[js.Array[VerifiedDomain]] = js.undefined
}
object Organization {
  
  inline def apply(): Organization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Organization]
  }
  
  extension [Self <: Organization](x: Self) {
    
    inline def setAssignedPlans(value: js.Array[AssignedPlan]): Self = StObject.set(x, "assignedPlans", value.asInstanceOf[js.Any])
    
    inline def setAssignedPlansUndefined: Self = StObject.set(x, "assignedPlans", js.undefined)
    
    inline def setAssignedPlansVarargs(value: AssignedPlan*): Self = StObject.set(x, "assignedPlans", js.Array(value :_*))
    
    inline def setBusinessPhones(value: js.Array[String]): Self = StObject.set(x, "businessPhones", value.asInstanceOf[js.Any])
    
    inline def setBusinessPhonesUndefined: Self = StObject.set(x, "businessPhones", js.undefined)
    
    inline def setBusinessPhonesVarargs(value: String*): Self = StObject.set(x, "businessPhones", js.Array(value :_*))
    
    inline def setCertificateBasedAuthConfiguration(value: NullableOption[js.Array[CertificateBasedAuthConfiguration]]): Self = StObject.set(x, "certificateBasedAuthConfiguration", value.asInstanceOf[js.Any])
    
    inline def setCertificateBasedAuthConfigurationNull: Self = StObject.set(x, "certificateBasedAuthConfiguration", null)
    
    inline def setCertificateBasedAuthConfigurationUndefined: Self = StObject.set(x, "certificateBasedAuthConfiguration", js.undefined)
    
    inline def setCertificateBasedAuthConfigurationVarargs(value: CertificateBasedAuthConfiguration*): Self = StObject.set(x, "certificateBasedAuthConfiguration", js.Array(value :_*))
    
    inline def setCity(value: NullableOption[String]): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
    
    inline def setCityNull: Self = StObject.set(x, "city", null)
    
    inline def setCityUndefined: Self = StObject.set(x, "city", js.undefined)
    
    inline def setCountry(value: NullableOption[String]): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setCountryLetterCode(value: NullableOption[String]): Self = StObject.set(x, "countryLetterCode", value.asInstanceOf[js.Any])
    
    inline def setCountryLetterCodeNull: Self = StObject.set(x, "countryLetterCode", null)
    
    inline def setCountryLetterCodeUndefined: Self = StObject.set(x, "countryLetterCode", js.undefined)
    
    inline def setCountryNull: Self = StObject.set(x, "country", null)
    
    inline def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
    
    inline def setCreatedDateTime(value: NullableOption[String]): Self = StObject.set(x, "createdDateTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedDateTimeNull: Self = StObject.set(x, "createdDateTime", null)
    
    inline def setCreatedDateTimeUndefined: Self = StObject.set(x, "createdDateTime", js.undefined)
    
    inline def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setExtensions(value: NullableOption[js.Array[Extension]]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
    
    inline def setExtensionsNull: Self = StObject.set(x, "extensions", null)
    
    inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
    
    inline def setExtensionsVarargs(value: Extension*): Self = StObject.set(x, "extensions", js.Array(value :_*))
    
    inline def setMarketingNotificationEmails(value: js.Array[String]): Self = StObject.set(x, "marketingNotificationEmails", value.asInstanceOf[js.Any])
    
    inline def setMarketingNotificationEmailsUndefined: Self = StObject.set(x, "marketingNotificationEmails", js.undefined)
    
    inline def setMarketingNotificationEmailsVarargs(value: String*): Self = StObject.set(x, "marketingNotificationEmails", js.Array(value :_*))
    
    inline def setMobileDeviceManagementAuthority(value: MdmAuthority): Self = StObject.set(x, "mobileDeviceManagementAuthority", value.asInstanceOf[js.Any])
    
    inline def setMobileDeviceManagementAuthorityUndefined: Self = StObject.set(x, "mobileDeviceManagementAuthority", js.undefined)
    
    inline def setOnPremisesLastSyncDateTime(value: NullableOption[String]): Self = StObject.set(x, "onPremisesLastSyncDateTime", value.asInstanceOf[js.Any])
    
    inline def setOnPremisesLastSyncDateTimeNull: Self = StObject.set(x, "onPremisesLastSyncDateTime", null)
    
    inline def setOnPremisesLastSyncDateTimeUndefined: Self = StObject.set(x, "onPremisesLastSyncDateTime", js.undefined)
    
    inline def setOnPremisesSyncEnabled(value: NullableOption[Boolean]): Self = StObject.set(x, "onPremisesSyncEnabled", value.asInstanceOf[js.Any])
    
    inline def setOnPremisesSyncEnabledNull: Self = StObject.set(x, "onPremisesSyncEnabled", null)
    
    inline def setOnPremisesSyncEnabledUndefined: Self = StObject.set(x, "onPremisesSyncEnabled", js.undefined)
    
    inline def setPostalCode(value: NullableOption[String]): Self = StObject.set(x, "postalCode", value.asInstanceOf[js.Any])
    
    inline def setPostalCodeNull: Self = StObject.set(x, "postalCode", null)
    
    inline def setPostalCodeUndefined: Self = StObject.set(x, "postalCode", js.undefined)
    
    inline def setPreferredLanguage(value: NullableOption[String]): Self = StObject.set(x, "preferredLanguage", value.asInstanceOf[js.Any])
    
    inline def setPreferredLanguageNull: Self = StObject.set(x, "preferredLanguage", null)
    
    inline def setPreferredLanguageUndefined: Self = StObject.set(x, "preferredLanguage", js.undefined)
    
    inline def setPrivacyProfile(value: NullableOption[PrivacyProfile]): Self = StObject.set(x, "privacyProfile", value.asInstanceOf[js.Any])
    
    inline def setPrivacyProfileNull: Self = StObject.set(x, "privacyProfile", null)
    
    inline def setPrivacyProfileUndefined: Self = StObject.set(x, "privacyProfile", js.undefined)
    
    inline def setProvisionedPlans(value: js.Array[ProvisionedPlan]): Self = StObject.set(x, "provisionedPlans", value.asInstanceOf[js.Any])
    
    inline def setProvisionedPlansUndefined: Self = StObject.set(x, "provisionedPlans", js.undefined)
    
    inline def setProvisionedPlansVarargs(value: ProvisionedPlan*): Self = StObject.set(x, "provisionedPlans", js.Array(value :_*))
    
    inline def setSecurityComplianceNotificationMails(value: js.Array[String]): Self = StObject.set(x, "securityComplianceNotificationMails", value.asInstanceOf[js.Any])
    
    inline def setSecurityComplianceNotificationMailsUndefined: Self = StObject.set(x, "securityComplianceNotificationMails", js.undefined)
    
    inline def setSecurityComplianceNotificationMailsVarargs(value: String*): Self = StObject.set(x, "securityComplianceNotificationMails", js.Array(value :_*))
    
    inline def setSecurityComplianceNotificationPhones(value: js.Array[String]): Self = StObject.set(x, "securityComplianceNotificationPhones", value.asInstanceOf[js.Any])
    
    inline def setSecurityComplianceNotificationPhonesUndefined: Self = StObject.set(x, "securityComplianceNotificationPhones", js.undefined)
    
    inline def setSecurityComplianceNotificationPhonesVarargs(value: String*): Self = StObject.set(x, "securityComplianceNotificationPhones", js.Array(value :_*))
    
    inline def setState(value: NullableOption[String]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setStreet(value: NullableOption[String]): Self = StObject.set(x, "street", value.asInstanceOf[js.Any])
    
    inline def setStreetNull: Self = StObject.set(x, "street", null)
    
    inline def setStreetUndefined: Self = StObject.set(x, "street", js.undefined)
    
    inline def setTechnicalNotificationMails(value: js.Array[String]): Self = StObject.set(x, "technicalNotificationMails", value.asInstanceOf[js.Any])
    
    inline def setTechnicalNotificationMailsUndefined: Self = StObject.set(x, "technicalNotificationMails", js.undefined)
    
    inline def setTechnicalNotificationMailsVarargs(value: String*): Self = StObject.set(x, "technicalNotificationMails", js.Array(value :_*))
    
    inline def setTenantType(value: NullableOption[String]): Self = StObject.set(x, "tenantType", value.asInstanceOf[js.Any])
    
    inline def setTenantTypeNull: Self = StObject.set(x, "tenantType", null)
    
    inline def setTenantTypeUndefined: Self = StObject.set(x, "tenantType", js.undefined)
    
    inline def setVerifiedDomains(value: js.Array[VerifiedDomain]): Self = StObject.set(x, "verifiedDomains", value.asInstanceOf[js.Any])
    
    inline def setVerifiedDomainsUndefined: Self = StObject.set(x, "verifiedDomains", js.undefined)
    
    inline def setVerifiedDomainsVarargs(value: VerifiedDomain*): Self = StObject.set(x, "verifiedDomains", js.Array(value :_*))
  }
}
