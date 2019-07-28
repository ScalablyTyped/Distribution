package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposAddProtectedBranchUserRestrictionsParams extends js.Object {
  var branch: String
  var owner: String
  var repo: String
  var users: js.Array[String]
}

object ReposAddProtectedBranchUserRestrictionsParams {
  @scala.inline
  def apply(branch: String, owner: String, repo: String, users: js.Array[String]): ReposAddProtectedBranchUserRestrictionsParams = {
    val __obj = js.Dynamic.literal(branch = branch, owner = owner, repo = repo, users = users)
  
    __obj.asInstanceOf[ReposAddProtectedBranchUserRestrictionsParams]
  }
}

