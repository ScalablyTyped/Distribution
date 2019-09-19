package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposListUsersWithAccessToProtectedBranchParams extends js.Object {
  var branch: String
  var owner: String
  var repo: String
}

object ReposListUsersWithAccessToProtectedBranchParams {
  @scala.inline
  def apply(branch: String, owner: String, repo: String): ReposListUsersWithAccessToProtectedBranchParams = {
    val __obj = js.Dynamic.literal(branch = branch, owner = owner, repo = repo)
  
    __obj.asInstanceOf[ReposListUsersWithAccessToProtectedBranchParams]
  }
}

