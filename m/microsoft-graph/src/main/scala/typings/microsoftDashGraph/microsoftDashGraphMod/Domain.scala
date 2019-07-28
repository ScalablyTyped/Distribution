package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Domain extends Entity {
  /**
    * Indicates the configured authentication type for the domain. The value is either Managed or Federated. Managed
    * indicates a cloud managed domain where Azure AD performs user authentication.Federated indicates authentication is
    * federated with an identity provider such as the tenant's on-premises Active Directory via Active Directory Federation
    * Services. Not nullable
    */
  var authenticationType: js.UndefOr[String] = js.undefined
  /**
    * This property is always null except when the verify action is used. When the verify action is used, a domain entity is
    * returned in the response. The availabilityStatus property of the domain entity in the response is either
    * AvailableImmediately or EmailVerifiedDomainTakeoverScheduled.
    */
  var availabilityStatus: js.UndefOr[String] = js.undefined
  // Read-only, Nullable
  var domainNameReferences: js.UndefOr[js.Array[DirectoryObject]] = js.undefined
  /**
    * The value of the property is false if the DNS record management of the domain has been delegated to Office 365.
    * Otherwise, the value is true. Not nullable
    */
  var isAdminManaged: js.UndefOr[Boolean] = js.undefined
  /**
    * True if this is the default domain that is used for user creation. There is only one default domain per company. Not
    * nullable
    */
  var isDefault: js.UndefOr[Boolean] = js.undefined
  /**
    * True if this is the initial domain created by Microsoft Online Services (companyname.onmicrosoft.com). There is only
    * one initial domain per company. Not nullable
    */
  var isInitial: js.UndefOr[Boolean] = js.undefined
  // True if the domain is a verified root domain. Otherwise, false if the domain is a subdomain or unverified. Not nullable
  var isRoot: js.UndefOr[Boolean] = js.undefined
  // True if the domain has completed domain ownership verification. Not nullable
  var isVerified: js.UndefOr[Boolean] = js.undefined
  /**
    * Specifies the number of days before a user receives notification that their password will expire. If the property is
    * not set, a default value of 14 days will be used.
    */
  var passwordNotificationWindowInDays: js.UndefOr[Double] = js.undefined
  /**
    * Specifies the length of time that a password is valid before it must be changed. If the property is not set, a default
    * value of 90 days will be used.
    */
  var passwordValidityPeriodInDays: js.UndefOr[Double] = js.undefined
  /**
    * DNS records the customer adds to the DNS zone file of the domain before the domain can be used by Microsoft Online
    * services.Read-only, Nullable
    */
  var serviceConfigurationRecords: js.UndefOr[js.Array[DomainDnsRecord]] = js.undefined
  // Status of asynchronous operations scheduled for the domain.
  var state: js.UndefOr[DomainState] = js.undefined
  /**
    * The capabilities assigned to the domain.Can include 0, 1 or more of following values: Email, Sharepoint,
    * EmailInternalRelayOnly, OfficeCommunicationsOnline, SharePointDefaultDomain, FullRedelegation, SharePointPublic,
    * OrgIdAuthentication, Yammer, Intune The values which you can add/remove using Graph API include: Email,
    * OfficeCommunicationsOnline, YammerNot nullable
    */
  var supportedServices: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * DNS records that the customer adds to the DNS zone file of the domain before the customer can complete domain ownership
    * verification with Azure AD.Read-only, Nullable
    */
  var verificationDnsRecords: js.UndefOr[js.Array[DomainDnsRecord]] = js.undefined
}

object Domain {
  @scala.inline
  def apply(
    authenticationType: String = null,
    availabilityStatus: String = null,
    domainNameReferences: js.Array[DirectoryObject] = null,
    id: String = null,
    isAdminManaged: js.UndefOr[Boolean] = js.undefined,
    isDefault: js.UndefOr[Boolean] = js.undefined,
    isInitial: js.UndefOr[Boolean] = js.undefined,
    isRoot: js.UndefOr[Boolean] = js.undefined,
    isVerified: js.UndefOr[Boolean] = js.undefined,
    passwordNotificationWindowInDays: Int | Double = null,
    passwordValidityPeriodInDays: Int | Double = null,
    serviceConfigurationRecords: js.Array[DomainDnsRecord] = null,
    state: DomainState = null,
    supportedServices: js.Array[String] = null,
    verificationDnsRecords: js.Array[DomainDnsRecord] = null
  ): Domain = {
    val __obj = js.Dynamic.literal()
    if (authenticationType != null) __obj.updateDynamic("authenticationType")(authenticationType)
    if (availabilityStatus != null) __obj.updateDynamic("availabilityStatus")(availabilityStatus)
    if (domainNameReferences != null) __obj.updateDynamic("domainNameReferences")(domainNameReferences)
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(isAdminManaged)) __obj.updateDynamic("isAdminManaged")(isAdminManaged)
    if (!js.isUndefined(isDefault)) __obj.updateDynamic("isDefault")(isDefault)
    if (!js.isUndefined(isInitial)) __obj.updateDynamic("isInitial")(isInitial)
    if (!js.isUndefined(isRoot)) __obj.updateDynamic("isRoot")(isRoot)
    if (!js.isUndefined(isVerified)) __obj.updateDynamic("isVerified")(isVerified)
    if (passwordNotificationWindowInDays != null) __obj.updateDynamic("passwordNotificationWindowInDays")(passwordNotificationWindowInDays.asInstanceOf[js.Any])
    if (passwordValidityPeriodInDays != null) __obj.updateDynamic("passwordValidityPeriodInDays")(passwordValidityPeriodInDays.asInstanceOf[js.Any])
    if (serviceConfigurationRecords != null) __obj.updateDynamic("serviceConfigurationRecords")(serviceConfigurationRecords)
    if (state != null) __obj.updateDynamic("state")(state)
    if (supportedServices != null) __obj.updateDynamic("supportedServices")(supportedServices)
    if (verificationDnsRecords != null) __obj.updateDynamic("verificationDnsRecords")(verificationDnsRecords)
    __obj.asInstanceOf[Domain]
  }
}

