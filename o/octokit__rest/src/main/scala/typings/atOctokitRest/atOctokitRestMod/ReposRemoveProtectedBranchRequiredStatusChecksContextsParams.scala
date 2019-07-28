package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposRemoveProtectedBranchRequiredStatusChecksContextsParams extends js.Object {
  var branch: String
  var contexts: js.Array[String]
  var owner: String
  var repo: String
}

object ReposRemoveProtectedBranchRequiredStatusChecksContextsParams {
  @scala.inline
  def apply(branch: String, contexts: js.Array[String], owner: String, repo: String): ReposRemoveProtectedBranchRequiredStatusChecksContextsParams = {
    val __obj = js.Dynamic.literal(branch = branch, contexts = contexts, owner = owner, repo = repo)
  
    __obj.asInstanceOf[ReposRemoveProtectedBranchRequiredStatusChecksContextsParams]
  }
}

