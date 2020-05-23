package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposReplaceProtectedBranchRequiredStatusChecksContextsEndpoint extends js.Object {
  var branch: String
  /**
    * contexts parameter
    */
  var contexts: js.Array[String]
  var owner: String
  var repo: String
}

object ReposReplaceProtectedBranchRequiredStatusChecksContextsEndpoint {
  @scala.inline
  def apply(branch: String, contexts: js.Array[String], owner: String, repo: String): ReposReplaceProtectedBranchRequiredStatusChecksContextsEndpoint = {
    val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any], contexts = contexts.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposReplaceProtectedBranchRequiredStatusChecksContextsEndpoint]
  }
}

