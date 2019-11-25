package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait User extends DirectoryObject {
  // A freeform text entry field for the user to describe themselves.
  var aboutMe: js.UndefOr[String] = js.undefined
  // true if the account is enabled; otherwise, false. This property is required when a user is created. Supports $filter.
  var accountEnabled: js.UndefOr[Boolean] = js.undefined
  // The user's activities across devices. Read-only. Nullable.
  var activities: js.UndefOr[js.Array[UserActivity]] = js.undefined
  /**
    * Sets the age group of the user. Allowed values: null, minor, notAdult and adult. Refer to the legal age group property
    * definitions for further information.
    */
  var ageGroup: js.UndefOr[String] = js.undefined
  // The licenses that are assigned to the user. Not nullable.
  var assignedLicenses: js.UndefOr[js.Array[AssignedLicense]] = js.undefined
  // The plans that are assigned to the user. Read-only. Not nullable.
  var assignedPlans: js.UndefOr[js.Array[AssignedPlan]] = js.undefined
  /**
    * The birthday of the user. The Timestamp type represents date and time information using ISO 8601 format and is always
    * in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'
    */
  var birthday: js.UndefOr[String] = js.undefined
  /**
    * The telephone numbers for the user. NOTE: Although this is a string collection, only one number can be set for this
    * property.
    */
  var businessPhones: js.UndefOr[js.Array[String]] = js.undefined
  // The user's primary calendar. Read-only.
  var calendar: js.UndefOr[Calendar] = js.undefined
  // The user's calendar groups. Read-only. Nullable.
  var calendarGroups: js.UndefOr[js.Array[CalendarGroup]] = js.undefined
  // The calendar view for the calendar. Read-only. Nullable.
  var calendarView: js.UndefOr[js.Array[Event]] = js.undefined
  // The user's calendars. Read-only. Nullable.
  var calendars: js.UndefOr[js.Array[Calendar]] = js.undefined
  // The city in which the user is located. Supports $filter.
  var city: js.UndefOr[String] = js.undefined
  /**
    * The company name which the user is associated. This property can be useful for describing the company that an external
    * user comes from.
    */
  var companyName: js.UndefOr[String] = js.undefined
  /**
    * Sets whether consent has been obtained for minors. Allowed values: null, granted, denied and notRequired. Refer to the
    * legal age group property definitions for further information.
    */
  var consentProvidedForMinor: js.UndefOr[String] = js.undefined
  // The user's contacts folders. Read-only. Nullable.
  var contactFolders: js.UndefOr[js.Array[ContactFolder]] = js.undefined
  // The user's contacts. Read-only. Nullable.
  var contacts: js.UndefOr[js.Array[Contact]] = js.undefined
  // The country/region in which the user is located; for example, 'US' or 'UK'. Supports $filter.
  var country: js.UndefOr[String] = js.undefined
  // Directory objects that were created by the user. Read-only. Nullable.
  var createdObjects: js.UndefOr[js.Array[DirectoryObject]] = js.undefined
  // The name for the department in which the user works. Supports $filter.
  var department: js.UndefOr[String] = js.undefined
  // The limit on the maximum number of devices that the user is permitted to enroll. Allowed values are 5 or 1000.
  var deviceEnrollmentLimit: js.UndefOr[Double] = js.undefined
  // The list of troubleshooting events for this user.
  var deviceManagementTroubleshootingEvents: js.UndefOr[js.Array[DeviceManagementTroubleshootingEvent]] = js.undefined
  /**
    * The users and contacts that report to the user. (The users and contacts that have their manager property set to this
    * user.) Read-only. Nullable.
    */
  var directReports: js.UndefOr[js.Array[DirectoryObject]] = js.undefined
  /**
    * The name displayed in the address book for the user. This is usually the combination of the user's first name, middle
    * initial and last name. This property is required when a user is created and it cannot be cleared during updates.
    * Supports $filter and $orderby.
    */
  var displayName: js.UndefOr[String] = js.undefined
  // The user's OneDrive. Read-only.
  var drive: js.UndefOr[Drive] = js.undefined
  // A collection of drives available for this user. Read-only.
  var drives: js.UndefOr[js.Array[Drive]] = js.undefined
  // The employee identifier assigned to the user by the organization. Supports $filter.
  var employeeId: js.UndefOr[String] = js.undefined
  // The user's events. Default is to show Events under the Default Calendar. Read-only. Nullable.
  var events: js.UndefOr[js.Array[Event]] = js.undefined
  // The collection of open extensions defined for the user. Read-only. Nullable.
  var extensions: js.UndefOr[js.Array[Extension]] = js.undefined
  // The fax number of the user.
  var faxNumber: js.UndefOr[String] = js.undefined
  // The given name (first name) of the user. Supports $filter.
  var givenName: js.UndefOr[String] = js.undefined
  /**
    * The hire date of the user. The Timestamp type represents date and time information using ISO 8601 format and is always
    * in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'
    */
  var hireDate: js.UndefOr[String] = js.undefined
  // The instant message voice over IP (VOIP) session initiation protocol (SIP) addresses for the user. Read-only.
  var imAddresses: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Relevance classification of the user's messages based on explicit designations which override inferred relevance or
    * importance.
    */
  var inferenceClassification: js.UndefOr[InferenceClassification] = js.undefined
  var insights: js.UndefOr[OfficeGraphInsights] = js.undefined
  // A list for the user to describe their interests.
  var interests: js.UndefOr[js.Array[String]] = js.undefined
  // true if the user is a resource account; otherwise, false. Null value should be considered false.
  var isResourceAccount: js.UndefOr[Boolean] = js.undefined
  // The user’s job title. Supports $filter.
  var jobTitle: js.UndefOr[String] = js.undefined
  var joinedTeams: js.UndefOr[js.Array[Group]] = js.undefined
  /**
    * Used by enterprise applications to determine the legal age group of the user. This property is read-only and calculated
    * based on ageGroup and consentProvidedForMinor properties. Allowed values: null, minorWithOutParentalConsent,
    * minorWithParentalConsent, minorNoParentalConsentRequired, notAdult and adult. Refer to the legal age group property
    * definitions for further information.)
    */
  var legalAgeGroupClassification: js.UndefOr[String] = js.undefined
  // State of license assignments for this user. Read-only.
  var licenseAssignmentStates: js.UndefOr[js.Array[LicenseAssignmentState]] = js.undefined
  // A collection of this user's license details. Read-only.
  var licenseDetails: js.UndefOr[js.Array[LicenseDetails]] = js.undefined
  // The SMTP address for the user, for example, 'jeff@contoso.onmicrosoft.com'. Read-Only. Supports $filter.
  var mail: js.UndefOr[String] = js.undefined
  // The user's mail folders. Read-only. Nullable.
  var mailFolders: js.UndefOr[js.Array[MailFolder]] = js.undefined
  // The mail alias for the user. This property must be specified when a user is created. Supports $filter.
  var mailNickname: js.UndefOr[String] = js.undefined
  /**
    * Settings for the primary mailbox of the signed-in user. You can get or update settings for sending automatic replies to
    * incoming messages, locale and time zone.
    */
  var mailboxSettings: js.UndefOr[MailboxSettings] = js.undefined
  // Zero or more managed app registrations that belong to the user.
  var managedAppRegistrations: js.UndefOr[js.Array[ManagedAppRegistration]] = js.undefined
  // The managed devices associated with the user.
  var managedDevices: js.UndefOr[js.Array[ManagedDevice]] = js.undefined
  // The user or contact that is this user’s manager. Read-only. (HTTP Methods: GET, PUT, DELETE.)
  var manager: js.UndefOr[DirectoryObject] = js.undefined
  // The groups and directory roles that the user is a member of. Read-only. Nullable.
  var memberOf: js.UndefOr[js.Array[DirectoryObject]] = js.undefined
  // The messages in a mailbox or folder. Read-only. Nullable.
  var messages: js.UndefOr[js.Array[Message]] = js.undefined
  // The primary cellular telephone number for the user.
  var mobilePhone: js.UndefOr[String] = js.undefined
  // The URL for the user's personal site.
  var mySite: js.UndefOr[String] = js.undefined
  // The office location in the user's place of business.
  var officeLocation: js.UndefOr[String] = js.undefined
  /**
    * Contains the on-premises Active Directory distinguished name or DN. The property is only populated for customers who
    * are synchronizing their on-premises directory to Azure Active Directory via Azure AD Connect. Read-only.
    */
  var onPremisesDistinguishedName: js.UndefOr[String] = js.undefined
  /**
    * Contains the on-premises domainFQDN, also called dnsDomainName synchronized from the on-premises directory. The
    * property is only populated for customers who are synchronizing their on-premises directory to Azure Active Directory
    * via Azure AD Connect. Read-only.
    */
  var onPremisesDomainName: js.UndefOr[String] = js.undefined
  /**
    * Contains extensionAttributes 1-15 for the user. Note that the individual extension attributes are neither selectable
    * nor filterable. For an onPremisesSyncEnabled user, this set of properties is mastered on-premises and is read-only. For
    * a cloud-only user (where onPremisesSyncEnabled is false), these properties may be set during creation or update.
    */
  var onPremisesExtensionAttributes: js.UndefOr[OnPremisesExtensionAttributes] = js.undefined
  /**
    * This property is used to associate an on-premises Active Directory user account to their Azure AD user object. This
    * property must be specified when creating a new user account in the Graph if you are using a federated domain for the
    * user’s userPrincipalName (UPN) property. Important: The $ and _ characters cannot be used when specifying this
    * property. Supports $filter.
    */
  var onPremisesImmutableId: js.UndefOr[String] = js.undefined
  /**
    * Indicates the last time at which the object was synced with the on-premises directory; for example:
    * '2013-02-16T03:04:54Z'. The Timestamp type represents date and time information using ISO 8601 format and is always in
    * UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'. Read-only.
    */
  var onPremisesLastSyncDateTime: js.UndefOr[String] = js.undefined
  // Errors when using Microsoft synchronization product during provisioning.
  var onPremisesProvisioningErrors: js.UndefOr[js.Array[OnPremisesProvisioningError]] = js.undefined
  /**
    * Contains the on-premises samAccountName synchronized from the on-premises directory. The property is only populated for
    * customers who are synchronizing their on-premises directory to Azure Active Directory via Azure AD Connect. Read-only.
    */
  var onPremisesSamAccountName: js.UndefOr[String] = js.undefined
  /**
    * Contains the on-premises security identifier (SID) for the user that was synchronized from on-premises to the cloud.
    * Read-only.
    */
  var onPremisesSecurityIdentifier: js.UndefOr[String] = js.undefined
  /**
    * true if this object is synced from an on-premises directory; false if this object was originally synced from an
    * on-premises directory but is no longer synced; null if this object has never been synced from an on-premises directory
    * (default). Read-only
    */
  var onPremisesSyncEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Contains the on-premises userPrincipalName synchronized from the on-premises directory. The property is only populated
    * for customers who are synchronizing their on-premises directory to Azure Active Directory via Azure AD Connect.
    * Read-only.
    */
  var onPremisesUserPrincipalName: js.UndefOr[String] = js.undefined
  // Read-only.
  var onenote: js.UndefOr[Onenote] = js.undefined
  var onlineMeetings: js.UndefOr[js.Array[OnlineMeeting]] = js.undefined
  /**
    * A list of additional email addresses for the user; for example: ['bob@contoso.com', 'Robert@fabrikam.com']. Supports
    * $filter.
    */
  var otherMails: js.UndefOr[js.Array[String]] = js.undefined
  // Read-only.
  var outlook: js.UndefOr[OutlookUser] = js.undefined
  // Devices that are owned by the user. Read-only. Nullable.
  var ownedDevices: js.UndefOr[js.Array[DirectoryObject]] = js.undefined
  // Directory objects that are owned by the user. Read-only. Nullable.
  var ownedObjects: js.UndefOr[js.Array[DirectoryObject]] = js.undefined
  /**
    * Specifies password policies for the user. This value is an enumeration with one possible value being
    * 'DisableStrongPassword', which allows weaker passwords than the default policy to be specified.
    * 'DisablePasswordExpiration' can also be specified. The two may be specified together; for example:
    * 'DisablePasswordExpiration, DisableStrongPassword'.
    */
  var passwordPolicies: js.UndefOr[String] = js.undefined
  /**
    * Specifies the password profile for the user. The profile contains the user’s password. This property is required when a
    * user is created. The password in the profile must satisfy minimum requirements as specified by the passwordPolicies
    * property. By default, a strong password is required.
    */
  var passwordProfile: js.UndefOr[PasswordProfile] = js.undefined
  // A list for the user to enumerate their past projects.
  var pastProjects: js.UndefOr[js.Array[String]] = js.undefined
  // People that are relevant to the user. Read-only. Nullable.
  var people: js.UndefOr[js.Array[Person]] = js.undefined
  // The user's profile photo. Read-only.
  var photo: js.UndefOr[ProfilePhoto] = js.undefined
  var photos: js.UndefOr[js.Array[ProfilePhoto]] = js.undefined
  // Entry-point to the Planner resource that might exist for a user. Read-only.
  var planner: js.UndefOr[PlannerUser] = js.undefined
  /**
    * The postal code for the user's postal address. The postal code is specific to the user's country/region. In the United
    * States of America, this attribute contains the ZIP code.
    */
  var postalCode: js.UndefOr[String] = js.undefined
  // The preferred language for the user. Should follow ISO 639-1 Code; for example 'en-US'.
  var preferredLanguage: js.UndefOr[String] = js.undefined
  // The preferred name for the user.
  var preferredName: js.UndefOr[String] = js.undefined
  // The plans that are provisioned for the user. Read-only. Not nullable.
  var provisionedPlans: js.UndefOr[js.Array[ProvisionedPlan]] = js.undefined
  /**
    * For example: ['SMTP: bob@contoso.com', 'smtp: bob@sales.contoso.com'] The any operator is required for filter
    * expressions on multi-valued properties. Read-only, Not nullable. Supports $filter.
    */
  var proxyAddresses: js.UndefOr[js.Array[String]] = js.undefined
  // Devices that are registered for the user. Read-only. Nullable.
  var registeredDevices: js.UndefOr[js.Array[DirectoryObject]] = js.undefined
  // A list for the user to enumerate their responsibilities.
  var responsibilities: js.UndefOr[js.Array[String]] = js.undefined
  // A list for the user to enumerate the schools they have attended.
  var schools: js.UndefOr[js.Array[String]] = js.undefined
  var settings: js.UndefOr[UserSettings] = js.undefined
  /**
    * true if the Outlook global address list should contain this user, otherwise false. If not set, this will be treated as
    * true. For users invited through the invitation manager, this property will be set to false.
    */
  var showInAddressList: js.UndefOr[Boolean] = js.undefined
  /**
    * Any refresh tokens or sessions tokens (session cookies) issued before this time are invalid, and applications will get
    * an error when using an invalid refresh or sessions token to acquire a delegated access token (to access APIs such as
    * Microsoft Graph). If this happens, the application will need to acquire a new refresh token by making a request to the
    * authorize endpoint. Read-only. Use revokeSignInSessions to reset.
    */
  var signInSessionsValidFromDateTime: js.UndefOr[String] = js.undefined
  // A list for the user to enumerate their skills.
  var skills: js.UndefOr[js.Array[String]] = js.undefined
  // The state or province in the user's address. Supports $filter.
  var state: js.UndefOr[String] = js.undefined
  // The street address of the user's place of business.
  var streetAddress: js.UndefOr[String] = js.undefined
  // The user's surname (family name or last name). Supports $filter.
  var surname: js.UndefOr[String] = js.undefined
  var transitiveMemberOf: js.UndefOr[js.Array[DirectoryObject]] = js.undefined
  /**
    * A two letter country code (ISO standard 3166). Required for users that will be assigned licenses due to legal
    * requirement to check for availability of services in countries. Examples include: 'US', 'JP', and 'GB'. Not nullable.
    * Supports $filter.
    */
  var usageLocation: js.UndefOr[String] = js.undefined
  /**
    * The user principal name (UPN) of the user. The UPN is an Internet-style login name for the user based on the Internet
    * standard RFC 822. By convention, this should map to the user's email name. The general format is alias@domain, where
    * domain must be present in the tenant’s collection of verified domains. This property is required when a user is
    * created. The verified domains for the tenant can be accessed from the verifiedDomains property of organization.
    * Supports $filter and $orderby.
    */
  var userPrincipalName: js.UndefOr[String] = js.undefined
  /**
    * A string value that can be used to classify user types in your directory, such as 'Member' and 'Guest'. Supports
    * $filter.
    */
  var userType: js.UndefOr[String] = js.undefined
}

