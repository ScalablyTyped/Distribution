package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposUpdateProtectedBranchRequiredStatusChecksEndpoint extends js.Object {
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

object ReposUpdateProtectedBranchRequiredStatusChecksEndpoint {
  @scala.inline
  def apply(
    branch: String,
    owner: String,
    repo: String,
    contexts: js.Array[String] = null,
    strict: js.UndefOr[Boolean] = js.undefined
  ): ReposUpdateProtectedBranchRequiredStatusChecksEndpoint = {
    val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    if (contexts != null) __obj.updateDynamic("contexts")(contexts.asInstanceOf[js.Any])
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposUpdateProtectedBranchRequiredStatusChecksEndpoint]
  }
}

