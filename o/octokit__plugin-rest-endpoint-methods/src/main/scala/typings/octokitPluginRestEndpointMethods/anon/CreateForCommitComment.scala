package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateForCommitComment extends StObject {
  
  /**
    * Create a reaction to a [commit comment](https://developer.github.com/v3/repos/comments/). A response with a `Status: 200 OK` means that you already added the reaction type to this commit comment.
    */
  def createForCommitComment(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/:owner/:repo/comments/:comment_id/reactions']['response'] */ js.Any
  ]
  def createForCommitComment(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/:owner/:repo/comments/:comment_id/reactions']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/:owner/:repo/comments/:comment_id/reactions']['response'] */ js.Any
  ]
  /**
    * Create a reaction to a [commit comment](https://developer.github.com/v3/repos/comments/). A response with a `Status: 200 OK` means that you already added the reaction type to this commit comment.
    */
  @JSName("createForCommitComment")
  var createForCommitComment_Original: `320`
  
  /**
    * Create a reaction to an [issue](https://developer.github.com/v3/issues/). A response with a `Status: 200 OK` means that you already added the reaction type to this issue.
    */
  def createForIssue(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/:owner/:repo/issues/:issue_number/reactions']['response'] */ js.Any
  ]
  def createForIssue(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/:owner/:repo/issues/:issue_number/reactions']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/:owner/:repo/issues/:issue_number/reactions']['response'] */ js.Any
  ]
  
  /**
    * Create a reaction to an [issue comment](https://developer.github.com/v3/issues/comments/). A response with a `Status: 200 OK` means that you already added the reaction type to this issue comment.
    */
  def createForIssueComment(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/:owner/:repo/issues/comments/:comment_id/reactions']['response'] */ js.Any
  ]
  def createForIssueComment(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/:owner/:repo/issues/comments/:comment_id/reactions']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/:owner/:repo/issues/comments/:comment_id/reactions']['response'] */ js.Any
  ]
  /**
    * Create a reaction to an [issue comment](https://developer.github.com/v3/issues/comments/). A response with a `Status: 200 OK` means that you already added the reaction type to this issue comment.
    */
  @JSName("createForIssueComment")
  var createForIssueComment_Original: `322`
  
  /**
    * Create a reaction to an [issue](https://developer.github.com/v3/issues/). A response with a `Status: 200 OK` means that you already added the reaction type to this issue.
    */
  @JSName("createForIssue")
  var createForIssue_Original: `321`
  
  /**
    * Create a reaction to a [pull request review comment](https://developer.github.com/v3/pulls/comments/). A response with a `Status: 200 OK` means that you already added the reaction type to this pull request review comment.
    */
  def createForPullRequestReviewComment(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/:owner/:repo/pulls/comments/:comment_id/reactions']['response'] */ js.Any
  ]
  def createForPullRequestReviewComment(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/:owner/:repo/pulls/comments/:comment_id/reactions']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/:owner/:repo/pulls/comments/:comment_id/reactions']['response'] */ js.Any
  ]
  /**
    * Create a reaction to a [pull request review comment](https://developer.github.com/v3/pulls/comments/). A response with a `Status: 200 OK` means that you already added the reaction type to this pull request review comment.
    */
  @JSName("createForPullRequestReviewComment")
  var createForPullRequestReviewComment_Original: `323`
  
  /**
    * Create a reaction to a [team discussion comment](https://developer.github.com/v3/teams/discussion_comments/). OAuth access tokens require the `write:discussion` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/). A response with a `Status: 200 OK` means that you already added the reaction type to this team discussion comment.
    *
    * **Note:** You can also specify a team by `org_id` and `team_id` using the route `POST /organizations/:org_id/team/:team_id/discussions/:discussion_number/comments/:comment_number/reactions`.
    */
  def createForTeamDiscussionCommentInOrg(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /orgs/:org/teams/:team_slug/discussions/:discussion_number/comments/:comment_number/reactions']['response'] */ js.Any
  ]
  def createForTeamDiscussionCommentInOrg(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /orgs/:org/teams/:team_slug/discussions/:discussion_number/comments/:comment_number/reactions']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /orgs/:org/teams/:team_slug/discussions/:discussion_number/comments/:comment_number/reactions']['response'] */ js.Any
  ]
  /**
    * Create a reaction to a [team discussion comment](https://developer.github.com/v3/teams/discussion_comments/). OAuth access tokens require the `write:discussion` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/). A response with a `Status: 200 OK` means that you already added the reaction type to this team discussion comment.
    *
    * **Note:** You can also specify a team by `org_id` and `team_id` using the route `POST /organizations/:org_id/team/:team_id/discussions/:discussion_number/comments/:comment_number/reactions`.
    */
  @JSName("createForTeamDiscussionCommentInOrg")
  var createForTeamDiscussionCommentInOrg_Original: `324`
  
  /**
    * Create a reaction to a [team discussion](https://developer.github.com/v3/teams/discussions/). OAuth access tokens require the `write:discussion` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/). A response with a `Status: 200 OK` means that you already added the reaction type to this team discussion.
    *
    * **Note:** You can also specify a team by `org_id` and `team_id` using the route `POST /organizations/:org_id/team/:team_id/discussions/:discussion_number/reactions`.
    */
  def createForTeamDiscussionInOrg(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /orgs/:org/teams/:team_slug/discussions/:discussion_number/reactions']['response'] */ js.Any
  ]
  def createForTeamDiscussionInOrg(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /orgs/:org/teams/:team_slug/discussions/:discussion_number/reactions']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /orgs/:org/teams/:team_slug/discussions/:discussion_number/reactions']['response'] */ js.Any
  ]
  /**
    * Create a reaction to a [team discussion](https://developer.github.com/v3/teams/discussions/). OAuth access tokens require the `write:discussion` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/). A response with a `Status: 200 OK` means that you already added the reaction type to this team discussion.
    *
    * **Note:** You can also specify a team by `org_id` and `team_id` using the route `POST /organizations/:org_id/team/:team_id/discussions/:discussion_number/reactions`.
    */
  @JSName("createForTeamDiscussionInOrg")
  var createForTeamDiscussionInOrg_Original: `325`
  
  /**
    * **Note:** You can also specify a repository by `repository_id` using the route `DELETE /repositories/:repository_id/comments/:comment_id/reactions/:reaction_id`.
    *
    * Delete a reaction to a [commit comment](https://developer.github.com/v3/repos/comments/).
    */
  def deleteForCommitComment(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo/comments/:comment_id/reactions/:reaction_id']['response'] */ js.Any
  ]
  def deleteForCommitComment(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo/comments/:comment_id/reactions/:reaction_id']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo/comments/:comment_id/reactions/:reaction_id']['response'] */ js.Any
  ]
  /**
    * **Note:** You can also specify a repository by `repository_id` using the route `DELETE /repositories/:repository_id/comments/:comment_id/reactions/:reaction_id`.
    *
    * Delete a reaction to a [commit comment](https://developer.github.com/v3/repos/comments/).
    */
  @JSName("deleteForCommitComment")
  var deleteForCommitComment_Original: `326`
  
  /**
    * **Note:** You can also specify a repository by `repository_id` using the route `DELETE /repositories/:repository_id/issues/:issue_number/reactions/:reaction_id`.
    *
    * Delete a reaction to an [issue](https://developer.github.com/v3/issues/).
    */
  def deleteForIssue(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo/issues/:issue_number/reactions/:reaction_id']['response'] */ js.Any
  ]
  def deleteForIssue(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo/issues/:issue_number/reactions/:reaction_id']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo/issues/:issue_number/reactions/:reaction_id']['response'] */ js.Any
  ]
  
  /**
    * **Note:** You can also specify a repository by `repository_id` using the route `DELETE delete /repositories/:repository_id/issues/comments/:comment_id/reactions/:reaction_id`.
    *
    * Delete a reaction to an [issue comment](https://developer.github.com/v3/issues/comments/).
    */
  def deleteForIssueComment(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo/issues/comments/:comment_id/reactions/:reaction_id']['response'] */ js.Any
  ]
  def deleteForIssueComment(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo/issues/comments/:comment_id/reactions/:reaction_id']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo/issues/comments/:comment_id/reactions/:reaction_id']['response'] */ js.Any
  ]
  /**
    * **Note:** You can also specify a repository by `repository_id` using the route `DELETE delete /repositories/:repository_id/issues/comments/:comment_id/reactions/:reaction_id`.
    *
    * Delete a reaction to an [issue comment](https://developer.github.com/v3/issues/comments/).
    */
  @JSName("deleteForIssueComment")
  var deleteForIssueComment_Original: `328`
  
  /**
    * **Note:** You can also specify a repository by `repository_id` using the route `DELETE /repositories/:repository_id/issues/:issue_number/reactions/:reaction_id`.
    *
    * Delete a reaction to an [issue](https://developer.github.com/v3/issues/).
    */
  @JSName("deleteForIssue")
  var deleteForIssue_Original: `327`
  
  /**
    * **Note:** You can also specify a repository by `repository_id` using the route `DELETE /repositories/:repository_id/pulls/comments/:comment_id/reactions/:reaction_id.`
    *
    * Delete a reaction to a [pull request review comment](https://developer.github.com/v3/pulls/comments/).
    */
  def deleteForPullRequestComment(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo/pulls/comments/:comment_id/reactions/:reaction_id']['response'] */ js.Any
  ]
  def deleteForPullRequestComment(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo/pulls/comments/:comment_id/reactions/:reaction_id']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo/pulls/comments/:comment_id/reactions/:reaction_id']['response'] */ js.Any
  ]
  /**
    * **Note:** You can also specify a repository by `repository_id` using the route `DELETE /repositories/:repository_id/pulls/comments/:comment_id/reactions/:reaction_id.`
    *
    * Delete a reaction to a [pull request review comment](https://developer.github.com/v3/pulls/comments/).
    */
  @JSName("deleteForPullRequestComment")
  var deleteForPullRequestComment_Original: `329`
  
  /**
    * **Note:** You can also specify a team or organization with `team_id` and `org_id` using the route `DELETE /organizations/:org_id/team/:team_id/discussions/:discussion_number/reactions/:reaction_id`.
    *
    * Delete a reaction to a [team discussion](https://developer.github.com/v3/teams/discussions/). OAuth access tokens require the `write:discussion` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  def deleteForTeamDiscussion(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /orgs/:org/teams/:team_slug/discussions/:discussion_number/reactions/:reaction_id']['response'] */ js.Any
  ]
  def deleteForTeamDiscussion(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /orgs/:org/teams/:team_slug/discussions/:discussion_number/reactions/:reaction_id']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /orgs/:org/teams/:team_slug/discussions/:discussion_number/reactions/:reaction_id']['response'] */ js.Any
  ]
  
  /**
    * **Note:** You can also specify a team or organization with `team_id` and `org_id` using the route `DELETE /organizations/:org_id/team/:team_id/discussions/:discussion_number/comments/:comment_number/reactions/:reaction_id`.
    *
    * Delete a reaction to a [team discussion comment](https://developer.github.com/v3/teams/discussion_comments/). OAuth access tokens require the `write:discussion` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  def deleteForTeamDiscussionComment(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /orgs/:org/teams/:team_slug/discussions/:discussion_number/comments/:comment_number/reactions/:reaction_id']['response'] */ js.Any
  ]
  def deleteForTeamDiscussionComment(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /orgs/:org/teams/:team_slug/discussions/:discussion_number/comments/:comment_number/reactions/:reaction_id']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /orgs/:org/teams/:team_slug/discussions/:discussion_number/comments/:comment_number/reactions/:reaction_id']['response'] */ js.Any
  ]
  /**
    * **Note:** You can also specify a team or organization with `team_id` and `org_id` using the route `DELETE /organizations/:org_id/team/:team_id/discussions/:discussion_number/comments/:comment_number/reactions/:reaction_id`.
    *
    * Delete a reaction to a [team discussion comment](https://developer.github.com/v3/teams/discussion_comments/). OAuth access tokens require the `write:discussion` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  @JSName("deleteForTeamDiscussionComment")
  var deleteForTeamDiscussionComment_Original: `331`
  
  /**
    * **Note:** You can also specify a team or organization with `team_id` and `org_id` using the route `DELETE /organizations/:org_id/team/:team_id/discussions/:discussion_number/reactions/:reaction_id`.
    *
    * Delete a reaction to a [team discussion](https://developer.github.com/v3/teams/discussions/). OAuth access tokens require the `write:discussion` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  @JSName("deleteForTeamDiscussion")
  var deleteForTeamDiscussion_Original: `330`
  
  /**
    * **Deprecation Notice:** This endpoint route is deprecated and will be removed from the Reactions API. We recommend migrating your existing code to use the new delete reactions endpoints. For more information, see this [blog post](https://developer.github.com/changes/2020-02-26-new-delete-reactions-endpoints/).
    *
    * OAuth access tokens require the `write:discussion` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/), when deleting a [team discussion](https://developer.github.com/v3/teams/discussions/) or [team discussion comment](https://developer.github.com/v3/teams/discussion_comments/).
    * @deprecated octokit.reactions.deleteLegacy() is deprecated, see https://developer.github.com/v3/reactions/#delete-a-reaction-legacy
    */
  def deleteLegacy(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /reactions/:reaction_id']['response'] */ js.Any
  ]
  def deleteLegacy(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /reactions/:reaction_id']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /reactions/:reaction_id']['response'] */ js.Any
  ]
  /**
    * **Deprecation Notice:** This endpoint route is deprecated and will be removed from the Reactions API. We recommend migrating your existing code to use the new delete reactions endpoints. For more information, see this [blog post](https://developer.github.com/changes/2020-02-26-new-delete-reactions-endpoints/).
    *
    * OAuth access tokens require the `write:discussion` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/), when deleting a [team discussion](https://developer.github.com/v3/teams/discussions/) or [team discussion comment](https://developer.github.com/v3/teams/discussion_comments/).
    * @deprecated octokit.reactions.deleteLegacy() is deprecated, see https://developer.github.com/v3/reactions/#delete-a-reaction-legacy
    */
  @JSName("deleteLegacy")
  var deleteLegacy_Original: `332`
  
  /**
    * List the reactions to a [commit comment](https://developer.github.com/v3/repos/comments/).
    */
  def listForCommitComment(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/comments/:comment_id/reactions']['response'] */ js.Any
  ]
  def listForCommitComment(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/comments/:comment_id/reactions']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/comments/:comment_id/reactions']['response'] */ js.Any
  ]
  /**
    * List the reactions to a [commit comment](https://developer.github.com/v3/repos/comments/).
    */
  @JSName("listForCommitComment")
  var listForCommitComment_Original: `333`
  
  /**
    * List the reactions to an [issue](https://developer.github.com/v3/issues/).
    */
  def listForIssue(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/issues/:issue_number/reactions']['response'] */ js.Any
  ]
  def listForIssue(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/issues/:issue_number/reactions']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/issues/:issue_number/reactions']['response'] */ js.Any
  ]
  
  /**
    * List the reactions to an [issue comment](https://developer.github.com/v3/issues/comments/).
    */
  def listForIssueComment(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/issues/comments/:comment_id/reactions']['response'] */ js.Any
  ]
  def listForIssueComment(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/issues/comments/:comment_id/reactions']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/issues/comments/:comment_id/reactions']['response'] */ js.Any
  ]
  /**
    * List the reactions to an [issue comment](https://developer.github.com/v3/issues/comments/).
    */
  @JSName("listForIssueComment")
  var listForIssueComment_Original: `335`
  
  /**
    * List the reactions to an [issue](https://developer.github.com/v3/issues/).
    */
  @JSName("listForIssue")
  var listForIssue_Original: `334`
  
  /**
    * List the reactions to a [pull request review comment](https://developer.github.com/v3/pulls/comments/).
    */
  def listForPullRequestReviewComment(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/pulls/comments/:comment_id/reactions']['response'] */ js.Any
  ]
  def listForPullRequestReviewComment(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/pulls/comments/:comment_id/reactions']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/pulls/comments/:comment_id/reactions']['response'] */ js.Any
  ]
  /**
    * List the reactions to a [pull request review comment](https://developer.github.com/v3/pulls/comments/).
    */
  @JSName("listForPullRequestReviewComment")
  var listForPullRequestReviewComment_Original: `336`
  
  /**
    * List the reactions to a [team discussion comment](https://developer.github.com/v3/teams/discussion_comments/). OAuth access tokens require the `read:discussion` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    *
    * **Note:** You can also specify a team by `org_id` and `team_id` using the route `GET /organizations/:org_id/team/:team_id/discussions/:discussion_number/comments/:comment_number/reactions`.
    */
  def listForTeamDiscussionCommentInOrg(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/:org/teams/:team_slug/discussions/:discussion_number/comments/:comment_number/reactions']['response'] */ js.Any
  ]
  def listForTeamDiscussionCommentInOrg(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/:org/teams/:team_slug/discussions/:discussion_number/comments/:comment_number/reactions']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/:org/teams/:team_slug/discussions/:discussion_number/comments/:comment_number/reactions']['response'] */ js.Any
  ]
  /**
    * List the reactions to a [team discussion comment](https://developer.github.com/v3/teams/discussion_comments/). OAuth access tokens require the `read:discussion` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    *
    * **Note:** You can also specify a team by `org_id` and `team_id` using the route `GET /organizations/:org_id/team/:team_id/discussions/:discussion_number/comments/:comment_number/reactions`.
    */
  @JSName("listForTeamDiscussionCommentInOrg")
  var listForTeamDiscussionCommentInOrg_Original: `337`
  
  /**
    * List the reactions to a [team discussion](https://developer.github.com/v3/teams/discussions/). OAuth access tokens require the `read:discussion` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    *
    * **Note:** You can also specify a team by `org_id` and `team_id` using the route `GET /organizations/:org_id/team/:team_id/discussions/:discussion_number/reactions`.
    */
  def listForTeamDiscussionInOrg(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/:org/teams/:team_slug/discussions/:discussion_number/reactions']['response'] */ js.Any
  ]
  def listForTeamDiscussionInOrg(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/:org/teams/:team_slug/discussions/:discussion_number/reactions']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/:org/teams/:team_slug/discussions/:discussion_number/reactions']['response'] */ js.Any
  ]
  /**
    * List the reactions to a [team discussion](https://developer.github.com/v3/teams/discussions/). OAuth access tokens require the `read:discussion` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    *
    * **Note:** You can also specify a team by `org_id` and `team_id` using the route `GET /organizations/:org_id/team/:team_id/discussions/:discussion_number/reactions`.
    */
  @JSName("listForTeamDiscussionInOrg")
  var listForTeamDiscussionInOrg_Original: `338`
}
object CreateForCommitComment {
  
