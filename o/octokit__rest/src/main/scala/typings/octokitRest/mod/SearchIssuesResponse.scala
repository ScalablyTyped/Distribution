package typings.octokitRest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchIssuesResponse extends js.Object {
  var incomplete_results: Boolean
  var items: js.Array[SearchIssuesResponseItemsItem]
  var total_count: Double
}

object SearchIssuesResponse {
  @scala.inline
  def apply(incomplete_results: Boolean, items: js.Array[SearchIssuesResponseItemsItem], total_count: Double): SearchIssuesResponse = {
    val __obj = js.Dynamic.literal(incomplete_results = incomplete_results.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SearchIssuesResponse]
  }
}

