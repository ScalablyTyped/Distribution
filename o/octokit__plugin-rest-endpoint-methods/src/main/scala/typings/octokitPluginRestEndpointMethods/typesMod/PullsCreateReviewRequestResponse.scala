package typings.octokitPluginRestEndpointMethods.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsCreateReviewRequestResponse extends js.Object {
  var _links: PullsCreateReviewRequestResponseLinks
  var active_lock_reason: String
  var assignee: PullsCreateReviewRequestResponseAssignee
  var assignees: js.Array[PullsCreateReviewRequestResponseAssigneesItem]
  var author_association: String
  var base: PullsCreateReviewRequestResponseBase
  var body: String
  var closed_at: String
  var comments_url: String
  var commits_url: String
  var created_at: String
  var diff_url: String
  var draft: Boolean
  var head: PullsCreateReviewRequestResponseHead
  var html_url: String
  var id: Double
  var issue_url: String
  var labels: js.Array[PullsCreateReviewRequestResponseLabelsItem]
  var locked: Boolean
  var merge_commit_sha: String
  var merged_at: String
  var milestone: PullsCreateReviewRequestResponseMilestone
  var node_id: String
  var number: Double
  var patch_url: String
  var requested_reviewers: js.Array[PullsCreateReviewRequestResponseRequestedReviewersItem]
  var requested_teams: js.Array[PullsCreateReviewRequestResponseRequestedTeamsItem]
  var review_comment_url: String
  var review_comments_url: String
  var state: String
  var statuses_url: String
  var title: String
  var updated_at: String
  var url: String
  var user: PullsCreateReviewRequestResponseUser
}

object PullsCreateReviewRequestResponse {
  @scala.inline
  def apply(
    _links: PullsCreateReviewRequestResponseLinks,
    active_lock_reason: String,
    assignee: PullsCreateReviewRequestResponseAssignee,
    assignees: js.Array[PullsCreateReviewRequestResponseAssigneesItem],
    author_association: String,
    base: PullsCreateReviewRequestResponseBase,
    body: String,
    closed_at: String,
    comments_url: String,
    commits_url: String,
    created_at: String,
    diff_url: String,
    draft: Boolean,
    head: PullsCreateReviewRequestResponseHead,
    html_url: String,
    id: Double,
    issue_url: String,
    labels: js.Array[PullsCreateReviewRequestResponseLabelsItem],
    locked: Boolean,
    merge_commit_sha: String,
    merged_at: String,
    milestone: PullsCreateReviewRequestResponseMilestone,
    node_id: String,
    number: Double,
    patch_url: String,
    requested_reviewers: js.Array[PullsCreateReviewRequestResponseRequestedReviewersItem],
    requested_teams: js.Array[PullsCreateReviewRequestResponseRequestedTeamsItem],
    review_comment_url: String,
    review_comments_url: String,
    state: String,
    statuses_url: String,
    title: String,
    updated_at: String,
    url: String,
    user: PullsCreateReviewRequestResponseUser
  ): PullsCreateReviewRequestResponse = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], active_lock_reason = active_lock_reason.asInstanceOf[js.Any], assignee = assignee.asInstanceOf[js.Any], assignees = assignees.asInstanceOf[js.Any], author_association = author_association.asInstanceOf[js.Any], base = base.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], closed_at = closed_at.asInstanceOf[js.Any], comments_url = comments_url.asInstanceOf[js.Any], commits_url = commits_url.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], diff_url = diff_url.asInstanceOf[js.Any], draft = draft.asInstanceOf[js.Any], head = head.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], issue_url = issue_url.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], locked = locked.asInstanceOf[js.Any], merge_commit_sha = merge_commit_sha.asInstanceOf[js.Any], merged_at = merged_at.asInstanceOf[js.Any], milestone = milestone.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], patch_url = patch_url.asInstanceOf[js.Any], requested_reviewers = requested_reviewers.asInstanceOf[js.Any], requested_teams = requested_teams.asInstanceOf[js.Any], review_comment_url = review_comment_url.asInstanceOf[js.Any], review_comments_url = review_comments_url.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], statuses_url = statuses_url.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PullsCreateReviewRequestResponse]
  }
}

