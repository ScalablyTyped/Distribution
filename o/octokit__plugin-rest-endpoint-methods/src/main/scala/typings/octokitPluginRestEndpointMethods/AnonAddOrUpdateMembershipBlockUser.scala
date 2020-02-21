package typings.octokitPluginRestEndpointMethods

import typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.AnyResponse
import typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.OrgsAddOrUpdateMembershipParams
import typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.OrgsBlockUserParams
import typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.OrgsCheckBlockedUserParams
import typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.OrgsCheckMembershipParams
import typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.OrgsCheckPublicMembershipParams
import typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.OrgsConcealMembershipParams
import typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.OrgsConvertMemberToOutsideCollaboratorParams
import typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.OrgsCreateHookParams
import typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.OrgsCreateInvitationParams
import typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.OrgsDeleteHookParams
import typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.OrgsGetHookParams
import typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.OrgsGetMembershipForAuthenticatedUserParams
import typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.OrgsGetMembershipParams
import typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.OrgsGetParams
import typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.OrgsListBlockedUsersParams
import typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.OrgsListForAuthenticatedUserParams
import typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.OrgsListForUserParams
import typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.OrgsListHooksParams
import typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.OrgsListInstallationsParams
import typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.OrgsListInvitationTeamsParams
import typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.OrgsListMembersParams
import typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.OrgsListMembershipsParams
import typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.OrgsListOutsideCollaboratorsParams
import typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.OrgsListParams
import typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.OrgsListPendingInvitationsParams
import typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.OrgsListPublicMembersParams
import typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.OrgsPingHookParams
import typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.OrgsPublicizeMembershipParams
import typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.OrgsRemoveMemberParams
import typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.OrgsRemoveMembershipParams
import typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.OrgsRemoveOutsideCollaboratorParams
import typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.OrgsUnblockUserParams
import typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.OrgsUpdateHookParams
import typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.OrgsUpdateMembershipParams
import typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.OrgsUpdateParams
import typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.OrgsUpdateParamsDeprecatedMembersAllowedRepositoryCreationType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAddOrUpdateMembershipBlockUser extends js.Object {
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
  var addOrUpdateMembership_Original: AnonEndpointParamsAnyOrgsAddOrUpdateMembershipParams = js.native
  @JSName("blockUser")
  var blockUser_Original: AnonEndpointParamsAnyAnyResponseOrgsBlockUserParams = js.native
  /**
    * If the user is blocked:
    *
    * If the user is not blocked:
    */
  @JSName("checkBlockedUser")
  var checkBlockedUser_Original: AnonEndpointParamsAnyAnyResponseOrgsCheckBlockedUserParams = js.native
  /**
    * Check if a user is, publicly or privately, a member of the organization.
    */
  @JSName("checkMembership")
  var checkMembership_Original: AnonEndpointParamsAnyAnyResponseOrgsCheckMembershipParams = js.native
  @JSName("checkPublicMembership")
  var checkPublicMembership_Original: AnonEndpointParamsAnyAnyResponseOrgsCheckPublicMembershipParams = js.native
  @JSName("concealMembership")
  var concealMembership_Original: AnonEndpointParamsAnyAnyResponseOrgsConcealMembershipParams = js.native
  /**
    * When an organization member is converted to an outside collaborator, they'll only have access to the repositories that their current team membership allows. The user will no longer be a member of the organization. For more information, see "[Converting an organization member to an outside collaborator](https://help.github.com/articles/converting-an-organization-member-to-an-outside-collaborator/)".
    */
  @JSName("convertMemberToOutsideCollaborator")
  var convertMemberToOutsideCollaborator_Original: AnonEndpointParamsAnyOrgsConvertMemberToOutsideCollaboratorParams = js.native
  /**
    * Here's how you can create a hook that posts payloads in JSON format:
    */
  @JSName("createHook")
  var createHook_Original: AnonEndpointParamsAnyOrgsCreateHookParams = js.native
  /**
    * Invite people to an organization by using their GitHub user ID or their email address. In order to create invitations in an organization, the authenticated user must be an organization owner.
    *
    * This endpoint triggers [notifications](https://help.github.com/articles/about-notifications/). Creating content too quickly using this endpoint may result in abuse rate limiting. See "[Abuse rate limits](https://developer.github.com/v3/#abuse-rate-limits)" and "[Dealing with abuse rate limits](https://developer.github.com/v3/guides/best-practices-for-integrators/#dealing-with-abuse-rate-limits)" for details.
    */
  @JSName("createInvitation")
  var createInvitation_Original: AnonEndpointParamsAnyOrgsCreateInvitationParams = js.native
  @JSName("deleteHook")
  var deleteHook_Original: AnonEndpointParamsAnyAnyResponseOrgsDeleteHookParams = js.native
  @JSName("getHook")
  var getHook_Original: AnonEndpointParamsAnyOrgsGetHookParams = js.native
  @JSName("getMembershipForAuthenticatedUser")
  var getMembershipForAuthenticatedUser_Original: AnonEndpointParamsAnyOrgsGetMembershipForAuthenticatedUserParams = js.native
  /**
    * In order to get a user's membership with an organization, the authenticated user must be an organization member.
    */
  @JSName("getMembership")
  var getMembership_Original: AnonEndpointParamsAnyOrgsGetMembershipParams = js.native
  /**
    * To see many of the organization response values, you need to be an authenticated organization owner with the `admin:org` scope. When the value of `two_factor_requirement_enabled` is `true`, the organization requires all members, billing managers, and outside collaborators to enable [two-factor authentication](https://help.github.com/articles/securing-your-account-with-two-factor-authentication-2fa/).
    *
    * GitHub Apps with the `Organization plan` permission can use this endpoint to retrieve information about an organization's GitHub plan. See "[Authenticating with GitHub Apps](https://developer.github.com/apps/building-github-apps/authenticating-with-github-apps/)" for details. For an example response, see "[Response with GitHub plan information](https://developer.github.com/v3/orgs/#response-with-github-plan-information)."
    */
  @JSName("get")
  var get_Original: AnonEndpointParamsAnyOrgsGetParams = js.native
  /**
    * List the users blocked by an organization.
    */
  @JSName("listBlockedUsers")
  var listBlockedUsers_Original: AnonEndpointParamsAnyOrgsListBlockedUsersParams = js.native
  /**
    * List organizations for the authenticated user.
    *
    * **OAuth scope requirements**
    *
    * This only lists organizations that your authorization allows you to operate on in some way (e.g., you can list teams with `read:org` scope, you can publicize your organization membership with `user` scope, etc.). Therefore, this API requires at least `user` or `read:org` scope. OAuth requests with insufficient scope receive a `403 Forbidden` response.
    */
  @JSName("listForAuthenticatedUser")
  var listForAuthenticatedUser_Original: AnonEndpointParamsAnyOrgsListForAuthenticatedUserParams = js.native
  /**
    * List [public organization memberships](https://help.github.com/articles/publicizing-or-concealing-organization-membership) for the specified user.
    *
    * This method only lists _public_ memberships, regardless of authentication. If you need to fetch all of the organization memberships (public and private) for the authenticated user, use the [List your organizations](https://developer.github.com/v3/orgs/#list-your-organizations) API instead.
    */
  @JSName("listForUser")
  var listForUser_Original: AnonEndpointParamsAnyOrgsListForUserParams = js.native
  @JSName("listHooks")
  var listHooks_Original: AnonEndpointParamsAnyOrgsListHooksParams = js.native
  /**
    * Lists all GitHub Apps in an organization. The installation count includes all GitHub Apps installed on repositories in the organization. You must be an organization owner with `admin:read` scope to use this endpoint.
    */
  @JSName("listInstallations")
  var listInstallations_Original: AnonEndpointParamsAnyOrgsListInstallationsParams = js.native
  /**
    * List all teams associated with an invitation. In order to see invitations in an organization, the authenticated user must be an organization owner.
    */
  @JSName("listInvitationTeams")
  var listInvitationTeams_Original: AnonEndpointParamsAnyOrgsListInvitationTeamsParams = js.native
  /**
    * List all users who are members of an organization. If the authenticated user is also a member of this organization then both concealed and public members will be returned.
    */
  @JSName("listMembers")
  var listMembers_Original: AnonEndpointParamsAnyOrgsListMembersParams = js.native
  @JSName("listMemberships")
  var listMemberships_Original: AnonEndpointParamsAnyOrgsListMembershipsParams = js.native
  /**
    * List all users who are outside collaborators of an organization.
    */
  @JSName("listOutsideCollaborators")
  var listOutsideCollaborators_Original: AnonEndpointParamsAnyOrgsListOutsideCollaboratorsParams = js.native
  /**
    * The return hash contains a `role` field which refers to the Organization Invitation role and will be one of the following values: `direct_member`, `admin`, `billing_manager`, `hiring_manager`, or `reinstate`. If the invitee is not a GitHub member, the `login` field in the return hash will be `null`.
    */
  @JSName("listPendingInvitations")
  var listPendingInvitations_Original: AnonEndpointParamsAnyOrgsListPendingInvitationsParams = js.native
  /**
    * Members of an organization can choose to have their membership publicized or not.
    */
  @JSName("listPublicMembers")
  var listPublicMembers_Original: AnonEndpointParamsAnyOrgsListPublicMembersParams = js.native
  /**
    * Lists all organizations, in the order that they were created on GitHub.
    *
    * **Note:** Pagination is powered exclusively by the `since` parameter. Use the [Link header](https://developer.github.com/v3/#link-header) to get the URL for the next page of organizations.
    */
  @JSName("list")
  var list_Original: AnonEndpointParamsAnyOrgsListParams = js.native
  /**
    * This will trigger a [ping event](https://developer.github.com/webhooks/#ping-event) to be sent to the hook.
    */
  @JSName("pingHook")
  var pingHook_Original: AnonEndpointParamsAnyAnyResponseOrgsPingHookParams = js.native
  /**
    * The user can publicize their own membership. (A user cannot publicize the membership for another user.)
    *
    * Note that you'll need to set `Content-Length` to zero when calling out to this endpoint. For more information, see "[HTTP verbs](https://developer.github.com/v3/#http-verbs)."
    */
  @JSName("publicizeMembership")
  var publicizeMembership_Original: AnonEndpointParamsAnyAnyResponseOrgsPublicizeMembershipParams = js.native
  /**
    * Removing a user from this list will remove them from all teams and they will no longer have any access to the organization's repositories.
    */
  @JSName("removeMember")
  var removeMember_Original: AnonEndpointParamsAnyAnyResponseOrgsRemoveMemberParams = js.native
  /**
    * In order to remove a user's membership with an organization, the authenticated user must be an organization owner.
    *
    * If the specified user is an active member of the organization, this will remove them from the organization. If the specified user has been invited to the organization, this will cancel their invitation. The specified user will receive an email notification in both cases.
    */
  @JSName("removeMembership")
  var removeMembership_Original: AnonEndpointParamsAnyAnyResponseOrgsRemoveMembershipParams = js.native
  /**
    * Removing a user from this list will remove them from all the organization's repositories.
    */
  @JSName("removeOutsideCollaborator")
  var removeOutsideCollaborator_Original: AnonEndpointParamsAnyOrgsRemoveOutsideCollaboratorParams = js.native
  @JSName("unblockUser")
  var unblockUser_Original: AnonEndpointParamsAnyAnyResponseOrgsUnblockUserParams = js.native
  @JSName("updateHook")
  var updateHook_Original: AnonEndpointParamsAnyOrgsUpdateHookParams = js.native
  @JSName("updateMembership")
  var updateMembership_Original: AnonEndpointParamsAnyOrgsUpdateMembershipParams = js.native
  /**
    * **Parameter Deprecation Notice:** GitHub will replace and discontinue `members_allowed_repository_creation_type` in favor of more granular permissions. The new input parameters are `members_can_create_public_repositories`, `members_can_create_private_repositories` for all organizations and `members_can_create_internal_repositories` for organizations associated with an enterprise account using GitHub Enterprise Cloud. For more information, see the [blog post](https://developer.github.com/changes/2019-12-03-internal-visibility-changes).
    *
    * Enables an authenticated organization owner with the `admin:org` scope to update the organization's profile and member privileges.
    */
  @JSName("update")
  var update_Original: AnonEndpointParamsAnyOrgsUpdateParams = js.native
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
  def addOrUpdateMembership(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<OrgsAddOrUpdateMembershipResponse> */ _
  ] = js.native
  def addOrUpdateMembership(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with OrgsAddOrUpdateMembershipParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<OrgsAddOrUpdateMembershipResponse> */ _
  ] = js.native
  def blockUser(): js.Promise[AnyResponse] = js.native
  def blockUser(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with OrgsBlockUserParams
  ): js.Promise[AnyResponse] = js.native
  /**
    * If the user is blocked:
    *
    * If the user is not blocked:
    */
  def checkBlockedUser(): js.Promise[AnyResponse] = js.native
  def checkBlockedUser(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with OrgsCheckBlockedUserParams
  ): js.Promise[AnyResponse] = js.native
  /**
    * Check if a user is, publicly or privately, a member of the organization.
    */
  def checkMembership(): js.Promise[AnyResponse] = js.native
  def checkMembership(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with OrgsCheckMembershipParams
  ): js.Promise[AnyResponse] = js.native
  def checkPublicMembership(): js.Promise[AnyResponse] = js.native
  def checkPublicMembership(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with OrgsCheckPublicMembershipParams
  ): js.Promise[AnyResponse] = js.native
  def concealMembership(): js.Promise[AnyResponse] = js.native
  def concealMembership(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with OrgsConcealMembershipParams
  ): js.Promise[AnyResponse] = js.native
  /**
    * When an organization member is converted to an outside collaborator, they'll only have access to the repositories that their current team membership allows. The user will no longer be a member of the organization. For more information, see "[Converting an organization member to an outside collaborator](https://help.github.com/articles/converting-an-organization-member-to-an-outside-collaborator/)".
    */
  def convertMemberToOutsideCollaborator(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<OrgsConvertMemberToOutsideCollaboratorResponse> */ _
  ] = js.native
  def convertMemberToOutsideCollaborator(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with OrgsConvertMemberToOutsideCollaboratorParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<OrgsConvertMemberToOutsideCollaboratorResponse> */ _
  ] = js.native
  /**
    * Here's how you can create a hook that posts payloads in JSON format:
    */
  def createHook(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<OrgsCreateHookResponse> */ _
  ] = js.native
  def createHook(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with OrgsCreateHookParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<OrgsCreateHookResponse> */ _
  ] = js.native
  /**
    * Invite people to an organization by using their GitHub user ID or their email address. In order to create invitations in an organization, the authenticated user must be an organization owner.
    *
    * This endpoint triggers [notifications](https://help.github.com/articles/about-notifications/). Creating content too quickly using this endpoint may result in abuse rate limiting. See "[Abuse rate limits](https://developer.github.com/v3/#abuse-rate-limits)" and "[Dealing with abuse rate limits](https://developer.github.com/v3/guides/best-practices-for-integrators/#dealing-with-abuse-rate-limits)" for details.
    */
  def createInvitation(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<OrgsCreateInvitationResponse> */ _
  ] = js.native
  def createInvitation(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with OrgsCreateInvitationParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<OrgsCreateInvitationResponse> */ _
  ] = js.native
  def deleteHook(): js.Promise[AnyResponse] = js.native
  def deleteHook(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with OrgsDeleteHookParams
  ): js.Promise[AnyResponse] = js.native
  /**
    * To see many of the organization response values, you need to be an authenticated organization owner with the `admin:org` scope. When the value of `two_factor_requirement_enabled` is `true`, the organization requires all members, billing managers, and outside collaborators to enable [two-factor authentication](https://help.github.com/articles/securing-your-account-with-two-factor-authentication-2fa/).
    *
    * GitHub Apps with the `Organization plan` permission can use this endpoint to retrieve information about an organization's GitHub plan. See "[Authenticating with GitHub Apps](https://developer.github.com/apps/building-github-apps/authenticating-with-github-apps/)" for details. For an example response, see "[Response with GitHub plan information](https://developer.github.com/v3/orgs/#response-with-github-plan-information)."
    */
  def get(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<OrgsGetResponse> */ _
  ] = js.native
  def get(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with OrgsGetParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<OrgsGetResponse> */ _
  ] = js.native
  def getHook(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<OrgsGetHookResponse> */ _
  ] = js.native
  def getHook(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with OrgsGetHookParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<OrgsGetHookResponse> */ _
  ] = js.native
  /**
    * In order to get a user's membership with an organization, the authenticated user must be an organization member.
    */
  def getMembership(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<OrgsGetMembershipResponse> */ _
  ] = js.native
  def getMembership(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with OrgsGetMembershipParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<OrgsGetMembershipResponse> */ _
  ] = js.native
  def getMembershipForAuthenticatedUser(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<OrgsGetMembershipForAuthenticatedUserResponse> */ _
  ] = js.native
  def getMembershipForAuthenticatedUser(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with OrgsGetMembershipForAuthenticatedUserParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<OrgsGetMembershipForAuthenticatedUserResponse> */ _
  ] = js.native
  /**
    * Lists all organizations, in the order that they were created on GitHub.
    *
    * **Note:** Pagination is powered exclusively by the `since` parameter. Use the [Link header](https://developer.github.com/v3/#link-header) to get the URL for the next page of organizations.
    */
  def list(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<OrgsListResponse> */ _
  ] = js.native
  def list(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with OrgsListParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<OrgsListResponse> */ _
  ] = js.native
  /**
    * List the users blocked by an organization.
    */
  def listBlockedUsers(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<OrgsListBlockedUsersResponse> */ _
  ] = js.native
  def listBlockedUsers(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with OrgsListBlockedUsersParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<OrgsListBlockedUsersResponse> */ _
  ] = js.native
  /**
    * List organizations for the authenticated user.
    *
    * **OAuth scope requirements**
    *
    * This only lists organizations that your authorization allows you to operate on in some way (e.g., you can list teams with `read:org` scope, you can publicize your organization membership with `user` scope, etc.). Therefore, this API requires at least `user` or `read:org` scope. OAuth requests with insufficient scope receive a `403 Forbidden` response.
    */
  def listForAuthenticatedUser(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<OrgsListForAuthenticatedUserResponse> */ _
  ] = js.native
  def listForAuthenticatedUser(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with OrgsListForAuthenticatedUserParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<OrgsListForAuthenticatedUserResponse> */ _
  ] = js.native
  /**
    * List [public organization memberships](https://help.github.com/articles/publicizing-or-concealing-organization-membership) for the specified user.
    *
    * This method only lists _public_ memberships, regardless of authentication. If you need to fetch all of the organization memberships (public and private) for the authenticated user, use the [List your organizations](https://developer.github.com/v3/orgs/#list-your-organizations) API instead.
    */
  def listForUser(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<OrgsListForUserResponse> */ _
  ] = js.native
  def listForUser(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with OrgsListForUserParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<OrgsListForUserResponse> */ _
  ] = js.native
  def listHooks(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<OrgsListHooksResponse> */ _
  ] = js.native
  def listHooks(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with OrgsListHooksParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<OrgsListHooksResponse> */ _
  ] = js.native
  /**
    * Lists all GitHub Apps in an organization. The installation count includes all GitHub Apps installed on repositories in the organization. You must be an organization owner with `admin:read` scope to use this endpoint.
    */
  def listInstallations(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<OrgsListInstallationsResponse> */ _
  ] = js.native
  def listInstallations(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with OrgsListInstallationsParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<OrgsListInstallationsResponse> */ _
  ] = js.native
  /**
    * List all teams associated with an invitation. In order to see invitations in an organization, the authenticated user must be an organization owner.
    */
  def listInvitationTeams(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<OrgsListInvitationTeamsResponse> */ _
  ] = js.native
  def listInvitationTeams(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with OrgsListInvitationTeamsParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<OrgsListInvitationTeamsResponse> */ _
  ] = js.native
  /**
    * List all users who are members of an organization. If the authenticated user is also a member of this organization then both concealed and public members will be returned.
    */
  def listMembers(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<OrgsListMembersResponse> */ _
  ] = js.native
  def listMembers(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with OrgsListMembersParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<OrgsListMembersResponse> */ _
  ] = js.native
  def listMemberships(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<OrgsListMembershipsResponse> */ _
  ] = js.native
  def listMemberships(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with OrgsListMembershipsParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<OrgsListMembershipsResponse> */ _
  ] = js.native
  /**
    * List all users who are outside collaborators of an organization.
    */
  def listOutsideCollaborators(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<OrgsListOutsideCollaboratorsResponse> */ _
  ] = js.native
  def listOutsideCollaborators(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with OrgsListOutsideCollaboratorsParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<OrgsListOutsideCollaboratorsResponse> */ _
  ] = js.native
  /**
    * The return hash contains a `role` field which refers to the Organization Invitation role and will be one of the following values: `direct_member`, `admin`, `billing_manager`, `hiring_manager`, or `reinstate`. If the invitee is not a GitHub member, the `login` field in the return hash will be `null`.
    */
  def listPendingInvitations(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<OrgsListPendingInvitationsResponse> */ _
  ] = js.native
  def listPendingInvitations(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with OrgsListPendingInvitationsParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<OrgsListPendingInvitationsResponse> */ _
  ] = js.native
  /**
    * Members of an organization can choose to have their membership publicized or not.
    */
  def listPublicMembers(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<OrgsListPublicMembersResponse> */ _
  ] = js.native
  def listPublicMembers(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with OrgsListPublicMembersParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<OrgsListPublicMembersResponse> */ _
  ] = js.native
  /**
    * This will trigger a [ping event](https://developer.github.com/webhooks/#ping-event) to be sent to the hook.
    */
  def pingHook(): js.Promise[AnyResponse] = js.native
  def pingHook(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with OrgsPingHookParams
  ): js.Promise[AnyResponse] = js.native
  /**
    * The user can publicize their own membership. (A user cannot publicize the membership for another user.)
    *
    * Note that you'll need to set `Content-Length` to zero when calling out to this endpoint. For more information, see "[HTTP verbs](https://developer.github.com/v3/#http-verbs)."
    */
  def publicizeMembership(): js.Promise[AnyResponse] = js.native
  def publicizeMembership(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with OrgsPublicizeMembershipParams
  ): js.Promise[AnyResponse] = js.native
  /**
    * Removing a user from this list will remove them from all teams and they will no longer have any access to the organization's repositories.
    */
  def removeMember(): js.Promise[AnyResponse] = js.native
  def removeMember(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with OrgsRemoveMemberParams
  ): js.Promise[AnyResponse] = js.native
  /**
    * In order to remove a user's membership with an organization, the authenticated user must be an organization owner.
    *
    * If the specified user is an active member of the organization, this will remove them from the organization. If the specified user has been invited to the organization, this will cancel their invitation. The specified user will receive an email notification in both cases.
    */
  def removeMembership(): js.Promise[AnyResponse] = js.native
  def removeMembership(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with OrgsRemoveMembershipParams
  ): js.Promise[AnyResponse] = js.native
  /**
    * Removing a user from this list will remove them from all the organization's repositories.
    */
  def removeOutsideCollaborator(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<OrgsRemoveOutsideCollaboratorResponse> */ _
  ] = js.native
  def removeOutsideCollaborator(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with OrgsRemoveOutsideCollaboratorParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<OrgsRemoveOutsideCollaboratorResponse> */ _
  ] = js.native
  def unblockUser(): js.Promise[AnyResponse] = js.native
  def unblockUser(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with OrgsUnblockUserParams
  ): js.Promise[AnyResponse] = js.native
  /**
    * **Parameter Deprecation Notice:** GitHub will replace and discontinue `members_allowed_repository_creation_type` in favor of more granular permissions. The new input parameters are `members_can_create_public_repositories`, `members_can_create_private_repositories` for all organizations and `members_can_create_internal_repositories` for organizations associated with an enterprise account using GitHub Enterprise Cloud. For more information, see the [blog post](https://developer.github.com/changes/2019-12-03-internal-visibility-changes).
    *
    * Enables an authenticated organization owner with the `admin:org` scope to update the organization's profile and member privileges.
    */
  def update(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<OrgsUpdateResponse> */ _
  ] = js.native
  def update(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with OrgsUpdateParamsDeprecatedMembersAllowedRepositoryCreationType with OrgsUpdateParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<OrgsUpdateResponse> */ _
  ] = js.native
  def updateHook(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<OrgsUpdateHookResponse> */ _
  ] = js.native
  def updateHook(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with OrgsUpdateHookParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<OrgsUpdateHookResponse> */ _
  ] = js.native
  def updateMembership(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<OrgsUpdateMembershipResponse> */ _
  ] = js.native
  def updateMembership(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with OrgsUpdateMembershipParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<OrgsUpdateMembershipResponse> */ _
  ] = js.native
}

