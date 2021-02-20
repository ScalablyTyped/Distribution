package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnterpriseAdminSetOrgAccessToSelfHostedRunnerGroupInEnterpriseEndpoint extends StObject {
  
  /**
    * The slug version of the enterprise name. You can also substitute this value with the enterprise id.
    */
  var enterprise: String = js.native
  
  /**
    * Unique identifier of the self-hosted runner group.
    */
  var runner_group_id: Double = js.native
  
  /**
    * List of organization IDs that can access the runner group.
    */
  var selected_organization_ids: js.Array[Double] = js.native
}
object EnterpriseAdminSetOrgAccessToSelfHostedRunnerGroupInEnterpriseEndpoint {
  
  @scala.inline
  def apply(enterprise: String, runner_group_id: Double, selected_organization_ids: js.Array[Double]): EnterpriseAdminSetOrgAccessToSelfHostedRunnerGroupInEnterpriseEndpoint = {
    val __obj = js.Dynamic.literal(enterprise = enterprise.asInstanceOf[js.Any], runner_group_id = runner_group_id.asInstanceOf[js.Any], selected_organization_ids = selected_organization_ids.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnterpriseAdminSetOrgAccessToSelfHostedRunnerGroupInEnterpriseEndpoint]
  }
  
  @scala.inline
  implicit class EnterpriseAdminSetOrgAccessToSelfHostedRunnerGroupInEnterpriseEndpointMutableBuilder[Self <: EnterpriseAdminSetOrgAccessToSelfHostedRunnerGroupInEnterpriseEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnterprise(value: String): Self = StObject.set(x, "enterprise", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunner_group_id(value: Double): Self = StObject.set(x, "runner_group_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelected_organization_ids(value: js.Array[Double]): Self = StObject.set(x, "selected_organization_ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelected_organization_idsVarargs(value: Double*): Self = StObject.set(x, "selected_organization_ids", js.Array(value :_*))
  }
}
