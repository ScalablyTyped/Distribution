package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.After
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChecksListSuitesForRefResponseData extends js.Object {
  var check_suites: js.Array[After]
  var total_count: Double
}

object ChecksListSuitesForRefResponseData {
  @scala.inline
  def apply(check_suites: js.Array[After], total_count: Double): ChecksListSuitesForRefResponseData = {
    val __obj = js.Dynamic.literal(check_suites = check_suites.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChecksListSuitesForRefResponseData]
  }
}

