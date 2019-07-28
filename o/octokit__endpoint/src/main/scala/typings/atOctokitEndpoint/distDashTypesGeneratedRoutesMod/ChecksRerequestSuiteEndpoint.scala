package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChecksRerequestSuiteEndpoint extends js.Object {
  var check_suite_id: Double
  var owner: String
  var repo: String
}

object ChecksRerequestSuiteEndpoint {
  @scala.inline
  def apply(check_suite_id: Double, owner: String, repo: String): ChecksRerequestSuiteEndpoint = {
    val __obj = js.Dynamic.literal(check_suite_id = check_suite_id, owner = owner, repo = repo)
  
    __obj.asInstanceOf[ChecksRerequestSuiteEndpoint]
  }
}

