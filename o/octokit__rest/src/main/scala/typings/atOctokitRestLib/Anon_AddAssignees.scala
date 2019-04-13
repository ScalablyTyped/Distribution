package typings
package atOctokitRestLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_AddAssignees extends js.Object {
  /**
    * Adds up to 10 assignees to an issue. Users already assigned to an issue are not replaced.,* ,* This example adds two assignees to the existing `octocat` assignee.
    */
  @JSName("addAssignees")
  var addAssignees_Original: Anon_EndpointParamsIssuesAddAssigneesParams = js.native
  @JSName("addLabels")
  var addLabels_Original: Anon_EndpointParamsIssuesAddLabelsParams = js.native
  /**
    * Checks if a user has permission to be assigned to an issue in this repository.,* ,* If the `assignee` can be assigned to issues in the repository, a `204` header with no content is returned.,* ,* Otherwise a `404` status code is returned.
    */
  @JSName("checkAssignee")
  var checkAssignee_Original: Anon_EndpointParamsIssuesCheckAssigneeParams = js.native
  /**
    * This endpoint triggers [notifications](https://help.github.com/articles/about-notifications/). Creating content too quickly using this endpoint may result in abuse rate limiting. See "[Abuse rate limits](https://developer.github.com/v3/#abuse-rate-limits)" and "[Dealing with abuse rate limits](https://developer.github.com/v3/guides/best-practices-for-integrators/#dealing-with-abuse-rate-limits)" for details.
    */
  @JSName("createComment")
  var createComment_Original: Anon_EndpointParamsIssuesCreateCommentParams = js.native
  @JSName("createLabel")
  var createLabel_Original: Anon_EndpointParamsIssuesCreateLabelParams = js.native
  @JSName("createMilestone")
  var createMilestone_Original: Anon_EndpointParamsIssuesCreateMilestoneParams = js.native
  /**
    * Any user with pull access to a repository can create an issue. If [issues are disabled in the repository](https://help.github.com/articles/disabling-issues/), the API returns a `410 Gone` status.,* ,* This endpoint triggers [notifications](https://help.github.com/articles/about-notifications/). Creating content too quickly using this endpoint may result in abuse rate limiting. See "[Abuse rate limits](https://developer.github.com/v3/#abuse-rate-limits)" and "[Dealing with abuse rate limits](https://developer.github.com/v3/guides/best-practices-for-integrators/#dealing-with-abuse-rate-limits)" for details.
    */
  @JSName("create")
  var create_Original: Anon_EndpointParamsIssuesCreateParams = js.native
  @JSName("deleteComment")
  var deleteComment_Original: Anon_EndpointParamsIssuesDeleteCommentParams = js.native
  @JSName("deleteLabel")
  var deleteLabel_Original: Anon_EndpointParamsIssuesDeleteLabelParams = js.native
  @JSName("deleteMilestone")
  var deleteMilestone_Original: Anon_EndpointParamsIssuesDeleteMilestoneParams = js.native
  @JSName("getComment")
  var getComment_Original: Anon_EndpointParamsIssuesGetCommentParams = js.native
  @JSName("getEvent")
  var getEvent_Original: Anon_EndpointParamsIssuesGetEventParams = js.native
  @JSName("getLabel")
  var getLabel_Original: Anon_EndpointParamsIssuesGetLabelParams = js.native
  @JSName("getMilestone")
  var getMilestone_Original: Anon_EndpointParamsIssuesGetMilestoneParams = js.native
  /**
    * The API returns a [`301 Moved Permanently` status](https://developer.github.com/v3/#http-redirects) if the issue was [transferred](https://help.github.com/articles/transferring-an-issue-to-another-repository/) to another repository. If the issue was transferred to or deleted from a repository where the authenticated user lacks read access, the API returns a `404 Not Found` status. If the issue was deleted from a repository where the authenticated user has read access, the API returns a `410 Gone` status. To receive webhook events for transferred and deleted issues, subscribe to the [`issues`](https://developer.github.com/v3/activity/events/types/#issuesevent) webhook.,* ,* **Note**: GitHub's REST API v3 considers every pull request an issue, but not every issue is a pull request. For this reason, "Issues" endpoints may return both issues and pull requests in the response. You can identify pull requests by the `pull_request` key.,* ,* Be aware that the `id` of a pull request returned from "Issues" endpoints will be an _issue id_. To find out the pull request id, use the "[List pull requests](https://developer.github.com/v3/pulls/#list-pull-requests)" endpoint.,* ,*
    */
  @JSName("get")
  var get_Original: Anon_EndpointParamsIssuesGetParams = js.native
  /**
    * Lists the [available assignees](https://help.github.com/articles/assigning-issues-and-pull-requests-to-other-github-users/) for issues in a repository.
    */
  @JSName("listAssignees")
  var listAssignees_Original: Anon_EndpointParamsIssuesListAssigneesParams = js.native
  /**
    * By default, Issue Comments are ordered by ascending ID.,* ,*
    */
  @JSName("listCommentsForRepo")
  var listCommentsForRepo_Original: Anon_EndpointParamsIssuesListCommentsForRepoParams = js.native
  /**
    * Issue Comments are ordered by ascending ID.,* ,*
    */
  @JSName("listComments")
  var listComments_Original: Anon_EndpointParamsIssuesListCommentsParams = js.native
  @JSName("listEventsForRepo")
  var listEventsForRepo_Original: Anon_EndpointParamsIssuesListEventsForRepoParams = js.native
  @JSName("listEventsForTimeline")
  var listEventsForTimeline_Original: Anon_EndpointParamsIssuesListEventsForTimelineParams = js.native
  @JSName("listEvents")
  var listEvents_Original: Anon_EndpointParamsIssuesListEventsParams = js.native
  /**
    * **Note**: GitHub's REST API v3 considers every pull request an issue, but not every issue is a pull request. For this reason, "Issues" endpoints may return both issues and pull requests in the response. You can identify pull requests by the `pull_request` key.,* ,* Be aware that the `id` of a pull request returned from "Issues" endpoints will be an _issue id_. To find out the pull request id, use the "[List pull requests](https://developer.github.com/v3/pulls/#list-pull-requests)" endpoint.,* ,*
    */
  @JSName("listForAuthenticatedUser")
  var listForAuthenticatedUser_Original: Anon_EndpointParamsIssuesListForAuthenticatedUserParams = js.native
  /**
    * **Note**: GitHub's REST API v3 considers every pull request an issue, but not every issue is a pull request. For this reason, "Issues" endpoints may return both issues and pull requests in the response. You can identify pull requests by the `pull_request` key.,* ,* Be aware that the `id` of a pull request returned from "Issues" endpoints will be an _issue id_. To find out the pull request id, use the "[List pull requests](https://developer.github.com/v3/pulls/#list-pull-requests)" endpoint.,* ,*
    */
  @JSName("listForOrg")
  var listForOrg_Original: Anon_EndpointParamsIssuesListForOrgParams = js.native
  /**
    * **Note**: GitHub's REST API v3 considers every pull request an issue, but not every issue is a pull request. For this reason, "Issues" endpoints may return both issues and pull requests in the response. You can identify pull requests by the `pull_request` key.,* ,* Be aware that the `id` of a pull request returned from "Issues" endpoints will be an _issue id_. To find out the pull request id, use the "[List pull requests](https://developer.github.com/v3/pulls/#list-pull-requests)" endpoint.,* ,*
    */
  @JSName("listForRepo")
  var listForRepo_Original: Anon_EndpointParamsIssuesListForRepoParams = js.native
  @JSName("listLabelsForMilestone")
  var listLabelsForMilestone_Original: Anon_EndpointParamsIssuesListLabelsForMilestoneParams = js.native
  @JSName("listLabelsForRepo")
  var listLabelsForRepo_Original: Anon_EndpointParamsIssuesListLabelsForRepoParams = js.native
  @JSName("listLabelsOnIssue")
  var listLabelsOnIssue_Original: Anon_EndpointParamsIssuesListLabelsOnIssueParams = js.native
  @JSName("listMilestonesForRepo")
  var listMilestonesForRepo_Original: Anon_EndpointParamsIssuesListMilestonesForRepoParams = js.native
  /**
    * **Note**: GitHub's REST API v3 considers every pull request an issue, but not every issue is a pull request. For this reason, "Issues" endpoints may return both issues and pull requests in the response. You can identify pull requests by the `pull_request` key.,* ,* Be aware that the `id` of a pull request returned from "Issues" endpoints will be an _issue id_. To find out the pull request id, use the "[List pull requests](https://developer.github.com/v3/pulls/#list-pull-requests)" endpoint.,* ,*
    */
  @JSName("list")
  var list_Original: Anon_EndpointParamsIssuesListParams = js.native
  /**
    * Users with push access can lock an issue or pull request's conversation.,* ,* Note that, if you choose not to pass any parameters, you'll need to set `Content-Length` to zero when calling out to this endpoint. For more information, see "[HTTP verbs](https://developer.github.com/v3/#http-verbs)."
    */
  @JSName("lock")
  var lock_Original: Anon_EndpointParamsIssuesLockParams = js.native
  /**
    * Removes one or more assignees from an issue.,* ,* This example removes two of three assignees, leaving the `octocat` assignee.
    */
  @JSName("removeAssignees")
  var removeAssignees_Original: Anon_EndpointParamsIssuesRemoveAssigneesParams = js.native
  /**
    * Removes the specified label from the issue, and returns the remaining labels on the issue. This endpoint returns a `404 Not Found` status if the label does not exist.
    */
  @JSName("removeLabel")
  var removeLabel_Original: Anon_EndpointParamsIssuesRemoveLabelParams = js.native
  @JSName("removeLabels")
  var removeLabels_Original: Anon_EndpointParamsIssuesRemoveLabelsParams = js.native
  @JSName("replaceLabels")
  var replaceLabels_Original: Anon_EndpointParamsIssuesReplaceLabelsParams = js.native
  /**
    * Users with push access can unlock an issue's conversation.
    */
  @JSName("unlock")
  var unlock_Original: Anon_EndpointParamsIssuesUnlockParams = js.native
  @JSName("updateComment")
  var updateComment_Original: Anon_EndpointParamsIssuesUpdateCommentParams = js.native
  @JSName("updateLabel")
  var updateLabel_Original: Anon_EndpointParamsIssuesUpdateLabelParams = js.native
  @JSName("updateMilestone")
  var updateMilestone_Original: Anon_EndpointParamsIssuesUpdateMilestoneParams = js.native
  /**
    * Issue owners and users with push access can edit an issue.
    */
  @JSName("update")
  var update_Original: Anon_EndpointParamsIssuesUpdateParams = js.native
  /**
    * Adds up to 10 assignees to an issue. Users already assigned to an issue are not replaced.,* ,* This example adds two assignees to the existing `octocat` assignee.
    */
  def addAssignees(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.IssuesAddAssigneesResponse]
  ] = js.native
  def addAssignees(params: atOctokitRestLib.atOctokitRestMod.IssuesAddAssigneesParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.IssuesAddAssigneesResponse]
  ] = js.native
  def addLabels(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.IssuesAddLabelsResponse]
  ] = js.native
  def addLabels(params: atOctokitRestLib.atOctokitRestMod.IssuesAddLabelsParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.IssuesAddLabelsResponse]
  ] = js.native
  /**
    * Checks if a user has permission to be assigned to an issue in this repository.,* ,* If the `assignee` can be assigned to issues in the repository, a `204` header with no content is returned.,* ,* Otherwise a `404` status code is returned.
    */
  def checkAssignee(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.IssuesCheckAssigneeResponse]
  ] = js.native
  def checkAssignee(params: atOctokitRestLib.atOctokitRestMod.IssuesCheckAssigneeParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.IssuesCheckAssigneeResponse]
  ] = js.native
  /**
    * Any user with pull access to a repository can create an issue. If [issues are disabled in the repository](https://help.github.com/articles/disabling-issues/), the API returns a `410 Gone` status.,* ,* This endpoint triggers [notifications](https://help.github.com/articles/about-notifications/). Creating content too quickly using this endpoint may result in abuse rate limiting. See "[Abuse rate limits](https://developer.github.com/v3/#abuse-rate-limits)" and "[Dealing with abuse rate limits](https://developer.github.com/v3/guides/best-practices-for-integrators/#dealing-with-abuse-rate-limits)" for details.
    */
  def create(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.IssuesCreateResponse]
  ] = js.native
  def create(params: atOctokitRestLib.atOctokitRestMod.IssuesCreateParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.IssuesCreateResponse]
  ] = js.native
  /**
    * This endpoint triggers [notifications](https://help.github.com/articles/about-notifications/). Creating content too quickly using this endpoint may result in abuse rate limiting. See "[Abuse rate limits](https://developer.github.com/v3/#abuse-rate-limits)" and "[Dealing with abuse rate limits](https://developer.github.com/v3/guides/best-practices-for-integrators/#dealing-with-abuse-rate-limits)" for details.
    */
  def createComment(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.IssuesCreateCommentResponse]
  ] = js.native
  def createComment(params: atOctokitRestLib.atOctokitRestMod.IssuesCreateCommentParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.IssuesCreateCommentResponse]
  ] = js.native
  def createLabel(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.IssuesCreateLabelResponse]
  ] = js.native
  def createLabel(params: atOctokitRestLib.atOctokitRestMod.IssuesCreateLabelParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.IssuesCreateLabelResponse]
  ] = js.native
  def createMilestone(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.IssuesCreateMilestoneResponse]
  ] = js.native
  def createMilestone(params: atOctokitRestLib.atOctokitRestMod.IssuesCreateMilestoneParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.IssuesCreateMilestoneResponse]
  ] = js.native
  def deleteComment(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.IssuesDeleteCommentResponse]
  ] = js.native
  def deleteComment(params: atOctokitRestLib.atOctokitRestMod.IssuesDeleteCommentParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.IssuesDeleteCommentResponse]
  ] = js.native
  def deleteLabel(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.IssuesDeleteLabelResponse]
  ] = js.native
  def deleteLabel(params: atOctokitRestLib.atOctokitRestMod.IssuesDeleteLabelParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.IssuesDeleteLabelResponse]
  ] = js.native
  def deleteMilestone(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.IssuesDeleteMilestoneResponse]
  ] = js.native
  def deleteMilestone(params: atOctokitRestLib.atOctokitRestMod.IssuesDeleteMilestoneParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.IssuesDeleteMilestoneResponse]
  ] = js.native
  /**
    * The API returns a [`301 Moved Permanently` status](https://developer.github.com/v3/#http-redirects) if the issue was [transferred](https://help.github.com/articles/transferring-an-issue-to-another-repository/) to another repository. If the issue was transferred to or deleted from a repository where the authenticated user lacks read access, the API returns a `404 Not Found` status. If the issue was deleted from a repository where the authenticated user has read access, the API returns a `410 Gone` status. To receive webhook events for transferred and deleted issues, subscribe to the [`issues`](https://developer.github.com/v3/activity/events/types/#issuesevent) webhook.,* ,* **Note**: GitHub's REST API v3 considers every pull request an issue, but not every issue is a pull request. For this reason, "Issues" endpoints may return both issues and pull requests in the response. You can identify pull requests by the `pull_request` key.,* ,* Be aware that the `id` of a pull request returned from "Issues" endpoints will be an _issue id_. To find out the pull request id, use the "[List pull requests](https://developer.github.com/v3/pulls/#list-pull-requests)" endpoint.,* ,*
    */
  def get(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.IssuesGetResponse]
  ] = js.native
  def get(params: atOctokitRestLib.atOctokitRestMod.IssuesGetParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.IssuesGetResponse]
  ] = js.native
  def getComment(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.IssuesGetCommentResponse]
  ] = js.native
  def getComment(params: atOctokitRestLib.atOctokitRestMod.IssuesGetCommentParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.IssuesGetCommentResponse]
  ] = js.native
  def getEvent(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.IssuesGetEventResponse]
  ] = js.native
  def getEvent(params: atOctokitRestLib.atOctokitRestMod.IssuesGetEventParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.IssuesGetEventResponse]
  ] = js.native
  def getLabel(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.IssuesGetLabelResponse]
  ] = js.native
  def getLabel(params: atOctokitRestLib.atOctokitRestMod.IssuesGetLabelParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.IssuesGetLabelResponse]
  ] = js.native
  def getMilestone(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.IssuesGetMilestoneResponse]
  ] = js.native
  def getMilestone(params: atOctokitRestLib.atOctokitRestMod.IssuesGetMilestoneParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.IssuesGetMilestoneResponse]
  ] = js.native
  /**
    * **Note**: GitHub's REST API v3 considers every pull request an issue, but not every issue is a pull request. For this reason, "Issues" endpoints may return both issues and pull requests in the response. You can identify pull requests by the `pull_request` key.,* ,* Be aware that the `id` of a pull request returned from "Issues" endpoints will be an _issue id_. To find out the pull request id, use the "[List pull requests](https://developer.github.com/v3/pulls/#list-pull-requests)" endpoint.,* ,*
    */
  def list(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.IssuesListResponse]
  ] = js.native
  def list(params: atOctokitRestLib.atOctokitRestMod.IssuesListParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.IssuesListResponse]
  ] = js.native
  /**
    * Lists the [available assignees](https://help.github.com/articles/assigning-issues-and-pull-requests-to-other-github-users/) for issues in a repository.
    */
  def listAssignees(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.IssuesListAssigneesResponse]
  ] = js.native
  def listAssignees(params: atOctokitRestLib.atOctokitRestMod.IssuesListAssigneesParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.IssuesListAssigneesResponse]
  ] = js.native
  /**
    * Issue Comments are ordered by ascending ID.,* ,*
    */
  def listComments(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.IssuesListCommentsResponse]
  ] = js.native
  def listComments(params: atOctokitRestLib.atOctokitRestMod.IssuesListCommentsParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.IssuesListCommentsResponse]
  ] = js.native
  /**
    * By default, Issue Comments are ordered by ascending ID.,* ,*
    */
  def listCommentsForRepo(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.IssuesListCommentsForRepoResponse]
  ] = js.native
  def listCommentsForRepo(params: atOctokitRestLib.atOctokitRestMod.IssuesListCommentsForRepoParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.IssuesListCommentsForRepoResponse]
  ] = js.native
  def listEvents(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.IssuesListEventsResponse]
  ] = js.native
  def listEvents(params: atOctokitRestLib.atOctokitRestMod.IssuesListEventsParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.IssuesListEventsResponse]
  ] = js.native
  def listEventsForRepo(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.IssuesListEventsForRepoResponse]
  ] = js.native
  def listEventsForRepo(params: atOctokitRestLib.atOctokitRestMod.IssuesListEventsForRepoParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.IssuesListEventsForRepoResponse]
  ] = js.native
  def listEventsForTimeline(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.IssuesListEventsForTimelineResponse]
  ] = js.native
  def listEventsForTimeline(params: atOctokitRestLib.atOctokitRestMod.IssuesListEventsForTimelineParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.IssuesListEventsForTimelineResponse]
  ] = js.native
  /**
    * **Note**: GitHub's REST API v3 considers every pull request an issue, but not every issue is a pull request. For this reason, "Issues" endpoints may return both issues and pull requests in the response. You can identify pull requests by the `pull_request` key.,* ,* Be aware that the `id` of a pull request returned from "Issues" endpoints will be an _issue id_. To find out the pull request id, use the "[List pull requests](https://developer.github.com/v3/pulls/#list-pull-requests)" endpoint.,* ,*
    */
  def listForAuthenticatedUser(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.IssuesListForAuthenticatedUserResponse]
  ] = js.native
  def listForAuthenticatedUser(params: atOctokitRestLib.atOctokitRestMod.IssuesListForAuthenticatedUserParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.IssuesListForAuthenticatedUserResponse]
  ] = js.native
  /**
    * **Note**: GitHub's REST API v3 considers every pull request an issue, but not every issue is a pull request. For this reason, "Issues" endpoints may return both issues and pull requests in the response. You can identify pull requests by the `pull_request` key.,* ,* Be aware that the `id` of a pull request returned from "Issues" endpoints will be an _issue id_. To find out the pull request id, use the "[List pull requests](https://developer.github.com/v3/pulls/#list-pull-requests)" endpoint.,* ,*
    */
  def listForOrg(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.IssuesListForOrgResponse]
  ] = js.native
  def listForOrg(params: atOctokitRestLib.atOctokitRestMod.IssuesListForOrgParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.IssuesListForOrgResponse]
  ] = js.native
  /**
    * **Note**: GitHub's REST API v3 considers every pull request an issue, but not every issue is a pull request. For this reason, "Issues" endpoints may return both issues and pull requests in the response. You can identify pull requests by the `pull_request` key.,* ,* Be aware that the `id` of a pull request returned from "Issues" endpoints will be an _issue id_. To find out the pull request id, use the "[List pull requests](https://developer.github.com/v3/pulls/#list-pull-requests)" endpoint.,* ,*
    */
  def listForRepo(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.IssuesListForRepoResponse]
  ] = js.native
  def listForRepo(params: atOctokitRestLib.atOctokitRestMod.IssuesListForRepoParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.IssuesListForRepoResponse]
  ] = js.native
  def listLabelsForMilestone(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.IssuesListLabelsForMilestoneResponse]
  ] = js.native
  def listLabelsForMilestone(params: atOctokitRestLib.atOctokitRestMod.IssuesListLabelsForMilestoneParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.IssuesListLabelsForMilestoneResponse]
  ] = js.native
  def listLabelsForRepo(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.IssuesListLabelsForRepoResponse]
  ] = js.native
  def listLabelsForRepo(params: atOctokitRestLib.atOctokitRestMod.IssuesListLabelsForRepoParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.IssuesListLabelsForRepoResponse]
  ] = js.native
  def listLabelsOnIssue(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.IssuesListLabelsOnIssueResponse]
  ] = js.native
  def listLabelsOnIssue(params: atOctokitRestLib.atOctokitRestMod.IssuesListLabelsOnIssueParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.IssuesListLabelsOnIssueResponse]
  ] = js.native
  def listMilestonesForRepo(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.IssuesListMilestonesForRepoResponse]
  ] = js.native
  def listMilestonesForRepo(params: atOctokitRestLib.atOctokitRestMod.IssuesListMilestonesForRepoParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.IssuesListMilestonesForRepoResponse]
  ] = js.native
  /**
    * Users with push access can lock an issue or pull request's conversation.,* ,* Note that, if you choose not to pass any parameters, you'll need to set `Content-Length` to zero when calling out to this endpoint. For more information, see "[HTTP verbs](https://developer.github.com/v3/#http-verbs)."
    */
  def lock(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.IssuesLockResponse]
  ] = js.native
  def lock(params: atOctokitRestLib.atOctokitRestMod.IssuesLockParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.IssuesLockResponse]
  ] = js.native
  /**
    * Removes one or more assignees from an issue.,* ,* This example removes two of three assignees, leaving the `octocat` assignee.
    */
  def removeAssignees(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.IssuesRemoveAssigneesResponse]
  ] = js.native
  def removeAssignees(params: atOctokitRestLib.atOctokitRestMod.IssuesRemoveAssigneesParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.IssuesRemoveAssigneesResponse]
  ] = js.native
  /**
    * Removes the specified label from the issue, and returns the remaining labels on the issue. This endpoint returns a `404 Not Found` status if the label does not exist.
    */
  def removeLabel(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.IssuesRemoveLabelResponse]
  ] = js.native
  def removeLabel(params: atOctokitRestLib.atOctokitRestMod.IssuesRemoveLabelParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.IssuesRemoveLabelResponse]
  ] = js.native
  def removeLabels(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.IssuesRemoveLabelsResponse]
  ] = js.native
  def removeLabels(params: atOctokitRestLib.atOctokitRestMod.IssuesRemoveLabelsParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.IssuesRemoveLabelsResponse]
  ] = js.native
  def replaceLabels(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.IssuesReplaceLabelsResponse]
  ] = js.native
  def replaceLabels(params: atOctokitRestLib.atOctokitRestMod.IssuesReplaceLabelsParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.IssuesReplaceLabelsResponse]
  ] = js.native
  /**
    * Users with push access can unlock an issue's conversation.
    */
  def unlock(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.IssuesUnlockResponse]
  ] = js.native
  def unlock(params: atOctokitRestLib.atOctokitRestMod.IssuesUnlockParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.IssuesUnlockResponse]
  ] = js.native
  /**
    * Issue owners and users with push access can edit an issue.
    */
  def update(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.IssuesUpdateResponse]
  ] = js.native
  def update(params: atOctokitRestLib.atOctokitRestMod.IssuesUpdateParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.IssuesUpdateResponse]
  ] = js.native
  def updateComment(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.IssuesUpdateCommentResponse]
  ] = js.native
  def updateComment(params: atOctokitRestLib.atOctokitRestMod.IssuesUpdateCommentParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.IssuesUpdateCommentResponse]
  ] = js.native
  def updateLabel(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.IssuesUpdateLabelResponse]
  ] = js.native
  def updateLabel(params: atOctokitRestLib.atOctokitRestMod.IssuesUpdateLabelParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.IssuesUpdateLabelResponse]
  ] = js.native
  def updateMilestone(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.IssuesUpdateMilestoneResponse]
  ] = js.native
  def updateMilestone(params: atOctokitRestLib.atOctokitRestMod.IssuesUpdateMilestoneParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.IssuesUpdateMilestoneResponse]
  ] = js.native
}

