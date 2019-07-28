package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssuesUpdateResponse extends js.Object {
  var active_lock_reason: String
  var assignee: IssuesUpdateResponseAssignee
  var assignees: js.Array[IssuesUpdateResponseAssigneesItem]
  var body: String
  var closed_at: Null
  var closed_by: IssuesUpdateResponseClosedBy
  var comments: Double
  var comments_url: String
  var created_at: String
  var events_url: String
  var html_url: String
  var id: Double
  var labels: js.Array[IssuesUpdateResponseLabelsItem]
  var labels_url: String
  var locked: Boolean
  var milestone: IssuesUpdateResponseMilestone
  var node_id: String
  var number: Double
  var pull_request: IssuesUpdateResponsePullRequest
  var repository_url: String
  var state: String
  var title: String
  var updated_at: String
  var url: String
  var user: IssuesUpdateResponseUser
}

object IssuesUpdateResponse {
  @scala.inline
  def apply(
    active_lock_reason: String,
    assignee: IssuesUpdateResponseAssignee,
    assignees: js.Array[IssuesUpdateResponseAssigneesItem],
    body: String,
    closed_at: Null,
    closed_by: IssuesUpdateResponseClosedBy,
    comments: Double,
    comments_url: String,
    created_at: String,
    events_url: String,
    html_url: String,
    id: Double,
    labels: js.Array[IssuesUpdateResponseLabelsItem],
    labels_url: String,
    locked: Boolean,
    milestone: IssuesUpdateResponseMilestone,
    node_id: String,
    number: Double,
    pull_request: IssuesUpdateResponsePullRequest,
    repository_url: String,
    state: String,
    title: String,
    updated_at: String,
    url: String,
    user: IssuesUpdateResponseUser
  ): IssuesUpdateResponse = {
    val __obj = js.Dynamic.literal(active_lock_reason = active_lock_reason, assignee = assignee, assignees = assignees, body = body, closed_at = closed_at, closed_by = closed_by, comments = comments, comments_url = comments_url, created_at = created_at, events_url = events_url, html_url = html_url, id = id, labels = labels, labels_url = labels_url, locked = locked, milestone = milestone, node_id = node_id, number = number, pull_request = pull_request, repository_url = repository_url, state = state, title = title, updated_at = updated_at, url = url, user = user)
  
    __obj.asInstanceOf[IssuesUpdateResponse]
  }
}

