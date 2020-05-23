package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Eventsurl
import typings.octokitTypes.anon.HtmlPullrequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsDeletePendingReviewResponseData extends js.Object {
  var _links: HtmlPullrequest
  var body: String
  var commit_id: String
  var html_url: String
  var id: Double
  var node_id: String
  var pull_request_url: String
  var state: String
  var user: Eventsurl
}

object PullsDeletePendingReviewResponseData {
  @scala.inline
  def apply(
    _links: HtmlPullrequest,
    body: String,
    commit_id: String,
    html_url: String,
    id: Double,
    node_id: String,
    pull_request_url: String,
    state: String,
    user: Eventsurl
  ): PullsDeletePendingReviewResponseData = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], commit_id = commit_id.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], pull_request_url = pull_request_url.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullsDeletePendingReviewResponseData]
  }
}

