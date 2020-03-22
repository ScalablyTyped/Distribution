package typings.octokitPluginRestEndpointMethods

import typings.octokitPluginRestEndpointMethods.typesMod.AnyResponse
import typings.octokitPluginRestEndpointMethods.typesMod.ReactionsCreateForCommitCommentParams
import typings.octokitPluginRestEndpointMethods.typesMod.ReactionsCreateForIssueCommentParams
import typings.octokitPluginRestEndpointMethods.typesMod.ReactionsCreateForIssueParams
import typings.octokitPluginRestEndpointMethods.typesMod.ReactionsCreateForPullRequestReviewCommentParams
import typings.octokitPluginRestEndpointMethods.typesMod.ReactionsCreateForTeamDiscussionCommentInOrgParams
import typings.octokitPluginRestEndpointMethods.typesMod.ReactionsCreateForTeamDiscussionInOrgParams
import typings.octokitPluginRestEndpointMethods.typesMod.ReactionsDeleteParams
import typings.octokitPluginRestEndpointMethods.typesMod.ReactionsListForCommitCommentParams
import typings.octokitPluginRestEndpointMethods.typesMod.ReactionsListForIssueCommentParams
import typings.octokitPluginRestEndpointMethods.typesMod.ReactionsListForIssueParams
import typings.octokitPluginRestEndpointMethods.typesMod.ReactionsListForPullRequestReviewCommentParams
import typings.octokitPluginRestEndpointMethods.typesMod.ReactionsListForTeamDiscussionCommentInOrgParams
import typings.octokitPluginRestEndpointMethods.typesMod.ReactionsListForTeamDiscussionInOrgParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCreateForCommitComment extends js.Object {
  /**
    * Create a reaction to a [commit comment](https://developer.github.com/v3/repos/comments/). A response with a `Status: 200 OK` means that you already added the reaction type to this commit comment.
    */
  @JSName("createForCommitComment")
  var createForCommitComment_Original: Anon288 = js.native
  /**
    * Create a reaction to an [issue comment](https://developer.github.com/v3/issues/comments/). A response with a `Status: 200 OK` means that you already added the reaction type to this issue comment.
    */
  @JSName("createForIssueComment")
  var createForIssueComment_Original: Anon290 = js.native
  /**
    * Create a reaction to an [issue](https://developer.github.com/v3/issues/). A response with a `Status: 200 OK` means that you already added the reaction type to this issue.
    */
  @JSName("createForIssue")
  var createForIssue_Original: Anon289 = js.native
  /**
    * Create a reaction to a [pull request review comment](https://developer.github.com/v3/pulls/comments/). A response with a `Status: 200 OK` means that you already added the reaction type to this pull request review comment.
    */
  @JSName("createForPullRequestReviewComment")
  var createForPullRequestReviewComment_Original: Anon291 = js.native
  /**
    * Create a reaction to a [team discussion comment](https://developer.github.com/v3/teams/discussion_comments/). OAuth access tokens require the `write:discussion` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/). A response with a `Status: 200 OK` means that you already added the reaction type to this team discussion comment.
    *
    * **Note:** You can also specify a team by `org_id` and `team_id` using the route `POST /organizations/:org_id/team/:team_id/discussions/:discussion_number/comments/:comment_number/reactions`.
    */
  @JSName("createForTeamDiscussionCommentInOrg")
  var createForTeamDiscussionCommentInOrg_Original: Anon292 = js.native
  /**
    * Create a reaction to a [team discussion](https://developer.github.com/v3/teams/discussions/). OAuth access tokens require the `write:discussion` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/). A response with a `Status: 200 OK` means that you already added the reaction type to this team discussion.
    *
    * **Note:** You can also specify a team by `org_id` and `team_id` using the route `POST /organizations/:org_id/team/:team_id/discussions/:discussion_number/reactions`.
    */
  @JSName("createForTeamDiscussionInOrg")
  var createForTeamDiscussionInOrg_Original: Anon293 = js.native
  /**
    * OAuth access tokens require the `write:discussion` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/), when deleting a [team discussion](https://developer.github.com/v3/teams/discussions/) or [team discussion comment](https://developer.github.com/v3/teams/discussion_comments/).
    */
  @JSName("delete")
  var delete_Original: Anon294 = js.native
  /**
    * List the reactions to a [commit comment](https://developer.github.com/v3/repos/comments/).
    */
  @JSName("listForCommitComment")
  var listForCommitComment_Original: Anon295 = js.native
  /**
    * List the reactions to an [issue comment](https://developer.github.com/v3/issues/comments/).
    */
  @JSName("listForIssueComment")
  var listForIssueComment_Original: Anon297 = js.native
  /**
    * List the reactions to an [issue](https://developer.github.com/v3/issues/).
    */
  @JSName("listForIssue")
  var listForIssue_Original: Anon296 = js.native
  /**
    * List the reactions to a [pull request review comment](https://developer.github.com/v3/pulls/comments/).
    */
  @JSName("listForPullRequestReviewComment")
  var listForPullRequestReviewComment_Original: Anon298 = js.native
  /**
    * List the reactions to a [team discussion comment](https://developer.github.com/v3/teams/discussion_comments/). OAuth access tokens require the `read:discussion` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    *
    * **Note:** You can also specify a team by `org_id` and `team_id` using the route `GET /organizations/:org_id/team/:team_id/discussions/:discussion_number/comments/:comment_number/reactions`.
    */
  @JSName("listForTeamDiscussionCommentInOrg")
  var listForTeamDiscussionCommentInOrg_Original: Anon299 = js.native
  /**
    * List the reactions to a [team discussion](https://developer.github.com/v3/teams/discussions/). OAuth access tokens require the `read:discussion` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    *
    * **Note:** You can also specify a team by `org_id` and `team_id` using the route `GET /organizations/:org_id/team/:team_id/discussions/:discussion_number/reactions`.
    */
  @JSName("listForTeamDiscussionInOrg")
  var listForTeamDiscussionInOrg_Original: Anon300 = js.native
  /**
    * Create a reaction to a [commit comment](https://developer.github.com/v3/repos/comments/). A response with a `Status: 200 OK` means that you already added the reaction type to this commit comment.
    */
  def createForCommitComment(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ReactionsCreateForCommitCommentResponse> */ _
  ] = js.native
  def createForCommitComment(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with ReactionsCreateForCommitCommentParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ReactionsCreateForCommitCommentResponse> */ _
  ] = js.native
  /**
    * Create a reaction to an [issue](https://developer.github.com/v3/issues/). A response with a `Status: 200 OK` means that you already added the reaction type to this issue.
    */
  def createForIssue(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ReactionsCreateForIssueResponse> */ _
  ] = js.native
  def createForIssue(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with ReactionsCreateForIssueParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ReactionsCreateForIssueResponse> */ _
  ] = js.native
  /**
    * Create a reaction to an [issue comment](https://developer.github.com/v3/issues/comments/). A response with a `Status: 200 OK` means that you already added the reaction type to this issue comment.
    */
  def createForIssueComment(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ReactionsCreateForIssueCommentResponse> */ _
  ] = js.native
  def createForIssueComment(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with ReactionsCreateForIssueCommentParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ReactionsCreateForIssueCommentResponse> */ _
  ] = js.native
  /**
    * Create a reaction to a [pull request review comment](https://developer.github.com/v3/pulls/comments/). A response with a `Status: 200 OK` means that you already added the reaction type to this pull request review comment.
    */
  def createForPullRequestReviewComment(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ReactionsCreateForPullRequestReviewCommentResponse> */ _
  ] = js.native
  def createForPullRequestReviewComment(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with ReactionsCreateForPullRequestReviewCommentParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ReactionsCreateForPullRequestReviewCommentResponse> */ _
  ] = js.native
  /**
    * Create a reaction to a [team discussion comment](https://developer.github.com/v3/teams/discussion_comments/). OAuth access tokens require the `write:discussion` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/). A response with a `Status: 200 OK` means that you already added the reaction type to this team discussion comment.
    *
    * **Note:** You can also specify a team by `org_id` and `team_id` using the route `POST /organizations/:org_id/team/:team_id/discussions/:discussion_number/comments/:comment_number/reactions`.
    */
  def createForTeamDiscussionCommentInOrg(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ReactionsCreateForTeamDiscussionCommentInOrgResponse> */ _
  ] = js.native
  def createForTeamDiscussionCommentInOrg(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with ReactionsCreateForTeamDiscussionCommentInOrgParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ReactionsCreateForTeamDiscussionCommentInOrgResponse> */ _
  ] = js.native
  /**
    * Create a reaction to a [team discussion](https://developer.github.com/v3/teams/discussions/). OAuth access tokens require the `write:discussion` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/). A response with a `Status: 200 OK` means that you already added the reaction type to this team discussion.
    *
    * **Note:** You can also specify a team by `org_id` and `team_id` using the route `POST /organizations/:org_id/team/:team_id/discussions/:discussion_number/reactions`.
    */
  def createForTeamDiscussionInOrg(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ReactionsCreateForTeamDiscussionInOrgResponse> */ _
  ] = js.native
  def createForTeamDiscussionInOrg(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with ReactionsCreateForTeamDiscussionInOrgParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ReactionsCreateForTeamDiscussionInOrgResponse> */ _
  ] = js.native
  /**
    * OAuth access tokens require the `write:discussion` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/), when deleting a [team discussion](https://developer.github.com/v3/teams/discussions/) or [team discussion comment](https://developer.github.com/v3/teams/discussion_comments/).
    */
  def delete(): js.Promise[AnyResponse] = js.native
  def delete(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with ReactionsDeleteParams
  ): js.Promise[AnyResponse] = js.native
  /**
    * List the reactions to a [commit comment](https://developer.github.com/v3/repos/comments/).
    */
  def listForCommitComment(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ReactionsListForCommitCommentResponse> */ _
  ] = js.native
  def listForCommitComment(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with ReactionsListForCommitCommentParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ReactionsListForCommitCommentResponse> */ _
  ] = js.native
  /**
    * List the reactions to an [issue](https://developer.github.com/v3/issues/).
    */
  def listForIssue(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ReactionsListForIssueResponse> */ _
  ] = js.native
  def listForIssue(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with ReactionsListForIssueParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ReactionsListForIssueResponse> */ _
  ] = js.native
  /**
    * List the reactions to an [issue comment](https://developer.github.com/v3/issues/comments/).
    */
  def listForIssueComment(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ReactionsListForIssueCommentResponse> */ _
  ] = js.native
  def listForIssueComment(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with ReactionsListForIssueCommentParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ReactionsListForIssueCommentResponse> */ _
  ] = js.native
  /**
    * List the reactions to a [pull request review comment](https://developer.github.com/v3/pulls/comments/).
    */
  def listForPullRequestReviewComment(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ReactionsListForPullRequestReviewCommentResponse> */ _
  ] = js.native
  def listForPullRequestReviewComment(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with ReactionsListForPullRequestReviewCommentParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ReactionsListForPullRequestReviewCommentResponse> */ _
  ] = js.native
  /**
    * List the reactions to a [team discussion comment](https://developer.github.com/v3/teams/discussion_comments/). OAuth access tokens require the `read:discussion` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    *
    * **Note:** You can also specify a team by `org_id` and `team_id` using the route `GET /organizations/:org_id/team/:team_id/discussions/:discussion_number/comments/:comment_number/reactions`.
    */
  def listForTeamDiscussionCommentInOrg(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ReactionsListForTeamDiscussionCommentInOrgResponse> */ _
  ] = js.native
  def listForTeamDiscussionCommentInOrg(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with ReactionsListForTeamDiscussionCommentInOrgParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ReactionsListForTeamDiscussionCommentInOrgResponse> */ _
  ] = js.native
  /**
    * List the reactions to a [team discussion](https://developer.github.com/v3/teams/discussions/). OAuth access tokens require the `read:discussion` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    *
    * **Note:** You can also specify a team by `org_id` and `team_id` using the route `GET /organizations/:org_id/team/:team_id/discussions/:discussion_number/reactions`.
    */
  def listForTeamDiscussionInOrg(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ReactionsListForTeamDiscussionInOrgResponse> */ _
  ] = js.native
  def listForTeamDiscussionInOrg(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with ReactionsListForTeamDiscussionInOrgParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ReactionsListForTeamDiscussionInOrgResponse> */ _
  ] = js.native
}

