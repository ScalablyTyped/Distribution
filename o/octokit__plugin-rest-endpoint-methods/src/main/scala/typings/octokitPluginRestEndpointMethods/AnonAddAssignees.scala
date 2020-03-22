package typings.octokitPluginRestEndpointMethods

import typings.octokitPluginRestEndpointMethods.typesMod.AnyResponse
import typings.octokitPluginRestEndpointMethods.typesMod.IssuesAddAssigneesParams
import typings.octokitPluginRestEndpointMethods.typesMod.IssuesAddLabelsParams
import typings.octokitPluginRestEndpointMethods.typesMod.IssuesCheckAssigneeParams
import typings.octokitPluginRestEndpointMethods.typesMod.IssuesCreateCommentParams
import typings.octokitPluginRestEndpointMethods.typesMod.IssuesCreateLabelParams
import typings.octokitPluginRestEndpointMethods.typesMod.IssuesCreateMilestoneParams
import typings.octokitPluginRestEndpointMethods.typesMod.IssuesCreateParams
import typings.octokitPluginRestEndpointMethods.typesMod.IssuesCreateParamsDeprecatedAssignee
import typings.octokitPluginRestEndpointMethods.typesMod.IssuesDeleteCommentParams
import typings.octokitPluginRestEndpointMethods.typesMod.IssuesDeleteLabelParams
import typings.octokitPluginRestEndpointMethods.typesMod.IssuesDeleteMilestoneParams
import typings.octokitPluginRestEndpointMethods.typesMod.IssuesGetCommentParams
import typings.octokitPluginRestEndpointMethods.typesMod.IssuesGetEventParams
import typings.octokitPluginRestEndpointMethods.typesMod.IssuesGetLabelParams
import typings.octokitPluginRestEndpointMethods.typesMod.IssuesGetMilestoneParams
import typings.octokitPluginRestEndpointMethods.typesMod.IssuesGetParams
import typings.octokitPluginRestEndpointMethods.typesMod.IssuesListAssigneesParams
import typings.octokitPluginRestEndpointMethods.typesMod.IssuesListCommentsForRepoParams
import typings.octokitPluginRestEndpointMethods.typesMod.IssuesListCommentsParams
import typings.octokitPluginRestEndpointMethods.typesMod.IssuesListEventsForRepoParams
import typings.octokitPluginRestEndpointMethods.typesMod.IssuesListEventsForTimelineParams
import typings.octokitPluginRestEndpointMethods.typesMod.IssuesListEventsParams
import typings.octokitPluginRestEndpointMethods.typesMod.IssuesListForAuthenticatedUserParams
import typings.octokitPluginRestEndpointMethods.typesMod.IssuesListForOrgParams
import typings.octokitPluginRestEndpointMethods.typesMod.IssuesListForRepoParams
import typings.octokitPluginRestEndpointMethods.typesMod.IssuesListLabelsForMilestoneParams
import typings.octokitPluginRestEndpointMethods.typesMod.IssuesListLabelsForRepoParams
import typings.octokitPluginRestEndpointMethods.typesMod.IssuesListLabelsOnIssueParams
import typings.octokitPluginRestEndpointMethods.typesMod.IssuesListMilestonesForRepoParams
import typings.octokitPluginRestEndpointMethods.typesMod.IssuesListParams
import typings.octokitPluginRestEndpointMethods.typesMod.IssuesLockParams
import typings.octokitPluginRestEndpointMethods.typesMod.IssuesRemoveAssigneesParams
import typings.octokitPluginRestEndpointMethods.typesMod.IssuesRemoveLabelParams
import typings.octokitPluginRestEndpointMethods.typesMod.IssuesRemoveLabelsParams
import typings.octokitPluginRestEndpointMethods.typesMod.IssuesReplaceLabelsParams
import typings.octokitPluginRestEndpointMethods.typesMod.IssuesUnlockParams
import typings.octokitPluginRestEndpointMethods.typesMod.IssuesUpdateCommentParams
import typings.octokitPluginRestEndpointMethods.typesMod.IssuesUpdateLabelParams
import typings.octokitPluginRestEndpointMethods.typesMod.IssuesUpdateMilestoneParams
import typings.octokitPluginRestEndpointMethods.typesMod.IssuesUpdateParams
import typings.octokitPluginRestEndpointMethods.typesMod.IssuesUpdateParamsDeprecatedAssignee
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAddAssignees extends js.Object {
  /**
    * Adds up to 10 assignees to an issue. Users already assigned to an issue are not replaced.
    *
    * This example adds two assignees to the existing `octocat` assignee.
    */
  @JSName("addAssignees")
  var addAssignees_Original: Anon136 = js.native
  @JSName("addLabels")
  var addLabels_Original: Anon137 = js.native
  /**
    * Checks if a user has permission to be assigned to an issue in this repository.
    *
    * If the `assignee` can be assigned to issues in the repository, a `204` header with no content is returned.
    *
    * Otherwise a `404` status code is returned.
    */
  @JSName("checkAssignee")
  var checkAssignee_Original: Anon138 = js.native
  /**
    * This endpoint triggers [notifications](https://help.github.com/articles/about-notifications/). Creating content too quickly using this endpoint may result in abuse rate limiting. See "[Abuse rate limits](https://developer.github.com/v3/#abuse-rate-limits)" and "[Dealing with abuse rate limits](https://developer.github.com/v3/guides/best-practices-for-integrators/#dealing-with-abuse-rate-limits)" for details.
    */
  @JSName("createComment")
  var createComment_Original: Anon140 = js.native
  @JSName("createLabel")
  var createLabel_Original: Anon141 = js.native
  @JSName("createMilestone")
  var createMilestone_Original: Anon142 = js.native
  /**
    * Any user with pull access to a repository can create an issue. If [issues are disabled in the repository](https://help.github.com/articles/disabling-issues/), the API returns a `410 Gone` status.
    *
    * This endpoint triggers [notifications](https://help.github.com/articles/about-notifications/). Creating content too quickly using this endpoint may result in abuse rate limiting. See "[Abuse rate limits](https://developer.github.com/v3/#abuse-rate-limits)" and "[Dealing with abuse rate limits](https://developer.github.com/v3/guides/best-practices-for-integrators/#dealing-with-abuse-rate-limits)" for details.
    */
  @JSName("create")
  var create_Original: Anon139 = js.native
  @JSName("deleteComment")
  var deleteComment_Original: Anon143 = js.native
  @JSName("deleteLabel")
  var deleteLabel_Original: Anon144 = js.native
  @JSName("deleteMilestone")
  var deleteMilestone_Original: Anon145 = js.native
  @JSName("getComment")
  var getComment_Original: Anon147 = js.native
  @JSName("getEvent")
  var getEvent_Original: Anon148 = js.native
  @JSName("getLabel")
  var getLabel_Original: Anon149 = js.native
  @JSName("getMilestone")
  var getMilestone_Original: Anon150 = js.native
  /**
    * The API returns a [`301 Moved Permanently` status](https://developer.github.com/v3/#http-redirects) if the issue was [transferred](https://help.github.com/articles/transferring-an-issue-to-another-repository/) to another repository. If the issue was transferred to or deleted from a repository where the authenticated user lacks read access, the API returns a `404 Not Found` status. If the issue was deleted from a repository where the authenticated user has read access, the API returns a `410 Gone` status. To receive webhook events for transferred and deleted issues, subscribe to the [`issues`](https://developer.github.com/v3/activity/events/types/#issuesevent) webhook.
    *
    * **Note**: GitHub's REST API v3 considers every pull request an issue, but not every issue is a pull request. For this reason, "Issues" endpoints may return both issues and pull requests in the response. You can identify pull requests by the `pull_request` key.
    *
    * Be aware that the `id` of a pull request returned from "Issues" endpoints will be an _issue id_. To find out the pull request id, use the "[List pull requests](https://developer.github.com/v3/pulls/#list-pull-requests)" endpoint.
    */
  @JSName("get")
  var get_Original: Anon146 = js.native
  /**
    * Lists the [available assignees](https://help.github.com/articles/assigning-issues-and-pull-requests-to-other-github-users/) for issues in a repository.
    */
  @JSName("listAssignees")
  var listAssignees_Original: Anon152 = js.native
  /**
    * By default, Issue Comments are ordered by ascending ID.
    */
  @JSName("listCommentsForRepo")
  var listCommentsForRepo_Original: Anon154 = js.native
  /**
    * Issue Comments are ordered by ascending ID.
    */
  @JSName("listComments")
  var listComments_Original: Anon153 = js.native
  @JSName("listEventsForRepo")
  var listEventsForRepo_Original: Anon156 = js.native
  @JSName("listEventsForTimeline")
  var listEventsForTimeline_Original: Anon157 = js.native
  @JSName("listEvents")
  var listEvents_Original: Anon155 = js.native
  /**
    * **Note**: GitHub's REST API v3 considers every pull request an issue, but not every issue is a pull request. For this reason, "Issues" endpoints may return both issues and pull requests in the response. You can identify pull requests by the `pull_request` key.
    *
    * Be aware that the `id` of a pull request returned from "Issues" endpoints will be an _issue id_. To find out the pull request id, use the "[List pull requests](https://developer.github.com/v3/pulls/#list-pull-requests)" endpoint.
    */
  @JSName("listForAuthenticatedUser")
  var listForAuthenticatedUser_Original: Anon158 = js.native
  /**
    * **Note**: GitHub's REST API v3 considers every pull request an issue, but not every issue is a pull request. For this reason, "Issues" endpoints may return both issues and pull requests in the response. You can identify pull requests by the `pull_request` key.
    *
    * Be aware that the `id` of a pull request returned from "Issues" endpoints will be an _issue id_. To find out the pull request id, use the "[List pull requests](https://developer.github.com/v3/pulls/#list-pull-requests)" endpoint.
    */
  @JSName("listForOrg")
  var listForOrg_Original: Anon159 = js.native
  /**
    * **Note**: GitHub's REST API v3 considers every pull request an issue, but not every issue is a pull request. For this reason, "Issues" endpoints may return both issues and pull requests in the response. You can identify pull requests by the `pull_request` key.
    *
    * Be aware that the `id` of a pull request returned from "Issues" endpoints will be an _issue id_. To find out the pull request id, use the "[List pull requests](https://developer.github.com/v3/pulls/#list-pull-requests)" endpoint.
    */
  @JSName("listForRepo")
  var listForRepo_Original: Anon160 = js.native
  @JSName("listLabelsForMilestone")
  var listLabelsForMilestone_Original: Anon161 = js.native
  @JSName("listLabelsForRepo")
  var listLabelsForRepo_Original: Anon162 = js.native
  @JSName("listLabelsOnIssue")
  var listLabelsOnIssue_Original: Anon163 = js.native
  @JSName("listMilestonesForRepo")
  var listMilestonesForRepo_Original: Anon164 = js.native
  /**
    * **Note**: GitHub's REST API v3 considers every pull request an issue, but not every issue is a pull request. For this reason, "Issues" endpoints may return both issues and pull requests in the response. You can identify pull requests by the `pull_request` key.
    *
    * Be aware that the `id` of a pull request returned from "Issues" endpoints will be an _issue id_. To find out the pull request id, use the "[List pull requests](https://developer.github.com/v3/pulls/#list-pull-requests)" endpoint.
    */
  @JSName("list")
  var list_Original: Anon151 = js.native
  /**
    * Users with push access can lock an issue or pull request's conversation.
    *
    * Note that, if you choose not to pass any parameters, you'll need to set `Content-Length` to zero when calling out to this endpoint. For more information, see "[HTTP verbs](https://developer.github.com/v3/#http-verbs)."
    */
  @JSName("lock")
  var lock_Original: Anon165 = js.native
  /**
    * Removes one or more assignees from an issue.
    *
    * This example removes two of three assignees, leaving the `octocat` assignee.
    */
  @JSName("removeAssignees")
  var removeAssignees_Original: Anon166 = js.native
  /**
    * Removes the specified label from the issue, and returns the remaining labels on the issue. This endpoint returns a `404 Not Found` status if the label does not exist.
    */
  @JSName("removeLabel")
  var removeLabel_Original: Anon167 = js.native
  @JSName("removeLabels")
  var removeLabels_Original: Anon168 = js.native
  @JSName("replaceLabels")
  var replaceLabels_Original: Anon169 = js.native
  /**
    * Users with push access can unlock an issue's conversation.
    */
  @JSName("unlock")
  var unlock_Original: Anon170 = js.native
  @JSName("updateComment")
  var updateComment_Original: Anon172 = js.native
  @JSName("updateLabel")
  var updateLabel_Original: Anon173 = js.native
  @JSName("updateMilestone")
  var updateMilestone_Original: Anon174 = js.native
  /**
    * Issue owners and users with push access can edit an issue.
    */
  @JSName("update")
  var update_Original: Anon171 = js.native
  /**
    * Adds up to 10 assignees to an issue. Users already assigned to an issue are not replaced.
    *
    * This example adds two assignees to the existing `octocat` assignee.
    */
  def addAssignees(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<IssuesAddAssigneesResponse> */ _
  ] = js.native
  def addAssignees(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with IssuesAddAssigneesParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<IssuesAddAssigneesResponse> */ _
  ] = js.native
  def addLabels(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<IssuesAddLabelsResponse> */ _
  ] = js.native
  def addLabels(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with IssuesAddLabelsParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<IssuesAddLabelsResponse> */ _
  ] = js.native
  /**
    * Checks if a user has permission to be assigned to an issue in this repository.
    *
    * If the `assignee` can be assigned to issues in the repository, a `204` header with no content is returned.
    *
    * Otherwise a `404` status code is returned.
    */
  def checkAssignee(): js.Promise[AnyResponse] = js.native
  def checkAssignee(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with IssuesCheckAssigneeParams
  ): js.Promise[AnyResponse] = js.native
  /**
    * Any user with pull access to a repository can create an issue. If [issues are disabled in the repository](https://help.github.com/articles/disabling-issues/), the API returns a `410 Gone` status.
    *
    * This endpoint triggers [notifications](https://help.github.com/articles/about-notifications/). Creating content too quickly using this endpoint may result in abuse rate limiting. See "[Abuse rate limits](https://developer.github.com/v3/#abuse-rate-limits)" and "[Dealing with abuse rate limits](https://developer.github.com/v3/guides/best-practices-for-integrators/#dealing-with-abuse-rate-limits)" for details.
    */
  def create(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<IssuesCreateResponse> */ _
  ] = js.native
  def create(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with IssuesCreateParamsDeprecatedAssignee with IssuesCreateParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<IssuesCreateResponse> */ _
  ] = js.native
  /**
    * This endpoint triggers [notifications](https://help.github.com/articles/about-notifications/). Creating content too quickly using this endpoint may result in abuse rate limiting. See "[Abuse rate limits](https://developer.github.com/v3/#abuse-rate-limits)" and "[Dealing with abuse rate limits](https://developer.github.com/v3/guides/best-practices-for-integrators/#dealing-with-abuse-rate-limits)" for details.
    */
  def createComment(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<IssuesCreateCommentResponse> */ _
  ] = js.native
  def createComment(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with IssuesCreateCommentParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<IssuesCreateCommentResponse> */ _
  ] = js.native
  def createLabel(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<IssuesCreateLabelResponse> */ _
  ] = js.native
  def createLabel(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with IssuesCreateLabelParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<IssuesCreateLabelResponse> */ _
  ] = js.native
  def createMilestone(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<IssuesCreateMilestoneResponse> */ _
  ] = js.native
  def createMilestone(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with IssuesCreateMilestoneParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<IssuesCreateMilestoneResponse> */ _
  ] = js.native
  def deleteComment(): js.Promise[AnyResponse] = js.native
  def deleteComment(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with IssuesDeleteCommentParams
  ): js.Promise[AnyResponse] = js.native
  def deleteLabel(): js.Promise[AnyResponse] = js.native
  def deleteLabel(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with IssuesDeleteLabelParams
  ): js.Promise[AnyResponse] = js.native
  def deleteMilestone(): js.Promise[AnyResponse] = js.native
  def deleteMilestone(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with IssuesDeleteMilestoneParams
  ): js.Promise[AnyResponse] = js.native
  /**
    * The API returns a [`301 Moved Permanently` status](https://developer.github.com/v3/#http-redirects) if the issue was [transferred](https://help.github.com/articles/transferring-an-issue-to-another-repository/) to another repository. If the issue was transferred to or deleted from a repository where the authenticated user lacks read access, the API returns a `404 Not Found` status. If the issue was deleted from a repository where the authenticated user has read access, the API returns a `410 Gone` status. To receive webhook events for transferred and deleted issues, subscribe to the [`issues`](https://developer.github.com/v3/activity/events/types/#issuesevent) webhook.
    *
    * **Note**: GitHub's REST API v3 considers every pull request an issue, but not every issue is a pull request. For this reason, "Issues" endpoints may return both issues and pull requests in the response. You can identify pull requests by the `pull_request` key.
    *
    * Be aware that the `id` of a pull request returned from "Issues" endpoints will be an _issue id_. To find out the pull request id, use the "[List pull requests](https://developer.github.com/v3/pulls/#list-pull-requests)" endpoint.
    */
  def get(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<IssuesGetResponse> */ _
  ] = js.native
  def get(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with IssuesGetParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<IssuesGetResponse> */ _
  ] = js.native
  def getComment(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<IssuesGetCommentResponse> */ _
  ] = js.native
  def getComment(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with IssuesGetCommentParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<IssuesGetCommentResponse> */ _
  ] = js.native
  def getEvent(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<IssuesGetEventResponse> */ _
  ] = js.native
  def getEvent(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with IssuesGetEventParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<IssuesGetEventResponse> */ _
  ] = js.native
  def getLabel(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<IssuesGetLabelResponse> */ _
  ] = js.native
  def getLabel(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with IssuesGetLabelParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<IssuesGetLabelResponse> */ _
  ] = js.native
  def getMilestone(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<IssuesGetMilestoneResponse> */ _
  ] = js.native
  def getMilestone(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with IssuesGetMilestoneParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<IssuesGetMilestoneResponse> */ _
  ] = js.native
  /**
    * **Note**: GitHub's REST API v3 considers every pull request an issue, but not every issue is a pull request. For this reason, "Issues" endpoints may return both issues and pull requests in the response. You can identify pull requests by the `pull_request` key.
    *
    * Be aware that the `id` of a pull request returned from "Issues" endpoints will be an _issue id_. To find out the pull request id, use the "[List pull requests](https://developer.github.com/v3/pulls/#list-pull-requests)" endpoint.
    */
  def list(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<IssuesListResponse> */ _
  ] = js.native
  def list(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with IssuesListParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<IssuesListResponse> */ _
  ] = js.native
  /**
    * Lists the [available assignees](https://help.github.com/articles/assigning-issues-and-pull-requests-to-other-github-users/) for issues in a repository.
    */
  def listAssignees(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<IssuesListAssigneesResponse> */ _
  ] = js.native
  def listAssignees(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with IssuesListAssigneesParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<IssuesListAssigneesResponse> */ _
  ] = js.native
  /**
    * Issue Comments are ordered by ascending ID.
    */
  def listComments(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<IssuesListCommentsResponse> */ _
  ] = js.native
  def listComments(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with IssuesListCommentsParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<IssuesListCommentsResponse> */ _
  ] = js.native
  /**
    * By default, Issue Comments are ordered by ascending ID.
    */
  def listCommentsForRepo(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<IssuesListCommentsForRepoResponse> */ _
  ] = js.native
  def listCommentsForRepo(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with IssuesListCommentsForRepoParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<IssuesListCommentsForRepoResponse> */ _
  ] = js.native
  def listEvents(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<IssuesListEventsResponse> */ _
  ] = js.native
  def listEvents(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with IssuesListEventsParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<IssuesListEventsResponse> */ _
  ] = js.native
  def listEventsForRepo(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<IssuesListEventsForRepoResponse> */ _
  ] = js.native
  def listEventsForRepo(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with IssuesListEventsForRepoParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<IssuesListEventsForRepoResponse> */ _
  ] = js.native
  def listEventsForTimeline(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<IssuesListEventsForTimelineResponse> */ _
  ] = js.native
  def listEventsForTimeline(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with IssuesListEventsForTimelineParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<IssuesListEventsForTimelineResponse> */ _
  ] = js.native
  /**
    * **Note**: GitHub's REST API v3 considers every pull request an issue, but not every issue is a pull request. For this reason, "Issues" endpoints may return both issues and pull requests in the response. You can identify pull requests by the `pull_request` key.
    *
    * Be aware that the `id` of a pull request returned from "Issues" endpoints will be an _issue id_. To find out the pull request id, use the "[List pull requests](https://developer.github.com/v3/pulls/#list-pull-requests)" endpoint.
    */
  def listForAuthenticatedUser(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<IssuesListForAuthenticatedUserResponse> */ _
  ] = js.native
  def listForAuthenticatedUser(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with IssuesListForAuthenticatedUserParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<IssuesListForAuthenticatedUserResponse> */ _
  ] = js.native
  /**
    * **Note**: GitHub's REST API v3 considers every pull request an issue, but not every issue is a pull request. For this reason, "Issues" endpoints may return both issues and pull requests in the response. You can identify pull requests by the `pull_request` key.
    *
    * Be aware that the `id` of a pull request returned from "Issues" endpoints will be an _issue id_. To find out the pull request id, use the "[List pull requests](https://developer.github.com/v3/pulls/#list-pull-requests)" endpoint.
    */
  def listForOrg(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<IssuesListForOrgResponse> */ _
  ] = js.native
  def listForOrg(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with IssuesListForOrgParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<IssuesListForOrgResponse> */ _
  ] = js.native
  /**
    * **Note**: GitHub's REST API v3 considers every pull request an issue, but not every issue is a pull request. For this reason, "Issues" endpoints may return both issues and pull requests in the response. You can identify pull requests by the `pull_request` key.
    *
    * Be aware that the `id` of a pull request returned from "Issues" endpoints will be an _issue id_. To find out the pull request id, use the "[List pull requests](https://developer.github.com/v3/pulls/#list-pull-requests)" endpoint.
    */
  def listForRepo(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<IssuesListForRepoResponse> */ _
  ] = js.native
  def listForRepo(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with IssuesListForRepoParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<IssuesListForRepoResponse> */ _
  ] = js.native
  def listLabelsForMilestone(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<IssuesListLabelsForMilestoneResponse> */ _
  ] = js.native
  def listLabelsForMilestone(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with IssuesListLabelsForMilestoneParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<IssuesListLabelsForMilestoneResponse> */ _
  ] = js.native
  def listLabelsForRepo(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<IssuesListLabelsForRepoResponse> */ _
  ] = js.native
  def listLabelsForRepo(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with IssuesListLabelsForRepoParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<IssuesListLabelsForRepoResponse> */ _
  ] = js.native
  def listLabelsOnIssue(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<IssuesListLabelsOnIssueResponse> */ _
  ] = js.native
  def listLabelsOnIssue(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with IssuesListLabelsOnIssueParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<IssuesListLabelsOnIssueResponse> */ _
  ] = js.native
  def listMilestonesForRepo(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<IssuesListMilestonesForRepoResponse> */ _
  ] = js.native
  def listMilestonesForRepo(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with IssuesListMilestonesForRepoParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<IssuesListMilestonesForRepoResponse> */ _
  ] = js.native
  /**
    * Users with push access can lock an issue or pull request's conversation.
    *
    * Note that, if you choose not to pass any parameters, you'll need to set `Content-Length` to zero when calling out to this endpoint. For more information, see "[HTTP verbs](https://developer.github.com/v3/#http-verbs)."
    */
  def lock(): js.Promise[AnyResponse] = js.native
  def lock(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with IssuesLockParams
  ): js.Promise[AnyResponse] = js.native
  /**
    * Removes one or more assignees from an issue.
    *
    * This example removes two of three assignees, leaving the `octocat` assignee.
    */
  def removeAssignees(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<IssuesRemoveAssigneesResponse> */ _
  ] = js.native
  def removeAssignees(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with IssuesRemoveAssigneesParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<IssuesRemoveAssigneesResponse> */ _
  ] = js.native
  /**
    * Removes the specified label from the issue, and returns the remaining labels on the issue. This endpoint returns a `404 Not Found` status if the label does not exist.
    */
  def removeLabel(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<IssuesRemoveLabelResponse> */ _
  ] = js.native
  def removeLabel(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with IssuesRemoveLabelParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<IssuesRemoveLabelResponse> */ _
  ] = js.native
  def removeLabels(): js.Promise[AnyResponse] = js.native
  def removeLabels(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with IssuesRemoveLabelsParams
  ): js.Promise[AnyResponse] = js.native
  def replaceLabels(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<IssuesReplaceLabelsResponse> */ _
  ] = js.native
  def replaceLabels(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with IssuesReplaceLabelsParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<IssuesReplaceLabelsResponse> */ _
  ] = js.native
  /**
    * Users with push access can unlock an issue's conversation.
    */
  def unlock(): js.Promise[AnyResponse] = js.native
  def unlock(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with IssuesUnlockParams
  ): js.Promise[AnyResponse] = js.native
  /**
    * Issue owners and users with push access can edit an issue.
    */
  def update(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<IssuesUpdateResponse> */ _
  ] = js.native
  def update(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with IssuesUpdateParamsDeprecatedAssignee with IssuesUpdateParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<IssuesUpdateResponse> */ _
  ] = js.native
  def updateComment(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<IssuesUpdateCommentResponse> */ _
  ] = js.native
  def updateComment(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with IssuesUpdateCommentParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<IssuesUpdateCommentResponse> */ _
  ] = js.native
  def updateLabel(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<IssuesUpdateLabelResponse> */ _
  ] = js.native
  def updateLabel(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with IssuesUpdateLabelParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<IssuesUpdateLabelResponse> */ _
  ] = js.native
  def updateMilestone(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<IssuesUpdateMilestoneResponse> */ _
  ] = js.native
  def updateMilestone(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with IssuesUpdateMilestoneParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<IssuesUpdateMilestoneResponse> */ _
  ] = js.native
}

