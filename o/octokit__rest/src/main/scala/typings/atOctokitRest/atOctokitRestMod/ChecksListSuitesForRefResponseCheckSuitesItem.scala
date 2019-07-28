package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChecksListSuitesForRefResponseCheckSuitesItem extends js.Object {
  var after: String
  var app: ChecksListSuitesForRefResponseCheckSuitesItemApp
  var before: String
  var conclusion: String
  var head_branch: String
  var head_sha: String
  var id: Double
  var node_id: String
  var pull_requests: js.Array[_]
  var repository: ChecksListSuitesForRefResponseCheckSuitesItemRepository
  var status: String
  var url: String
}

object ChecksListSuitesForRefResponseCheckSuitesItem {
  @scala.inline
  def apply(
    after: String,
    app: ChecksListSuitesForRefResponseCheckSuitesItemApp,
    before: String,
    conclusion: String,
    head_branch: String,
    head_sha: String,
    id: Double,
    node_id: String,
    pull_requests: js.Array[_],
    repository: ChecksListSuitesForRefResponseCheckSuitesItemRepository,
    status: String,
    url: String
  ): ChecksListSuitesForRefResponseCheckSuitesItem = {
    val __obj = js.Dynamic.literal(after = after, app = app, before = before, conclusion = conclusion, head_branch = head_branch, head_sha = head_sha, id = id, node_id = node_id, pull_requests = pull_requests, repository = repository, status = status, url = url)
  
    __obj.asInstanceOf[ChecksListSuitesForRefResponseCheckSuitesItem]
  }
}

