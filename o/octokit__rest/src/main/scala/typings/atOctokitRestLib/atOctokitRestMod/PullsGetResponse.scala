package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsGetResponse extends js.Object {
  var _links: PullsGetResponseLinks
  var active_lock_reason: java.lang.String
  var additions: scala.Double
  var assignee: PullsGetResponseAssignee
  var assignees: js.Array[PullsGetResponseAssigneesItem]
  var author_association: java.lang.String
  var base: PullsGetResponseBase
  var body: java.lang.String
  var changed_files: scala.Double
  var closed_at: java.lang.String
  var comments: scala.Double
  var comments_url: java.lang.String
  var commits: scala.Double
  var commits_url: java.lang.String
  var created_at: java.lang.String
  var deletions: scala.Double
  var diff_url: java.lang.String
  var draft: scala.Boolean
  var head: PullsGetResponseHead
  var html_url: java.lang.String
  var id: scala.Double
  var issue_url: java.lang.String
  var labels: js.Array[PullsGetResponseLabelsItem]
  var locked: scala.Boolean
  var maintainer_can_modify: scala.Boolean
  var merge_commit_sha: java.lang.String
  var mergeable: scala.Boolean
  var mergeable_state: java.lang.String
  var merged: scala.Boolean
  var merged_at: java.lang.String
  var merged_by: PullsGetResponseMergedBy
  var milestone: PullsGetResponseMilestone
  var node_id: java.lang.String
  var number: scala.Double
  var patch_url: java.lang.String
  var rebaseable: scala.Boolean
  var requested_reviewers: js.Array[PullsGetResponseRequestedReviewersItem]
  var requested_teams: js.Array[PullsGetResponseRequestedTeamsItem]
  var review_comment_url: java.lang.String
  var review_comments: scala.Double
  var review_comments_url: java.lang.String
  var state: java.lang.String
  var statuses_url: java.lang.String
  var title: java.lang.String
  var updated_at: java.lang.String
  var url: java.lang.String
  var user: PullsGetResponseUser
}

object PullsGetResponse {
  @scala.inline
  def apply(
    _links: PullsGetResponseLinks,
    active_lock_reason: java.lang.String,
    additions: scala.Double,
    assignee: PullsGetResponseAssignee,
    assignees: js.Array[PullsGetResponseAssigneesItem],
    author_association: java.lang.String,
    base: PullsGetResponseBase,
    body: java.lang.String,
    changed_files: scala.Double,
    closed_at: java.lang.String,
    comments: scala.Double,
    comments_url: java.lang.String,
    commits: scala.Double,
    commits_url: java.lang.String,
    created_at: java.lang.String,
    deletions: scala.Double,
    diff_url: java.lang.String,
    draft: scala.Boolean,
    head: PullsGetResponseHead,
    html_url: java.lang.String,
    id: scala.Double,
    issue_url: java.lang.String,
    labels: js.Array[PullsGetResponseLabelsItem],
    locked: scala.Boolean,
    maintainer_can_modify: scala.Boolean,
    merge_commit_sha: java.lang.String,
    mergeable: scala.Boolean,
    mergeable_state: java.lang.String,
    merged: scala.Boolean,
    merged_at: java.lang.String,
    merged_by: PullsGetResponseMergedBy,
    milestone: PullsGetResponseMilestone,
    node_id: java.lang.String,
    number: scala.Double,
    patch_url: java.lang.String,
    rebaseable: scala.Boolean,
    requested_reviewers: js.Array[PullsGetResponseRequestedReviewersItem],
    requested_teams: js.Array[PullsGetResponseRequestedTeamsItem],
    review_comment_url: java.lang.String,
    review_comments: scala.Double,
    review_comments_url: java.lang.String,
    state: java.lang.String,
    statuses_url: java.lang.String,
    title: java.lang.String,
    updated_at: java.lang.String,
    url: java.lang.String,
    user: PullsGetResponseUser
  ): PullsGetResponse = {
    val __obj = js.Dynamic.literal(_links = _links, active_lock_reason = active_lock_reason, additions = additions, assignee = assignee, assignees = assignees, author_association = author_association, base = base, body = body, changed_files = changed_files, closed_at = closed_at, comments = comments, comments_url = comments_url, commits = commits, commits_url = commits_url, created_at = created_at, deletions = deletions, diff_url = diff_url, draft = draft, head = head, html_url = html_url, id = id, issue_url = issue_url, labels = labels, locked = locked, maintainer_can_modify = maintainer_can_modify, merge_commit_sha = merge_commit_sha, mergeable = mergeable, mergeable_state = mergeable_state, merged = merged, merged_at = merged_at, merged_by = merged_by, milestone = milestone, node_id = node_id, number = number, patch_url = patch_url, rebaseable = rebaseable, requested_reviewers = requested_reviewers, requested_teams = requested_teams, review_comment_url = review_comment_url, review_comments = review_comments, review_comments_url = review_comments_url, state = state, statuses_url = statuses_url, title = title, updated_at = updated_at, url = url, user = user)
  
    __obj.asInstanceOf[PullsGetResponse]
  }
}

