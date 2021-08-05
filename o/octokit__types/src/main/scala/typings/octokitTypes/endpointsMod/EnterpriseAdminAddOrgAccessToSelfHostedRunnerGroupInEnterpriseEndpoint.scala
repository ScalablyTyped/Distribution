package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnterpriseAdminAddOrgAccessToSelfHostedRunnerGroupInEnterpriseEndpoint extends StObject {
  
  /**
    * The slug version of the enterprise name. You can also substitute this value with the enterprise id.
    */
  var enterprise: String
  
  /**
    * Unique identifier of an organization.
    */
  var org_id: Double
  
  /**
    * Unique identifier of the self-hosted runner group.
    */
  var runner_group_id: Double
}
object EnterpriseAdminAddOrgAccessToSelfHostedRunnerGroupInEnterpriseEndpoint {
  
  inline def apply(enterprise: String, org_id: Double, runner_group_id: Double): EnterpriseAdminAddOrgAccessToSelfHostedRunnerGroupInEnterpriseEndpoint = {
    val __obj = js.Dynamic.literal(enterprise = enterprise.asInstanceOf[js.Any], org_id = org_id.asInstanceOf[js.Any], runner_group_id = runner_group_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnterpriseAdminAddOrgAccessToSelfHostedRunnerGroupInEnterpriseEndpoint]
  }
  
  extension [Self <: EnterpriseAdminAddOrgAccessToSelfHostedRunnerGroupInEnterpriseEndpoint](x: Self) {
    
    inline def setEnterprise(value: String): Self = StObject.set(x, "enterprise", value.asInstanceOf[js.Any])
    
    inline def setOrg_id(value: Double): Self = StObject.set(x, "org_id", value.asInstanceOf[js.Any])
    
    inline def setRunner_group_id(value: Double): Self = StObject.set(x, "runner_group_id", value.asInstanceOf[js.Any])
  }
}
