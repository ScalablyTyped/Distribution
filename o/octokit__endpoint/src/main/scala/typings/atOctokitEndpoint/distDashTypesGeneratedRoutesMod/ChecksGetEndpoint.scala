package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChecksGetEndpoint extends js.Object {
  var check_run_id: Double
  var owner: String
  var repo: String
}

object ChecksGetEndpoint {
  @scala.inline
  def apply(check_run_id: Double, owner: String, repo: String): ChecksGetEndpoint = {
    val __obj = js.Dynamic.literal(check_run_id = check_run_id, owner = owner, repo = repo)
  
    __obj.asInstanceOf[ChecksGetEndpoint]
  }
}

