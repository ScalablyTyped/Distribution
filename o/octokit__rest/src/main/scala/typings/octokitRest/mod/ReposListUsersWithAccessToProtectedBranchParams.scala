package typings.octokitRest.mod

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
    val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReposListUsersWithAccessToProtectedBranchParams]
  }
}

