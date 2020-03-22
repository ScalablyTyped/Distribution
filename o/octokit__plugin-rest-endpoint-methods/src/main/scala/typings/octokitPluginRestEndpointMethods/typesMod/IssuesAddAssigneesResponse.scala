package typings.octokitPluginRestEndpointMethods.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssuesAddAssigneesResponse extends js.Object {
  var active_lock_reason: String
  var assignee: IssuesAddAssigneesResponseAssignee
  var assignees: js.Array[IssuesAddAssigneesResponseAssigneesItem]
  var body: String
  var closed_at: Null
  var comments: Double
  var comments_url: String
  var created_at: String
  var events_url: String
  var html_url: String
  var id: Double
  var labels: js.Array[IssuesAddAssigneesResponseLabelsItem]
  var labels_url: String
  var locked: Boolean
  var milestone: IssuesAddAssigneesResponseMilestone
  var node_id: String
  var number: Double
  var pull_request: IssuesAddAssigneesResponsePullRequest
  var repository_url: String
  var state: String
  var title: String
  var updated_at: String
  var url: String
  var user: IssuesAddAssigneesResponseUser
}

object IssuesAddAssigneesResponse {
  @scala.inline
  def apply(
    active_lock_reason: String,
    assignee: IssuesAddAssigneesResponseAssignee,
    assignees: js.Array[IssuesAddAssigneesResponseAssigneesItem],
    body: String,
    closed_at: Null,
    comments: Double,
    comments_url: String,
    created_at: String,
    events_url: String,
    html_url: String,
    id: Double,
    labels: js.Array[IssuesAddAssigneesResponseLabelsItem],
    labels_url: String,
    locked: Boolean,
    milestone: IssuesAddAssigneesResponseMilestone,
    node_id: String,
    number: Double,
    pull_request: IssuesAddAssigneesResponsePullRequest,
    repository_url: String,
    state: String,
    title: String,
    updated_at: String,
    url: String,
    user: IssuesAddAssigneesResponseUser
  ): IssuesAddAssigneesResponse = {
    val __obj = js.Dynamic.literal(active_lock_reason = active_lock_reason.asInstanceOf[js.Any], assignee = assignee.asInstanceOf[js.Any], assignees = assignees.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], closed_at = closed_at.asInstanceOf[js.Any], comments = comments.asInstanceOf[js.Any], comments_url = comments_url.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], events_url = events_url.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], labels_url = labels_url.asInstanceOf[js.Any], locked = locked.asInstanceOf[js.Any], milestone = milestone.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], pull_request = pull_request.asInstanceOf[js.Any], repository_url = repository_url.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IssuesAddAssigneesResponse]
  }
}

