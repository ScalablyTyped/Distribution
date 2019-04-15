package typings
package atOctokitRestLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_AddOrUpdateMembership extends js.Object {
  /**
    * Only authenticated organization owners can add a member to the organization or update the member's role.
    *
    * *   If the authenticated user is _adding_ a member to the organization, the invited user will receive an email inviting them to the organization. The user's [membership status](#get-organization-membership) will be `pending` until they accept the invitation.
    *
    * *   Authenticated users can _update_ a user's membership by passing the `role` parameter. If the authenticated user changes a member's role to `admin`, the affected user will receive an email notifying them that they've been made an organization owner. If the authenticated user changes an owner's role to `member`, no email will be sent.
    *
    * **Rate limits**
    *
    * To prevent abuse, the authenticated user is limited to 50 organization invitations per 24 hour period. If the organization is more than one month old or on a paid plan, the limit is 500 invitations per 24 hour period.
    */
  @JSName("addOrUpdateMembership")
  var addOrUpdateMembership_Original: Anon_EndpointParamsAnyResponseOrgsAddOrUpdateMembershipParams = js.native
  @JSName("blockUser")
  var blockUser_Original: Anon_EndpointParamsOrgsBlockUserParams = js.native
  /**
    * If the user is blocked:
    *
    * If the user is not blocked:
    */
  @JSName("checkBlockedUser")
  var checkBlockedUser_Original: Anon_EndpointParamsOrgsCheckBlockedUserParams = js.native
  /**
    * Check if a user is, publicly or privately, a member of the organization.
    */
  @JSName("checkMembership")
  var checkMembership_Original: Anon_EndpointParamsAnyResponseOrgsCheckMembershipParams = js.native
  @JSName("checkPublicMembership")
  var checkPublicMembership_Original: Anon_EndpointParamsAnyResponseOrgsCheckPublicMembershipParams = js.native
  @JSName("concealMembership")
  var concealMembership_Original: Anon_EndpointParamsOrgsConcealMembershipParams = js.native
  /**
    * When an organization member is converted to an outside collaborator, they'll only have access to the repositories that their current team membership allows. The user will no longer be a member of the organization. For more information, see "[Converting an organization member to an outside collaborator](https://help.github.com/articles/converting-an-organization-member-to-an-outside-collaborator/)".
    */
  @JSName("convertMemberToOutsideCollaborator")
  var convertMemberToOutsideCollaborator_Original: Anon_EndpointParamsOrgsConvertMemberToOutsideCollaboratorParams = js.native
  /**
    * Here's how you can create a hook that posts payloads in JSON format:
    */
  @JSName("createHook")
  var createHook_Original: Anon_EndpointParamsOrgsCreateHookParams = js.native
  /**
    * Invite people to an organization by using their GitHub user ID or their email address. In order to create invitations in an organization, the authenticated user must be an organization owner.
    *
    * This endpoint triggers [notifications](https://help.github.com/articles/about-notifications/). Creating content too quickly using this endpoint may result in abuse rate limiting. See "[Abuse rate limits](https://developer.github.com/v3/#abuse-rate-limits)" and "[Dealing with abuse rate limits](https://developer.github.com/v3/guides/best-practices-for-integrators/#dealing-with-abuse-rate-limits)" for details.
    */
  @JSName("createInvitation")
  var createInvitation_Original: Anon_EndpointParamsOrgsCreateInvitationParams = js.native
  @JSName("deleteHook")
  var deleteHook_Original: Anon_EndpointParamsOrgsDeleteHookParams = js.native
  @JSName("getHook")
  var getHook_Original: Anon_EndpointParamsOrgsGetHookParams = js.native
  @JSName("getMembershipForAuthenticatedUser")
  var getMembershipForAuthenticatedUser_Original: Anon_EndpointParamsOrgsGetMembershipForAuthenticatedUserParams = js.native
  /**
    * In order to get a user's membership with an organization, the authenticated user must be an organization member.
    */
  @JSName("getMembership")
  var getMembership_Original: Anon_EndpointParamsAnyResponseOrgsGetMembershipParams = js.native
  /**
    * To see many of the organization response values, you need to be an authenticated organization owner with the `admin:org` scope. When the value of `two_factor_requirement_enabled` is `true`, the organization requires all members, billing managers, and outside collaborators to enable [two-factor authentication](https://help.github.com/articles/securing-your-account-with-two-factor-authentication-2fa/).
    */
  @JSName("get")
  var get_Original: Anon_EndpointParamsOrgsGetParams = js.native
  /**
    * List the users blocked by an organization.
    */
  @JSName("listBlockedUsers")
  var listBlockedUsers_Original: Anon_EndpointParamsOrgsListBlockedUsersParams = js.native
  /**
    * List organizations for the authenticated user.
    *
    * **OAuth scope requirements**
    *
    * This only lists organizations that your authorization allows you to operate on in some way (e.g., you can list teams with `read:org` scope, you can publicize your organization membership with `user` scope, etc.). Therefore, this API requires at least `user` or `read:org` scope. OAuth requests with insufficient scope receive a `403 Forbidden` response.
    */
  @JSName("listForAuthenticatedUser")
  var listForAuthenticatedUser_Original: Anon_EndpointParamsOrgsListForAuthenticatedUserParams = js.native
  /**
    * List [public organization memberships](https://help.github.com/articles/publicizing-or-concealing-organization-membership) for the specified user.
    *
    * This method only lists _public_ memberships, regardless of authentication. If you need to fetch all of the organization memberships (public and private) for the authenticated user, use the [List your organizations](#list-your-organizations) API instead.
    */
  @JSName("listForUser")
  var listForUser_Original: Anon_EndpointParamsOrgsListForUserParams = js.native
  @JSName("listHooks")
  var listHooks_Original: Anon_EndpointParamsOrgsListHooksParams = js.native
  /**
    * List all teams associated with an invitation. In order to see invitations in an organization, the authenticated user must be an organization owner.
    */
  @JSName("listInvitationTeams")
  var listInvitationTeams_Original: Anon_EndpointParamsOrgsListInvitationTeamsParams = js.native
  /**
    * List all users who are members of an organization. If the authenticated user is also a member of this organization then both concealed and public members will be returned.
    */
  @JSName("listMembers")
  var listMembers_Original: Anon_EndpointParamsOrgsListMembersParams = js.native
  @JSName("listMemberships")
  var listMemberships_Original: Anon_EndpointParamsOrgsListMembershipsParams = js.native
  /**
    * List all users who are outside collaborators of an organization.
    */
  @JSName("listOutsideCollaborators")
  var listOutsideCollaborators_Original: Anon_EndpointParamsOrgsListOutsideCollaboratorsParams = js.native
  /**
    * The return hash contains a `role` field which refers to the Organization Invitation role and will be one of the following values: `direct_member`, `admin`, `billing_manager`, `hiring_manager`, or `reinstate`. If the invitee is not a GitHub member, the `login` field in the return hash will be `null`.
    */
  @JSName("listPendingInvitations")
  var listPendingInvitations_Original: Anon_EndpointParamsOrgsListPendingInvitationsParams = js.native
  /**
    * Members of an organization can choose to have their membership publicized or not.
    */
  @JSName("listPublicMembers")
  var listPublicMembers_Original: Anon_EndpointParamsOrgsListPublicMembersParams = js.native
  /**
    * Lists all organizations, in the order that they were created on GitHub.
    *
    * **Note:** Pagination is powered exclusively by the `since` parameter. Use the [Link header](https://developer.github.com/v3/#link-header) to get the URL for the next page of organizations.
    */
  @JSName("list")
  var list_Original: Anon_EndpointParamsOrgsListParams = js.native
  /**
    * This will trigger a [ping event](https://developer.github.com/webhooks/#ping-event) to be sent to the hook.
    */
  @JSName("pingHook")
  var pingHook_Original: Anon_EndpointParamsOrgsPingHookParams = js.native
  /**
    * The user can publicize their own membership. (A user cannot publicize the membership for another user.)
    *
    * Note that you'll need to set `Content-Length` to zero when calling out to this endpoint. For more information, see "[HTTP verbs](https://developer.github.com/v3/#http-verbs)."
    */
  @JSName("publicizeMembership")
  var publicizeMembership_Original: Anon_EndpointParamsOrgsPublicizeMembershipParams = js.native
  /**
    * Removing a user from this list will remove them from all teams and they will no longer have any access to the organization's repositories.
    */
  @JSName("removeMember")
  var removeMember_Original: Anon_EndpointParamsOrgsRemoveMemberParams = js.native
  /**
    * In order to remove a user's membership with an organization, the authenticated user must be an organization owner.
    *
    * If the specified user is an active member of the organization, this will remove them from the organization. If the specified user has been invited to the organization, this will cancel their invitation. The specified user will receive an email notification in both cases.
    */
  @JSName("removeMembership")
  var removeMembership_Original: Anon_EndpointParamsOrgsRemoveMembershipParams = js.native
  /**
    * Removing a user from this list will remove them from all the organization's repositories.
    */
  @JSName("removeOutsideCollaborator")
  var removeOutsideCollaborator_Original: Anon_EndpointParamsOrgsRemoveOutsideCollaboratorParams = js.native
  @JSName("unblockUser")
  var unblockUser_Original: Anon_EndpointParamsOrgsUnblockUserParams = js.native
  @JSName("updateHook")
  var updateHook_Original: Anon_EndpointParamsOrgsUpdateHookParams = js.native
  @JSName("updateMembership")
  var updateMembership_Original: Anon_EndpointParamsOrgsUpdateMembershipParams = js.native
  /**
    * **Note:** The new `members_allowed_repository_creation_type` replaces the functionality of `members_can_create_repositories`.
    *
    * Setting `members_allowed_repository_creation_type` will override the value of `members_can_create_repositories` in the following ways:
    *
    * *   Setting `members_allowed_repository_creation_type` to `all` or `private` sets `members_can_create_repositories` to `true`.
    * *   Setting `members_allowed_repository_creation_type` to `none` sets `members_can_create_repositories` to `false`.
    * *   If you omit `members_allowed_repository_creation_type`, `members_can_create_repositories` is not modified.
    */
  @JSName("update")
  var update_Original: Anon_EndpointParamsOrgsUpdateParams = js.native
  /**
    * Only authenticated organization owners can add a member to the organization or update the member's role.
    *
    * *   If the authenticated user is _adding_ a member to the organization, the invited user will receive an email inviting them to the organization. The user's [membership status](#get-organization-membership) will be `pending` until they accept the invitation.
    *
    * *   Authenticated users can _update_ a user's membership by passing the `role` parameter. If the authenticated user changes a member's role to `admin`, the affected user will receive an email notifying them that they've been made an organization owner. If the authenticated user changes an owner's role to `member`, no email will be sent.
    *
    * **Rate limits**
    *
    * To prevent abuse, the authenticated user is limited to 50 organization invitations per 24 hour period. If the organization is more than one month old or on a paid plan, the limit is 500 invitations per 24 hour period.
    */
  def addOrUpdateMembership(): js.Promise[atOctokitRestLib.atOctokitRestMod.AnyResponse] = js.native
  def addOrUpdateMembership(params: atOctokitRestLib.atOctokitRestMod.OrgsAddOrUpdateMembershipParams): js.Promise[atOctokitRestLib.atOctokitRestMod.AnyResponse] = js.native
  def blockUser(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.OrgsBlockUserResponse]
  ] = js.native
  def blockUser(params: atOctokitRestLib.atOctokitRestMod.OrgsBlockUserParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.OrgsBlockUserResponse]
  ] = js.native
  /**
    * If the user is blocked:
    *
    * If the user is not blocked:
    */
  def checkBlockedUser(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.OrgsCheckBlockedUserResponse]
  ] = js.native
  def checkBlockedUser(params: atOctokitRestLib.atOctokitRestMod.OrgsCheckBlockedUserParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.OrgsCheckBlockedUserResponse]
  ] = js.native
  /**
    * Check if a user is, publicly or privately, a member of the organization.
    */
  def checkMembership(): js.Promise[atOctokitRestLib.atOctokitRestMod.AnyResponse] = js.native
  def checkMembership(params: atOctokitRestLib.atOctokitRestMod.OrgsCheckMembershipParams): js.Promise[atOctokitRestLib.atOctokitRestMod.AnyResponse] = js.native
  def checkPublicMembership(): js.Promise[atOctokitRestLib.atOctokitRestMod.AnyResponse] = js.native
  def checkPublicMembership(params: atOctokitRestLib.atOctokitRestMod.OrgsCheckPublicMembershipParams): js.Promise[atOctokitRestLib.atOctokitRestMod.AnyResponse] = js.native
  def concealMembership(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.OrgsConcealMembershipResponse]
  ] = js.native
  def concealMembership(params: atOctokitRestLib.atOctokitRestMod.OrgsConcealMembershipParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.OrgsConcealMembershipResponse]
  ] = js.native
  /**
    * When an organization member is converted to an outside collaborator, they'll only have access to the repositories that their current team membership allows. The user will no longer be a member of the organization. For more information, see "[Converting an organization member to an outside collaborator](https://help.github.com/articles/converting-an-organization-member-to-an-outside-collaborator/)".
    */
  def convertMemberToOutsideCollaborator(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.OrgsConvertMemberToOutsideCollaboratorResponse]
  ] = js.native
  def convertMemberToOutsideCollaborator(params: atOctokitRestLib.atOctokitRestMod.OrgsConvertMemberToOutsideCollaboratorParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.OrgsConvertMemberToOutsideCollaboratorResponse]
  ] = js.native
  /**
    * Here's how you can create a hook that posts payloads in JSON format:
    */
  def createHook(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.OrgsCreateHookResponse]
  ] = js.native
  def createHook(params: atOctokitRestLib.atOctokitRestMod.OrgsCreateHookParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.OrgsCreateHookResponse]
  ] = js.native
  /**
    * Invite people to an organization by using their GitHub user ID or their email address. In order to create invitations in an organization, the authenticated user must be an organization owner.
    *
    * This endpoint triggers [notifications](https://help.github.com/articles/about-notifications/). Creating content too quickly using this endpoint may result in abuse rate limiting. See "[Abuse rate limits](https://developer.github.com/v3/#abuse-rate-limits)" and "[Dealing with abuse rate limits](https://developer.github.com/v3/guides/best-practices-for-integrators/#dealing-with-abuse-rate-limits)" for details.
    */
  def createInvitation(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.OrgsCreateInvitationResponse]
  ] = js.native
  def createInvitation(params: atOctokitRestLib.atOctokitRestMod.OrgsCreateInvitationParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.OrgsCreateInvitationResponse]
  ] = js.native
  def deleteHook(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.OrgsDeleteHookResponse]
  ] = js.native
  def deleteHook(params: atOctokitRestLib.atOctokitRestMod.OrgsDeleteHookParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.OrgsDeleteHookResponse]
  ] = js.native
  /**
    * To see many of the organization response values, you need to be an authenticated organization owner with the `admin:org` scope. When the value of `two_factor_requirement_enabled` is `true`, the organization requires all members, billing managers, and outside collaborators to enable [two-factor authentication](https://help.github.com/articles/securing-your-account-with-two-factor-authentication-2fa/).
    */
  def get(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.OrgsGetResponse]
  ] = js.native
  def get(params: atOctokitRestLib.atOctokitRestMod.OrgsGetParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.OrgsGetResponse]
  ] = js.native
  def getHook(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.OrgsGetHookResponse]
  ] = js.native
  def getHook(params: atOctokitRestLib.atOctokitRestMod.OrgsGetHookParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.OrgsGetHookResponse]
  ] = js.native
  /**
    * In order to get a user's membership with an organization, the authenticated user must be an organization member.
    */
  def getMembership(): js.Promise[atOctokitRestLib.atOctokitRestMod.AnyResponse] = js.native
  def getMembership(params: atOctokitRestLib.atOctokitRestMod.OrgsGetMembershipParams): js.Promise[atOctokitRestLib.atOctokitRestMod.AnyResponse] = js.native
  def getMembershipForAuthenticatedUser(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.OrgsGetMembershipForAuthenticatedUserResponse]
  ] = js.native
  def getMembershipForAuthenticatedUser(params: atOctokitRestLib.atOctokitRestMod.OrgsGetMembershipForAuthenticatedUserParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.OrgsGetMembershipForAuthenticatedUserResponse]
  ] = js.native
  /**
    * Lists all organizations, in the order that they were created on GitHub.
    *
    * **Note:** Pagination is powered exclusively by the `since` parameter. Use the [Link header](https://developer.github.com/v3/#link-header) to get the URL for the next page of organizations.
    */
  def list(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.OrgsListResponse]
  ] = js.native
  def list(params: atOctokitRestLib.atOctokitRestMod.OrgsListParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.OrgsListResponse]
  ] = js.native
  /**
    * List the users blocked by an organization.
    */
  def listBlockedUsers(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.OrgsListBlockedUsersResponse]
  ] = js.native
  def listBlockedUsers(params: atOctokitRestLib.atOctokitRestMod.OrgsListBlockedUsersParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.OrgsListBlockedUsersResponse]
  ] = js.native
  /**
    * List organizations for the authenticated user.
    *
    * **OAuth scope requirements**
    *
    * This only lists organizations that your authorization allows you to operate on in some way (e.g., you can list teams with `read:org` scope, you can publicize your organization membership with `user` scope, etc.). Therefore, this API requires at least `user` or `read:org` scope. OAuth requests with insufficient scope receive a `403 Forbidden` response.
    */
  def listForAuthenticatedUser(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.OrgsListForAuthenticatedUserResponse]
  ] = js.native
  def listForAuthenticatedUser(params: atOctokitRestLib.atOctokitRestMod.OrgsListForAuthenticatedUserParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.OrgsListForAuthenticatedUserResponse]
  ] = js.native
  /**
    * List [public organization memberships](https://help.github.com/articles/publicizing-or-concealing-organization-membership) for the specified user.
    *
    * This method only lists _public_ memberships, regardless of authentication. If you need to fetch all of the organization memberships (public and private) for the authenticated user, use the [List your organizations](#list-your-organizations) API instead.
    */
  def listForUser(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.OrgsListForUserResponse]
  ] = js.native
  def listForUser(params: atOctokitRestLib.atOctokitRestMod.OrgsListForUserParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.OrgsListForUserResponse]
  ] = js.native
  def listHooks(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.OrgsListHooksResponse]
  ] = js.native
  def listHooks(params: atOctokitRestLib.atOctokitRestMod.OrgsListHooksParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.OrgsListHooksResponse]
  ] = js.native
  /**
    * List all teams associated with an invitation. In order to see invitations in an organization, the authenticated user must be an organization owner.
    */
  def listInvitationTeams(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.OrgsListInvitationTeamsResponse]
  ] = js.native
  def listInvitationTeams(params: atOctokitRestLib.atOctokitRestMod.OrgsListInvitationTeamsParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.OrgsListInvitationTeamsResponse]
  ] = js.native
  /**
    * List all users who are members of an organization. If the authenticated user is also a member of this organization then both concealed and public members will be returned.
    */
  def listMembers(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.OrgsListMembersResponse]
  ] = js.native
  def listMembers(params: atOctokitRestLib.atOctokitRestMod.OrgsListMembersParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.OrgsListMembersResponse]
  ] = js.native
  def listMemberships(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.OrgsListMembershipsResponse]
  ] = js.native
  def listMemberships(params: atOctokitRestLib.atOctokitRestMod.OrgsListMembershipsParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.OrgsListMembershipsResponse]
  ] = js.native
  /**
    * List all users who are outside collaborators of an organization.
    */
  def listOutsideCollaborators(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.OrgsListOutsideCollaboratorsResponse]
  ] = js.native
  def listOutsideCollaborators(params: atOctokitRestLib.atOctokitRestMod.OrgsListOutsideCollaboratorsParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.OrgsListOutsideCollaboratorsResponse]
  ] = js.native
  /**
    * The return hash contains a `role` field which refers to the Organization Invitation role and will be one of the following values: `direct_member`, `admin`, `billing_manager`, `hiring_manager`, or `reinstate`. If the invitee is not a GitHub member, the `login` field in the return hash will be `null`.
    */
  def listPendingInvitations(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.OrgsListPendingInvitationsResponse]
  ] = js.native
  def listPendingInvitations(params: atOctokitRestLib.atOctokitRestMod.OrgsListPendingInvitationsParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.OrgsListPendingInvitationsResponse]
  ] = js.native
  /**
    * Members of an organization can choose to have their membership publicized or not.
    */
  def listPublicMembers(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.OrgsListPublicMembersResponse]
  ] = js.native
  def listPublicMembers(params: atOctokitRestLib.atOctokitRestMod.OrgsListPublicMembersParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.OrgsListPublicMembersResponse]
  ] = js.native
  /**
    * This will trigger a [ping event](https://developer.github.com/webhooks/#ping-event) to be sent to the hook.
    */
  def pingHook(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.OrgsPingHookResponse]
  ] = js.native
  def pingHook(params: atOctokitRestLib.atOctokitRestMod.OrgsPingHookParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.OrgsPingHookResponse]
  ] = js.native
  /**
    * The user can publicize their own membership. (A user cannot publicize the membership for another user.)
    *
    * Note that you'll need to set `Content-Length` to zero when calling out to this endpoint. For more information, see "[HTTP verbs](https://developer.github.com/v3/#http-verbs)."
    */
  def publicizeMembership(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.OrgsPublicizeMembershipResponse]
  ] = js.native
  def publicizeMembership(params: atOctokitRestLib.atOctokitRestMod.OrgsPublicizeMembershipParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.OrgsPublicizeMembershipResponse]
  ] = js.native
  /**
    * Removing a user from this list will remove them from all teams and they will no longer have any access to the organization's repositories.
    */
  def removeMember(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.OrgsRemoveMemberResponse]
  ] = js.native
  def removeMember(params: atOctokitRestLib.atOctokitRestMod.OrgsRemoveMemberParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.OrgsRemoveMemberResponse]
  ] = js.native
  /**
    * In order to remove a user's membership with an organization, the authenticated user must be an organization owner.
    *
    * If the specified user is an active member of the organization, this will remove them from the organization. If the specified user has been invited to the organization, this will cancel their invitation. The specified user will receive an email notification in both cases.
    */
  def removeMembership(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.OrgsRemoveMembershipResponse]
  ] = js.native
  def removeMembership(params: atOctokitRestLib.atOctokitRestMod.OrgsRemoveMembershipParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.OrgsRemoveMembershipResponse]
  ] = js.native
  /**
    * Removing a user from this list will remove them from all the organization's repositories.
    */
  def removeOutsideCollaborator(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.OrgsRemoveOutsideCollaboratorResponse]
  ] = js.native
  def removeOutsideCollaborator(params: atOctokitRestLib.atOctokitRestMod.OrgsRemoveOutsideCollaboratorParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.OrgsRemoveOutsideCollaboratorResponse]
  ] = js.native
  def unblockUser(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.OrgsUnblockUserResponse]
  ] = js.native
  def unblockUser(params: atOctokitRestLib.atOctokitRestMod.OrgsUnblockUserParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.OrgsUnblockUserResponse]
  ] = js.native
  /**
    * **Note:** The new `members_allowed_repository_creation_type` replaces the functionality of `members_can_create_repositories`.
    *
    * Setting `members_allowed_repository_creation_type` will override the value of `members_can_create_repositories` in the following ways:
    *
    * *   Setting `members_allowed_repository_creation_type` to `all` or `private` sets `members_can_create_repositories` to `true`.
    * *   Setting `members_allowed_repository_creation_type` to `none` sets `members_can_create_repositories` to `false`.
    * *   If you omit `members_allowed_repository_creation_type`, `members_can_create_repositories` is not modified.
    */
  def update(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.OrgsUpdateResponse]
  ] = js.native
  def update(params: atOctokitRestLib.atOctokitRestMod.OrgsUpdateParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.OrgsUpdateResponse]
  ] = js.native
  def updateHook(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.OrgsUpdateHookResponse]
  ] = js.native
  def updateHook(params: atOctokitRestLib.atOctokitRestMod.OrgsUpdateHookParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.OrgsUpdateHookResponse]
  ] = js.native
  def updateMembership(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.OrgsUpdateMembershipResponse]
  ] = js.native
  def updateMembership(params: atOctokitRestLib.atOctokitRestMod.OrgsUpdateMembershipParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.OrgsUpdateMembershipResponse]
  ] = js.native
}

