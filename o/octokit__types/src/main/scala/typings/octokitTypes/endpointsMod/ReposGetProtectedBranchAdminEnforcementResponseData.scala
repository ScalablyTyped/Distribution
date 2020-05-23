package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetProtectedBranchAdminEnforcementResponseData extends js.Object {
  var enabled: Boolean
  var url: String
}

object ReposGetProtectedBranchAdminEnforcementResponseData {
  @scala.inline
  def apply(enabled: Boolean, url: String): ReposGetProtectedBranchAdminEnforcementResponseData = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposGetProtectedBranchAdminEnforcementResponseData]
  }
}

