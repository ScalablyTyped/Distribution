package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReposUpdateBranchProtectionParamsRequiredStatusChecks extends js.Object {
  var contexts: js.Array[String] = js.native
  var strict: Boolean = js.native
}

object ReposUpdateBranchProtectionParamsRequiredStatusChecks {
  @scala.inline
  def apply(contexts: js.Array[String], strict: Boolean): ReposUpdateBranchProtectionParamsRequiredStatusChecks = {
    val __obj = js.Dynamic.literal(contexts = contexts.asInstanceOf[js.Any], strict = strict.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposUpdateBranchProtectionParamsRequiredStatusChecks]
  }
  @scala.inline
  implicit class ReposUpdateBranchProtectionParamsRequiredStatusChecksOps[Self <: ReposUpdateBranchProtectionParamsRequiredStatusChecks] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setContextsVarargs(value: String*): Self = this.set("contexts", js.Array(value :_*))
    @scala.inline
    def setContexts(value: js.Array[String]): Self = this.set("contexts", value.asInstanceOf[js.Any])
    @scala.inline
    def setStrict(value: Boolean): Self = this.set("strict", value.asInstanceOf[js.Any])
  }
  
}

