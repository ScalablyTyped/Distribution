package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposAddProtectedBranchUserRestrictionsEndpoint extends js.Object {
  var branch: java.lang.String
  var owner: java.lang.String
  var repo: java.lang.String
  var users: js.Array[java.lang.String]
}

object ReposAddProtectedBranchUserRestrictionsEndpoint {
  @scala.inline
  def apply(
    branch: java.lang.String,
    owner: java.lang.String,
    repo: java.lang.String,
    users: js.Array[java.lang.String]
  ): ReposAddProtectedBranchUserRestrictionsEndpoint = {
    val __obj = js.Dynamic.literal(branch = branch, owner = owner, repo = repo, users = users)
  
    __obj.asInstanceOf[ReposAddProtectedBranchUserRestrictionsEndpoint]
  }
}

