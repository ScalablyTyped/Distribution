package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Createdby
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchTopicsResponseData extends js.Object {
  var incomplete_results: Boolean
  var items: js.Array[Createdby]
  var total_count: Double
}

object SearchTopicsResponseData {
  @scala.inline
  def apply(incomplete_results: Boolean, items: js.Array[Createdby], total_count: Double): SearchTopicsResponseData = {
    val __obj = js.Dynamic.literal(incomplete_results = incomplete_results.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchTopicsResponseData]
  }
}

