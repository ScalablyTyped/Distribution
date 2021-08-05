package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Description
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnterpriseAdminListOrgAccessToSelfHostedRunnerGroupInEnterpriseResponseData extends StObject {
  
  var organizations: js.Array[Description]
  
  var total_count: Double
}
object EnterpriseAdminListOrgAccessToSelfHostedRunnerGroupInEnterpriseResponseData {
  
  inline def apply(organizations: js.Array[Description], total_count: Double): EnterpriseAdminListOrgAccessToSelfHostedRunnerGroupInEnterpriseResponseData = {
    val __obj = js.Dynamic.literal(organizations = organizations.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnterpriseAdminListOrgAccessToSelfHostedRunnerGroupInEnterpriseResponseData]
  }
  
  extension [Self <: EnterpriseAdminListOrgAccessToSelfHostedRunnerGroupInEnterpriseResponseData](x: Self) {
    
    inline def setOrganizations(value: js.Array[Description]): Self = StObject.set(x, "organizations", value.asInstanceOf[js.Any])
    
    inline def setOrganizationsVarargs(value: Description*): Self = StObject.set(x, "organizations", js.Array(value :_*))
    
    inline def setTotal_count(value: Double): Self = StObject.set(x, "total_count", value.asInstanceOf[js.Any])
  }
}
