package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Organization extends DirectoryObject {
  
  // The collection of service plans associated with the tenant. Not nullable.
  var assignedPlans: js.UndefOr[js.Array[AssignedPlan]] = js.native
  
  /**
    * Telephone number for the organization. NOTE: Although this is a string collection, only one number can be set for this
    * property.
    */
  var businessPhones: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Navigation property to manage certificate-based authentication configuration. Only a single instance of
    * certificateBasedAuthConfiguration can be created in the collection.
    */
  var certificateBasedAuthConfiguration: js.UndefOr[NullableOption[js.Array[CertificateBasedAuthConfiguration]]] = js.native
  
  // City name of the address for the organization.
  var city: js.UndefOr[NullableOption[String]] = js.native
  
  // Country/region name of the address for the organization.
  var country: js.UndefOr[NullableOption[String]] = js.native
  
  // Country/region abbreviation for the organization.
  var countryLetterCode: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * Timestamp of when the organization was created. The value cannot be modified and is automatically populated when the
    * organization is created. The Timestamp type represents date and time information using ISO 8601 format and is always in
    * UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'. Read-only.
    */
  var createdDateTime: js.UndefOr[NullableOption[String]] = js.native
  
  // The display name for the tenant.
  var displayName: js.UndefOr[NullableOption[String]] = js.native
  
  // The collection of open extensions defined for the organization. Read-only. Nullable.
  var extensions: js.UndefOr[NullableOption[js.Array[Extension]]] = js.native
  
  // Not nullable.
  var marketingNotificationEmails: js.UndefOr[js.Array[String]] = js.native
  
  // Mobile device management authority. Possible values are: unknown, intune, sccm, office365.
  var mobileDeviceManagementAuthority: js.UndefOr[MdmAuthority] = js.native
  
  /**
    * The time and date at which the tenant was last synced with the on-premise directory. The Timestamp type represents date
    * and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would
    * look like this: '2014-01-01T00:00:00Z'. Read-only.
    */
  var onPremisesLastSyncDateTime: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * true if this object is synced from an on-premises directory; false if this object was originally synced from an
    * on-premises directory but is no longer synced; null if this object has never been synced from an on-premises directory
    * (default).
    */
  var onPremisesSyncEnabled: js.UndefOr[NullableOption[Boolean]] = js.native
  
  // Postal code of the address for the organization.
  var postalCode: js.UndefOr[NullableOption[String]] = js.native
  
  // The preferred language for the organization. Should follow ISO 639-1 Code; for example 'en'.
  var preferredLanguage: js.UndefOr[NullableOption[String]] = js.native
  
  // The privacy profile of an organization.
  var privacyProfile: js.UndefOr[NullableOption[PrivacyProfile]] = js.native
  
  // Not nullable.
  var provisionedPlans: js.UndefOr[js.Array[ProvisionedPlan]] = js.native
  
  var securityComplianceNotificationMails: js.UndefOr[js.Array[String]] = js.native
  
  var securityComplianceNotificationPhones: js.UndefOr[js.Array[String]] = js.native
  
  // State name of the address for the organization.
  var state: js.UndefOr[NullableOption[String]] = js.native
  
  // Street name of the address for organization.
  var street: js.UndefOr[NullableOption[String]] = js.native
  
  // Not nullable.
  var technicalNotificationMails: js.UndefOr[js.Array[String]] = js.native
  
  var tenantType: js.UndefOr[NullableOption[String]] = js.native
  
  // The collection of domains associated with this tenant. Not nullable.
  var verifiedDomains: js.UndefOr[js.Array[VerifiedDomain]] = js.native
}
object Organization {
  
