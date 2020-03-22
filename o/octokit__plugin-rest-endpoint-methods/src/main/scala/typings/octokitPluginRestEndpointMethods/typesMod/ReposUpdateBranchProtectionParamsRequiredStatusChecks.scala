package typings.octokitPluginRestEndpointMethods.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposUpdateBranchProtectionParamsRequiredStatusChecks extends js.Object {
  /**
    * The list of status checks to require in order to merge into this branch
    */
  var contexts: js.Array[String]
  /**
    * Require branches to be up to date before merging.
    */
  var strict: Boolean
}

object ReposUpdateBranchProtectionParamsRequiredStatusChecks {
  @scala.inline
  def apply(contexts: js.Array[String], strict: Boolean): ReposUpdateBranchProtectionParamsRequiredStatusChecks = {
    val __obj = js.Dynamic.literal(contexts = contexts.asInstanceOf[js.Any], strict = strict.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReposUpdateBranchProtectionParamsRequiredStatusChecks]
  }
}

