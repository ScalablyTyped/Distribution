package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnterpriseAdminSetSelfHostedInGroupForEnterpriseEndpoint extends js.Object {
  
  /**
    * The slug version of the enterprise name. You can also substitute this value with the enterprise id.
    */
  var enterprise: String = js.native
  
  /**
    * Unique identifier of the self-hosted runner group.
    */
  var runner_group_id: Double = js.native
  
  /**
    * List of runner IDs to add to the runner group.
    */
  var runners: js.Array[Double] = js.native
}
object EnterpriseAdminSetSelfHostedInGroupForEnterpriseEndpoint {
  
  @scala.inline
  def apply(enterprise: String, runner_group_id: Double, runners: js.Array[Double]): EnterpriseAdminSetSelfHostedInGroupForEnterpriseEndpoint = {
    val __obj = js.Dynamic.literal(enterprise = enterprise.asInstanceOf[js.Any], runner_group_id = runner_group_id.asInstanceOf[js.Any], runners = runners.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnterpriseAdminSetSelfHostedInGroupForEnterpriseEndpoint]
  }
  
  @scala.inline
  implicit class EnterpriseAdminSetSelfHostedInGroupForEnterpriseEndpointOps[Self <: EnterpriseAdminSetSelfHostedInGroupForEnterpriseEndpoint] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def setRunnersVarargs(value: Double*): Self = this.set("runners", js.Array(value :_*))
    
    @scala.inline
    def setRunners(value: js.Array[Double]): Self = this.set("runners", value.asInstanceOf[js.Any])
  }
}
