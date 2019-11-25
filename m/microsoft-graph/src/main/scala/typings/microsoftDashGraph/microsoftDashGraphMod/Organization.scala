package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Organization extends DirectoryObject {
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
  var certificateBasedAuthConfiguration: js.UndefOr[js.Array[CertificateBasedAuthConfiguration]] = js.undefined
  // City name of the address for the organization.
  var city: js.UndefOr[String] = js.undefined
  // Country/region name of the address for the organization.
  var country: js.UndefOr[String] = js.undefined
  // Country/region abbreviation for the organization.
  var countryLetterCode: js.UndefOr[String] = js.undefined
  /**
    * Timestamp of when the organization was created. The value cannot be modified and is automatically populated when the
    * organization is created. The Timestamp type represents date and time information using ISO 8601 format and is always in
    * UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'. Read-only.
    */
  var createdDateTime: js.UndefOr[String] = js.undefined
  // The display name for the tenant.
  var displayName: js.UndefOr[String] = js.undefined
  // The collection of open extensions defined for the organization. Read-only. Nullable.
  var extensions: js.UndefOr[js.Array[Extension]] = js.undefined
  // Not nullable.
  var marketingNotificationEmails: js.UndefOr[js.Array[String]] = js.undefined
  // Mobile device management authority. Possible values are: unknown, intune, sccm, office365.
  var mobileDeviceManagementAuthority: js.UndefOr[MdmAuthority] = js.undefined
  /**
    * The time and date at which the tenant was last synced with the on-premise directory. The Timestamp type represents date
    * and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would
    * look like this: '2014-01-01T00:00:00Z'. Read-only.
    */
  var onPremisesLastSyncDateTime: js.UndefOr[String] = js.undefined
  /**
    * true if this object is synced from an on-premises directory; false if this object was originally synced from an
    * on-premises directory but is no longer synced; null if this object has never been synced from an on-premises directory
    * (default).
    */
  var onPremisesSyncEnabled: js.UndefOr[Boolean] = js.undefined
  // Postal code of the address for the organization.
  var postalCode: js.UndefOr[String] = js.undefined
  // The preferred language for the organization. Should follow ISO 639-1 Code; for example 'en'.
  var preferredLanguage: js.UndefOr[String] = js.undefined
  // The privacy profile of an organization.
  var privacyProfile: js.UndefOr[PrivacyProfile] = js.undefined
  // Not nullable.
  var provisionedPlans: js.UndefOr[js.Array[ProvisionedPlan]] = js.undefined
  var securityComplianceNotificationMails: js.UndefOr[js.Array[String]] = js.undefined
  var securityComplianceNotificationPhones: js.UndefOr[js.Array[String]] = js.undefined
  // State name of the address for the organization.
  var state: js.UndefOr[String] = js.undefined
  // Street name of the address for organization.
  var street: js.UndefOr[String] = js.undefined
  // Not nullable.
  var technicalNotificationMails: js.UndefOr[js.Array[String]] = js.undefined
  // The collection of domains associated with this tenant. Not nullable.
  var verifiedDomains: js.UndefOr[js.Array[VerifiedDomain]] = js.undefined
}

object Organization {
  @scala.inline
  def apply(
    assignedPlans: js.Array[AssignedPlan] = null,
    businessPhones: js.Array[String] = null,
    certificateBasedAuthConfiguration: js.Array[CertificateBasedAuthConfiguration] = null,
    city: String = null,
    country: String = null,
    countryLetterCode: String = null,
    createdDateTime: String = null,
    deletedDateTime: String = null,
    displayName: String = null,
    extensions: js.Array[Extension] = null,
    id: String = null,
    marketingNotificationEmails: js.Array[String] = null,
    mobileDeviceManagementAuthority: MdmAuthority = null,
    onPremisesLastSyncDateTime: String = null,
    onPremisesSyncEnabled: js.UndefOr[Boolean] = js.undefined,
    postalCode: String = null,
    preferredLanguage: String = null,
    privacyProfile: PrivacyProfile = null,
    provisionedPlans: js.Array[ProvisionedPlan] = null,
    securityComplianceNotificationMails: js.Array[String] = null,
    securityComplianceNotificationPhones: js.Array[String] = null,
    state: String = null,
    street: String = null,
    technicalNotificationMails: js.Array[String] = null,
    verifiedDomains: js.Array[VerifiedDomain] = null
  ): Organization = {
    val __obj = js.Dynamic.literal()
    if (assignedPlans != null) __obj.updateDynamic("assignedPlans")(assignedPlans.asInstanceOf[js.Any])
    if (businessPhones != null) __obj.updateDynamic("businessPhones")(businessPhones.asInstanceOf[js.Any])
    if (certificateBasedAuthConfiguration != null) __obj.updateDynamic("certificateBasedAuthConfiguration")(certificateBasedAuthConfiguration.asInstanceOf[js.Any])
    if (city != null) __obj.updateDynamic("city")(city.asInstanceOf[js.Any])
    if (country != null) __obj.updateDynamic("country")(country.asInstanceOf[js.Any])
    if (countryLetterCode != null) __obj.updateDynamic("countryLetterCode")(countryLetterCode.asInstanceOf[js.Any])
    if (createdDateTime != null) __obj.updateDynamic("createdDateTime")(createdDateTime.asInstanceOf[js.Any])
    if (deletedDateTime != null) __obj.updateDynamic("deletedDateTime")(deletedDateTime.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (marketingNotificationEmails != null) __obj.updateDynamic("marketingNotificationEmails")(marketingNotificationEmails.asInstanceOf[js.Any])
    if (mobileDeviceManagementAuthority != null) __obj.updateDynamic("mobileDeviceManagementAuthority")(mobileDeviceManagementAuthority.asInstanceOf[js.Any])
    if (onPremisesLastSyncDateTime != null) __obj.updateDynamic("onPremisesLastSyncDateTime")(onPremisesLastSyncDateTime.asInstanceOf[js.Any])
    if (!js.isUndefined(onPremisesSyncEnabled)) __obj.updateDynamic("onPremisesSyncEnabled")(onPremisesSyncEnabled.asInstanceOf[js.Any])
    if (postalCode != null) __obj.updateDynamic("postalCode")(postalCode.asInstanceOf[js.Any])
    if (preferredLanguage != null) __obj.updateDynamic("preferredLanguage")(preferredLanguage.asInstanceOf[js.Any])
    if (privacyProfile != null) __obj.updateDynamic("privacyProfile")(privacyProfile.asInstanceOf[js.Any])
    if (provisionedPlans != null) __obj.updateDynamic("provisionedPlans")(provisionedPlans.asInstanceOf[js.Any])
    if (securityComplianceNotificationMails != null) __obj.updateDynamic("securityComplianceNotificationMails")(securityComplianceNotificationMails.asInstanceOf[js.Any])
    if (securityComplianceNotificationPhones != null) __obj.updateDynamic("securityComplianceNotificationPhones")(securityComplianceNotificationPhones.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (street != null) __obj.updateDynamic("street")(street.asInstanceOf[js.Any])
    if (technicalNotificationMails != null) __obj.updateDynamic("technicalNotificationMails")(technicalNotificationMails.asInstanceOf[js.Any])
    if (verifiedDomains != null) __obj.updateDynamic("verifiedDomains")(verifiedDomains.asInstanceOf[js.Any])
    __obj.asInstanceOf[Organization]
  }
}

