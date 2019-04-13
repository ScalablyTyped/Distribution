package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChecksListSuitesForRefResponseCheckSuitesItem extends js.Object {
  var after: java.lang.String
  var app: ChecksListSuitesForRefResponseCheckSuitesItemApp
  var before: java.lang.String
  var conclusion: java.lang.String
  var head_branch: java.lang.String
  var head_sha: java.lang.String
  var id: scala.Double
  var node_id: java.lang.String
  var pull_requests: js.Array[_]
  var repository: ChecksListSuitesForRefResponseCheckSuitesItemRepository
  var status: java.lang.String
  var url: java.lang.String
}

object ChecksListSuitesForRefResponseCheckSuitesItem {
  @scala.inline
  def apply(
    after: java.lang.String,
    app: ChecksListSuitesForRefResponseCheckSuitesItemApp,
    before: java.lang.String,
    conclusion: java.lang.String,
    head_branch: java.lang.String,
    head_sha: java.lang.String,
    id: scala.Double,
    node_id: java.lang.String,
    pull_requests: js.Array[_],
    repository: ChecksListSuitesForRefResponseCheckSuitesItemRepository,
    status: java.lang.String,
    url: java.lang.String
  ): ChecksListSuitesForRefResponseCheckSuitesItem = {
    val __obj = js.Dynamic.literal(after = after, app = app, before = before, conclusion = conclusion, head_branch = head_branch, head_sha = head_sha, id = id, node_id = node_id, pull_requests = pull_requests, repository = repository, status = status, url = url)
  
    __obj.asInstanceOf[ChecksListSuitesForRefResponseCheckSuitesItem]
  }
}

