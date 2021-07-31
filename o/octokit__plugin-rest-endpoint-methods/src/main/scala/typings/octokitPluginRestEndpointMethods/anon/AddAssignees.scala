package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddAssignees extends StObject {
  
  /**
    * Adds up to 10 assignees to an issue. Users already assigned to an issue are not replaced.
    */
  def addAssignees(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/:owner/:repo/issues/:issue_number/assignees']['response'] */ js.Any
  ]
  def addAssignees(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/:owner/:repo/issues/:issue_number/assignees']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/:owner/:repo/issues/:issue_number/assignees']['response'] */ js.Any
  ]
  /**
    * Adds up to 10 assignees to an issue. Users already assigned to an issue are not replaced.
    */
  @JSName("addAssignees")
  var addAssignees_Original: `165`
  
  def addLabels(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/:owner/:repo/issues/:issue_number/labels']['response'] */ js.Any
  ]
  def addLabels(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/:owner/:repo/issues/:issue_number/labels']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/:owner/:repo/issues/:issue_number/labels']['response'] */ js.Any
  ]
  @JSName("addLabels")
  var addLabels_Original: `166`
  
  /**
    * Checks if a user has permission to be assigned to an issue in this repository.
    *
    * If the `assignee` can be assigned to issues in the repository, a `204` header with no content is returned.
    *
    * Otherwise a `404` status code is returned.
    */
  def checkUserCanBeAssigned(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/assignees/:assignee']['response'] */ js.Any
  ]
  def checkUserCanBeAssigned(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/assignees/:assignee']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/assignees/:assignee']['response'] */ js.Any
  ]
  /**
    * Checks if a user has permission to be assigned to an issue in this repository.
    *
    * If the `assignee` can be assigned to issues in the repository, a `204` header with no content is returned.
    *
    * Otherwise a `404` status code is returned.
    */
  @JSName("checkUserCanBeAssigned")
  var checkUserCanBeAssigned_Original: `167`
  
  /**
    * Any user with pull access to a repository can create an issue. If [issues are disabled in the repository](https://docs.github.com/articles/disabling-issues/), the API returns a `410 Gone` status.
    *
    * This endpoint triggers [notifications](https://docs.github.com/articles/about-notifications/). Creating content too quickly using this endpoint may result in abuse rate limiting. See "[Abuse rate limits](https://developer.github.com/v3/#abuse-rate-limits)" and "[Dealing with abuse rate limits](https://developer.github.com/v3/guides/best-practices-for-integrators/#dealing-with-abuse-rate-limits)" for details.
    */
  def create(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/:owner/:repo/issues']['response'] */ js.Any
  ]
  def create(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/:owner/:repo/issues']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/:owner/:repo/issues']['response'] */ js.Any
  ]
  
  /**
    * This endpoint triggers [notifications](https://docs.github.com/articles/about-notifications/). Creating content too quickly using this endpoint may result in abuse rate limiting. See "[Abuse rate limits](https://developer.github.com/v3/#abuse-rate-limits)" and "[Dealing with abuse rate limits](https://developer.github.com/v3/guides/best-practices-for-integrators/#dealing-with-abuse-rate-limits)" for details.
    */
  def createComment(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/:owner/:repo/issues/:issue_number/comments']['response'] */ js.Any
  ]
  def createComment(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/:owner/:repo/issues/:issue_number/comments']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/:owner/:repo/issues/:issue_number/comments']['response'] */ js.Any
  ]
  /**
    * This endpoint triggers [notifications](https://docs.github.com/articles/about-notifications/). Creating content too quickly using this endpoint may result in abuse rate limiting. See "[Abuse rate limits](https://developer.github.com/v3/#abuse-rate-limits)" and "[Dealing with abuse rate limits](https://developer.github.com/v3/guides/best-practices-for-integrators/#dealing-with-abuse-rate-limits)" for details.
    */
  @JSName("createComment")
  var createComment_Original: `169`
  
  def createLabel(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/:owner/:repo/labels']['response'] */ js.Any
  ]
  def createLabel(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/:owner/:repo/labels']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/:owner/:repo/labels']['response'] */ js.Any
  ]
  @JSName("createLabel")
  var createLabel_Original: `170`
  
  def createMilestone(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/:owner/:repo/milestones']['response'] */ js.Any
  ]
  def createMilestone(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/:owner/:repo/milestones']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/:owner/:repo/milestones']['response'] */ js.Any
  ]
  @JSName("createMilestone")
  var createMilestone_Original: `171`
  
  /**
    * Any user with pull access to a repository can create an issue. If [issues are disabled in the repository](https://docs.github.com/articles/disabling-issues/), the API returns a `410 Gone` status.
    *
    * This endpoint triggers [notifications](https://docs.github.com/articles/about-notifications/). Creating content too quickly using this endpoint may result in abuse rate limiting. See "[Abuse rate limits](https://developer.github.com/v3/#abuse-rate-limits)" and "[Dealing with abuse rate limits](https://developer.github.com/v3/guides/best-practices-for-integrators/#dealing-with-abuse-rate-limits)" for details.
    */
  @JSName("create")
  var create_Original: `168`
  
  def deleteComment(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo/issues/comments/:comment_id']['response'] */ js.Any
  ]
  def deleteComment(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo/issues/comments/:comment_id']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo/issues/comments/:comment_id']['response'] */ js.Any
  ]
  @JSName("deleteComment")
  var deleteComment_Original: `172`
  
  def deleteLabel(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo/labels/:name']['response'] */ js.Any
  ]
  def deleteLabel(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo/labels/:name']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo/labels/:name']['response'] */ js.Any
  ]
  @JSName("deleteLabel")
  var deleteLabel_Original: `173`
  
  def deleteMilestone(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo/milestones/:milestone_number']['response'] */ js.Any
  ]
  def deleteMilestone(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo/milestones/:milestone_number']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo/milestones/:milestone_number']['response'] */ js.Any
  ]
  @JSName("deleteMilestone")
  var deleteMilestone_Original: `174`
  
  /**
    * The API returns a [`301 Moved Permanently` status](https://developer.github.com/v3/#http-redirects) if the issue was
    * [transferred](https://docs.github.com/articles/transferring-an-issue-to-another-repository/) to another repository. If
    * the issue was transferred to or deleted from a repository where the authenticated user lacks read access, the API
    * returns a `404 Not Found` status. If the issue was deleted from a repository where the authenticated user has read
    * access, the API returns a `410 Gone` status. To receive webhook events for transferred and deleted issues, subscribe
    * to the [`issues`](https://developer.github.com/webhooks/event-payloads/#issues) webhook.
    *
    * **Note**: GitHub's REST API v3 considers every pull request an issue, but not every issue is a pull request. For this
    * reason, "Issues" endpoints may return both issues and pull requests in the response. You can identify pull requests by
    * the `pull_request` key. Be aware that the `id` of a pull request returned from "Issues" endpoints will be an _issue id_. To find out the pull
    * request id, use the "[List pull requests](https://developer.github.com/v3/pulls/#list-pull-requests)" endpoint.
    */
  def get(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/issues/:issue_number']['response'] */ js.Any
  ]
  def get(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/issues/:issue_number']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/issues/:issue_number']['response'] */ js.Any
  ]
  
  def getComment(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/issues/comments/:comment_id']['response'] */ js.Any
  ]
  def getComment(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/issues/comments/:comment_id']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/issues/comments/:comment_id']['response'] */ js.Any
  ]
  @JSName("getComment")
  var getComment_Original: `176`
  
  def getEvent(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/issues/events/:event_id']['response'] */ js.Any
  ]
  def getEvent(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/issues/events/:event_id']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/issues/events/:event_id']['response'] */ js.Any
  ]
  @JSName("getEvent")
  var getEvent_Original: `177`
  
  def getLabel(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/labels/:name']['response'] */ js.Any
  ]
  def getLabel(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/labels/:name']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/labels/:name']['response'] */ js.Any
  ]
  @JSName("getLabel")
  var getLabel_Original: `178`
  
  def getMilestone(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/milestones/:milestone_number']['response'] */ js.Any
  ]
  def getMilestone(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/milestones/:milestone_number']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/milestones/:milestone_number']['response'] */ js.Any
  ]
  @JSName("getMilestone")
  var getMilestone_Original: `179`
  
  /**
    * The API returns a [`301 Moved Permanently` status](https://developer.github.com/v3/#http-redirects) if the issue was
    * [transferred](https://docs.github.com/articles/transferring-an-issue-to-another-repository/) to another repository. If
    * the issue was transferred to or deleted from a repository where the authenticated user lacks read access, the API
    * returns a `404 Not Found` status. If the issue was deleted from a repository where the authenticated user has read
    * access, the API returns a `410 Gone` status. To receive webhook events for transferred and deleted issues, subscribe
    * to the [`issues`](https://developer.github.com/webhooks/event-payloads/#issues) webhook.
    *
    * **Note**: GitHub's REST API v3 considers every pull request an issue, but not every issue is a pull request. For this
    * reason, "Issues" endpoints may return both issues and pull requests in the response. You can identify pull requests by
    * the `pull_request` key. Be aware that the `id` of a pull request returned from "Issues" endpoints will be an _issue id_. To find out the pull
    * request id, use the "[List pull requests](https://developer.github.com/v3/pulls/#list-pull-requests)" endpoint.
    */
  @JSName("get")
  var get_Original: `175`
  
  /**
    * List issues assigned to the authenticated user across all visible repositories including owned repositories, member
    * repositories, and organization repositories. You can use the `filter` query parameter to fetch issues that are not
    * necessarily assigned to you. See the [Parameters table](https://developer.github.com/v3/issues/#parameters) for more
    * information.
    *
    *
    * **Note**: GitHub's REST API v3 considers every pull request an issue, but not every issue is a pull request. For this
    * reason, "Issues" endpoints may return both issues and pull requests in the response. You can identify pull requests by
    * the `pull_request` key. Be aware that the `id` of a pull request returned from "Issues" endpoints will be an _issue id_. To find out the pull
    * request id, use the "[List pull requests](https://developer.github.com/v3/pulls/#list-pull-requests)" endpoint.
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
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/assignees']['response'] */ js.Any
  ]
  def listAssignees(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/assignees']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/assignees']['response'] */ js.Any
  ]
  /**
    * Lists the [available assignees](https://docs.github.com/articles/assigning-issues-and-pull-requests-to-other-github-users/) for issues in a repository.
    */
  @JSName("listAssignees")
  var listAssignees_Original: `181`
  
  /**
    * Issue Comments are ordered by ascending ID.
    */
  def listComments(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/issues/:issue_number/comments']['response'] */ js.Any
  ]
  def listComments(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/issues/:issue_number/comments']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/issues/:issue_number/comments']['response'] */ js.Any
  ]
  
  /**
    * By default, Issue Comments are ordered by ascending ID.
    */
  def listCommentsForRepo(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/issues/comments']['response'] */ js.Any
  ]
  def listCommentsForRepo(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/issues/comments']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/issues/comments']['response'] */ js.Any
  ]
  /**
    * By default, Issue Comments are ordered by ascending ID.
    */
  @JSName("listCommentsForRepo")
  var listCommentsForRepo_Original: `183`
  
  /**
    * Issue Comments are ordered by ascending ID.
    */
  @JSName("listComments")
  var listComments_Original: `182`
  
  def listEvents(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/issues/:issue_number/events']['response'] */ js.Any
  ]
  def listEvents(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/issues/:issue_number/events']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/issues/:issue_number/events']['response'] */ js.Any
  ]
  
  def listEventsForRepo(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/issues/events']['response'] */ js.Any
  ]
  def listEventsForRepo(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/issues/events']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/issues/events']['response'] */ js.Any
  ]
  @JSName("listEventsForRepo")
  var listEventsForRepo_Original: `185`
  
  def listEventsForTimeline(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/issues/:issue_number/timeline']['response'] */ js.Any
  ]
  def listEventsForTimeline(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/issues/:issue_number/timeline']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/issues/:issue_number/timeline']['response'] */ js.Any
  ]
  @JSName("listEventsForTimeline")
  var listEventsForTimeline_Original: `186`
  
  @JSName("listEvents")
  var listEvents_Original: `184`
  
  /**
    * List issues across owned and member repositories assigned to the authenticated user.
    *
    * **Note**: GitHub's REST API v3 considers every pull request an issue, but not every issue is a pull request. For this
    * reason, "Issues" endpoints may return both issues and pull requests in the response. You can identify pull requests by
    * the `pull_request` key. Be aware that the `id` of a pull request returned from "Issues" endpoints will be an _issue id_. To find out the pull
    * request id, use the "[List pull requests](https://developer.github.com/v3/pulls/#list-pull-requests)" endpoint.
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
    * **Note**: GitHub's REST API v3 considers every pull request an issue, but not every issue is a pull request. For this
    * reason, "Issues" endpoints may return both issues and pull requests in the response. You can identify pull requests by
    * the `pull_request` key. Be aware that the `id` of a pull request returned from "Issues" endpoints will be an _issue id_. To find out the pull
    * request id, use the "[List pull requests](https://developer.github.com/v3/pulls/#list-pull-requests)" endpoint.
    */
  @JSName("listForAuthenticatedUser")
  var listForAuthenticatedUser_Original: `187`
  
  /**
    * List issues in an organization assigned to the authenticated user.
    *
    * **Note**: GitHub's REST API v3 considers every pull request an issue, but not every issue is a pull request. For this
    * reason, "Issues" endpoints may return both issues and pull requests in the response. You can identify pull requests by
    * the `pull_request` key. Be aware that the `id` of a pull request returned from "Issues" endpoints will be an _issue id_. To find out the pull
    * request id, use the "[List pull requests](https://developer.github.com/v3/pulls/#list-pull-requests)" endpoint.
    */
  def listForOrg(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/:org/issues']['response'] */ js.Any
  ]
  def listForOrg(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/:org/issues']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/:org/issues']['response'] */ js.Any
  ]
  /**
    * List issues in an organization assigned to the authenticated user.
    *
    * **Note**: GitHub's REST API v3 considers every pull request an issue, but not every issue is a pull request. For this
    * reason, "Issues" endpoints may return both issues and pull requests in the response. You can identify pull requests by
    * the `pull_request` key. Be aware that the `id` of a pull request returned from "Issues" endpoints will be an _issue id_. To find out the pull
    * request id, use the "[List pull requests](https://developer.github.com/v3/pulls/#list-pull-requests)" endpoint.
    */
  @JSName("listForOrg")
  var listForOrg_Original: `188`
  
  /**
    * List issues in a repository.
    *
    * **Note**: GitHub's REST API v3 considers every pull request an issue, but not every issue is a pull request. For this
    * reason, "Issues" endpoints may return both issues and pull requests in the response. You can identify pull requests by
    * the `pull_request` key. Be aware that the `id` of a pull request returned from "Issues" endpoints will be an _issue id_. To find out the pull
    * request id, use the "[List pull requests](https://developer.github.com/v3/pulls/#list-pull-requests)" endpoint.
    */
  def listForRepo(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/issues']['response'] */ js.Any
  ]
  def listForRepo(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/issues']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/issues']['response'] */ js.Any
  ]
  /**
    * List issues in a repository.
    *
    * **Note**: GitHub's REST API v3 considers every pull request an issue, but not every issue is a pull request. For this
    * reason, "Issues" endpoints may return both issues and pull requests in the response. You can identify pull requests by
    * the `pull_request` key. Be aware that the `id` of a pull request returned from "Issues" endpoints will be an _issue id_. To find out the pull
    * request id, use the "[List pull requests](https://developer.github.com/v3/pulls/#list-pull-requests)" endpoint.
    */
  @JSName("listForRepo")
  var listForRepo_Original: `189`
  
  def listLabelsForMilestone(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/milestones/:milestone_number/labels']['response'] */ js.Any
  ]
  def listLabelsForMilestone(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/milestones/:milestone_number/labels']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/milestones/:milestone_number/labels']['response'] */ js.Any
  ]
  @JSName("listLabelsForMilestone")
  var listLabelsForMilestone_Original: `190`
  
  def listLabelsForRepo(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/labels']['response'] */ js.Any
  ]
  def listLabelsForRepo(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/labels']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/labels']['response'] */ js.Any
  ]
  @JSName("listLabelsForRepo")
  var listLabelsForRepo_Original: `191`
  
  def listLabelsOnIssue(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/issues/:issue_number/labels']['response'] */ js.Any
  ]
  def listLabelsOnIssue(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/issues/:issue_number/labels']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/issues/:issue_number/labels']['response'] */ js.Any
  ]
  @JSName("listLabelsOnIssue")
  var listLabelsOnIssue_Original: `192`
  
  def listMilestones(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/milestones']['response'] */ js.Any
  ]
  def listMilestones(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/milestones']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/milestones']['response'] */ js.Any
  ]
  @JSName("listMilestones")
  var listMilestones_Original: `193`
  
  /**
    * List issues assigned to the authenticated user across all visible repositories including owned repositories, member
    * repositories, and organization repositories. You can use the `filter` query parameter to fetch issues that are not
    * necessarily assigned to you. See the [Parameters table](https://developer.github.com/v3/issues/#parameters) for more
    * information.
    *
    *
    * **Note**: GitHub's REST API v3 considers every pull request an issue, but not every issue is a pull request. For this
    * reason, "Issues" endpoints may return both issues and pull requests in the response. You can identify pull requests by
    * the `pull_request` key. Be aware that the `id` of a pull request returned from "Issues" endpoints will be an _issue id_. To find out the pull
    * request id, use the "[List pull requests](https://developer.github.com/v3/pulls/#list-pull-requests)" endpoint.
    */
  @JSName("list")
  var list_Original: `180`
  
  /**
    * Users with push access can lock an issue or pull request's conversation.
    *
    * Note that, if you choose not to pass any parameters, you'll need to set `Content-Length` to zero when calling out to this endpoint. For more information, see "[HTTP verbs](https://developer.github.com/v3/#http-verbs)."
    */
  def lock(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/:owner/:repo/issues/:issue_number/lock']['response'] */ js.Any
  ]
  def lock(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/:owner/:repo/issues/:issue_number/lock']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/:owner/:repo/issues/:issue_number/lock']['response'] */ js.Any
  ]
  /**
    * Users with push access can lock an issue or pull request's conversation.
    *
    * Note that, if you choose not to pass any parameters, you'll need to set `Content-Length` to zero when calling out to this endpoint. For more information, see "[HTTP verbs](https://developer.github.com/v3/#http-verbs)."
    */
  @JSName("lock")
  var lock_Original: `194`
  
  def removeAllLabels(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo/issues/:issue_number/labels']['response'] */ js.Any
  ]
  def removeAllLabels(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo/issues/:issue_number/labels']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo/issues/:issue_number/labels']['response'] */ js.Any
  ]
  @JSName("removeAllLabels")
  var removeAllLabels_Original: `195`
  
  /**
    * Removes one or more assignees from an issue.
    */
  def removeAssignees(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo/issues/:issue_number/assignees']['response'] */ js.Any
  ]
  def removeAssignees(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo/issues/:issue_number/assignees']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo/issues/:issue_number/assignees']['response'] */ js.Any
  ]
  /**
    * Removes one or more assignees from an issue.
    */
  @JSName("removeAssignees")
  var removeAssignees_Original: `196`
  
  /**
    * Removes the specified label from the issue, and returns the remaining labels on the issue. This endpoint returns a `404 Not Found` status if the label does not exist.
    */
  def removeLabel(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo/issues/:issue_number/labels/:name']['response'] */ js.Any
  ]
  def removeLabel(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo/issues/:issue_number/labels/:name']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo/issues/:issue_number/labels/:name']['response'] */ js.Any
  ]
  /**
    * Removes the specified label from the issue, and returns the remaining labels on the issue. This endpoint returns a `404 Not Found` status if the label does not exist.
    */
  @JSName("removeLabel")
  var removeLabel_Original: `197`
  
  /**
    * Removes any previous labels and sets the new labels for an issue.
    */
  def setLabels(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/:owner/:repo/issues/:issue_number/labels']['response'] */ js.Any
  ]
  def setLabels(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/:owner/:repo/issues/:issue_number/labels']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/:owner/:repo/issues/:issue_number/labels']['response'] */ js.Any
  ]
  /**
    * Removes any previous labels and sets the new labels for an issue.
    */
  @JSName("setLabels")
  var setLabels_Original: `198`
  
  /**
    * Users with push access can unlock an issue's conversation.
    */
  def unlock(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo/issues/:issue_number/lock']['response'] */ js.Any
  ]
  def unlock(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo/issues/:issue_number/lock']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo/issues/:issue_number/lock']['response'] */ js.Any
  ]
  /**
    * Users with push access can unlock an issue's conversation.
    */
  @JSName("unlock")
  var unlock_Original: `199`
  
  /**
    * Issue owners and users with push access can edit an issue.
    */
  def update(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /repos/:owner/:repo/issues/:issue_number']['response'] */ js.Any
  ]
  def update(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /repos/:owner/:repo/issues/:issue_number']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /repos/:owner/:repo/issues/:issue_number']['response'] */ js.Any
  ]
  
  def updateComment(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /repos/:owner/:repo/issues/comments/:comment_id']['response'] */ js.Any
  ]
  def updateComment(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /repos/:owner/:repo/issues/comments/:comment_id']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /repos/:owner/:repo/issues/comments/:comment_id']['response'] */ js.Any
  ]
  @JSName("updateComment")
  var updateComment_Original: `201`
  
  def updateLabel(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /repos/:owner/:repo/labels/:name']['response'] */ js.Any
  ]
  def updateLabel(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /repos/:owner/:repo/labels/:name']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /repos/:owner/:repo/labels/:name']['response'] */ js.Any
  ]
  @JSName("updateLabel")
  var updateLabel_Original: `202`
  
  def updateMilestone(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /repos/:owner/:repo/milestones/:milestone_number']['response'] */ js.Any
  ]
  def updateMilestone(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /repos/:owner/:repo/milestones/:milestone_number']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /repos/:owner/:repo/milestones/:milestone_number']['response'] */ js.Any
  ]
  @JSName("updateMilestone")
  var updateMilestone_Original: `203`
  
  /**
    * Issue owners and users with push access can edit an issue.
    */
  @JSName("update")
  var update_Original: `200`
}
object AddAssignees {
  
