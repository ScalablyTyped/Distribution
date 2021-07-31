package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnterpriseAdminDeleteSelfHostedRunnerFromEnterpriseEndpoint extends StObject {
  
  /**
    * The slug version of the enterprise name. You can also substitute this value with the enterprise id.
    */
  var enterprise: String
  
  /**
    * Unique identifier of the self-hosted runner.
    */
  var runner_id: Double
}
object EnterpriseAdminDeleteSelfHostedRunnerFromEnterpriseEndpoint {
  
  @scala.inline
  def apply(enterprise: String, runner_id: Double): EnterpriseAdminDeleteSelfHostedRunnerFromEnterpriseEndpoint = {
    val __obj = js.Dynamic.literal(enterprise = enterprise.asInstanceOf[js.Any], runner_id = runner_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnterpriseAdminDeleteSelfHostedRunnerFromEnterpriseEndpoint]
  }
  
  @scala.inline
  implicit class EnterpriseAdminDeleteSelfHostedRunnerFromEnterpriseEndpointMutableBuilder[Self <: EnterpriseAdminDeleteSelfHostedRunnerFromEnterpriseEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnterprise(value: String): Self = StObject.set(x, "enterprise", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunner_id(value: Double): Self = StObject.set(x, "runner_id", value.asInstanceOf[js.Any])
  }
}
