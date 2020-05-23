package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchLabelsResponseData extends js.Object {
  var incomplete_results: Boolean
  var items: js.Array[Default]
  var total_count: Double
}

object SearchLabelsResponseData {
  @scala.inline
  def apply(incomplete_results: Boolean, items: js.Array[Default], total_count: Double): SearchLabelsResponseData = {
    val __obj = js.Dynamic.literal(incomplete_results = incomplete_results.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchLabelsResponseData]
  }
}

