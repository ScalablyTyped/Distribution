package typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetUsersWithAccessToProtectedBranchParams extends js.Object {
  var branch: String
  var owner: String
  var repo: String
}

object ReposGetUsersWithAccessToProtectedBranchParams {
  @scala.inline
  def apply(branch: String, owner: String, repo: String): ReposGetUsersWithAccessToProtectedBranchParams = {
    val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReposGetUsersWithAccessToProtectedBranchParams]
  }
}

