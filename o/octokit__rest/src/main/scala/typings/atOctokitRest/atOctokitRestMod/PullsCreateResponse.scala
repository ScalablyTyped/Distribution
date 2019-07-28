package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsCreateResponse extends js.Object {
  var _links: PullsCreateResponseLinks
  var active_lock_reason: String
  var additions: Double
  var assignee: PullsCreateResponseAssignee
  var assignees: js.Array[PullsCreateResponseAssigneesItem]
  var author_association: String
  var base: PullsCreateResponseBase
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
  var head: PullsCreateResponseHead
  var html_url: String
  var id: Double
  var issue_url: String
  var labels: js.Array[PullsCreateResponseLabelsItem]
  var locked: Boolean
  var maintainer_can_modify: Boolean
  var merge_commit_sha: String
  var mergeable: Boolean
  var mergeable_state: String
  var merged: Boolean
  var merged_at: String
  var merged_by: PullsCreateResponseMergedBy
  var milestone: PullsCreateResponseMilestone
  var node_id: String
  var number: Double
  var patch_url: String
  var rebaseable: Boolean
  var requested_reviewers: js.Array[PullsCreateResponseRequestedReviewersItem]
  var requested_teams: js.Array[PullsCreateResponseRequestedTeamsItem]
  var review_comment_url: String
  var review_comments: Double
  var review_comments_url: String
  var state: String
  var statuses_url: String
  var title: String
  var updated_at: String
  var url: String
  var user: PullsCreateResponseUser
}

object PullsCreateResponse {
  @scala.inline
  def apply(
    _links: PullsCreateResponseLinks,
    active_lock_reason: String,
    additions: Double,
    assignee: PullsCreateResponseAssignee,
    assignees: js.Array[PullsCreateResponseAssigneesItem],
    author_association: String,
    base: PullsCreateResponseBase,
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
    head: PullsCreateResponseHead,
    html_url: String,
    id: Double,
    issue_url: String,
    labels: js.Array[PullsCreateResponseLabelsItem],
    locked: Boolean,
    maintainer_can_modify: Boolean,
    merge_commit_sha: String,
    mergeable: Boolean,
    mergeable_state: String,
    merged: Boolean,
    merged_at: String,
    merged_by: PullsCreateResponseMergedBy,
    milestone: PullsCreateResponseMilestone,
    node_id: String,
    number: Double,
    patch_url: String,
    rebaseable: Boolean,
    requested_reviewers: js.Array[PullsCreateResponseRequestedReviewersItem],
    requested_teams: js.Array[PullsCreateResponseRequestedTeamsItem],
    review_comment_url: String,
    review_comments: Double,
    review_comments_url: String,
    state: String,
    statuses_url: String,
    title: String,
    updated_at: String,
    url: String,
    user: PullsCreateResponseUser
  ): PullsCreateResponse = {
    val __obj = js.Dynamic.literal(_links = _links, active_lock_reason = active_lock_reason, additions = additions, assignee = assignee, assignees = assignees, author_association = author_association, base = base, body = body, changed_files = changed_files, closed_at = closed_at, comments = comments, comments_url = comments_url, commits = commits, commits_url = commits_url, created_at = created_at, deletions = deletions, diff_url = diff_url, draft = draft, head = head, html_url = html_url, id = id, issue_url = issue_url, labels = labels, locked = locked, maintainer_can_modify = maintainer_can_modify, merge_commit_sha = merge_commit_sha, mergeable = mergeable, mergeable_state = mergeable_state, merged = merged, merged_at = merged_at, merged_by = merged_by, milestone = milestone, node_id = node_id, number = number, patch_url = patch_url, rebaseable = rebaseable, requested_reviewers = requested_reviewers, requested_teams = requested_teams, review_comment_url = review_comment_url, review_comments = review_comments, review_comments_url = review_comments_url, state = state, statuses_url = statuses_url, title = title, updated_at = updated_at, url = url, user = user)
  
    __obj.asInstanceOf[PullsCreateResponse]
  }
}