  @scala.inline
  def apply(): Organization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Organization]
  }
  
  @scala.inline
  implicit class OrganizationMutableBuilder[Self <: Organization] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssignedPlans(value: js.Array[AssignedPlan]): Self = StObject.set(x, "assignedPlans", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssignedPlansUndefined: Self = StObject.set(x, "assignedPlans", js.undefined)
    
    @scala.inline
    def setAssignedPlansVarargs(value: AssignedPlan*): Self = StObject.set(x, "assignedPlans", js.Array(value :_*))
    
    @scala.inline
    def setBusinessPhones(value: js.Array[String]): Self = StObject.set(x, "businessPhones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBusinessPhonesUndefined: Self = StObject.set(x, "businessPhones", js.undefined)
    
    @scala.inline
    def setBusinessPhonesVarargs(value: String*): Self = StObject.set(x, "businessPhones", js.Array(value :_*))
    
    @scala.inline
    def setCertificateBasedAuthConfiguration(value: NullableOption[js.Array[CertificateBasedAuthConfiguration]]): Self = StObject.set(x, "certificateBasedAuthConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateBasedAuthConfigurationNull: Self = StObject.set(x, "certificateBasedAuthConfiguration", null)
    
    @scala.inline
    def setCertificateBasedAuthConfigurationUndefined: Self = StObject.set(x, "certificateBasedAuthConfiguration", js.undefined)
    
    @scala.inline
    def setCertificateBasedAuthConfigurationVarargs(value: CertificateBasedAuthConfiguration*): Self = StObject.set(x, "certificateBasedAuthConfiguration", js.Array(value :_*))
    
    @scala.inline
    def setCity(value: NullableOption[String]): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCityNull: Self = StObject.set(x, "city", null)
    
    @scala.inline
    def setCityUndefined: Self = StObject.set(x, "city", js.undefined)
    
    @scala.inline
    def setCountry(value: NullableOption[String]): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountryLetterCode(value: NullableOption[String]): Self = StObject.set(x, "countryLetterCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountryLetterCodeNull: Self = StObject.set(x, "countryLetterCode", null)
    
    @scala.inline
    def setCountryLetterCodeUndefined: Self = StObject.set(x, "countryLetterCode", js.undefined)
    
    @scala.inline
    def setCountryNull: Self = StObject.set(x, "country", null)
    
    @scala.inline
    def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
    
    @scala.inline
    def setCreatedDateTime(value: NullableOption[String]): Self = StObject.set(x, "createdDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedDateTimeNull: Self = StObject.set(x, "createdDateTime", null)
    
    @scala.inline
    def setCreatedDateTimeUndefined: Self = StObject.set(x, "createdDateTime", js.undefined)
    
    @scala.inline
    def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setExtensions(value: NullableOption[js.Array[Extension]]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtensionsNull: Self = StObject.set(x, "extensions", null)
    
    @scala.inline
    def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
    
    @scala.inline
    def setExtensionsVarargs(value: Extension*): Self = StObject.set(x, "extensions", js.Array(value :_*))
    
    @scala.inline
    def setMarketingNotificationEmails(value: js.Array[String]): Self = StObject.set(x, "marketingNotificationEmails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarketingNotificationEmailsUndefined: Self = StObject.set(x, "marketingNotificationEmails", js.undefined)
    
    @scala.inline
    def setMarketingNotificationEmailsVarargs(value: String*): Self = StObject.set(x, "marketingNotificationEmails", js.Array(value :_*))
    
    @scala.inline
    def setMobileDeviceManagementAuthority(value: MdmAuthority): Self = StObject.set(x, "mobileDeviceManagementAuthority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMobileDeviceManagementAuthorityUndefined: Self = StObject.set(x, "mobileDeviceManagementAuthority", js.undefined)
    
    @scala.inline
    def setOnPremisesLastSyncDateTime(value: NullableOption[String]): Self = StObject.set(x, "onPremisesLastSyncDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPremisesLastSyncDateTimeNull: Self = StObject.set(x, "onPremisesLastSyncDateTime", null)
    
    @scala.inline
    def setOnPremisesLastSyncDateTimeUndefined: Self = StObject.set(x, "onPremisesLastSyncDateTime", js.undefined)
    
    @scala.inline
    def setOnPremisesSyncEnabled(value: NullableOption[Boolean]): Self = StObject.set(x, "onPremisesSyncEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPremisesSyncEnabledNull: Self = StObject.set(x, "onPremisesSyncEnabled", null)
    
    @scala.inline
    def setOnPremisesSyncEnabledUndefined: Self = StObject.set(x, "onPremisesSyncEnabled", js.undefined)
    
    @scala.inline
    def setPostalCode(value: NullableOption[String]): Self = StObject.set(x, "postalCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostalCodeNull: Self = StObject.set(x, "postalCode", null)
    
    @scala.inline
    def setPostalCodeUndefined: Self = StObject.set(x, "postalCode", js.undefined)
    
    @scala.inline
    def setPreferredLanguage(value: NullableOption[String]): Self = StObject.set(x, "preferredLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreferredLanguageNull: Self = StObject.set(x, "preferredLanguage", null)
    
    @scala.inline
    def setPreferredLanguageUndefined: Self = StObject.set(x, "preferredLanguage", js.undefined)
    
    @scala.inline
    def setPrivacyProfile(value: NullableOption[PrivacyProfile]): Self = StObject.set(x, "privacyProfile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivacyProfileNull: Self = StObject.set(x, "privacyProfile", null)
    
    @scala.inline
    def setPrivacyProfileUndefined: Self = StObject.set(x, "privacyProfile", js.undefined)
    
    @scala.inline
    def setProvisionedPlans(value: js.Array[ProvisionedPlan]): Self = StObject.set(x, "provisionedPlans", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvisionedPlansUndefined: Self = StObject.set(x, "provisionedPlans", js.undefined)
    
    @scala.inline
    def setProvisionedPlansVarargs(value: ProvisionedPlan*): Self = StObject.set(x, "provisionedPlans", js.Array(value :_*))
    
    @scala.inline
    def setSecurityComplianceNotificationMails(value: js.Array[String]): Self = StObject.set(x, "securityComplianceNotificationMails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityComplianceNotificationMailsUndefined: Self = StObject.set(x, "securityComplianceNotificationMails", js.undefined)
    
    @scala.inline
    def setSecurityComplianceNotificationMailsVarargs(value: String*): Self = StObject.set(x, "securityComplianceNotificationMails", js.Array(value :_*))
    
    @scala.inline
    def setSecurityComplianceNotificationPhones(value: js.Array[String]): Self = StObject.set(x, "securityComplianceNotificationPhones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityComplianceNotificationPhonesUndefined: Self = StObject.set(x, "securityComplianceNotificationPhones", js.undefined)
    
    @scala.inline
    def setSecurityComplianceNotificationPhonesVarargs(value: String*): Self = StObject.set(x, "securityComplianceNotificationPhones", js.Array(value :_*))
    
    @scala.inline
    def setState(value: NullableOption[String]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateNull: Self = StObject.set(x, "state", null)
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    @scala.inline
    def setStreet(value: NullableOption[String]): Self = StObject.set(x, "street", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreetNull: Self = StObject.set(x, "street", null)
    
    @scala.inline
    def setStreetUndefined: Self = StObject.set(x, "street", js.undefined)
    
    @scala.inline
    def setTechnicalNotificationMails(value: js.Array[String]): Self = StObject.set(x, "technicalNotificationMails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTechnicalNotificationMailsUndefined: Self = StObject.set(x, "technicalNotificationMails", js.undefined)
    
    @scala.inline
    def setTechnicalNotificationMailsVarargs(value: String*): Self = StObject.set(x, "technicalNotificationMails", js.Array(value :_*))
    
    @scala.inline
    def setTenantType(value: NullableOption[String]): Self = StObject.set(x, "tenantType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTenantTypeNull: Self = StObject.set(x, "tenantType", null)
    
    @scala.inline
    def setTenantTypeUndefined: Self = StObject.set(x, "tenantType", js.undefined)
    
    @scala.inline
    def setVerifiedDomains(value: js.Array[VerifiedDomain]): Self = StObject.set(x, "verifiedDomains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerifiedDomainsUndefined: Self = StObject.set(x, "verifiedDomains", js.undefined)
    
    @scala.inline
    def setVerifiedDomainsVarargs(value: VerifiedDomain*): Self = StObject.set(x, "verifiedDomains", js.Array(value :_*))
  }
}
