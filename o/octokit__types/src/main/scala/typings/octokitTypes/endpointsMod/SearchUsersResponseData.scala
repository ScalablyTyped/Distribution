package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Organizationsurl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchUsersResponseData extends js.Object {
  var incomplete_results: Boolean
  var items: js.Array[Organizationsurl]
  var total_count: Double
}

object SearchUsersResponseData {
  @scala.inline
  def apply(incomplete_results: Boolean, items: js.Array[Organizationsurl], total_count: Double): SearchUsersResponseData = {
    val __obj = js.Dynamic.literal(incomplete_results = incomplete_results.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchUsersResponseData]
  }
}