  @scala.inline
  def apply(
    createForCommitComment: `320`,
    createForIssue: `321`,
    createForIssueComment: `322`,
    createForPullRequestReviewComment: `323`,
    createForTeamDiscussionCommentInOrg: `324`,
    createForTeamDiscussionInOrg: `325`,
    deleteForCommitComment: `326`,
    deleteForIssue: `327`,
    deleteForIssueComment: `328`,
    deleteForPullRequestComment: `329`,
    deleteForTeamDiscussion: `330`,
    deleteForTeamDiscussionComment: `331`,
    deleteLegacy: `332`,
    listForCommitComment: `333`,
    listForIssue: `334`,
    listForIssueComment: `335`,
    listForPullRequestReviewComment: `336`,
    listForTeamDiscussionCommentInOrg: `337`,
    listForTeamDiscussionInOrg: `338`
  ): CreateForCommitComment = {
    val __obj = js.Dynamic.literal(createForCommitComment = createForCommitComment.asInstanceOf[js.Any], createForIssue = createForIssue.asInstanceOf[js.Any], createForIssueComment = createForIssueComment.asInstanceOf[js.Any], createForPullRequestReviewComment = createForPullRequestReviewComment.asInstanceOf[js.Any], createForTeamDiscussionCommentInOrg = createForTeamDiscussionCommentInOrg.asInstanceOf[js.Any], createForTeamDiscussionInOrg = createForTeamDiscussionInOrg.asInstanceOf[js.Any], deleteForCommitComment = deleteForCommitComment.asInstanceOf[js.Any], deleteForIssue = deleteForIssue.asInstanceOf[js.Any], deleteForIssueComment = deleteForIssueComment.asInstanceOf[js.Any], deleteForPullRequestComment = deleteForPullRequestComment.asInstanceOf[js.Any], deleteForTeamDiscussion = deleteForTeamDiscussion.asInstanceOf[js.Any], deleteForTeamDiscussionComment = deleteForTeamDiscussionComment.asInstanceOf[js.Any], deleteLegacy = deleteLegacy.asInstanceOf[js.Any], listForCommitComment = listForCommitComment.asInstanceOf[js.Any], listForIssue = listForIssue.asInstanceOf[js.Any], listForIssueComment = listForIssueComment.asInstanceOf[js.Any], listForPullRequestReviewComment = listForPullRequestReviewComment.asInstanceOf[js.Any], listForTeamDiscussionCommentInOrg = listForTeamDiscussionCommentInOrg.asInstanceOf[js.Any], listForTeamDiscussionInOrg = listForTeamDiscussionInOrg.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateForCommitComment]
  }
  
