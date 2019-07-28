package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetCombinedStatusForRefResponse extends js.Object {
  var commit_url: String
  var repository: ReposGetCombinedStatusForRefResponseRepository
  var sha: String
  var state: String
  var statuses: js.Array[ReposGetCombinedStatusForRefResponseStatusesItem]
  var total_count: Double
  var url: String
}

object ReposGetCombinedStatusForRefResponse {
  @scala.inline
  def apply(
    commit_url: String,
    repository: ReposGetCombinedStatusForRefResponseRepository,
    sha: String,
    state: String,
    statuses: js.Array[ReposGetCombinedStatusForRefResponseStatusesItem],
    total_count: Double,
    url: String
  ): ReposGetCombinedStatusForRefResponse = {
    val __obj = js.Dynamic.literal(commit_url = commit_url, repository = repository, sha = sha, state = state, statuses = statuses, total_count = total_count, url = url)
  
    __obj.asInstanceOf[ReposGetCombinedStatusForRefResponse]
  }
}

