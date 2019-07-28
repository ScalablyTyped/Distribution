package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChecksCreateSuiteResponse extends js.Object {
  var after: String
  var app: ChecksCreateSuiteResponseApp
  var before: String
  var conclusion: String
  var head_branch: String
  var head_sha: String
  var id: Double
  var node_id: String
  var pull_requests: js.Array[_]
  var repository: ChecksCreateSuiteResponseRepository
  var status: String
  var url: String
}

object ChecksCreateSuiteResponse {
  @scala.inline
  def apply(
    after: String,
    app: ChecksCreateSuiteResponseApp,
    before: String,
    conclusion: String,
    head_branch: String,
    head_sha: String,
    id: Double,
    node_id: String,
    pull_requests: js.Array[_],
    repository: ChecksCreateSuiteResponseRepository,
    status: String,
    url: String
  ): ChecksCreateSuiteResponse = {
    val __obj = js.Dynamic.literal(after = after, app = app, before = before, conclusion = conclusion, head_branch = head_branch, head_sha = head_sha, id = id, node_id = node_id, pull_requests = pull_requests, repository = repository, status = status, url = url)
  
    __obj.asInstanceOf[ChecksCreateSuiteResponse]
  }
}

