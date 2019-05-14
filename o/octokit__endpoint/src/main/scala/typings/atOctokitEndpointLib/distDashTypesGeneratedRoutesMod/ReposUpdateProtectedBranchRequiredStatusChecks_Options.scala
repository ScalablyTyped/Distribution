package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposUpdateProtectedBranchRequiredStatusChecks_Options extends js.Object {
  var branch: java.lang.String
  var contexts: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var owner: java.lang.String
  var repo: java.lang.String
  var strict: js.UndefOr[scala.Boolean] = js.undefined
}

object ReposUpdateProtectedBranchRequiredStatusChecks_Options {
  @scala.inline
  def apply(
    branch: java.lang.String,
    owner: java.lang.String,
    repo: java.lang.String,
    contexts: js.Array[java.lang.String] = null,
    strict: js.UndefOr[scala.Boolean] = js.undefined
  ): ReposUpdateProtectedBranchRequiredStatusChecks_Options = {
    val __obj = js.Dynamic.literal(branch = branch, owner = owner, repo = repo)
    if (contexts != null) __obj.updateDynamic("contexts")(contexts)
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict)
    __obj.asInstanceOf[ReposUpdateProtectedBranchRequiredStatusChecks_Options]
  }
}

