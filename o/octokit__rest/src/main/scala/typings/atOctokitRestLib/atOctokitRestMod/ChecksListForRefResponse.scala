package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChecksListForRefResponse extends js.Object {
  var check_runs: js.Array[ChecksListForRefResponseCheckRunsItem]
  var total_count: scala.Double
}

object ChecksListForRefResponse {
  @scala.inline
  def apply(check_runs: js.Array[ChecksListForRefResponseCheckRunsItem], total_count: scala.Double): ChecksListForRefResponse = {
    val __obj = js.Dynamic.literal(check_runs = check_runs, total_count = total_count)
  
    __obj.asInstanceOf[ChecksListForRefResponse]
  }
}

