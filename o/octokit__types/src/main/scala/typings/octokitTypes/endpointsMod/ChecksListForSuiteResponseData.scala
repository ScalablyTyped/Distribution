package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Checksuite
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChecksListForSuiteResponseData extends js.Object {
  var check_runs: js.Array[Checksuite]
  var total_count: Double
}

object ChecksListForSuiteResponseData {
  @scala.inline
  def apply(check_runs: js.Array[Checksuite], total_count: Double): ChecksListForSuiteResponseData = {
    val __obj = js.Dynamic.literal(check_runs = check_runs.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChecksListForSuiteResponseData]
  }
}

