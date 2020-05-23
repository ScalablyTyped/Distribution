package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Closedat
import typings.octokitTypes.anon.Color
import typings.octokitTypes.anon.Commits
import typings.octokitTypes.anon.Description
import typings.octokitTypes.anon.Eventsurl
import typings.octokitTypes.anon.Label
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsCreateResponseData extends js.Object {
  var _links: Commits
  var active_lock_reason: String
  var additions: Double
  var assignee: Eventsurl
  var assignees: js.Array[Eventsurl]
  var author_association: String
  var base: Label
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
  var head: Label
  var html_url: String
  var id: Double
  var issue_url: String
  var labels: js.Array[Color]
  var locked: Boolean
  var maintainer_can_modify: Boolean
  var merge_commit_sha: String
  var mergeable: Boolean
  var mergeable_state: String
  var merged: Boolean
  var merged_at: String
  var merged_by: Eventsurl
  var milestone: Closedat
  var node_id: String
  var number: Double
  var patch_url: String
  var rebaseable: Boolean
  var requested_reviewers: js.Array[Eventsurl]
  var requested_teams: js.Array[Description]
  var review_comment_url: String
  var review_comments: Double
  var review_comments_url: String
  var state: String
  var statuses_url: String
  var title: String
  var updated_at: String
  var url: String
  var user: Eventsurl
}

object PullsCreateResponseData {
  @scala.inline
  def apply(
    _links: Commits,
    active_lock_reason: String,
    additions: Double,
    assignee: Eventsurl,
    assignees: js.Array[Eventsurl],
    author_association: String,
    base: Label,
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
    head: Label,
    html_url: String,
    id: Double,
    issue_url: String,
    labels: js.Array[Color],
    locked: Boolean,
    maintainer_can_modify: Boolean,
    merge_commit_sha: String,
    mergeable: Boolean,
    mergeable_state: String,
    merged: Boolean,
    merged_at: String,
    merged_by: Eventsurl,
    milestone: Closedat,
    node_id: String,
    number: Double,
    patch_url: String,
    rebaseable: Boolean,
    requested_reviewers: js.Array[Eventsurl],
    requested_teams: js.Array[Description],
    review_comment_url: String,
    review_comments: Double,
    review_comments_url: String,
    state: String,
    statuses_url: String,
    title: String,
    updated_at: String,
    url: String,
    user: Eventsurl
  ): PullsCreateResponseData = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], active_lock_reason = active_lock_reason.asInstanceOf[js.Any], additions = additions.asInstanceOf[js.Any], assignee = assignee.asInstanceOf[js.Any], assignees = assignees.asInstanceOf[js.Any], author_association = author_association.asInstanceOf[js.Any], base = base.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], changed_files = changed_files.asInstanceOf[js.Any], closed_at = closed_at.asInstanceOf[js.Any], comments = comments.asInstanceOf[js.Any], comments_url = comments_url.asInstanceOf[js.Any], commits = commits.asInstanceOf[js.Any], commits_url = commits_url.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], deletions = deletions.asInstanceOf[js.Any], diff_url = diff_url.asInstanceOf[js.Any], draft = draft.asInstanceOf[js.Any], head = head.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], issue_url = issue_url.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], locked = locked.asInstanceOf[js.Any], maintainer_can_modify = maintainer_can_modify.asInstanceOf[js.Any], merge_commit_sha = merge_commit_sha.asInstanceOf[js.Any], mergeable = mergeable.asInstanceOf[js.Any], mergeable_state = mergeable_state.asInstanceOf[js.Any], merged = merged.asInstanceOf[js.Any], merged_at = merged_at.asInstanceOf[js.Any], merged_by = merged_by.asInstanceOf[js.Any], milestone = milestone.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], patch_url = patch_url.asInstanceOf[js.Any], rebaseable = rebaseable.asInstanceOf[js.Any], requested_reviewers = requested_reviewers.asInstanceOf[js.Any], requested_teams = requested_teams.asInstanceOf[js.Any], review_comment_url = review_comment_url.asInstanceOf[js.Any], review_comments = review_comments.asInstanceOf[js.Any], review_comments_url = review_comments_url.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], statuses_url = statuses_url.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullsCreateResponseData]
  }
}

