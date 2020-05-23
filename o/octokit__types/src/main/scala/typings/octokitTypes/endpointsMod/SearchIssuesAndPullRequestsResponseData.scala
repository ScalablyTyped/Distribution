package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Labels
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchIssuesAndPullRequestsResponseData extends js.Object {
  var incomplete_results: Boolean
  var items: js.Array[Labels]
  var total_count: Double
}

object SearchIssuesAndPullRequestsResponseData {
  @scala.inline
  def apply(incomplete_results: Boolean, items: js.Array[Labels], total_count: Double): SearchIssuesAndPullRequestsResponseData = {
    val __obj = js.Dynamic.literal(incomplete_results = incomplete_results.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchIssuesAndPullRequestsResponseData]
  }
}

