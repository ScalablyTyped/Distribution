package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchIssuesAndPullRequestsResponse extends js.Object {
  var incomplete_results: Boolean
  var items: js.Array[SearchIssuesAndPullRequestsResponseItemsItem]
  var total_count: Double
}

object SearchIssuesAndPullRequestsResponse {
  @scala.inline
  def apply(
    incomplete_results: Boolean,
    items: js.Array[SearchIssuesAndPullRequestsResponseItemsItem],
    total_count: Double
  ): SearchIssuesAndPullRequestsResponse = {
    val __obj = js.Dynamic.literal(incomplete_results = incomplete_results, items = items, total_count = total_count)
  
    __obj.asInstanceOf[SearchIssuesAndPullRequestsResponse]
  }
}

