package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.all
import typings.octokitTypes.octokitTypesStrings.selected
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnterpriseAdminUpdateSelfHostedRunnerGroupForEnterpriseEndpoint extends StObject {
  
  /**
    * The slug version of the enterprise name. You can also substitute this value with the enterprise id.
    */
  var enterprise: String
  
  /**
    * Name of the runner group.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Unique identifier of the self-hosted runner group.
    */
  var runner_group_id: Double
  
  /**
    * Visibility of a runner group. You can select all organizations or select individual organizations. Can be one of: `all` or `selected`
    */
  var visibility: js.UndefOr[selected | all] = js.undefined
}
object EnterpriseAdminUpdateSelfHostedRunnerGroupForEnterpriseEndpoint {
  
  @scala.inline
  def apply(enterprise: String, runner_group_id: Double): EnterpriseAdminUpdateSelfHostedRunnerGroupForEnterpriseEndpoint = {
    val __obj = js.Dynamic.literal(enterprise = enterprise.asInstanceOf[js.Any], runner_group_id = runner_group_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnterpriseAdminUpdateSelfHostedRunnerGroupForEnterpriseEndpoint]
  }
  
  @scala.inline
  implicit class EnterpriseAdminUpdateSelfHostedRunnerGroupForEnterpriseEndpointMutableBuilder[Self <: EnterpriseAdminUpdateSelfHostedRunnerGroupForEnterpriseEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnterprise(value: String): Self = StObject.set(x, "enterprise", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setRunner_group_id(value: Double): Self = StObject.set(x, "runner_group_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibility(value: selected | all): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
  }
}
