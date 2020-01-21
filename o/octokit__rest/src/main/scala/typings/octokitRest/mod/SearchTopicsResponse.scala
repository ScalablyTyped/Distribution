package typings.octokitRest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchTopicsResponse extends js.Object {
  var incomplete_results: Boolean
  var items: js.Array[SearchTopicsResponseItemsItem]
  var total_count: Double
}

object SearchTopicsResponse {
  @scala.inline
  def apply(incomplete_results: Boolean, items: js.Array[SearchTopicsResponseItemsItem], total_count: Double): SearchTopicsResponse = {
    val __obj = js.Dynamic.literal(incomplete_results = incomplete_results.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SearchTopicsResponse]
  }
}

