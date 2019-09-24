package typings.atOctokitRest

import typings.atOctokitRest.atOctokitRestMod.AnyResponse
import typings.atOctokitRest.atOctokitRestMod.OrgsAddOrUpdateMembershipParams
import typings.atOctokitRest.atOctokitRestMod.OrgsAddOrUpdateMembershipResponse
import typings.atOctokitRest.atOctokitRestMod.OrgsBlockUserParams
import typings.atOctokitRest.atOctokitRestMod.OrgsCheckBlockedUserParams
import typings.atOctokitRest.atOctokitRestMod.OrgsCheckMembershipParams
import typings.atOctokitRest.atOctokitRestMod.OrgsCheckPublicMembershipParams
import typings.atOctokitRest.atOctokitRestMod.OrgsConcealMembershipParams
import typings.atOctokitRest.atOctokitRestMod.OrgsConvertMemberToOutsideCollaboratorParams
import typings.atOctokitRest.atOctokitRestMod.OrgsConvertMemberToOutsideCollaboratorResponse
import typings.atOctokitRest.atOctokitRestMod.OrgsCreateHookParams
import typings.atOctokitRest.atOctokitRestMod.OrgsCreateHookResponse
import typings.atOctokitRest.atOctokitRestMod.OrgsCreateInvitationParams
import typings.atOctokitRest.atOctokitRestMod.OrgsCreateInvitationResponse
import typings.atOctokitRest.atOctokitRestMod.OrgsDeleteHookParams
import typings.atOctokitRest.atOctokitRestMod.OrgsGetHookParams
import typings.atOctokitRest.atOctokitRestMod.OrgsGetHookResponse
import typings.atOctokitRest.atOctokitRestMod.OrgsGetMembershipForAuthenticatedUserParams
import typings.atOctokitRest.atOctokitRestMod.OrgsGetMembershipForAuthenticatedUserResponse
import typings.atOctokitRest.atOctokitRestMod.OrgsGetMembershipParams
import typings.atOctokitRest.atOctokitRestMod.OrgsGetMembershipResponse
import typings.atOctokitRest.atOctokitRestMod.OrgsGetParams
import typings.atOctokitRest.atOctokitRestMod.OrgsGetResponse
import typings.atOctokitRest.atOctokitRestMod.OrgsListBlockedUsersParams
import typings.atOctokitRest.atOctokitRestMod.OrgsListBlockedUsersResponse
import typings.atOctokitRest.atOctokitRestMod.OrgsListForAuthenticatedUserParams
import typings.atOctokitRest.atOctokitRestMod.OrgsListForAuthenticatedUserResponse
import typings.atOctokitRest.atOctokitRestMod.OrgsListForUserParams
import typings.atOctokitRest.atOctokitRestMod.OrgsListForUserResponse
import typings.atOctokitRest.atOctokitRestMod.OrgsListHooksParams
import typings.atOctokitRest.atOctokitRestMod.OrgsListHooksResponse
import typings.atOctokitRest.atOctokitRestMod.OrgsListInvitationTeamsParams
import typings.atOctokitRest.atOctokitRestMod.OrgsListInvitationTeamsResponse
import typings.atOctokitRest.atOctokitRestMod.OrgsListMembersParams
import typings.atOctokitRest.atOctokitRestMod.OrgsListMembersResponse
import typings.atOctokitRest.atOctokitRestMod.OrgsListMembershipsParams
import typings.atOctokitRest.atOctokitRestMod.OrgsListMembershipsResponse
import typings.atOctokitRest.atOctokitRestMod.OrgsListOutsideCollaboratorsParams
import typings.atOctokitRest.atOctokitRestMod.OrgsListOutsideCollaboratorsResponse
import typings.atOctokitRest.atOctokitRestMod.OrgsListParams
import typings.atOctokitRest.atOctokitRestMod.OrgsListPendingInvitationsParams
import typings.atOctokitRest.atOctokitRestMod.OrgsListPendingInvitationsResponse
import typings.atOctokitRest.atOctokitRestMod.OrgsListPublicMembersParams
import typings.atOctokitRest.atOctokitRestMod.OrgsListPublicMembersResponse
import typings.atOctokitRest.atOctokitRestMod.OrgsListResponse
import typings.atOctokitRest.atOctokitRestMod.OrgsPingHookParams
import typings.atOctokitRest.atOctokitRestMod.OrgsPublicizeMembershipParams
import typings.atOctokitRest.atOctokitRestMod.OrgsRemoveMemberParams
import typings.atOctokitRest.atOctokitRestMod.OrgsRemoveMembershipParams
import typings.atOctokitRest.atOctokitRestMod.OrgsRemoveOutsideCollaboratorParams
import typings.atOctokitRest.atOctokitRestMod.OrgsRemoveOutsideCollaboratorResponse
import typings.atOctokitRest.atOctokitRestMod.OrgsUnblockUserParams
import typings.atOctokitRest.atOctokitRestMod.OrgsUpdateHookParams
import typings.atOctokitRest.atOctokitRestMod.OrgsUpdateHookResponse
import typings.atOctokitRest.atOctokitRestMod.OrgsUpdateMembershipParams
import typings.atOctokitRest.atOctokitRestMod.OrgsUpdateMembershipResponse
import typings.atOctokitRest.atOctokitRestMod.OrgsUpdateParams
import typings.atOctokitRest.atOctokitRestMod.OrgsUpdateResponse
import typings.atOctokitRest.atOctokitRestMod.RequestOptions
import typings.atOctokitRest.atOctokitRestMod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_AddOrUpdateMembership extends js.Object {
  /**
    * Only authenticated organization owners can add a member to the organization or update the member's role.
    *
    * *   If the authenticated user is _adding_ a member to the organization, the invited user will receive an email inviting them to the organization. The user's [membership status](https://developer.github.com/v3/orgs/members/#get-organization-membership) will be `pending` until they accept the invitation.
    *
    * *   Authenticated users can _update_ a user's membership by passing the `role` parameter. If the authenticated user changes a member's role to `admin`, the affected user will receive an email notifying them that they've been made an organization owner. If the authenticated user changes an owner's role to `member`, no email will be sent.
    *
    * **Rate limits**
    *
    * To prevent abuse, the authenticated user is limited to 50 organization invitations per 24 hour period. If the organization is more than one month old or on a paid plan, the limit is 500 invitations per 24 hour period.
    */
  @JSName("addOrUpdateMembership")
  var addOrUpdateMembership_Original: Anon_EndpointParamsOrgsAddOrUpdateMembershipParams = js.native
  @JSName("blockUser")
  var blockUser_Original: Anon_EndpointParamsAnyResponseOrgsBlockUserParams = js.native
  /**
    * If the user is blocked:
    *
    * If the user is not blocked:
    */
  @JSName("checkBlockedUser")
  var checkBlockedUser_Original: Anon_EndpointParamsAnyResponseOrgsCheckBlockedUserParams = js.native
  /**
    * Check if a user is, publicly or privately, a member of the organization.
    */
  @JSName("checkMembership")
  var checkMembership_Original: Anon_EndpointParamsAnyResponseOrgsCheckMembershipParams = js.native
  @JSName("checkPublicMembership")
  var checkPublicMembership_Original: Anon_EndpointParamsAnyResponseOrgsCheckPublicMembershipParams = js.native
  @JSName("concealMembership")
  var concealMembership_Original: Anon_EndpointParamsAnyResponseOrgsConcealMembershipParams = js.native
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
  var deleteHook_Original: Anon_EndpointParamsAnyResponseOrgsDeleteHookParams = js.native
  @JSName("getHook")
  var getHook_Original: Anon_EndpointParamsOrgsGetHookParams = js.native
  @JSName("getMembershipForAuthenticatedUser")
  var getMembershipForAuthenticatedUser_Original: Anon_EndpointParamsOrgsGetMembershipForAuthenticatedUserParams = js.native
  /**
    * In order to get a user's membership with an organization, the authenticated user must be an organization member.
    */
  @JSName("getMembership")
  var getMembership_Original: Anon_EndpointParamsOrgsGetMembershipParams = js.native
  /**
    * To see many of the organization response values, you need to be an authenticated organization owner with the `admin:org` scope. When the value of `two_factor_requirement_enabled` is `true`, the organization requires all members, billing managers, and outside collaborators to enable [two-factor authentication](https://help.github.com/articles/securing-your-account-with-two-factor-authentication-2fa/).
    *
    * GitHub Apps with the `Organization plan` permission can use this endpoint to retrieve information about an organization's GitHub plan. See "[Authenticating with GitHub Apps](https://developer.github.com/apps/building-github-apps/authenticating-with-github-apps/)" for details. For an example response, see "[Response with GitHub plan information](https://developer.github.com/v3/orgs/#response-with-github-plan-information)."
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
    * This method only lists _public_ memberships, regardless of authentication. If you need to fetch all of the organization memberships (public and private) for the authenticated user, use the [List your organizations](https://developer.github.com/v3/orgs/#list-your-organizations) API instead.
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
  var pingHook_Original: Anon_EndpointParamsAnyResponseOrgsPingHookParams = js.native
  /**
    * The user can publicize their own membership. (A user cannot publicize the membership for another user.)
    *
    * Note that you'll need to set `Content-Length` to zero when calling out to this endpoint. For more information, see "[HTTP verbs](https://developer.github.com/v3/#http-verbs)."
    */
  @JSName("publicizeMembership")
  var publicizeMembership_Original: Anon_EndpointParamsAnyResponseOrgsPublicizeMembershipParams = js.native
  /**
    * Removing a user from this list will remove them from all teams and they will no longer have any access to the organization's repositories.
    */
  @JSName("removeMember")
  var removeMember_Original: Anon_EndpointParamsAnyResponseOrgsRemoveMemberParams = js.native
  /**
    * In order to remove a user's membership with an organization, the authenticated user must be an organization owner.
    *
    * If the specified user is an active member of the organization, this will remove them from the organization. If the specified user has been invited to the organization, this will cancel their invitation. The specified user will receive an email notification in both cases.
    */
  @JSName("removeMembership")
  var removeMembership_Original: Anon_EndpointParamsAnyResponseOrgsRemoveMembershipParams = js.native
  /**
    * Removing a user from this list will remove them from all the organization's repositories.
    */
  @JSName("removeOutsideCollaborator")
  var removeOutsideCollaborator_Original: Anon_EndpointParamsOrgsRemoveOutsideCollaboratorParams = js.native
  @JSName("unblockUser")
  var unblockUser_Original: Anon_EndpointParamsAnyResponseOrgsUnblockUserParams = js.native
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
    * *   If the authenticated user is _adding_ a member to the organization, the invited user will receive an email inviting them to the organization. The user's [membership status](https://developer.github.com/v3/orgs/members/#get-organization-membership) will be `pending` until they accept the invitation.
    *
    * *   Authenticated users can _update_ a user's membership by passing the `role` parameter. If the authenticated user changes a member's role to `admin`, the affected user will receive an email notifying them that they've been made an organization owner. If the authenticated user changes an owner's role to `member`, no email will be sent.
    *
    * **Rate limits**
    *
    * To prevent abuse, the authenticated user is limited to 50 organization invitations per 24 hour period. If the organization is more than one month old or on a paid plan, the limit is 500 invitations per 24 hour period.
    */
  def addOrUpdateMembership(): js.Promise[Response[OrgsAddOrUpdateMembershipResponse]] = js.native
  def addOrUpdateMembership(params: RequestOptions with OrgsAddOrUpdateMembershipParams): js.Promise[Response[OrgsAddOrUpdateMembershipResponse]] = js.native
  def blockUser(): js.Promise[AnyResponse] = js.native
  def blockUser(params: RequestOptions with OrgsBlockUserParams): js.Promise[AnyResponse] = js.native
  /**
    * If the user is blocked:
    *
    * If the user is not blocked:
    */
  def checkBlockedUser(): js.Promise[AnyResponse] = js.native
  def checkBlockedUser(params: RequestOptions with OrgsCheckBlockedUserParams): js.Promise[AnyResponse] = js.native
  /**
    * Check if a user is, publicly or privately, a member of the organization.
    */
  def checkMembership(): js.Promise[AnyResponse] = js.native
  def checkMembership(params: RequestOptions with OrgsCheckMembershipParams): js.Promise[AnyResponse] = js.native
  def checkPublicMembership(): js.Promise[AnyResponse] = js.native
  def checkPublicMembership(params: RequestOptions with OrgsCheckPublicMembershipParams): js.Promise[AnyResponse] = js.native
  def concealMembership(): js.Promise[AnyResponse] = js.native
  def concealMembership(params: RequestOptions with OrgsConcealMembershipParams): js.Promise[AnyResponse] = js.native
  /**
    * When an organization member is converted to an outside collaborator, they'll only have access to the repositories that their current team membership allows. The user will no longer be a member of the organization. For more information, see "[Converting an organization member to an outside collaborator](https://help.github.com/articles/converting-an-organization-member-to-an-outside-collaborator/)".
    */
  def convertMemberToOutsideCollaborator(): js.Promise[Response[OrgsConvertMemberToOutsideCollaboratorResponse]] = js.native
  def convertMemberToOutsideCollaborator(params: RequestOptions with OrgsConvertMemberToOutsideCollaboratorParams): js.Promise[Response[OrgsConvertMemberToOutsideCollaboratorResponse]] = js.native
  /**
    * Here's how you can create a hook that posts payloads in JSON format:
    */
  def createHook(): js.Promise[Response[OrgsCreateHookResponse]] = js.native
  def createHook(params: RequestOptions with OrgsCreateHookParams): js.Promise[Response[OrgsCreateHookResponse]] = js.native
  /**
    * Invite people to an organization by using their GitHub user ID or their email address. In order to create invitations in an organization, the authenticated user must be an organization owner.
    *
    * This endpoint triggers [notifications](https://help.github.com/articles/about-notifications/). Creating content too quickly using this endpoint may result in abuse rate limiting. See "[Abuse rate limits](https://developer.github.com/v3/#abuse-rate-limits)" and "[Dealing with abuse rate limits](https://developer.github.com/v3/guides/best-practices-for-integrators/#dealing-with-abuse-rate-limits)" for details.
    */
  def createInvitation(): js.Promise[Response[OrgsCreateInvitationResponse]] = js.native
  def createInvitation(params: RequestOptions with OrgsCreateInvitationParams): js.Promise[Response[OrgsCreateInvitationResponse]] = js.native
  def deleteHook(): js.Promise[AnyResponse] = js.native
  def deleteHook(params: RequestOptions with OrgsDeleteHookParams): js.Promise[AnyResponse] = js.native
  /**
    * To see many of the organization response values, you need to be an authenticated organization owner with the `admin:org` scope. When the value of `two_factor_requirement_enabled` is `true`, the organization requires all members, billing managers, and outside collaborators to enable [two-factor authentication](https://help.github.com/articles/securing-your-account-with-two-factor-authentication-2fa/).
    *
    * GitHub Apps with the `Organization plan` permission can use this endpoint to retrieve information about an organization's GitHub plan. See "[Authenticating with GitHub Apps](https://developer.github.com/apps/building-github-apps/authenticating-with-github-apps/)" for details. For an example response, see "[Response with GitHub plan information](https://developer.github.com/v3/orgs/#response-with-github-plan-information)."
    */
  def get(): js.Promise[Response[OrgsGetResponse]] = js.native
  def get(params: RequestOptions with OrgsGetParams): js.Promise[Response[OrgsGetResponse]] = js.native
  def getHook(): js.Promise[Response[OrgsGetHookResponse]] = js.native
  def getHook(params: RequestOptions with OrgsGetHookParams): js.Promise[Response[OrgsGetHookResponse]] = js.native
  /**
    * In order to get a user's membership with an organization, the authenticated user must be an organization member.
    */
  def getMembership(): js.Promise[Response[OrgsGetMembershipResponse]] = js.native
  def getMembership(params: RequestOptions with OrgsGetMembershipParams): js.Promise[Response[OrgsGetMembershipResponse]] = js.native
  def getMembershipForAuthenticatedUser(): js.Promise[Response[OrgsGetMembershipForAuthenticatedUserResponse]] = js.native
  def getMembershipForAuthenticatedUser(params: RequestOptions with OrgsGetMembershipForAuthenticatedUserParams): js.Promise[Response[OrgsGetMembershipForAuthenticatedUserResponse]] = js.native
  /**
    * Lists all organizations, in the order that they were created on GitHub.
    *
    * **Note:** Pagination is powered exclusively by the `since` parameter. Use the [Link header](https://developer.github.com/v3/#link-header) to get the URL for the next page of organizations.
    */
  def list(): js.Promise[Response[OrgsListResponse]] = js.native
  def list(params: RequestOptions with OrgsListParams): js.Promise[Response[OrgsListResponse]] = js.native
  /**
    * List the users blocked by an organization.
    */
  def listBlockedUsers(): js.Promise[Response[OrgsListBlockedUsersResponse]] = js.native
  def listBlockedUsers(params: RequestOptions with OrgsListBlockedUsersParams): js.Promise[Response[OrgsListBlockedUsersResponse]] = js.native
  /**
    * List organizations for the authenticated user.
    *
    * **OAuth scope requirements**
    *
    * This only lists organizations that your authorization allows you to operate on in some way (e.g., you can list teams with `read:org` scope, you can publicize your organization membership with `user` scope, etc.). Therefore, this API requires at least `user` or `read:org` scope. OAuth requests with insufficient scope receive a `403 Forbidden` response.
    */
  def listForAuthenticatedUser(): js.Promise[Response[OrgsListForAuthenticatedUserResponse]] = js.native
  def listForAuthenticatedUser(params: RequestOptions with OrgsListForAuthenticatedUserParams): js.Promise[Response[OrgsListForAuthenticatedUserResponse]] = js.native
  /**
    * List [public organization memberships](https://help.github.com/articles/publicizing-or-concealing-organization-membership) for the specified user.
    *
    * This method only lists _public_ memberships, regardless of authentication. If you need to fetch all of the organization memberships (public and private) for the authenticated user, use the [List your organizations](https://developer.github.com/v3/orgs/#list-your-organizations) API instead.
    */
  def listForUser(): js.Promise[Response[OrgsListForUserResponse]] = js.native
  def listForUser(params: RequestOptions with OrgsListForUserParams): js.Promise[Response[OrgsListForUserResponse]] = js.native
  def listHooks(): js.Promise[Response[OrgsListHooksResponse]] = js.native
  def listHooks(params: RequestOptions with OrgsListHooksParams): js.Promise[Response[OrgsListHooksResponse]] = js.native
  /**
    * List all teams associated with an invitation. In order to see invitations in an organization, the authenticated user must be an organization owner.
    */
  def listInvitationTeams(): js.Promise[Response[OrgsListInvitationTeamsResponse]] = js.native
  def listInvitationTeams(params: RequestOptions with OrgsListInvitationTeamsParams): js.Promise[Response[OrgsListInvitationTeamsResponse]] = js.native
  /**
    * List all users who are members of an organization. If the authenticated user is also a member of this organization then both concealed and public members will be returned.
    */
  def listMembers(): js.Promise[Response[OrgsListMembersResponse]] = js.native
  def listMembers(params: RequestOptions with OrgsListMembersParams): js.Promise[Response[OrgsListMembersResponse]] = js.native
  def listMemberships(): js.Promise[Response[OrgsListMembershipsResponse]] = js.native
  def listMemberships(params: RequestOptions with OrgsListMembershipsParams): js.Promise[Response[OrgsListMembershipsResponse]] = js.native
  /**
    * List all users who are outside collaborators of an organization.
    */
  def listOutsideCollaborators(): js.Promise[Response[OrgsListOutsideCollaboratorsResponse]] = js.native
  def listOutsideCollaborators(params: RequestOptions with OrgsListOutsideCollaboratorsParams): js.Promise[Response[OrgsListOutsideCollaboratorsResponse]] = js.native
  /**
    * The return hash contains a `role` field which refers to the Organization Invitation role and will be one of the following values: `direct_member`, `admin`, `billing_manager`, `hiring_manager`, or `reinstate`. If the invitee is not a GitHub member, the `login` field in the return hash will be `null`.
    */
  def listPendingInvitations(): js.Promise[Response[OrgsListPendingInvitationsResponse]] = js.native
  def listPendingInvitations(params: RequestOptions with OrgsListPendingInvitationsParams): js.Promise[Response[OrgsListPendingInvitationsResponse]] = js.native
  /**
    * Members of an organization can choose to have their membership publicized or not.
    */
  def listPublicMembers(): js.Promise[Response[OrgsListPublicMembersResponse]] = js.native
  def listPublicMembers(params: RequestOptions with OrgsListPublicMembersParams): js.Promise[Response[OrgsListPublicMembersResponse]] = js.native
  /**
    * This will trigger a [ping event](https://developer.github.com/webhooks/#ping-event) to be sent to the hook.
    */
  def pingHook(): js.Promise[AnyResponse] = js.native
  def pingHook(params: RequestOptions with OrgsPingHookParams): js.Promise[AnyResponse] = js.native
  /**
    * The user can publicize their own membership. (A user cannot publicize the membership for another user.)
    *
    * Note that you'll need to set `Content-Length` to zero when calling out to this endpoint. For more information, see "[HTTP verbs](https://developer.github.com/v3/#http-verbs)."
    */
  def publicizeMembership(): js.Promise[AnyResponse] = js.native
  def publicizeMembership(params: RequestOptions with OrgsPublicizeMembershipParams): js.Promise[AnyResponse] = js.native
  /**
    * Removing a user from this list will remove them from all teams and they will no longer have any access to the organization's repositories.
    */
  def removeMember(): js.Promise[AnyResponse] = js.native
  def removeMember(params: RequestOptions with OrgsRemoveMemberParams): js.Promise[AnyResponse] = js.native
  /**
    * In order to remove a user's membership with an organization, the authenticated user must be an organization owner.
    *
    * If the specified user is an active member of the organization, this will remove them from the organization. If the specified user has been invited to the organization, this will cancel their invitation. The specified user will receive an email notification in both cases.
    */
  def removeMembership(): js.Promise[AnyResponse] = js.native
  def removeMembership(params: RequestOptions with OrgsRemoveMembershipParams): js.Promise[AnyResponse] = js.native
  /**
    * Removing a user from this list will remove them from all the organization's repositories.
    */
  def removeOutsideCollaborator(): js.Promise[Response[OrgsRemoveOutsideCollaboratorResponse]] = js.native
  def removeOutsideCollaborator(params: RequestOptions with OrgsRemoveOutsideCollaboratorParams): js.Promise[Response[OrgsRemoveOutsideCollaboratorResponse]] = js.native
  def unblockUser(): js.Promise[AnyResponse] = js.native
  def unblockUser(params: RequestOptions with OrgsUnblockUserParams): js.Promise[AnyResponse] = js.native
  /**
    * **Note:** The new `members_allowed_repository_creation_type` replaces the functionality of `members_can_create_repositories`.
    *
    * Setting `members_allowed_repository_creation_type` will override the value of `members_can_create_repositories` in the following ways:
    *
    * *   Setting `members_allowed_repository_creation_type` to `all` or `private` sets `members_can_create_repositories` to `true`.
    * *   Setting `members_allowed_repository_creation_type` to `none` sets `members_can_create_repositories` to `false`.
    * *   If you omit `members_allowed_repository_creation_type`, `members_can_create_repositories` is not modified.
    */
  def update(): js.Promise[Response[OrgsUpdateResponse]] = js.native
  def update(params: RequestOptions with OrgsUpdateParams): js.Promise[Response[OrgsUpdateResponse]] = js.native
  def updateHook(): js.Promise[Response[OrgsUpdateHookResponse]] = js.native
  def updateHook(params: RequestOptions with OrgsUpdateHookParams): js.Promise[Response[OrgsUpdateHookResponse]] = js.native
  def updateMembership(): js.Promise[Response[OrgsUpdateMembershipResponse]] = js.native
  def updateMembership(params: RequestOptions with OrgsUpdateMembershipParams): js.Promise[Response[OrgsUpdateMembershipResponse]] = js.native
}

