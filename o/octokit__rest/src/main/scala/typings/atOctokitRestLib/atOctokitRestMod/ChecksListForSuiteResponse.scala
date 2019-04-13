package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChecksListForSuiteResponse extends js.Object {
  var check_runs: js.Array[ChecksListForSuiteResponseCheckRunsItem]
  var total_count: scala.Double
}

object ChecksListForSuiteResponse {
  @scala.inline
  def apply(check_runs: js.Array[ChecksListForSuiteResponseCheckRunsItem], total_count: scala.Double): ChecksListForSuiteResponse = {
    val __obj = js.Dynamic.literal(check_runs = check_runs, total_count = total_count)
  
    __obj.asInstanceOf[ChecksListForSuiteResponse]
  }
}

