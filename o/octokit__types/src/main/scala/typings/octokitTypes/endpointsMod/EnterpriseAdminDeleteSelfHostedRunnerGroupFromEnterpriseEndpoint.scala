package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnterpriseAdminDeleteSelfHostedRunnerGroupFromEnterpriseEndpoint extends js.Object {
  
  /**
    * The slug version of the enterprise name. You can also substitute this value with the enterprise id.
    */
  var enterprise: String = js.native
  
  /**
    * Unique identifier of the self-hosted runner group.
    */
  var runner_group_id: Double = js.native
}
object EnterpriseAdminDeleteSelfHostedRunnerGroupFromEnterpriseEndpoint {
  
  @scala.inline
  def apply(enterprise: String, runner_group_id: Double): EnterpriseAdminDeleteSelfHostedRunnerGroupFromEnterpriseEndpoint = {
    val __obj = js.Dynamic.literal(enterprise = enterprise.asInstanceOf[js.Any], runner_group_id = runner_group_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnterpriseAdminDeleteSelfHostedRunnerGroupFromEnterpriseEndpoint]
  }
  
  @scala.inline
  implicit class EnterpriseAdminDeleteSelfHostedRunnerGroupFromEnterpriseEndpointOps[Self <: EnterpriseAdminDeleteSelfHostedRunnerGroupFromEnterpriseEndpoint] (val x: Self) extends AnyVal {
    
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
    def setEnterprise(value: String): Self = this.set("enterprise", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunner_group_id(value: Double): Self = this.set("runner_group_id", value.asInstanceOf[js.Any])
  }
}
