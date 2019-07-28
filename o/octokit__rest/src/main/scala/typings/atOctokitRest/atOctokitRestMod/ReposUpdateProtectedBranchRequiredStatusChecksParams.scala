package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposUpdateProtectedBranchRequiredStatusChecksParams extends js.Object {
  var branch: String
  /**
    * The list of status checks to require in order to merge into this branch
    */
  var contexts: js.UndefOr[js.Array[String]] = js.undefined
  var owner: String
  var repo: String
  /**
    * Require branches to be up to date before merging.
    */
  var strict: js.UndefOr[Boolean] = js.undefined
}

object ReposUpdateProtectedBranchRequiredStatusChecksParams {
  @scala.inline
  def apply(
    branch: String,
    owner: String,
    repo: String,
    contexts: js.Array[String] = null,
    strict: js.UndefOr[Boolean] = js.undefined
  ): ReposUpdateProtectedBranchRequiredStatusChecksParams = {
    val __obj = js.Dynamic.literal(branch = branch, owner = owner, repo = repo)
    if (contexts != null) __obj.updateDynamic("contexts")(contexts)
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict)
    __obj.asInstanceOf[ReposUpdateProtectedBranchRequiredStatusChecksParams]
  }
}