  @scala.inline
  implicit class CreateForCommitCommentMutableBuilder[Self <: CreateForCommitComment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateForCommitComment(value: `320`): Self = StObject.set(x, "createForCommitComment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateForIssue(value: `321`): Self = StObject.set(x, "createForIssue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateForIssueComment(value: `322`): Self = StObject.set(x, "createForIssueComment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateForPullRequestReviewComment(value: `323`): Self = StObject.set(x, "createForPullRequestReviewComment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateForTeamDiscussionCommentInOrg(value: `324`): Self = StObject.set(x, "createForTeamDiscussionCommentInOrg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateForTeamDiscussionInOrg(value: `325`): Self = StObject.set(x, "createForTeamDiscussionInOrg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteForCommitComment(value: `326`): Self = StObject.set(x, "deleteForCommitComment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteForIssue(value: `327`): Self = StObject.set(x, "deleteForIssue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteForIssueComment(value: `328`): Self = StObject.set(x, "deleteForIssueComment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteForPullRequestComment(value: `329`): Self = StObject.set(x, "deleteForPullRequestComment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteForTeamDiscussion(value: `330`): Self = StObject.set(x, "deleteForTeamDiscussion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteForTeamDiscussionComment(value: `331`): Self = StObject.set(x, "deleteForTeamDiscussionComment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteLegacy(value: `332`): Self = StObject.set(x, "deleteLegacy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListForCommitComment(value: `333`): Self = StObject.set(x, "listForCommitComment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListForIssue(value: `334`): Self = StObject.set(x, "listForIssue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListForIssueComment(value: `335`): Self = StObject.set(x, "listForIssueComment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListForPullRequestReviewComment(value: `336`): Self = StObject.set(x, "listForPullRequestReviewComment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListForTeamDiscussionCommentInOrg(value: `337`): Self = StObject.set(x, "listForTeamDiscussionCommentInOrg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListForTeamDiscussionInOrg(value: `338`): Self = StObject.set(x, "listForTeamDiscussionInOrg", value.asInstanceOf[js.Any])
  }
}
