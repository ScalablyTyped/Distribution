package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChecksUpdateResponse extends js.Object {
  var app: ChecksUpdateResponseApp
  var check_suite: ChecksUpdateResponseCheckSuite
  var completed_at: String
  var conclusion: String
  var details_url: String
  var external_id: String
  var head_sha: String
  var html_url: String
  var id: Double
  var name: String
  var node_id: String
  var output: ChecksUpdateResponseOutput
  var pull_requests: js.Array[ChecksUpdateResponsePullRequestsItem]
  var started_at: String
  var status: String
  var url: String
}

object ChecksUpdateResponse {
  @scala.inline
  def apply(
    app: ChecksUpdateResponseApp,
    check_suite: ChecksUpdateResponseCheckSuite,
    completed_at: String,
    conclusion: String,
    details_url: String,
    external_id: String,
    head_sha: String,
    html_url: String,
    id: Double,
    name: String,
    node_id: String,
    output: ChecksUpdateResponseOutput,
    pull_requests: js.Array[ChecksUpdateResponsePullRequestsItem],
    started_at: String,
    status: String,
    url: String
  ): ChecksUpdateResponse = {
    val __obj = js.Dynamic.literal(app = app, check_suite = check_suite, completed_at = completed_at, conclusion = conclusion, details_url = details_url, external_id = external_id, head_sha = head_sha, html_url = html_url, id = id, name = name, node_id = node_id, output = output, pull_requests = pull_requests, started_at = started_at, status = status, url = url)
  
    __obj.asInstanceOf[ChecksUpdateResponse]
  }
}

