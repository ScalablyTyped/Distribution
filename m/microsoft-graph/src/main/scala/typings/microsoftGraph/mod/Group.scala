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
    * on $select. Supported only on the Get group API (GET /groups/{ID}).
    */
  var allowExternalSenders: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // Represents the app roles a group has been granted for an application. Supports $expand.
  var appRoleAssignments: js.UndefOr[NullableOption[js.Array[AppRoleAssignment]]] = js.undefined
  
  /**
    * The list of sensitivity label pairs (label ID, label name) associated with a Microsoft 365 group. Returned only on
    * $select. Read-only.
    */
  var assignedLabels: js.UndefOr[NullableOption[js.Array[AssignedLabel]]] = js.undefined
  
  // The licenses that are assigned to the group. Returned only on $select. Supports $filter (eq).Read-only.
  var assignedLicenses: js.UndefOr[NullableOption[js.Array[AssignedLicense]]] = js.undefined
  
  /**
    * Indicates if new members added to the group will be auto-subscribed to receive email notifications. You can set ,this
    * property in a PATCH request for the group; do not set it in the initial POST request that creates the group. Default
    * value is false. Returned only on $select. Supported only on the Get group API (GET /groups/{ID}).
    */
  var autoSubscribeNewMembers: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // The group's calendar. Read-only.
  var calendar: js.UndefOr[NullableOption[Calendar]] = js.undefined
  
  // The calendar view for the calendar. Read-only.
  var calendarView: js.UndefOr[NullableOption[js.Array[Event]]] = js.undefined
  
  /**
    * Describes a classification for the group (such as low, medium or high business impact). Valid values for this property
    * are defined by creating a ClassificationList setting value, based on the template definition.Returned by default.
    * Supports $filter (eq, ne, not, ge, le, startsWith).
    */
  var classification: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The group's conversations.
  var conversations: js.UndefOr[NullableOption[js.Array[Conversation]]] = js.undefined
  
  /**
    * Timestamp of when the group was created. The value cannot be modified and is automatically populated when the group is
    * created. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For
    * example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Returned by default. Supports $filter (eq, ne, not, ge,
    * le, in). Read-only.
    */
  var createdDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The user (or application) that created the group. NOTE: This is not set if the user is an administrator. Read-only.
  var createdOnBehalfOf: js.UndefOr[NullableOption[DirectoryObject]] = js.undefined
  
  /**
    * An optional description for the group. Returned by default. Supports $filter (eq, ne, not, ge, le, startsWith) and
    * $search.
    */
  var description: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * The display name for the group. This property is required when a group is created and cannot be cleared during updates.
    * Maximum length is 256 characters. Returned by default. Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq on
    * null values), $search, and $orderBy.
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
    * time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Returned by default. Supports $filter (eq, ne,
    * not, ge, le, in). Read-only.
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
    * Supports $filter (eq, not).
    */
  var groupTypes: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Indicates whether there are members in this group that have license errors from its group-based license assignment.
    * This property is never returned on a GET operation. You can use it as a $filter argument to get groups that have
    * members with license errors (that is, filter for this property being true). See an example. Supports $filter (eq).
    */
  var hasMembersWithLicenseErrors: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  /**
    * True if the group is not displayed in certain parts of the Outlook UI: the Address Book, address lists for selecting
    * message recipients, and the Browse Groups dialog for searching groups; otherwise, false. Default value is false.
    * Returned only on $select. Supported only on the Get group API (GET /groups/{ID}).
    */
  var hideFromAddressLists: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  /**
    * True if the group is not displayed in Outlook clients, such as Outlook for Windows and Outlook on the web; otherwise,
    * false. Default value is false. Returned only on $select. Supported only on the Get group API (GET /groups/{ID}).
    */
  var hideFromOutlookClients: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  /**
    * When a group is associated with a team this property determines whether the team is in read-only mode.To read this
    * property, use the /group/{groupId}/team endpoint or the Get team API. To update this property, use the archiveTeam and
    * unarchiveTeam APIs.
    */
  var isArchived: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  /**
    * Indicates whether this group can be assigned to an Azure Active Directory role or not. Optional. This property can only
    * be set while creating the group and is immutable. If set to true, the securityEnabled property must also be set to true
    * and the group cannot be a dynamic group (that is, groupTypes cannot contain DynamicMembership). Only callers in Global
    * administrator and Privileged role administrator roles can set this property. The caller must be assigned the
    * RoleManagement.ReadWrite.Directory permission to set this property or update the membership of such groups. For more,
    * see Using a group to manage Azure AD role assignmentsReturned by default. Supports $filter (eq, ne, not).
    */
  var isAssignableToRole: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  /**
    * Indicates whether the signed-in user is subscribed to receive email conversations. Default value is true. Returned only
    * on $select. Supported only on the Get group API (GET /groups/{ID}).
    */
  var isSubscribedByMail: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  /**
    * Indicates status of the group license assignment to all members of the group. Default value is false. Read-only.
    * Possible values: QueuedForProcessing, ProcessingInProgress, and ProcessingComplete.Returned only on $select. Read-only.
    */
  var licenseProcessingState: js.UndefOr[NullableOption[LicenseProcessingState]] = js.undefined
  
  /**
    * The SMTP address for the group, for example, 'serviceadmins@contoso.onmicrosoft.com'. Returned by default. Read-only.
    * Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq on null values).
    */
  var mail: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Specifies whether the group is mail-enabled. Required. Returned by default. Supports $filter (eq, ne, not).
  var mailEnabled: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  /**
    * The mail alias for the group, unique for Microsoft 365 groups in the organization. Maximum length is 64 characters.
    * This property can contain only characters in the ASCII character set 0 - 127 except the following: @ () / [] ' ; : .
    * &amp;lt;&amp;gt; , SPACE. Required. Returned by default. Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq
    * on null values).
    */
  var mailNickname: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Groups that this group is a member of. HTTP Methods: GET (supported for all groups). Read-only. Nullable. Supports
    * $expand.
    */
  var memberOf: js.UndefOr[NullableOption[js.Array[DirectoryObject]]] = js.undefined
  
  /**
    * The members of this group, who can be users, devices, other groups, or service principals. Supports the List members,
    * Add member, and Remove member operations. Nullable. Supports $expand including nested $select. For example,
    * /groups?$filter=startsWith(displayName,'Role')&amp;$select=id,displayName&amp;$expand=members($select=id,userPrincipalName,displayName).
    */
  var members: js.UndefOr[NullableOption[js.Array[DirectoryObject]]] = js.undefined
  
  // A list of group members with license errors from this group-based license assignment. Read-only.
  var membersWithLicenseErrors: js.UndefOr[NullableOption[js.Array[DirectoryObject]]] = js.undefined
  
  /**
    * The rule that determines members for this group if the group is a dynamic group (groupTypes contains
    * DynamicMembership). For more information about the syntax of the membership rule, see Membership Rules syntax. Returned
    * by default. Supports $filter (eq, ne, not, ge, le, startsWith).
    */
  var membershipRule: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Indicates whether the dynamic membership processing is on or paused. Possible values are On or Paused. Returned by
    * default. Supports $filter (eq, ne, not, in).
    */
  var membershipRuleProcessingState: js.UndefOr[NullableOption[String]] = js.undefined
  
  var onPremisesDomainName: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Indicates the last time at which the group was synced with the on-premises directory.The Timestamp type represents date
    * and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is
    * 2014-01-01T00:00:00Z. Returned by default. Read-only. Supports $filter (eq, ne, not, ge, le, in).
    */
  var onPremisesLastSyncDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  var onPremisesNetBiosName: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Errors when using Microsoft synchronization product during provisioning. Returned by default. Supports $filter (eq,
    * not).
    */
  var onPremisesProvisioningErrors: js.UndefOr[NullableOption[js.Array[OnPremisesProvisioningError]]] = js.undefined
  
  /**
    * Contains the on-premises SAM account name synchronized from the on-premises directory. The property is only populated
    * for customers who are synchronizing their on-premises directory to Azure Active Directory via Azure AD Connect.Returned
    * by default. Supports $filter (eq, ne, not, ge, le, in, startsWith). Read-only.
    */
  var onPremisesSamAccountName: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Contains the on-premises security identifier (SID) for the group that was synchronized from on-premises to the cloud.
    * Returned by default. Supports $filter (eq including on null values). Read-only.
    */
  var onPremisesSecurityIdentifier: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * true if this group is synced from an on-premises directory; false if this group was originally synced from an
    * on-premises directory but is no longer synced; null if this object has never been synced from an on-premises directory
    * (default). Returned by default. Read-only. Supports $filter (eq, ne, not, in, and eq on null values).
    */
  var onPremisesSyncEnabled: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  var onenote: js.UndefOr[NullableOption[Onenote]] = js.undefined
  
  /**
    * The owners of the group. Limited to 100 owners. Nullable. If this property is not specified when creating a Microsoft
    * 365 group, the calling user is automatically assigned as the group owner. Supports $expand including nested $select.
    * For example,
    * /groups?$filter=startsWith(displayName,'Role')&amp;$select=id,displayName&amp;$expand=owners($select=id,userPrincipalName,displayName).
    */
  var owners: js.UndefOr[NullableOption[js.Array[DirectoryObject]]] = js.undefined
  
  // The permission that has been granted for a group to a specific application. Supports $expand.
  var permissionGrants: js.UndefOr[NullableOption[js.Array[ResourceSpecificPermissionGrant]]] = js.undefined
  
  // The group's profile photo
  var photo: js.UndefOr[NullableOption[ProfilePhoto]] = js.undefined
  
  // The profile photos owned by the group. Read-only. Nullable.
  var photos: js.UndefOr[NullableOption[js.Array[ProfilePhoto]]] = js.undefined
  
  // Entry-point to Planner resource that might exist for a Unified Group.
  var planner: js.UndefOr[NullableOption[PlannerGroup]] = js.undefined
  
  /**
    * The preferred data location for the Microsoft 365 group. By default, the group inherits the group creator's preferred
    * data location. To set this property, the calling user must be assigned one of the following Azure AD roles: Global
    * Administrator User Account Administrator Directory Writer Exchange Administrator SharePoint Administrator For more
    * information about this property, see OneDrive Online Multi-Geo. Nullable. Returned by default.
    */
  var preferredDataLocation: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * The preferred language for a Microsoft 365 group. Should follow ISO 639-1 Code; for example en-US. Returned by default.
    * Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq on null values).
    */
  var preferredLanguage: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Email addresses for the group that direct to the same group mailbox. For example: ['SMTP: bob@contoso.com', 'smtp:
    * bob@sales.contoso.com']. The any operator is required to filter expressions on multi-valued properties. Returned by
    * default. Read-only. Not nullable. Supports $filter (eq, not, ge, le, startsWith, endsWith, and counting empty
    * collections).
    */
  var proxyAddresses: js.UndefOr[js.Array[String]] = js.undefined
  
  // The list of users or groups that are not allowed to create posts or calendar events in this group. Nullable
  var rejectedSenders: js.UndefOr[NullableOption[js.Array[DirectoryObject]]] = js.undefined
  
  /**
    * Timestamp of when the group was last renewed. This cannot be modified directly and is only updated via the renew
    * service action. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC
    * time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Returned by default. Supports $filter (eq, ne,
    * not, ge, le, in). Read-only.
    */
  var renewedDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Specifies whether the group is a security group. Required. Returned by default. Supports $filter (eq, ne, not, in).
  var securityEnabled: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // Security identifier of the group, used in Windows scenarios. Returned by default.
  var securityIdentifier: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Settings that can govern this group's behavior, like whether members can invite guest users to the group. Nullable.
  var settings: js.UndefOr[NullableOption[js.Array[GroupSetting]]] = js.undefined
  
  // The list of SharePoint sites in this group. Access the default site with /sites/root.
  var sites: js.UndefOr[NullableOption[js.Array[Site]]] = js.undefined
  
  // The team associated with this group.
  var team: js.UndefOr[NullableOption[Team]] = js.undefined
  
  /**
    * Specifies a Microsoft 365 group's color theme. Possible values are Teal, Purple, Green, Blue, Pink, Orange or Red.
    * Returned by default.
    */
  var theme: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The group's conversation threads. Nullable.
  var threads: js.UndefOr[NullableOption[js.Array[ConversationThread]]] = js.undefined
  
  // The groups that a group is a member of, either directly and through nested membership. Nullable.
  var transitiveMemberOf: js.UndefOr[NullableOption[js.Array[DirectoryObject]]] = js.undefined
  
  // The direct and transitive members of a group. Nullable.
  var transitiveMembers: js.UndefOr[NullableOption[js.Array[DirectoryObject]]] = js.undefined
  
  /**
    * Count of conversations that have received new posts since the signed-in user last visited the group. Returned only on
    * $select. Supported only on the Get group API (GET /groups/{ID}).
    */
  var unseenCount: js.UndefOr[NullableOption[Double]] = js.undefined
  
  /**
    * Specifies the group join policy and group content visibility for groups. Possible values are: Private, Public, or
    * HiddenMembership. HiddenMembership can be set only for Microsoft 365 groups, when the groups are created. It can't be
    * updated later. Other values of visibility can be updated after group creation. If visibility value is not specified
    * during group creation on Microsoft Graph, a security group is created as Private by default and Microsoft 365 group is
    * Public. Groups assignable to roles are always Private. See group visibility options to learn more. Returned by default.
    * Nullable.
    */
  var visibility: js.UndefOr[NullableOption[String]] = js.undefined
}
object Group {
  
