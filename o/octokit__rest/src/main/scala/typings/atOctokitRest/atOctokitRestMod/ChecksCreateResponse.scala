package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChecksCreateResponse extends js.Object {
  var app: ChecksCreateResponseApp
  var check_suite: ChecksCreateResponseCheckSuite
  var completed_at: Null | String
  var conclusion: Null | String
  var details_url: String
  var external_id: String
  var head_sha: String
  var html_url: String
  var id: Double
  var name: String
  var node_id: String
  var output: ChecksCreateResponseOutput
  var pull_requests: js.Array[ChecksCreateResponsePullRequestsItem]
  var started_at: String
  var status: String
  var url: String
}

object ChecksCreateResponse {
  @scala.inline
  def apply(
    app: ChecksCreateResponseApp,
    check_suite: ChecksCreateResponseCheckSuite,
    details_url: String,
    external_id: String,
    head_sha: String,
    html_url: String,
    id: Double,
    name: String,
    node_id: String,
    output: ChecksCreateResponseOutput,
    pull_requests: js.Array[ChecksCreateResponsePullRequestsItem],
    started_at: String,
    status: String,
    url: String,
    completed_at: String = null,
    conclusion: String = null
  ): ChecksCreateResponse = {
    val __obj = js.Dynamic.literal(app = app, check_suite = check_suite, details_url = details_url, external_id = external_id, head_sha = head_sha, html_url = html_url, id = id, name = name, node_id = node_id, output = output, pull_requests = pull_requests, started_at = started_at, status = status, url = url)
    if (completed_at != null) __obj.updateDynamic("completed_at")(completed_at)
    if (conclusion != null) __obj.updateDynamic("conclusion")(conclusion)
    __obj.asInstanceOf[ChecksCreateResponse]
  }
}

