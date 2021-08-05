package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Runnersurl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnterpriseAdminListSelfHostedRunnerGroupsForEnterpriseResponseData extends StObject {
  
  var runner_groups: js.Array[Runnersurl]
  
  var total_count: Double
}
object EnterpriseAdminListSelfHostedRunnerGroupsForEnterpriseResponseData {
  
  inline def apply(runner_groups: js.Array[Runnersurl], total_count: Double): EnterpriseAdminListSelfHostedRunnerGroupsForEnterpriseResponseData = {
    val __obj = js.Dynamic.literal(runner_groups = runner_groups.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnterpriseAdminListSelfHostedRunnerGroupsForEnterpriseResponseData]
  }
  
  extension [Self <: EnterpriseAdminListSelfHostedRunnerGroupsForEnterpriseResponseData](x: Self) {
    
    inline def setRunner_groups(value: js.Array[Runnersurl]): Self = StObject.set(x, "runner_groups", value.asInstanceOf[js.Any])
    
    inline def setRunner_groupsVarargs(value: Runnersurl*): Self = StObject.set(x, "runner_groups", js.Array(value :_*))
    
    inline def setTotal_count(value: Double): Self = StObject.set(x, "total_count", value.asInstanceOf[js.Any])
  }
}
