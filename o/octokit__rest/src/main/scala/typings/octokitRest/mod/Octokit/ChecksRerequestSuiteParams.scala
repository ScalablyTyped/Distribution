package typings.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChecksRerequestSuiteParams extends js.Object {
  var check_suite_id: Double
  var owner: String
  var repo: String
}

object ChecksRerequestSuiteParams {
  @scala.inline
  def apply(check_suite_id: Double, owner: String, repo: String): ChecksRerequestSuiteParams = {
    val __obj = js.Dynamic.literal(check_suite_id = check_suite_id.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ChecksRerequestSuiteParams]
  }
}

