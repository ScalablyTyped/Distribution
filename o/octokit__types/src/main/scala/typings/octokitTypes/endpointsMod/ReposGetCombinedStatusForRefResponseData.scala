package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Archiveurl
import typings.octokitTypes.anon.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetCombinedStatusForRefResponseData extends js.Object {
  var commit_url: String
  var repository: Archiveurl
  var sha: String
  var state: String
  var statuses: js.Array[Context]
  var total_count: Double
  var url: String
}

object ReposGetCombinedStatusForRefResponseData {
  @scala.inline
  def apply(
    commit_url: String,
    repository: Archiveurl,
    sha: String,
    state: String,
    statuses: js.Array[Context],
    total_count: Double,
    url: String
  ): ReposGetCombinedStatusForRefResponseData = {
    val __obj = js.Dynamic.literal(commit_url = commit_url.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], statuses = statuses.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposGetCombinedStatusForRefResponseData]
  }
}

