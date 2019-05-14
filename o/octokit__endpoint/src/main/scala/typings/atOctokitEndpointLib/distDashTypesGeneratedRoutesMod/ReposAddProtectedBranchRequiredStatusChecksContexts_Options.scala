package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposAddProtectedBranchRequiredStatusChecksContexts_Options extends js.Object {
  var branch: java.lang.String
  var contexts: js.Array[java.lang.String]
  var owner: java.lang.String
  var repo: java.lang.String
}

object ReposAddProtectedBranchRequiredStatusChecksContexts_Options {
  @scala.inline
  def apply(
    branch: java.lang.String,
    contexts: js.Array[java.lang.String],
    owner: java.lang.String,
    repo: java.lang.String
  ): ReposAddProtectedBranchRequiredStatusChecksContexts_Options = {
    val __obj = js.Dynamic.literal(branch = branch, contexts = contexts, owner = owner, repo = repo)
  
    __obj.asInstanceOf[ReposAddProtectedBranchRequiredStatusChecksContexts_Options]
  }
}

