package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Runnersurl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnterpriseAdminListSelfHostedRunnerGroupsForEnterpriseResponseData extends js.Object {
  
  var runner_groups: js.Array[Runnersurl] = js.native
  
  var total_count: Double = js.native
}
object EnterpriseAdminListSelfHostedRunnerGroupsForEnterpriseResponseData {
  
  @scala.inline
  def apply(runner_groups: js.Array[Runnersurl], total_count: Double): EnterpriseAdminListSelfHostedRunnerGroupsForEnterpriseResponseData = {
    val __obj = js.Dynamic.literal(runner_groups = runner_groups.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnterpriseAdminListSelfHostedRunnerGroupsForEnterpriseResponseData]
  }
  
  @scala.inline
  implicit class EnterpriseAdminListSelfHostedRunnerGroupsForEnterpriseResponseDataOps[Self <: EnterpriseAdminListSelfHostedRunnerGroupsForEnterpriseResponseData] (val x: Self) extends AnyVal {
    
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
    def setRunner_groupsVarargs(value: Runnersurl*): Self = this.set("runner_groups", js.Array(value :_*))
    
    @scala.inline
    def setRunner_groups(value: js.Array[Runnersurl]): Self = this.set("runner_groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotal_count(value: Double): Self = this.set("total_count", value.asInstanceOf[js.Any])
  }
}
