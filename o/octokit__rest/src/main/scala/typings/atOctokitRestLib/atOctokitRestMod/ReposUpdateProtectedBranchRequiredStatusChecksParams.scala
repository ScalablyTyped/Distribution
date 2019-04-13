package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposUpdateProtectedBranchRequiredStatusChecksParams extends js.Object {
  var branch: java.lang.String
  /**
    * The list of status checks to require in order to merge into this branch
    */
  var contexts: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var owner: java.lang.String
  var repo: java.lang.String
  /**
    * Require branches to be up to date before merging.
    */
  var strict: js.UndefOr[scala.Boolean] = js.undefined
}

object ReposUpdateProtectedBranchRequiredStatusChecksParams {
  @scala.inline
  def apply(
    branch: java.lang.String,
    owner: java.lang.String,
    repo: java.lang.String,
    contexts: js.Array[java.lang.String] = null,
    strict: js.UndefOr[scala.Boolean] = js.undefined
  ): ReposUpdateProtectedBranchRequiredStatusChecksParams = {
    val __obj = js.Dynamic.literal(branch = branch, owner = owner, repo = repo)
    if (contexts != null) __obj.updateDynamic("contexts")(contexts)
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict)
    __obj.asInstanceOf[ReposUpdateProtectedBranchRequiredStatusChecksParams]
  }
}

