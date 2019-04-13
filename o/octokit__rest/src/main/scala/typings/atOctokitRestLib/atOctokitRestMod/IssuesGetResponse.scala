package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssuesGetResponse extends js.Object {
  var active_lock_reason: java.lang.String
  var assignee: IssuesGetResponseAssignee
  var assignees: js.Array[IssuesGetResponseAssigneesItem]
  var body: java.lang.String
  var closed_at: scala.Null
  var closed_by: IssuesGetResponseClosedBy
  var comments: scala.Double
  var comments_url: java.lang.String
  var created_at: java.lang.String
  var events_url: java.lang.String
  var html_url: java.lang.String
  var id: scala.Double
  var labels: js.Array[IssuesGetResponseLabelsItem]
  var labels_url: java.lang.String
  var locked: scala.Boolean
  var milestone: IssuesGetResponseMilestone
  var node_id: java.lang.String
  var number: scala.Double
  var pull_request: IssuesGetResponsePullRequest
  var repository_url: java.lang.String
  var state: java.lang.String
  var title: java.lang.String
  var updated_at: java.lang.String
  var url: java.lang.String
  var user: IssuesGetResponseUser
}

object IssuesGetResponse {
  @scala.inline
  def apply(
    active_lock_reason: java.lang.String,
    assignee: IssuesGetResponseAssignee,
    assignees: js.Array[IssuesGetResponseAssigneesItem],
    body: java.lang.String,
    closed_at: scala.Null,
    closed_by: IssuesGetResponseClosedBy,
    comments: scala.Double,
    comments_url: java.lang.String,
    created_at: java.lang.String,
    events_url: java.lang.String,
    html_url: java.lang.String,
    id: scala.Double,
    labels: js.Array[IssuesGetResponseLabelsItem],
    labels_url: java.lang.String,
    locked: scala.Boolean,
    milestone: IssuesGetResponseMilestone,
    node_id: java.lang.String,
    number: scala.Double,
    pull_request: IssuesGetResponsePullRequest,
    repository_url: java.lang.String,
    state: java.lang.String,
    title: java.lang.String,
    updated_at: java.lang.String,
    url: java.lang.String,
    user: IssuesGetResponseUser
  ): IssuesGetResponse = {
    val __obj = js.Dynamic.literal(active_lock_reason = active_lock_reason, assignee = assignee, assignees = assignees, body = body, closed_at = closed_at, closed_by = closed_by, comments = comments, comments_url = comments_url, created_at = created_at, events_url = events_url, html_url = html_url, id = id, labels = labels, labels_url = labels_url, locked = locked, milestone = milestone, node_id = node_id, number = number, pull_request = pull_request, repository_url = repository_url, state = state, title = title, updated_at = updated_at, url = url, user = user)
  
    __obj.asInstanceOf[IssuesGetResponse]
  }
}

