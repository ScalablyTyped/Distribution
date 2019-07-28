package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsCreateFromIssueResponse extends js.Object {
  var _links: PullsCreateFromIssueResponseLinks
  var active_lock_reason: String
  var additions: Double
  var assignee: PullsCreateFromIssueResponseAssignee
  var assignees: js.Array[PullsCreateFromIssueResponseAssigneesItem]
  var author_association: String
  var base: PullsCreateFromIssueResponseBase
  var body: String
  var changed_files: Double
  var closed_at: String
  var comments: Double
  var comments_url: String
  var commits: Double
  var commits_url: String
  var created_at: String
  var deletions: Double
  var diff_url: String
  var draft: Boolean
  var head: PullsCreateFromIssueResponseHead
  var html_url: String
  var id: Double
  var issue_url: String
  var labels: js.Array[PullsCreateFromIssueResponseLabelsItem]
  var locked: Boolean
  var maintainer_can_modify: Boolean
  var merge_commit_sha: String
  var mergeable: Boolean
  var mergeable_state: String
  var merged: Boolean
  var merged_at: String
  var merged_by: PullsCreateFromIssueResponseMergedBy
  var milestone: PullsCreateFromIssueResponseMilestone
  var node_id: String
  var number: Double
  var patch_url: String
  var rebaseable: Boolean
  var requested_reviewers: js.Array[PullsCreateFromIssueResponseRequestedReviewersItem]
  var requested_teams: js.Array[PullsCreateFromIssueResponseRequestedTeamsItem]
  var review_comment_url: String
  var review_comments: Double
  var review_comments_url: String
  var state: String
  var statuses_url: String
  var title: String
  var updated_at: String
  var url: String
  var user: PullsCreateFromIssueResponseUser
}

object PullsCreateFromIssueResponse {
  @scala.inline
  def apply(
    _links: PullsCreateFromIssueResponseLinks,
    active_lock_reason: String,
    additions: Double,
    assignee: PullsCreateFromIssueResponseAssignee,
    assignees: js.Array[PullsCreateFromIssueResponseAssigneesItem],
    author_association: String,
    base: PullsCreateFromIssueResponseBase,
    body: String,
    changed_files: Double,
    closed_at: String,
    comments: Double,
    comments_url: String,
    commits: Double,
    commits_url: String,
    created_at: String,
    deletions: Double,
    diff_url: String,
    draft: Boolean,
    head: PullsCreateFromIssueResponseHead,
    html_url: String,
    id: Double,
    issue_url: String,
    labels: js.Array[PullsCreateFromIssueResponseLabelsItem],
    locked: Boolean,
    maintainer_can_modify: Boolean,
    merge_commit_sha: String,
    mergeable: Boolean,
    mergeable_state: String,
    merged: Boolean,
    merged_at: String,
    merged_by: PullsCreateFromIssueResponseMergedBy,
    milestone: PullsCreateFromIssueResponseMilestone,
    node_id: String,
    number: Double,
    patch_url: String,
    rebaseable: Boolean,
    requested_reviewers: js.Array[PullsCreateFromIssueResponseRequestedReviewersItem],
    requested_teams: js.Array[PullsCreateFromIssueResponseRequestedTeamsItem],
    review_comment_url: String,
    review_comments: Double,
    review_comments_url: String,
    state: String,
    statuses_url: String,
    title: String,
    updated_at: String,
    url: String,
    user: PullsCreateFromIssueResponseUser
  ): PullsCreateFromIssueResponse = {
    val __obj = js.Dynamic.literal(_links = _links, active_lock_reason = active_lock_reason, additions = additions, assignee = assignee, assignees = assignees, author_association = author_association, base = base, body = body, changed_files = changed_files, closed_at = closed_at, comments = comments, comments_url = comments_url, commits = commits, commits_url = commits_url, created_at = created_at, deletions = deletions, diff_url = diff_url, draft = draft, head = head, html_url = html_url, id = id, issue_url = issue_url, labels = labels, locked = locked, maintainer_can_modify = maintainer_can_modify, merge_commit_sha = merge_commit_sha, mergeable = mergeable, mergeable_state = mergeable_state, merged = merged, merged_at = merged_at, merged_by = merged_by, milestone = milestone, node_id = node_id, number = number, patch_url = patch_url, rebaseable = rebaseable, requested_reviewers = requested_reviewers, requested_teams = requested_teams, review_comment_url = review_comment_url, review_comments = review_comments, review_comments_url = review_comments_url, state = state, statuses_url = statuses_url, title = title, updated_at = updated_at, url = url, user = user)
  
    __obj.asInstanceOf[PullsCreateFromIssueResponse]
  }
}

