package typings
package atOctokitRestLib

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
    * To add a user to a team, the authenticated user must have 'admin' permissions to the team or be an owner of the organization that the team is associated with, and the user being added must already be a member of at least one other team on the same organization.
    *
    * Note that you'll need to set `Content-Length` to zero when calling out to this endpoint. For more information, see "[HTTP verbs](https://developer.github.com/v3/#http-verbs)."
    *
    * If you attempt to add an organization to a team, you will get this:
    *
    * If you attempt to add a user to a team and that user is not a member of at least one other team on the same organization, you will get this:
    */
  @JSName("addMember")
  var addMember_Original: Anon_EndpointParamsPromiseResponseTeamsAddMemberParams = js.native
  /**
    * If the user is already a member of the team's organization, this endpoint will add the user to the team. To add a membership between an organization member and a team, the authenticated user must be an organization owner or a maintainer of the team.
    *
    * If the user is unaffiliated with the team's organization, this endpoint will send an invitation to the user via email. This newly-created membership will be in the "pending" state until the user accepts the invitation, at which point the membership will transition to the "active" state and the user will be added as a member of the team. To add a membership between an unaffiliated user and a team, the authenticated user must be an organization owner.
    *
    * If the user is already a member of the team, this endpoint will update the role of the team member's role. To update the membership of a team member, the authenticated user must be an organization owner or a maintainer of the team.
    *
    * If you attempt to add an organization to a team, you will get this:
    */
  @JSName("addOrUpdateMembership")
  var addOrUpdateMembership_Original: Anon_EndpointParamsAnyResponsePromiseTeamsAddOrUpdateMembershipParams = js.native
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
  var addOrUpdateRepo_Original: Anon_EndpointParamsPromiseResponseTeamsAddOrUpdateRepoParams = js.native
  /**
    * **Note**: If you pass the `hellcat-preview` media type, repositories inherited through a parent team will be checked.
    *
    * You can also get information about the specified repository, including what permissions the team grants on it, by passing the following custom [media type](https://developer.github.com/v3/media/) via the `Accept` header:
    */
  @JSName("checkManagesRepo")
  var checkManagesRepo_Original: Anon_EndpointParamsAnyResponsePromiseTeamsCheckManagesRepoParams = js.native
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
  var deleteDiscussionComment_Original: Anon_EndpointParamsPromiseResponseTeamsDeleteDiscussionCommentParams = js.native
  /**
    * Delete a discussion from a team's page. OAuth access tokens require the `write:discussion` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  @JSName("deleteDiscussion")
  var deleteDiscussion_Original: Anon_EndpointParamsPromiseResponseTeamsDeleteDiscussionParams = js.native
  /**
    * To delete a team, the authenticated user must be a team maintainer or an owner of the org associated with the team.
    *
    * If you are an organization owner and you pass the `hellcat-preview` media type, deleting a parent team will delete all of its child teams as well.
    */
  @JSName("delete")
  var delete_Original: Anon_EndpointParamsPromiseResponseTeamsDeleteParams = js.native
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
  var getMembership_Original: Anon_EndpointParamsAnyResponsePromiseTeamsGetMembershipParams = js.native
  @JSName("get")
  var get_Original: Anon_EndpointParamsPromiseResponseTeamsGetParams = js.native
  /**
    * At this time, the `hellcat-preview` media type is required to use this endpoint.
    */
  @JSName("listChild")
  var listChild_Original: Anon_EndpointParamsAnyResponsePromiseTeamsListChildParams = js.native
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
  var list_Original: Anon_EndpointParamsPromiseResponse = js.native
  /**
    * The "Remove team member" API (described below) is deprecated.
    *
    * We recommend using the [Remove team membership API](https://developer.github.com/v3/teams/members/#remove-team-membership) instead. It allows you to remove both active and pending memberships.
    *
    * To remove a user from a team, the authenticated user must have 'admin' permissions to the team or be an owner of the org that the team is associated with. NOTE: This does not delete the user, it just removes them from the team.
    */
  @JSName("removeMember")
  var removeMember_Original: Anon_EndpointParamsPromiseResponseTeamsRemoveMemberParams = js.native
  /**
    * To remove a membership between a user and a team, the authenticated user must have 'admin' permissions to the team or be an owner of the organization that the team is associated with. NOTE: This does not delete the user, it just removes their membership from the team.
    */
  @JSName("removeMembership")
  var removeMembership_Original: Anon_EndpointParamsPromiseResponseTeamsRemoveMembershipParams = js.native
  /**
    * Removes an organization project from a team. An organization owner or a team maintainer can remove any project from the team. To remove a project from a team as an organization member, the authenticated user must have `read` access to both the team and project, or `admin` access to the team or project. **Note:** This endpoint removes the project from the team, but does not delete it.
    */
  @JSName("removeProject")
  var removeProject_Original: Anon_EndpointParamsPromiseResponseTeamsRemoveProjectParams = js.native
  /**
    * If the authenticated user is an organization owner or a team maintainer, they can remove any repositories from the team. To remove a repository from a team as an organization member, the authenticated user must have admin access to the repository and must be able to see the team. NOTE: This does not delete the repository, it just removes it from the team.
    */
  @JSName("removeRepo")
  var removeRepo_Original: Anon_EndpointParamsPromiseResponseTeamsRemoveRepoParams = js.native
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
    * To add a user to a team, the authenticated user must have 'admin' permissions to the team or be an owner of the organization that the team is associated with, and the user being added must already be a member of at least one other team on the same organization.
    *
    * Note that you'll need to set `Content-Length` to zero when calling out to this endpoint. For more information, see "[HTTP verbs](https://developer.github.com/v3/#http-verbs)."
    *
    * If you attempt to add an organization to a team, you will get this:
    *
    * If you attempt to add a user to a team and that user is not a member of at least one other team on the same organization, you will get this:
    */
  def addMember(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.TeamsAddMemberResponse]
  ] = js.native
  def addMember(params: atOctokitRestLib.atOctokitRestMod.TeamsAddMemberParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.TeamsAddMemberResponse]
  ] = js.native
  /**
    * If the user is already a member of the team's organization, this endpoint will add the user to the team. To add a membership between an organization member and a team, the authenticated user must be an organization owner or a maintainer of the team.
    *
    * If the user is unaffiliated with the team's organization, this endpoint will send an invitation to the user via email. This newly-created membership will be in the "pending" state until the user accepts the invitation, at which point the membership will transition to the "active" state and the user will be added as a member of the team. To add a membership between an unaffiliated user and a team, the authenticated user must be an organization owner.
    *
    * If the user is already a member of the team, this endpoint will update the role of the team member's role. To update the membership of a team member, the authenticated user must be an organization owner or a maintainer of the team.
    *
    * If you attempt to add an organization to a team, you will get this:
    */
  def addOrUpdateMembership(): js.Promise[atOctokitRestLib.atOctokitRestMod.AnyResponse] = js.native
  def addOrUpdateMembership(params: atOctokitRestLib.atOctokitRestMod.TeamsAddOrUpdateMembershipParams): js.Promise[atOctokitRestLib.atOctokitRestMod.AnyResponse] = js.native
  /**
    * Adds an organization project to a team. To add a project to a team or update the team's permission on a project, the authenticated user must have `admin` permissions for the project. The project and team must be part of the same organization.
    */
  def addOrUpdateProject(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.TeamsAddOrUpdateProjectResponse]
  ] = js.native
  def addOrUpdateProject(params: atOctokitRestLib.atOctokitRestMod.TeamsAddOrUpdateProjectParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.TeamsAddOrUpdateProjectResponse]
  ] = js.native
  /**
    * To add a repository to a team or update the team's permission on a repository, the authenticated user must have admin access to the repository, and must be able to see the team. The repository must be owned by the organization, or a direct fork of a repository owned by the organization. You will get a `422 Unprocessable Entity` status if you attempt to add a repository to a team that is not owned by the organization.
    *
    * If you pass the `hellcat-preview` media type, you can modify repository permissions of child teams.
    *
    * Note that, if you choose not to pass any parameters, you'll need to set `Content-Length` to zero when calling out to this endpoint. For more information, see "[HTTP verbs](https://developer.github.com/v3/#http-verbs)."
    */
  def addOrUpdateRepo(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.TeamsAddOrUpdateRepoResponse]
  ] = js.native
  def addOrUpdateRepo(params: atOctokitRestLib.atOctokitRestMod.TeamsAddOrUpdateRepoParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.TeamsAddOrUpdateRepoResponse]
  ] = js.native
  /**
    * **Note**: If you pass the `hellcat-preview` media type, repositories inherited through a parent team will be checked.
    *
    * You can also get information about the specified repository, including what permissions the team grants on it, by passing the following custom [media type](https://developer.github.com/v3/media/) via the `Accept` header:
    */
  def checkManagesRepo(): js.Promise[atOctokitRestLib.atOctokitRestMod.AnyResponse] = js.native
  def checkManagesRepo(params: atOctokitRestLib.atOctokitRestMod.TeamsCheckManagesRepoParams): js.Promise[atOctokitRestLib.atOctokitRestMod.AnyResponse] = js.native
  /**
    * To create a team, the authenticated user must be a member or owner of `:org`. By default, organization members can create teams. Organization owners can limit team creation to organization owners. For more information, see "[Setting team creation permissions](https://help.github.com/en/articles/setting-team-creation-permissions-in-your-organization)."
    */
  def create(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.TeamsCreateResponse]
  ] = js.native
  def create(params: atOctokitRestLib.atOctokitRestMod.TeamsCreateParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.TeamsCreateResponse]
  ] = js.native
  /**
    * Creates a new discussion post on a team's page. OAuth access tokens require the `write:discussion` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    *
    * This endpoint triggers [notifications](https://help.github.com/articles/about-notifications/). Creating content too quickly using this endpoint may result in abuse rate limiting. See "[Abuse rate limits](https://developer.github.com/v3/#abuse-rate-limits)" and "[Dealing with abuse rate limits](https://developer.github.com/v3/guides/best-practices-for-integrators/#dealing-with-abuse-rate-limits)" for details.
    */
  def createDiscussion(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.TeamsCreateDiscussionResponse]
  ] = js.native
  def createDiscussion(params: atOctokitRestLib.atOctokitRestMod.TeamsCreateDiscussionParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.TeamsCreateDiscussionResponse]
  ] = js.native
  /**
    * Creates a new comment on a team discussion. OAuth access tokens require the `write:discussion` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    *
    * This endpoint triggers [notifications](https://help.github.com/articles/about-notifications/). Creating content too quickly using this endpoint may result in abuse rate limiting. See "[Abuse rate limits](https://developer.github.com/v3/#abuse-rate-limits)" and "[Dealing with abuse rate limits](https://developer.github.com/v3/guides/best-practices-for-integrators/#dealing-with-abuse-rate-limits)" for details.
    */
  def createDiscussionComment(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.TeamsCreateDiscussionCommentResponse]
  ] = js.native
  def createDiscussionComment(params: atOctokitRestLib.atOctokitRestMod.TeamsCreateDiscussionCommentParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.TeamsCreateDiscussionCommentResponse]
  ] = js.native
  /**
    * To delete a team, the authenticated user must be a team maintainer or an owner of the org associated with the team.
    *
    * If you are an organization owner and you pass the `hellcat-preview` media type, deleting a parent team will delete all of its child teams as well.
    */
  def delete(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.TeamsDeleteResponse]
  ] = js.native
  def delete(params: atOctokitRestLib.atOctokitRestMod.TeamsDeleteParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.TeamsDeleteResponse]
  ] = js.native
  /**
    * Delete a discussion from a team's page. OAuth access tokens require the `write:discussion` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  def deleteDiscussion(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.TeamsDeleteDiscussionResponse]
  ] = js.native
  def deleteDiscussion(params: atOctokitRestLib.atOctokitRestMod.TeamsDeleteDiscussionParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.TeamsDeleteDiscussionResponse]
  ] = js.native
  /**
    * Deletes a comment on a team discussion. OAuth access tokens require the `write:discussion` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  def deleteDiscussionComment(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.TeamsDeleteDiscussionCommentResponse]
  ] = js.native
  def deleteDiscussionComment(params: atOctokitRestLib.atOctokitRestMod.TeamsDeleteDiscussionCommentParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.TeamsDeleteDiscussionCommentResponse]
  ] = js.native
  def get(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.TeamsGetResponse]
  ] = js.native
  def get(params: atOctokitRestLib.atOctokitRestMod.TeamsGetParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.TeamsGetResponse]
  ] = js.native
  /**
    * Gets a team using the team's `slug`. GitHub generates the `slug` from the team `name`.
    */
  def getByName(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.TeamsGetByNameResponse]
  ] = js.native
  def getByName(params: atOctokitRestLib.atOctokitRestMod.TeamsGetByNameParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.TeamsGetByNameResponse]
  ] = js.native
  /**
    * Get a specific discussion on a team's page. OAuth access tokens require the `read:discussion` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  def getDiscussion(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.TeamsGetDiscussionResponse]
  ] = js.native
  def getDiscussion(params: atOctokitRestLib.atOctokitRestMod.TeamsGetDiscussionParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.TeamsGetDiscussionResponse]
  ] = js.native
  /**
    * Get a specific comment on a team discussion. OAuth access tokens require the `read:discussion` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  def getDiscussionComment(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.TeamsGetDiscussionCommentResponse]
  ] = js.native
  def getDiscussionComment(params: atOctokitRestLib.atOctokitRestMod.TeamsGetDiscussionCommentParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.TeamsGetDiscussionCommentResponse]
  ] = js.native
  /**
    * The "Get team member" API (described below) is deprecated.
    *
    * We recommend using the [Get team membership API](https://developer.github.com/v3/teams/members/#get-team-membership) instead. It allows you to get both active and pending memberships.
    *
    * To list members in a team, the team must be visible to the authenticated user.
    */
  def getMember(): js.Promise[atOctokitRestLib.atOctokitRestMod.AnyResponse] = js.native
  def getMember(params: atOctokitRestLib.atOctokitRestMod.TeamsGetMemberParams): js.Promise[atOctokitRestLib.atOctokitRestMod.AnyResponse] = js.native
  /**
    * If you pass the `hellcat-preview` media type, team members will include the members of child teams.
    *
    * To get a user's membership with a team, the team must be visible to the authenticated user.
    *
    * **Note:** The `role` for organization owners returns as `maintainer`. For more information about `maintainer` roles, see [Create team](https://developer.github.com/v3/teams#create-team).
    */
  def getMembership(): js.Promise[atOctokitRestLib.atOctokitRestMod.AnyResponse] = js.native
  def getMembership(params: atOctokitRestLib.atOctokitRestMod.TeamsGetMembershipParams): js.Promise[atOctokitRestLib.atOctokitRestMod.AnyResponse] = js.native
  def list(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.TeamsListResponse]
  ] = js.native
  def list(params: atOctokitRestLib.atOctokitRestMod.TeamsListParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.TeamsListResponse]
  ] = js.native
  /**
    * At this time, the `hellcat-preview` media type is required to use this endpoint.
    */
  def listChild(): js.Promise[atOctokitRestLib.atOctokitRestMod.AnyResponse] = js.native
  def listChild(params: atOctokitRestLib.atOctokitRestMod.TeamsListChildParams): js.Promise[atOctokitRestLib.atOctokitRestMod.AnyResponse] = js.native
  /**
    * List all comments on a team discussion. OAuth access tokens require the `read:discussion` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  def listDiscussionComments(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.TeamsListDiscussionCommentsResponse]
  ] = js.native
  def listDiscussionComments(params: atOctokitRestLib.atOctokitRestMod.TeamsListDiscussionCommentsParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.TeamsListDiscussionCommentsResponse]
  ] = js.native
  /**
    * List all discussions on a team's page. OAuth access tokens require the `read:discussion` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  def listDiscussions(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.TeamsListDiscussionsResponse]
  ] = js.native
  def listDiscussions(params: atOctokitRestLib.atOctokitRestMod.TeamsListDiscussionsParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.TeamsListDiscussionsResponse]
  ] = js.native
  /**
    * List all of the teams across all of the organizations to which the authenticated user belongs. This method requires `user`, `repo`, or `read:org` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/) when authenticating via [OAuth](https://developer.github.com/apps/building-oauth-apps/).
    */
  def listForAuthenticatedUser(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.TeamsListForAuthenticatedUserResponse]
  ] = js.native
  def listForAuthenticatedUser(params: atOctokitRestLib.atOctokitRestMod.TeamsListForAuthenticatedUserParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.TeamsListForAuthenticatedUserResponse]
  ] = js.native
  /**
    * If you pass the `hellcat-preview` media type, team members will include the members of child teams.
    */
  def listMembers(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.TeamsListMembersResponse]
  ] = js.native
  def listMembers(params: atOctokitRestLib.atOctokitRestMod.TeamsListMembersParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.TeamsListMembersResponse]
  ] = js.native
  /**
    * The return hash contains a `role` field which refers to the Organization Invitation role and will be one of the following values: `direct_member`, `admin`, `billing_manager`, `hiring_manager`, or `reinstate`. If the invitee is not a GitHub member, the `login` field in the return hash will be `null`.
    */
  def listPendingInvitations(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.TeamsListPendingInvitationsResponse]
  ] = js.native
  def listPendingInvitations(params: atOctokitRestLib.atOctokitRestMod.TeamsListPendingInvitationsParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.TeamsListPendingInvitationsResponse]
  ] = js.native
  /**
    * Lists the organization projects for a team. If you pass the `hellcat-preview` media type, the response will include projects inherited from a parent team.
    */
  def listProjects(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.TeamsListProjectsResponse]
  ] = js.native
  def listProjects(params: atOctokitRestLib.atOctokitRestMod.TeamsListProjectsParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.TeamsListProjectsResponse]
  ] = js.native
  /**
    * **Note**: If you pass the `hellcat-preview` media type, the response will include any repositories inherited through a parent team.
    */
  def listRepos(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.TeamsListReposResponse]
  ] = js.native
  def listRepos(params: atOctokitRestLib.atOctokitRestMod.TeamsListReposParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.TeamsListReposResponse]
  ] = js.native
  /**
    * The "Remove team member" API (described below) is deprecated.
    *
    * We recommend using the [Remove team membership API](https://developer.github.com/v3/teams/members/#remove-team-membership) instead. It allows you to remove both active and pending memberships.
    *
    * To remove a user from a team, the authenticated user must have 'admin' permissions to the team or be an owner of the org that the team is associated with. NOTE: This does not delete the user, it just removes them from the team.
    */
  def removeMember(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.TeamsRemoveMemberResponse]
  ] = js.native
  def removeMember(params: atOctokitRestLib.atOctokitRestMod.TeamsRemoveMemberParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.TeamsRemoveMemberResponse]
  ] = js.native
  /**
    * To remove a membership between a user and a team, the authenticated user must have 'admin' permissions to the team or be an owner of the organization that the team is associated with. NOTE: This does not delete the user, it just removes their membership from the team.
    */
  def removeMembership(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.TeamsRemoveMembershipResponse]
  ] = js.native
  def removeMembership(params: atOctokitRestLib.atOctokitRestMod.TeamsRemoveMembershipParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.TeamsRemoveMembershipResponse]
  ] = js.native
  /**
    * Removes an organization project from a team. An organization owner or a team maintainer can remove any project from the team. To remove a project from a team as an organization member, the authenticated user must have `read` access to both the team and project, or `admin` access to the team or project. **Note:** This endpoint removes the project from the team, but does not delete it.
    */
  def removeProject(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.TeamsRemoveProjectResponse]
  ] = js.native
  def removeProject(params: atOctokitRestLib.atOctokitRestMod.TeamsRemoveProjectParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.TeamsRemoveProjectResponse]
  ] = js.native
  /**
    * If the authenticated user is an organization owner or a team maintainer, they can remove any repositories from the team. To remove a repository from a team as an organization member, the authenticated user must have admin access to the repository and must be able to see the team. NOTE: This does not delete the repository, it just removes it from the team.
    */
  def removeRepo(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.TeamsRemoveRepoResponse]
  ] = js.native
  def removeRepo(params: atOctokitRestLib.atOctokitRestMod.TeamsRemoveRepoParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.TeamsRemoveRepoResponse]
  ] = js.native
  /**
    * Checks whether a team has `read`, `write`, or `admin` permissions for an organization project. If you pass the `hellcat-preview` media type, the response will include projects inherited from a parent team.
    */
  def reviewProject(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.TeamsReviewProjectResponse]
  ] = js.native
  def reviewProject(params: atOctokitRestLib.atOctokitRestMod.TeamsReviewProjectParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.TeamsReviewProjectResponse]
  ] = js.native
  /**
    * To edit a team, the authenticated user must either be an owner of the org that the team is associated with, or a maintainer of the team.
    *
    * **Note:** With nested teams, the `privacy` for parent teams cannot be `secret`.
    */
  def update(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.TeamsUpdateResponse]
  ] = js.native
  def update(params: atOctokitRestLib.atOctokitRestMod.TeamsUpdateParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.TeamsUpdateResponse]
  ] = js.native
  /**
    * Edits the title and body text of a discussion post. Only the parameters you provide are updated. OAuth access tokens require the `write:discussion` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  def updateDiscussion(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.TeamsUpdateDiscussionResponse]
  ] = js.native
  def updateDiscussion(params: atOctokitRestLib.atOctokitRestMod.TeamsUpdateDiscussionParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.TeamsUpdateDiscussionResponse]
  ] = js.native
  /**
    * Edits the body text of a discussion comment. OAuth access tokens require the `write:discussion` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  def updateDiscussionComment(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.TeamsUpdateDiscussionCommentResponse]
  ] = js.native
  def updateDiscussionComment(params: atOctokitRestLib.atOctokitRestMod.TeamsUpdateDiscussionCommentParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.TeamsUpdateDiscussionCommentResponse]
  ] = js.native
}

