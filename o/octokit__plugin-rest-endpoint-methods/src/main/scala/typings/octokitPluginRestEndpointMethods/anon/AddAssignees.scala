package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.distTypesRequestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddAssignees extends StObject {
  
  /**
    * Adds up to 10 assignees to an issue. Users already assigned to an issue are not replaced.
    */
  def addAssignees(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/issues/{issue_number}/assignees']['response'] */ js.Any
  ]
  def addAssignees(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/issues/{issue_number}/assignees']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/issues/{issue_number}/assignees']['response'] */ js.Any
  ]
  /**
    * Adds up to 10 assignees to an issue. Users already assigned to an issue are not replaced.
    */
  @JSName("addAssignees")
  var addAssignees_Original: `339`
  
  /**
    * Adds labels to an issue. If you provide an empty array of labels, all labels are removed from the issue.
    */
  def addLabels(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/issues/{issue_number}/labels']['response'] */ js.Any
  ]
  def addLabels(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/issues/{issue_number}/labels']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/issues/{issue_number}/labels']['response'] */ js.Any
  ]
  /**
    * Adds labels to an issue. If you provide an empty array of labels, all labels are removed from the issue.
    */
  @JSName("addLabels")
  var addLabels_Original: `340`
  
  /**
    * Checks if a user has permission to be assigned to an issue in this repository.
    *
    * If the `assignee` can be assigned to issues in the repository, a `204` header with no content is returned.
    *
    * Otherwise a `404` status code is returned.
    */
  def checkUserCanBeAssigned(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/assignees/{assignee}']['response'] */ js.Any
  ]
  def checkUserCanBeAssigned(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/assignees/{assignee}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/assignees/{assignee}']['response'] */ js.Any
  ]
  
  /**
    * Checks if a user has permission to be assigned to a specific issue.
    *
    * If the `assignee` can be assigned to this issue, a `204` status code with no content is returned.
    *
    * Otherwise a `404` status code is returned.
    */
  def checkUserCanBeAssignedToIssue(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/issues/{issue_number}/assignees/{assignee}']['response'] */ js.Any
  ]
  def checkUserCanBeAssignedToIssue(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/issues/{issue_number}/assignees/{assignee}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/issues/{issue_number}/assignees/{assignee}']['response'] */ js.Any
  ]
  /**
    * Checks if a user has permission to be assigned to a specific issue.
    *
    * If the `assignee` can be assigned to this issue, a `204` status code with no content is returned.
    *
    * Otherwise a `404` status code is returned.
    */
  @JSName("checkUserCanBeAssignedToIssue")
  var checkUserCanBeAssignedToIssue_Original: `342`
  
  /**
    * Checks if a user has permission to be assigned to an issue in this repository.
    *
    * If the `assignee` can be assigned to issues in the repository, a `204` header with no content is returned.
    *
    * Otherwise a `404` status code is returned.
    */
  @JSName("checkUserCanBeAssigned")
  var checkUserCanBeAssigned_Original: `341`
  
  /**
    * Any user with pull access to a repository can create an issue. If [issues are disabled in the repository](https://docs.github.com/articles/disabling-issues/), the API returns a `410 Gone` status.
    *
    * This endpoint triggers [notifications](https://docs.github.com/github/managing-subscriptions-and-notifications-on-github/about-notifications). Creating content too quickly using this endpoint may result in secondary rate limiting. See "[Secondary rate limits](https://docs.github.com/rest/overview/resources-in-the-rest-api#secondary-rate-limits)" and "[Dealing with secondary rate limits](https://docs.github.com/rest/guides/best-practices-for-integrators#dealing-with-secondary-rate-limits)" for details.
    */
  def create(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/issues']['response'] */ js.Any
  ]
  def create(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/issues']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/issues']['response'] */ js.Any
  ]
  
  /**
    * You can use the REST API to create comments on issues and pull requests. Every pull request is an issue, but not every issue is a pull request.
    *
    * This endpoint triggers [notifications](https://docs.github.com/github/managing-subscriptions-and-notifications-on-github/about-notifications).
    * Creating content too quickly using this endpoint may result in secondary rate limiting.
    * See "[Secondary rate limits](https://docs.github.com/rest/overview/resources-in-the-rest-api#secondary-rate-limits)"
    * and "[Dealing with secondary rate limits](https://docs.github.com/rest/guides/best-practices-for-integrators#dealing-with-secondary-rate-limits)"
    * for details.
    */
  def createComment(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/issues/{issue_number}/comments']['response'] */ js.Any
  ]
  def createComment(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/issues/{issue_number}/comments']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/issues/{issue_number}/comments']['response'] */ js.Any
  ]
  /**
    * You can use the REST API to create comments on issues and pull requests. Every pull request is an issue, but not every issue is a pull request.
    *
    * This endpoint triggers [notifications](https://docs.github.com/github/managing-subscriptions-and-notifications-on-github/about-notifications).
    * Creating content too quickly using this endpoint may result in secondary rate limiting.
    * See "[Secondary rate limits](https://docs.github.com/rest/overview/resources-in-the-rest-api#secondary-rate-limits)"
    * and "[Dealing with secondary rate limits](https://docs.github.com/rest/guides/best-practices-for-integrators#dealing-with-secondary-rate-limits)"
    * for details.
    */
  @JSName("createComment")
  var createComment_Original: `344`
  
  /**
    * Creates a label for the specified repository with the given name and color. The name and color parameters are required. The color must be a valid [hexadecimal color code](http://www.color-hex.com/).
    */
  def createLabel(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/labels']['response'] */ js.Any
  ]
  def createLabel(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/labels']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/labels']['response'] */ js.Any
  ]
  /**
    * Creates a label for the specified repository with the given name and color. The name and color parameters are required. The color must be a valid [hexadecimal color code](http://www.color-hex.com/).
    */
  @JSName("createLabel")
  var createLabel_Original: `345`
  
  /**
    * Creates a milestone.
    */
  def createMilestone(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/milestones']['response'] */ js.Any
  ]
  def createMilestone(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/milestones']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/milestones']['response'] */ js.Any
  ]
  /**
    * Creates a milestone.
    */
  @JSName("createMilestone")
  var createMilestone_Original: `346`
  
  /**
    * Any user with pull access to a repository can create an issue. If [issues are disabled in the repository](https://docs.github.com/articles/disabling-issues/), the API returns a `410 Gone` status.
    *
    * This endpoint triggers [notifications](https://docs.github.com/github/managing-subscriptions-and-notifications-on-github/about-notifications). Creating content too quickly using this endpoint may result in secondary rate limiting. See "[Secondary rate limits](https://docs.github.com/rest/overview/resources-in-the-rest-api#secondary-rate-limits)" and "[Dealing with secondary rate limits](https://docs.github.com/rest/guides/best-practices-for-integrators#dealing-with-secondary-rate-limits)" for details.
    */
  @JSName("create")
  var create_Original: `343`
  
  /**
    * You can use the REST API to delete comments on issues and pull requests. Every pull request is an issue, but not every issue is a pull request.
    */
  def deleteComment(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/issues/comments/{comment_id}']['response'] */ js.Any
  ]
  def deleteComment(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/issues/comments/{comment_id}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/issues/comments/{comment_id}']['response'] */ js.Any
  ]
  /**
    * You can use the REST API to delete comments on issues and pull requests. Every pull request is an issue, but not every issue is a pull request.
    */
  @JSName("deleteComment")
  var deleteComment_Original: `347`
  
  /**
    * Deletes a label using the given label name.
    */
  def deleteLabel(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/labels/{name}']['response'] */ js.Any
  ]
  def deleteLabel(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/labels/{name}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/labels/{name}']['response'] */ js.Any
  ]
  /**
    * Deletes a label using the given label name.
    */
  @JSName("deleteLabel")
  var deleteLabel_Original: `348`
  
  /**
    * Deletes a milestone using the given milestone number.
    */
  def deleteMilestone(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/milestones/{milestone_number}']['response'] */ js.Any
  ]
  def deleteMilestone(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/milestones/{milestone_number}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/milestones/{milestone_number}']['response'] */ js.Any
  ]
  /**
    * Deletes a milestone using the given milestone number.
    */
  @JSName("deleteMilestone")
  var deleteMilestone_Original: `349`
  
  /**
    * The API returns a [`301 Moved Permanently` status](https://docs.github.com/rest/overview/resources-in-the-rest-api#http-redirects-redirects) if the issue was
    * [transferred](https://docs.github.com/articles/transferring-an-issue-to-another-repository/) to another repository. If
    * the issue was transferred to or deleted from a repository where the authenticated user lacks read access, the API
    * returns a `404 Not Found` status. If the issue was deleted from a repository where the authenticated user has read
    * access, the API returns a `410 Gone` status. To receive webhook events for transferred and deleted issues, subscribe
    * to the [`issues`](https://docs.github.com/webhooks/event-payloads/#issues) webhook.
    *
    * **Note**: GitHub's REST API considers every pull request an issue, but not every issue is a pull request. For this
    * reason, "Issues" endpoints may return both issues and pull requests in the response. You can identify pull requests by
    * the `pull_request` key. Be aware that the `id` of a pull request returned from "Issues" endpoints will be an _issue id_. To find out the pull
    * request id, use the "[List pull requests](https://docs.github.com/rest/reference/pulls#list-pull-requests)" endpoint.
    */
  def get(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/issues/{issue_number}']['response'] */ js.Any
  ]
  def get(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/issues/{issue_number}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/issues/{issue_number}']['response'] */ js.Any
  ]
  
  /**
    * You can use the REST API to get comments on issues and pull requests. Every pull request is an issue, but not every issue is a pull request.
    */
  def getComment(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/issues/comments/{comment_id}']['response'] */ js.Any
  ]
  def getComment(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/issues/comments/{comment_id}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/issues/comments/{comment_id}']['response'] */ js.Any
  ]
  /**
    * You can use the REST API to get comments on issues and pull requests. Every pull request is an issue, but not every issue is a pull request.
    */
  @JSName("getComment")
  var getComment_Original: `351`
  
  /**
    * Gets a single event by the event id.
    */
  def getEvent(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/issues/events/{event_id}']['response'] */ js.Any
  ]
  def getEvent(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/issues/events/{event_id}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/issues/events/{event_id}']['response'] */ js.Any
  ]
  /**
    * Gets a single event by the event id.
    */
  @JSName("getEvent")
  var getEvent_Original: `352`
  
  /**
    * Gets a label using the given name.
    */
  def getLabel(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/labels/{name}']['response'] */ js.Any
  ]
  def getLabel(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/labels/{name}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/labels/{name}']['response'] */ js.Any
  ]
  /**
    * Gets a label using the given name.
    */
  @JSName("getLabel")
  var getLabel_Original: `353`
  
  /**
    * Gets a milestone using the given milestone number.
    */
  def getMilestone(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/milestones/{milestone_number}']['response'] */ js.Any
  ]
  def getMilestone(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/milestones/{milestone_number}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/milestones/{milestone_number}']['response'] */ js.Any
  ]
  /**
    * Gets a milestone using the given milestone number.
    */
  @JSName("getMilestone")
  var getMilestone_Original: `354`
  
  /**
    * The API returns a [`301 Moved Permanently` status](https://docs.github.com/rest/overview/resources-in-the-rest-api#http-redirects-redirects) if the issue was
    * [transferred](https://docs.github.com/articles/transferring-an-issue-to-another-repository/) to another repository. If
    * the issue was transferred to or deleted from a repository where the authenticated user lacks read access, the API
    * returns a `404 Not Found` status. If the issue was deleted from a repository where the authenticated user has read
    * access, the API returns a `410 Gone` status. To receive webhook events for transferred and deleted issues, subscribe
    * to the [`issues`](https://docs.github.com/webhooks/event-payloads/#issues) webhook.
    *
    * **Note**: GitHub's REST API considers every pull request an issue, but not every issue is a pull request. For this
    * reason, "Issues" endpoints may return both issues and pull requests in the response. You can identify pull requests by
    * the `pull_request` key. Be aware that the `id` of a pull request returned from "Issues" endpoints will be an _issue id_. To find out the pull
    * request id, use the "[List pull requests](https://docs.github.com/rest/reference/pulls#list-pull-requests)" endpoint.
    */
  @JSName("get")
  var get_Original: `350`
  
  /**
    * List issues assigned to the authenticated user across all visible repositories including owned repositories, member
    * repositories, and organization repositories. You can use the `filter` query parameter to fetch issues that are not
    * necessarily assigned to you.
    *
    *
    * **Note**: GitHub's REST API considers every pull request an issue, but not every issue is a pull request. For this
    * reason, "Issues" endpoints may return both issues and pull requests in the response. You can identify pull requests by
    * the `pull_request` key. Be aware that the `id` of a pull request returned from "Issues" endpoints will be an _issue id_. To find out the pull
    * request id, use the "[List pull requests](https://docs.github.com/rest/reference/pulls#list-pull-requests)" endpoint.
    */
  def list(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /issues']['response'] */ js.Any
  ]
  def list(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /issues']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /issues']['response'] */ js.Any
  ]
  
  /**
    * Lists the [available assignees](https://docs.github.com/articles/assigning-issues-and-pull-requests-to-other-github-users/) for issues in a repository.
    */
  def listAssignees(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/assignees']['response'] */ js.Any
  ]
  def listAssignees(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/assignees']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/assignees']['response'] */ js.Any
  ]
  /**
    * Lists the [available assignees](https://docs.github.com/articles/assigning-issues-and-pull-requests-to-other-github-users/) for issues in a repository.
    */
  @JSName("listAssignees")
  var listAssignees_Original: `356`
  
  /**
    * You can use the REST API to list comments on issues and pull requests. Every pull request is an issue, but not every issue is a pull request.
    *
    * Issue comments are ordered by ascending ID.
    */
  def listComments(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/issues/{issue_number}/comments']['response'] */ js.Any
  ]
  def listComments(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/issues/{issue_number}/comments']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/issues/{issue_number}/comments']['response'] */ js.Any
  ]
  
  /**
    * You can use the REST API to list comments on issues and pull requests for a repository. Every pull request is an issue, but not every issue is a pull request.
    *
    * By default, issue comments are ordered by ascending ID.
    */
  def listCommentsForRepo(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/issues/comments']['response'] */ js.Any
  ]
  def listCommentsForRepo(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/issues/comments']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/issues/comments']['response'] */ js.Any
  ]
  /**
    * You can use the REST API to list comments on issues and pull requests for a repository. Every pull request is an issue, but not every issue is a pull request.
    *
    * By default, issue comments are ordered by ascending ID.
    */
  @JSName("listCommentsForRepo")
  var listCommentsForRepo_Original: `358`
  
  /**
    * You can use the REST API to list comments on issues and pull requests. Every pull request is an issue, but not every issue is a pull request.
    *
    * Issue comments are ordered by ascending ID.
    */
  @JSName("listComments")
  var listComments_Original: `357`
  
  /**
    * Lists all events for an issue.
    */
  def listEvents(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/issues/{issue_number}/events']['response'] */ js.Any
  ]
  def listEvents(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/issues/{issue_number}/events']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/issues/{issue_number}/events']['response'] */ js.Any
  ]
  
  /**
    * Lists events for a repository.
    */
  def listEventsForRepo(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/issues/events']['response'] */ js.Any
  ]
  def listEventsForRepo(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/issues/events']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/issues/events']['response'] */ js.Any
  ]
  /**
    * Lists events for a repository.
    */
  @JSName("listEventsForRepo")
  var listEventsForRepo_Original: `360`
  
  /**
    * List all timeline events for an issue.
    */
  def listEventsForTimeline(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/issues/{issue_number}/timeline']['response'] */ js.Any
  ]
  def listEventsForTimeline(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/issues/{issue_number}/timeline']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/issues/{issue_number}/timeline']['response'] */ js.Any
  ]
  /**
    * List all timeline events for an issue.
    */
  @JSName("listEventsForTimeline")
  var listEventsForTimeline_Original: `361`
  
  /**
    * Lists all events for an issue.
    */
  @JSName("listEvents")
  var listEvents_Original: `359`
  
  /**
    * List issues across owned and member repositories assigned to the authenticated user.
    *
    * **Note**: GitHub's REST API considers every pull request an issue, but not every issue is a pull request. For this
    * reason, "Issues" endpoints may return both issues and pull requests in the response. You can identify pull requests by
    * the `pull_request` key. Be aware that the `id` of a pull request returned from "Issues" endpoints will be an _issue id_. To find out the pull
    * request id, use the "[List pull requests](https://docs.github.com/rest/reference/pulls#list-pull-requests)" endpoint.
    */
  def listForAuthenticatedUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/issues']['response'] */ js.Any
  ]
  def listForAuthenticatedUser(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/issues']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/issues']['response'] */ js.Any
  ]
  /**
    * List issues across owned and member repositories assigned to the authenticated user.
    *
    * **Note**: GitHub's REST API considers every pull request an issue, but not every issue is a pull request. For this
    * reason, "Issues" endpoints may return both issues and pull requests in the response. You can identify pull requests by
    * the `pull_request` key. Be aware that the `id` of a pull request returned from "Issues" endpoints will be an _issue id_. To find out the pull
    * request id, use the "[List pull requests](https://docs.github.com/rest/reference/pulls#list-pull-requests)" endpoint.
    */
  @JSName("listForAuthenticatedUser")
  var listForAuthenticatedUser_Original: `362`
  
  /**
    * List issues in an organization assigned to the authenticated user.
    *
    * **Note**: GitHub's REST API considers every pull request an issue, but not every issue is a pull request. For this
    * reason, "Issues" endpoints may return both issues and pull requests in the response. You can identify pull requests by
    * the `pull_request` key. Be aware that the `id` of a pull request returned from "Issues" endpoints will be an _issue id_. To find out the pull
    * request id, use the "[List pull requests](https://docs.github.com/rest/reference/pulls#list-pull-requests)" endpoint.
    */
  def listForOrg(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/issues']['response'] */ js.Any
  ]
  def listForOrg(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/issues']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/issues']['response'] */ js.Any
  ]
  /**
    * List issues in an organization assigned to the authenticated user.
    *
    * **Note**: GitHub's REST API considers every pull request an issue, but not every issue is a pull request. For this
    * reason, "Issues" endpoints may return both issues and pull requests in the response. You can identify pull requests by
    * the `pull_request` key. Be aware that the `id` of a pull request returned from "Issues" endpoints will be an _issue id_. To find out the pull
    * request id, use the "[List pull requests](https://docs.github.com/rest/reference/pulls#list-pull-requests)" endpoint.
    */
  @JSName("listForOrg")
  var listForOrg_Original: `363`
  
  /**
    * List issues in a repository. Only open issues will be listed.
    *
    * **Note**: GitHub's REST API considers every pull request an issue, but not every issue is a pull request. For this
    * reason, "Issues" endpoints may return both issues and pull requests in the response. You can identify pull requests by
    * the `pull_request` key. Be aware that the `id` of a pull request returned from "Issues" endpoints will be an _issue id_. To find out the pull
    * request id, use the "[List pull requests](https://docs.github.com/rest/reference/pulls#list-pull-requests)" endpoint.
    */
  def listForRepo(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/issues']['response'] */ js.Any
  ]
  def listForRepo(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/issues']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/issues']['response'] */ js.Any
  ]
  /**
    * List issues in a repository. Only open issues will be listed.
    *
    * **Note**: GitHub's REST API considers every pull request an issue, but not every issue is a pull request. For this
    * reason, "Issues" endpoints may return both issues and pull requests in the response. You can identify pull requests by
    * the `pull_request` key. Be aware that the `id` of a pull request returned from "Issues" endpoints will be an _issue id_. To find out the pull
    * request id, use the "[List pull requests](https://docs.github.com/rest/reference/pulls#list-pull-requests)" endpoint.
    */
  @JSName("listForRepo")
  var listForRepo_Original: `364`
  
  /**
    * Lists labels for issues in a milestone.
    */
  def listLabelsForMilestone(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/milestones/{milestone_number}/labels']['response'] */ js.Any
  ]
  def listLabelsForMilestone(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/milestones/{milestone_number}/labels']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/milestones/{milestone_number}/labels']['response'] */ js.Any
  ]
  /**
    * Lists labels for issues in a milestone.
    */
  @JSName("listLabelsForMilestone")
  var listLabelsForMilestone_Original: `365`
  
  /**
    * Lists all labels for a repository.
    */
  def listLabelsForRepo(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/labels']['response'] */ js.Any
  ]
  def listLabelsForRepo(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/labels']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/labels']['response'] */ js.Any
  ]
  /**
    * Lists all labels for a repository.
    */
  @JSName("listLabelsForRepo")
  var listLabelsForRepo_Original: `366`
  
  /**
    * Lists all labels for an issue.
    */
  def listLabelsOnIssue(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/issues/{issue_number}/labels']['response'] */ js.Any
  ]
  def listLabelsOnIssue(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/issues/{issue_number}/labels']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/issues/{issue_number}/labels']['response'] */ js.Any
  ]
  /**
    * Lists all labels for an issue.
    */
  @JSName("listLabelsOnIssue")
  var listLabelsOnIssue_Original: `367`
  
  /**
    * Lists milestones for a repository.
    */
  def listMilestones(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/milestones']['response'] */ js.Any
  ]
  def listMilestones(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/milestones']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/milestones']['response'] */ js.Any
  ]
  /**
    * Lists milestones for a repository.
    */
  @JSName("listMilestones")
  var listMilestones_Original: `368`
  
  /**
    * List issues assigned to the authenticated user across all visible repositories including owned repositories, member
    * repositories, and organization repositories. You can use the `filter` query parameter to fetch issues that are not
    * necessarily assigned to you.
    *
    *
    * **Note**: GitHub's REST API considers every pull request an issue, but not every issue is a pull request. For this
    * reason, "Issues" endpoints may return both issues and pull requests in the response. You can identify pull requests by
    * the `pull_request` key. Be aware that the `id` of a pull request returned from "Issues" endpoints will be an _issue id_. To find out the pull
    * request id, use the "[List pull requests](https://docs.github.com/rest/reference/pulls#list-pull-requests)" endpoint.
    */
  @JSName("list")
  var list_Original: `355`
  
  /**
    * Users with push access can lock an issue or pull request's conversation.
    *
    * Note that, if you choose not to pass any parameters, you'll need to set `Content-Length` to zero when calling out to this endpoint. For more information, see "[HTTP verbs](https://docs.github.com/rest/overview/resources-in-the-rest-api#http-verbs)."
    */
  def lock(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/{owner}/{repo}/issues/{issue_number}/lock']['response'] */ js.Any
  ]
  def lock(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/{owner}/{repo}/issues/{issue_number}/lock']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/{owner}/{repo}/issues/{issue_number}/lock']['response'] */ js.Any
  ]
  /**
    * Users with push access can lock an issue or pull request's conversation.
    *
    * Note that, if you choose not to pass any parameters, you'll need to set `Content-Length` to zero when calling out to this endpoint. For more information, see "[HTTP verbs](https://docs.github.com/rest/overview/resources-in-the-rest-api#http-verbs)."
    */
  @JSName("lock")
  var lock_Original: `369`
  
  /**
    * Removes all labels from an issue.
    */
  def removeAllLabels(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/issues/{issue_number}/labels']['response'] */ js.Any
  ]
  def removeAllLabels(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/issues/{issue_number}/labels']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/issues/{issue_number}/labels']['response'] */ js.Any
  ]
  /**
    * Removes all labels from an issue.
    */
  @JSName("removeAllLabels")
  var removeAllLabels_Original: `370`
  
  /**
    * Removes one or more assignees from an issue.
    */
  def removeAssignees(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/issues/{issue_number}/assignees']['response'] */ js.Any
  ]
  def removeAssignees(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/issues/{issue_number}/assignees']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/issues/{issue_number}/assignees']['response'] */ js.Any
  ]
  /**
    * Removes one or more assignees from an issue.
    */
  @JSName("removeAssignees")
  var removeAssignees_Original: `371`
  
  /**
    * Removes the specified label from the issue, and returns the remaining labels on the issue. This endpoint returns a `404 Not Found` status if the label does not exist.
    */
  def removeLabel(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/issues/{issue_number}/labels/{name}']['response'] */ js.Any
  ]
  def removeLabel(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/issues/{issue_number}/labels/{name}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/issues/{issue_number}/labels/{name}']['response'] */ js.Any
  ]
  /**
    * Removes the specified label from the issue, and returns the remaining labels on the issue. This endpoint returns a `404 Not Found` status if the label does not exist.
    */
  @JSName("removeLabel")
  var removeLabel_Original: `372`
  
  /**
    * Removes any previous labels and sets the new labels for an issue.
    */
  def setLabels(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/{owner}/{repo}/issues/{issue_number}/labels']['response'] */ js.Any
  ]
  def setLabels(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/{owner}/{repo}/issues/{issue_number}/labels']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/{owner}/{repo}/issues/{issue_number}/labels']['response'] */ js.Any
  ]
  /**
    * Removes any previous labels and sets the new labels for an issue.
    */
  @JSName("setLabels")
  var setLabels_Original: `373`
  
  /**
    * Users with push access can unlock an issue's conversation.
    */
  def unlock(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/issues/{issue_number}/lock']['response'] */ js.Any
  ]
  def unlock(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/issues/{issue_number}/lock']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/issues/{issue_number}/lock']['response'] */ js.Any
  ]
  /**
    * Users with push access can unlock an issue's conversation.
    */
  @JSName("unlock")
  var unlock_Original: `374`
  
  /**
    * Issue owners and users with push access can edit an issue.
    */
  def update(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /repos/{owner}/{repo}/issues/{issue_number}']['response'] */ js.Any
  ]
  def update(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /repos/{owner}/{repo}/issues/{issue_number}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /repos/{owner}/{repo}/issues/{issue_number}']['response'] */ js.Any
  ]
  
  /**
    * You can use the REST API to update comments on issues and pull requests. Every pull request is an issue, but not every issue is a pull request.
    */
  def updateComment(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /repos/{owner}/{repo}/issues/comments/{comment_id}']['response'] */ js.Any
  ]
  def updateComment(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /repos/{owner}/{repo}/issues/comments/{comment_id}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /repos/{owner}/{repo}/issues/comments/{comment_id}']['response'] */ js.Any
  ]
  /**
    * You can use the REST API to update comments on issues and pull requests. Every pull request is an issue, but not every issue is a pull request.
    */
  @JSName("updateComment")
  var updateComment_Original: `376`
  
  /**
    * Updates a label using the given label name.
    */
  def updateLabel(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /repos/{owner}/{repo}/labels/{name}']['response'] */ js.Any
  ]
  def updateLabel(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /repos/{owner}/{repo}/labels/{name}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /repos/{owner}/{repo}/labels/{name}']['response'] */ js.Any
  ]
  /**
    * Updates a label using the given label name.
    */
  @JSName("updateLabel")
  var updateLabel_Original: `377`
  
  def updateMilestone(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /repos/{owner}/{repo}/milestones/{milestone_number}']['response'] */ js.Any
  ]
  def updateMilestone(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /repos/{owner}/{repo}/milestones/{milestone_number}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /repos/{owner}/{repo}/milestones/{milestone_number}']['response'] */ js.Any
  ]
  @JSName("updateMilestone")
  var updateMilestone_Original: `378`
  
  /**
    * Issue owners and users with push access can edit an issue.
    */
  @JSName("update")
  var update_Original: `375`
}
object AddAssignees {
  
