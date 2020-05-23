package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Giturl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchCodeResponseData extends js.Object {
  var incomplete_results: Boolean
  var items: js.Array[Giturl]
  var total_count: Double
}

object SearchCodeResponseData {
  @scala.inline
  def apply(incomplete_results: Boolean, items: js.Array[Giturl], total_count: Double): SearchCodeResponseData = {
    val __obj = js.Dynamic.literal(incomplete_results = incomplete_results.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchCodeResponseData]
  }
}

