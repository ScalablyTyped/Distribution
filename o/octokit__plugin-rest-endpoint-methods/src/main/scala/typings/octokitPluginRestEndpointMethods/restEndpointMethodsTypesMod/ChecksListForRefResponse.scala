package typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChecksListForRefResponse extends js.Object {
  var check_runs: js.Array[ChecksListForRefResponseCheckRunsItem]
  var total_count: Double
}

object ChecksListForRefResponse {
  @scala.inline
  def apply(check_runs: js.Array[ChecksListForRefResponseCheckRunsItem], total_count: Double): ChecksListForRefResponse = {
    val __obj = js.Dynamic.literal(check_runs = check_runs.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ChecksListForRefResponse]
  }
}