  inline def apply(
    addAssignees: `339`,
    addLabels: `340`,
    checkUserCanBeAssigned: `341`,
    checkUserCanBeAssignedToIssue: `342`,
    create: `343`,
    createComment: `344`,
    createLabel: `345`,
    createMilestone: `346`,
    deleteComment: `347`,
    deleteLabel: `348`,
    deleteMilestone: `349`,
    get: `350`,
    getComment: `351`,
    getEvent: `352`,
    getLabel: `353`,
    getMilestone: `354`,
    list: `355`,
    listAssignees: `356`,
    listComments: `357`,
    listCommentsForRepo: `358`,
    listEvents: `359`,
    listEventsForRepo: `360`,
    listEventsForTimeline: `361`,
    listForAuthenticatedUser: `362`,
    listForOrg: `363`,
    listForRepo: `364`,
    listLabelsForMilestone: `365`,
    listLabelsForRepo: `366`,
    listLabelsOnIssue: `367`,
    listMilestones: `368`,
    lock: `369`,
    removeAllLabels: `370`,
    removeAssignees: `371`,
    removeLabel: `372`,
    setLabels: `373`,
    unlock: `374`,
    update: `375`,
    updateComment: `376`,
    updateLabel: `377`,
    updateMilestone: `378`
  ): AddAssignees = {
    val __obj = js.Dynamic.literal(addAssignees = addAssignees.asInstanceOf[js.Any], addLabels = addLabels.asInstanceOf[js.Any], checkUserCanBeAssigned = checkUserCanBeAssigned.asInstanceOf[js.Any], checkUserCanBeAssignedToIssue = checkUserCanBeAssignedToIssue.asInstanceOf[js.Any], create = create.asInstanceOf[js.Any], createComment = createComment.asInstanceOf[js.Any], createLabel = createLabel.asInstanceOf[js.Any], createMilestone = createMilestone.asInstanceOf[js.Any], deleteComment = deleteComment.asInstanceOf[js.Any], deleteLabel = deleteLabel.asInstanceOf[js.Any], deleteMilestone = deleteMilestone.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], getComment = getComment.asInstanceOf[js.Any], getEvent = getEvent.asInstanceOf[js.Any], getLabel = getLabel.asInstanceOf[js.Any], getMilestone = getMilestone.asInstanceOf[js.Any], list = list.asInstanceOf[js.Any], listAssignees = listAssignees.asInstanceOf[js.Any], listComments = listComments.asInstanceOf[js.Any], listCommentsForRepo = listCommentsForRepo.asInstanceOf[js.Any], listEvents = listEvents.asInstanceOf[js.Any], listEventsForRepo = listEventsForRepo.asInstanceOf[js.Any], listEventsForTimeline = listEventsForTimeline.asInstanceOf[js.Any], listForAuthenticatedUser = listForAuthenticatedUser.asInstanceOf[js.Any], listForOrg = listForOrg.asInstanceOf[js.Any], listForRepo = listForRepo.asInstanceOf[js.Any], listLabelsForMilestone = listLabelsForMilestone.asInstanceOf[js.Any], listLabelsForRepo = listLabelsForRepo.asInstanceOf[js.Any], listLabelsOnIssue = listLabelsOnIssue.asInstanceOf[js.Any], listMilestones = listMilestones.asInstanceOf[js.Any], lock = lock.asInstanceOf[js.Any], removeAllLabels = removeAllLabels.asInstanceOf[js.Any], removeAssignees = removeAssignees.asInstanceOf[js.Any], removeLabel = removeLabel.asInstanceOf[js.Any], setLabels = setLabels.asInstanceOf[js.Any], unlock = unlock.asInstanceOf[js.Any], update = update.asInstanceOf[js.Any], updateComment = updateComment.asInstanceOf[js.Any], updateLabel = updateLabel.asInstanceOf[js.Any], updateMilestone = updateMilestone.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddAssignees]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AddAssignees] (val x: Self) extends AnyVal {
    
    inline def setAddAssignees(value: `339`): Self = StObject.set(x, "addAssignees", value.asInstanceOf[js.Any])
    
    inline def setAddLabels(value: `340`): Self = StObject.set(x, "addLabels", value.asInstanceOf[js.Any])
    
    inline def setCheckUserCanBeAssigned(value: `341`): Self = StObject.set(x, "checkUserCanBeAssigned", value.asInstanceOf[js.Any])
    
    inline def setCheckUserCanBeAssignedToIssue(value: `342`): Self = StObject.set(x, "checkUserCanBeAssignedToIssue", value.asInstanceOf[js.Any])
    
    inline def setCreate(value: `343`): Self = StObject.set(x, "create", value.asInstanceOf[js.Any])
    
    inline def setCreateComment(value: `344`): Self = StObject.set(x, "createComment", value.asInstanceOf[js.Any])
    
    inline def setCreateLabel(value: `345`): Self = StObject.set(x, "createLabel", value.asInstanceOf[js.Any])
    
    inline def setCreateMilestone(value: `346`): Self = StObject.set(x, "createMilestone", value.asInstanceOf[js.Any])
    
    inline def setDeleteComment(value: `347`): Self = StObject.set(x, "deleteComment", value.asInstanceOf[js.Any])
    
    inline def setDeleteLabel(value: `348`): Self = StObject.set(x, "deleteLabel", value.asInstanceOf[js.Any])
    
    inline def setDeleteMilestone(value: `349`): Self = StObject.set(x, "deleteMilestone", value.asInstanceOf[js.Any])
    
    inline def setGet(value: `350`): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setGetComment(value: `351`): Self = StObject.set(x, "getComment", value.asInstanceOf[js.Any])
    
    inline def setGetEvent(value: `352`): Self = StObject.set(x, "getEvent", value.asInstanceOf[js.Any])
    
    inline def setGetLabel(value: `353`): Self = StObject.set(x, "getLabel", value.asInstanceOf[js.Any])
    
    inline def setGetMilestone(value: `354`): Self = StObject.set(x, "getMilestone", value.asInstanceOf[js.Any])
    
    inline def setList(value: `355`): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
    
    inline def setListAssignees(value: `356`): Self = StObject.set(x, "listAssignees", value.asInstanceOf[js.Any])
    
    inline def setListComments(value: `357`): Self = StObject.set(x, "listComments", value.asInstanceOf[js.Any])
    
    inline def setListCommentsForRepo(value: `358`): Self = StObject.set(x, "listCommentsForRepo", value.asInstanceOf[js.Any])
    
    inline def setListEvents(value: `359`): Self = StObject.set(x, "listEvents", value.asInstanceOf[js.Any])
    
    inline def setListEventsForRepo(value: `360`): Self = StObject.set(x, "listEventsForRepo", value.asInstanceOf[js.Any])
    
    inline def setListEventsForTimeline(value: `361`): Self = StObject.set(x, "listEventsForTimeline", value.asInstanceOf[js.Any])
    
    inline def setListForAuthenticatedUser(value: `362`): Self = StObject.set(x, "listForAuthenticatedUser", value.asInstanceOf[js.Any])
    
    inline def setListForOrg(value: `363`): Self = StObject.set(x, "listForOrg", value.asInstanceOf[js.Any])
    
    inline def setListForRepo(value: `364`): Self = StObject.set(x, "listForRepo", value.asInstanceOf[js.Any])
    
    inline def setListLabelsForMilestone(value: `365`): Self = StObject.set(x, "listLabelsForMilestone", value.asInstanceOf[js.Any])
    
    inline def setListLabelsForRepo(value: `366`): Self = StObject.set(x, "listLabelsForRepo", value.asInstanceOf[js.Any])
    
    inline def setListLabelsOnIssue(value: `367`): Self = StObject.set(x, "listLabelsOnIssue", value.asInstanceOf[js.Any])
    
    inline def setListMilestones(value: `368`): Self = StObject.set(x, "listMilestones", value.asInstanceOf[js.Any])
    
    inline def setLock(value: `369`): Self = StObject.set(x, "lock", value.asInstanceOf[js.Any])
    
    inline def setRemoveAllLabels(value: `370`): Self = StObject.set(x, "removeAllLabels", value.asInstanceOf[js.Any])
    
    inline def setRemoveAssignees(value: `371`): Self = StObject.set(x, "removeAssignees", value.asInstanceOf[js.Any])
    
    inline def setRemoveLabel(value: `372`): Self = StObject.set(x, "removeLabel", value.asInstanceOf[js.Any])
    
    inline def setSetLabels(value: `373`): Self = StObject.set(x, "setLabels", value.asInstanceOf[js.Any])
    
    inline def setUnlock(value: `374`): Self = StObject.set(x, "unlock", value.asInstanceOf[js.Any])
    
    inline def setUpdate(value: `375`): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
    
    inline def setUpdateComment(value: `376`): Self = StObject.set(x, "updateComment", value.asInstanceOf[js.Any])
    
    inline def setUpdateLabel(value: `377`): Self = StObject.set(x, "updateLabel", value.asInstanceOf[js.Any])
    
    inline def setUpdateMilestone(value: `378`): Self = StObject.set(x, "updateMilestone", value.asInstanceOf[js.Any])
  }
}
