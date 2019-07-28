package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposUpdateBranchProtectionParamsRequiredStatusChecks extends js.Object {
  var contexts: js.Array[String]
  var strict: Boolean
}

object ReposUpdateBranchProtectionParamsRequiredStatusChecks {
  @scala.inline
  def apply(contexts: js.Array[String], strict: Boolean): ReposUpdateBranchProtectionParamsRequiredStatusChecks = {
    val __obj = js.Dynamic.literal(contexts = contexts, strict = strict)
  
    __obj.asInstanceOf[ReposUpdateBranchProtectionParamsRequiredStatusChecks]
  }
}

