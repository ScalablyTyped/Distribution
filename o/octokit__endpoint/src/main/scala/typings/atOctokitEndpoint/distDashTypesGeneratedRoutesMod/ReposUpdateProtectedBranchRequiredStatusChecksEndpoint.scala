package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposUpdateProtectedBranchRequiredStatusChecksEndpoint extends js.Object {
  var branch: String
  var contexts: js.UndefOr[js.Array[String]] = js.undefined
  var owner: String
  var repo: String
  var strict: js.UndefOr[Boolean] = js.undefined
}

object ReposUpdateProtectedBranchRequiredStatusChecksEndpoint {
  @scala.inline
  def apply(
    branch: String,
    owner: String,
    repo: String,
    contexts: js.Array[String] = null,
    strict: js.UndefOr[Boolean] = js.undefined
  ): ReposUpdateProtectedBranchRequiredStatusChecksEndpoint = {
    val __obj = js.Dynamic.literal(branch = branch, owner = owner, repo = repo)
    if (contexts != null) __obj.updateDynamic("contexts")(contexts)
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict)
    __obj.asInstanceOf[ReposUpdateProtectedBranchRequiredStatusChecksEndpoint]
  }
}

