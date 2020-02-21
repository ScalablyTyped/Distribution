package typings.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChecksListSuitesForRefResponse extends js.Object {
  var check_suites: js.Array[ChecksListSuitesForRefResponseCheckSuitesItem]
  var total_count: Double
}

object ChecksListSuitesForRefResponse {
  @scala.inline
  def apply(check_suites: js.Array[ChecksListSuitesForRefResponseCheckSuitesItem], total_count: Double): ChecksListSuitesForRefResponse = {
    val __obj = js.Dynamic.literal(check_suites = check_suites.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ChecksListSuitesForRefResponse]
  }
}

