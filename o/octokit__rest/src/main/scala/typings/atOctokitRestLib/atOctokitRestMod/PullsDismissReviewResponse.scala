package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsDismissReviewResponse extends js.Object {
  var _links: PullsDismissReviewResponseLinks
  var body: java.lang.String
  var commit_id: java.lang.String
  var html_url: java.lang.String
  var id: scala.Double
  var node_id: java.lang.String
  var pull_request_url: java.lang.String
  var state: java.lang.String
  var user: PullsDismissReviewResponseUser
}

object PullsDismissReviewResponse {
  @scala.inline
  def apply(
    _links: PullsDismissReviewResponseLinks,
    body: java.lang.String,
    commit_id: java.lang.String,
    html_url: java.lang.String,
    id: scala.Double,
    node_id: java.lang.String,
    pull_request_url: java.lang.String,
    state: java.lang.String,
    user: PullsDismissReviewResponseUser
  ): PullsDismissReviewResponse = {
    val __obj = js.Dynamic.literal(_links = _links, body = body, commit_id = commit_id, html_url = html_url, id = id, node_id = node_id, pull_request_url = pull_request_url, state = state, user = user)
  
    __obj.asInstanceOf[PullsDismissReviewResponse]
  }
}

