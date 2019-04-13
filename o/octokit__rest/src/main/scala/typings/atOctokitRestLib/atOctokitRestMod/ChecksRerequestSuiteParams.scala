package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChecksRerequestSuiteParams extends js.Object {
  var check_suite_id: scala.Double
  var owner: java.lang.String
  var repo: java.lang.String
}

object ChecksRerequestSuiteParams {
  @scala.inline
  def apply(check_suite_id: scala.Double, owner: java.lang.String, repo: java.lang.String): ChecksRerequestSuiteParams = {
    val __obj = js.Dynamic.literal(check_suite_id = check_suite_id, owner = owner, repo = repo)
  
    __obj.asInstanceOf[ChecksRerequestSuiteParams]
  }
}

