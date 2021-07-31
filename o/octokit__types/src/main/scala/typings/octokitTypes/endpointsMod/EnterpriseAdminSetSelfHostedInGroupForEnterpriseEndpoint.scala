package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnterpriseAdminSetSelfHostedInGroupForEnterpriseEndpoint extends StObject {
  
  /**
    * The slug version of the enterprise name. You can also substitute this value with the enterprise id.
    */
  var enterprise: String
  
  /**
    * Unique identifier of the self-hosted runner group.
    */
  var runner_group_id: Double
  
  /**
    * List of runner IDs to add to the runner group.
    */
  var runners: js.Array[Double]
}
object EnterpriseAdminSetSelfHostedInGroupForEnterpriseEndpoint {
  
  @scala.inline
  def apply(enterprise: String, runner_group_id: Double, runners: js.Array[Double]): EnterpriseAdminSetSelfHostedInGroupForEnterpriseEndpoint = {
    val __obj = js.Dynamic.literal(enterprise = enterprise.asInstanceOf[js.Any], runner_group_id = runner_group_id.asInstanceOf[js.Any], runners = runners.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnterpriseAdminSetSelfHostedInGroupForEnterpriseEndpoint]
  }
  
  @scala.inline
  implicit class EnterpriseAdminSetSelfHostedInGroupForEnterpriseEndpointMutableBuilder[Self <: EnterpriseAdminSetSelfHostedInGroupForEnterpriseEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnterprise(value: String): Self = StObject.set(x, "enterprise", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunner_group_id(value: Double): Self = StObject.set(x, "runner_group_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunners(value: js.Array[Double]): Self = StObject.set(x, "runners", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunnersVarargs(value: Double*): Self = StObject.set(x, "runners", js.Array(value :_*))
  }
}
