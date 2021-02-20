package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Runnersurl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnterpriseAdminListSelfHostedRunnerGroupsForEnterpriseResponseData extends StObject {
  
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
  implicit class EnterpriseAdminListSelfHostedRunnerGroupsForEnterpriseResponseDataMutableBuilder[Self <: EnterpriseAdminListSelfHostedRunnerGroupsForEnterpriseResponseData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRunner_groups(value: js.Array[Runnersurl]): Self = StObject.set(x, "runner_groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunner_groupsVarargs(value: Runnersurl*): Self = StObject.set(x, "runner_groups", js.Array(value :_*))
    
    @scala.inline
    def setTotal_count(value: Double): Self = StObject.set(x, "total_count", value.asInstanceOf[js.Any])
  }
}
