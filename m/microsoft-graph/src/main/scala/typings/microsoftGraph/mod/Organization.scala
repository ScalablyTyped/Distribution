package typings.microsoftGraph.mod

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
  implicit class OrganizationOps[Self <: Organization] (val x: Self) extends AnyVal {
    
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
    def setAssignedPlansVarargs(value: AssignedPlan*): Self = this.set("assignedPlans", js.Array(value :_*))
    
    @scala.inline
    def setAssignedPlans(value: js.Array[AssignedPlan]): Self = this.set("assignedPlans", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssignedPlans: Self = this.set("assignedPlans", js.undefined)
    
    @scala.inline
    def setBusinessPhonesVarargs(value: String*): Self = this.set("businessPhones", js.Array(value :_*))
    
    @scala.inline
    def setBusinessPhones(value: js.Array[String]): Self = this.set("businessPhones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBusinessPhones: Self = this.set("businessPhones", js.undefined)
    
    @scala.inline
    def setCertificateBasedAuthConfigurationVarargs(value: CertificateBasedAuthConfiguration*): Self = this.set("certificateBasedAuthConfiguration", js.Array(value :_*))
    
    @scala.inline
    def setCertificateBasedAuthConfiguration(value: NullableOption[js.Array[CertificateBasedAuthConfiguration]]): Self = this.set("certificateBasedAuthConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCertificateBasedAuthConfiguration: Self = this.set("certificateBasedAuthConfiguration", js.undefined)
    
    @scala.inline
    def setCertificateBasedAuthConfigurationNull: Self = this.set("certificateBasedAuthConfiguration", null)
    
    @scala.inline
    def setCity(value: NullableOption[String]): Self = this.set("city", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCity: Self = this.set("city", js.undefined)
    
    @scala.inline
    def setCityNull: Self = this.set("city", null)
    
    @scala.inline
    def setCountry(value: NullableOption[String]): Self = this.set("country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCountry: Self = this.set("country", js.undefined)
    
    @scala.inline
    def setCountryNull: Self = this.set("country", null)
    
    @scala.inline
    def setCountryLetterCode(value: NullableOption[String]): Self = this.set("countryLetterCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCountryLetterCode: Self = this.set("countryLetterCode", js.undefined)
    
    @scala.inline
    def setCountryLetterCodeNull: Self = this.set("countryLetterCode", null)
    
    @scala.inline
    def setCreatedDateTime(value: NullableOption[String]): Self = this.set("createdDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedDateTime: Self = this.set("createdDateTime", js.undefined)
    
    @scala.inline
    def setCreatedDateTimeNull: Self = this.set("createdDateTime", null)
    
    @scala.inline
    def setDisplayName(value: NullableOption[String]): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setDisplayNameNull: Self = this.set("displayName", null)
    
    @scala.inline
    def setExtensionsVarargs(value: Extension*): Self = this.set("extensions", js.Array(value :_*))
    
    @scala.inline
    def setExtensions(value: NullableOption[js.Array[Extension]]): Self = this.set("extensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtensions: Self = this.set("extensions", js.undefined)
    
    @scala.inline
    def setExtensionsNull: Self = this.set("extensions", null)
    
    @scala.inline
    def setMarketingNotificationEmailsVarargs(value: String*): Self = this.set("marketingNotificationEmails", js.Array(value :_*))
    
    @scala.inline
    def setMarketingNotificationEmails(value: js.Array[String]): Self = this.set("marketingNotificationEmails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarketingNotificationEmails: Self = this.set("marketingNotificationEmails", js.undefined)
    
    @scala.inline
    def setMobileDeviceManagementAuthority(value: MdmAuthority): Self = this.set("mobileDeviceManagementAuthority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMobileDeviceManagementAuthority: Self = this.set("mobileDeviceManagementAuthority", js.undefined)
    
    @scala.inline
    def setOnPremisesLastSyncDateTime(value: NullableOption[String]): Self = this.set("onPremisesLastSyncDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnPremisesLastSyncDateTime: Self = this.set("onPremisesLastSyncDateTime", js.undefined)
    
    @scala.inline
    def setOnPremisesLastSyncDateTimeNull: Self = this.set("onPremisesLastSyncDateTime", null)
    
    @scala.inline
    def setOnPremisesSyncEnabled(value: NullableOption[Boolean]): Self = this.set("onPremisesSyncEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnPremisesSyncEnabled: Self = this.set("onPremisesSyncEnabled", js.undefined)
    
    @scala.inline
    def setOnPremisesSyncEnabledNull: Self = this.set("onPremisesSyncEnabled", null)
    
    @scala.inline
    def setPostalCode(value: NullableOption[String]): Self = this.set("postalCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePostalCode: Self = this.set("postalCode", js.undefined)
    
    @scala.inline
    def setPostalCodeNull: Self = this.set("postalCode", null)
    
    @scala.inline
    def setPreferredLanguage(value: NullableOption[String]): Self = this.set("preferredLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreferredLanguage: Self = this.set("preferredLanguage", js.undefined)
    
    @scala.inline
    def setPreferredLanguageNull: Self = this.set("preferredLanguage", null)
    
    @scala.inline
    def setPrivacyProfile(value: NullableOption[PrivacyProfile]): Self = this.set("privacyProfile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrivacyProfile: Self = this.set("privacyProfile", js.undefined)
    
    @scala.inline
    def setPrivacyProfileNull: Self = this.set("privacyProfile", null)
    
    @scala.inline
    def setProvisionedPlansVarargs(value: ProvisionedPlan*): Self = this.set("provisionedPlans", js.Array(value :_*))
    
    @scala.inline
    def setProvisionedPlans(value: js.Array[ProvisionedPlan]): Self = this.set("provisionedPlans", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProvisionedPlans: Self = this.set("provisionedPlans", js.undefined)
    
    @scala.inline
    def setSecurityComplianceNotificationMailsVarargs(value: String*): Self = this.set("securityComplianceNotificationMails", js.Array(value :_*))
    
    @scala.inline
    def setSecurityComplianceNotificationMails(value: js.Array[String]): Self = this.set("securityComplianceNotificationMails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecurityComplianceNotificationMails: Self = this.set("securityComplianceNotificationMails", js.undefined)
    
    @scala.inline
    def setSecurityComplianceNotificationPhonesVarargs(value: String*): Self = this.set("securityComplianceNotificationPhones", js.Array(value :_*))
    
    @scala.inline
    def setSecurityComplianceNotificationPhones(value: js.Array[String]): Self = this.set("securityComplianceNotificationPhones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecurityComplianceNotificationPhones: Self = this.set("securityComplianceNotificationPhones", js.undefined)
    
    @scala.inline
    def setState(value: NullableOption[String]): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    
    @scala.inline
    def setStateNull: Self = this.set("state", null)
    
    @scala.inline
    def setStreet(value: NullableOption[String]): Self = this.set("street", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStreet: Self = this.set("street", js.undefined)
    
    @scala.inline
    def setStreetNull: Self = this.set("street", null)
    
    @scala.inline
    def setTechnicalNotificationMailsVarargs(value: String*): Self = this.set("technicalNotificationMails", js.Array(value :_*))
    
    @scala.inline
    def setTechnicalNotificationMails(value: js.Array[String]): Self = this.set("technicalNotificationMails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTechnicalNotificationMails: Self = this.set("technicalNotificationMails", js.undefined)
    
    @scala.inline
    def setTenantType(value: NullableOption[String]): Self = this.set("tenantType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTenantType: Self = this.set("tenantType", js.undefined)
    
    @scala.inline
    def setTenantTypeNull: Self = this.set("tenantType", null)
    
    @scala.inline
    def setVerifiedDomainsVarargs(value: VerifiedDomain*): Self = this.set("verifiedDomains", js.Array(value :_*))
    
    @scala.inline
    def setVerifiedDomains(value: js.Array[VerifiedDomain]): Self = this.set("verifiedDomains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerifiedDomains: Self = this.set("verifiedDomains", js.undefined)
  }
}
