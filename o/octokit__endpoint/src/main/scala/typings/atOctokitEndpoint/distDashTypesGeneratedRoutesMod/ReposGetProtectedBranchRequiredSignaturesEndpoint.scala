package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetProtectedBranchRequiredSignaturesEndpoint extends js.Object {
  var branch: String
  var owner: String
  var repo: String
}

object ReposGetProtectedBranchRequiredSignaturesEndpoint {
  @scala.inline
  def apply(branch: String, owner: String, repo: String): ReposGetProtectedBranchRequiredSignaturesEndpoint = {
    val __obj = js.Dynamic.literal(branch = branch, owner = owner, repo = repo)
  
    __obj.asInstanceOf[ReposGetProtectedBranchRequiredSignaturesEndpoint]
  }
}

