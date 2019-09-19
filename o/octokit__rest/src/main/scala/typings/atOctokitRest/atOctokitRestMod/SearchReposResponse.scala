package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchReposResponse extends js.Object {
  var incomplete_results: Boolean
  var items: js.Array[SearchReposResponseItemsItem]
  var total_count: Double
}

object SearchReposResponse {
  @scala.inline
  def apply(incomplete_results: Boolean, items: js.Array[SearchReposResponseItemsItem], total_count: Double): SearchReposResponse = {
    val __obj = js.Dynamic.literal(incomplete_results = incomplete_results, items = items, total_count = total_count)
  
    __obj.asInstanceOf[SearchReposResponse]
  }
}

