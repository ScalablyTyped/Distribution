package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposRemoveProtectedBranchAdminEnforcementEndpoint extends js.Object {
  var branch: String
  var owner: String
  var repo: String
}

object ReposRemoveProtectedBranchAdminEnforcementEndpoint {
  @scala.inline
  def apply(branch: String, owner: String, repo: String): ReposRemoveProtectedBranchAdminEnforcementEndpoint = {
    val __obj = js.Dynamic.literal(branch = branch, owner = owner, repo = repo)
  
    __obj.asInstanceOf[ReposRemoveProtectedBranchAdminEnforcementEndpoint]
  }
}

