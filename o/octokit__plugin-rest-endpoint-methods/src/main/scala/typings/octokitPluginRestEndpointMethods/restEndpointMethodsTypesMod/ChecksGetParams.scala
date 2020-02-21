package typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

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
    val __obj = js.Dynamic.literal(check_run_id = check_run_id.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ChecksGetParams]
  }
}

