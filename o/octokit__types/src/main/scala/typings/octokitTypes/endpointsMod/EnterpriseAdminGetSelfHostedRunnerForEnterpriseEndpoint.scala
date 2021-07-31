package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnterpriseAdminGetSelfHostedRunnerForEnterpriseEndpoint extends StObject {
  
  /**
    * The slug version of the enterprise name. You can also substitute this value with the enterprise id.
    */
  var enterprise: String
  
  /**
    * Unique identifier of the self-hosted runner.
    */
  var runner_id: Double
}
object EnterpriseAdminGetSelfHostedRunnerForEnterpriseEndpoint {
  
  @scala.inline
  def apply(enterprise: String, runner_id: Double): EnterpriseAdminGetSelfHostedRunnerForEnterpriseEndpoint = {
    val __obj = js.Dynamic.literal(enterprise = enterprise.asInstanceOf[js.Any], runner_id = runner_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnterpriseAdminGetSelfHostedRunnerForEnterpriseEndpoint]
  }
  
  @scala.inline
  implicit class EnterpriseAdminGetSelfHostedRunnerForEnterpriseEndpointMutableBuilder[Self <: EnterpriseAdminGetSelfHostedRunnerForEnterpriseEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnterprise(value: String): Self = StObject.set(x, "enterprise", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunner_id(value: Double): Self = StObject.set(x, "runner_id", value.asInstanceOf[js.Any])
  }
}
