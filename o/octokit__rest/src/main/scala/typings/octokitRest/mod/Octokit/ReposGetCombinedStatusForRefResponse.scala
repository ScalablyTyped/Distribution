package typings.octokitRest.mod.Octokit

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
    val __obj = js.Dynamic.literal(commit_url = commit_url.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], statuses = statuses.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReposGetCombinedStatusForRefResponse]
  }
}