  @scala.inline
  def apply(
    addAssignees: `165`,
    addLabels: `166`,
    checkUserCanBeAssigned: `167`,
    create: `168`,
    createComment: `169`,
    createLabel: `170`,
    createMilestone: `171`,
    deleteComment: `172`,
    deleteLabel: `173`,
    deleteMilestone: `174`,
    get: `175`,
    getComment: `176`,
    getEvent: `177`,
    getLabel: `178`,
    getMilestone: `179`,
    list: `180`,
    listAssignees: `181`,
    listComments: `182`,
    listCommentsForRepo: `183`,
    listEvents: `184`,
    listEventsForRepo: `185`,
    listEventsForTimeline: `186`,
    listForAuthenticatedUser: `187`,
    listForOrg: `188`,
    listForRepo: `189`,
    listLabelsForMilestone: `190`,
    listLabelsForRepo: `191`,
    listLabelsOnIssue: `192`,
    listMilestones: `193`,
    lock: `194`,
    removeAllLabels: `195`,
    removeAssignees: `196`,
    removeLabel: `197`,
    setLabels: `198`,
    unlock: `199`,
    update: `200`,
    updateComment: `201`,
    updateLabel: `202`,
    updateMilestone: `203`
  ): AddAssignees = {
    val __obj = js.Dynamic.literal(addAssignees = addAssignees.asInstanceOf[js.Any], addLabels = addLabels.asInstanceOf[js.Any], checkUserCanBeAssigned = checkUserCanBeAssigned.asInstanceOf[js.Any], create = create.asInstanceOf[js.Any], createComment = createComment.asInstanceOf[js.Any], createLabel = createLabel.asInstanceOf[js.Any], createMilestone = createMilestone.asInstanceOf[js.Any], deleteComment = deleteComment.asInstanceOf[js.Any], deleteLabel = deleteLabel.asInstanceOf[js.Any], deleteMilestone = deleteMilestone.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], getComment = getComment.asInstanceOf[js.Any], getEvent = getEvent.asInstanceOf[js.Any], getLabel = getLabel.asInstanceOf[js.Any], getMilestone = getMilestone.asInstanceOf[js.Any], list = list.asInstanceOf[js.Any], listAssignees = listAssignees.asInstanceOf[js.Any], listComments = listComments.asInstanceOf[js.Any], listCommentsForRepo = listCommentsForRepo.asInstanceOf[js.Any], listEvents = listEvents.asInstanceOf[js.Any], listEventsForRepo = listEventsForRepo.asInstanceOf[js.Any], listEventsForTimeline = listEventsForTimeline.asInstanceOf[js.Any], listForAuthenticatedUser = listForAuthenticatedUser.asInstanceOf[js.Any], listForOrg = listForOrg.asInstanceOf[js.Any], listForRepo = listForRepo.asInstanceOf[js.Any], listLabelsForMilestone = listLabelsForMilestone.asInstanceOf[js.Any], listLabelsForRepo = listLabelsForRepo.asInstanceOf[js.Any], listLabelsOnIssue = listLabelsOnIssue.asInstanceOf[js.Any], listMilestones = listMilestones.asInstanceOf[js.Any], lock = lock.asInstanceOf[js.Any], removeAllLabels = removeAllLabels.asInstanceOf[js.Any], removeAssignees = removeAssignees.asInstanceOf[js.Any], removeLabel = removeLabel.asInstanceOf[js.Any], setLabels = setLabels.asInstanceOf[js.Any], unlock = unlock.asInstanceOf[js.Any], update = update.asInstanceOf[js.Any], updateComment = updateComment.asInstanceOf[js.Any], updateLabel = updateLabel.asInstanceOf[js.Any], updateMilestone = updateMilestone.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddAssignees]
  }
  
  @scala.inline
  implicit class AddAssigneesMutableBuilder[Self <: AddAssignees] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddAssignees(value: `165`): Self = StObject.set(x, "addAssignees", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddLabels(value: `166`): Self = StObject.set(x, "addLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckUserCanBeAssigned(value: `167`): Self = StObject.set(x, "checkUserCanBeAssigned", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreate(value: `168`): Self = StObject.set(x, "create", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateComment(value: `169`): Self = StObject.set(x, "createComment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateLabel(value: `170`): Self = StObject.set(x, "createLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateMilestone(value: `171`): Self = StObject.set(x, "createMilestone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteComment(value: `172`): Self = StObject.set(x, "deleteComment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteLabel(value: `173`): Self = StObject.set(x, "deleteLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteMilestone(value: `174`): Self = StObject.set(x, "deleteMilestone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGet(value: `175`): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetComment(value: `176`): Self = StObject.set(x, "getComment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetEvent(value: `177`): Self = StObject.set(x, "getEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetLabel(value: `178`): Self = StObject.set(x, "getLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetMilestone(value: `179`): Self = StObject.set(x, "getMilestone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setList(value: `180`): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListAssignees(value: `181`): Self = StObject.set(x, "listAssignees", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListComments(value: `182`): Self = StObject.set(x, "listComments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListCommentsForRepo(value: `183`): Self = StObject.set(x, "listCommentsForRepo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListEvents(value: `184`): Self = StObject.set(x, "listEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListEventsForRepo(value: `185`): Self = StObject.set(x, "listEventsForRepo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListEventsForTimeline(value: `186`): Self = StObject.set(x, "listEventsForTimeline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListForAuthenticatedUser(value: `187`): Self = StObject.set(x, "listForAuthenticatedUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListForOrg(value: `188`): Self = StObject.set(x, "listForOrg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListForRepo(value: `189`): Self = StObject.set(x, "listForRepo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListLabelsForMilestone(value: `190`): Self = StObject.set(x, "listLabelsForMilestone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListLabelsForRepo(value: `191`): Self = StObject.set(x, "listLabelsForRepo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListLabelsOnIssue(value: `192`): Self = StObject.set(x, "listLabelsOnIssue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListMilestones(value: `193`): Self = StObject.set(x, "listMilestones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLock(value: `194`): Self = StObject.set(x, "lock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveAllLabels(value: `195`): Self = StObject.set(x, "removeAllLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveAssignees(value: `196`): Self = StObject.set(x, "removeAssignees", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveLabel(value: `197`): Self = StObject.set(x, "removeLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetLabels(value: `198`): Self = StObject.set(x, "setLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnlock(value: `199`): Self = StObject.set(x, "unlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdate(value: `200`): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateComment(value: `201`): Self = StObject.set(x, "updateComment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateLabel(value: `202`): Self = StObject.set(x, "updateLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateMilestone(value: `203`): Self = StObject.set(x, "updateMilestone", value.asInstanceOf[js.Any])
  }
}
