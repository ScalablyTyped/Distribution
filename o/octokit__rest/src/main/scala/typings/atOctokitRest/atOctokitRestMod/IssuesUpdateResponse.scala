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
    val __obj = js.Dynamic.literal(active_lock_reason = active_lock_reason.asInstanceOf[js.Any], assignee = assignee.asInstanceOf[js.Any], assignees = assignees.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], closed_at = closed_at.asInstanceOf[js.Any], closed_by = closed_by.asInstanceOf[js.Any], comments = comments.asInstanceOf[js.Any], comments_url = comments_url.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], events_url = events_url.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], labels_url = labels_url.asInstanceOf[js.Any], locked = locked.asInstanceOf[js.Any], milestone = milestone.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], pull_request = pull_request.asInstanceOf[js.Any], repository_url = repository_url.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IssuesUpdateResponse]
  }
}

