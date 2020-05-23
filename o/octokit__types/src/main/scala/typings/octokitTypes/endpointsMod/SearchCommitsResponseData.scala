package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Repository
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchCommitsResponseData extends js.Object {
  var incomplete_results: Boolean
  var items: js.Array[Repository]
  var total_count: Double
}

object SearchCommitsResponseData {
  @scala.inline
  def apply(incomplete_results: Boolean, items: js.Array[Repository], total_count: Double): SearchCommitsResponseData = {
    val __obj = js.Dynamic.literal(incomplete_results = incomplete_results.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchCommitsResponseData]
  }
}

