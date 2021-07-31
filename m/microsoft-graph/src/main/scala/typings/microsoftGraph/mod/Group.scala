package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Group
  extends StObject
     with DirectoryObject {
  
  /**
    * The list of users or groups that are allowed to create post's or calendar events in this group. If this list is
    * non-empty then only users or groups listed here are allowed to post.
    */
  var acceptedSenders: js.UndefOr[NullableOption[js.Array[DirectoryObject]]] = js.undefined
  
  /**
    * Indicates if people external to the organization can send messages to the group. Default value is false. Returned only
    * on $select.
    */
  var allowExternalSenders: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  var appRoleAssignments: js.UndefOr[NullableOption[js.Array[AppRoleAssignment]]] = js.undefined
  
  /**
    * The list of sensitivity label pairs (label ID, label name) associated with an Microsoft 365 group. Returned only on
    * $select. Read-only.
    */
  var assignedLabels: js.UndefOr[NullableOption[js.Array[AssignedLabel]]] = js.undefined
  
  // The licenses that are assigned to the group. Returned only on $select. Read-only.
  var assignedLicenses: js.UndefOr[NullableOption[js.Array[AssignedLicense]]] = js.undefined
  
  /**
    * Indicates if new members added to the group will be auto-subscribed to receive email notifications. You can set this
    * property in a PATCH request for the group; do not set it in the initial POST request that creates the group. Default
    * value is false. Returned only on $select.
    */
  var autoSubscribeNewMembers: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // The group's calendar. Read-only.
  var calendar: js.UndefOr[NullableOption[Calendar]] = js.undefined
  
  // The calendar view for the calendar. Read-only.
  var calendarView: js.UndefOr[NullableOption[js.Array[Event]]] = js.undefined
  
  /**
    * Describes a classification for the group (such as low, medium or high business impact). Valid values for this property
    * are defined by creating a ClassificationList setting value, based on the template definition.Returned by default.
    */
  var classification: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The group's conversations.
  var conversations: js.UndefOr[NullableOption[js.Array[Conversation]]] = js.undefined
  
  /**
    * Timestamp of when the group was created. The value cannot be modified and is automatically populated when the group is
    * created. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For
    * example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'. Returned by default. Read-only.
    */
  var createdDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The user (or application) that created the group. NOTE: This is not set if the user is an administrator. Read-only.
  var createdOnBehalfOf: js.UndefOr[NullableOption[DirectoryObject]] = js.undefined
  
  // An optional description for the group. Returned by default.
  var description: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * The display name for the group. This property is required when a group is created and cannot be cleared during updates.
    * Returned by default. Supports $filter and $orderby.
    */
  var displayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The group's default drive. Read-only.
  var drive: js.UndefOr[NullableOption[Drive]] = js.undefined
  
  // The group's drives. Read-only.
  var drives: js.UndefOr[NullableOption[js.Array[Drive]]] = js.undefined
  
  // The group's calendar events.
  var events: js.UndefOr[NullableOption[js.Array[Event]]] = js.undefined
  
  /**
    * Timestamp of when the group is set to expire. The value cannot be modified and is automatically populated when the
    * group is created. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC
    * time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'. Returned by default.
    * Read-only.
    */
  var expirationDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The collection of open extensions defined for the group. Read-only. Nullable.
  var extensions: js.UndefOr[NullableOption[js.Array[Extension]]] = js.undefined
  
  // The collection of lifecycle policies for this group. Read-only. Nullable.
  var groupLifecyclePolicies: js.UndefOr[NullableOption[js.Array[GroupLifecyclePolicy]]] = js.undefined
  
  /**
    * Specifies the group type and its membership. If the collection contains Unified, the group is a Microsoft 365 group;
    * otherwise, it's either a security group or distribution group. For details, see groups overview.If the collection
    * includes DynamicMembership, the group has dynamic membership; otherwise, membership is static. Returned by default.
    * Supports $filter.
    */
  var groupTypes: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Indicates whether there are members in this group that have license errors from its group-based license assignment.
    * This property is never returned on a GET operation. You can use it as a $filter argument to get groups that have
    * members with license errors (that is, filter for this property being true). See an example.
    */
  var hasMembersWithLicenseErrors: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  /**
    * True if the group is not displayed in certain parts of the Outlook UI: the Address Book, address lists for selecting
    * message recipients, and the Browse Groups dialog for searching groups; otherwise, false. Default value is false.
    * Returned only on $select.
    */
  var hideFromAddressLists: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  /**
    * True if the group is not displayed in Outlook clients, such as Outlook for Windows and Outlook on the web; otherwise,
    * false. Default value is false. Returned only on $select.
    */
  var hideFromOutlookClients: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  var isArchived: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  /**
    * Indicates whether the signed-in user is subscribed to receive email conversations. Default value is true. Returned only
    * on $select.
    */
  var isSubscribedByMail: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  /**
    * Indicates status of the group license assignment to all members of the group. Default value is false. Read-only.
    * Possible values: QueuedForProcessing, ProcessingInProgress, and ProcessingComplete.Returned only on $select. Read-only.
    */
  var licenseProcessingState: js.UndefOr[NullableOption[LicenseProcessingState]] = js.undefined
  
  /**
    * The SMTP address for the group, for example, 'serviceadmins@contoso.onmicrosoft.com'. Returned by default. Read-only.
    * Supports $filter.
    */
  var mail: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Specifies whether the group is mail-enabled. Returned by default.
  var mailEnabled: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  var mailNickname: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Groups that this group is a member of. HTTP Methods: GET (supported for all groups). Read-only. Nullable.
  var memberOf: js.UndefOr[NullableOption[js.Array[DirectoryObject]]] = js.undefined
  
  /**
    * Users and groups that are members of this group. HTTP Methods: GET (supported for all groups), POST (supported for
    * Microsoft 365 groups, security groups and mail-enabled security groups), DELETE (supported for Microsoft 365 groups and
    * security groups) Nullable.
    */
  var members: js.UndefOr[NullableOption[js.Array[DirectoryObject]]] = js.undefined
  
  // A list of group members with license errors from this group-based license assignment. Read-only.
  var membersWithLicenseErrors: js.UndefOr[NullableOption[js.Array[DirectoryObject]]] = js.undefined
  
  /**
    * The rule that determines members for this group if the group is a dynamic group (groupTypes contains
    * DynamicMembership). For more information about the syntax of the membership rule, see Membership Rules syntax. Returned
    * by default.
    */
  var membershipRule: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Indicates whether the dynamic membership processing is on or paused. Possible values are 'On' or 'Paused'. Returned by
    * default.
    */
  var membershipRuleProcessingState: js.UndefOr[NullableOption[String]] = js.undefined
  
  var onPremisesDomainName: js.UndefOr[NullableOption[String]] = js.undefined
  
  var onPremisesLastSyncDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  var onPremisesNetBiosName: js.UndefOr[NullableOption[String]] = js.undefined
  
  var onPremisesProvisioningErrors: js.UndefOr[NullableOption[js.Array[OnPremisesProvisioningError]]] = js.undefined
  
  /**
    * Contains the on-premises SAM account name synchronized from the on-premises directory. The property is only populated
    * for customers who are synchronizing their on-premises directory to Azure Active Directory via Azure AD Connect.Returned
    * by default. Read-only.
    */
  var onPremisesSamAccountName: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Contains the on-premises security identifier (SID) for the group that was synchronized from on-premises to the cloud.
    * Returned by default. Read-only.
    */
  var onPremisesSecurityIdentifier: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * true if this group is synced from an on-premises directory; false if this group was originally synced from an
    * on-premises directory but is no longer synced; null if this object has never been synced from an on-premises directory
    * (default). Returned by default. Read-only. Supports $filter.
    */
  var onPremisesSyncEnabled: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // Read-only.
  var onenote: js.UndefOr[NullableOption[Onenote]] = js.undefined
  
  /**
    * The owners of the group. The owners are a set of non-admin users who are allowed to modify this object. Limited to 100
    * owners. HTTP Methods: GET (supported for all groups), POST (supported for Microsoft 365 groups, security groups and
    * mail-enabled security groups), DELETE (supported for Microsoft 365 groups and security groups). Nullable.
    */
  var owners: js.UndefOr[NullableOption[js.Array[DirectoryObject]]] = js.undefined
  
  var permissionGrants: js.UndefOr[NullableOption[js.Array[ResourceSpecificPermissionGrant]]] = js.undefined
  
  // The group's profile photo
  var photo: js.UndefOr[NullableOption[ProfilePhoto]] = js.undefined
  
  // The profile photos owned by the group. Read-only. Nullable.
  var photos: js.UndefOr[NullableOption[js.Array[ProfilePhoto]]] = js.undefined
  
  // Entry-point to Planner resource that might exist for a Unified Group.
  var planner: js.UndefOr[NullableOption[PlannerGroup]] = js.undefined
  
  // The preferred data location for the group. For more information, see OneDrive Online Multi-Geo. Returned by default.
  var preferredDataLocation: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * The preferred language for an Microsoft 365 group. Should follow ISO 639-1 Code; for example 'en-US'. Returned by
    * default.
    */
  var preferredLanguage: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Email addresses for the group that direct to the same group mailbox. For example: ['SMTP: bob@contoso.com', 'smtp:
    * bob@sales.contoso.com']. The any operator is required to filter expressions on multi-valued properties. Returned by
    * default. Read-only. Not nullable. Supports $filter.
    */
  var proxyAddresses: js.UndefOr[js.Array[String]] = js.undefined
  
  // The list of users or groups that are not allowed to create posts or calendar events in this group. Nullable
  var rejectedSenders: js.UndefOr[NullableOption[js.Array[DirectoryObject]]] = js.undefined
  
  /**
    * Timestamp of when the group was last renewed. This cannot be modified directly and is only updated via the renew
    * service action. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC
    * time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'. Returned by default.
    * Read-only.
    */
  var renewedDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Specifies whether the group is a security group. Returned by default. Supports $filter.
  var securityEnabled: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // Security identifier of the group, used in Windows scenarios. Returned by default.
  var securityIdentifier: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Read-only. Nullable.
  var settings: js.UndefOr[NullableOption[js.Array[GroupSetting]]] = js.undefined
  
  // The list of SharePoint sites in this group. Access the default site with /sites/root.
  var sites: js.UndefOr[NullableOption[js.Array[Site]]] = js.undefined
  
  var team: js.UndefOr[NullableOption[Team]] = js.undefined
  
  /**
    * Specifies an Microsoft 365 group's color theme. Possible values are Teal, Purple, Green, Blue, Pink, Orange or Red.
    * Returned by default.
    */
  var theme: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The group's conversation threads. Nullable.
  var threads: js.UndefOr[NullableOption[js.Array[ConversationThread]]] = js.undefined
  
  var transitiveMemberOf: js.UndefOr[NullableOption[js.Array[DirectoryObject]]] = js.undefined
  
  var transitiveMembers: js.UndefOr[NullableOption[js.Array[DirectoryObject]]] = js.undefined
  
  /**
    * Count of conversations that have received new posts since the signed-in user last visited the group. Returned only on
    * $select.
    */
  var unseenCount: js.UndefOr[NullableOption[Double]] = js.undefined
  
  /**
    * Specifies the visibility of a Microsoft 365 group. Possible values are: Private, Public, or Hiddenmembership; blank
    * values are treated as public. See group visibility options to learn more.Visibility can be set only when a group is
    * created; it is not editable.Visibility is supported only for unified groups; it is not supported for security groups.
    * Returned by default.
    */
  var visibility: js.UndefOr[NullableOption[String]] = js.undefined
}
object Group {
  
  @scala.inline
  def apply(): Group = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Group]
  }
  
  @scala.inline
  implicit class GroupMutableBuilder[Self <: Group] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcceptedSenders(value: NullableOption[js.Array[DirectoryObject]]): Self = StObject.set(x, "acceptedSenders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcceptedSendersNull: Self = StObject.set(x, "acceptedSenders", null)
    
    @scala.inline
    def setAcceptedSendersUndefined: Self = StObject.set(x, "acceptedSenders", js.undefined)
    
    @scala.inline
    def setAcceptedSendersVarargs(value: DirectoryObject*): Self = StObject.set(x, "acceptedSenders", js.Array(value :_*))
    
    @scala.inline
    def setAllowExternalSenders(value: NullableOption[Boolean]): Self = StObject.set(x, "allowExternalSenders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowExternalSendersNull: Self = StObject.set(x, "allowExternalSenders", null)
    
    @scala.inline
    def setAllowExternalSendersUndefined: Self = StObject.set(x, "allowExternalSenders", js.undefined)
    
    @scala.inline
    def setAppRoleAssignments(value: NullableOption[js.Array[AppRoleAssignment]]): Self = StObject.set(x, "appRoleAssignments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppRoleAssignmentsNull: Self = StObject.set(x, "appRoleAssignments", null)
    
    @scala.inline
    def setAppRoleAssignmentsUndefined: Self = StObject.set(x, "appRoleAssignments", js.undefined)
    
    @scala.inline
    def setAppRoleAssignmentsVarargs(value: AppRoleAssignment*): Self = StObject.set(x, "appRoleAssignments", js.Array(value :_*))
    
    @scala.inline
    def setAssignedLabels(value: NullableOption[js.Array[AssignedLabel]]): Self = StObject.set(x, "assignedLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssignedLabelsNull: Self = StObject.set(x, "assignedLabels", null)
    
    @scala.inline
    def setAssignedLabelsUndefined: Self = StObject.set(x, "assignedLabels", js.undefined)
    
    @scala.inline
    def setAssignedLabelsVarargs(value: AssignedLabel*): Self = StObject.set(x, "assignedLabels", js.Array(value :_*))
    
    @scala.inline
    def setAssignedLicenses(value: NullableOption[js.Array[AssignedLicense]]): Self = StObject.set(x, "assignedLicenses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssignedLicensesNull: Self = StObject.set(x, "assignedLicenses", null)
    
    @scala.inline
    def setAssignedLicensesUndefined: Self = StObject.set(x, "assignedLicenses", js.undefined)
    
    @scala.inline
    def setAssignedLicensesVarargs(value: AssignedLicense*): Self = StObject.set(x, "assignedLicenses", js.Array(value :_*))
    
    @scala.inline
    def setAutoSubscribeNewMembers(value: NullableOption[Boolean]): Self = StObject.set(x, "autoSubscribeNewMembers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoSubscribeNewMembersNull: Self = StObject.set(x, "autoSubscribeNewMembers", null)
    
    @scala.inline
    def setAutoSubscribeNewMembersUndefined: Self = StObject.set(x, "autoSubscribeNewMembers", js.undefined)
    
    @scala.inline
    def setCalendar(value: NullableOption[Calendar]): Self = StObject.set(x, "calendar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCalendarNull: Self = StObject.set(x, "calendar", null)
    
    @scala.inline
    def setCalendarUndefined: Self = StObject.set(x, "calendar", js.undefined)
    
    @scala.inline
    def setCalendarView(value: NullableOption[js.Array[Event]]): Self = StObject.set(x, "calendarView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCalendarViewNull: Self = StObject.set(x, "calendarView", null)
    
    @scala.inline
    def setCalendarViewUndefined: Self = StObject.set(x, "calendarView", js.undefined)
    
    @scala.inline
    def setCalendarViewVarargs(value: Event*): Self = StObject.set(x, "calendarView", js.Array(value :_*))
    
    @scala.inline
    def setClassification(value: NullableOption[String]): Self = StObject.set(x, "classification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassificationNull: Self = StObject.set(x, "classification", null)
    
    @scala.inline
    def setClassificationUndefined: Self = StObject.set(x, "classification", js.undefined)
    
    @scala.inline
    def setConversations(value: NullableOption[js.Array[Conversation]]): Self = StObject.set(x, "conversations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConversationsNull: Self = StObject.set(x, "conversations", null)
    
    @scala.inline
    def setConversationsUndefined: Self = StObject.set(x, "conversations", js.undefined)
    
    @scala.inline
    def setConversationsVarargs(value: Conversation*): Self = StObject.set(x, "conversations", js.Array(value :_*))
    
    @scala.inline
    def setCreatedDateTime(value: NullableOption[String]): Self = StObject.set(x, "createdDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedDateTimeNull: Self = StObject.set(x, "createdDateTime", null)
    
    @scala.inline
    def setCreatedDateTimeUndefined: Self = StObject.set(x, "createdDateTime", js.undefined)
    
    @scala.inline
    def setCreatedOnBehalfOf(value: NullableOption[DirectoryObject]): Self = StObject.set(x, "createdOnBehalfOf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedOnBehalfOfNull: Self = StObject.set(x, "createdOnBehalfOf", null)
    
    @scala.inline
    def setCreatedOnBehalfOfUndefined: Self = StObject.set(x, "createdOnBehalfOf", js.undefined)
    
    @scala.inline
    def setDescription(value: NullableOption[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setDrive(value: NullableOption[Drive]): Self = StObject.set(x, "drive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDriveNull: Self = StObject.set(x, "drive", null)
    
    @scala.inline
    def setDriveUndefined: Self = StObject.set(x, "drive", js.undefined)
    
    @scala.inline
    def setDrives(value: NullableOption[js.Array[Drive]]): Self = StObject.set(x, "drives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDrivesNull: Self = StObject.set(x, "drives", null)
    
    @scala.inline
    def setDrivesUndefined: Self = StObject.set(x, "drives", js.undefined)
    
    @scala.inline
    def setDrivesVarargs(value: Drive*): Self = StObject.set(x, "drives", js.Array(value :_*))
    
    @scala.inline
    def setEvents(value: NullableOption[js.Array[Event]]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventsNull: Self = StObject.set(x, "events", null)
    
    @scala.inline
    def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    @scala.inline
    def setEventsVarargs(value: Event*): Self = StObject.set(x, "events", js.Array(value :_*))
    
    @scala.inline
    def setExpirationDateTime(value: NullableOption[String]): Self = StObject.set(x, "expirationDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpirationDateTimeNull: Self = StObject.set(x, "expirationDateTime", null)
    
    @scala.inline
    def setExpirationDateTimeUndefined: Self = StObject.set(x, "expirationDateTime", js.undefined)
    
    @scala.inline
    def setExtensions(value: NullableOption[js.Array[Extension]]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtensionsNull: Self = StObject.set(x, "extensions", null)
    
    @scala.inline
    def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
    
    @scala.inline
    def setExtensionsVarargs(value: Extension*): Self = StObject.set(x, "extensions", js.Array(value :_*))
    
    @scala.inline
    def setGroupLifecyclePolicies(value: NullableOption[js.Array[GroupLifecyclePolicy]]): Self = StObject.set(x, "groupLifecyclePolicies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupLifecyclePoliciesNull: Self = StObject.set(x, "groupLifecyclePolicies", null)
    
    @scala.inline
    def setGroupLifecyclePoliciesUndefined: Self = StObject.set(x, "groupLifecyclePolicies", js.undefined)
    
    @scala.inline
    def setGroupLifecyclePoliciesVarargs(value: GroupLifecyclePolicy*): Self = StObject.set(x, "groupLifecyclePolicies", js.Array(value :_*))
    
    @scala.inline
    def setGroupTypes(value: js.Array[String]): Self = StObject.set(x, "groupTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupTypesUndefined: Self = StObject.set(x, "groupTypes", js.undefined)
    
    @scala.inline
    def setGroupTypesVarargs(value: String*): Self = StObject.set(x, "groupTypes", js.Array(value :_*))
    
    @scala.inline
    def setHasMembersWithLicenseErrors(value: NullableOption[Boolean]): Self = StObject.set(x, "hasMembersWithLicenseErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasMembersWithLicenseErrorsNull: Self = StObject.set(x, "hasMembersWithLicenseErrors", null)
    
    @scala.inline
    def setHasMembersWithLicenseErrorsUndefined: Self = StObject.set(x, "hasMembersWithLicenseErrors", js.undefined)
    
    @scala.inline
    def setHideFromAddressLists(value: NullableOption[Boolean]): Self = StObject.set(x, "hideFromAddressLists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideFromAddressListsNull: Self = StObject.set(x, "hideFromAddressLists", null)
    
    @scala.inline
    def setHideFromAddressListsUndefined: Self = StObject.set(x, "hideFromAddressLists", js.undefined)
    
    @scala.inline
    def setHideFromOutlookClients(value: NullableOption[Boolean]): Self = StObject.set(x, "hideFromOutlookClients", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideFromOutlookClientsNull: Self = StObject.set(x, "hideFromOutlookClients", null)
    
    @scala.inline
    def setHideFromOutlookClientsUndefined: Self = StObject.set(x, "hideFromOutlookClients", js.undefined)
    
    @scala.inline
    def setIsArchived(value: NullableOption[Boolean]): Self = StObject.set(x, "isArchived", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsArchivedNull: Self = StObject.set(x, "isArchived", null)
    
    @scala.inline
    def setIsArchivedUndefined: Self = StObject.set(x, "isArchived", js.undefined)
    
    @scala.inline
    def setIsSubscribedByMail(value: NullableOption[Boolean]): Self = StObject.set(x, "isSubscribedByMail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSubscribedByMailNull: Self = StObject.set(x, "isSubscribedByMail", null)
    
    @scala.inline
    def setIsSubscribedByMailUndefined: Self = StObject.set(x, "isSubscribedByMail", js.undefined)
    
    @scala.inline
    def setLicenseProcessingState(value: NullableOption[LicenseProcessingState]): Self = StObject.set(x, "licenseProcessingState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLicenseProcessingStateNull: Self = StObject.set(x, "licenseProcessingState", null)
    
    @scala.inline
    def setLicenseProcessingStateUndefined: Self = StObject.set(x, "licenseProcessingState", js.undefined)
    
    @scala.inline
    def setMail(value: NullableOption[String]): Self = StObject.set(x, "mail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMailEnabled(value: NullableOption[Boolean]): Self = StObject.set(x, "mailEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMailEnabledNull: Self = StObject.set(x, "mailEnabled", null)
    
    @scala.inline
    def setMailEnabledUndefined: Self = StObject.set(x, "mailEnabled", js.undefined)
    
    @scala.inline
    def setMailNickname(value: NullableOption[String]): Self = StObject.set(x, "mailNickname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMailNicknameNull: Self = StObject.set(x, "mailNickname", null)
    
    @scala.inline
    def setMailNicknameUndefined: Self = StObject.set(x, "mailNickname", js.undefined)
    
    @scala.inline
    def setMailNull: Self = StObject.set(x, "mail", null)
    
    @scala.inline
    def setMailUndefined: Self = StObject.set(x, "mail", js.undefined)
    
    @scala.inline
    def setMemberOf(value: NullableOption[js.Array[DirectoryObject]]): Self = StObject.set(x, "memberOf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemberOfNull: Self = StObject.set(x, "memberOf", null)
    
    @scala.inline
    def setMemberOfUndefined: Self = StObject.set(x, "memberOf", js.undefined)
    
    @scala.inline
    def setMemberOfVarargs(value: DirectoryObject*): Self = StObject.set(x, "memberOf", js.Array(value :_*))
    
    @scala.inline
    def setMembers(value: NullableOption[js.Array[DirectoryObject]]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMembersNull: Self = StObject.set(x, "members", null)
    
    @scala.inline
    def setMembersUndefined: Self = StObject.set(x, "members", js.undefined)
    
    @scala.inline
    def setMembersVarargs(value: DirectoryObject*): Self = StObject.set(x, "members", js.Array(value :_*))
    
    @scala.inline
    def setMembersWithLicenseErrors(value: NullableOption[js.Array[DirectoryObject]]): Self = StObject.set(x, "membersWithLicenseErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMembersWithLicenseErrorsNull: Self = StObject.set(x, "membersWithLicenseErrors", null)
    
    @scala.inline
    def setMembersWithLicenseErrorsUndefined: Self = StObject.set(x, "membersWithLicenseErrors", js.undefined)
    
    @scala.inline
    def setMembersWithLicenseErrorsVarargs(value: DirectoryObject*): Self = StObject.set(x, "membersWithLicenseErrors", js.Array(value :_*))
    
    @scala.inline
    def setMembershipRule(value: NullableOption[String]): Self = StObject.set(x, "membershipRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMembershipRuleNull: Self = StObject.set(x, "membershipRule", null)
    
    @scala.inline
    def setMembershipRuleProcessingState(value: NullableOption[String]): Self = StObject.set(x, "membershipRuleProcessingState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMembershipRuleProcessingStateNull: Self = StObject.set(x, "membershipRuleProcessingState", null)
    
    @scala.inline
    def setMembershipRuleProcessingStateUndefined: Self = StObject.set(x, "membershipRuleProcessingState", js.undefined)
    
    @scala.inline
    def setMembershipRuleUndefined: Self = StObject.set(x, "membershipRule", js.undefined)
    
    @scala.inline
    def setOnPremisesDomainName(value: NullableOption[String]): Self = StObject.set(x, "onPremisesDomainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPremisesDomainNameNull: Self = StObject.set(x, "onPremisesDomainName", null)
    
    @scala.inline
    def setOnPremisesDomainNameUndefined: Self = StObject.set(x, "onPremisesDomainName", js.undefined)
    
    @scala.inline
    def setOnPremisesLastSyncDateTime(value: NullableOption[String]): Self = StObject.set(x, "onPremisesLastSyncDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPremisesLastSyncDateTimeNull: Self = StObject.set(x, "onPremisesLastSyncDateTime", null)
    
    @scala.inline
    def setOnPremisesLastSyncDateTimeUndefined: Self = StObject.set(x, "onPremisesLastSyncDateTime", js.undefined)
    
    @scala.inline
    def setOnPremisesNetBiosName(value: NullableOption[String]): Self = StObject.set(x, "onPremisesNetBiosName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPremisesNetBiosNameNull: Self = StObject.set(x, "onPremisesNetBiosName", null)
    
    @scala.inline
    def setOnPremisesNetBiosNameUndefined: Self = StObject.set(x, "onPremisesNetBiosName", js.undefined)
    
    @scala.inline
    def setOnPremisesProvisioningErrors(value: NullableOption[js.Array[OnPremisesProvisioningError]]): Self = StObject.set(x, "onPremisesProvisioningErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPremisesProvisioningErrorsNull: Self = StObject.set(x, "onPremisesProvisioningErrors", null)
    
    @scala.inline
    def setOnPremisesProvisioningErrorsUndefined: Self = StObject.set(x, "onPremisesProvisioningErrors", js.undefined)
    
    @scala.inline
    def setOnPremisesProvisioningErrorsVarargs(value: OnPremisesProvisioningError*): Self = StObject.set(x, "onPremisesProvisioningErrors", js.Array(value :_*))
    
    @scala.inline
    def setOnPremisesSamAccountName(value: NullableOption[String]): Self = StObject.set(x, "onPremisesSamAccountName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPremisesSamAccountNameNull: Self = StObject.set(x, "onPremisesSamAccountName", null)
    
    @scala.inline
    def setOnPremisesSamAccountNameUndefined: Self = StObject.set(x, "onPremisesSamAccountName", js.undefined)
    
    @scala.inline
    def setOnPremisesSecurityIdentifier(value: NullableOption[String]): Self = StObject.set(x, "onPremisesSecurityIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPremisesSecurityIdentifierNull: Self = StObject.set(x, "onPremisesSecurityIdentifier", null)
    
    @scala.inline
    def setOnPremisesSecurityIdentifierUndefined: Self = StObject.set(x, "onPremisesSecurityIdentifier", js.undefined)
    
    @scala.inline
    def setOnPremisesSyncEnabled(value: NullableOption[Boolean]): Self = StObject.set(x, "onPremisesSyncEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPremisesSyncEnabledNull: Self = StObject.set(x, "onPremisesSyncEnabled", null)
    
    @scala.inline
    def setOnPremisesSyncEnabledUndefined: Self = StObject.set(x, "onPremisesSyncEnabled", js.undefined)
    
    @scala.inline
    def setOnenote(value: NullableOption[Onenote]): Self = StObject.set(x, "onenote", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnenoteNull: Self = StObject.set(x, "onenote", null)
    
    @scala.inline
    def setOnenoteUndefined: Self = StObject.set(x, "onenote", js.undefined)
    
    @scala.inline
    def setOwners(value: NullableOption[js.Array[DirectoryObject]]): Self = StObject.set(x, "owners", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnersNull: Self = StObject.set(x, "owners", null)
    
    @scala.inline
    def setOwnersUndefined: Self = StObject.set(x, "owners", js.undefined)
    
    @scala.inline
    def setOwnersVarargs(value: DirectoryObject*): Self = StObject.set(x, "owners", js.Array(value :_*))
    
    @scala.inline
    def setPermissionGrants(value: NullableOption[js.Array[ResourceSpecificPermissionGrant]]): Self = StObject.set(x, "permissionGrants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionGrantsNull: Self = StObject.set(x, "permissionGrants", null)
    
    @scala.inline
    def setPermissionGrantsUndefined: Self = StObject.set(x, "permissionGrants", js.undefined)
    
    @scala.inline
    def setPermissionGrantsVarargs(value: ResourceSpecificPermissionGrant*): Self = StObject.set(x, "permissionGrants", js.Array(value :_*))
    
    @scala.inline
    def setPhoto(value: NullableOption[ProfilePhoto]): Self = StObject.set(x, "photo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhotoNull: Self = StObject.set(x, "photo", null)
    
    @scala.inline
    def setPhotoUndefined: Self = StObject.set(x, "photo", js.undefined)
    
    @scala.inline
    def setPhotos(value: NullableOption[js.Array[ProfilePhoto]]): Self = StObject.set(x, "photos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhotosNull: Self = StObject.set(x, "photos", null)
    
    @scala.inline
    def setPhotosUndefined: Self = StObject.set(x, "photos", js.undefined)
    
    @scala.inline
    def setPhotosVarargs(value: ProfilePhoto*): Self = StObject.set(x, "photos", js.Array(value :_*))
    
    @scala.inline
    def setPlanner(value: NullableOption[PlannerGroup]): Self = StObject.set(x, "planner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlannerNull: Self = StObject.set(x, "planner", null)
    
    @scala.inline
    def setPlannerUndefined: Self = StObject.set(x, "planner", js.undefined)
    
    @scala.inline
    def setPreferredDataLocation(value: NullableOption[String]): Self = StObject.set(x, "preferredDataLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreferredDataLocationNull: Self = StObject.set(x, "preferredDataLocation", null)
    
    @scala.inline
    def setPreferredDataLocationUndefined: Self = StObject.set(x, "preferredDataLocation", js.undefined)
    
    @scala.inline
    def setPreferredLanguage(value: NullableOption[String]): Self = StObject.set(x, "preferredLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreferredLanguageNull: Self = StObject.set(x, "preferredLanguage", null)
    
    @scala.inline
    def setPreferredLanguageUndefined: Self = StObject.set(x, "preferredLanguage", js.undefined)
    
    @scala.inline
    def setProxyAddresses(value: js.Array[String]): Self = StObject.set(x, "proxyAddresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProxyAddressesUndefined: Self = StObject.set(x, "proxyAddresses", js.undefined)
    
    @scala.inline
    def setProxyAddressesVarargs(value: String*): Self = StObject.set(x, "proxyAddresses", js.Array(value :_*))
    
    @scala.inline
    def setRejectedSenders(value: NullableOption[js.Array[DirectoryObject]]): Self = StObject.set(x, "rejectedSenders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRejectedSendersNull: Self = StObject.set(x, "rejectedSenders", null)
    
    @scala.inline
    def setRejectedSendersUndefined: Self = StObject.set(x, "rejectedSenders", js.undefined)
    
    @scala.inline
    def setRejectedSendersVarargs(value: DirectoryObject*): Self = StObject.set(x, "rejectedSenders", js.Array(value :_*))
    
    @scala.inline
    def setRenewedDateTime(value: NullableOption[String]): Self = StObject.set(x, "renewedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenewedDateTimeNull: Self = StObject.set(x, "renewedDateTime", null)
    
    @scala.inline
    def setRenewedDateTimeUndefined: Self = StObject.set(x, "renewedDateTime", js.undefined)
    
    @scala.inline
    def setSecurityEnabled(value: NullableOption[Boolean]): Self = StObject.set(x, "securityEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityEnabledNull: Self = StObject.set(x, "securityEnabled", null)
    
    @scala.inline
    def setSecurityEnabledUndefined: Self = StObject.set(x, "securityEnabled", js.undefined)
    
    @scala.inline
    def setSecurityIdentifier(value: NullableOption[String]): Self = StObject.set(x, "securityIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityIdentifierNull: Self = StObject.set(x, "securityIdentifier", null)
    
    @scala.inline
    def setSecurityIdentifierUndefined: Self = StObject.set(x, "securityIdentifier", js.undefined)
    
    @scala.inline
    def setSettings(value: NullableOption[js.Array[GroupSetting]]): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSettingsNull: Self = StObject.set(x, "settings", null)
    
    @scala.inline
    def setSettingsUndefined: Self = StObject.set(x, "settings", js.undefined)
    
    @scala.inline
    def setSettingsVarargs(value: GroupSetting*): Self = StObject.set(x, "settings", js.Array(value :_*))
    
    @scala.inline
    def setSites(value: NullableOption[js.Array[Site]]): Self = StObject.set(x, "sites", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSitesNull: Self = StObject.set(x, "sites", null)
    
    @scala.inline
    def setSitesUndefined: Self = StObject.set(x, "sites", js.undefined)
    
    @scala.inline
    def setSitesVarargs(value: Site*): Self = StObject.set(x, "sites", js.Array(value :_*))
    
    @scala.inline
    def setTeam(value: NullableOption[Team]): Self = StObject.set(x, "team", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeamNull: Self = StObject.set(x, "team", null)
    
    @scala.inline
    def setTeamUndefined: Self = StObject.set(x, "team", js.undefined)
    
    @scala.inline
    def setTheme(value: NullableOption[String]): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThemeNull: Self = StObject.set(x, "theme", null)
    
    @scala.inline
    def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    @scala.inline
    def setThreads(value: NullableOption[js.Array[ConversationThread]]): Self = StObject.set(x, "threads", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThreadsNull: Self = StObject.set(x, "threads", null)
    
    @scala.inline
    def setThreadsUndefined: Self = StObject.set(x, "threads", js.undefined)
    
    @scala.inline
    def setThreadsVarargs(value: ConversationThread*): Self = StObject.set(x, "threads", js.Array(value :_*))
    
    @scala.inline
    def setTransitiveMemberOf(value: NullableOption[js.Array[DirectoryObject]]): Self = StObject.set(x, "transitiveMemberOf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitiveMemberOfNull: Self = StObject.set(x, "transitiveMemberOf", null)
    
    @scala.inline
    def setTransitiveMemberOfUndefined: Self = StObject.set(x, "transitiveMemberOf", js.undefined)
    
    @scala.inline
    def setTransitiveMemberOfVarargs(value: DirectoryObject*): Self = StObject.set(x, "transitiveMemberOf", js.Array(value :_*))
    
    @scala.inline
    def setTransitiveMembers(value: NullableOption[js.Array[DirectoryObject]]): Self = StObject.set(x, "transitiveMembers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitiveMembersNull: Self = StObject.set(x, "transitiveMembers", null)
    
    @scala.inline
    def setTransitiveMembersUndefined: Self = StObject.set(x, "transitiveMembers", js.undefined)
    
    @scala.inline
    def setTransitiveMembersVarargs(value: DirectoryObject*): Self = StObject.set(x, "transitiveMembers", js.Array(value :_*))
    
    @scala.inline
    def setUnseenCount(value: NullableOption[Double]): Self = StObject.set(x, "unseenCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnseenCountNull: Self = StObject.set(x, "unseenCount", null)
    
    @scala.inline
    def setUnseenCountUndefined: Self = StObject.set(x, "unseenCount", js.undefined)
    
    @scala.inline
    def setVisibility(value: NullableOption[String]): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibilityNull: Self = StObject.set(x, "visibility", null)
    
    @scala.inline
    def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
  }
}
