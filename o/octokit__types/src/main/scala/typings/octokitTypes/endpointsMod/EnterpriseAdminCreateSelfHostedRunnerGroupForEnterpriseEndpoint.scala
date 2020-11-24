package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.all
import typings.octokitTypes.octokitTypesStrings.selected
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnterpriseAdminCreateSelfHostedRunnerGroupForEnterpriseEndpoint extends js.Object {
  
  /**
    * The slug version of the enterprise name. You can also substitute this value with the enterprise id.
    */
  var enterprise: String = js.native
  
  /**
    * Name of the runner group.
    */
  var name: String = js.native
  
  /**
    * List of runner IDs to add to the runner group.
    */
  var runners: js.UndefOr[js.Array[Double]] = js.native
  
  /**
    * List of organization IDs that can access the runner group.
    */
  var selected_organization_ids: js.UndefOr[js.Array[Double]] = js.native
  
  /**
    * Visibility of a runner group. You can select all organizations or select individual organization. Can be one of: `all` or `selected`
    */
  var visibility: js.UndefOr[selected | all] = js.native
}
object EnterpriseAdminCreateSelfHostedRunnerGroupForEnterpriseEndpoint {
  
  @scala.inline
  def apply(enterprise: String, name: String): EnterpriseAdminCreateSelfHostedRunnerGroupForEnterpriseEndpoint = {
    val __obj = js.Dynamic.literal(enterprise = enterprise.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnterpriseAdminCreateSelfHostedRunnerGroupForEnterpriseEndpoint]
  }
  
  @scala.inline
  implicit class EnterpriseAdminCreateSelfHostedRunnerGroupForEnterpriseEndpointOps[Self <: EnterpriseAdminCreateSelfHostedRunnerGroupForEnterpriseEndpoint] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunnersVarargs(value: Double*): Self = this.set("runners", js.Array(value :_*))
    
    @scala.inline
    def setRunners(value: js.Array[Double]): Self = this.set("runners", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRunners: Self = this.set("runners", js.undefined)
    
    @scala.inline
    def setSelected_organization_idsVarargs(value: Double*): Self = this.set("selected_organization_ids", js.Array(value :_*))
    
    @scala.inline
    def setSelected_organization_ids(value: js.Array[Double]): Self = this.set("selected_organization_ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelected_organization_ids: Self = this.set("selected_organization_ids", js.undefined)
    
    @scala.inline
    def setVisibility(value: selected | all): Self = this.set("visibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisibility: Self = this.set("visibility", js.undefined)
  }
}
