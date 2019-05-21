package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetProtectedBranchAdminEnforcementEndpoint extends js.Object {
  var branch: java.lang.String
  var owner: java.lang.String
  var repo: java.lang.String
}

object ReposGetProtectedBranchAdminEnforcementEndpoint {
  @scala.inline
  def apply(branch: java.lang.String, owner: java.lang.String, repo: java.lang.String): ReposGetProtectedBranchAdminEnforcementEndpoint = {
    val __obj = js.Dynamic.literal(branch = branch, owner = owner, repo = repo)
  
    __obj.asInstanceOf[ReposGetProtectedBranchAdminEnforcementEndpoint]
  }
}

