package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetCombinedStatusForRefResponse extends js.Object {
  var commit_url: java.lang.String
  var repository: ReposGetCombinedStatusForRefResponseRepository
  var sha: java.lang.String
  var state: java.lang.String
  var statuses: js.Array[ReposGetCombinedStatusForRefResponseStatusesItem]
  var total_count: scala.Double
  var url: java.lang.String
}

object ReposGetCombinedStatusForRefResponse {
  @scala.inline
  def apply(
    commit_url: java.lang.String,
    repository: ReposGetCombinedStatusForRefResponseRepository,
    sha: java.lang.String,
    state: java.lang.String,
    statuses: js.Array[ReposGetCombinedStatusForRefResponseStatusesItem],
    total_count: scala.Double,
    url: java.lang.String
  ): ReposGetCombinedStatusForRefResponse = {
    val __obj = js.Dynamic.literal(commit_url = commit_url, repository = repository, sha = sha, state = state, statuses = statuses, total_count = total_count, url = url)
  
    __obj.asInstanceOf[ReposGetCombinedStatusForRefResponse]
  }
}

