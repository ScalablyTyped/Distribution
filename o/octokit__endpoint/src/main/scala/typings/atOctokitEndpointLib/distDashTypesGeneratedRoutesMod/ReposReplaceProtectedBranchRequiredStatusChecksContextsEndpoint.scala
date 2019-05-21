package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposReplaceProtectedBranchRequiredStatusChecksContextsEndpoint extends js.Object {
  var branch: java.lang.String
  var contexts: js.Array[java.lang.String]
  var owner: java.lang.String
  var repo: java.lang.String
}

object ReposReplaceProtectedBranchRequiredStatusChecksContextsEndpoint {
  @scala.inline
  def apply(
    branch: java.lang.String,
    contexts: js.Array[java.lang.String],
    owner: java.lang.String,
    repo: java.lang.String
  ): ReposReplaceProtectedBranchRequiredStatusChecksContextsEndpoint = {
    val __obj = js.Dynamic.literal(branch = branch, contexts = contexts, owner = owner, repo = repo)
  
    __obj.asInstanceOf[ReposReplaceProtectedBranchRequiredStatusChecksContextsEndpoint]
  }
}

