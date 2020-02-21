package typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchCommitsResponse extends js.Object {
  var incomplete_results: Boolean
  var items: js.Array[SearchCommitsResponseItemsItem]
  var total_count: Double
}

object SearchCommitsResponse {
  @scala.inline
  def apply(incomplete_results: Boolean, items: js.Array[SearchCommitsResponseItemsItem], total_count: Double): SearchCommitsResponse = {
    val __obj = js.Dynamic.literal(incomplete_results = incomplete_results.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SearchCommitsResponse]
  }
}

