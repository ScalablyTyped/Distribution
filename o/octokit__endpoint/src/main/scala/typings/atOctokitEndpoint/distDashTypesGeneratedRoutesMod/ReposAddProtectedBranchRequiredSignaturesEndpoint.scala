package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposAddProtectedBranchRequiredSignaturesEndpoint extends js.Object {
  var branch: String
  var owner: String
  var repo: String
}

object ReposAddProtectedBranchRequiredSignaturesEndpoint {
  @scala.inline
  def apply(branch: String, owner: String, repo: String): ReposAddProtectedBranchRequiredSignaturesEndpoint = {
    val __obj = js.Dynamic.literal(branch = branch, owner = owner, repo = repo)
  
    __obj.asInstanceOf[ReposAddProtectedBranchRequiredSignaturesEndpoint]
  }
}

