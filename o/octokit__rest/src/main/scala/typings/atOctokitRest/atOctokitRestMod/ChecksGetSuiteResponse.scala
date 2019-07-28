package typings.atOctokitRest.atOctokitRestMod

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
    val __obj = js.Dynamic.literal(after = after, app = app, before = before, conclusion = conclusion, head_branch = head_branch, head_sha = head_sha, id = id, node_id = node_id, pull_requests = pull_requests, repository = repository, status = status, url = url)
  
    __obj.asInstanceOf[ChecksGetSuiteResponse]
  }
}

