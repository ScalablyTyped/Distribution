package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChecksGetParams extends js.Object {
  var check_run_id: Double
  var owner: String
  var repo: String
}

object ChecksGetParams {
  @scala.inline
  def apply(check_run_id: Double, owner: String, repo: String): ChecksGetParams = {
    val __obj = js.Dynamic.literal(check_run_id = check_run_id, owner = owner, repo = repo)
  
    __obj.asInstanceOf[ChecksGetParams]
  }
}

