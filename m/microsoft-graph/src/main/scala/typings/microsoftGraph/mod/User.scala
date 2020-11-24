package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait User extends DirectoryObject {
  
  // A freeform text entry field for the user to describe themselves.
  var aboutMe: js.UndefOr[NullableOption[String]] = js.native
  
  // true if the account is enabled; otherwise, false. This property is required when a user is created. Supports $filter.
  var accountEnabled: js.UndefOr[NullableOption[Boolean]] = js.native
  
  // The user's activities across devices. Read-only. Nullable.
  var activities: js.UndefOr[NullableOption[js.Array[UserActivity]]] = js.native
  
  /**
    * Sets the age group of the user. Allowed values: null, minor, notAdult and adult. Refer to the legal age group property
    * definitions for further information.
    */
  var ageGroup: js.UndefOr[NullableOption[String]] = js.native
  
  var appRoleAssignments: js.UndefOr[NullableOption[js.Array[AppRoleAssignment]]] = js.native
  
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
    * property. Read-only for users synced from on-premises directory.
    */
  var businessPhones: js.UndefOr[js.Array[String]] = js.native
  
  // The user's primary calendar. Read-only.
  var calendar: js.UndefOr[NullableOption[Calendar]] = js.native
  
  // The user's calendar groups. Read-only. Nullable.
  var calendarGroups: js.UndefOr[NullableOption[js.Array[CalendarGroup]]] = js.native
  
  // The calendar view for the calendar. Read-only. Nullable.
  var calendarView: js.UndefOr[NullableOption[js.Array[Event]]] = js.native
  
  // The user's calendars. Read-only. Nullable.
  var calendars: js.UndefOr[NullableOption[js.Array[Calendar]]] = js.native
  
  // The city in which the user is located. Supports $filter.
  var city: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * The company name which the user is associated. This property can be useful for describing the company that an external
    * user comes from. The maximum length of the company name is 64 chararcters.Returned only on $select.
    */
  var companyName: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * Sets whether consent has been obtained for minors. Allowed values: null, granted, denied and notRequired. Refer to the
    * legal age group property definitions for further information.
    */
  var consentProvidedForMinor: js.UndefOr[NullableOption[String]] = js.native
  
  // The user's contacts folders. Read-only. Nullable.
  var contactFolders: js.UndefOr[NullableOption[js.Array[ContactFolder]]] = js.native
  
  // The user's contacts. Read-only. Nullable.
  var contacts: js.UndefOr[NullableOption[js.Array[Contact]]] = js.native
  
  // The country/region in which the user is located; for example, 'US' or 'UK'. Supports $filter.
  var country: js.UndefOr[NullableOption[String]] = js.native
  
  // The created date of the user object.
  var createdDateTime: js.UndefOr[NullableOption[String]] = js.native
  
  // Directory objects that were created by the user. Read-only. Nullable.
  var createdObjects: js.UndefOr[NullableOption[js.Array[DirectoryObject]]] = js.native
  
  /**
    * Indicates whether the user account was created as a regular school or work account (null), an external account
    * (Invitation), a local account for an Azure Active Directory B2C tenant (LocalAccount) or self-service sign-up using
    * email verification (EmailVerified). Read-only.
    */
  var creationType: js.UndefOr[NullableOption[String]] = js.native
  
  // The name for the department in which the user works. Supports $filter.
  var department: js.UndefOr[NullableOption[String]] = js.native
  
  // The limit on the maximum number of devices that the user is permitted to enroll. Allowed values are 5 or 1000.
  var deviceEnrollmentLimit: js.UndefOr[Double] = js.native
  
  // The list of troubleshooting events for this user.
  var deviceManagementTroubleshootingEvents: js.UndefOr[NullableOption[js.Array[DeviceManagementTroubleshootingEvent]]] = js.native
  
  /**
    * The users and contacts that report to the user. (The users and contacts that have their manager property set to this
    * user.) Read-only. Nullable.
    */
  var directReports: js.UndefOr[NullableOption[js.Array[DirectoryObject]]] = js.native
  
  /**
    * The name displayed in the address book for the user. This is usually the combination of the user's first name, middle
    * initial and last name. This property is required when a user is created and it cannot be cleared during updates.
    * Supports $filter and $orderby.
    */
  var displayName: js.UndefOr[NullableOption[String]] = js.native
  
  // The user's OneDrive. Read-only.
  var drive: js.UndefOr[NullableOption[Drive]] = js.native
  
  // A collection of drives available for this user. Read-only.
  var drives: js.UndefOr[NullableOption[js.Array[Drive]]] = js.native
  
  // The employee identifier assigned to the user by the organization. Returned only on $select. Supports $filter.
  var employeeId: js.UndefOr[NullableOption[String]] = js.native
  
  // The user's events. Default is to show Events under the Default Calendar. Read-only. Nullable.
  var events: js.UndefOr[NullableOption[js.Array[Event]]] = js.native
  
  // The collection of open extensions defined for the user. Read-only. Nullable.
  var extensions: js.UndefOr[NullableOption[js.Array[Extension]]] = js.native
  
  /**
    * For an external user invited to the tenant using the invitation API, this property represents the invited user's
    * invitation status. For invited users, the state can be PendingAcceptance or Accepted, or null for all other users.
    * Returned only on $select. Supports $filter with the supported values. For example: $filter=externalUserState eq
    * 'PendingAcceptance'.
    */
  var externalUserState: js.UndefOr[NullableOption[String]] = js.native
  
  // Shows the timestamp for the latest change to the externalUserState property. Returned only on $select.
  var externalUserStateChangeDateTime: js.UndefOr[NullableOption[String]] = js.native
  
  // The fax number of the user.
  var faxNumber: js.UndefOr[NullableOption[String]] = js.native
  
  var followedSites: js.UndefOr[NullableOption[js.Array[Site]]] = js.native
  
  // The given name (first name) of the user. Supports $filter.
  var givenName: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * The hire date of the user. The Timestamp type represents date and time information using ISO 8601 format and is always
    * in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'. Returned only on
    * $select. Note: This property is specific to SharePoint Online. We recommend using the native employeeHireDate property
    * to set and update hire date values using Microsoft Graph APIs.
    */
  var hireDate: js.UndefOr[String] = js.native
  
  /**
    * Represents the identities that can be used to sign in to this user account. An identity can be provided by Microsoft
    * (also known as a local account), by organizations, or by social identity providers such as Facebook, Google, and
    * Microsoft, and tied to a user account. May contain multiple items with the same signInType value. Supports $filter.
    */
  var identities: js.UndefOr[NullableOption[js.Array[ObjectIdentity]]] = js.native
  
  // The instant message voice over IP (VOIP) session initiation protocol (SIP) addresses for the user. Read-only.
  var imAddresses: js.UndefOr[NullableOption[js.Array[String]]] = js.native
  
  /**
    * Relevance classification of the user's messages based on explicit designations which override inferred relevance or
    * importance.
    */
  var inferenceClassification: js.UndefOr[NullableOption[InferenceClassification]] = js.native
  
  // Read-only. Nullable.
  var insights: js.UndefOr[NullableOption[OfficeGraphInsights]] = js.native
  
  // A list for the user to describe their interests.
  var interests: js.UndefOr[NullableOption[js.Array[String]]] = js.native
  
  // Do not use – reserved for future use.
  var isResourceAccount: js.UndefOr[NullableOption[Boolean]] = js.native
  
  // The user's job title. Supports $filter.
  var jobTitle: js.UndefOr[NullableOption[String]] = js.native
  
  var joinedTeams: js.UndefOr[NullableOption[js.Array[Team]]] = js.native
  
  /**
    * The time when this Azure AD user last changed their password. The date and time information uses ISO 8601 format and is
    * always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'
    */
  var lastPasswordChangeDateTime: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * Used by enterprise applications to determine the legal age group of the user. This property is read-only and calculated
    * based on ageGroup and consentProvidedForMinor properties. Allowed values: null, minorWithOutParentalConsent,
    * minorWithParentalConsent, minorNoParentalConsentRequired, notAdult and adult. Refer to the legal age group property
    * definitions for further information.)
    */
  var legalAgeGroupClassification: js.UndefOr[NullableOption[String]] = js.native
  
  // State of license assignments for this user. Read-only.
  var licenseAssignmentStates: js.UndefOr[NullableOption[js.Array[LicenseAssignmentState]]] = js.native
  
  // A collection of this user's license details. Read-only.
  var licenseDetails: js.UndefOr[NullableOption[js.Array[LicenseDetails]]] = js.native
  
  // The SMTP address for the user, for example, 'jeff@contoso.onmicrosoft.com'. Supports $filter.
  var mail: js.UndefOr[NullableOption[String]] = js.native
  
  // The user's mail folders. Read-only. Nullable.
  var mailFolders: js.UndefOr[NullableOption[js.Array[MailFolder]]] = js.native
  
  // The mail alias for the user. This property must be specified when a user is created. Supports $filter.
  var mailNickname: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * Settings for the primary mailbox of the signed-in user. You can get or update settings for sending automatic replies to
    * incoming messages, locale and time zone.
    */
  var mailboxSettings: js.UndefOr[NullableOption[MailboxSettings]] = js.native
  
  // Zero or more managed app registrations that belong to the user.
  var managedAppRegistrations: js.UndefOr[NullableOption[js.Array[ManagedAppRegistration]]] = js.native
  
  // The managed devices associated with the user.
  var managedDevices: js.UndefOr[NullableOption[js.Array[ManagedDevice]]] = js.native
  
  // The user or contact that is this user's manager. Read-only. (HTTP Methods: GET, PUT, DELETE.)
  var manager: js.UndefOr[NullableOption[DirectoryObject]] = js.native
  
  // The groups and directory roles that the user is a member of. Read-only. Nullable.
  var memberOf: js.UndefOr[NullableOption[js.Array[DirectoryObject]]] = js.native
  
  // The messages in a mailbox or folder. Read-only. Nullable.
  var messages: js.UndefOr[NullableOption[js.Array[Message]]] = js.native
  
  // The primary cellular telephone number for the user. Read-only for users synced from on-premises directory.
  var mobilePhone: js.UndefOr[NullableOption[String]] = js.native
  
  // The URL for the user's personal site.
  var mySite: js.UndefOr[NullableOption[String]] = js.native
  
  var oauth2PermissionGrants: js.UndefOr[NullableOption[js.Array[OAuth2PermissionGrant]]] = js.native
  
  // The office location in the user's place of business.
  var officeLocation: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * Contains the on-premises Active Directory distinguished name or DN. The property is only populated for customers who
    * are synchronizing their on-premises directory to Azure Active Directory via Azure AD Connect. Read-only.
    */
  var onPremisesDistinguishedName: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * Contains the on-premises domainFQDN, also called dnsDomainName synchronized from the on-premises directory. The
    * property is only populated for customers who are synchronizing their on-premises directory to Azure Active Directory
    * via Azure AD Connect. Read-only.
    */
  var onPremisesDomainName: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * Contains extensionAttributes 1-15 for the user. Note that the individual extension attributes are neither selectable
    * nor filterable. For an onPremisesSyncEnabled user, the source of authority for this set of properties is the
    * on-premises and is read-only. For a cloud-only user (where onPremisesSyncEnabled is false), these properties may be set
    * during creation or update. These extension attributes are also known as Exchange custom attributes 1-15.
    */
  var onPremisesExtensionAttributes: js.UndefOr[NullableOption[OnPremisesExtensionAttributes]] = js.native
  
  /**
    * This property is used to associate an on-premises Active Directory user account to their Azure AD user object. This
    * property must be specified when creating a new user account in the Graph if you are using a federated domain for the
    * user's userPrincipalName (UPN) property. Important: The $ and _ characters cannot be used when specifying this
    * property. Supports $filter.
    */
  var onPremisesImmutableId: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * Indicates the last time at which the object was synced with the on-premises directory; for example:
    * '2013-02-16T03:04:54Z'. The Timestamp type represents date and time information using ISO 8601 format and is always in
    * UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'. Read-only.
    */
  var onPremisesLastSyncDateTime: js.UndefOr[NullableOption[String]] = js.native
  
  // Errors when using Microsoft synchronization product during provisioning.
  var onPremisesProvisioningErrors: js.UndefOr[NullableOption[js.Array[OnPremisesProvisioningError]]] = js.native
  
  /**
    * Contains the on-premises samAccountName synchronized from the on-premises directory. The property is only populated for
    * customers who are synchronizing their on-premises directory to Azure Active Directory via Azure AD Connect. Read-only.
    */
  var onPremisesSamAccountName: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * Contains the on-premises security identifier (SID) for the user that was synchronized from on-premises to the cloud.
    * Read-only.
    */
  var onPremisesSecurityIdentifier: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * true if this object is synced from an on-premises directory; false if this object was originally synced from an
    * on-premises directory but is no longer synced; null if this object has never been synced from an on-premises directory
    * (default). Read-only
    */
  var onPremisesSyncEnabled: js.UndefOr[NullableOption[Boolean]] = js.native
  
  /**
    * Contains the on-premises userPrincipalName synchronized from the on-premises directory. The property is only populated
    * for customers who are synchronizing their on-premises directory to Azure Active Directory via Azure AD Connect.
    * Read-only.
    */
  var onPremisesUserPrincipalName: js.UndefOr[NullableOption[String]] = js.native
  
  // Read-only.
  var onenote: js.UndefOr[NullableOption[Onenote]] = js.native
  
  var onlineMeetings: js.UndefOr[NullableOption[js.Array[OnlineMeeting]]] = js.native
  
  /**
    * A list of additional email addresses for the user; for example: ['bob@contoso.com', 'Robert@fabrikam.com']. Supports
    * $filter.
    */
  var otherMails: js.UndefOr[js.Array[String]] = js.native
  
  // Read-only.
  var outlook: js.UndefOr[NullableOption[OutlookUser]] = js.native
  
  // Devices that are owned by the user. Read-only. Nullable.
  var ownedDevices: js.UndefOr[NullableOption[js.Array[DirectoryObject]]] = js.native
  
  // Directory objects that are owned by the user. Read-only. Nullable.
  var ownedObjects: js.UndefOr[NullableOption[js.Array[DirectoryObject]]] = js.native
  
  /**
    * Specifies password policies for the user. This value is an enumeration with one possible value being
    * 'DisableStrongPassword', which allows weaker passwords than the default policy to be specified.
    * 'DisablePasswordExpiration' can also be specified. The two may be specified together; for example:
    * 'DisablePasswordExpiration, DisableStrongPassword'.
    */
  var passwordPolicies: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * Specifies the password profile for the user. The profile contains the user’s password. This property is required when a
    * user is created. The password in the profile must satisfy minimum requirements as specified by the passwordPolicies
    * property. By default, a strong password is required.
    */
  var passwordProfile: js.UndefOr[NullableOption[PasswordProfile]] = js.native
  
  // A list for the user to enumerate their past projects.
  var pastProjects: js.UndefOr[NullableOption[js.Array[String]]] = js.native
  
  // People that are relevant to the user. Read-only. Nullable.
  var people: js.UndefOr[NullableOption[js.Array[Person]]] = js.native
  
  // The user's profile photo. Read-only.
  var photo: js.UndefOr[NullableOption[ProfilePhoto]] = js.native
  
  var photos: js.UndefOr[NullableOption[js.Array[ProfilePhoto]]] = js.native
  
  // Entry-point to the Planner resource that might exist for a user. Read-only.
  var planner: js.UndefOr[NullableOption[PlannerUser]] = js.native
  
  /**
    * The postal code for the user's postal address. The postal code is specific to the user's country/region. In the United
    * States of America, this attribute contains the ZIP code.
    */
  var postalCode: js.UndefOr[NullableOption[String]] = js.native
  
  // The preferred language for the user. Should follow ISO 639-1 Code; for example 'en-US'.
  var preferredLanguage: js.UndefOr[NullableOption[String]] = js.native
  
  // The preferred name for the user.
  var preferredName: js.UndefOr[NullableOption[String]] = js.native
  
  // The plans that are provisioned for the user. Read-only. Not nullable.
  var provisionedPlans: js.UndefOr[js.Array[ProvisionedPlan]] = js.native
  
  /**
    * For example: ['SMTP: bob@contoso.com', 'smtp: bob@sales.contoso.com'] The any operator is required for filter
    * expressions on multi-valued properties. Read-only, Not nullable. Supports $filter.
    */
  var proxyAddresses: js.UndefOr[js.Array[String]] = js.native
  
  // Devices that are registered for the user. Read-only. Nullable.
  var registeredDevices: js.UndefOr[NullableOption[js.Array[DirectoryObject]]] = js.native
  
  // A list for the user to enumerate their responsibilities.
  var responsibilities: js.UndefOr[NullableOption[js.Array[String]]] = js.native
  
  // A list for the user to enumerate the schools they have attended.
  var schools: js.UndefOr[NullableOption[js.Array[String]]] = js.native
  
  var scopedRoleMemberOf: js.UndefOr[NullableOption[js.Array[ScopedRoleMembership]]] = js.native
  
  var settings: js.UndefOr[NullableOption[UserSettings]] = js.native
  
  /**
    * true if the Outlook global address list should contain this user, otherwise false. If not set, this will be treated as
    * true. For users invited through the invitation manager, this property will be set to false.
    */
  var showInAddressList: js.UndefOr[NullableOption[Boolean]] = js.native
  
  /**
    * Any refresh tokens or sessions tokens (session cookies) issued before this time are invalid, and applications will get
    * an error when using an invalid refresh or sessions token to acquire a delegated access token (to access APIs such as
    * Microsoft Graph). If this happens, the application will need to acquire a new refresh token by making a request to the
    * authorize endpoint. Read-only. Use revokeSignInSessions to reset.
    */
  var signInSessionsValidFromDateTime: js.UndefOr[NullableOption[String]] = js.native
  
  // A list for the user to enumerate their skills.
  var skills: js.UndefOr[NullableOption[js.Array[String]]] = js.native
  
  // The state or province in the user's address. Supports $filter.
  var state: js.UndefOr[NullableOption[String]] = js.native
  
  // The street address of the user's place of business.
  var streetAddress: js.UndefOr[NullableOption[String]] = js.native
  
  // The user's surname (family name or last name). Supports $filter.
  var surname: js.UndefOr[NullableOption[String]] = js.native
  
  var teamwork: js.UndefOr[NullableOption[UserTeamwork]] = js.native
  
  // Represents the To Do services available to a user.
  var todo: js.UndefOr[NullableOption[Todo]] = js.native
  
  var transitiveMemberOf: js.UndefOr[NullableOption[js.Array[DirectoryObject]]] = js.native
  
  /**
    * A two letter country code (ISO standard 3166). Required for users that will be assigned licenses due to legal
    * requirement to check for availability of services in countries. Examples include: 'US', 'JP', and 'GB'. Not nullable.
    * Supports $filter.
    */
  var usageLocation: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * The user principal name (UPN) of the user. The UPN is an Internet-style login name for the user based on the Internet
    * standard RFC 822. By convention, this should map to the user's email name. The general format is alias@domain, where
    * domain must be present in the tenant's collection of verified domains. This property is required when a user is
    * created. The verified domains for the tenant can be accessed from the verifiedDomains property of organization.
    * Supports $filter and $orderby.
    */
  var userPrincipalName: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * A string value that can be used to classify user types in your directory, such as 'Member' and 'Guest'. Supports
    * $filter.
    */
  var userType: js.UndefOr[NullableOption[String]] = js.native
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
    def setAboutMe(value: NullableOption[String]): Self = this.set("aboutMe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAboutMe: Self = this.set("aboutMe", js.undefined)
    
    @scala.inline
    def setAboutMeNull: Self = this.set("aboutMe", null)
    
    @scala.inline
    def setAccountEnabled(value: NullableOption[Boolean]): Self = this.set("accountEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountEnabled: Self = this.set("accountEnabled", js.undefined)
    
    @scala.inline
    def setAccountEnabledNull: Self = this.set("accountEnabled", null)
    
    @scala.inline
    def setActivitiesVarargs(value: UserActivity*): Self = this.set("activities", js.Array(value :_*))
    
    @scala.inline
    def setActivities(value: NullableOption[js.Array[UserActivity]]): Self = this.set("activities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActivities: Self = this.set("activities", js.undefined)
    
    @scala.inline
    def setActivitiesNull: Self = this.set("activities", null)
    
    @scala.inline
    def setAgeGroup(value: NullableOption[String]): Self = this.set("ageGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAgeGroup: Self = this.set("ageGroup", js.undefined)
    
    @scala.inline
    def setAgeGroupNull: Self = this.set("ageGroup", null)
    
    @scala.inline
    def setAppRoleAssignmentsVarargs(value: AppRoleAssignment*): Self = this.set("appRoleAssignments", js.Array(value :_*))
    
    @scala.inline
    def setAppRoleAssignments(value: NullableOption[js.Array[AppRoleAssignment]]): Self = this.set("appRoleAssignments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppRoleAssignments: Self = this.set("appRoleAssignments", js.undefined)
    
    @scala.inline
    def setAppRoleAssignmentsNull: Self = this.set("appRoleAssignments", null)
    
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
    def setCalendar(value: NullableOption[Calendar]): Self = this.set("calendar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCalendar: Self = this.set("calendar", js.undefined)
    
    @scala.inline
    def setCalendarNull: Self = this.set("calendar", null)
    
    @scala.inline
    def setCalendarGroupsVarargs(value: CalendarGroup*): Self = this.set("calendarGroups", js.Array(value :_*))
    
    @scala.inline
    def setCalendarGroups(value: NullableOption[js.Array[CalendarGroup]]): Self = this.set("calendarGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCalendarGroups: Self = this.set("calendarGroups", js.undefined)
    
    @scala.inline
    def setCalendarGroupsNull: Self = this.set("calendarGroups", null)
    
    @scala.inline
    def setCalendarViewVarargs(value: Event*): Self = this.set("calendarView", js.Array(value :_*))
    
    @scala.inline
    def setCalendarView(value: NullableOption[js.Array[Event]]): Self = this.set("calendarView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCalendarView: Self = this.set("calendarView", js.undefined)
    
    @scala.inline
    def setCalendarViewNull: Self = this.set("calendarView", null)
    
    @scala.inline
    def setCalendarsVarargs(value: Calendar*): Self = this.set("calendars", js.Array(value :_*))
    
    @scala.inline
    def setCalendars(value: NullableOption[js.Array[Calendar]]): Self = this.set("calendars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCalendars: Self = this.set("calendars", js.undefined)
    
    @scala.inline
    def setCalendarsNull: Self = this.set("calendars", null)
    
    @scala.inline
    def setCity(value: NullableOption[String]): Self = this.set("city", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCity: Self = this.set("city", js.undefined)
    
    @scala.inline
    def setCityNull: Self = this.set("city", null)
    
    @scala.inline
    def setCompanyName(value: NullableOption[String]): Self = this.set("companyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompanyName: Self = this.set("companyName", js.undefined)
    
    @scala.inline
    def setCompanyNameNull: Self = this.set("companyName", null)
    
    @scala.inline
    def setConsentProvidedForMinor(value: NullableOption[String]): Self = this.set("consentProvidedForMinor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConsentProvidedForMinor: Self = this.set("consentProvidedForMinor", js.undefined)
    
    @scala.inline
    def setConsentProvidedForMinorNull: Self = this.set("consentProvidedForMinor", null)
    
    @scala.inline
    def setContactFoldersVarargs(value: ContactFolder*): Self = this.set("contactFolders", js.Array(value :_*))
    
    @scala.inline
    def setContactFolders(value: NullableOption[js.Array[ContactFolder]]): Self = this.set("contactFolders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContactFolders: Self = this.set("contactFolders", js.undefined)
    
    @scala.inline
    def setContactFoldersNull: Self = this.set("contactFolders", null)
    
    @scala.inline
    def setContactsVarargs(value: Contact*): Self = this.set("contacts", js.Array(value :_*))
    
    @scala.inline
    def setContacts(value: NullableOption[js.Array[Contact]]): Self = this.set("contacts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContacts: Self = this.set("contacts", js.undefined)
    
    @scala.inline
    def setContactsNull: Self = this.set("contacts", null)
    
    @scala.inline
    def setCountry(value: NullableOption[String]): Self = this.set("country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCountry: Self = this.set("country", js.undefined)
    
    @scala.inline
    def setCountryNull: Self = this.set("country", null)
    
    @scala.inline
    def setCreatedDateTime(value: NullableOption[String]): Self = this.set("createdDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedDateTime: Self = this.set("createdDateTime", js.undefined)
    
    @scala.inline
    def setCreatedDateTimeNull: Self = this.set("createdDateTime", null)
    
    @scala.inline
    def setCreatedObjectsVarargs(value: DirectoryObject*): Self = this.set("createdObjects", js.Array(value :_*))
    
    @scala.inline
    def setCreatedObjects(value: NullableOption[js.Array[DirectoryObject]]): Self = this.set("createdObjects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedObjects: Self = this.set("createdObjects", js.undefined)
    
    @scala.inline
    def setCreatedObjectsNull: Self = this.set("createdObjects", null)
    
    @scala.inline
    def setCreationType(value: NullableOption[String]): Self = this.set("creationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationType: Self = this.set("creationType", js.undefined)
    
    @scala.inline
    def setCreationTypeNull: Self = this.set("creationType", null)
    
    @scala.inline
    def setDepartment(value: NullableOption[String]): Self = this.set("department", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDepartment: Self = this.set("department", js.undefined)
    
    @scala.inline
    def setDepartmentNull: Self = this.set("department", null)
    
    @scala.inline
    def setDeviceEnrollmentLimit(value: Double): Self = this.set("deviceEnrollmentLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceEnrollmentLimit: Self = this.set("deviceEnrollmentLimit", js.undefined)
    
    @scala.inline
    def setDeviceManagementTroubleshootingEventsVarargs(value: DeviceManagementTroubleshootingEvent*): Self = this.set("deviceManagementTroubleshootingEvents", js.Array(value :_*))
    
    @scala.inline
    def setDeviceManagementTroubleshootingEvents(value: NullableOption[js.Array[DeviceManagementTroubleshootingEvent]]): Self = this.set("deviceManagementTroubleshootingEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceManagementTroubleshootingEvents: Self = this.set("deviceManagementTroubleshootingEvents", js.undefined)
    
    @scala.inline
    def setDeviceManagementTroubleshootingEventsNull: Self = this.set("deviceManagementTroubleshootingEvents", null)
    
    @scala.inline
    def setDirectReportsVarargs(value: DirectoryObject*): Self = this.set("directReports", js.Array(value :_*))
    
    @scala.inline
    def setDirectReports(value: NullableOption[js.Array[DirectoryObject]]): Self = this.set("directReports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirectReports: Self = this.set("directReports", js.undefined)
    
    @scala.inline
    def setDirectReportsNull: Self = this.set("directReports", null)
    
    @scala.inline
    def setDisplayName(value: NullableOption[String]): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setDisplayNameNull: Self = this.set("displayName", null)
    
    @scala.inline
    def setDrive(value: NullableOption[Drive]): Self = this.set("drive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDrive: Self = this.set("drive", js.undefined)
    
    @scala.inline
    def setDriveNull: Self = this.set("drive", null)
    
    @scala.inline
    def setDrivesVarargs(value: Drive*): Self = this.set("drives", js.Array(value :_*))
    
    @scala.inline
    def setDrives(value: NullableOption[js.Array[Drive]]): Self = this.set("drives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDrives: Self = this.set("drives", js.undefined)
    
    @scala.inline
    def setDrivesNull: Self = this.set("drives", null)
    
    @scala.inline
    def setEmployeeId(value: NullableOption[String]): Self = this.set("employeeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmployeeId: Self = this.set("employeeId", js.undefined)
    
    @scala.inline
    def setEmployeeIdNull: Self = this.set("employeeId", null)
    
    @scala.inline
    def setEventsVarargs(value: Event*): Self = this.set("events", js.Array(value :_*))
    
    @scala.inline
    def setEvents(value: NullableOption[js.Array[Event]]): Self = this.set("events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvents: Self = this.set("events", js.undefined)
    
    @scala.inline
    def setEventsNull: Self = this.set("events", null)
    
    @scala.inline
    def setExtensionsVarargs(value: Extension*): Self = this.set("extensions", js.Array(value :_*))
    
    @scala.inline
    def setExtensions(value: NullableOption[js.Array[Extension]]): Self = this.set("extensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtensions: Self = this.set("extensions", js.undefined)
    
    @scala.inline
    def setExtensionsNull: Self = this.set("extensions", null)
    
    @scala.inline
    def setExternalUserState(value: NullableOption[String]): Self = this.set("externalUserState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExternalUserState: Self = this.set("externalUserState", js.undefined)
    
    @scala.inline
    def setExternalUserStateNull: Self = this.set("externalUserState", null)
    
    @scala.inline
    def setExternalUserStateChangeDateTime(value: NullableOption[String]): Self = this.set("externalUserStateChangeDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExternalUserStateChangeDateTime: Self = this.set("externalUserStateChangeDateTime", js.undefined)
    
    @scala.inline
    def setExternalUserStateChangeDateTimeNull: Self = this.set("externalUserStateChangeDateTime", null)
    
    @scala.inline
    def setFaxNumber(value: NullableOption[String]): Self = this.set("faxNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFaxNumber: Self = this.set("faxNumber", js.undefined)
    
    @scala.inline
    def setFaxNumberNull: Self = this.set("faxNumber", null)
    
    @scala.inline
    def setFollowedSitesVarargs(value: Site*): Self = this.set("followedSites", js.Array(value :_*))
    
    @scala.inline
    def setFollowedSites(value: NullableOption[js.Array[Site]]): Self = this.set("followedSites", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFollowedSites: Self = this.set("followedSites", js.undefined)
    
    @scala.inline
    def setFollowedSitesNull: Self = this.set("followedSites", null)
    
    @scala.inline
    def setGivenName(value: NullableOption[String]): Self = this.set("givenName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGivenName: Self = this.set("givenName", js.undefined)
    
    @scala.inline
    def setGivenNameNull: Self = this.set("givenName", null)
    
    @scala.inline
    def setHireDate(value: String): Self = this.set("hireDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHireDate: Self = this.set("hireDate", js.undefined)
    
    @scala.inline
    def setIdentitiesVarargs(value: ObjectIdentity*): Self = this.set("identities", js.Array(value :_*))
    
    @scala.inline
    def setIdentities(value: NullableOption[js.Array[ObjectIdentity]]): Self = this.set("identities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdentities: Self = this.set("identities", js.undefined)
    
    @scala.inline
    def setIdentitiesNull: Self = this.set("identities", null)
    
    @scala.inline
    def setImAddressesVarargs(value: String*): Self = this.set("imAddresses", js.Array(value :_*))
    
    @scala.inline
    def setImAddresses(value: NullableOption[js.Array[String]]): Self = this.set("imAddresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImAddresses: Self = this.set("imAddresses", js.undefined)
    
    @scala.inline
    def setImAddressesNull: Self = this.set("imAddresses", null)
    
    @scala.inline
    def setInferenceClassification(value: NullableOption[InferenceClassification]): Self = this.set("inferenceClassification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInferenceClassification: Self = this.set("inferenceClassification", js.undefined)
    
    @scala.inline
    def setInferenceClassificationNull: Self = this.set("inferenceClassification", null)
    
    @scala.inline
    def setInsights(value: NullableOption[OfficeGraphInsights]): Self = this.set("insights", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsights: Self = this.set("insights", js.undefined)
    
    @scala.inline
    def setInsightsNull: Self = this.set("insights", null)
    
    @scala.inline
    def setInterestsVarargs(value: String*): Self = this.set("interests", js.Array(value :_*))
    
    @scala.inline
    def setInterests(value: NullableOption[js.Array[String]]): Self = this.set("interests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInterests: Self = this.set("interests", js.undefined)
    
    @scala.inline
    def setInterestsNull: Self = this.set("interests", null)
    
    @scala.inline
    def setIsResourceAccount(value: NullableOption[Boolean]): Self = this.set("isResourceAccount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsResourceAccount: Self = this.set("isResourceAccount", js.undefined)
    
    @scala.inline
    def setIsResourceAccountNull: Self = this.set("isResourceAccount", null)
    
    @scala.inline
    def setJobTitle(value: NullableOption[String]): Self = this.set("jobTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJobTitle: Self = this.set("jobTitle", js.undefined)
    
    @scala.inline
    def setJobTitleNull: Self = this.set("jobTitle", null)
    
    @scala.inline
    def setJoinedTeamsVarargs(value: Team*): Self = this.set("joinedTeams", js.Array(value :_*))
    
    @scala.inline
    def setJoinedTeams(value: NullableOption[js.Array[Team]]): Self = this.set("joinedTeams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJoinedTeams: Self = this.set("joinedTeams", js.undefined)
    
    @scala.inline
    def setJoinedTeamsNull: Self = this.set("joinedTeams", null)
    
    @scala.inline
    def setLastPasswordChangeDateTime(value: NullableOption[String]): Self = this.set("lastPasswordChangeDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastPasswordChangeDateTime: Self = this.set("lastPasswordChangeDateTime", js.undefined)
    
    @scala.inline
    def setLastPasswordChangeDateTimeNull: Self = this.set("lastPasswordChangeDateTime", null)
    
    @scala.inline
    def setLegalAgeGroupClassification(value: NullableOption[String]): Self = this.set("legalAgeGroupClassification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLegalAgeGroupClassification: Self = this.set("legalAgeGroupClassification", js.undefined)
    
    @scala.inline
    def setLegalAgeGroupClassificationNull: Self = this.set("legalAgeGroupClassification", null)
    
    @scala.inline
    def setLicenseAssignmentStatesVarargs(value: LicenseAssignmentState*): Self = this.set("licenseAssignmentStates", js.Array(value :_*))
    
    @scala.inline
    def setLicenseAssignmentStates(value: NullableOption[js.Array[LicenseAssignmentState]]): Self = this.set("licenseAssignmentStates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLicenseAssignmentStates: Self = this.set("licenseAssignmentStates", js.undefined)
    
    @scala.inline
    def setLicenseAssignmentStatesNull: Self = this.set("licenseAssignmentStates", null)
    
    @scala.inline
    def setLicenseDetailsVarargs(value: LicenseDetails*): Self = this.set("licenseDetails", js.Array(value :_*))
    
    @scala.inline
    def setLicenseDetails(value: NullableOption[js.Array[LicenseDetails]]): Self = this.set("licenseDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLicenseDetails: Self = this.set("licenseDetails", js.undefined)
    
    @scala.inline
    def setLicenseDetailsNull: Self = this.set("licenseDetails", null)
    
    @scala.inline
    def setMail(value: NullableOption[String]): Self = this.set("mail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMail: Self = this.set("mail", js.undefined)
    
    @scala.inline
    def setMailNull: Self = this.set("mail", null)
    
    @scala.inline
    def setMailFoldersVarargs(value: MailFolder*): Self = this.set("mailFolders", js.Array(value :_*))
    
    @scala.inline
    def setMailFolders(value: NullableOption[js.Array[MailFolder]]): Self = this.set("mailFolders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMailFolders: Self = this.set("mailFolders", js.undefined)
    
    @scala.inline
    def setMailFoldersNull: Self = this.set("mailFolders", null)
    
    @scala.inline
    def setMailNickname(value: NullableOption[String]): Self = this.set("mailNickname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMailNickname: Self = this.set("mailNickname", js.undefined)
    
    @scala.inline
    def setMailNicknameNull: Self = this.set("mailNickname", null)
    
    @scala.inline
    def setMailboxSettings(value: NullableOption[MailboxSettings]): Self = this.set("mailboxSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMailboxSettings: Self = this.set("mailboxSettings", js.undefined)
    
    @scala.inline
    def setMailboxSettingsNull: Self = this.set("mailboxSettings", null)
    
    @scala.inline
    def setManagedAppRegistrationsVarargs(value: ManagedAppRegistration*): Self = this.set("managedAppRegistrations", js.Array(value :_*))
    
    @scala.inline
    def setManagedAppRegistrations(value: NullableOption[js.Array[ManagedAppRegistration]]): Self = this.set("managedAppRegistrations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManagedAppRegistrations: Self = this.set("managedAppRegistrations", js.undefined)
    
    @scala.inline
    def setManagedAppRegistrationsNull: Self = this.set("managedAppRegistrations", null)
    
    @scala.inline
    def setManagedDevicesVarargs(value: ManagedDevice*): Self = this.set("managedDevices", js.Array(value :_*))
    
    @scala.inline
    def setManagedDevices(value: NullableOption[js.Array[ManagedDevice]]): Self = this.set("managedDevices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManagedDevices: Self = this.set("managedDevices", js.undefined)
    
    @scala.inline
    def setManagedDevicesNull: Self = this.set("managedDevices", null)
    
    @scala.inline
    def setManager(value: NullableOption[DirectoryObject]): Self = this.set("manager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManager: Self = this.set("manager", js.undefined)
    
    @scala.inline
    def setManagerNull: Self = this.set("manager", null)
    
    @scala.inline
    def setMemberOfVarargs(value: DirectoryObject*): Self = this.set("memberOf", js.Array(value :_*))
    
    @scala.inline
    def setMemberOf(value: NullableOption[js.Array[DirectoryObject]]): Self = this.set("memberOf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMemberOf: Self = this.set("memberOf", js.undefined)
    
    @scala.inline
    def setMemberOfNull: Self = this.set("memberOf", null)
    
    @scala.inline
    def setMessagesVarargs(value: Message*): Self = this.set("messages", js.Array(value :_*))
    
    @scala.inline
    def setMessages(value: NullableOption[js.Array[Message]]): Self = this.set("messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessages: Self = this.set("messages", js.undefined)
    
    @scala.inline
    def setMessagesNull: Self = this.set("messages", null)
    
    @scala.inline
    def setMobilePhone(value: NullableOption[String]): Self = this.set("mobilePhone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMobilePhone: Self = this.set("mobilePhone", js.undefined)
    
    @scala.inline
    def setMobilePhoneNull: Self = this.set("mobilePhone", null)
    
    @scala.inline
    def setMySite(value: NullableOption[String]): Self = this.set("mySite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMySite: Self = this.set("mySite", js.undefined)
    
    @scala.inline
    def setMySiteNull: Self = this.set("mySite", null)
    
    @scala.inline
    def setOauth2PermissionGrantsVarargs(value: OAuth2PermissionGrant*): Self = this.set("oauth2PermissionGrants", js.Array(value :_*))
    
    @scala.inline
    def setOauth2PermissionGrants(value: NullableOption[js.Array[OAuth2PermissionGrant]]): Self = this.set("oauth2PermissionGrants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOauth2PermissionGrants: Self = this.set("oauth2PermissionGrants", js.undefined)
    
    @scala.inline
    def setOauth2PermissionGrantsNull: Self = this.set("oauth2PermissionGrants", null)
    
    @scala.inline
    def setOfficeLocation(value: NullableOption[String]): Self = this.set("officeLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOfficeLocation: Self = this.set("officeLocation", js.undefined)
    
    @scala.inline
    def setOfficeLocationNull: Self = this.set("officeLocation", null)
    
    @scala.inline
    def setOnPremisesDistinguishedName(value: NullableOption[String]): Self = this.set("onPremisesDistinguishedName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnPremisesDistinguishedName: Self = this.set("onPremisesDistinguishedName", js.undefined)
    
    @scala.inline
    def setOnPremisesDistinguishedNameNull: Self = this.set("onPremisesDistinguishedName", null)
    
    @scala.inline
    def setOnPremisesDomainName(value: NullableOption[String]): Self = this.set("onPremisesDomainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnPremisesDomainName: Self = this.set("onPremisesDomainName", js.undefined)
    
    @scala.inline
    def setOnPremisesDomainNameNull: Self = this.set("onPremisesDomainName", null)
    
    @scala.inline
    def setOnPremisesExtensionAttributes(value: NullableOption[OnPremisesExtensionAttributes]): Self = this.set("onPremisesExtensionAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnPremisesExtensionAttributes: Self = this.set("onPremisesExtensionAttributes", js.undefined)
    
    @scala.inline
    def setOnPremisesExtensionAttributesNull: Self = this.set("onPremisesExtensionAttributes", null)
    
    @scala.inline
    def setOnPremisesImmutableId(value: NullableOption[String]): Self = this.set("onPremisesImmutableId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnPremisesImmutableId: Self = this.set("onPremisesImmutableId", js.undefined)
    
    @scala.inline
    def setOnPremisesImmutableIdNull: Self = this.set("onPremisesImmutableId", null)
    
    @scala.inline
    def setOnPremisesLastSyncDateTime(value: NullableOption[String]): Self = this.set("onPremisesLastSyncDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnPremisesLastSyncDateTime: Self = this.set("onPremisesLastSyncDateTime", js.undefined)
    
    @scala.inline
    def setOnPremisesLastSyncDateTimeNull: Self = this.set("onPremisesLastSyncDateTime", null)
    
    @scala.inline
    def setOnPremisesProvisioningErrorsVarargs(value: OnPremisesProvisioningError*): Self = this.set("onPremisesProvisioningErrors", js.Array(value :_*))
    
    @scala.inline
    def setOnPremisesProvisioningErrors(value: NullableOption[js.Array[OnPremisesProvisioningError]]): Self = this.set("onPremisesProvisioningErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnPremisesProvisioningErrors: Self = this.set("onPremisesProvisioningErrors", js.undefined)
    
    @scala.inline
    def setOnPremisesProvisioningErrorsNull: Self = this.set("onPremisesProvisioningErrors", null)
    
    @scala.inline
    def setOnPremisesSamAccountName(value: NullableOption[String]): Self = this.set("onPremisesSamAccountName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnPremisesSamAccountName: Self = this.set("onPremisesSamAccountName", js.undefined)
    
    @scala.inline
    def setOnPremisesSamAccountNameNull: Self = this.set("onPremisesSamAccountName", null)
    
    @scala.inline
    def setOnPremisesSecurityIdentifier(value: NullableOption[String]): Self = this.set("onPremisesSecurityIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnPremisesSecurityIdentifier: Self = this.set("onPremisesSecurityIdentifier", js.undefined)
    
    @scala.inline
    def setOnPremisesSecurityIdentifierNull: Self = this.set("onPremisesSecurityIdentifier", null)
    
    @scala.inline
    def setOnPremisesSyncEnabled(value: NullableOption[Boolean]): Self = this.set("onPremisesSyncEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnPremisesSyncEnabled: Self = this.set("onPremisesSyncEnabled", js.undefined)
    
    @scala.inline
    def setOnPremisesSyncEnabledNull: Self = this.set("onPremisesSyncEnabled", null)
    
    @scala.inline
    def setOnPremisesUserPrincipalName(value: NullableOption[String]): Self = this.set("onPremisesUserPrincipalName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnPremisesUserPrincipalName: Self = this.set("onPremisesUserPrincipalName", js.undefined)
    
    @scala.inline
    def setOnPremisesUserPrincipalNameNull: Self = this.set("onPremisesUserPrincipalName", null)
    
    @scala.inline
    def setOnenote(value: NullableOption[Onenote]): Self = this.set("onenote", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnenote: Self = this.set("onenote", js.undefined)
    
    @scala.inline
    def setOnenoteNull: Self = this.set("onenote", null)
    
    @scala.inline
    def setOnlineMeetingsVarargs(value: OnlineMeeting*): Self = this.set("onlineMeetings", js.Array(value :_*))
    
    @scala.inline
    def setOnlineMeetings(value: NullableOption[js.Array[OnlineMeeting]]): Self = this.set("onlineMeetings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnlineMeetings: Self = this.set("onlineMeetings", js.undefined)
    
    @scala.inline
    def setOnlineMeetingsNull: Self = this.set("onlineMeetings", null)
    
    @scala.inline
    def setOtherMailsVarargs(value: String*): Self = this.set("otherMails", js.Array(value :_*))
    
    @scala.inline
    def setOtherMails(value: js.Array[String]): Self = this.set("otherMails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOtherMails: Self = this.set("otherMails", js.undefined)
    
    @scala.inline
    def setOutlook(value: NullableOption[OutlookUser]): Self = this.set("outlook", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutlook: Self = this.set("outlook", js.undefined)
    
    @scala.inline
    def setOutlookNull: Self = this.set("outlook", null)
    
    @scala.inline
    def setOwnedDevicesVarargs(value: DirectoryObject*): Self = this.set("ownedDevices", js.Array(value :_*))
    
    @scala.inline
    def setOwnedDevices(value: NullableOption[js.Array[DirectoryObject]]): Self = this.set("ownedDevices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwnedDevices: Self = this.set("ownedDevices", js.undefined)
    
    @scala.inline
    def setOwnedDevicesNull: Self = this.set("ownedDevices", null)
    
    @scala.inline
    def setOwnedObjectsVarargs(value: DirectoryObject*): Self = this.set("ownedObjects", js.Array(value :_*))
    
    @scala.inline
    def setOwnedObjects(value: NullableOption[js.Array[DirectoryObject]]): Self = this.set("ownedObjects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwnedObjects: Self = this.set("ownedObjects", js.undefined)
    
    @scala.inline
    def setOwnedObjectsNull: Self = this.set("ownedObjects", null)
    
    @scala.inline
    def setPasswordPolicies(value: NullableOption[String]): Self = this.set("passwordPolicies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePasswordPolicies: Self = this.set("passwordPolicies", js.undefined)
    
    @scala.inline
    def setPasswordPoliciesNull: Self = this.set("passwordPolicies", null)
    
    @scala.inline
    def setPasswordProfile(value: NullableOption[PasswordProfile]): Self = this.set("passwordProfile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePasswordProfile: Self = this.set("passwordProfile", js.undefined)
    
    @scala.inline
    def setPasswordProfileNull: Self = this.set("passwordProfile", null)
    
    @scala.inline
    def setPastProjectsVarargs(value: String*): Self = this.set("pastProjects", js.Array(value :_*))
    
    @scala.inline
    def setPastProjects(value: NullableOption[js.Array[String]]): Self = this.set("pastProjects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePastProjects: Self = this.set("pastProjects", js.undefined)
    
    @scala.inline
    def setPastProjectsNull: Self = this.set("pastProjects", null)
    
    @scala.inline
    def setPeopleVarargs(value: Person*): Self = this.set("people", js.Array(value :_*))
    
    @scala.inline
    def setPeople(value: NullableOption[js.Array[Person]]): Self = this.set("people", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePeople: Self = this.set("people", js.undefined)
    
    @scala.inline
    def setPeopleNull: Self = this.set("people", null)
    
    @scala.inline
    def setPhoto(value: NullableOption[ProfilePhoto]): Self = this.set("photo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhoto: Self = this.set("photo", js.undefined)
    
    @scala.inline
    def setPhotoNull: Self = this.set("photo", null)
    
    @scala.inline
    def setPhotosVarargs(value: ProfilePhoto*): Self = this.set("photos", js.Array(value :_*))
    
    @scala.inline
    def setPhotos(value: NullableOption[js.Array[ProfilePhoto]]): Self = this.set("photos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhotos: Self = this.set("photos", js.undefined)
    
    @scala.inline
    def setPhotosNull: Self = this.set("photos", null)
    
    @scala.inline
    def setPlanner(value: NullableOption[PlannerUser]): Self = this.set("planner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlanner: Self = this.set("planner", js.undefined)
    
    @scala.inline
    def setPlannerNull: Self = this.set("planner", null)
    
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
    def setPreferredName(value: NullableOption[String]): Self = this.set("preferredName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreferredName: Self = this.set("preferredName", js.undefined)
    
    @scala.inline
    def setPreferredNameNull: Self = this.set("preferredName", null)
    
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
    def setRegisteredDevices(value: NullableOption[js.Array[DirectoryObject]]): Self = this.set("registeredDevices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegisteredDevices: Self = this.set("registeredDevices", js.undefined)
    
    @scala.inline
    def setRegisteredDevicesNull: Self = this.set("registeredDevices", null)
    
    @scala.inline
    def setResponsibilitiesVarargs(value: String*): Self = this.set("responsibilities", js.Array(value :_*))
    
    @scala.inline
    def setResponsibilities(value: NullableOption[js.Array[String]]): Self = this.set("responsibilities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponsibilities: Self = this.set("responsibilities", js.undefined)
    
    @scala.inline
    def setResponsibilitiesNull: Self = this.set("responsibilities", null)
    
    @scala.inline
    def setSchoolsVarargs(value: String*): Self = this.set("schools", js.Array(value :_*))
    
    @scala.inline
    def setSchools(value: NullableOption[js.Array[String]]): Self = this.set("schools", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchools: Self = this.set("schools", js.undefined)
    
    @scala.inline
    def setSchoolsNull: Self = this.set("schools", null)
    
    @scala.inline
    def setScopedRoleMemberOfVarargs(value: ScopedRoleMembership*): Self = this.set("scopedRoleMemberOf", js.Array(value :_*))
    
    @scala.inline
    def setScopedRoleMemberOf(value: NullableOption[js.Array[ScopedRoleMembership]]): Self = this.set("scopedRoleMemberOf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScopedRoleMemberOf: Self = this.set("scopedRoleMemberOf", js.undefined)
    
    @scala.inline
    def setScopedRoleMemberOfNull: Self = this.set("scopedRoleMemberOf", null)
    
    @scala.inline
    def setSettings(value: NullableOption[UserSettings]): Self = this.set("settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSettings: Self = this.set("settings", js.undefined)
    
    @scala.inline
    def setSettingsNull: Self = this.set("settings", null)
    
    @scala.inline
    def setShowInAddressList(value: NullableOption[Boolean]): Self = this.set("showInAddressList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowInAddressList: Self = this.set("showInAddressList", js.undefined)
    
    @scala.inline
    def setShowInAddressListNull: Self = this.set("showInAddressList", null)
    
    @scala.inline
    def setSignInSessionsValidFromDateTime(value: NullableOption[String]): Self = this.set("signInSessionsValidFromDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignInSessionsValidFromDateTime: Self = this.set("signInSessionsValidFromDateTime", js.undefined)
    
    @scala.inline
    def setSignInSessionsValidFromDateTimeNull: Self = this.set("signInSessionsValidFromDateTime", null)
    
    @scala.inline
    def setSkillsVarargs(value: String*): Self = this.set("skills", js.Array(value :_*))
    
    @scala.inline
    def setSkills(value: NullableOption[js.Array[String]]): Self = this.set("skills", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkills: Self = this.set("skills", js.undefined)
    
    @scala.inline
    def setSkillsNull: Self = this.set("skills", null)
    
    @scala.inline
    def setState(value: NullableOption[String]): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    
    @scala.inline
    def setStateNull: Self = this.set("state", null)
    
    @scala.inline
    def setStreetAddress(value: NullableOption[String]): Self = this.set("streetAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStreetAddress: Self = this.set("streetAddress", js.undefined)
    
    @scala.inline
    def setStreetAddressNull: Self = this.set("streetAddress", null)
    
    @scala.inline
    def setSurname(value: NullableOption[String]): Self = this.set("surname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSurname: Self = this.set("surname", js.undefined)
    
    @scala.inline
    def setSurnameNull: Self = this.set("surname", null)
    
    @scala.inline
    def setTeamwork(value: NullableOption[UserTeamwork]): Self = this.set("teamwork", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTeamwork: Self = this.set("teamwork", js.undefined)
    
    @scala.inline
    def setTeamworkNull: Self = this.set("teamwork", null)
    
    @scala.inline
    def setTodo(value: NullableOption[Todo]): Self = this.set("todo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTodo: Self = this.set("todo", js.undefined)
    
    @scala.inline
    def setTodoNull: Self = this.set("todo", null)
    
    @scala.inline
    def setTransitiveMemberOfVarargs(value: DirectoryObject*): Self = this.set("transitiveMemberOf", js.Array(value :_*))
    
    @scala.inline
    def setTransitiveMemberOf(value: NullableOption[js.Array[DirectoryObject]]): Self = this.set("transitiveMemberOf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransitiveMemberOf: Self = this.set("transitiveMemberOf", js.undefined)
    
    @scala.inline
    def setTransitiveMemberOfNull: Self = this.set("transitiveMemberOf", null)
    
    @scala.inline
    def setUsageLocation(value: NullableOption[String]): Self = this.set("usageLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsageLocation: Self = this.set("usageLocation", js.undefined)
    
    @scala.inline
    def setUsageLocationNull: Self = this.set("usageLocation", null)
    
    @scala.inline
    def setUserPrincipalName(value: NullableOption[String]): Self = this.set("userPrincipalName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserPrincipalName: Self = this.set("userPrincipalName", js.undefined)
    
    @scala.inline
    def setUserPrincipalNameNull: Self = this.set("userPrincipalName", null)
    
    @scala.inline
    def setUserType(value: NullableOption[String]): Self = this.set("userType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserType: Self = this.set("userType", js.undefined)
    
    @scala.inline
    def setUserTypeNull: Self = this.set("userType", null)
  }
}
