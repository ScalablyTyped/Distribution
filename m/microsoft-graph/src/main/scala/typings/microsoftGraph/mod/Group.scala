package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Group extends DirectoryObject {
  
  /**
    * The list of users or groups that are allowed to create post's or calendar events in this group. If this list is
    * non-empty then only users or groups listed here are allowed to post.
    */
  var acceptedSenders: js.UndefOr[NullableOption[js.Array[DirectoryObject]]] = js.native
  
  /**
    * Indicates if people external to the organization can send messages to the group. Default value is false. Returned only
    * on $select.
    */
  var allowExternalSenders: js.UndefOr[NullableOption[Boolean]] = js.native
  
  var appRoleAssignments: js.UndefOr[NullableOption[js.Array[AppRoleAssignment]]] = js.native
  
  /**
    * The list of sensitivity label pairs (label ID, label name) associated with an Microsoft 365 group. Returned only on
    * $select. Read-only.
    */
  var assignedLabels: js.UndefOr[NullableOption[js.Array[AssignedLabel]]] = js.native
  
  // The licenses that are assigned to the group. Returned only on $select. Read-only.
  var assignedLicenses: js.UndefOr[NullableOption[js.Array[AssignedLicense]]] = js.native
  
  /**
    * Indicates if new members added to the group will be auto-subscribed to receive email notifications. You can set this
    * property in a PATCH request for the group; do not set it in the initial POST request that creates the group. Default
    * value is false. Returned only on $select.
    */
  var autoSubscribeNewMembers: js.UndefOr[NullableOption[Boolean]] = js.native
  
  // The group's calendar. Read-only.
  var calendar: js.UndefOr[NullableOption[Calendar]] = js.native
  
  // The calendar view for the calendar. Read-only.
  var calendarView: js.UndefOr[NullableOption[js.Array[Event]]] = js.native
  
  /**
    * Describes a classification for the group (such as low, medium or high business impact). Valid values for this property
    * are defined by creating a ClassificationList setting value, based on the template definition.Returned by default.
    */
  var classification: js.UndefOr[NullableOption[String]] = js.native
  
  // The group's conversations.
  var conversations: js.UndefOr[NullableOption[js.Array[Conversation]]] = js.native
  
  /**
    * Timestamp of when the group was created. The value cannot be modified and is automatically populated when the group is
    * created. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For
    * example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'. Returned by default. Read-only.
    */
  var createdDateTime: js.UndefOr[NullableOption[String]] = js.native
  
  // The user (or application) that created the group. NOTE: This is not set if the user is an administrator. Read-only.
  var createdOnBehalfOf: js.UndefOr[NullableOption[DirectoryObject]] = js.native
  
  // An optional description for the group. Returned by default.
  var description: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * The display name for the group. This property is required when a group is created and cannot be cleared during updates.
    * Returned by default. Supports $filter and $orderby.
    */
  var displayName: js.UndefOr[NullableOption[String]] = js.native
  
  // The group's default drive. Read-only.
  var drive: js.UndefOr[NullableOption[Drive]] = js.native
  
  // The group's drives. Read-only.
  var drives: js.UndefOr[NullableOption[js.Array[Drive]]] = js.native
  
  // The group's calendar events.
  var events: js.UndefOr[NullableOption[js.Array[Event]]] = js.native
  
  /**
    * Timestamp of when the group is set to expire. The value cannot be modified and is automatically populated when the
    * group is created. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC
    * time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'. Returned by default.
    * Read-only.
    */
  var expirationDateTime: js.UndefOr[NullableOption[String]] = js.native
  
  // The collection of open extensions defined for the group. Read-only. Nullable.
  var extensions: js.UndefOr[NullableOption[js.Array[Extension]]] = js.native
  
  // The collection of lifecycle policies for this group. Read-only. Nullable.
  var groupLifecyclePolicies: js.UndefOr[NullableOption[js.Array[GroupLifecyclePolicy]]] = js.native
  
  /**
    * Specifies the group type and its membership. If the collection contains Unified, the group is a Microsoft 365 group;
    * otherwise, it's either a security group or distribution group. For details, see groups overview.If the collection
    * includes DynamicMembership, the group has dynamic membership; otherwise, membership is static. Returned by default.
    * Supports $filter.
    */
  var groupTypes: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Indicates whether there are members in this group that have license errors from its group-based license assignment.
    * This property is never returned on a GET operation. You can use it as a $filter argument to get groups that have
    * members with license errors (that is, filter for this property being true). See an example.
    */
  var hasMembersWithLicenseErrors: js.UndefOr[NullableOption[Boolean]] = js.native
  
  /**
    * True if the group is not displayed in certain parts of the Outlook UI: the Address Book, address lists for selecting
    * message recipients, and the Browse Groups dialog for searching groups; otherwise, false. Default value is false.
    * Returned only on $select.
    */
  var hideFromAddressLists: js.UndefOr[NullableOption[Boolean]] = js.native
  
  /**
    * True if the group is not displayed in Outlook clients, such as Outlook for Windows and Outlook on the web; otherwise,
    * false. Default value is false. Returned only on $select.
    */
  var hideFromOutlookClients: js.UndefOr[NullableOption[Boolean]] = js.native
  
  var isArchived: js.UndefOr[NullableOption[Boolean]] = js.native
  
  /**
    * Indicates whether the signed-in user is subscribed to receive email conversations. Default value is true. Returned only
    * on $select.
    */
  var isSubscribedByMail: js.UndefOr[NullableOption[Boolean]] = js.native
  
  /**
    * Indicates status of the group license assignment to all members of the group. Default value is false. Read-only.
    * Possible values: QueuedForProcessing, ProcessingInProgress, and ProcessingComplete.Returned only on $select. Read-only.
    */
  var licenseProcessingState: js.UndefOr[NullableOption[LicenseProcessingState]] = js.native
  
  /**
    * The SMTP address for the group, for example, 'serviceadmins@contoso.onmicrosoft.com'. Returned by default. Read-only.
    * Supports $filter.
    */
  var mail: js.UndefOr[NullableOption[String]] = js.native
  
  // Specifies whether the group is mail-enabled. Returned by default.
  var mailEnabled: js.UndefOr[NullableOption[Boolean]] = js.native
  
  var mailNickname: js.UndefOr[NullableOption[String]] = js.native
  
  // Groups that this group is a member of. HTTP Methods: GET (supported for all groups). Read-only. Nullable.
  var memberOf: js.UndefOr[NullableOption[js.Array[DirectoryObject]]] = js.native
  
  /**
    * Users and groups that are members of this group. HTTP Methods: GET (supported for all groups), POST (supported for
    * Microsoft 365 groups, security groups and mail-enabled security groups), DELETE (supported for Microsoft 365 groups and
    * security groups) Nullable.
    */
  var members: js.UndefOr[NullableOption[js.Array[DirectoryObject]]] = js.native
  
  // A list of group members with license errors from this group-based license assignment. Read-only.
  var membersWithLicenseErrors: js.UndefOr[NullableOption[js.Array[DirectoryObject]]] = js.native
  
  /**
    * The rule that determines members for this group if the group is a dynamic group (groupTypes contains
    * DynamicMembership). For more information about the syntax of the membership rule, see Membership Rules syntax. Returned
    * by default.
    */
  var membershipRule: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * Indicates whether the dynamic membership processing is on or paused. Possible values are 'On' or 'Paused'. Returned by
    * default.
    */
  var membershipRuleProcessingState: js.UndefOr[NullableOption[String]] = js.native
  
  var onPremisesDomainName: js.UndefOr[NullableOption[String]] = js.native
  
  var onPremisesLastSyncDateTime: js.UndefOr[NullableOption[String]] = js.native
  
  var onPremisesNetBiosName: js.UndefOr[NullableOption[String]] = js.native
  
  var onPremisesProvisioningErrors: js.UndefOr[NullableOption[js.Array[OnPremisesProvisioningError]]] = js.native
  
  /**
    * Contains the on-premises SAM account name synchronized from the on-premises directory. The property is only populated
    * for customers who are synchronizing their on-premises directory to Azure Active Directory via Azure AD Connect.Returned
    * by default. Read-only.
    */
  var onPremisesSamAccountName: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * Contains the on-premises security identifier (SID) for the group that was synchronized from on-premises to the cloud.
    * Returned by default. Read-only.
    */
  var onPremisesSecurityIdentifier: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * true if this group is synced from an on-premises directory; false if this group was originally synced from an
    * on-premises directory but is no longer synced; null if this object has never been synced from an on-premises directory
    * (default). Returned by default. Read-only. Supports $filter.
    */
  var onPremisesSyncEnabled: js.UndefOr[NullableOption[Boolean]] = js.native
  
  // Read-only.
  var onenote: js.UndefOr[NullableOption[Onenote]] = js.native
  
  /**
    * The owners of the group. The owners are a set of non-admin users who are allowed to modify this object. Limited to 100
    * owners. HTTP Methods: GET (supported for all groups), POST (supported for Microsoft 365 groups, security groups and
    * mail-enabled security groups), DELETE (supported for Microsoft 365 groups and security groups). Nullable.
    */
  var owners: js.UndefOr[NullableOption[js.Array[DirectoryObject]]] = js.native
  
  var permissionGrants: js.UndefOr[NullableOption[js.Array[ResourceSpecificPermissionGrant]]] = js.native
  
  // The group's profile photo
  var photo: js.UndefOr[NullableOption[ProfilePhoto]] = js.native
  
  // The profile photos owned by the group. Read-only. Nullable.
  var photos: js.UndefOr[NullableOption[js.Array[ProfilePhoto]]] = js.native
  
  // Entry-point to Planner resource that might exist for a Unified Group.
  var planner: js.UndefOr[NullableOption[PlannerGroup]] = js.native
  
  // The preferred data location for the group. For more information, see OneDrive Online Multi-Geo. Returned by default.
  var preferredDataLocation: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * The preferred language for an Microsoft 365 group. Should follow ISO 639-1 Code; for example 'en-US'. Returned by
    * default.
    */
  var preferredLanguage: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * Email addresses for the group that direct to the same group mailbox. For example: ['SMTP: bob@contoso.com', 'smtp:
    * bob@sales.contoso.com']. The any operator is required to filter expressions on multi-valued properties. Returned by
    * default. Read-only. Not nullable. Supports $filter.
    */
  var proxyAddresses: js.UndefOr[js.Array[String]] = js.native
  
  // The list of users or groups that are not allowed to create posts or calendar events in this group. Nullable
  var rejectedSenders: js.UndefOr[NullableOption[js.Array[DirectoryObject]]] = js.native
  
  /**
    * Timestamp of when the group was last renewed. This cannot be modified directly and is only updated via the renew
    * service action. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC
    * time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'. Returned by default.
    * Read-only.
    */
  var renewedDateTime: js.UndefOr[NullableOption[String]] = js.native
  
  // Specifies whether the group is a security group. Returned by default. Supports $filter.
  var securityEnabled: js.UndefOr[NullableOption[Boolean]] = js.native
  
  // Security identifier of the group, used in Windows scenarios. Returned by default.
  var securityIdentifier: js.UndefOr[NullableOption[String]] = js.native
  
  // Read-only. Nullable.
  var settings: js.UndefOr[NullableOption[js.Array[GroupSetting]]] = js.native
  
  // The list of SharePoint sites in this group. Access the default site with /sites/root.
  var sites: js.UndefOr[NullableOption[js.Array[Site]]] = js.native
  
  var team: js.UndefOr[NullableOption[Team]] = js.native
  
  /**
    * Specifies an Microsoft 365 group's color theme. Possible values are Teal, Purple, Green, Blue, Pink, Orange or Red.
    * Returned by default.
    */
  var theme: js.UndefOr[NullableOption[String]] = js.native
  
  // The group's conversation threads. Nullable.
  var threads: js.UndefOr[NullableOption[js.Array[ConversationThread]]] = js.native
  
  var transitiveMemberOf: js.UndefOr[NullableOption[js.Array[DirectoryObject]]] = js.native
  
  var transitiveMembers: js.UndefOr[NullableOption[js.Array[DirectoryObject]]] = js.native
  
  /**
    * Count of conversations that have received new posts since the signed-in user last visited the group. Returned only on
    * $select.
    */
  var unseenCount: js.UndefOr[NullableOption[Double]] = js.native
  
  /**
    * Specifies the visibility of a Microsoft 365 group. Possible values are: Private, Public, or Hiddenmembership; blank
    * values are treated as public. See group visibility options to learn more.Visibility can be set only when a group is
    * created; it is not editable.Visibility is supported only for unified groups; it is not supported for security groups.
    * Returned by default.
    */
  var visibility: js.UndefOr[NullableOption[String]] = js.native
}
object Group {
  
  @scala.inline
  def apply(): Group = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Group]
  }
  
  @scala.inline
  implicit class GroupOps[Self <: Group] (val x: Self) extends AnyVal {
    
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
    def setAcceptedSendersVarargs(value: DirectoryObject*): Self = this.set("acceptedSenders", js.Array(value :_*))
    
    @scala.inline
    def setAcceptedSenders(value: NullableOption[js.Array[DirectoryObject]]): Self = this.set("acceptedSenders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAcceptedSenders: Self = this.set("acceptedSenders", js.undefined)
    
    @scala.inline
    def setAcceptedSendersNull: Self = this.set("acceptedSenders", null)
    
    @scala.inline
    def setAllowExternalSenders(value: NullableOption[Boolean]): Self = this.set("allowExternalSenders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowExternalSenders: Self = this.set("allowExternalSenders", js.undefined)
    
    @scala.inline
    def setAllowExternalSendersNull: Self = this.set("allowExternalSenders", null)
    
    @scala.inline
    def setAppRoleAssignmentsVarargs(value: AppRoleAssignment*): Self = this.set("appRoleAssignments", js.Array(value :_*))
    
    @scala.inline
    def setAppRoleAssignments(value: NullableOption[js.Array[AppRoleAssignment]]): Self = this.set("appRoleAssignments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppRoleAssignments: Self = this.set("appRoleAssignments", js.undefined)
    
    @scala.inline
    def setAppRoleAssignmentsNull: Self = this.set("appRoleAssignments", null)
    
    @scala.inline
    def setAssignedLabelsVarargs(value: AssignedLabel*): Self = this.set("assignedLabels", js.Array(value :_*))
    
    @scala.inline
    def setAssignedLabels(value: NullableOption[js.Array[AssignedLabel]]): Self = this.set("assignedLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssignedLabels: Self = this.set("assignedLabels", js.undefined)
    
    @scala.inline
    def setAssignedLabelsNull: Self = this.set("assignedLabels", null)
    
    @scala.inline
    def setAssignedLicensesVarargs(value: AssignedLicense*): Self = this.set("assignedLicenses", js.Array(value :_*))
    
    @scala.inline
    def setAssignedLicenses(value: NullableOption[js.Array[AssignedLicense]]): Self = this.set("assignedLicenses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssignedLicenses: Self = this.set("assignedLicenses", js.undefined)
    
    @scala.inline
    def setAssignedLicensesNull: Self = this.set("assignedLicenses", null)
    
    @scala.inline
    def setAutoSubscribeNewMembers(value: NullableOption[Boolean]): Self = this.set("autoSubscribeNewMembers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoSubscribeNewMembers: Self = this.set("autoSubscribeNewMembers", js.undefined)
    
    @scala.inline
    def setAutoSubscribeNewMembersNull: Self = this.set("autoSubscribeNewMembers", null)
    
    @scala.inline
    def setCalendar(value: NullableOption[Calendar]): Self = this.set("calendar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCalendar: Self = this.set("calendar", js.undefined)
    
    @scala.inline
    def setCalendarNull: Self = this.set("calendar", null)
    
    @scala.inline
    def setCalendarViewVarargs(value: Event*): Self = this.set("calendarView", js.Array(value :_*))
    
    @scala.inline
    def setCalendarView(value: NullableOption[js.Array[Event]]): Self = this.set("calendarView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCalendarView: Self = this.set("calendarView", js.undefined)
    
    @scala.inline
    def setCalendarViewNull: Self = this.set("calendarView", null)
    
    @scala.inline
    def setClassification(value: NullableOption[String]): Self = this.set("classification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassification: Self = this.set("classification", js.undefined)
    
    @scala.inline
    def setClassificationNull: Self = this.set("classification", null)
    
    @scala.inline
    def setConversationsVarargs(value: Conversation*): Self = this.set("conversations", js.Array(value :_*))
    
    @scala.inline
    def setConversations(value: NullableOption[js.Array[Conversation]]): Self = this.set("conversations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConversations: Self = this.set("conversations", js.undefined)
    
    @scala.inline
    def setConversationsNull: Self = this.set("conversations", null)
    
    @scala.inline
    def setCreatedDateTime(value: NullableOption[String]): Self = this.set("createdDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedDateTime: Self = this.set("createdDateTime", js.undefined)
    
    @scala.inline
    def setCreatedDateTimeNull: Self = this.set("createdDateTime", null)
    
    @scala.inline
    def setCreatedOnBehalfOf(value: NullableOption[DirectoryObject]): Self = this.set("createdOnBehalfOf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedOnBehalfOf: Self = this.set("createdOnBehalfOf", js.undefined)
    
    @scala.inline
    def setCreatedOnBehalfOfNull: Self = this.set("createdOnBehalfOf", null)
    
    @scala.inline
    def setDescription(value: NullableOption[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setDescriptionNull: Self = this.set("description", null)
    
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
    def setEventsVarargs(value: Event*): Self = this.set("events", js.Array(value :_*))
    
    @scala.inline
    def setEvents(value: NullableOption[js.Array[Event]]): Self = this.set("events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvents: Self = this.set("events", js.undefined)
    
    @scala.inline
    def setEventsNull: Self = this.set("events", null)
    
    @scala.inline
    def setExpirationDateTime(value: NullableOption[String]): Self = this.set("expirationDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpirationDateTime: Self = this.set("expirationDateTime", js.undefined)
    
    @scala.inline
    def setExpirationDateTimeNull: Self = this.set("expirationDateTime", null)
    
    @scala.inline
    def setExtensionsVarargs(value: Extension*): Self = this.set("extensions", js.Array(value :_*))
    
    @scala.inline
    def setExtensions(value: NullableOption[js.Array[Extension]]): Self = this.set("extensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtensions: Self = this.set("extensions", js.undefined)
    
    @scala.inline
    def setExtensionsNull: Self = this.set("extensions", null)
    
    @scala.inline
    def setGroupLifecyclePoliciesVarargs(value: GroupLifecyclePolicy*): Self = this.set("groupLifecyclePolicies", js.Array(value :_*))
    
    @scala.inline
    def setGroupLifecyclePolicies(value: NullableOption[js.Array[GroupLifecyclePolicy]]): Self = this.set("groupLifecyclePolicies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupLifecyclePolicies: Self = this.set("groupLifecyclePolicies", js.undefined)
    
    @scala.inline
    def setGroupLifecyclePoliciesNull: Self = this.set("groupLifecyclePolicies", null)
    
    @scala.inline
    def setGroupTypesVarargs(value: String*): Self = this.set("groupTypes", js.Array(value :_*))
    
    @scala.inline
    def setGroupTypes(value: js.Array[String]): Self = this.set("groupTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupTypes: Self = this.set("groupTypes", js.undefined)
    
    @scala.inline
    def setHasMembersWithLicenseErrors(value: NullableOption[Boolean]): Self = this.set("hasMembersWithLicenseErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasMembersWithLicenseErrors: Self = this.set("hasMembersWithLicenseErrors", js.undefined)
    
    @scala.inline
    def setHasMembersWithLicenseErrorsNull: Self = this.set("hasMembersWithLicenseErrors", null)
    
    @scala.inline
    def setHideFromAddressLists(value: NullableOption[Boolean]): Self = this.set("hideFromAddressLists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideFromAddressLists: Self = this.set("hideFromAddressLists", js.undefined)
    
    @scala.inline
    def setHideFromAddressListsNull: Self = this.set("hideFromAddressLists", null)
    
    @scala.inline
    def setHideFromOutlookClients(value: NullableOption[Boolean]): Self = this.set("hideFromOutlookClients", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideFromOutlookClients: Self = this.set("hideFromOutlookClients", js.undefined)
    
    @scala.inline
    def setHideFromOutlookClientsNull: Self = this.set("hideFromOutlookClients", null)
    
    @scala.inline
    def setIsArchived(value: NullableOption[Boolean]): Self = this.set("isArchived", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsArchived: Self = this.set("isArchived", js.undefined)
    
    @scala.inline
    def setIsArchivedNull: Self = this.set("isArchived", null)
    
    @scala.inline
    def setIsSubscribedByMail(value: NullableOption[Boolean]): Self = this.set("isSubscribedByMail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsSubscribedByMail: Self = this.set("isSubscribedByMail", js.undefined)
    
    @scala.inline
    def setIsSubscribedByMailNull: Self = this.set("isSubscribedByMail", null)
    
    @scala.inline
    def setLicenseProcessingState(value: NullableOption[LicenseProcessingState]): Self = this.set("licenseProcessingState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLicenseProcessingState: Self = this.set("licenseProcessingState", js.undefined)
    
    @scala.inline
    def setLicenseProcessingStateNull: Self = this.set("licenseProcessingState", null)
    
    @scala.inline
    def setMail(value: NullableOption[String]): Self = this.set("mail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMail: Self = this.set("mail", js.undefined)
    
    @scala.inline
    def setMailNull: Self = this.set("mail", null)
    
    @scala.inline
    def setMailEnabled(value: NullableOption[Boolean]): Self = this.set("mailEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMailEnabled: Self = this.set("mailEnabled", js.undefined)
    
    @scala.inline
    def setMailEnabledNull: Self = this.set("mailEnabled", null)
    
    @scala.inline
    def setMailNickname(value: NullableOption[String]): Self = this.set("mailNickname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMailNickname: Self = this.set("mailNickname", js.undefined)
    
    @scala.inline
    def setMailNicknameNull: Self = this.set("mailNickname", null)
    
    @scala.inline
    def setMemberOfVarargs(value: DirectoryObject*): Self = this.set("memberOf", js.Array(value :_*))
    
    @scala.inline
    def setMemberOf(value: NullableOption[js.Array[DirectoryObject]]): Self = this.set("memberOf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMemberOf: Self = this.set("memberOf", js.undefined)
    
    @scala.inline
    def setMemberOfNull: Self = this.set("memberOf", null)
    
    @scala.inline
    def setMembersVarargs(value: DirectoryObject*): Self = this.set("members", js.Array(value :_*))
    
    @scala.inline
    def setMembers(value: NullableOption[js.Array[DirectoryObject]]): Self = this.set("members", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMembers: Self = this.set("members", js.undefined)
    
    @scala.inline
    def setMembersNull: Self = this.set("members", null)
    
    @scala.inline
    def setMembersWithLicenseErrorsVarargs(value: DirectoryObject*): Self = this.set("membersWithLicenseErrors", js.Array(value :_*))
    
    @scala.inline
    def setMembersWithLicenseErrors(value: NullableOption[js.Array[DirectoryObject]]): Self = this.set("membersWithLicenseErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMembersWithLicenseErrors: Self = this.set("membersWithLicenseErrors", js.undefined)
    
    @scala.inline
    def setMembersWithLicenseErrorsNull: Self = this.set("membersWithLicenseErrors", null)
    
    @scala.inline
    def setMembershipRule(value: NullableOption[String]): Self = this.set("membershipRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMembershipRule: Self = this.set("membershipRule", js.undefined)
    
    @scala.inline
    def setMembershipRuleNull: Self = this.set("membershipRule", null)
    
    @scala.inline
    def setMembershipRuleProcessingState(value: NullableOption[String]): Self = this.set("membershipRuleProcessingState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMembershipRuleProcessingState: Self = this.set("membershipRuleProcessingState", js.undefined)
    
    @scala.inline
    def setMembershipRuleProcessingStateNull: Self = this.set("membershipRuleProcessingState", null)
    
    @scala.inline
    def setOnPremisesDomainName(value: NullableOption[String]): Self = this.set("onPremisesDomainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnPremisesDomainName: Self = this.set("onPremisesDomainName", js.undefined)
    
    @scala.inline
    def setOnPremisesDomainNameNull: Self = this.set("onPremisesDomainName", null)
    
    @scala.inline
    def setOnPremisesLastSyncDateTime(value: NullableOption[String]): Self = this.set("onPremisesLastSyncDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnPremisesLastSyncDateTime: Self = this.set("onPremisesLastSyncDateTime", js.undefined)
    
    @scala.inline
    def setOnPremisesLastSyncDateTimeNull: Self = this.set("onPremisesLastSyncDateTime", null)
    
    @scala.inline
    def setOnPremisesNetBiosName(value: NullableOption[String]): Self = this.set("onPremisesNetBiosName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnPremisesNetBiosName: Self = this.set("onPremisesNetBiosName", js.undefined)
    
    @scala.inline
    def setOnPremisesNetBiosNameNull: Self = this.set("onPremisesNetBiosName", null)
    
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
    def setOnenote(value: NullableOption[Onenote]): Self = this.set("onenote", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnenote: Self = this.set("onenote", js.undefined)
    
    @scala.inline
    def setOnenoteNull: Self = this.set("onenote", null)
    
    @scala.inline
    def setOwnersVarargs(value: DirectoryObject*): Self = this.set("owners", js.Array(value :_*))
    
    @scala.inline
    def setOwners(value: NullableOption[js.Array[DirectoryObject]]): Self = this.set("owners", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwners: Self = this.set("owners", js.undefined)
    
    @scala.inline
    def setOwnersNull: Self = this.set("owners", null)
    
    @scala.inline
    def setPermissionGrantsVarargs(value: ResourceSpecificPermissionGrant*): Self = this.set("permissionGrants", js.Array(value :_*))
    
    @scala.inline
    def setPermissionGrants(value: NullableOption[js.Array[ResourceSpecificPermissionGrant]]): Self = this.set("permissionGrants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePermissionGrants: Self = this.set("permissionGrants", js.undefined)
    
    @scala.inline
    def setPermissionGrantsNull: Self = this.set("permissionGrants", null)
    
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
    def setPlanner(value: NullableOption[PlannerGroup]): Self = this.set("planner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlanner: Self = this.set("planner", js.undefined)
    
    @scala.inline
    def setPlannerNull: Self = this.set("planner", null)
    
    @scala.inline
    def setPreferredDataLocation(value: NullableOption[String]): Self = this.set("preferredDataLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreferredDataLocation: Self = this.set("preferredDataLocation", js.undefined)
    
    @scala.inline
    def setPreferredDataLocationNull: Self = this.set("preferredDataLocation", null)
    
    @scala.inline
    def setPreferredLanguage(value: NullableOption[String]): Self = this.set("preferredLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreferredLanguage: Self = this.set("preferredLanguage", js.undefined)
    
    @scala.inline
    def setPreferredLanguageNull: Self = this.set("preferredLanguage", null)
    
    @scala.inline
    def setProxyAddressesVarargs(value: String*): Self = this.set("proxyAddresses", js.Array(value :_*))
    
    @scala.inline
    def setProxyAddresses(value: js.Array[String]): Self = this.set("proxyAddresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProxyAddresses: Self = this.set("proxyAddresses", js.undefined)
    
    @scala.inline
    def setRejectedSendersVarargs(value: DirectoryObject*): Self = this.set("rejectedSenders", js.Array(value :_*))
    
    @scala.inline
    def setRejectedSenders(value: NullableOption[js.Array[DirectoryObject]]): Self = this.set("rejectedSenders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRejectedSenders: Self = this.set("rejectedSenders", js.undefined)
    
    @scala.inline
    def setRejectedSendersNull: Self = this.set("rejectedSenders", null)
    
    @scala.inline
    def setRenewedDateTime(value: NullableOption[String]): Self = this.set("renewedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenewedDateTime: Self = this.set("renewedDateTime", js.undefined)
    
    @scala.inline
    def setRenewedDateTimeNull: Self = this.set("renewedDateTime", null)
    
    @scala.inline
    def setSecurityEnabled(value: NullableOption[Boolean]): Self = this.set("securityEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecurityEnabled: Self = this.set("securityEnabled", js.undefined)
    
    @scala.inline
    def setSecurityEnabledNull: Self = this.set("securityEnabled", null)
    
    @scala.inline
    def setSecurityIdentifier(value: NullableOption[String]): Self = this.set("securityIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecurityIdentifier: Self = this.set("securityIdentifier", js.undefined)
    
    @scala.inline
    def setSecurityIdentifierNull: Self = this.set("securityIdentifier", null)
    
    @scala.inline
    def setSettingsVarargs(value: GroupSetting*): Self = this.set("settings", js.Array(value :_*))
    
    @scala.inline
    def setSettings(value: NullableOption[js.Array[GroupSetting]]): Self = this.set("settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSettings: Self = this.set("settings", js.undefined)
    
    @scala.inline
    def setSettingsNull: Self = this.set("settings", null)
    
    @scala.inline
    def setSitesVarargs(value: Site*): Self = this.set("sites", js.Array(value :_*))
    
    @scala.inline
    def setSites(value: NullableOption[js.Array[Site]]): Self = this.set("sites", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSites: Self = this.set("sites", js.undefined)
    
    @scala.inline
    def setSitesNull: Self = this.set("sites", null)
    
    @scala.inline
    def setTeam(value: NullableOption[Team]): Self = this.set("team", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTeam: Self = this.set("team", js.undefined)
    
    @scala.inline
    def setTeamNull: Self = this.set("team", null)
    
    @scala.inline
    def setTheme(value: NullableOption[String]): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    
    @scala.inline
    def setThemeNull: Self = this.set("theme", null)
    
    @scala.inline
    def setThreadsVarargs(value: ConversationThread*): Self = this.set("threads", js.Array(value :_*))
    
    @scala.inline
    def setThreads(value: NullableOption[js.Array[ConversationThread]]): Self = this.set("threads", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThreads: Self = this.set("threads", js.undefined)
    
    @scala.inline
    def setThreadsNull: Self = this.set("threads", null)
    
    @scala.inline
    def setTransitiveMemberOfVarargs(value: DirectoryObject*): Self = this.set("transitiveMemberOf", js.Array(value :_*))
    
    @scala.inline
    def setTransitiveMemberOf(value: NullableOption[js.Array[DirectoryObject]]): Self = this.set("transitiveMemberOf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransitiveMemberOf: Self = this.set("transitiveMemberOf", js.undefined)
    
    @scala.inline
    def setTransitiveMemberOfNull: Self = this.set("transitiveMemberOf", null)
    
    @scala.inline
    def setTransitiveMembersVarargs(value: DirectoryObject*): Self = this.set("transitiveMembers", js.Array(value :_*))
    
    @scala.inline
    def setTransitiveMembers(value: NullableOption[js.Array[DirectoryObject]]): Self = this.set("transitiveMembers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransitiveMembers: Self = this.set("transitiveMembers", js.undefined)
    
    @scala.inline
    def setTransitiveMembersNull: Self = this.set("transitiveMembers", null)
    
    @scala.inline
    def setUnseenCount(value: NullableOption[Double]): Self = this.set("unseenCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnseenCount: Self = this.set("unseenCount", js.undefined)
    
    @scala.inline
    def setUnseenCountNull: Self = this.set("unseenCount", null)
    
    @scala.inline
    def setVisibility(value: NullableOption[String]): Self = this.set("visibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisibility: Self = this.set("visibility", js.undefined)
    
    @scala.inline
    def setVisibilityNull: Self = this.set("visibility", null)
  }
}
