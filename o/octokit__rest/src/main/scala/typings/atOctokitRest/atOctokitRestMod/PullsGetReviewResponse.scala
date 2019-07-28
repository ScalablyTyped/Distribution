package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsGetReviewResponse extends js.Object {
  var _links: PullsGetReviewResponseLinks
  var body: String
  var commit_id: String
  var html_url: String
  var id: Double
  var node_id: String
  var pull_request_url: String
  var state: String
  var user: PullsGetReviewResponseUser
}

object PullsGetReviewResponse {
  @scala.inline
  def apply(
    _links: PullsGetReviewResponseLinks,
    body: String,
    commit_id: String,
    html_url: String,
    id: Double,
    node_id: String,
    pull_request_url: String,
    state: String,
    user: PullsGetReviewResponseUser
  ): PullsGetReviewResponse = {
    val __obj = js.Dynamic.literal(_links = _links, body = body, commit_id = commit_id, html_url = html_url, id = id, node_id = node_id, pull_request_url = pull_request_url, state = state, user = user)
  
    __obj.asInstanceOf[PullsGetReviewResponse]
  }
}

