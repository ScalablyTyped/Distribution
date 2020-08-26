package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Badgeurl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionsListRepoWorkflowsResponseData extends js.Object {
  var total_count: Double = js.native
  var workflows: js.Array[Badgeurl] = js.native
}

object ActionsListRepoWorkflowsResponseData {
  @scala.inline
  def apply(total_count: Double, workflows: js.Array[Badgeurl]): ActionsListRepoWorkflowsResponseData = {
    val __obj = js.Dynamic.literal(total_count = total_count.asInstanceOf[js.Any], workflows = workflows.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionsListRepoWorkflowsResponseData]
  }
  @scala.inline
  implicit class ActionsListRepoWorkflowsResponseDataOps[Self <: ActionsListRepoWorkflowsResponseData] (val x: Self) extends AnyVal {
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
    def setTotal_count(value: Double): Self = this.set("total_count", value.asInstanceOf[js.Any])
    @scala.inline
    def setWorkflowsVarargs(value: Badgeurl*): Self = this.set("workflows", js.Array(value :_*))
    @scala.inline
    def setWorkflows(value: js.Array[Badgeurl]): Self = this.set("workflows", value.asInstanceOf[js.Any])
  }
  
}

