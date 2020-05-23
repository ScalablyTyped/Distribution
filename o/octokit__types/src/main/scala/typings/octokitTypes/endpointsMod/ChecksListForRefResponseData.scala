package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Checksuite
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChecksListForRefResponseData extends js.Object {
  var check_runs: js.Array[Checksuite]
  var total_count: Double
}

object ChecksListForRefResponseData {
  @scala.inline
  def apply(check_runs: js.Array[Checksuite], total_count: Double): ChecksListForRefResponseData = {
    val __obj = js.Dynamic.literal(check_runs = check_runs.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChecksListForRefResponseData]
  }
}

