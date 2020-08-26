package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait User extends DirectoryObject {
  // A freeform text entry field for the user to describe themselves.
  var aboutMe: js.UndefOr[String] = js.native
  // true if the account is enabled; otherwise, false. This property is required when a user is created. Supports $filter.
  var accountEnabled: js.UndefOr[Boolean] = js.native
  // The user's activities across devices. Read-only. Nullable.
  var activities: js.UndefOr[js.Array[UserActivity]] = js.native
  /**
    * Sets the age group of the user. Allowed values: null, minor, notAdult and adult. Refer to the legal age group property
    * definitions for further information.
    */
  var ageGroup: js.UndefOr[String] = js.native
  var appRoleAssignments: js.UndefOr[js.Array[AppRoleAssignment]] = js.native
  // The licenses that are assigned to the user. Not nullable.
  var assignedLicenses: js.UndefOr[js.Array[AssignedLicense]] = js.native
  // The plans that are assigned to the user. Read-only. Not nullable.
  var assignedPlans: js.UndefOr[js.Array[AssignedPlan]] = js.native
  /**
    * The birthday of the user. The Timestamp type represents date and time information using ISO 8601 format and is always
    * in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'
    */
  var birthday: js.UndefOr[String] = js.native
  /**
    * The telephone numbers for the user. NOTE: Although this is a string collection, only one number can be set for this
    * property.
    */
  var businessPhones: js.UndefOr[js.Array[String]] = js.native
  // The user's primary calendar. Read-only.
  var calendar: js.UndefOr[Calendar] = js.native
  // The user's calendar groups. Read-only. Nullable.
  var calendarGroups: js.UndefOr[js.Array[CalendarGroup]] = js.native
  // The calendar view for the calendar. Read-only. Nullable.
  var calendarView: js.UndefOr[js.Array[Event]] = js.native
  // The user's calendars. Read-only. Nullable.
  var calendars: js.UndefOr[js.Array[Calendar]] = js.native
  // The city in which the user is located. Supports $filter.
  var city: js.UndefOr[String] = js.native
  /**
    * The company name which the user is associated. This property can be useful for describing the company that an external
    * user comes from.
    */
  var companyName: js.UndefOr[String] = js.native
  /**
    * Sets whether consent has been obtained for minors. Allowed values: null, granted, denied and notRequired. Refer to the
    * legal age group property definitions for further information.
    */
  var consentProvidedForMinor: js.UndefOr[String] = js.native
  // The user's contacts folders. Read-only. Nullable.
  var contactFolders: js.UndefOr[js.Array[ContactFolder]] = js.native
  // The user's contacts. Read-only. Nullable.
  var contacts: js.UndefOr[js.Array[Contact]] = js.native
  // The country/region in which the user is located; for example, 'US' or 'UK'. Supports $filter.
  var country: js.UndefOr[String] = js.native
  // Directory objects that were created by the user. Read-only. Nullable.
  var createdObjects: js.UndefOr[js.Array[DirectoryObject]] = js.native
  /**
    * Indicates whether the user account was created as a regular school or work account (null), an external account
    * (Invitation), a local account for an Azure Active Directory B2C tenant (LocalAccount) or self-service sign-up using
    * email verification (EmailVerified). Read-only.
    */
  var creationType: js.UndefOr[String] = js.native
  // The name for the department in which the user works. Supports $filter.
  var department: js.UndefOr[String] = js.native
  // The limit on the maximum number of devices that the user is permitted to enroll. Allowed values are 5 or 1000.
  var deviceEnrollmentLimit: js.UndefOr[Double] = js.native
  // The list of troubleshooting events for this user.
  var deviceManagementTroubleshootingEvents: js.UndefOr[js.Array[DeviceManagementTroubleshootingEvent]] = js.native
  /**
    * The users and contacts that report to the user. (The users and contacts that have their manager property set to this
    * user.) Read-only. Nullable.
    */
  var directReports: js.UndefOr[js.Array[DirectoryObject]] = js.native
  /**
    * The name displayed in the address book for the user. This is usually the combination of the user's first name, middle
    * initial and last name. This property is required when a user is created and it cannot be cleared during updates.
    * Supports $filter and $orderby.
    */
  var displayName: js.UndefOr[String] = js.native
  // The user's OneDrive. Read-only.
  var drive: js.UndefOr[Drive] = js.native
  // A collection of drives available for this user. Read-only.
  var drives: js.UndefOr[js.Array[Drive]] = js.native
  // The employee identifier assigned to the user by the organization. Supports $filter.
  var employeeId: js.UndefOr[String] = js.native
  // The user's events. Default is to show Events under the Default Calendar. Read-only. Nullable.
  var events: js.UndefOr[js.Array[Event]] = js.native
  // The collection of open extensions defined for the user. Read-only. Nullable.
  var extensions: js.UndefOr[js.Array[Extension]] = js.native
  /**
    * For an external user invited to the tenant using the invitation API, this property represents the invited user's
    * invitation status. For invited users, the state can be PendingAcceptance or Accepted, or null for all other users.
    * Returned only on $select. Supports $filter with the supported values. For example: $filter=externalUserState eq
    * 'PendingAcceptance'.
    */
  var externalUserState: js.UndefOr[String] = js.native
  // Shows the timestamp for the latest change to the externalUserState property. Returned only on $select.
  var externalUserStateChangeDateTime: js.UndefOr[String] = js.native
  // The fax number of the user.
  var faxNumber: js.UndefOr[String] = js.native
  var followedSites: js.UndefOr[js.Array[Site]] = js.native
  // The given name (first name) of the user. Supports $filter.
  var givenName: js.UndefOr[String] = js.native
  /**
    * The hire date of the user. The Timestamp type represents date and time information using ISO 8601 format and is always
    * in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'
    */
  var hireDate: js.UndefOr[String] = js.native
  /**
    * Represents the identities that can be used to sign in to this user account. An identity can be provided by Microsoft
    * (also known as a local account), by organizations, or by social identity providers such as Facebook, Google, and
    * Microsoft, and tied to a user account. May contain multiple items with the same signInType value. Supports $filter.
    */
  var identities: js.UndefOr[js.Array[ObjectIdentity]] = js.native
  // The instant message voice over IP (VOIP) session initiation protocol (SIP) addresses for the user. Read-only.
  var imAddresses: js.UndefOr[js.Array[String]] = js.native
  /**
    * Relevance classification of the user's messages based on explicit designations which override inferred relevance or
    * importance.
    */
  var inferenceClassification: js.UndefOr[InferenceClassification] = js.native
  // Read-only. Nullable.
  var insights: js.UndefOr[OfficeGraphInsights] = js.native
  // A list for the user to describe their interests.
  var interests: js.UndefOr[js.Array[String]] = js.native
  // Do not use – reserved for future use.
  var isResourceAccount: js.UndefOr[Boolean] = js.native
  // The user’s job title. Supports $filter.
  var jobTitle: js.UndefOr[String] = js.native
  var joinedTeams: js.UndefOr[js.Array[Team]] = js.native
  /**
    * The time when this Azure AD user last changed their password. The date and time information uses ISO 8601 format and is
    * always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'
    */
  var lastPasswordChangeDateTime: js.UndefOr[String] = js.native
  /**
    * Used by enterprise applications to determine the legal age group of the user. This property is read-only and calculated
    * based on ageGroup and consentProvidedForMinor properties. Allowed values: null, minorWithOutParentalConsent,
    * minorWithParentalConsent, minorNoParentalConsentRequired, notAdult and adult. Refer to the legal age group property
    * definitions for further information.)
    */
  var legalAgeGroupClassification: js.UndefOr[String] = js.native
  // State of license assignments for this user. Read-only.
  var licenseAssignmentStates: js.UndefOr[js.Array[LicenseAssignmentState]] = js.native
  // A collection of this user's license details. Read-only.
  var licenseDetails: js.UndefOr[js.Array[LicenseDetails]] = js.native
  // The SMTP address for the user, for example, 'jeff@contoso.onmicrosoft.com'. Read-Only. Supports $filter.
  var mail: js.UndefOr[String] = js.native
  // The user's mail folders. Read-only. Nullable.
  var mailFolders: js.UndefOr[js.Array[MailFolder]] = js.native
  // The mail alias for the user. This property must be specified when a user is created. Supports $filter.
  var mailNickname: js.UndefOr[String] = js.native
  /**
    * Settings for the primary mailbox of the signed-in user. You can get or update settings for sending automatic replies to
    * incoming messages, locale and time zone.
    */
  var mailboxSettings: js.UndefOr[MailboxSettings] = js.native
  // Zero or more managed app registrations that belong to the user.
  var managedAppRegistrations: js.UndefOr[js.Array[ManagedAppRegistration]] = js.native
  // The managed devices associated with the user.
  var managedDevices: js.UndefOr[js.Array[ManagedDevice]] = js.native
  // The user or contact that is this user’s manager. Read-only. (HTTP Methods: GET, PUT, DELETE.)
  var manager: js.UndefOr[DirectoryObject] = js.native
  // The groups and directory roles that the user is a member of. Read-only. Nullable.
  var memberOf: js.UndefOr[js.Array[DirectoryObject]] = js.native
  // The messages in a mailbox or folder. Read-only. Nullable.
  var messages: js.UndefOr[js.Array[Message]] = js.native
  // The primary cellular telephone number for the user.
  var mobilePhone: js.UndefOr[String] = js.native
  // The URL for the user's personal site.
  var mySite: js.UndefOr[String] = js.native
  var oauth2PermissionGrants: js.UndefOr[js.Array[OAuth2PermissionGrant]] = js.native
  // The office location in the user's place of business.
  var officeLocation: js.UndefOr[String] = js.native
  /**
    * Contains the on-premises Active Directory distinguished name or DN. The property is only populated for customers who
    * are synchronizing their on-premises directory to Azure Active Directory via Azure AD Connect. Read-only.
    */
  var onPremisesDistinguishedName: js.UndefOr[String] = js.native
  /**
    * Contains the on-premises domainFQDN, also called dnsDomainName synchronized from the on-premises directory. The
    * property is only populated for customers who are synchronizing their on-premises directory to Azure Active Directory
    * via Azure AD Connect. Read-only.
    */
  var onPremisesDomainName: js.UndefOr[String] = js.native
  /**
    * Contains extensionAttributes 1-15 for the user. Note that the individual extension attributes are neither selectable
    * nor filterable. For an onPremisesSyncEnabled user, the source of authority for this set of properties is the
    * on-premises and is read-only. For a cloud-only user (where onPremisesSyncEnabled is false), these properties may be set
    * during creation or update. These extension attributes are also known as Exchange custom attributes 1-15.
    */
  var onPremisesExtensionAttributes: js.UndefOr[OnPremisesExtensionAttributes] = js.native
  /**
    * This property is used to associate an on-premises Active Directory user account to their Azure AD user object. This
    * property must be specified when creating a new user account in the Graph if you are using a federated domain for the
    * user’s userPrincipalName (UPN) property. Important: The $ and _ characters cannot be used when specifying this
    * property. Supports $filter.
    */
  var onPremisesImmutableId: js.UndefOr[String] = js.native
  /**
    * Indicates the last time at which the object was synced with the on-premises directory; for example:
    * '2013-02-16T03:04:54Z'. The Timestamp type represents date and time information using ISO 8601 format and is always in
    * UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'. Read-only.
    */
  var onPremisesLastSyncDateTime: js.UndefOr[String] = js.native
  // Errors when using Microsoft synchronization product during provisioning.
  var onPremisesProvisioningErrors: js.UndefOr[js.Array[OnPremisesProvisioningError]] = js.native
  /**
    * Contains the on-premises samAccountName synchronized from the on-premises directory. The property is only populated for
    * customers who are synchronizing their on-premises directory to Azure Active Directory via Azure AD Connect. Read-only.
    */
  var onPremisesSamAccountName: js.UndefOr[String] = js.native
  /**
    * Contains the on-premises security identifier (SID) for the user that was synchronized from on-premises to the cloud.
    * Read-only.
    */
  var onPremisesSecurityIdentifier: js.UndefOr[String] = js.native
  /**
    * true if this object is synced from an on-premises directory; false if this object was originally synced from an
    * on-premises directory but is no longer synced; null if this object has never been synced from an on-premises directory
    * (default). Read-only
    */
  var onPremisesSyncEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Contains the on-premises userPrincipalName synchronized from the on-premises directory. The property is only populated
    * for customers who are synchronizing their on-premises directory to Azure Active Directory via Azure AD Connect.
    * Read-only.
    */
  var onPremisesUserPrincipalName: js.UndefOr[String] = js.native
  // Read-only.
  var onenote: js.UndefOr[Onenote] = js.native
  var onlineMeetings: js.UndefOr[js.Array[OnlineMeeting]] = js.native
  /**
    * A list of additional email addresses for the user; for example: ['bob@contoso.com', 'Robert@fabrikam.com']. Supports
    * $filter.
    */
  var otherMails: js.UndefOr[js.Array[String]] = js.native
  // Read-only.
  var outlook: js.UndefOr[OutlookUser] = js.native
  // Devices that are owned by the user. Read-only. Nullable.
  var ownedDevices: js.UndefOr[js.Array[DirectoryObject]] = js.native
  // Directory objects that are owned by the user. Read-only. Nullable.
  var ownedObjects: js.UndefOr[js.Array[DirectoryObject]] = js.native
  /**
    * Specifies password policies for the user. This value is an enumeration with one possible value being
    * 'DisableStrongPassword', which allows weaker passwords than the default policy to be specified.
    * 'DisablePasswordExpiration' can also be specified. The two may be specified together; for example:
    * 'DisablePasswordExpiration, DisableStrongPassword'.
    */
  var passwordPolicies: js.UndefOr[String] = js.native
  /**
    * Specifies the password profile for the user. The profile contains the user’s password. This property is required when a
    * user is created. The password in the profile must satisfy minimum requirements as specified by the passwordPolicies
    * property. By default, a strong password is required.
    */
  var passwordProfile: js.UndefOr[PasswordProfile] = js.native
  // A list for the user to enumerate their past projects.
  var pastProjects: js.UndefOr[js.Array[String]] = js.native
  // People that are relevant to the user. Read-only. Nullable.
  var people: js.UndefOr[js.Array[Person]] = js.native
  // The user's profile photo. Read-only.
  var photo: js.UndefOr[ProfilePhoto] = js.native
  var photos: js.UndefOr[js.Array[ProfilePhoto]] = js.native
  // Entry-point to the Planner resource that might exist for a user. Read-only.
  var planner: js.UndefOr[PlannerUser] = js.native
  /**
    * The postal code for the user's postal address. The postal code is specific to the user's country/region. In the United
    * States of America, this attribute contains the ZIP code.
    */
  var postalCode: js.UndefOr[String] = js.native
  // The preferred language for the user. Should follow ISO 639-1 Code; for example 'en-US'.
  var preferredLanguage: js.UndefOr[String] = js.native
  // The preferred name for the user.
  var preferredName: js.UndefOr[String] = js.native
  // The plans that are provisioned for the user. Read-only. Not nullable.
  var provisionedPlans: js.UndefOr[js.Array[ProvisionedPlan]] = js.native
  /**
    * For example: ['SMTP: bob@contoso.com', 'smtp: bob@sales.contoso.com'] The any operator is required for filter
    * expressions on multi-valued properties. Read-only, Not nullable. Supports $filter.
    */
  var proxyAddresses: js.UndefOr[js.Array[String]] = js.native
  // Devices that are registered for the user. Read-only. Nullable.
  var registeredDevices: js.UndefOr[js.Array[DirectoryObject]] = js.native
  // A list for the user to enumerate their responsibilities.
  var responsibilities: js.UndefOr[js.Array[String]] = js.native
  // A list for the user to enumerate the schools they have attended.
  var schools: js.UndefOr[js.Array[String]] = js.native
  var settings: js.UndefOr[UserSettings] = js.native
  /**
    * true if the Outlook global address list should contain this user, otherwise false. If not set, this will be treated as
    * true. For users invited through the invitation manager, this property will be set to false.
    */
  var showInAddressList: js.UndefOr[Boolean] = js.native
  /**
    * Any refresh tokens or sessions tokens (session cookies) issued before this time are invalid, and applications will get
    * an error when using an invalid refresh or sessions token to acquire a delegated access token (to access APIs such as
    * Microsoft Graph). If this happens, the application will need to acquire a new refresh token by making a request to the
    * authorize endpoint. Read-only. Use revokeSignInSessions to reset.
    */
  var signInSessionsValidFromDateTime: js.UndefOr[String] = js.native
  // A list for the user to enumerate their skills.
  var skills: js.UndefOr[js.Array[String]] = js.native
  // The state or province in the user's address. Supports $filter.
  var state: js.UndefOr[String] = js.native
  // The street address of the user's place of business.
  var streetAddress: js.UndefOr[String] = js.native
  // The user's surname (family name or last name). Supports $filter.
  var surname: js.UndefOr[String] = js.native
  var transitiveMemberOf: js.UndefOr[js.Array[DirectoryObject]] = js.native
  /**
    * A two letter country code (ISO standard 3166). Required for users that will be assigned licenses due to legal
    * requirement to check for availability of services in countries. Examples include: 'US', 'JP', and 'GB'. Not nullable.
    * Supports $filter.
    */
  var usageLocation: js.UndefOr[String] = js.native
  /**
    * The user principal name (UPN) of the user. The UPN is an Internet-style login name for the user based on the Internet
    * standard RFC 822. By convention, this should map to the user's email name. The general format is alias@domain, where
    * domain must be present in the tenant’s collection of verified domains. This property is required when a user is
    * created. The verified domains for the tenant can be accessed from the verifiedDomains property of organization.
    * Supports $filter and $orderby.
    */
  var userPrincipalName: js.UndefOr[String] = js.native
  /**
    * A string value that can be used to classify user types in your directory, such as 'Member' and 'Guest'. Supports
    * $filter.
    */
  var userType: js.UndefOr[String] = js.native
}

