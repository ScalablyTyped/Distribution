package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchUsersResponse extends js.Object {
  var incomplete_results: Boolean
  var items: js.Array[SearchUsersResponseItemsItem]
  var total_count: Double
}

object SearchUsersResponse {
  @scala.inline
  def apply(incomplete_results: Boolean, items: js.Array[SearchUsersResponseItemsItem], total_count: Double): SearchUsersResponse = {
    val __obj = js.Dynamic.literal(incomplete_results = incomplete_results, items = items, total_count = total_count)
  
    __obj.asInstanceOf[SearchUsersResponse]
  }
}

