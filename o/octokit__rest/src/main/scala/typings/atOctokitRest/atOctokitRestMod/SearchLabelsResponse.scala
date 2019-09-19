package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchLabelsResponse extends js.Object {
  var incomplete_results: Boolean
  var items: js.Array[SearchLabelsResponseItemsItem]
  var total_count: Double
}

object SearchLabelsResponse {
  @scala.inline
  def apply(incomplete_results: Boolean, items: js.Array[SearchLabelsResponseItemsItem], total_count: Double): SearchLabelsResponse = {
    val __obj = js.Dynamic.literal(incomplete_results = incomplete_results, items = items, total_count = total_count)
  
    __obj.asInstanceOf[SearchLabelsResponse]
  }
}

