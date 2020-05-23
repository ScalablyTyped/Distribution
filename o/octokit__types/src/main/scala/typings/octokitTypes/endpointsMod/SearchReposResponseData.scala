package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Defaultbranch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchReposResponseData extends js.Object {
  var incomplete_results: Boolean
  var items: js.Array[Defaultbranch]
  var total_count: Double
}

object SearchReposResponseData {
  @scala.inline
  def apply(incomplete_results: Boolean, items: js.Array[Defaultbranch], total_count: Double): SearchReposResponseData = {
    val __obj = js.Dynamic.literal(incomplete_results = incomplete_results.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchReposResponseData]
  }
}

