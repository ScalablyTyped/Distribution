package typings.octokitPluginRestEndpointMethods.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchCodeResponse extends js.Object {
  var incomplete_results: Boolean
  var items: js.Array[SearchCodeResponseItemsItem]
  var total_count: Double
}

object SearchCodeResponse {
  @scala.inline
  def apply(incomplete_results: Boolean, items: js.Array[SearchCodeResponseItemsItem], total_count: Double): SearchCodeResponse = {
    val __obj = js.Dynamic.literal(incomplete_results = incomplete_results.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SearchCodeResponse]
  }
}

