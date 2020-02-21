package typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetProtectedBranchAdminEnforcementResponse extends js.Object {
  var enabled: Boolean
  var url: String
}

object ReposGetProtectedBranchAdminEnforcementResponse {
  @scala.inline
  def apply(enabled: Boolean, url: String): ReposGetProtectedBranchAdminEnforcementResponse = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReposGetProtectedBranchAdminEnforcementResponse]
  }
}