object User {
  @scala.inline
  def apply(
    aboutMe: String = null,
    accountEnabled: js.UndefOr[Boolean] = js.undefined,
    activities: js.Array[UserActivity] = null,
    ageGroup: String = null,
    assignedLicenses: js.Array[AssignedLicense] = null,
    assignedPlans: js.Array[AssignedPlan] = null,
    birthday: String = null,
    businessPhones: js.Array[String] = null,
    calendar: Calendar = null,
    calendarGroups: js.Array[CalendarGroup] = null,
    calendarView: js.Array[Event] = null,
    calendars: js.Array[Calendar] = null,
    city: String = null,
    companyName: String = null,
    consentProvidedForMinor: String = null,
    contactFolders: js.Array[ContactFolder] = null,
    contacts: js.Array[Contact] = null,
    country: String = null,
    createdObjects: js.Array[DirectoryObject] = null,
    deletedDateTime: String = null,
    department: String = null,
    deviceEnrollmentLimit: Int | Double = null,
    deviceManagementTroubleshootingEvents: js.Array[DeviceManagementTroubleshootingEvent] = null,
    directReports: js.Array[DirectoryObject] = null,
    displayName: String = null,
    drive: Drive = null,
    drives: js.Array[Drive] = null,
    employeeId: String = null,
    events: js.Array[Event] = null,
    extensions: js.Array[Extension] = null,
    faxNumber: String = null,
    givenName: String = null,
    hireDate: String = null,
    id: String = null,
    imAddresses: js.Array[String] = null,
    inferenceClassification: InferenceClassification = null,
    insights: OfficeGraphInsights = null,
    interests: js.Array[String] = null,
    isResourceAccount: js.UndefOr[Boolean] = js.undefined,
    jobTitle: String = null,
    joinedTeams: js.Array[Group] = null,
    legalAgeGroupClassification: String = null,
    licenseAssignmentStates: js.Array[LicenseAssignmentState] = null,
    licenseDetails: js.Array[LicenseDetails] = null,
    mail: String = null,
    mailFolders: js.Array[MailFolder] = null,
    mailNickname: String = null,
    mailboxSettings: MailboxSettings = null,
    managedAppRegistrations: js.Array[ManagedAppRegistration] = null,
    managedDevices: js.Array[ManagedDevice] = null,
    manager: DirectoryObject = null,
    memberOf: js.Array[DirectoryObject] = null,
    messages: js.Array[Message] = null,
    mobilePhone: String = null,
    mySite: String = null,
    officeLocation: String = null,
    onPremisesDistinguishedName: String = null,
    onPremisesDomainName: String = null,
    onPremisesExtensionAttributes: OnPremisesExtensionAttributes = null,
    onPremisesImmutableId: String = null,
    onPremisesLastSyncDateTime: String = null,
    onPremisesProvisioningErrors: js.Array[OnPremisesProvisioningError] = null,
    onPremisesSamAccountName: String = null,
    onPremisesSecurityIdentifier: String = null,
    onPremisesSyncEnabled: js.UndefOr[Boolean] = js.undefined,
    onPremisesUserPrincipalName: String = null,
    onenote: Onenote = null,
    onlineMeetings: js.Array[OnlineMeeting] = null,
    otherMails: js.Array[String] = null,
    outlook: OutlookUser = null,
    ownedDevices: js.Array[DirectoryObject] = null,
    ownedObjects: js.Array[DirectoryObject] = null,
    passwordPolicies: String = null,
    passwordProfile: PasswordProfile = null,
    pastProjects: js.Array[String] = null,
    people: js.Array[Person] = null,
    photo: ProfilePhoto = null,
    photos: js.Array[ProfilePhoto] = null,
    planner: PlannerUser = null,
    postalCode: String = null,
    preferredLanguage: String = null,
    preferredName: String = null,
    provisionedPlans: js.Array[ProvisionedPlan] = null,
    proxyAddresses: js.Array[String] = null,
    registeredDevices: js.Array[DirectoryObject] = null,
    responsibilities: js.Array[String] = null,
    schools: js.Array[String] = null,
    settings: UserSettings = null,
    showInAddressList: js.UndefOr[Boolean] = js.undefined,
    signInSessionsValidFromDateTime: String = null,
    skills: js.Array[String] = null,
    state: String = null,
    streetAddress: String = null,
    surname: String = null,
    transitiveMemberOf: js.Array[DirectoryObject] = null,
    usageLocation: String = null,
    userPrincipalName: String = null,
    userType: String = null
  ): User = {
    val __obj = js.Dynamic.literal()
    if (aboutMe != null) __obj.updateDynamic("aboutMe")(aboutMe.asInstanceOf[js.Any])
    if (!js.isUndefined(accountEnabled)) __obj.updateDynamic("accountEnabled")(accountEnabled.asInstanceOf[js.Any])
    if (activities != null) __obj.updateDynamic("activities")(activities.asInstanceOf[js.Any])
    if (ageGroup != null) __obj.updateDynamic("ageGroup")(ageGroup.asInstanceOf[js.Any])
    if (assignedLicenses != null) __obj.updateDynamic("assignedLicenses")(assignedLicenses.asInstanceOf[js.Any])
    if (assignedPlans != null) __obj.updateDynamic("assignedPlans")(assignedPlans.asInstanceOf[js.Any])
    if (birthday != null) __obj.updateDynamic("birthday")(birthday.asInstanceOf[js.Any])
    if (businessPhones != null) __obj.updateDynamic("businessPhones")(businessPhones.asInstanceOf[js.Any])
    if (calendar != null) __obj.updateDynamic("calendar")(calendar.asInstanceOf[js.Any])
    if (calendarGroups != null) __obj.updateDynamic("calendarGroups")(calendarGroups.asInstanceOf[js.Any])
    if (calendarView != null) __obj.updateDynamic("calendarView")(calendarView.asInstanceOf[js.Any])
    if (calendars != null) __obj.updateDynamic("calendars")(calendars.asInstanceOf[js.Any])
    if (city != null) __obj.updateDynamic("city")(city.asInstanceOf[js.Any])
    if (companyName != null) __obj.updateDynamic("companyName")(companyName.asInstanceOf[js.Any])
    if (consentProvidedForMinor != null) __obj.updateDynamic("consentProvidedForMinor")(consentProvidedForMinor.asInstanceOf[js.Any])
    if (contactFolders != null) __obj.updateDynamic("contactFolders")(contactFolders.asInstanceOf[js.Any])
    if (contacts != null) __obj.updateDynamic("contacts")(contacts.asInstanceOf[js.Any])
    if (country != null) __obj.updateDynamic("country")(country.asInstanceOf[js.Any])
    if (createdObjects != null) __obj.updateDynamic("createdObjects")(createdObjects.asInstanceOf[js.Any])
    if (deletedDateTime != null) __obj.updateDynamic("deletedDateTime")(deletedDateTime.asInstanceOf[js.Any])
    if (department != null) __obj.updateDynamic("department")(department.asInstanceOf[js.Any])
    if (deviceEnrollmentLimit != null) __obj.updateDynamic("deviceEnrollmentLimit")(deviceEnrollmentLimit.asInstanceOf[js.Any])
    if (deviceManagementTroubleshootingEvents != null) __obj.updateDynamic("deviceManagementTroubleshootingEvents")(deviceManagementTroubleshootingEvents.asInstanceOf[js.Any])
    if (directReports != null) __obj.updateDynamic("directReports")(directReports.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (drive != null) __obj.updateDynamic("drive")(drive.asInstanceOf[js.Any])
    if (drives != null) __obj.updateDynamic("drives")(drives.asInstanceOf[js.Any])
    if (employeeId != null) __obj.updateDynamic("employeeId")(employeeId.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    if (faxNumber != null) __obj.updateDynamic("faxNumber")(faxNumber.asInstanceOf[js.Any])
    if (givenName != null) __obj.updateDynamic("givenName")(givenName.asInstanceOf[js.Any])
    if (hireDate != null) __obj.updateDynamic("hireDate")(hireDate.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (imAddresses != null) __obj.updateDynamic("imAddresses")(imAddresses.asInstanceOf[js.Any])
    if (inferenceClassification != null) __obj.updateDynamic("inferenceClassification")(inferenceClassification.asInstanceOf[js.Any])
    if (insights != null) __obj.updateDynamic("insights")(insights.asInstanceOf[js.Any])
    if (interests != null) __obj.updateDynamic("interests")(interests.asInstanceOf[js.Any])
    if (!js.isUndefined(isResourceAccount)) __obj.updateDynamic("isResourceAccount")(isResourceAccount.asInstanceOf[js.Any])
    if (jobTitle != null) __obj.updateDynamic("jobTitle")(jobTitle.asInstanceOf[js.Any])
    if (joinedTeams != null) __obj.updateDynamic("joinedTeams")(joinedTeams.asInstanceOf[js.Any])
    if (legalAgeGroupClassification != null) __obj.updateDynamic("legalAgeGroupClassification")(legalAgeGroupClassification.asInstanceOf[js.Any])
    if (licenseAssignmentStates != null) __obj.updateDynamic("licenseAssignmentStates")(licenseAssignmentStates.asInstanceOf[js.Any])
    if (licenseDetails != null) __obj.updateDynamic("licenseDetails")(licenseDetails.asInstanceOf[js.Any])
    if (mail != null) __obj.updateDynamic("mail")(mail.asInstanceOf[js.Any])
    if (mailFolders != null) __obj.updateDynamic("mailFolders")(mailFolders.asInstanceOf[js.Any])
    if (mailNickname != null) __obj.updateDynamic("mailNickname")(mailNickname.asInstanceOf[js.Any])
    if (mailboxSettings != null) __obj.updateDynamic("mailboxSettings")(mailboxSettings.asInstanceOf[js.Any])
    if (managedAppRegistrations != null) __obj.updateDynamic("managedAppRegistrations")(managedAppRegistrations.asInstanceOf[js.Any])
    if (managedDevices != null) __obj.updateDynamic("managedDevices")(managedDevices.asInstanceOf[js.Any])
    if (manager != null) __obj.updateDynamic("manager")(manager.asInstanceOf[js.Any])
    if (memberOf != null) __obj.updateDynamic("memberOf")(memberOf.asInstanceOf[js.Any])
    if (messages != null) __obj.updateDynamic("messages")(messages.asInstanceOf[js.Any])
    if (mobilePhone != null) __obj.updateDynamic("mobilePhone")(mobilePhone.asInstanceOf[js.Any])
    if (mySite != null) __obj.updateDynamic("mySite")(mySite.asInstanceOf[js.Any])
    if (officeLocation != null) __obj.updateDynamic("officeLocation")(officeLocation.asInstanceOf[js.Any])
    if (onPremisesDistinguishedName != null) __obj.updateDynamic("onPremisesDistinguishedName")(onPremisesDistinguishedName.asInstanceOf[js.Any])
    if (onPremisesDomainName != null) __obj.updateDynamic("onPremisesDomainName")(onPremisesDomainName.asInstanceOf[js.Any])
    if (onPremisesExtensionAttributes != null) __obj.updateDynamic("onPremisesExtensionAttributes")(onPremisesExtensionAttributes.asInstanceOf[js.Any])
    if (onPremisesImmutableId != null) __obj.updateDynamic("onPremisesImmutableId")(onPremisesImmutableId.asInstanceOf[js.Any])
    if (onPremisesLastSyncDateTime != null) __obj.updateDynamic("onPremisesLastSyncDateTime")(onPremisesLastSyncDateTime.asInstanceOf[js.Any])
    if (onPremisesProvisioningErrors != null) __obj.updateDynamic("onPremisesProvisioningErrors")(onPremisesProvisioningErrors.asInstanceOf[js.Any])
    if (onPremisesSamAccountName != null) __obj.updateDynamic("onPremisesSamAccountName")(onPremisesSamAccountName.asInstanceOf[js.Any])
    if (onPremisesSecurityIdentifier != null) __obj.updateDynamic("onPremisesSecurityIdentifier")(onPremisesSecurityIdentifier.asInstanceOf[js.Any])
    if (!js.isUndefined(onPremisesSyncEnabled)) __obj.updateDynamic("onPremisesSyncEnabled")(onPremisesSyncEnabled.asInstanceOf[js.Any])
    if (onPremisesUserPrincipalName != null) __obj.updateDynamic("onPremisesUserPrincipalName")(onPremisesUserPrincipalName.asInstanceOf[js.Any])
    if (onenote != null) __obj.updateDynamic("onenote")(onenote.asInstanceOf[js.Any])
    if (onlineMeetings != null) __obj.updateDynamic("onlineMeetings")(onlineMeetings.asInstanceOf[js.Any])
    if (otherMails != null) __obj.updateDynamic("otherMails")(otherMails.asInstanceOf[js.Any])
    if (outlook != null) __obj.updateDynamic("outlook")(outlook.asInstanceOf[js.Any])
    if (ownedDevices != null) __obj.updateDynamic("ownedDevices")(ownedDevices.asInstanceOf[js.Any])
    if (ownedObjects != null) __obj.updateDynamic("ownedObjects")(ownedObjects.asInstanceOf[js.Any])
    if (passwordPolicies != null) __obj.updateDynamic("passwordPolicies")(passwordPolicies.asInstanceOf[js.Any])
    if (passwordProfile != null) __obj.updateDynamic("passwordProfile")(passwordProfile.asInstanceOf[js.Any])
    if (pastProjects != null) __obj.updateDynamic("pastProjects")(pastProjects.asInstanceOf[js.Any])
    if (people != null) __obj.updateDynamic("people")(people.asInstanceOf[js.Any])
    if (photo != null) __obj.updateDynamic("photo")(photo.asInstanceOf[js.Any])
    if (photos != null) __obj.updateDynamic("photos")(photos.asInstanceOf[js.Any])
    if (planner != null) __obj.updateDynamic("planner")(planner.asInstanceOf[js.Any])
    if (postalCode != null) __obj.updateDynamic("postalCode")(postalCode.asInstanceOf[js.Any])
    if (preferredLanguage != null) __obj.updateDynamic("preferredLanguage")(preferredLanguage.asInstanceOf[js.Any])
    if (preferredName != null) __obj.updateDynamic("preferredName")(preferredName.asInstanceOf[js.Any])
    if (provisionedPlans != null) __obj.updateDynamic("provisionedPlans")(provisionedPlans.asInstanceOf[js.Any])
    if (proxyAddresses != null) __obj.updateDynamic("proxyAddresses")(proxyAddresses.asInstanceOf[js.Any])
    if (registeredDevices != null) __obj.updateDynamic("registeredDevices")(registeredDevices.asInstanceOf[js.Any])
    if (responsibilities != null) __obj.updateDynamic("responsibilities")(responsibilities.asInstanceOf[js.Any])
    if (schools != null) __obj.updateDynamic("schools")(schools.asInstanceOf[js.Any])
    if (settings != null) __obj.updateDynamic("settings")(settings.asInstanceOf[js.Any])
    if (!js.isUndefined(showInAddressList)) __obj.updateDynamic("showInAddressList")(showInAddressList.asInstanceOf[js.Any])
    if (signInSessionsValidFromDateTime != null) __obj.updateDynamic("signInSessionsValidFromDateTime")(signInSessionsValidFromDateTime.asInstanceOf[js.Any])
    if (skills != null) __obj.updateDynamic("skills")(skills.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (streetAddress != null) __obj.updateDynamic("streetAddress")(streetAddress.asInstanceOf[js.Any])
    if (surname != null) __obj.updateDynamic("surname")(surname.asInstanceOf[js.Any])
    if (transitiveMemberOf != null) __obj.updateDynamic("transitiveMemberOf")(transitiveMemberOf.asInstanceOf[js.Any])
    if (usageLocation != null) __obj.updateDynamic("usageLocation")(usageLocation.asInstanceOf[js.Any])
    if (userPrincipalName != null) __obj.updateDynamic("userPrincipalName")(userPrincipalName.asInstanceOf[js.Any])
    if (userType != null) __obj.updateDynamic("userType")(userType.asInstanceOf[js.Any])
    __obj.asInstanceOf[User]
  }
}

