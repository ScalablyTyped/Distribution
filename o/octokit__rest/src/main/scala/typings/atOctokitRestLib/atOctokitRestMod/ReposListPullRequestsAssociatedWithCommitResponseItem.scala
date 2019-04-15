package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposListPullRequestsAssociatedWithCommitResponseItem extends js.Object {
  var _links: ReposListPullRequestsAssociatedWithCommitResponseItemLinks
  var active_lock_reason: java.lang.String
  var assignee: ReposListPullRequestsAssociatedWithCommitResponseItemAssignee
  var assignees: js.Array[ReposListPullRequestsAssociatedWithCommitResponseItemAssigneesItem]
  var author_association: java.lang.String
  var base: ReposListPullRequestsAssociatedWithCommitResponseItemBase
  var body: java.lang.String
  var closed_at: java.lang.String
  var comments_url: java.lang.String
  var commits_url: java.lang.String
  var created_at: java.lang.String
  var diff_url: java.lang.String
  var draft: scala.Boolean
  var head: ReposListPullRequestsAssociatedWithCommitResponseItemHead
  var html_url: java.lang.String
  var id: scala.Double
  var issue_url: java.lang.String
  var labels: js.Array[ReposListPullRequestsAssociatedWithCommitResponseItemLabelsItem]
  var locked: scala.Boolean
  var merge_commit_sha: java.lang.String
  var merged_at: java.lang.String
  var milestone: ReposListPullRequestsAssociatedWithCommitResponseItemMilestone
  var node_id: java.lang.String
  var number: scala.Double
  var patch_url: java.lang.String
  var requested_reviewers: js.Array[ReposListPullRequestsAssociatedWithCommitResponseItemRequestedReviewersItem]
  var requested_teams: js.Array[ReposListPullRequestsAssociatedWithCommitResponseItemRequestedTeamsItem]
  var review_comment_url: java.lang.String
  var review_comments_url: java.lang.String
  var state: java.lang.String
  var statuses_url: java.lang.String
  var title: java.lang.String
  var updated_at: java.lang.String
  var url: java.lang.String
  var user: ReposListPullRequestsAssociatedWithCommitResponseItemUser
}

object ReposListPullRequestsAssociatedWithCommitResponseItem {
  @scala.inline
  def apply(
    _links: ReposListPullRequestsAssociatedWithCommitResponseItemLinks,
    active_lock_reason: java.lang.String,
    assignee: ReposListPullRequestsAssociatedWithCommitResponseItemAssignee,
    assignees: js.Array[ReposListPullRequestsAssociatedWithCommitResponseItemAssigneesItem],
    author_association: java.lang.String,
    base: ReposListPullRequestsAssociatedWithCommitResponseItemBase,
    body: java.lang.String,
    closed_at: java.lang.String,
    comments_url: java.lang.String,
    commits_url: java.lang.String,
    created_at: java.lang.String,
    diff_url: java.lang.String,
    draft: scala.Boolean,
    head: ReposListPullRequestsAssociatedWithCommitResponseItemHead,
    html_url: java.lang.String,
    id: scala.Double,
    issue_url: java.lang.String,
    labels: js.Array[ReposListPullRequestsAssociatedWithCommitResponseItemLabelsItem],
    locked: scala.Boolean,
    merge_commit_sha: java.lang.String,
    merged_at: java.lang.String,
    milestone: ReposListPullRequestsAssociatedWithCommitResponseItemMilestone,
    node_id: java.lang.String,
    number: scala.Double,
    patch_url: java.lang.String,
    requested_reviewers: js.Array[ReposListPullRequestsAssociatedWithCommitResponseItemRequestedReviewersItem],
    requested_teams: js.Array[ReposListPullRequestsAssociatedWithCommitResponseItemRequestedTeamsItem],
    review_comment_url: java.lang.String,
    review_comments_url: java.lang.String,
    state: java.lang.String,
    statuses_url: java.lang.String,
    title: java.lang.String,
    updated_at: java.lang.String,
    url: java.lang.String,
    user: ReposListPullRequestsAssociatedWithCommitResponseItemUser
  ): ReposListPullRequestsAssociatedWithCommitResponseItem = {
    val __obj = js.Dynamic.literal(_links = _links, active_lock_reason = active_lock_reason, assignee = assignee, assignees = assignees, author_association = author_association, base = base, body = body, closed_at = closed_at, comments_url = comments_url, commits_url = commits_url, created_at = created_at, diff_url = diff_url, draft = draft, head = head, html_url = html_url, id = id, issue_url = issue_url, labels = labels, locked = locked, merge_commit_sha = merge_commit_sha, merged_at = merged_at, milestone = milestone, node_id = node_id, number = number, patch_url = patch_url, requested_reviewers = requested_reviewers, requested_teams = requested_teams, review_comment_url = review_comment_url, review_comments_url = review_comments_url, state = state, statuses_url = statuses_url, title = title, updated_at = updated_at, url = url, user = user)
  
    __obj.asInstanceOf[ReposListPullRequestsAssociatedWithCommitResponseItem]
  }
}

