package typings.octokitRest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposAddProtectedBranchAdminEnforcementResponse extends js.Object {
  var enabled: Boolean
  var url: String
}

object ReposAddProtectedBranchAdminEnforcementResponse {
  @scala.inline
  def apply(enabled: Boolean, url: String): ReposAddProtectedBranchAdminEnforcementResponse = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReposAddProtectedBranchAdminEnforcementResponse]
  }
}

