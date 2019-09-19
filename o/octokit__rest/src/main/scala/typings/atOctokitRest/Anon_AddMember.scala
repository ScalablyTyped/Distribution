package typings.atOctokitRest

import typings.atOctokitRest.atOctokitRestMod.AnyResponse
import typings.atOctokitRest.atOctokitRestMod.Response
import typings.atOctokitRest.atOctokitRestMod.TeamsAddMemberParams
import typings.atOctokitRest.atOctokitRestMod.TeamsAddMemberResponse
import typings.atOctokitRest.atOctokitRestMod.TeamsAddOrUpdateMembershipParams
import typings.atOctokitRest.atOctokitRestMod.TeamsAddOrUpdateMembershipResponse
import typings.atOctokitRest.atOctokitRestMod.TeamsAddOrUpdateProjectParams
import typings.atOctokitRest.atOctokitRestMod.TeamsAddOrUpdateProjectResponse
import typings.atOctokitRest.atOctokitRestMod.TeamsAddOrUpdateRepoParams
import typings.atOctokitRest.atOctokitRestMod.TeamsCheckManagesRepoParams
import typings.atOctokitRest.atOctokitRestMod.TeamsCheckManagesRepoResponse
import typings.atOctokitRest.atOctokitRestMod.TeamsCreateDiscussionCommentParams
import typings.atOctokitRest.atOctokitRestMod.TeamsCreateDiscussionCommentResponse
import typings.atOctokitRest.atOctokitRestMod.TeamsCreateDiscussionParams
import typings.atOctokitRest.atOctokitRestMod.TeamsCreateDiscussionResponse
import typings.atOctokitRest.atOctokitRestMod.TeamsCreateParams
import typings.atOctokitRest.atOctokitRestMod.TeamsCreateResponse
import typings.atOctokitRest.atOctokitRestMod.TeamsDeleteDiscussionCommentParams
import typings.atOctokitRest.atOctokitRestMod.TeamsDeleteDiscussionParams
import typings.atOctokitRest.atOctokitRestMod.TeamsDeleteParams
import typings.atOctokitRest.atOctokitRestMod.TeamsGetByNameParams
import typings.atOctokitRest.atOctokitRestMod.TeamsGetByNameResponse
import typings.atOctokitRest.atOctokitRestMod.TeamsGetDiscussionCommentParams
import typings.atOctokitRest.atOctokitRestMod.TeamsGetDiscussionCommentResponse
import typings.atOctokitRest.atOctokitRestMod.TeamsGetDiscussionParams
import typings.atOctokitRest.atOctokitRestMod.TeamsGetDiscussionResponse
import typings.atOctokitRest.atOctokitRestMod.TeamsGetMemberParams
import typings.atOctokitRest.atOctokitRestMod.TeamsGetMembershipParams
import typings.atOctokitRest.atOctokitRestMod.TeamsGetMembershipResponse
import typings.atOctokitRest.atOctokitRestMod.TeamsGetParams
import typings.atOctokitRest.atOctokitRestMod.TeamsGetResponse
import typings.atOctokitRest.atOctokitRestMod.TeamsListChildParams
import typings.atOctokitRest.atOctokitRestMod.TeamsListChildResponse
import typings.atOctokitRest.atOctokitRestMod.TeamsListDiscussionCommentsParams
import typings.atOctokitRest.atOctokitRestMod.TeamsListDiscussionCommentsResponse
import typings.atOctokitRest.atOctokitRestMod.TeamsListDiscussionsParams
import typings.atOctokitRest.atOctokitRestMod.TeamsListDiscussionsResponse
import typings.atOctokitRest.atOctokitRestMod.TeamsListForAuthenticatedUserParams
import typings.atOctokitRest.atOctokitRestMod.TeamsListForAuthenticatedUserResponse
import typings.atOctokitRest.atOctokitRestMod.TeamsListMembersParams
import typings.atOctokitRest.atOctokitRestMod.TeamsListMembersResponse
import typings.atOctokitRest.atOctokitRestMod.TeamsListParams
import typings.atOctokitRest.atOctokitRestMod.TeamsListPendingInvitationsParams
import typings.atOctokitRest.atOctokitRestMod.TeamsListPendingInvitationsResponse
import typings.atOctokitRest.atOctokitRestMod.TeamsListProjectsParams
import typings.atOctokitRest.atOctokitRestMod.TeamsListProjectsResponse
import typings.atOctokitRest.atOctokitRestMod.TeamsListReposParams
import typings.atOctokitRest.atOctokitRestMod.TeamsListReposResponse
import typings.atOctokitRest.atOctokitRestMod.TeamsListResponse
import typings.atOctokitRest.atOctokitRestMod.TeamsRemoveMemberParams
import typings.atOctokitRest.atOctokitRestMod.TeamsRemoveMembershipParams
import typings.atOctokitRest.atOctokitRestMod.TeamsRemoveProjectParams
import typings.atOctokitRest.atOctokitRestMod.TeamsRemoveRepoParams
import typings.atOctokitRest.atOctokitRestMod.TeamsReviewProjectParams
import typings.atOctokitRest.atOctokitRestMod.TeamsReviewProjectResponse
import typings.atOctokitRest.atOctokitRestMod.TeamsUpdateDiscussionCommentParams
import typings.atOctokitRest.atOctokitRestMod.TeamsUpdateDiscussionCommentResponse
import typings.atOctokitRest.atOctokitRestMod.TeamsUpdateDiscussionParams
import typings.atOctokitRest.atOctokitRestMod.TeamsUpdateDiscussionResponse
import typings.atOctokitRest.atOctokitRestMod.TeamsUpdateParams
import typings.atOctokitRest.atOctokitRestMod.TeamsUpdateResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_AddMember extends js.Object {
  /**
    * The "Add team member" API (described below) is deprecated.
    *
    * We recommend using the [Add team membership API](https://developer.github.com/v3/teams/members/#add-or-update-team-membership) instead. It allows you to invite new organization members to your teams.
    *
    * Team synchronization is available for organizations using GitHub Enterprise Cloud. For more information, see [GitHub's products](https://help.github.com/articles/github-s-products) in the GitHub Help documentation.
    *
    * To add someone to a team, the authenticated user must be a team maintainer in the team they're changing or be an owner of the organization that the team is associated with. The person being added to the team must be a member of the team's organization.
    *
    * **Note:** When you have team synchronization set up for a team with your organization's identity provider (IdP), you will see an error if you attempt to use the API for making changes to the team's membership. If you have access to manage group membership in your IdP, you can manage GitHub team membership through your identity provider, which automatically adds and removes team members in an organization. For more information, see "[Synchronizing teams between your identity provider and GitHub](https://help.github.com/articles/synchronizing-teams-between-your-identity-provider-and-github/)."
    *
    * Note that you'll need to set `Content-Length` to zero when calling out to this endpoint. For more information, see "[HTTP verbs](https://developer.github.com/v3/#http-verbs)."
    */
  @JSName("addMember")
  var addMember_Original: Anon_EndpointParamsPromiseResponseTeamsAddMemberParams = js.native
  /**
    * Team synchronization is available for organizations using GitHub Enterprise Cloud. For more information, see [GitHub's products](https://help.github.com/articles/github-s-products) in the GitHub Help documentation.
    *
    * If the user is already a member of the team's organization, this endpoint will add the user to the team. To add a membership between an organization member and a team, the authenticated user must be an organization owner or a maintainer of the team.
    *
    * **Note:** When you have team synchronization set up for a team with your organization's identity provider (IdP), you will see an error if you attempt to use the API for making changes to the team's membership. If you have access to manage group membership in your IdP, you can manage GitHub team membership through your identity provider, which automatically adds and removes team members in an organization. For more information, see "[Synchronizing teams between your identity provider and GitHub](https://help.github.com/articles/synchronizing-teams-between-your-identity-provider-and-github/)."
    *
    * If the user is unaffiliated with the team's organization, this endpoint will send an invitation to the user via email. This newly-created membership will be in the "pending" state until the user accepts the invitation, at which point the membership will transition to the "active" state and the user will be added as a member of the team. To add a membership between an unaffiliated user and a team, the authenticated user must be an organization owner.
    *
    * If the user is already a member of the team, this endpoint will update the role of the team member's role. To update the membership of a team member, the authenticated user must be an organization owner or a maintainer of the team.
    */
  @JSName("addOrUpdateMembership")
  var addOrUpdateMembership_Original: Anon_EndpointParamsPromiseResponseTeamsAddOrUpdateMembershipParams = js.native
  /**
    * Adds an organization project to a team. To add a project to a team or update the team's permission on a project, the authenticated user must have `admin` permissions for the project. The project and team must be part of the same organization.
    */
  @JSName("addOrUpdateProject")
  var addOrUpdateProject_Original: Anon_EndpointParamsPromiseResponseTeamsAddOrUpdateProjectParams = js.native
  /**
    * To add a repository to a team or update the team's permission on a repository, the authenticated user must have admin access to the repository, and must be able to see the team. The repository must be owned by the organization, or a direct fork of a repository owned by the organization. You will get a `422 Unprocessable Entity` status if you attempt to add a repository to a team that is not owned by the organization.
    *
    * If you pass the `hellcat-preview` media type, you can modify repository permissions of child teams.
    *
    * Note that, if you choose not to pass any parameters, you'll need to set `Content-Length` to zero when calling out to this endpoint. For more information, see "[HTTP verbs](https://developer.github.com/v3/#http-verbs)."
    */
  @JSName("addOrUpdateRepo")
  var addOrUpdateRepo_Original: Anon_EndpointParamsAnyResponsePromiseTeamsAddOrUpdateRepoParams = js.native
  /**
    * **Note**: If you pass the `hellcat-preview` media type, repositories inherited through a parent team will be checked.
    *
    * You can also get information about the specified repository, including what permissions the team grants on it, by passing the following custom [media type](https://developer.github.com/v3/media/) via the `Accept` header:
    */
  @JSName("checkManagesRepo")
  var checkManagesRepo_Original: Anon_EndpointParamsPromiseResponseTeamsCheckManagesRepoParams = js.native
  /**
    * Creates a new comment on a team discussion. OAuth access tokens require the `write:discussion` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    *
    * This endpoint triggers [notifications](https://help.github.com/articles/about-notifications/). Creating content too quickly using this endpoint may result in abuse rate limiting. See "[Abuse rate limits](https://developer.github.com/v3/#abuse-rate-limits)" and "[Dealing with abuse rate limits](https://developer.github.com/v3/guides/best-practices-for-integrators/#dealing-with-abuse-rate-limits)" for details.
    */
  @JSName("createDiscussionComment")
  var createDiscussionComment_Original: Anon_EndpointParamsPromiseResponseTeamsCreateDiscussionCommentParams = js.native
  /**
    * Creates a new discussion post on a team's page. OAuth access tokens require the `write:discussion` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    *
    * This endpoint triggers [notifications](https://help.github.com/articles/about-notifications/). Creating content too quickly using this endpoint may result in abuse rate limiting. See "[Abuse rate limits](https://developer.github.com/v3/#abuse-rate-limits)" and "[Dealing with abuse rate limits](https://developer.github.com/v3/guides/best-practices-for-integrators/#dealing-with-abuse-rate-limits)" for details.
    */
  @JSName("createDiscussion")
  var createDiscussion_Original: Anon_EndpointParamsPromiseResponseTeamsCreateDiscussionParams = js.native
  /**
    * To create a team, the authenticated user must be a member or owner of `:org`. By default, organization members can create teams. Organization owners can limit team creation to organization owners. For more information, see "[Setting team creation permissions](https://help.github.com/en/articles/setting-team-creation-permissions-in-your-organization)."
    */
  @JSName("create")
  var create_Original: Anon_EndpointParamsPromiseResponseTeamsCreateParams = js.native
  /**
    * Deletes a comment on a team discussion. OAuth access tokens require the `write:discussion` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  @JSName("deleteDiscussionComment")
  var deleteDiscussionComment_Original: Anon_EndpointParamsAnyResponsePromiseTeamsDeleteDiscussionCommentParams = js.native
  /**
    * Delete a discussion from a team's page. OAuth access tokens require the `write:discussion` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  @JSName("deleteDiscussion")
  var deleteDiscussion_Original: Anon_EndpointParamsAnyResponsePromiseTeamsDeleteDiscussionParams = js.native
  /**
    * To delete a team, the authenticated user must be a team maintainer or an owner of the org associated with the team.
    *
    * If you are an organization owner and you pass the `hellcat-preview` media type, deleting a parent team will delete all of its child teams as well.
    */
  @JSName("delete")
  var delete_Original: Anon_EndpointParamsAnyResponsePromiseTeamsDeleteParams = js.native
  /**
    * Gets a team using the team's `slug`. GitHub generates the `slug` from the team `name`.
    */
  @JSName("getByName")
  var getByName_Original: Anon_EndpointParamsPromiseResponseTeamsGetByNameParams = js.native
  /**
    * Get a specific comment on a team discussion. OAuth access tokens require the `read:discussion` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  @JSName("getDiscussionComment")
  var getDiscussionComment_Original: Anon_EndpointParamsPromiseResponseTeamsGetDiscussionCommentParams = js.native
  /**
    * Get a specific discussion on a team's page. OAuth access tokens require the `read:discussion` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  @JSName("getDiscussion")
  var getDiscussion_Original: Anon_EndpointParamsPromiseResponseTeamsGetDiscussionParams = js.native
  /**
    * The "Get team member" API (described below) is deprecated.
    *
    * We recommend using the [Get team membership API](https://developer.github.com/v3/teams/members/#get-team-membership) instead. It allows you to get both active and pending memberships.
    *
    * To list members in a team, the team must be visible to the authenticated user.
    */
  @JSName("getMember")
  var getMember_Original: Anon_EndpointParamsAnyResponsePromiseTeamsGetMemberParams = js.native
  /**
    * If you pass the `hellcat-preview` media type, team members will include the members of child teams.
    *
    * To get a user's membership with a team, the team must be visible to the authenticated user.
    *
    * **Note:** The `role` for organization owners returns as `maintainer`. For more information about `maintainer` roles, see [Create team](https://developer.github.com/v3/teams#create-team).
    */
  @JSName("getMembership")
  var getMembership_Original: Anon_EndpointParamsPromiseResponseTeamsGetMembershipParams = js.native
  @JSName("get")
  var get_Original: Anon_EndpointParamsPromiseResponseTeamsGetParams = js.native
  /**
    * At this time, the `hellcat-preview` media type is required to use this endpoint.
    */
  @JSName("listChild")
  var listChild_Original: Anon_EndpointParamsPromiseResponseTeamsListChildParams = js.native
  /**
    * List all comments on a team discussion. OAuth access tokens require the `read:discussion` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  @JSName("listDiscussionComments")
  var listDiscussionComments_Original: Anon_EndpointParamsPromiseResponseTeamsListDiscussionCommentsParams = js.native
  /**
    * List all discussions on a team's page. OAuth access tokens require the `read:discussion` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  @JSName("listDiscussions")
  var listDiscussions_Original: Anon_EndpointParamsPromiseResponseTeamsListDiscussionsParams = js.native
  /**
    * List all of the teams across all of the organizations to which the authenticated user belongs. This method requires `user`, `repo`, or `read:org` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/) when authenticating via [OAuth](https://developer.github.com/apps/building-oauth-apps/).
    */
  @JSName("listForAuthenticatedUser")
  var listForAuthenticatedUser_Original: Anon_EndpointParamsPromiseResponseTeamsListForAuthenticatedUserParams = js.native
  /**
    * If you pass the `hellcat-preview` media type, team members will include the members of child teams.
    */
  @JSName("listMembers")
  var listMembers_Original: Anon_EndpointParamsPromiseResponseTeamsListMembersParams = js.native
  /**
    * The return hash contains a `role` field which refers to the Organization Invitation role and will be one of the following values: `direct_member`, `admin`, `billing_manager`, `hiring_manager`, or `reinstate`. If the invitee is not a GitHub member, the `login` field in the return hash will be `null`.
    */
  @JSName("listPendingInvitations")
  var listPendingInvitations_Original: Anon_EndpointParamsPromiseResponseTeamsListPendingInvitationsParams = js.native
  /**
    * Lists the organization projects for a team. If you pass the `hellcat-preview` media type, the response will include projects inherited from a parent team.
    */
  @JSName("listProjects")
  var listProjects_Original: Anon_EndpointParamsPromiseResponseTeamsListProjectsParams = js.native
  /**
    * **Note**: If you pass the `hellcat-preview` media type, the response will include any repositories inherited through a parent team.
    */
  @JSName("listRepos")
  var listRepos_Original: Anon_EndpointParamsPromiseResponseTeamsListReposParams = js.native
  @JSName("list")
  var list_Original: Anon_EndpointParamsPromiseResponseTeamsListParams = js.native
  /**
    * The "Remove team member" API (described below) is deprecated.
    *
    * We recommend using the [Remove team membership endpoint](https://developer.github.com/v3/teams/members/#remove-team-membership) instead. It allows you to remove both active and pending memberships.
    *
    * Team synchronization is available for organizations using GitHub Enterprise Cloud. For more information, see [GitHub's products](https://help.github.com/articles/github-s-products) in the GitHub Help documentation.
    *
    * To remove a team member, the authenticated user must have 'admin' permissions to the team or be an owner of the org that the team is associated with. Removing a team member does not delete the user, it just removes them from the team.
    *
    * **Note:** When you have team synchronization set up for a team with your organization's identity provider (IdP), you will see an error if you attempt to use the API for making changes to the team's membership. If you have access to manage group membership in your IdP, you can manage GitHub team membership through your identity provider, which automatically adds and removes team members in an organization. For more information, see "[Synchronizing teams between your identity provider and GitHub](https://help.github.com/articles/synchronizing-teams-between-your-identity-provider-and-github/)."
    */
  @JSName("removeMember")
  var removeMember_Original: Anon_EndpointParamsAnyResponsePromiseTeamsRemoveMemberParams = js.native
  /**
    * Team synchronization is available for organizations using GitHub Enterprise Cloud. For more information, see [GitHub's products](https://help.github.com/articles/github-s-products) in the GitHub Help documentation.
    *
    * To remove a membership between a user and a team, the authenticated user must have 'admin' permissions to the team or be an owner of the organization that the team is associated with. Removing team membership does not delete the user, it just removes their membership from the team.
    *
    * **Note:** When you have team synchronization set up for a team with your organization's identity provider (IdP), you will see an error if you attempt to use the API for making changes to the team's membership. If you have access to manage group membership in your IdP, you can manage GitHub team membership through your identity provider, which automatically adds and removes team members in an organization. For more information, see "[Synchronizing teams between your identity provider and GitHub](https://help.github.com/articles/synchronizing-teams-between-your-identity-provider-and-github/)."
    */
  @JSName("removeMembership")
  var removeMembership_Original: Anon_EndpointParamsAnyResponsePromiseTeamsRemoveMembershipParams = js.native
  /**
    * Removes an organization project from a team. An organization owner or a team maintainer can remove any project from the team. To remove a project from a team as an organization member, the authenticated user must have `read` access to both the team and project, or `admin` access to the team or project. **Note:** This endpoint removes the project from the team, but does not delete it.
    */
  @JSName("removeProject")
  var removeProject_Original: Anon_EndpointParamsAnyResponsePromiseTeamsRemoveProjectParams = js.native
  /**
    * If the authenticated user is an organization owner or a team maintainer, they can remove any repositories from the team. To remove a repository from a team as an organization member, the authenticated user must have admin access to the repository and must be able to see the team. NOTE: This does not delete the repository, it just removes it from the team.
    */
  @JSName("removeRepo")
  var removeRepo_Original: Anon_EndpointParamsAnyResponsePromiseTeamsRemoveRepoParams = js.native
  /**
    * Checks whether a team has `read`, `write`, or `admin` permissions for an organization project. If you pass the `hellcat-preview` media type, the response will include projects inherited from a parent team.
    */
  @JSName("reviewProject")
  var reviewProject_Original: Anon_EndpointParamsPromiseResponseTeamsReviewProjectParams = js.native
  /**
    * Edits the body text of a discussion comment. OAuth access tokens require the `write:discussion` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  @JSName("updateDiscussionComment")
  var updateDiscussionComment_Original: Anon_EndpointParamsPromiseResponseTeamsUpdateDiscussionCommentParams = js.native
  /**
    * Edits the title and body text of a discussion post. Only the parameters you provide are updated. OAuth access tokens require the `write:discussion` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  @JSName("updateDiscussion")
  var updateDiscussion_Original: Anon_EndpointParamsPromiseResponseTeamsUpdateDiscussionParams = js.native
  /**
    * To edit a team, the authenticated user must either be an owner of the org that the team is associated with, or a maintainer of the team.
    *
    * **Note:** With nested teams, the `privacy` for parent teams cannot be `secret`.
    */
  @JSName("update")
  var update_Original: Anon_EndpointParamsPromiseResponseTeamsUpdateParams = js.native
  /**
    * The "Add team member" API (described below) is deprecated.
    *
    * We recommend using the [Add team membership API](https://developer.github.com/v3/teams/members/#add-or-update-team-membership) instead. It allows you to invite new organization members to your teams.
    *
    * Team synchronization is available for organizations using GitHub Enterprise Cloud. For more information, see [GitHub's products](https://help.github.com/articles/github-s-products) in the GitHub Help documentation.
    *
    * To add someone to a team, the authenticated user must be a team maintainer in the team they're changing or be an owner of the organization that the team is associated with. The person being added to the team must be a member of the team's organization.
    *
    * **Note:** When you have team synchronization set up for a team with your organization's identity provider (IdP), you will see an error if you attempt to use the API for making changes to the team's membership. If you have access to manage group membership in your IdP, you can manage GitHub team membership through your identity provider, which automatically adds and removes team members in an organization. For more information, see "[Synchronizing teams between your identity provider and GitHub](https://help.github.com/articles/synchronizing-teams-between-your-identity-provider-and-github/)."
    *
    * Note that you'll need to set `Content-Length` to zero when calling out to this endpoint. For more information, see "[HTTP verbs](https://developer.github.com/v3/#http-verbs)."
    */
  def addMember(): js.Promise[Response[TeamsAddMemberResponse]] = js.native
  def addMember(params: TeamsAddMemberParams): js.Promise[Response[TeamsAddMemberResponse]] = js.native
  /**
    * Team synchronization is available for organizations using GitHub Enterprise Cloud. For more information, see [GitHub's products](https://help.github.com/articles/github-s-products) in the GitHub Help documentation.
    *
    * If the user is already a member of the team's organization, this endpoint will add the user to the team. To add a membership between an organization member and a team, the authenticated user must be an organization owner or a maintainer of the team.
    *
    * **Note:** When you have team synchronization set up for a team with your organization's identity provider (IdP), you will see an error if you attempt to use the API for making changes to the team's membership. If you have access to manage group membership in your IdP, you can manage GitHub team membership through your identity provider, which automatically adds and removes team members in an organization. For more information, see "[Synchronizing teams between your identity provider and GitHub](https://help.github.com/articles/synchronizing-teams-between-your-identity-provider-and-github/)."
    *
    * If the user is unaffiliated with the team's organization, this endpoint will send an invitation to the user via email. This newly-created membership will be in the "pending" state until the user accepts the invitation, at which point the membership will transition to the "active" state and the user will be added as a member of the team. To add a membership between an unaffiliated user and a team, the authenticated user must be an organization owner.
    *
    * If the user is already a member of the team, this endpoint will update the role of the team member's role. To update the membership of a team member, the authenticated user must be an organization owner or a maintainer of the team.
    */
  def addOrUpdateMembership(): js.Promise[Response[TeamsAddOrUpdateMembershipResponse]] = js.native
  def addOrUpdateMembership(params: TeamsAddOrUpdateMembershipParams): js.Promise[Response[TeamsAddOrUpdateMembershipResponse]] = js.native
  /**
    * Adds an organization project to a team. To add a project to a team or update the team's permission on a project, the authenticated user must have `admin` permissions for the project. The project and team must be part of the same organization.
    */
  def addOrUpdateProject(): js.Promise[Response[TeamsAddOrUpdateProjectResponse]] = js.native
  def addOrUpdateProject(params: TeamsAddOrUpdateProjectParams): js.Promise[Response[TeamsAddOrUpdateProjectResponse]] = js.native
  /**
    * To add a repository to a team or update the team's permission on a repository, the authenticated user must have admin access to the repository, and must be able to see the team. The repository must be owned by the organization, or a direct fork of a repository owned by the organization. You will get a `422 Unprocessable Entity` status if you attempt to add a repository to a team that is not owned by the organization.
    *
    * If you pass the `hellcat-preview` media type, you can modify repository permissions of child teams.
    *
    * Note that, if you choose not to pass any parameters, you'll need to set `Content-Length` to zero when calling out to this endpoint. For more information, see "[HTTP verbs](https://developer.github.com/v3/#http-verbs)."
    */
  def addOrUpdateRepo(): js.Promise[AnyResponse] = js.native
  def addOrUpdateRepo(params: TeamsAddOrUpdateRepoParams): js.Promise[AnyResponse] = js.native
  /**
    * **Note**: If you pass the `hellcat-preview` media type, repositories inherited through a parent team will be checked.
    *
    * You can also get information about the specified repository, including what permissions the team grants on it, by passing the following custom [media type](https://developer.github.com/v3/media/) via the `Accept` header:
    */
  def checkManagesRepo(): js.Promise[Response[TeamsCheckManagesRepoResponse]] = js.native
  def checkManagesRepo(params: TeamsCheckManagesRepoParams): js.Promise[Response[TeamsCheckManagesRepoResponse]] = js.native
  /**
    * To create a team, the authenticated user must be a member or owner of `:org`. By default, organization members can create teams. Organization owners can limit team creation to organization owners. For more information, see "[Setting team creation permissions](https://help.github.com/en/articles/setting-team-creation-permissions-in-your-organization)."
    */
  def create(): js.Promise[Response[TeamsCreateResponse]] = js.native
  def create(params: TeamsCreateParams): js.Promise[Response[TeamsCreateResponse]] = js.native
  /**
    * Creates a new discussion post on a team's page. OAuth access tokens require the `write:discussion` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    *
    * This endpoint triggers [notifications](https://help.github.com/articles/about-notifications/). Creating content too quickly using this endpoint may result in abuse rate limiting. See "[Abuse rate limits](https://developer.github.com/v3/#abuse-rate-limits)" and "[Dealing with abuse rate limits](https://developer.github.com/v3/guides/best-practices-for-integrators/#dealing-with-abuse-rate-limits)" for details.
    */
  def createDiscussion(): js.Promise[Response[TeamsCreateDiscussionResponse]] = js.native
  def createDiscussion(params: TeamsCreateDiscussionParams): js.Promise[Response[TeamsCreateDiscussionResponse]] = js.native
  /**
    * Creates a new comment on a team discussion. OAuth access tokens require the `write:discussion` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    *
    * This endpoint triggers [notifications](https://help.github.com/articles/about-notifications/). Creating content too quickly using this endpoint may result in abuse rate limiting. See "[Abuse rate limits](https://developer.github.com/v3/#abuse-rate-limits)" and "[Dealing with abuse rate limits](https://developer.github.com/v3/guides/best-practices-for-integrators/#dealing-with-abuse-rate-limits)" for details.
    */
  def createDiscussionComment(): js.Promise[Response[TeamsCreateDiscussionCommentResponse]] = js.native
  def createDiscussionComment(params: TeamsCreateDiscussionCommentParams): js.Promise[Response[TeamsCreateDiscussionCommentResponse]] = js.native
  /**
    * To delete a team, the authenticated user must be a team maintainer or an owner of the org associated with the team.
    *
    * If you are an organization owner and you pass the `hellcat-preview` media type, deleting a parent team will delete all of its child teams as well.
    */
  def delete(): js.Promise[AnyResponse] = js.native
  def delete(params: TeamsDeleteParams): js.Promise[AnyResponse] = js.native
  /**
    * Delete a discussion from a team's page. OAuth access tokens require the `write:discussion` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  def deleteDiscussion(): js.Promise[AnyResponse] = js.native
  def deleteDiscussion(params: TeamsDeleteDiscussionParams): js.Promise[AnyResponse] = js.native
  /**
    * Deletes a comment on a team discussion. OAuth access tokens require the `write:discussion` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  def deleteDiscussionComment(): js.Promise[AnyResponse] = js.native
  def deleteDiscussionComment(params: TeamsDeleteDiscussionCommentParams): js.Promise[AnyResponse] = js.native
  def get(): js.Promise[Response[TeamsGetResponse]] = js.native
  def get(params: TeamsGetParams): js.Promise[Response[TeamsGetResponse]] = js.native
  /**
    * Gets a team using the team's `slug`. GitHub generates the `slug` from the team `name`.
    */
  def getByName(): js.Promise[Response[TeamsGetByNameResponse]] = js.native
  def getByName(params: TeamsGetByNameParams): js.Promise[Response[TeamsGetByNameResponse]] = js.native
  /**
    * Get a specific discussion on a team's page. OAuth access tokens require the `read:discussion` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  def getDiscussion(): js.Promise[Response[TeamsGetDiscussionResponse]] = js.native
  def getDiscussion(params: TeamsGetDiscussionParams): js.Promise[Response[TeamsGetDiscussionResponse]] = js.native
  /**
    * Get a specific comment on a team discussion. OAuth access tokens require the `read:discussion` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  def getDiscussionComment(): js.Promise[Response[TeamsGetDiscussionCommentResponse]] = js.native
  def getDiscussionComment(params: TeamsGetDiscussionCommentParams): js.Promise[Response[TeamsGetDiscussionCommentResponse]] = js.native
  /**
    * The "Get team member" API (described below) is deprecated.
    *
    * We recommend using the [Get team membership API](https://developer.github.com/v3/teams/members/#get-team-membership) instead. It allows you to get both active and pending memberships.
    *
    * To list members in a team, the team must be visible to the authenticated user.
    */
  def getMember(): js.Promise[AnyResponse] = js.native
  def getMember(params: TeamsGetMemberParams): js.Promise[AnyResponse] = js.native
  /**
    * If you pass the `hellcat-preview` media type, team members will include the members of child teams.
    *
    * To get a user's membership with a team, the team must be visible to the authenticated user.
    *
    * **Note:** The `role` for organization owners returns as `maintainer`. For more information about `maintainer` roles, see [Create team](https://developer.github.com/v3/teams#create-team).
    */
  def getMembership(): js.Promise[Response[TeamsGetMembershipResponse]] = js.native
  def getMembership(params: TeamsGetMembershipParams): js.Promise[Response[TeamsGetMembershipResponse]] = js.native
  def list(): js.Promise[Response[TeamsListResponse]] = js.native
  def list(params: TeamsListParams): js.Promise[Response[TeamsListResponse]] = js.native
  /**
    * At this time, the `hellcat-preview` media type is required to use this endpoint.
    */
  def listChild(): js.Promise[Response[TeamsListChildResponse]] = js.native
  def listChild(params: TeamsListChildParams): js.Promise[Response[TeamsListChildResponse]] = js.native
  /**
    * List all comments on a team discussion. OAuth access tokens require the `read:discussion` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  def listDiscussionComments(): js.Promise[Response[TeamsListDiscussionCommentsResponse]] = js.native
  def listDiscussionComments(params: TeamsListDiscussionCommentsParams): js.Promise[Response[TeamsListDiscussionCommentsResponse]] = js.native
  /**
    * List all discussions on a team's page. OAuth access tokens require the `read:discussion` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  def listDiscussions(): js.Promise[Response[TeamsListDiscussionsResponse]] = js.native
  def listDiscussions(params: TeamsListDiscussionsParams): js.Promise[Response[TeamsListDiscussionsResponse]] = js.native
  /**
    * List all of the teams across all of the organizations to which the authenticated user belongs. This method requires `user`, `repo`, or `read:org` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/) when authenticating via [OAuth](https://developer.github.com/apps/building-oauth-apps/).
    */
  def listForAuthenticatedUser(): js.Promise[Response[TeamsListForAuthenticatedUserResponse]] = js.native
  def listForAuthenticatedUser(params: TeamsListForAuthenticatedUserParams): js.Promise[Response[TeamsListForAuthenticatedUserResponse]] = js.native
  /**
    * If you pass the `hellcat-preview` media type, team members will include the members of child teams.
    */
  def listMembers(): js.Promise[Response[TeamsListMembersResponse]] = js.native
  def listMembers(params: TeamsListMembersParams): js.Promise[Response[TeamsListMembersResponse]] = js.native
  /**
    * The return hash contains a `role` field which refers to the Organization Invitation role and will be one of the following values: `direct_member`, `admin`, `billing_manager`, `hiring_manager`, or `reinstate`. If the invitee is not a GitHub member, the `login` field in the return hash will be `null`.
    */
  def listPendingInvitations(): js.Promise[Response[TeamsListPendingInvitationsResponse]] = js.native
  def listPendingInvitations(params: TeamsListPendingInvitationsParams): js.Promise[Response[TeamsListPendingInvitationsResponse]] = js.native
  /**
    * Lists the organization projects for a team. If you pass the `hellcat-preview` media type, the response will include projects inherited from a parent team.
    */
  def listProjects(): js.Promise[Response[TeamsListProjectsResponse]] = js.native
  def listProjects(params: TeamsListProjectsParams): js.Promise[Response[TeamsListProjectsResponse]] = js.native
  /**
    * **Note**: If you pass the `hellcat-preview` media type, the response will include any repositories inherited through a parent team.
    */
  def listRepos(): js.Promise[Response[TeamsListReposResponse]] = js.native
  def listRepos(params: TeamsListReposParams): js.Promise[Response[TeamsListReposResponse]] = js.native
  /**
    * The "Remove team member" API (described below) is deprecated.
    *
    * We recommend using the [Remove team membership endpoint](https://developer.github.com/v3/teams/members/#remove-team-membership) instead. It allows you to remove both active and pending memberships.
    *
    * Team synchronization is available for organizations using GitHub Enterprise Cloud. For more information, see [GitHub's products](https://help.github.com/articles/github-s-products) in the GitHub Help documentation.
    *
    * To remove a team member, the authenticated user must have 'admin' permissions to the team or be an owner of the org that the team is associated with. Removing a team member does not delete the user, it just removes them from the team.
    *
    * **Note:** When you have team synchronization set up for a team with your organization's identity provider (IdP), you will see an error if you attempt to use the API for making changes to the team's membership. If you have access to manage group membership in your IdP, you can manage GitHub team membership through your identity provider, which automatically adds and removes team members in an organization. For more information, see "[Synchronizing teams between your identity provider and GitHub](https://help.github.com/articles/synchronizing-teams-between-your-identity-provider-and-github/)."
    */
  def removeMember(): js.Promise[AnyResponse] = js.native
  def removeMember(params: TeamsRemoveMemberParams): js.Promise[AnyResponse] = js.native
  /**
    * Team synchronization is available for organizations using GitHub Enterprise Cloud. For more information, see [GitHub's products](https://help.github.com/articles/github-s-products) in the GitHub Help documentation.
    *
    * To remove a membership between a user and a team, the authenticated user must have 'admin' permissions to the team or be an owner of the organization that the team is associated with. Removing team membership does not delete the user, it just removes their membership from the team.
    *
    * **Note:** When you have team synchronization set up for a team with your organization's identity provider (IdP), you will see an error if you attempt to use the API for making changes to the team's membership. If you have access to manage group membership in your IdP, you can manage GitHub team membership through your identity provider, which automatically adds and removes team members in an organization. For more information, see "[Synchronizing teams between your identity provider and GitHub](https://help.github.com/articles/synchronizing-teams-between-your-identity-provider-and-github/)."
    */
  def removeMembership(): js.Promise[AnyResponse] = js.native
  def removeMembership(params: TeamsRemoveMembershipParams): js.Promise[AnyResponse] = js.native
  /**
    * Removes an organization project from a team. An organization owner or a team maintainer can remove any project from the team. To remove a project from a team as an organization member, the authenticated user must have `read` access to both the team and project, or `admin` access to the team or project. **Note:** This endpoint removes the project from the team, but does not delete it.
    */
  def removeProject(): js.Promise[AnyResponse] = js.native
  def removeProject(params: TeamsRemoveProjectParams): js.Promise[AnyResponse] = js.native
  /**
    * If the authenticated user is an organization owner or a team maintainer, they can remove any repositories from the team. To remove a repository from a team as an organization member, the authenticated user must have admin access to the repository and must be able to see the team. NOTE: This does not delete the repository, it just removes it from the team.
    */
  def removeRepo(): js.Promise[AnyResponse] = js.native
  def removeRepo(params: TeamsRemoveRepoParams): js.Promise[AnyResponse] = js.native
  /**
    * Checks whether a team has `read`, `write`, or `admin` permissions for an organization project. If you pass the `hellcat-preview` media type, the response will include projects inherited from a parent team.
    */
  def reviewProject(): js.Promise[Response[TeamsReviewProjectResponse]] = js.native
  def reviewProject(params: TeamsReviewProjectParams): js.Promise[Response[TeamsReviewProjectResponse]] = js.native
  /**
    * To edit a team, the authenticated user must either be an owner of the org that the team is associated with, or a maintainer of the team.
    *
    * **Note:** With nested teams, the `privacy` for parent teams cannot be `secret`.
    */
  def update(): js.Promise[Response[TeamsUpdateResponse]] = js.native
  def update(params: TeamsUpdateParams): js.Promise[Response[TeamsUpdateResponse]] = js.native
  /**
    * Edits the title and body text of a discussion post. Only the parameters you provide are updated. OAuth access tokens require the `write:discussion` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  def updateDiscussion(): js.Promise[Response[TeamsUpdateDiscussionResponse]] = js.native
  def updateDiscussion(params: TeamsUpdateDiscussionParams): js.Promise[Response[TeamsUpdateDiscussionResponse]] = js.native
  /**
    * Edits the body text of a discussion comment. OAuth access tokens require the `write:discussion` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  def updateDiscussionComment(): js.Promise[Response[TeamsUpdateDiscussionCommentResponse]] = js.native
  def updateDiscussionComment(params: TeamsUpdateDiscussionCommentParams): js.Promise[Response[TeamsUpdateDiscussionCommentResponse]] = js.native
}