object User {
  @scala.inline
  def apply(): User = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[User]
  }
  @scala.inline
  implicit class UserOps[Self <: User] (val x: Self) extends AnyVal {
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
    def setAboutMe(value: String): Self = this.set("aboutMe", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAboutMe: Self = this.set("aboutMe", js.undefined)
    @scala.inline
    def setAccountEnabled(value: Boolean): Self = this.set("accountEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccountEnabled: Self = this.set("accountEnabled", js.undefined)
    @scala.inline
    def setActivitiesVarargs(value: UserActivity*): Self = this.set("activities", js.Array(value :_*))
    @scala.inline
    def setActivities(value: js.Array[UserActivity]): Self = this.set("activities", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActivities: Self = this.set("activities", js.undefined)
    @scala.inline
    def setAgeGroup(value: String): Self = this.set("ageGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAgeGroup: Self = this.set("ageGroup", js.undefined)
    @scala.inline
    def setAppRoleAssignmentsVarargs(value: AppRoleAssignment*): Self = this.set("appRoleAssignments", js.Array(value :_*))
    @scala.inline
    def setAppRoleAssignments(value: js.Array[AppRoleAssignment]): Self = this.set("appRoleAssignments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppRoleAssignments: Self = this.set("appRoleAssignments", js.undefined)
    @scala.inline
    def setAssignedLicensesVarargs(value: AssignedLicense*): Self = this.set("assignedLicenses", js.Array(value :_*))
    @scala.inline
    def setAssignedLicenses(value: js.Array[AssignedLicense]): Self = this.set("assignedLicenses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssignedLicenses: Self = this.set("assignedLicenses", js.undefined)
    @scala.inline
    def setAssignedPlansVarargs(value: AssignedPlan*): Self = this.set("assignedPlans", js.Array(value :_*))
    @scala.inline
    def setAssignedPlans(value: js.Array[AssignedPlan]): Self = this.set("assignedPlans", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssignedPlans: Self = this.set("assignedPlans", js.undefined)
    @scala.inline
    def setBirthday(value: String): Self = this.set("birthday", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBirthday: Self = this.set("birthday", js.undefined)
    @scala.inline
    def setBusinessPhonesVarargs(value: String*): Self = this.set("businessPhones", js.Array(value :_*))
    @scala.inline
    def setBusinessPhones(value: js.Array[String]): Self = this.set("businessPhones", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBusinessPhones: Self = this.set("businessPhones", js.undefined)
    @scala.inline
    def setCalendar(value: Calendar): Self = this.set("calendar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCalendar: Self = this.set("calendar", js.undefined)
    @scala.inline
    def setCalendarGroupsVarargs(value: CalendarGroup*): Self = this.set("calendarGroups", js.Array(value :_*))
    @scala.inline
    def setCalendarGroups(value: js.Array[CalendarGroup]): Self = this.set("calendarGroups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCalendarGroups: Self = this.set("calendarGroups", js.undefined)
    @scala.inline
    def setCalendarViewVarargs(value: Event*): Self = this.set("calendarView", js.Array(value :_*))
    @scala.inline
    def setCalendarView(value: js.Array[Event]): Self = this.set("calendarView", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCalendarView: Self = this.set("calendarView", js.undefined)
    @scala.inline
    def setCalendarsVarargs(value: Calendar*): Self = this.set("calendars", js.Array(value :_*))
    @scala.inline
    def setCalendars(value: js.Array[Calendar]): Self = this.set("calendars", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCalendars: Self = this.set("calendars", js.undefined)
    @scala.inline
    def setCity(value: String): Self = this.set("city", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCity: Self = this.set("city", js.undefined)
    @scala.inline
    def setCompanyName(value: String): Self = this.set("companyName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompanyName: Self = this.set("companyName", js.undefined)
    @scala.inline
    def setConsentProvidedForMinor(value: String): Self = this.set("consentProvidedForMinor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConsentProvidedForMinor: Self = this.set("consentProvidedForMinor", js.undefined)
    @scala.inline
    def setContactFoldersVarargs(value: ContactFolder*): Self = this.set("contactFolders", js.Array(value :_*))
    @scala.inline
    def setContactFolders(value: js.Array[ContactFolder]): Self = this.set("contactFolders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContactFolders: Self = this.set("contactFolders", js.undefined)
    @scala.inline
    def setContactsVarargs(value: Contact*): Self = this.set("contacts", js.Array(value :_*))
    @scala.inline
    def setContacts(value: js.Array[Contact]): Self = this.set("contacts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContacts: Self = this.set("contacts", js.undefined)
    @scala.inline
    def setCountry(value: String): Self = this.set("country", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCountry: Self = this.set("country", js.undefined)
    @scala.inline
    def setCreatedObjectsVarargs(value: DirectoryObject*): Self = this.set("createdObjects", js.Array(value :_*))
    @scala.inline
    def setCreatedObjects(value: js.Array[DirectoryObject]): Self = this.set("createdObjects", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedObjects: Self = this.set("createdObjects", js.undefined)
    @scala.inline
    def setCreationType(value: String): Self = this.set("creationType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationType: Self = this.set("creationType", js.undefined)
    @scala.inline
    def setDepartment(value: String): Self = this.set("department", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDepartment: Self = this.set("department", js.undefined)
    @scala.inline
    def setDeviceEnrollmentLimit(value: Double): Self = this.set("deviceEnrollmentLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceEnrollmentLimit: Self = this.set("deviceEnrollmentLimit", js.undefined)
    @scala.inline
    def setDeviceManagementTroubleshootingEventsVarargs(value: DeviceManagementTroubleshootingEvent*): Self = this.set("deviceManagementTroubleshootingEvents", js.Array(value :_*))
    @scala.inline
    def setDeviceManagementTroubleshootingEvents(value: js.Array[DeviceManagementTroubleshootingEvent]): Self = this.set("deviceManagementTroubleshootingEvents", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceManagementTroubleshootingEvents: Self = this.set("deviceManagementTroubleshootingEvents", js.undefined)
    @scala.inline
    def setDirectReportsVarargs(value: DirectoryObject*): Self = this.set("directReports", js.Array(value :_*))
    @scala.inline
    def setDirectReports(value: js.Array[DirectoryObject]): Self = this.set("directReports", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirectReports: Self = this.set("directReports", js.undefined)
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    @scala.inline
    def setDrive(value: Drive): Self = this.set("drive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDrive: Self = this.set("drive", js.undefined)
    @scala.inline
    def setDrivesVarargs(value: Drive*): Self = this.set("drives", js.Array(value :_*))
    @scala.inline
    def setDrives(value: js.Array[Drive]): Self = this.set("drives", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDrives: Self = this.set("drives", js.undefined)
    @scala.inline
    def setEmployeeId(value: String): Self = this.set("employeeId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmployeeId: Self = this.set("employeeId", js.undefined)
    @scala.inline
    def setEventsVarargs(value: Event*): Self = this.set("events", js.Array(value :_*))
    @scala.inline
    def setEvents(value: js.Array[Event]): Self = this.set("events", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvents: Self = this.set("events", js.undefined)
    @scala.inline
    def setExtensionsVarargs(value: Extension*): Self = this.set("extensions", js.Array(value :_*))
    @scala.inline
    def setExtensions(value: js.Array[Extension]): Self = this.set("extensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtensions: Self = this.set("extensions", js.undefined)
    @scala.inline
    def setExternalUserState(value: String): Self = this.set("externalUserState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExternalUserState: Self = this.set("externalUserState", js.undefined)
    @scala.inline
    def setExternalUserStateChangeDateTime(value: String): Self = this.set("externalUserStateChangeDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExternalUserStateChangeDateTime: Self = this.set("externalUserStateChangeDateTime", js.undefined)
    @scala.inline
    def setFaxNumber(value: String): Self = this.set("faxNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFaxNumber: Self = this.set("faxNumber", js.undefined)
    @scala.inline
    def setFollowedSitesVarargs(value: Site*): Self = this.set("followedSites", js.Array(value :_*))
    @scala.inline
    def setFollowedSites(value: js.Array[Site]): Self = this.set("followedSites", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFollowedSites: Self = this.set("followedSites", js.undefined)
    @scala.inline
    def setGivenName(value: String): Self = this.set("givenName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGivenName: Self = this.set("givenName", js.undefined)
    @scala.inline
    def setHireDate(value: String): Self = this.set("hireDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHireDate: Self = this.set("hireDate", js.undefined)
    @scala.inline
    def setIdentitiesVarargs(value: ObjectIdentity*): Self = this.set("identities", js.Array(value :_*))
    @scala.inline
    def setIdentities(value: js.Array[ObjectIdentity]): Self = this.set("identities", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdentities: Self = this.set("identities", js.undefined)
    @scala.inline
    def setImAddressesVarargs(value: String*): Self = this.set("imAddresses", js.Array(value :_*))
    @scala.inline
    def setImAddresses(value: js.Array[String]): Self = this.set("imAddresses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImAddresses: Self = this.set("imAddresses", js.undefined)
    @scala.inline
    def setInferenceClassification(value: InferenceClassification): Self = this.set("inferenceClassification", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInferenceClassification: Self = this.set("inferenceClassification", js.undefined)
    @scala.inline
    def setInsights(value: OfficeGraphInsights): Self = this.set("insights", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInsights: Self = this.set("insights", js.undefined)
    @scala.inline
    def setInterestsVarargs(value: String*): Self = this.set("interests", js.Array(value :_*))
    @scala.inline
    def setInterests(value: js.Array[String]): Self = this.set("interests", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInterests: Self = this.set("interests", js.undefined)
    @scala.inline
    def setIsResourceAccount(value: Boolean): Self = this.set("isResourceAccount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsResourceAccount: Self = this.set("isResourceAccount", js.undefined)
    @scala.inline
    def setJobTitle(value: String): Self = this.set("jobTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJobTitle: Self = this.set("jobTitle", js.undefined)
    @scala.inline
    def setJoinedTeamsVarargs(value: Team*): Self = this.set("joinedTeams", js.Array(value :_*))
    @scala.inline
    def setJoinedTeams(value: js.Array[Team]): Self = this.set("joinedTeams", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJoinedTeams: Self = this.set("joinedTeams", js.undefined)
    @scala.inline
    def setLastPasswordChangeDateTime(value: String): Self = this.set("lastPasswordChangeDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastPasswordChangeDateTime: Self = this.set("lastPasswordChangeDateTime", js.undefined)
    @scala.inline
    def setLegalAgeGroupClassification(value: String): Self = this.set("legalAgeGroupClassification", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLegalAgeGroupClassification: Self = this.set("legalAgeGroupClassification", js.undefined)
    @scala.inline
    def setLicenseAssignmentStatesVarargs(value: LicenseAssignmentState*): Self = this.set("licenseAssignmentStates", js.Array(value :_*))
    @scala.inline
    def setLicenseAssignmentStates(value: js.Array[LicenseAssignmentState]): Self = this.set("licenseAssignmentStates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLicenseAssignmentStates: Self = this.set("licenseAssignmentStates", js.undefined)
    @scala.inline
    def setLicenseDetailsVarargs(value: LicenseDetails*): Self = this.set("licenseDetails", js.Array(value :_*))
    @scala.inline
    def setLicenseDetails(value: js.Array[LicenseDetails]): Self = this.set("licenseDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLicenseDetails: Self = this.set("licenseDetails", js.undefined)
    @scala.inline
    def setMail(value: String): Self = this.set("mail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMail: Self = this.set("mail", js.undefined)
    @scala.inline
    def setMailFoldersVarargs(value: MailFolder*): Self = this.set("mailFolders", js.Array(value :_*))
    @scala.inline
    def setMailFolders(value: js.Array[MailFolder]): Self = this.set("mailFolders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMailFolders: Self = this.set("mailFolders", js.undefined)
    @scala.inline
    def setMailNickname(value: String): Self = this.set("mailNickname", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMailNickname: Self = this.set("mailNickname", js.undefined)
    @scala.inline
    def setMailboxSettings(value: MailboxSettings): Self = this.set("mailboxSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMailboxSettings: Self = this.set("mailboxSettings", js.undefined)
    @scala.inline
    def setManagedAppRegistrationsVarargs(value: ManagedAppRegistration*): Self = this.set("managedAppRegistrations", js.Array(value :_*))
    @scala.inline
    def setManagedAppRegistrations(value: js.Array[ManagedAppRegistration]): Self = this.set("managedAppRegistrations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteManagedAppRegistrations: Self = this.set("managedAppRegistrations", js.undefined)
    @scala.inline
    def setManagedDevicesVarargs(value: ManagedDevice*): Self = this.set("managedDevices", js.Array(value :_*))
    @scala.inline
    def setManagedDevices(value: js.Array[ManagedDevice]): Self = this.set("managedDevices", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteManagedDevices: Self = this.set("managedDevices", js.undefined)
    @scala.inline
    def setManager(value: DirectoryObject): Self = this.set("manager", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteManager: Self = this.set("manager", js.undefined)
    @scala.inline
    def setMemberOfVarargs(value: DirectoryObject*): Self = this.set("memberOf", js.Array(value :_*))
    @scala.inline
    def setMemberOf(value: js.Array[DirectoryObject]): Self = this.set("memberOf", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMemberOf: Self = this.set("memberOf", js.undefined)
    @scala.inline
    def setMessagesVarargs(value: Message*): Self = this.set("messages", js.Array(value :_*))
    @scala.inline
    def setMessages(value: js.Array[Message]): Self = this.set("messages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessages: Self = this.set("messages", js.undefined)
    @scala.inline
    def setMobilePhone(value: String): Self = this.set("mobilePhone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMobilePhone: Self = this.set("mobilePhone", js.undefined)
    @scala.inline
    def setMySite(value: String): Self = this.set("mySite", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMySite: Self = this.set("mySite", js.undefined)
    @scala.inline
    def setOauth2PermissionGrantsVarargs(value: OAuth2PermissionGrant*): Self = this.set("oauth2PermissionGrants", js.Array(value :_*))
    @scala.inline
    def setOauth2PermissionGrants(value: js.Array[OAuth2PermissionGrant]): Self = this.set("oauth2PermissionGrants", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOauth2PermissionGrants: Self = this.set("oauth2PermissionGrants", js.undefined)
    @scala.inline
    def setOfficeLocation(value: String): Self = this.set("officeLocation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOfficeLocation: Self = this.set("officeLocation", js.undefined)
    @scala.inline
    def setOnPremisesDistinguishedName(value: String): Self = this.set("onPremisesDistinguishedName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnPremisesDistinguishedName: Self = this.set("onPremisesDistinguishedName", js.undefined)
    @scala.inline
    def setOnPremisesDomainName(value: String): Self = this.set("onPremisesDomainName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnPremisesDomainName: Self = this.set("onPremisesDomainName", js.undefined)
    @scala.inline
    def setOnPremisesExtensionAttributes(value: OnPremisesExtensionAttributes): Self = this.set("onPremisesExtensionAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnPremisesExtensionAttributes: Self = this.set("onPremisesExtensionAttributes", js.undefined)
    @scala.inline
    def setOnPremisesImmutableId(value: String): Self = this.set("onPremisesImmutableId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnPremisesImmutableId: Self = this.set("onPremisesImmutableId", js.undefined)
    @scala.inline
    def setOnPremisesLastSyncDateTime(value: String): Self = this.set("onPremisesLastSyncDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnPremisesLastSyncDateTime: Self = this.set("onPremisesLastSyncDateTime", js.undefined)
    @scala.inline
    def setOnPremisesProvisioningErrorsVarargs(value: OnPremisesProvisioningError*): Self = this.set("onPremisesProvisioningErrors", js.Array(value :_*))
    @scala.inline
    def setOnPremisesProvisioningErrors(value: js.Array[OnPremisesProvisioningError]): Self = this.set("onPremisesProvisioningErrors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnPremisesProvisioningErrors: Self = this.set("onPremisesProvisioningErrors", js.undefined)
    @scala.inline
    def setOnPremisesSamAccountName(value: String): Self = this.set("onPremisesSamAccountName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnPremisesSamAccountName: Self = this.set("onPremisesSamAccountName", js.undefined)
    @scala.inline
    def setOnPremisesSecurityIdentifier(value: String): Self = this.set("onPremisesSecurityIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnPremisesSecurityIdentifier: Self = this.set("onPremisesSecurityIdentifier", js.undefined)
    @scala.inline
    def setOnPremisesSyncEnabled(value: Boolean): Self = this.set("onPremisesSyncEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnPremisesSyncEnabled: Self = this.set("onPremisesSyncEnabled", js.undefined)
    @scala.inline
    def setOnPremisesUserPrincipalName(value: String): Self = this.set("onPremisesUserPrincipalName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnPremisesUserPrincipalName: Self = this.set("onPremisesUserPrincipalName", js.undefined)
    @scala.inline
    def setOnenote(value: Onenote): Self = this.set("onenote", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnenote: Self = this.set("onenote", js.undefined)
    @scala.inline
    def setOnlineMeetingsVarargs(value: OnlineMeeting*): Self = this.set("onlineMeetings", js.Array(value :_*))
    @scala.inline
    def setOnlineMeetings(value: js.Array[OnlineMeeting]): Self = this.set("onlineMeetings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnlineMeetings: Self = this.set("onlineMeetings", js.undefined)
    @scala.inline
    def setOtherMailsVarargs(value: String*): Self = this.set("otherMails", js.Array(value :_*))
    @scala.inline
    def setOtherMails(value: js.Array[String]): Self = this.set("otherMails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOtherMails: Self = this.set("otherMails", js.undefined)
    @scala.inline
    def setOutlook(value: OutlookUser): Self = this.set("outlook", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutlook: Self = this.set("outlook", js.undefined)
    @scala.inline
    def setOwnedDevicesVarargs(value: DirectoryObject*): Self = this.set("ownedDevices", js.Array(value :_*))
    @scala.inline
    def setOwnedDevices(value: js.Array[DirectoryObject]): Self = this.set("ownedDevices", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwnedDevices: Self = this.set("ownedDevices", js.undefined)
    @scala.inline
    def setOwnedObjectsVarargs(value: DirectoryObject*): Self = this.set("ownedObjects", js.Array(value :_*))
    @scala.inline
    def setOwnedObjects(value: js.Array[DirectoryObject]): Self = this.set("ownedObjects", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwnedObjects: Self = this.set("ownedObjects", js.undefined)
    @scala.inline
    def setPasswordPolicies(value: String): Self = this.set("passwordPolicies", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePasswordPolicies: Self = this.set("passwordPolicies", js.undefined)
    @scala.inline
    def setPasswordProfile(value: PasswordProfile): Self = this.set("passwordProfile", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePasswordProfile: Self = this.set("passwordProfile", js.undefined)
    @scala.inline
    def setPastProjectsVarargs(value: String*): Self = this.set("pastProjects", js.Array(value :_*))
    @scala.inline
    def setPastProjects(value: js.Array[String]): Self = this.set("pastProjects", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePastProjects: Self = this.set("pastProjects", js.undefined)
    @scala.inline
    def setPeopleVarargs(value: Person*): Self = this.set("people", js.Array(value :_*))
    @scala.inline
    def setPeople(value: js.Array[Person]): Self = this.set("people", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePeople: Self = this.set("people", js.undefined)
    @scala.inline
    def setPhoto(value: ProfilePhoto): Self = this.set("photo", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhoto: Self = this.set("photo", js.undefined)
    @scala.inline
    def setPhotosVarargs(value: ProfilePhoto*): Self = this.set("photos", js.Array(value :_*))
    @scala.inline
    def setPhotos(value: js.Array[ProfilePhoto]): Self = this.set("photos", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhotos: Self = this.set("photos", js.undefined)
    @scala.inline
    def setPlanner(value: PlannerUser): Self = this.set("planner", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlanner: Self = this.set("planner", js.undefined)
    @scala.inline
    def setPostalCode(value: String): Self = this.set("postalCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePostalCode: Self = this.set("postalCode", js.undefined)
    @scala.inline
    def setPreferredLanguage(value: String): Self = this.set("preferredLanguage", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreferredLanguage: Self = this.set("preferredLanguage", js.undefined)
    @scala.inline
    def setPreferredName(value: String): Self = this.set("preferredName", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreferredName: Self = this.set("preferredName", js.undefined)
    @scala.inline
    def setProvisionedPlansVarargs(value: ProvisionedPlan*): Self = this.set("provisionedPlans", js.Array(value :_*))
    @scala.inline
    def setProvisionedPlans(value: js.Array[ProvisionedPlan]): Self = this.set("provisionedPlans", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProvisionedPlans: Self = this.set("provisionedPlans", js.undefined)
    @scala.inline
    def setProxyAddressesVarargs(value: String*): Self = this.set("proxyAddresses", js.Array(value :_*))
    @scala.inline
    def setProxyAddresses(value: js.Array[String]): Self = this.set("proxyAddresses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProxyAddresses: Self = this.set("proxyAddresses", js.undefined)
    @scala.inline
    def setRegisteredDevicesVarargs(value: DirectoryObject*): Self = this.set("registeredDevices", js.Array(value :_*))
    @scala.inline
    def setRegisteredDevices(value: js.Array[DirectoryObject]): Self = this.set("registeredDevices", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegisteredDevices: Self = this.set("registeredDevices", js.undefined)
    @scala.inline
    def setResponsibilitiesVarargs(value: String*): Self = this.set("responsibilities", js.Array(value :_*))
    @scala.inline
    def setResponsibilities(value: js.Array[String]): Self = this.set("responsibilities", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponsibilities: Self = this.set("responsibilities", js.undefined)
    @scala.inline
    def setSchoolsVarargs(value: String*): Self = this.set("schools", js.Array(value :_*))
    @scala.inline
    def setSchools(value: js.Array[String]): Self = this.set("schools", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSchools: Self = this.set("schools", js.undefined)
    @scala.inline
    def setSettings(value: UserSettings): Self = this.set("settings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSettings: Self = this.set("settings", js.undefined)
    @scala.inline
    def setShowInAddressList(value: Boolean): Self = this.set("showInAddressList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowInAddressList: Self = this.set("showInAddressList", js.undefined)
    @scala.inline
    def setSignInSessionsValidFromDateTime(value: String): Self = this.set("signInSessionsValidFromDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSignInSessionsValidFromDateTime: Self = this.set("signInSessionsValidFromDateTime", js.undefined)
    @scala.inline
    def setSkillsVarargs(value: String*): Self = this.set("skills", js.Array(value :_*))
    @scala.inline
    def setSkills(value: js.Array[String]): Self = this.set("skills", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkills: Self = this.set("skills", js.undefined)
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    @scala.inline
    def setStreetAddress(value: String): Self = this.set("streetAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStreetAddress: Self = this.set("streetAddress", js.undefined)
    @scala.inline
    def setSurname(value: String): Self = this.set("surname", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSurname: Self = this.set("surname", js.undefined)
    @scala.inline
    def setTransitiveMemberOfVarargs(value: DirectoryObject*): Self = this.set("transitiveMemberOf", js.Array(value :_*))
    @scala.inline
    def setTransitiveMemberOf(value: js.Array[DirectoryObject]): Self = this.set("transitiveMemberOf", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransitiveMemberOf: Self = this.set("transitiveMemberOf", js.undefined)
    @scala.inline
    def setUsageLocation(value: String): Self = this.set("usageLocation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsageLocation: Self = this.set("usageLocation", js.undefined)
    @scala.inline
    def setUserPrincipalName(value: String): Self = this.set("userPrincipalName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserPrincipalName: Self = this.set("userPrincipalName", js.undefined)
    @scala.inline
    def setUserType(value: String): Self = this.set("userType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserType: Self = this.set("userType", js.undefined)
  }
  
}

