package typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposRemoveProtectedBranchUserRestrictionsParams extends js.Object {
  var branch: String
  var owner: String
  var repo: String
  var users: js.Array[String]
}

object ReposRemoveProtectedBranchUserRestrictionsParams {
  @scala.inline
  def apply(branch: String, owner: String, repo: String, users: js.Array[String]): ReposRemoveProtectedBranchUserRestrictionsParams = {
    val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReposRemoveProtectedBranchUserRestrictionsParams]
  }
}

