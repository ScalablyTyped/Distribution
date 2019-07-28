package typings.atOctokitRest.atOctokitRestMod

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
    val __obj = js.Dynamic.literal(_links = _links, active_lock_reason = active_lock_reason, assignee = assignee, assignees = assignees, author_association = author_association, base = base, body = body, closed_at = closed_at, comments_url = comments_url, commits_url = commits_url, created_at = created_at, diff_url = diff_url, draft = draft, head = head, html_url = html_url, id = id, issue_url = issue_url, labels = labels, locked = locked, merge_commit_sha = merge_commit_sha, merged_at = merged_at, milestone = milestone, node_id = node_id, number = number, patch_url = patch_url, requested_reviewers = requested_reviewers, requested_teams = requested_teams, review_comment_url = review_comment_url, review_comments_url = review_comments_url, state = state, statuses_url = statuses_url, title = title, updated_at = updated_at, url = url, user = user)
  
    __obj.asInstanceOf[PullsCreateReviewRequestResponse]
  }
}

