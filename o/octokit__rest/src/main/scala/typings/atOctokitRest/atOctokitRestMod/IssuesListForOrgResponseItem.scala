package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssuesListForOrgResponseItem extends js.Object {
  var active_lock_reason: String
  var assignee: IssuesListForOrgResponseItemAssignee
  var assignees: js.Array[IssuesListForOrgResponseItemAssigneesItem]
  var body: String
  var closed_at: Null
  var comments: Double
  var comments_url: String
  var created_at: String
  var events_url: String
  var html_url: String
  var id: Double
  var labels: js.Array[IssuesListForOrgResponseItemLabelsItem]
  var labels_url: String
  var locked: Boolean
  var milestone: IssuesListForOrgResponseItemMilestone
  var node_id: String
  var number: Double
  var pull_request: IssuesListForOrgResponseItemPullRequest
  var repository: IssuesListForOrgResponseItemRepository
  var repository_url: String
  var state: String
  var title: String
  var updated_at: String
  var url: String
  var user: IssuesListForOrgResponseItemUser
}

object IssuesListForOrgResponseItem {
  @scala.inline
  def apply(
    active_lock_reason: String,
    assignee: IssuesListForOrgResponseItemAssignee,
    assignees: js.Array[IssuesListForOrgResponseItemAssigneesItem],
    body: String,
    closed_at: Null,
    comments: Double,
    comments_url: String,
    created_at: String,
    events_url: String,
    html_url: String,
    id: Double,
    labels: js.Array[IssuesListForOrgResponseItemLabelsItem],
    labels_url: String,
    locked: Boolean,
    milestone: IssuesListForOrgResponseItemMilestone,
    node_id: String,
    number: Double,
    pull_request: IssuesListForOrgResponseItemPullRequest,
    repository: IssuesListForOrgResponseItemRepository,
    repository_url: String,
    state: String,
    title: String,
    updated_at: String,
    url: String,
    user: IssuesListForOrgResponseItemUser
  ): IssuesListForOrgResponseItem = {
    val __obj = js.Dynamic.literal(active_lock_reason = active_lock_reason, assignee = assignee, assignees = assignees, body = body, closed_at = closed_at, comments = comments, comments_url = comments_url, created_at = created_at, events_url = events_url, html_url = html_url, id = id, labels = labels, labels_url = labels_url, locked = locked, milestone = milestone, node_id = node_id, number = number, pull_request = pull_request, repository = repository, repository_url = repository_url, state = state, title = title, updated_at = updated_at, url = url, user = user)
  
    __obj.asInstanceOf[IssuesListForOrgResponseItem]
  }
}

