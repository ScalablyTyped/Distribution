package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChecksListSuitesForRefResponse extends js.Object {
  var check_suites: js.Array[ChecksListSuitesForRefResponseCheckSuitesItem]
  var total_count: scala.Double
}

object ChecksListSuitesForRefResponse {
  @scala.inline
  def apply(check_suites: js.Array[ChecksListSuitesForRefResponseCheckSuitesItem], total_count: scala.Double): ChecksListSuitesForRefResponse = {
    val __obj = js.Dynamic.literal(check_suites = check_suites, total_count = total_count)
  
    __obj.asInstanceOf[ChecksListSuitesForRefResponse]
  }
}