  inline def apply(): Group = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Group]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Group] (val x: Self) extends AnyVal {
    
    inline def setAcceptedSenders(value: NullableOption[js.Array[DirectoryObject]]): Self = StObject.set(x, "acceptedSenders", value.asInstanceOf[js.Any])
    
    inline def setAcceptedSendersNull: Self = StObject.set(x, "acceptedSenders", null)
    
    inline def setAcceptedSendersUndefined: Self = StObject.set(x, "acceptedSenders", js.undefined)
    
    inline def setAcceptedSendersVarargs(value: DirectoryObject*): Self = StObject.set(x, "acceptedSenders", js.Array(value*))
    
    inline def setAllowExternalSenders(value: NullableOption[Boolean]): Self = StObject.set(x, "allowExternalSenders", value.asInstanceOf[js.Any])
    
    inline def setAllowExternalSendersNull: Self = StObject.set(x, "allowExternalSenders", null)
    
    inline def setAllowExternalSendersUndefined: Self = StObject.set(x, "allowExternalSenders", js.undefined)
    
    inline def setAppRoleAssignments(value: NullableOption[js.Array[AppRoleAssignment]]): Self = StObject.set(x, "appRoleAssignments", value.asInstanceOf[js.Any])
    
    inline def setAppRoleAssignmentsNull: Self = StObject.set(x, "appRoleAssignments", null)
    
    inline def setAppRoleAssignmentsUndefined: Self = StObject.set(x, "appRoleAssignments", js.undefined)
    
    inline def setAppRoleAssignmentsVarargs(value: AppRoleAssignment*): Self = StObject.set(x, "appRoleAssignments", js.Array(value*))
    
    inline def setAssignedLabels(value: NullableOption[js.Array[AssignedLabel]]): Self = StObject.set(x, "assignedLabels", value.asInstanceOf[js.Any])
    
    inline def setAssignedLabelsNull: Self = StObject.set(x, "assignedLabels", null)
    
    inline def setAssignedLabelsUndefined: Self = StObject.set(x, "assignedLabels", js.undefined)
    
    inline def setAssignedLabelsVarargs(value: AssignedLabel*): Self = StObject.set(x, "assignedLabels", js.Array(value*))
    
    inline def setAssignedLicenses(value: NullableOption[js.Array[AssignedLicense]]): Self = StObject.set(x, "assignedLicenses", value.asInstanceOf[js.Any])
    
    inline def setAssignedLicensesNull: Self = StObject.set(x, "assignedLicenses", null)
    
    inline def setAssignedLicensesUndefined: Self = StObject.set(x, "assignedLicenses", js.undefined)
    
    inline def setAssignedLicensesVarargs(value: AssignedLicense*): Self = StObject.set(x, "assignedLicenses", js.Array(value*))
    
    inline def setAutoSubscribeNewMembers(value: NullableOption[Boolean]): Self = StObject.set(x, "autoSubscribeNewMembers", value.asInstanceOf[js.Any])
    
    inline def setAutoSubscribeNewMembersNull: Self = StObject.set(x, "autoSubscribeNewMembers", null)
    
    inline def setAutoSubscribeNewMembersUndefined: Self = StObject.set(x, "autoSubscribeNewMembers", js.undefined)
    
    inline def setCalendar(value: NullableOption[Calendar]): Self = StObject.set(x, "calendar", value.asInstanceOf[js.Any])
    
    inline def setCalendarNull: Self = StObject.set(x, "calendar", null)
    
    inline def setCalendarUndefined: Self = StObject.set(x, "calendar", js.undefined)
    
    inline def setCalendarView(value: NullableOption[js.Array[Event]]): Self = StObject.set(x, "calendarView", value.asInstanceOf[js.Any])
    
    inline def setCalendarViewNull: Self = StObject.set(x, "calendarView", null)
    
    inline def setCalendarViewUndefined: Self = StObject.set(x, "calendarView", js.undefined)
    
    inline def setCalendarViewVarargs(value: Event*): Self = StObject.set(x, "calendarView", js.Array(value*))
    
    inline def setClassification(value: NullableOption[String]): Self = StObject.set(x, "classification", value.asInstanceOf[js.Any])
    
    inline def setClassificationNull: Self = StObject.set(x, "classification", null)
    
    inline def setClassificationUndefined: Self = StObject.set(x, "classification", js.undefined)
    
    inline def setConversations(value: NullableOption[js.Array[Conversation]]): Self = StObject.set(x, "conversations", value.asInstanceOf[js.Any])
    
    inline def setConversationsNull: Self = StObject.set(x, "conversations", null)
    
    inline def setConversationsUndefined: Self = StObject.set(x, "conversations", js.undefined)
    
    inline def setConversationsVarargs(value: Conversation*): Self = StObject.set(x, "conversations", js.Array(value*))
    
    inline def setCreatedDateTime(value: NullableOption[String]): Self = StObject.set(x, "createdDateTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedDateTimeNull: Self = StObject.set(x, "createdDateTime", null)
    
    inline def setCreatedDateTimeUndefined: Self = StObject.set(x, "createdDateTime", js.undefined)
    
    inline def setCreatedOnBehalfOf(value: NullableOption[DirectoryObject]): Self = StObject.set(x, "createdOnBehalfOf", value.asInstanceOf[js.Any])
    
    inline def setCreatedOnBehalfOfNull: Self = StObject.set(x, "createdOnBehalfOf", null)
    
    inline def setCreatedOnBehalfOfUndefined: Self = StObject.set(x, "createdOnBehalfOf", js.undefined)
    
    inline def setDescription(value: NullableOption[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setDrive(value: NullableOption[Drive]): Self = StObject.set(x, "drive", value.asInstanceOf[js.Any])
    
    inline def setDriveNull: Self = StObject.set(x, "drive", null)
    
    inline def setDriveUndefined: Self = StObject.set(x, "drive", js.undefined)
    
    inline def setDrives(value: NullableOption[js.Array[Drive]]): Self = StObject.set(x, "drives", value.asInstanceOf[js.Any])
    
    inline def setDrivesNull: Self = StObject.set(x, "drives", null)
    
    inline def setDrivesUndefined: Self = StObject.set(x, "drives", js.undefined)
    
    inline def setDrivesVarargs(value: Drive*): Self = StObject.set(x, "drives", js.Array(value*))
    
    inline def setEvents(value: NullableOption[js.Array[Event]]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsNull: Self = StObject.set(x, "events", null)
    
    inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    inline def setEventsVarargs(value: Event*): Self = StObject.set(x, "events", js.Array(value*))
    
    inline def setExpirationDateTime(value: NullableOption[String]): Self = StObject.set(x, "expirationDateTime", value.asInstanceOf[js.Any])
    
    inline def setExpirationDateTimeNull: Self = StObject.set(x, "expirationDateTime", null)
    
    inline def setExpirationDateTimeUndefined: Self = StObject.set(x, "expirationDateTime", js.undefined)
    
    inline def setExtensions(value: NullableOption[js.Array[Extension]]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
    
    inline def setExtensionsNull: Self = StObject.set(x, "extensions", null)
    
    inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
    
    inline def setExtensionsVarargs(value: Extension*): Self = StObject.set(x, "extensions", js.Array(value*))
    
    inline def setGroupLifecyclePolicies(value: NullableOption[js.Array[GroupLifecyclePolicy]]): Self = StObject.set(x, "groupLifecyclePolicies", value.asInstanceOf[js.Any])
    
    inline def setGroupLifecyclePoliciesNull: Self = StObject.set(x, "groupLifecyclePolicies", null)
    
    inline def setGroupLifecyclePoliciesUndefined: Self = StObject.set(x, "groupLifecyclePolicies", js.undefined)
    
    inline def setGroupLifecyclePoliciesVarargs(value: GroupLifecyclePolicy*): Self = StObject.set(x, "groupLifecyclePolicies", js.Array(value*))
    
    inline def setGroupTypes(value: js.Array[String]): Self = StObject.set(x, "groupTypes", value.asInstanceOf[js.Any])
    
    inline def setGroupTypesUndefined: Self = StObject.set(x, "groupTypes", js.undefined)
    
    inline def setGroupTypesVarargs(value: String*): Self = StObject.set(x, "groupTypes", js.Array(value*))
    
    inline def setHasMembersWithLicenseErrors(value: NullableOption[Boolean]): Self = StObject.set(x, "hasMembersWithLicenseErrors", value.asInstanceOf[js.Any])
    
    inline def setHasMembersWithLicenseErrorsNull: Self = StObject.set(x, "hasMembersWithLicenseErrors", null)
    
    inline def setHasMembersWithLicenseErrorsUndefined: Self = StObject.set(x, "hasMembersWithLicenseErrors", js.undefined)
    
    inline def setHideFromAddressLists(value: NullableOption[Boolean]): Self = StObject.set(x, "hideFromAddressLists", value.asInstanceOf[js.Any])
    
    inline def setHideFromAddressListsNull: Self = StObject.set(x, "hideFromAddressLists", null)
    
    inline def setHideFromAddressListsUndefined: Self = StObject.set(x, "hideFromAddressLists", js.undefined)
    
    inline def setHideFromOutlookClients(value: NullableOption[Boolean]): Self = StObject.set(x, "hideFromOutlookClients", value.asInstanceOf[js.Any])
    
    inline def setHideFromOutlookClientsNull: Self = StObject.set(x, "hideFromOutlookClients", null)
    
    inline def setHideFromOutlookClientsUndefined: Self = StObject.set(x, "hideFromOutlookClients", js.undefined)
    
    inline def setIsArchived(value: NullableOption[Boolean]): Self = StObject.set(x, "isArchived", value.asInstanceOf[js.Any])
    
    inline def setIsArchivedNull: Self = StObject.set(x, "isArchived", null)
    
    inline def setIsArchivedUndefined: Self = StObject.set(x, "isArchived", js.undefined)
    
    inline def setIsAssignableToRole(value: NullableOption[Boolean]): Self = StObject.set(x, "isAssignableToRole", value.asInstanceOf[js.Any])
    
    inline def setIsAssignableToRoleNull: Self = StObject.set(x, "isAssignableToRole", null)
    
    inline def setIsAssignableToRoleUndefined: Self = StObject.set(x, "isAssignableToRole", js.undefined)
    
    inline def setIsSubscribedByMail(value: NullableOption[Boolean]): Self = StObject.set(x, "isSubscribedByMail", value.asInstanceOf[js.Any])
    
    inline def setIsSubscribedByMailNull: Self = StObject.set(x, "isSubscribedByMail", null)
    
    inline def setIsSubscribedByMailUndefined: Self = StObject.set(x, "isSubscribedByMail", js.undefined)
    
    inline def setLicenseProcessingState(value: NullableOption[LicenseProcessingState]): Self = StObject.set(x, "licenseProcessingState", value.asInstanceOf[js.Any])
    
    inline def setLicenseProcessingStateNull: Self = StObject.set(x, "licenseProcessingState", null)
    
    inline def setLicenseProcessingStateUndefined: Self = StObject.set(x, "licenseProcessingState", js.undefined)
    
    inline def setMail(value: NullableOption[String]): Self = StObject.set(x, "mail", value.asInstanceOf[js.Any])
    
    inline def setMailEnabled(value: NullableOption[Boolean]): Self = StObject.set(x, "mailEnabled", value.asInstanceOf[js.Any])
    
    inline def setMailEnabledNull: Self = StObject.set(x, "mailEnabled", null)
    
    inline def setMailEnabledUndefined: Self = StObject.set(x, "mailEnabled", js.undefined)
    
    inline def setMailNickname(value: NullableOption[String]): Self = StObject.set(x, "mailNickname", value.asInstanceOf[js.Any])
    
    inline def setMailNicknameNull: Self = StObject.set(x, "mailNickname", null)
    
    inline def setMailNicknameUndefined: Self = StObject.set(x, "mailNickname", js.undefined)
    
    inline def setMailNull: Self = StObject.set(x, "mail", null)
    
    inline def setMailUndefined: Self = StObject.set(x, "mail", js.undefined)
    
    inline def setMemberOf(value: NullableOption[js.Array[DirectoryObject]]): Self = StObject.set(x, "memberOf", value.asInstanceOf[js.Any])
    
    inline def setMemberOfNull: Self = StObject.set(x, "memberOf", null)
    
    inline def setMemberOfUndefined: Self = StObject.set(x, "memberOf", js.undefined)
    
    inline def setMemberOfVarargs(value: DirectoryObject*): Self = StObject.set(x, "memberOf", js.Array(value*))
    
    inline def setMembers(value: NullableOption[js.Array[DirectoryObject]]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
    
    inline def setMembersNull: Self = StObject.set(x, "members", null)
    
    inline def setMembersUndefined: Self = StObject.set(x, "members", js.undefined)
    
    inline def setMembersVarargs(value: DirectoryObject*): Self = StObject.set(x, "members", js.Array(value*))
    
    inline def setMembersWithLicenseErrors(value: NullableOption[js.Array[DirectoryObject]]): Self = StObject.set(x, "membersWithLicenseErrors", value.asInstanceOf[js.Any])
    
    inline def setMembersWithLicenseErrorsNull: Self = StObject.set(x, "membersWithLicenseErrors", null)
    
    inline def setMembersWithLicenseErrorsUndefined: Self = StObject.set(x, "membersWithLicenseErrors", js.undefined)
    
    inline def setMembersWithLicenseErrorsVarargs(value: DirectoryObject*): Self = StObject.set(x, "membersWithLicenseErrors", js.Array(value*))
    
    inline def setMembershipRule(value: NullableOption[String]): Self = StObject.set(x, "membershipRule", value.asInstanceOf[js.Any])
    
    inline def setMembershipRuleNull: Self = StObject.set(x, "membershipRule", null)
    
    inline def setMembershipRuleProcessingState(value: NullableOption[String]): Self = StObject.set(x, "membershipRuleProcessingState", value.asInstanceOf[js.Any])
    
    inline def setMembershipRuleProcessingStateNull: Self = StObject.set(x, "membershipRuleProcessingState", null)
    
    inline def setMembershipRuleProcessingStateUndefined: Self = StObject.set(x, "membershipRuleProcessingState", js.undefined)
    
    inline def setMembershipRuleUndefined: Self = StObject.set(x, "membershipRule", js.undefined)
    
    inline def setOnPremisesDomainName(value: NullableOption[String]): Self = StObject.set(x, "onPremisesDomainName", value.asInstanceOf[js.Any])
    
    inline def setOnPremisesDomainNameNull: Self = StObject.set(x, "onPremisesDomainName", null)
    
    inline def setOnPremisesDomainNameUndefined: Self = StObject.set(x, "onPremisesDomainName", js.undefined)
    
    inline def setOnPremisesLastSyncDateTime(value: NullableOption[String]): Self = StObject.set(x, "onPremisesLastSyncDateTime", value.asInstanceOf[js.Any])
    
    inline def setOnPremisesLastSyncDateTimeNull: Self = StObject.set(x, "onPremisesLastSyncDateTime", null)
    
    inline def setOnPremisesLastSyncDateTimeUndefined: Self = StObject.set(x, "onPremisesLastSyncDateTime", js.undefined)
    
    inline def setOnPremisesNetBiosName(value: NullableOption[String]): Self = StObject.set(x, "onPremisesNetBiosName", value.asInstanceOf[js.Any])
    
    inline def setOnPremisesNetBiosNameNull: Self = StObject.set(x, "onPremisesNetBiosName", null)
    
    inline def setOnPremisesNetBiosNameUndefined: Self = StObject.set(x, "onPremisesNetBiosName", js.undefined)
    
    inline def setOnPremisesProvisioningErrors(value: NullableOption[js.Array[OnPremisesProvisioningError]]): Self = StObject.set(x, "onPremisesProvisioningErrors", value.asInstanceOf[js.Any])
    
    inline def setOnPremisesProvisioningErrorsNull: Self = StObject.set(x, "onPremisesProvisioningErrors", null)
    
    inline def setOnPremisesProvisioningErrorsUndefined: Self = StObject.set(x, "onPremisesProvisioningErrors", js.undefined)
    
    inline def setOnPremisesProvisioningErrorsVarargs(value: OnPremisesProvisioningError*): Self = StObject.set(x, "onPremisesProvisioningErrors", js.Array(value*))
    
    inline def setOnPremisesSamAccountName(value: NullableOption[String]): Self = StObject.set(x, "onPremisesSamAccountName", value.asInstanceOf[js.Any])
    
    inline def setOnPremisesSamAccountNameNull: Self = StObject.set(x, "onPremisesSamAccountName", null)
    
    inline def setOnPremisesSamAccountNameUndefined: Self = StObject.set(x, "onPremisesSamAccountName", js.undefined)
    
    inline def setOnPremisesSecurityIdentifier(value: NullableOption[String]): Self = StObject.set(x, "onPremisesSecurityIdentifier", value.asInstanceOf[js.Any])
    
    inline def setOnPremisesSecurityIdentifierNull: Self = StObject.set(x, "onPremisesSecurityIdentifier", null)
    
    inline def setOnPremisesSecurityIdentifierUndefined: Self = StObject.set(x, "onPremisesSecurityIdentifier", js.undefined)
    
    inline def setOnPremisesSyncEnabled(value: NullableOption[Boolean]): Self = StObject.set(x, "onPremisesSyncEnabled", value.asInstanceOf[js.Any])
    
    inline def setOnPremisesSyncEnabledNull: Self = StObject.set(x, "onPremisesSyncEnabled", null)
    
    inline def setOnPremisesSyncEnabledUndefined: Self = StObject.set(x, "onPremisesSyncEnabled", js.undefined)
    
    inline def setOnenote(value: NullableOption[Onenote]): Self = StObject.set(x, "onenote", value.asInstanceOf[js.Any])
    
    inline def setOnenoteNull: Self = StObject.set(x, "onenote", null)
    
    inline def setOnenoteUndefined: Self = StObject.set(x, "onenote", js.undefined)
    
    inline def setOwners(value: NullableOption[js.Array[DirectoryObject]]): Self = StObject.set(x, "owners", value.asInstanceOf[js.Any])
    
    inline def setOwnersNull: Self = StObject.set(x, "owners", null)
    
    inline def setOwnersUndefined: Self = StObject.set(x, "owners", js.undefined)
    
    inline def setOwnersVarargs(value: DirectoryObject*): Self = StObject.set(x, "owners", js.Array(value*))
    
    inline def setPermissionGrants(value: NullableOption[js.Array[ResourceSpecificPermissionGrant]]): Self = StObject.set(x, "permissionGrants", value.asInstanceOf[js.Any])
    
    inline def setPermissionGrantsNull: Self = StObject.set(x, "permissionGrants", null)
    
    inline def setPermissionGrantsUndefined: Self = StObject.set(x, "permissionGrants", js.undefined)
    
    inline def setPermissionGrantsVarargs(value: ResourceSpecificPermissionGrant*): Self = StObject.set(x, "permissionGrants", js.Array(value*))
    
    inline def setPhoto(value: NullableOption[ProfilePhoto]): Self = StObject.set(x, "photo", value.asInstanceOf[js.Any])
    
    inline def setPhotoNull: Self = StObject.set(x, "photo", null)
    
    inline def setPhotoUndefined: Self = StObject.set(x, "photo", js.undefined)
    
    inline def setPhotos(value: NullableOption[js.Array[ProfilePhoto]]): Self = StObject.set(x, "photos", value.asInstanceOf[js.Any])
    
    inline def setPhotosNull: Self = StObject.set(x, "photos", null)
    
    inline def setPhotosUndefined: Self = StObject.set(x, "photos", js.undefined)
    
    inline def setPhotosVarargs(value: ProfilePhoto*): Self = StObject.set(x, "photos", js.Array(value*))
    
    inline def setPlanner(value: NullableOption[PlannerGroup]): Self = StObject.set(x, "planner", value.asInstanceOf[js.Any])
    
    inline def setPlannerNull: Self = StObject.set(x, "planner", null)
    
    inline def setPlannerUndefined: Self = StObject.set(x, "planner", js.undefined)
    
    inline def setPreferredDataLocation(value: NullableOption[String]): Self = StObject.set(x, "preferredDataLocation", value.asInstanceOf[js.Any])
    
    inline def setPreferredDataLocationNull: Self = StObject.set(x, "preferredDataLocation", null)
    
    inline def setPreferredDataLocationUndefined: Self = StObject.set(x, "preferredDataLocation", js.undefined)
    
    inline def setPreferredLanguage(value: NullableOption[String]): Self = StObject.set(x, "preferredLanguage", value.asInstanceOf[js.Any])
    
    inline def setPreferredLanguageNull: Self = StObject.set(x, "preferredLanguage", null)
    
    inline def setPreferredLanguageUndefined: Self = StObject.set(x, "preferredLanguage", js.undefined)
    
    inline def setProxyAddresses(value: js.Array[String]): Self = StObject.set(x, "proxyAddresses", value.asInstanceOf[js.Any])
    
    inline def setProxyAddressesUndefined: Self = StObject.set(x, "proxyAddresses", js.undefined)
    
    inline def setProxyAddressesVarargs(value: String*): Self = StObject.set(x, "proxyAddresses", js.Array(value*))
    
    inline def setRejectedSenders(value: NullableOption[js.Array[DirectoryObject]]): Self = StObject.set(x, "rejectedSenders", value.asInstanceOf[js.Any])
    
    inline def setRejectedSendersNull: Self = StObject.set(x, "rejectedSenders", null)
    
    inline def setRejectedSendersUndefined: Self = StObject.set(x, "rejectedSenders", js.undefined)
    
    inline def setRejectedSendersVarargs(value: DirectoryObject*): Self = StObject.set(x, "rejectedSenders", js.Array(value*))
    
    inline def setRenewedDateTime(value: NullableOption[String]): Self = StObject.set(x, "renewedDateTime", value.asInstanceOf[js.Any])
    
    inline def setRenewedDateTimeNull: Self = StObject.set(x, "renewedDateTime", null)
    
    inline def setRenewedDateTimeUndefined: Self = StObject.set(x, "renewedDateTime", js.undefined)
    
    inline def setSecurityEnabled(value: NullableOption[Boolean]): Self = StObject.set(x, "securityEnabled", value.asInstanceOf[js.Any])
    
    inline def setSecurityEnabledNull: Self = StObject.set(x, "securityEnabled", null)
    
    inline def setSecurityEnabledUndefined: Self = StObject.set(x, "securityEnabled", js.undefined)
    
    inline def setSecurityIdentifier(value: NullableOption[String]): Self = StObject.set(x, "securityIdentifier", value.asInstanceOf[js.Any])
    
    inline def setSecurityIdentifierNull: Self = StObject.set(x, "securityIdentifier", null)
    
    inline def setSecurityIdentifierUndefined: Self = StObject.set(x, "securityIdentifier", js.undefined)
    
    inline def setSettings(value: NullableOption[js.Array[GroupSetting]]): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    
    inline def setSettingsNull: Self = StObject.set(x, "settings", null)
    
    inline def setSettingsUndefined: Self = StObject.set(x, "settings", js.undefined)
    
    inline def setSettingsVarargs(value: GroupSetting*): Self = StObject.set(x, "settings", js.Array(value*))
    
    inline def setSites(value: NullableOption[js.Array[Site]]): Self = StObject.set(x, "sites", value.asInstanceOf[js.Any])
    
    inline def setSitesNull: Self = StObject.set(x, "sites", null)
    
    inline def setSitesUndefined: Self = StObject.set(x, "sites", js.undefined)
    
    inline def setSitesVarargs(value: Site*): Self = StObject.set(x, "sites", js.Array(value*))
    
    inline def setTeam(value: NullableOption[Team]): Self = StObject.set(x, "team", value.asInstanceOf[js.Any])
    
    inline def setTeamNull: Self = StObject.set(x, "team", null)
    
    inline def setTeamUndefined: Self = StObject.set(x, "team", js.undefined)
    
    inline def setTheme(value: NullableOption[String]): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeNull: Self = StObject.set(x, "theme", null)
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    inline def setThreads(value: NullableOption[js.Array[ConversationThread]]): Self = StObject.set(x, "threads", value.asInstanceOf[js.Any])
    
    inline def setThreadsNull: Self = StObject.set(x, "threads", null)
    
    inline def setThreadsUndefined: Self = StObject.set(x, "threads", js.undefined)
    
    inline def setThreadsVarargs(value: ConversationThread*): Self = StObject.set(x, "threads", js.Array(value*))
    
    inline def setTransitiveMemberOf(value: NullableOption[js.Array[DirectoryObject]]): Self = StObject.set(x, "transitiveMemberOf", value.asInstanceOf[js.Any])
    
    inline def setTransitiveMemberOfNull: Self = StObject.set(x, "transitiveMemberOf", null)
    
    inline def setTransitiveMemberOfUndefined: Self = StObject.set(x, "transitiveMemberOf", js.undefined)
    
    inline def setTransitiveMemberOfVarargs(value: DirectoryObject*): Self = StObject.set(x, "transitiveMemberOf", js.Array(value*))
    
    inline def setTransitiveMembers(value: NullableOption[js.Array[DirectoryObject]]): Self = StObject.set(x, "transitiveMembers", value.asInstanceOf[js.Any])
    
    inline def setTransitiveMembersNull: Self = StObject.set(x, "transitiveMembers", null)
    
    inline def setTransitiveMembersUndefined: Self = StObject.set(x, "transitiveMembers", js.undefined)
    
    inline def setTransitiveMembersVarargs(value: DirectoryObject*): Self = StObject.set(x, "transitiveMembers", js.Array(value*))
    
    inline def setUnseenCount(value: NullableOption[Double]): Self = StObject.set(x, "unseenCount", value.asInstanceOf[js.Any])
    
    inline def setUnseenCountNull: Self = StObject.set(x, "unseenCount", null)
    
    inline def setUnseenCountUndefined: Self = StObject.set(x, "unseenCount", js.undefined)
    
    inline def setVisibility(value: NullableOption[String]): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
    
    inline def setVisibilityNull: Self = StObject.set(x, "visibility", null)
    
    inline def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
  }
}
