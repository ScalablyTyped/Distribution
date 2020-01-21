package typings.octokitRest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchIssuesAndPullRequestsResponseItemsItem extends js.Object {
  var assignee: Null
  var body: String
  var closed_at: Null
  var comments: Double
  var comments_url: String
  var created_at: String
  var events_url: String
  var html_url: String
  var id: Double
  var labels: js.Array[SearchIssuesAndPullRequestsResponseItemsItemLabelsItem]
  var labels_url: String
  var milestone: Null
  var node_id: String
  var number: Double
  var pull_request: SearchIssuesAndPullRequestsResponseItemsItemPullRequest
  var repository_url: String
  var score: Double
  var state: String
  var title: String
  var updated_at: String
  var url: String
  var user: SearchIssuesAndPullRequestsResponseItemsItemUser
}

object SearchIssuesAndPullRequestsResponseItemsItem {
  @scala.inline
  def apply(
    assignee: Null,
    body: String,
    closed_at: Null,
    comments: Double,
    comments_url: String,
    created_at: String,
    events_url: String,
    html_url: String,
    id: Double,
    labels: js.Array[SearchIssuesAndPullRequestsResponseItemsItemLabelsItem],
    labels_url: String,
    milestone: Null,
    node_id: String,
    number: Double,
    pull_request: SearchIssuesAndPullRequestsResponseItemsItemPullRequest,
    repository_url: String,
    score: Double,
    state: String,
    title: String,
    updated_at: String,
    url: String,
    user: SearchIssuesAndPullRequestsResponseItemsItemUser
  ): SearchIssuesAndPullRequestsResponseItemsItem = {
    val __obj = js.Dynamic.literal(assignee = assignee.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], closed_at = closed_at.asInstanceOf[js.Any], comments = comments.asInstanceOf[js.Any], comments_url = comments_url.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], events_url = events_url.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], labels_url = labels_url.asInstanceOf[js.Any], milestone = milestone.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], pull_request = pull_request.asInstanceOf[js.Any], repository_url = repository_url.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SearchIssuesAndPullRequestsResponseItemsItem]
  }
}

