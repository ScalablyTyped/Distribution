package typings.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChecksGetSuiteResponse extends js.Object {
  var after: String
  var app: ChecksGetSuiteResponseApp
  var before: String
  var conclusion: String
  var head_branch: String
  var head_sha: String
  var id: Double
  var node_id: String
  var pull_requests: js.Array[_]
  var repository: ChecksGetSuiteResponseRepository
  var status: String
  var url: String
}

object ChecksGetSuiteResponse {
  @scala.inline
  def apply(
    after: String,
    app: ChecksGetSuiteResponseApp,
    before: String,
    conclusion: String,
    head_branch: String,
    head_sha: String,
    id: Double,
    node_id: String,
    pull_requests: js.Array[_],
    repository: ChecksGetSuiteResponseRepository,
    status: String,
    url: String
  ): ChecksGetSuiteResponse = {
    val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any], app = app.asInstanceOf[js.Any], before = before.asInstanceOf[js.Any], conclusion = conclusion.asInstanceOf[js.Any], head_branch = head_branch.asInstanceOf[js.Any], head_sha = head_sha.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], pull_requests = pull_requests.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ChecksGetSuiteResponse]
  }
}

