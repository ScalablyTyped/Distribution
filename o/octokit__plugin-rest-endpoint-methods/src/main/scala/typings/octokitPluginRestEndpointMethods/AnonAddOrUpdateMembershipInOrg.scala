package typings.octokitPluginRestEndpointMethods

import typings.octokitPluginRestEndpointMethods.typesMod.AnyResponse
import typings.octokitPluginRestEndpointMethods.typesMod.TeamsAddOrUpdateMembershipInOrgParams
import typings.octokitPluginRestEndpointMethods.typesMod.TeamsAddOrUpdateProjectInOrgParams
import typings.octokitPluginRestEndpointMethods.typesMod.TeamsAddOrUpdateRepoInOrgParams
import typings.octokitPluginRestEndpointMethods.typesMod.TeamsCheckManagesRepoInOrgParams
import typings.octokitPluginRestEndpointMethods.typesMod.TeamsCreateDiscussionCommentInOrgParams
import typings.octokitPluginRestEndpointMethods.typesMod.TeamsCreateDiscussionInOrgParams
import typings.octokitPluginRestEndpointMethods.typesMod.TeamsCreateParams
import typings.octokitPluginRestEndpointMethods.typesMod.TeamsCreateParamsDeprecatedPermission
import typings.octokitPluginRestEndpointMethods.typesMod.TeamsDeleteDiscussionCommentInOrgParams
import typings.octokitPluginRestEndpointMethods.typesMod.TeamsDeleteDiscussionInOrgParams
import typings.octokitPluginRestEndpointMethods.typesMod.TeamsDeleteInOrgParams
import typings.octokitPluginRestEndpointMethods.typesMod.TeamsGetByNameParams
import typings.octokitPluginRestEndpointMethods.typesMod.TeamsGetDiscussionCommentInOrgParams
import typings.octokitPluginRestEndpointMethods.typesMod.TeamsGetDiscussionInOrgParams
import typings.octokitPluginRestEndpointMethods.typesMod.TeamsGetMembershipInOrgParams
import typings.octokitPluginRestEndpointMethods.typesMod.TeamsListChildInOrgParams
import typings.octokitPluginRestEndpointMethods.typesMod.TeamsListDiscussionCommentsInOrgParams
import typings.octokitPluginRestEndpointMethods.typesMod.TeamsListDiscussionsInOrgParams
import typings.octokitPluginRestEndpointMethods.typesMod.TeamsListForAuthenticatedUserParams
import typings.octokitPluginRestEndpointMethods.typesMod.TeamsListMembersInOrgParams
import typings.octokitPluginRestEndpointMethods.typesMod.TeamsListParams
import typings.octokitPluginRestEndpointMethods.typesMod.TeamsListPendingInvitationsInOrgParams
import typings.octokitPluginRestEndpointMethods.typesMod.TeamsListProjectsInOrgParams
import typings.octokitPluginRestEndpointMethods.typesMod.TeamsListReposInOrgParams
import typings.octokitPluginRestEndpointMethods.typesMod.TeamsRemoveMembershipInOrgParams
import typings.octokitPluginRestEndpointMethods.typesMod.TeamsRemoveProjectInOrgParams
import typings.octokitPluginRestEndpointMethods.typesMod.TeamsRemoveRepoInOrgParams
import typings.octokitPluginRestEndpointMethods.typesMod.TeamsReviewProjectInOrgParams
import typings.octokitPluginRestEndpointMethods.typesMod.TeamsUpdateDiscussionCommentInOrgParams
import typings.octokitPluginRestEndpointMethods.typesMod.TeamsUpdateDiscussionInOrgParams
import typings.octokitPluginRestEndpointMethods.typesMod.TeamsUpdateInOrgParams
import typings.octokitPluginRestEndpointMethods.typesMod.TeamsUpdateInOrgParamsDeprecatedPermission
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAddOrUpdateMembershipInOrg extends js.Object {
  /**
    * Team synchronization is available for organizations using GitHub Enterprise Cloud. For more information, see [GitHub's products](https://help.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * Adds an organization member to a team. An authenticated organization owner or team maintainer can add organization members to a team.
    *
    * **Note:** When you have team synchronization set up for a team with your organization's identity provider (IdP), you will see an error if you attempt to use the API for making changes to the team's membership. If you have access to manage group membership in your IdP, you can manage GitHub team membership through your identity provider, which automatically adds and removes team members in an organization. For more information, see "[Synchronizing teams between your identity provider and GitHub](https://help.github.com/articles/synchronizing-teams-between-your-identity-provider-and-github/)."
    *
    * An organization owner can add someone who is not part of the team's organization to a team. When an organization owner adds someone to a team who is not an organization member, this endpoint will send an invitation to the person via email. This newly-created membership will be in the "pending" state until the person accepts the invitation, at which point the membership will transition to the "active" state and the user will be added as a member of the team.
    *
    * If the user is already a member of the team, this endpoint will update the role of the team member's role. To update the membership of a team member, the authenticated user must be an organization owner or a team maintainer.
    *
    * **Note:** You can also specify a team by `org_id` and `team_id` using the route `PUT /organizations/:org_id/team/:team_id/memberships/:username`.
    */
  @JSName("addOrUpdateMembershipInOrg")
  var addOrUpdateMembershipInOrg_Original: Anon477 = js.native
  /**
    * Adds an organization project to a team. To add a project to a team or update the team's permission on a project, the authenticated user must have `admin` permissions for the project. The project and team must be part of the same organization.
    *
    * **Note:** You can also specify a team by `org_id` and `team_id` using the route `PUT /organizations/:org_id/team/:team_id/projects/:project_id`.
    */
  @JSName("addOrUpdateProjectInOrg")
  var addOrUpdateProjectInOrg_Original: Anon478 = js.native
  /**
    * To add a repository to a team or update the team's permission on a repository, the authenticated user must have admin access to the repository, and must be able to see the team. The repository must be owned by the organization, or a direct fork of a repository owned by the organization. You will get a `422 Unprocessable Entity` status if you attempt to add a repository to a team that is not owned by the organization. Note that, if you choose not to pass any parameters, you'll need to set `Content-Length` to zero when calling out to this endpoint. For more information, see "[HTTP verbs](https://developer.github.com/v3/#http-verbs)."
    *
    * **Note:** You can also specify a team by `org_id` and `team_id` using the route `PUT /organizations/:org_id/team/:team_id/repos/:owner/:repo`.
    *
    * For more information about the permission levels, see "[Repository permission levels for an organization](https://help.github.com/en/github/setting-up-and-managing-organizations-and-teams/repository-permission-levels-for-an-organization#permission-levels-for-repositories-owned-by-an-organization)" in the GitHub Help documentation.
    */
  @JSName("addOrUpdateRepoInOrg")
  var addOrUpdateRepoInOrg_Original: Anon479 = js.native
  /**
    * Checks whether a team has `admin`, `push`, `maintain`, `triage`, or `pull` permission for a repository. Repositories inherited through a parent team will also be checked.
    *
    * **Note:** You can also specify a team by `org_id` and `team_id` using the route `GET /organizations/:org_id/team/:team_id/repos/:owner/:repo`.
    *
    * You can also get information about the specified repository, including what permissions the team grants on it, by passing the following custom [media type](https://developer.github.com/v3/media/) via the `Accept` header:
    */
  @JSName("checkManagesRepoInOrg")
  var checkManagesRepoInOrg_Original: Anon480 = js.native
  /**
    * Creates a new comment on a team discussion. OAuth access tokens require the `write:discussion` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    *
    * This endpoint triggers [notifications](https://help.github.com/articles/about-notifications/). Creating content too quickly using this endpoint may result in abuse rate limiting. See "[Abuse rate limits](https://developer.github.com/v3/#abuse-rate-limits)" and "[Dealing with abuse rate limits](https://developer.github.com/v3/guides/best-practices-for-integrators/#dealing-with-abuse-rate-limits)" for details.
    *
    * **Note:** You can also specify a team by `org_id` and `team_id` using the route `POST /organizations/:org_id/team/:team_id/discussions/:discussion_number/comments`.
    */
  @JSName("createDiscussionCommentInOrg")
  var createDiscussionCommentInOrg_Original: Anon482 = js.native
  /**
    * Creates a new discussion post on a team's page. OAuth access tokens require the `write:discussion` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    *
    * This endpoint triggers [notifications](https://help.github.com/articles/about-notifications/). Creating content too quickly using this endpoint may result in abuse rate limiting. See "[Abuse rate limits](https://developer.github.com/v3/#abuse-rate-limits)" and "[Dealing with abuse rate limits](https://developer.github.com/v3/guides/best-practices-for-integrators/#dealing-with-abuse-rate-limits)" for details.
    *
    * **Note:** You can also specify a team by `org_id` and `team_id` using the route `POST /organizations/:org_id/team/:team_id/discussions`.
    */
  @JSName("createDiscussionInOrg")
  var createDiscussionInOrg_Original: Anon483 = js.native
  /**
    * To create a team, the authenticated user must be a member or owner of `:org`. By default, organization members can create teams. Organization owners can limit team creation to organization owners. For more information, see "[Setting team creation permissions](https://help.github.com/en/articles/setting-team-creation-permissions-in-your-organization)."
    *
    * When you create a new team, you automatically become a team maintainer without explicitly adding yourself to the optional array of `maintainers`. For more information, see "[About teams](https://help.github.com/en/github/setting-up-and-managing-organizations-and-teams/about-teams)" in the GitHub Help documentation.
    */
  @JSName("create")
  var create_Original: Anon481 = js.native
  /**
    * Deletes a comment on a team discussion. OAuth access tokens require the `write:discussion` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    *
    * **Note:** You can also specify a team by `org_id` and `team_id` using the route `DELETE /organizations/:org_id/team/:team_id/discussions/:discussion_number/comments/:comment_number`.
    */
  @JSName("deleteDiscussionCommentInOrg")
  var deleteDiscussionCommentInOrg_Original: Anon484 = js.native
  /**
    * Delete a discussion from a team's page. OAuth access tokens require the `write:discussion` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    *
    * **Note:** You can also specify a team by `org_id` and `team_id` using the route `DELETE /organizations/:org_id/team/:team_id/discussions/:discussion_number`.
    */
  @JSName("deleteDiscussionInOrg")
  var deleteDiscussionInOrg_Original: Anon485 = js.native
  /**
    * To delete a team, the authenticated user must be an organization owner or team maintainer.
    *
    * **Note:** You can also specify a team by `org_id` and `team_id` using the route `DELETE /organizations/:org_id/team/:team_id`.
    *
    * If you are an organization owner, deleting a parent team will delete all of its child teams as well.
    */
  @JSName("deleteInOrg")
  var deleteInOrg_Original: Anon486 = js.native
  /**
    * Gets a team using the team's `slug`. GitHub generates the `slug` from the team `name`.
    *
    * **Note:** You can also specify a team by `org_id` and `team_id` using the route `GET /organizations/:org_id/team/:team_id`.
    */
  @JSName("getByName")
  var getByName_Original: Anon487 = js.native
  /**
    * Get a specific comment on a team discussion. OAuth access tokens require the `read:discussion` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    *
    * **Note:** You can also specify a team by `org_id` and `team_id` using the route `GET /organizations/:org_id/team/:team_id/discussions/:discussion_number/comments/:comment_number`.
    */
  @JSName("getDiscussionCommentInOrg")
  var getDiscussionCommentInOrg_Original: Anon488 = js.native
  /**
    * Get a specific discussion on a team's page. OAuth access tokens require the `read:discussion` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    *
    * **Note:** You can also specify a team by `org_id` and `team_id` using the route `GET /organizations/:org_id/team/:team_id/discussions/:discussion_number`.
    */
  @JSName("getDiscussionInOrg")
  var getDiscussionInOrg_Original: Anon489 = js.native
  /**
    * Team members will include the members of child teams.
    *
    * To get a user's membership with a team, the team must be visible to the authenticated user.
    *
    * **Note:** You can also specify a team by `org_id` and `team_id` using the route `GET /organizations/:org_id/team/:team_id/memberships/:username`.
    *
    * **Note:** The `role` for organization owners returns as `maintainer`. For more information about `maintainer` roles, see [Create team](https://developer.github.com/v3/teams#create-team).
    */
  @JSName("getMembershipInOrg")
  var getMembershipInOrg_Original: Anon490 = js.native
  /**
    * Lists the child teams of the team requested by `:team_slug`.
    *
    * **Note:** You can also specify a team by `org_id` and `team_id` using the route `GET /organizations/:org_id/team/:team_id/teams`.
    */
  @JSName("listChildInOrg")
  var listChildInOrg_Original: Anon492 = js.native
  /**
    * List all comments on a team discussion. OAuth access tokens require the `read:discussion` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    *
    * **Note:** You can also specify a team by `org_id` and `team_id` using the route `GET /organizations/:org_id/team/:team_id/discussions/:discussion_number/comments`.
    */
  @JSName("listDiscussionCommentsInOrg")
  var listDiscussionCommentsInOrg_Original: Anon493 = js.native
  /**
    * List all discussions on a team's page. OAuth access tokens require the `read:discussion` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    *
    * **Note:** You can also specify a team by `org_id` and `team_id` using the route `GET /organizations/:org_id/team/:team_id/discussions`.
    */
  @JSName("listDiscussionsInOrg")
  var listDiscussionsInOrg_Original: Anon494 = js.native
  /**
    * List all of the teams across all of the organizations to which the authenticated user belongs. This method requires `user`, `repo`, or `read:org` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/) when authenticating via [OAuth](https://developer.github.com/apps/building-oauth-apps/).
    */
  @JSName("listForAuthenticatedUser")
  var listForAuthenticatedUser_Original: Anon495 = js.native
  /**
    * Team members will include the members of child teams.
    *
    * To list members in a team, the team must be visible to the authenticated user.
    */
  @JSName("listMembersInOrg")
  var listMembersInOrg_Original: Anon496 = js.native
  /**
    * The return hash contains a `role` field which refers to the Organization Invitation role and will be one of the following values: `direct_member`, `admin`, `billing_manager`, `hiring_manager`, or `reinstate`. If the invitee is not a GitHub member, the `login` field in the return hash will be `null`.
    *
    * **Note:** You can also specify a team by `org_id` and `team_id` using the route `GET /organizations/:org_id/team/:team_id/invitations`.
    */
  @JSName("listPendingInvitationsInOrg")
  var listPendingInvitationsInOrg_Original: Anon497 = js.native
  /**
    * Lists the organization projects for a team.
    *
    * **Note:** You can also specify a team by `org_id` and `team_id` using the route `GET /organizations/:org_id/team/:team_id/projects`.
    */
  @JSName("listProjectsInOrg")
  var listProjectsInOrg_Original: Anon498 = js.native
  /**
    * Lists a team's repositories visible to the authenticated user.
    *
    * **Note:** You can also specify a team by `org_id` and `team_id` using the route `GET /organizations/:org_id/team/:team_id/repos`.
    */
  @JSName("listReposInOrg")
  var listReposInOrg_Original: Anon499 = js.native
  /**
    * Lists all teams in an organization that are visible to the authenticated user.
    */
  @JSName("list")
  var list_Original: Anon491 = js.native
  /**
    * Team synchronization is available for organizations using GitHub Enterprise Cloud. For more information, see [GitHub's products](https://help.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * To remove a membership between a user and a team, the authenticated user must have 'admin' permissions to the team or be an owner of the organization that the team is associated with. Removing team membership does not delete the user, it just removes their membership from the team.
    *
    * **Note:** When you have team synchronization set up for a team with your organization's identity provider (IdP), you will see an error if you attempt to use the API for making changes to the team's membership. If you have access to manage group membership in your IdP, you can manage GitHub team membership through your identity provider, which automatically adds and removes team members in an organization. For more information, see "[Synchronizing teams between your identity provider and GitHub](https://help.github.com/articles/synchronizing-teams-between-your-identity-provider-and-github/)."
    *
    * **Note:** You can also specify a team by `org_id` and `team_id` using the route `DELETE /organizations/:org_id/team/:team_id/memberships/:username`.
    */
  @JSName("removeMembershipInOrg")
  var removeMembershipInOrg_Original: Anon500 = js.native
  /**
    * Removes an organization project from a team. An organization owner or a team maintainer can remove any project from the team. To remove a project from a team as an organization member, the authenticated user must have `read` access to both the team and project, or `admin` access to the team or project. This endpoint removes the project from the team, but does not delete the project.
    *
    * **Note:** You can also specify a team by `org_id` and `team_id` using the route `DELETE /organizations/:org_id/team/:team_id/projects/:project_id`.
    */
  @JSName("removeProjectInOrg")
  var removeProjectInOrg_Original: Anon501 = js.native
  /**
    * If the authenticated user is an organization owner or a team maintainer, they can remove any repositories from the team. To remove a repository from a team as an organization member, the authenticated user must have admin access to the repository and must be able to see the team. This does not delete the repository, it just removes it from the team.
    *
    * **Note:** You can also specify a team by `org_id` and `team_id` using the route `DELETE /organizations/:org_id/team/:team_id/repos/:owner/:repo`.
    */
  @JSName("removeRepoInOrg")
  var removeRepoInOrg_Original: Anon502 = js.native
  /**
    * Checks whether a team has `read`, `write`, or `admin` permissions for an organization project. The response includes projects inherited from a parent team.
    *
    * **Note:** You can also specify a team by `org_id` and `team_id` using the route `GET /organizations/:org_id/team/:team_id/projects/:project_id`.
    */
  @JSName("reviewProjectInOrg")
  var reviewProjectInOrg_Original: Anon503 = js.native
  /**
    * Edits the body text of a discussion comment. OAuth access tokens require the `write:discussion` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    *
    * **Note:** You can also specify a team by `org_id` and `team_id` using the route `PATCH /organizations/:org_id/team/:team_id/discussions/:discussion_number/comments/:comment_number`.
    */
  @JSName("updateDiscussionCommentInOrg")
  var updateDiscussionCommentInOrg_Original: Anon504 = js.native
  /**
    * Edits the title and body text of a discussion post. Only the parameters you provide are updated. OAuth access tokens require the `write:discussion` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    *
    * **Note:** You can also specify a team by `org_id` and `team_id` using the route `PATCH /organizations/:org_id/team/:team_id/discussions/:discussion_number`.
    */
  @JSName("updateDiscussionInOrg")
  var updateDiscussionInOrg_Original: Anon505 = js.native
  /**
    * To edit a team, the authenticated user must either be an organization owner or a team maintainer.
    *
    * **Note:** You can also specify a team by `org_id` and `team_id` using the route `PATCH /organizations/:org_id/team/:team_id`.
    */
  @JSName("updateInOrg")
  var updateInOrg_Original: Anon506 = js.native
  /**
    * Team synchronization is available for organizations using GitHub Enterprise Cloud. For more information, see [GitHub's products](https://help.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * Adds an organization member to a team. An authenticated organization owner or team maintainer can add organization members to a team.
    *
    * **Note:** When you have team synchronization set up for a team with your organization's identity provider (IdP), you will see an error if you attempt to use the API for making changes to the team's membership. If you have access to manage group membership in your IdP, you can manage GitHub team membership through your identity provider, which automatically adds and removes team members in an organization. For more information, see "[Synchronizing teams between your identity provider and GitHub](https://help.github.com/articles/synchronizing-teams-between-your-identity-provider-and-github/)."
    *
    * An organization owner can add someone who is not part of the team's organization to a team. When an organization owner adds someone to a team who is not an organization member, this endpoint will send an invitation to the person via email. This newly-created membership will be in the "pending" state until the person accepts the invitation, at which point the membership will transition to the "active" state and the user will be added as a member of the team.
    *
    * If the user is already a member of the team, this endpoint will update the role of the team member's role. To update the membership of a team member, the authenticated user must be an organization owner or a team maintainer.
    *
    * **Note:** You can also specify a team by `org_id` and `team_id` using the route `PUT /organizations/:org_id/team/:team_id/memberships/:username`.
    */
  def addOrUpdateMembershipInOrg(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<TeamsAddOrUpdateMembershipInOrgResponse> */ _
  ] = js.native
  def addOrUpdateMembershipInOrg(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with TeamsAddOrUpdateMembershipInOrgParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<TeamsAddOrUpdateMembershipInOrgResponse> */ _
  ] = js.native
  /**
    * Adds an organization project to a team. To add a project to a team or update the team's permission on a project, the authenticated user must have `admin` permissions for the project. The project and team must be part of the same organization.
    *
    * **Note:** You can also specify a team by `org_id` and `team_id` using the route `PUT /organizations/:org_id/team/:team_id/projects/:project_id`.
    */
  def addOrUpdateProjectInOrg(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<TeamsAddOrUpdateProjectInOrgResponse> */ _
  ] = js.native
  def addOrUpdateProjectInOrg(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with TeamsAddOrUpdateProjectInOrgParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<TeamsAddOrUpdateProjectInOrgResponse> */ _
  ] = js.native
  /**
    * To add a repository to a team or update the team's permission on a repository, the authenticated user must have admin access to the repository, and must be able to see the team. The repository must be owned by the organization, or a direct fork of a repository owned by the organization. You will get a `422 Unprocessable Entity` status if you attempt to add a repository to a team that is not owned by the organization. Note that, if you choose not to pass any parameters, you'll need to set `Content-Length` to zero when calling out to this endpoint. For more information, see "[HTTP verbs](https://developer.github.com/v3/#http-verbs)."
    *
    * **Note:** You can also specify a team by `org_id` and `team_id` using the route `PUT /organizations/:org_id/team/:team_id/repos/:owner/:repo`.
    *
    * For more information about the permission levels, see "[Repository permission levels for an organization](https://help.github.com/en/github/setting-up-and-managing-organizations-and-teams/repository-permission-levels-for-an-organization#permission-levels-for-repositories-owned-by-an-organization)" in the GitHub Help documentation.
    */
  def addOrUpdateRepoInOrg(): js.Promise[AnyResponse] = js.native
  def addOrUpdateRepoInOrg(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with TeamsAddOrUpdateRepoInOrgParams
  ): js.Promise[AnyResponse] = js.native
  /**
    * Checks whether a team has `admin`, `push`, `maintain`, `triage`, or `pull` permission for a repository. Repositories inherited through a parent team will also be checked.
    *
    * **Note:** You can also specify a team by `org_id` and `team_id` using the route `GET /organizations/:org_id/team/:team_id/repos/:owner/:repo`.
    *
    * You can also get information about the specified repository, including what permissions the team grants on it, by passing the following custom [media type](https://developer.github.com/v3/media/) via the `Accept` header:
    */
  def checkManagesRepoInOrg(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<TeamsCheckManagesRepoInOrgResponse> */ _
  ] = js.native
  def checkManagesRepoInOrg(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with TeamsCheckManagesRepoInOrgParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<TeamsCheckManagesRepoInOrgResponse> */ _
  ] = js.native
  /**
    * To create a team, the authenticated user must be a member or owner of `:org`. By default, organization members can create teams. Organization owners can limit team creation to organization owners. For more information, see "[Setting team creation permissions](https://help.github.com/en/articles/setting-team-creation-permissions-in-your-organization)."
    *
    * When you create a new team, you automatically become a team maintainer without explicitly adding yourself to the optional array of `maintainers`. For more information, see "[About teams](https://help.github.com/en/github/setting-up-and-managing-organizations-and-teams/about-teams)" in the GitHub Help documentation.
    */
  def create(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<TeamsCreateResponse> */ _
  ] = js.native
  def create(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with TeamsCreateParamsDeprecatedPermission with TeamsCreateParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<TeamsCreateResponse> */ _
  ] = js.native
  /**
    * Creates a new comment on a team discussion. OAuth access tokens require the `write:discussion` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    *
    * This endpoint triggers [notifications](https://help.github.com/articles/about-notifications/). Creating content too quickly using this endpoint may result in abuse rate limiting. See "[Abuse rate limits](https://developer.github.com/v3/#abuse-rate-limits)" and "[Dealing with abuse rate limits](https://developer.github.com/v3/guides/best-practices-for-integrators/#dealing-with-abuse-rate-limits)" for details.
    *
    * **Note:** You can also specify a team by `org_id` and `team_id` using the route `POST /organizations/:org_id/team/:team_id/discussions/:discussion_number/comments`.
    */
  def createDiscussionCommentInOrg(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<TeamsCreateDiscussionCommentInOrgResponse> */ _
  ] = js.native
  def createDiscussionCommentInOrg(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with TeamsCreateDiscussionCommentInOrgParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<TeamsCreateDiscussionCommentInOrgResponse> */ _
  ] = js.native
  /**
    * Creates a new discussion post on a team's page. OAuth access tokens require the `write:discussion` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    *
    * This endpoint triggers [notifications](https://help.github.com/articles/about-notifications/). Creating content too quickly using this endpoint may result in abuse rate limiting. See "[Abuse rate limits](https://developer.github.com/v3/#abuse-rate-limits)" and "[Dealing with abuse rate limits](https://developer.github.com/v3/guides/best-practices-for-integrators/#dealing-with-abuse-rate-limits)" for details.
    *
    * **Note:** You can also specify a team by `org_id` and `team_id` using the route `POST /organizations/:org_id/team/:team_id/discussions`.
    */
  def createDiscussionInOrg(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<TeamsCreateDiscussionInOrgResponse> */ _
  ] = js.native
  def createDiscussionInOrg(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with TeamsCreateDiscussionInOrgParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<TeamsCreateDiscussionInOrgResponse> */ _
  ] = js.native
  /**
    * Deletes a comment on a team discussion. OAuth access tokens require the `write:discussion` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    *
    * **Note:** You can also specify a team by `org_id` and `team_id` using the route `DELETE /organizations/:org_id/team/:team_id/discussions/:discussion_number/comments/:comment_number`.
    */
  def deleteDiscussionCommentInOrg(): js.Promise[AnyResponse] = js.native
  def deleteDiscussionCommentInOrg(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with TeamsDeleteDiscussionCommentInOrgParams
  ): js.Promise[AnyResponse] = js.native
  /**
    * Delete a discussion from a team's page. OAuth access tokens require the `write:discussion` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    *
    * **Note:** You can also specify a team by `org_id` and `team_id` using the route `DELETE /organizations/:org_id/team/:team_id/discussions/:discussion_number`.
    */
  def deleteDiscussionInOrg(): js.Promise[AnyResponse] = js.native
  def deleteDiscussionInOrg(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with TeamsDeleteDiscussionInOrgParams
  ): js.Promise[AnyResponse] = js.native
  /**
    * To delete a team, the authenticated user must be an organization owner or team maintainer.
    *
    * **Note:** You can also specify a team by `org_id` and `team_id` using the route `DELETE /organizations/:org_id/team/:team_id`.
    *
    * If you are an organization owner, deleting a parent team will delete all of its child teams as well.
    */
  def deleteInOrg(): js.Promise[AnyResponse] = js.native
  def deleteInOrg(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with TeamsDeleteInOrgParams
  ): js.Promise[AnyResponse] = js.native
  /**
    * Gets a team using the team's `slug`. GitHub generates the `slug` from the team `name`.
    *
    * **Note:** You can also specify a team by `org_id` and `team_id` using the route `GET /organizations/:org_id/team/:team_id`.
    */
  def getByName(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<TeamsGetByNameResponse> */ _
  ] = js.native
  def getByName(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with TeamsGetByNameParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<TeamsGetByNameResponse> */ _
  ] = js.native
  /**
    * Get a specific comment on a team discussion. OAuth access tokens require the `read:discussion` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    *
    * **Note:** You can also specify a team by `org_id` and `team_id` using the route `GET /organizations/:org_id/team/:team_id/discussions/:discussion_number/comments/:comment_number`.
    */
  def getDiscussionCommentInOrg(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<TeamsGetDiscussionCommentInOrgResponse> */ _
  ] = js.native
  def getDiscussionCommentInOrg(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with TeamsGetDiscussionCommentInOrgParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<TeamsGetDiscussionCommentInOrgResponse> */ _
  ] = js.native
  /**
    * Get a specific discussion on a team's page. OAuth access tokens require the `read:discussion` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    *
    * **Note:** You can also specify a team by `org_id` and `team_id` using the route `GET /organizations/:org_id/team/:team_id/discussions/:discussion_number`.
    */
  def getDiscussionInOrg(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<TeamsGetDiscussionInOrgResponse> */ _
  ] = js.native
  def getDiscussionInOrg(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with TeamsGetDiscussionInOrgParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<TeamsGetDiscussionInOrgResponse> */ _
  ] = js.native
  /**
    * Team members will include the members of child teams.
    *
    * To get a user's membership with a team, the team must be visible to the authenticated user.
    *
    * **Note:** You can also specify a team by `org_id` and `team_id` using the route `GET /organizations/:org_id/team/:team_id/memberships/:username`.
    *
    * **Note:** The `role` for organization owners returns as `maintainer`. For more information about `maintainer` roles, see [Create team](https://developer.github.com/v3/teams#create-team).
    */
  def getMembershipInOrg(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<TeamsGetMembershipInOrgResponse> */ _
  ] = js.native
  def getMembershipInOrg(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with TeamsGetMembershipInOrgParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<TeamsGetMembershipInOrgResponse> */ _
  ] = js.native
  /**
    * Lists all teams in an organization that are visible to the authenticated user.
    */
  def list(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<TeamsListResponse> */ _
  ] = js.native
  def list(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with TeamsListParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<TeamsListResponse> */ _
  ] = js.native
  /**
    * Lists the child teams of the team requested by `:team_slug`.
    *
    * **Note:** You can also specify a team by `org_id` and `team_id` using the route `GET /organizations/:org_id/team/:team_id/teams`.
    */
  def listChildInOrg(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<TeamsListChildInOrgResponse> */ _
  ] = js.native
  def listChildInOrg(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with TeamsListChildInOrgParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<TeamsListChildInOrgResponse> */ _
  ] = js.native
  /**
    * List all comments on a team discussion. OAuth access tokens require the `read:discussion` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    *
    * **Note:** You can also specify a team by `org_id` and `team_id` using the route `GET /organizations/:org_id/team/:team_id/discussions/:discussion_number/comments`.
    */
  def listDiscussionCommentsInOrg(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<TeamsListDiscussionCommentsInOrgResponse> */ _
  ] = js.native
  def listDiscussionCommentsInOrg(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with TeamsListDiscussionCommentsInOrgParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<TeamsListDiscussionCommentsInOrgResponse> */ _
  ] = js.native
  /**
    * List all discussions on a team's page. OAuth access tokens require the `read:discussion` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    *
    * **Note:** You can also specify a team by `org_id` and `team_id` using the route `GET /organizations/:org_id/team/:team_id/discussions`.
    */
  def listDiscussionsInOrg(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<TeamsListDiscussionsInOrgResponse> */ _
  ] = js.native
  def listDiscussionsInOrg(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with TeamsListDiscussionsInOrgParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<TeamsListDiscussionsInOrgResponse> */ _
  ] = js.native
  /**
    * List all of the teams across all of the organizations to which the authenticated user belongs. This method requires `user`, `repo`, or `read:org` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/) when authenticating via [OAuth](https://developer.github.com/apps/building-oauth-apps/).
    */
  def listForAuthenticatedUser(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<TeamsListForAuthenticatedUserResponse> */ _
  ] = js.native
  def listForAuthenticatedUser(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with TeamsListForAuthenticatedUserParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<TeamsListForAuthenticatedUserResponse> */ _
  ] = js.native
  /**
    * Team members will include the members of child teams.
    *
    * To list members in a team, the team must be visible to the authenticated user.
    */
  def listMembersInOrg(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<TeamsListMembersInOrgResponse> */ _
  ] = js.native
  def listMembersInOrg(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with TeamsListMembersInOrgParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<TeamsListMembersInOrgResponse> */ _
  ] = js.native
  /**
    * The return hash contains a `role` field which refers to the Organization Invitation role and will be one of the following values: `direct_member`, `admin`, `billing_manager`, `hiring_manager`, or `reinstate`. If the invitee is not a GitHub member, the `login` field in the return hash will be `null`.
    *
    * **Note:** You can also specify a team by `org_id` and `team_id` using the route `GET /organizations/:org_id/team/:team_id/invitations`.
    */
  def listPendingInvitationsInOrg(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<TeamsListPendingInvitationsInOrgResponse> */ _
  ] = js.native
  def listPendingInvitationsInOrg(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with TeamsListPendingInvitationsInOrgParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<TeamsListPendingInvitationsInOrgResponse> */ _
  ] = js.native
  /**
    * Lists the organization projects for a team.
    *
    * **Note:** You can also specify a team by `org_id` and `team_id` using the route `GET /organizations/:org_id/team/:team_id/projects`.
    */
  def listProjectsInOrg(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<TeamsListProjectsInOrgResponse> */ _
  ] = js.native
  def listProjectsInOrg(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with TeamsListProjectsInOrgParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<TeamsListProjectsInOrgResponse> */ _
  ] = js.native
  /**
    * Lists a team's repositories visible to the authenticated user.
    *
    * **Note:** You can also specify a team by `org_id` and `team_id` using the route `GET /organizations/:org_id/team/:team_id/repos`.
    */
  def listReposInOrg(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<TeamsListReposInOrgResponse> */ _
  ] = js.native
  def listReposInOrg(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with TeamsListReposInOrgParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<TeamsListReposInOrgResponse> */ _
  ] = js.native
  /**
    * Team synchronization is available for organizations using GitHub Enterprise Cloud. For more information, see [GitHub's products](https://help.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * To remove a membership between a user and a team, the authenticated user must have 'admin' permissions to the team or be an owner of the organization that the team is associated with. Removing team membership does not delete the user, it just removes their membership from the team.
    *
    * **Note:** When you have team synchronization set up for a team with your organization's identity provider (IdP), you will see an error if you attempt to use the API for making changes to the team's membership. If you have access to manage group membership in your IdP, you can manage GitHub team membership through your identity provider, which automatically adds and removes team members in an organization. For more information, see "[Synchronizing teams between your identity provider and GitHub](https://help.github.com/articles/synchronizing-teams-between-your-identity-provider-and-github/)."
    *
    * **Note:** You can also specify a team by `org_id` and `team_id` using the route `DELETE /organizations/:org_id/team/:team_id/memberships/:username`.
    */
  def removeMembershipInOrg(): js.Promise[AnyResponse] = js.native
  def removeMembershipInOrg(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with TeamsRemoveMembershipInOrgParams
  ): js.Promise[AnyResponse] = js.native
  /**
    * Removes an organization project from a team. An organization owner or a team maintainer can remove any project from the team. To remove a project from a team as an organization member, the authenticated user must have `read` access to both the team and project, or `admin` access to the team or project. This endpoint removes the project from the team, but does not delete the project.
    *
    * **Note:** You can also specify a team by `org_id` and `team_id` using the route `DELETE /organizations/:org_id/team/:team_id/projects/:project_id`.
    */
  def removeProjectInOrg(): js.Promise[AnyResponse] = js.native
  def removeProjectInOrg(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with TeamsRemoveProjectInOrgParams
  ): js.Promise[AnyResponse] = js.native
  /**
    * If the authenticated user is an organization owner or a team maintainer, they can remove any repositories from the team. To remove a repository from a team as an organization member, the authenticated user must have admin access to the repository and must be able to see the team. This does not delete the repository, it just removes it from the team.
    *
    * **Note:** You can also specify a team by `org_id` and `team_id` using the route `DELETE /organizations/:org_id/team/:team_id/repos/:owner/:repo`.
    */
  def removeRepoInOrg(): js.Promise[AnyResponse] = js.native
  def removeRepoInOrg(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with TeamsRemoveRepoInOrgParams
  ): js.Promise[AnyResponse] = js.native
  /**
    * Checks whether a team has `read`, `write`, or `admin` permissions for an organization project. The response includes projects inherited from a parent team.
    *
    * **Note:** You can also specify a team by `org_id` and `team_id` using the route `GET /organizations/:org_id/team/:team_id/projects/:project_id`.
    */
  def reviewProjectInOrg(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<TeamsReviewProjectInOrgResponse> */ _
  ] = js.native
  def reviewProjectInOrg(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with TeamsReviewProjectInOrgParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<TeamsReviewProjectInOrgResponse> */ _
  ] = js.native
  /**
    * Edits the body text of a discussion comment. OAuth access tokens require the `write:discussion` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    *
    * **Note:** You can also specify a team by `org_id` and `team_id` using the route `PATCH /organizations/:org_id/team/:team_id/discussions/:discussion_number/comments/:comment_number`.
    */
  def updateDiscussionCommentInOrg(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<TeamsUpdateDiscussionCommentInOrgResponse> */ _
  ] = js.native
  def updateDiscussionCommentInOrg(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with TeamsUpdateDiscussionCommentInOrgParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<TeamsUpdateDiscussionCommentInOrgResponse> */ _
  ] = js.native
  /**
    * Edits the title and body text of a discussion post. Only the parameters you provide are updated. OAuth access tokens require the `write:discussion` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    *
    * **Note:** You can also specify a team by `org_id` and `team_id` using the route `PATCH /organizations/:org_id/team/:team_id/discussions/:discussion_number`.
    */
  def updateDiscussionInOrg(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<TeamsUpdateDiscussionInOrgResponse> */ _
  ] = js.native
  def updateDiscussionInOrg(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with TeamsUpdateDiscussionInOrgParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<TeamsUpdateDiscussionInOrgResponse> */ _
  ] = js.native
  /**
    * To edit a team, the authenticated user must either be an organization owner or a team maintainer.
    *
    * **Note:** You can also specify a team by `org_id` and `team_id` using the route `PATCH /organizations/:org_id/team/:team_id`.
    */
  def updateInOrg(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<TeamsUpdateInOrgResponse> */ _
  ] = js.native
  def updateInOrg(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with TeamsUpdateInOrgParamsDeprecatedPermission with TeamsUpdateInOrgParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<TeamsUpdateInOrgResponse> */ _
  ] = js.native
}

