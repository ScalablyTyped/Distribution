package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchIssuesResponseItemsItem extends js.Object {
  var assignee: Null
  var body: String
  var closed_at: Null
  var comments: Double
  var comments_url: String
  var created_at: String
  var events_url: String
  var html_url: String
  var id: Double
  var labels: js.Array[SearchIssuesResponseItemsItemLabelsItem]
  var labels_url: String
  var milestone: Null
  var node_id: String
  var number: Double
  var pull_request: SearchIssuesResponseItemsItemPullRequest
  var repository_url: String
  var score: Double
  var state: String
  var title: String
  var updated_at: String
  var url: String
  var user: SearchIssuesResponseItemsItemUser
}

object SearchIssuesResponseItemsItem {
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
    labels: js.Array[SearchIssuesResponseItemsItemLabelsItem],
    labels_url: String,
    milestone: Null,
    node_id: String,
    number: Double,
    pull_request: SearchIssuesResponseItemsItemPullRequest,
    repository_url: String,
    score: Double,
    state: String,
    title: String,
    updated_at: String,
    url: String,
    user: SearchIssuesResponseItemsItemUser
  ): SearchIssuesResponseItemsItem = {
    val __obj = js.Dynamic.literal(assignee = assignee, body = body, closed_at = closed_at, comments = comments, comments_url = comments_url, created_at = created_at, events_url = events_url, html_url = html_url, id = id, labels = labels, labels_url = labels_url, milestone = milestone, node_id = node_id, number = number, pull_request = pull_request, repository_url = repository_url, score = score, state = state, title = title, updated_at = updated_at, url = url, user = user)
  
    __obj.asInstanceOf[SearchIssuesResponseItemsItem]
  }
}

