package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.all
import typings.octokitTypes.octokitTypesStrings.selected
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnterpriseAdminCreateSelfHostedRunnerGroupForEnterpriseEndpoint extends StObject {
  
  /**
    * The slug version of the enterprise name. You can also substitute this value with the enterprise id.
    */
  var enterprise: String
  
  /**
    * Name of the runner group.
    */
  var name: String
  
  /**
    * List of runner IDs to add to the runner group.
    */
  var runners: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * List of organization IDs that can access the runner group.
    */
  var selected_organization_ids: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * Visibility of a runner group. You can select all organizations or select individual organization. Can be one of: `all` or `selected`
    */
  var visibility: js.UndefOr[selected | all] = js.undefined
}
object EnterpriseAdminCreateSelfHostedRunnerGroupForEnterpriseEndpoint {
  
  inline def apply(enterprise: String, name: String): EnterpriseAdminCreateSelfHostedRunnerGroupForEnterpriseEndpoint = {
    val __obj = js.Dynamic.literal(enterprise = enterprise.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnterpriseAdminCreateSelfHostedRunnerGroupForEnterpriseEndpoint]
  }
  
  extension [Self <: EnterpriseAdminCreateSelfHostedRunnerGroupForEnterpriseEndpoint](x: Self) {
    
    inline def setEnterprise(value: String): Self = StObject.set(x, "enterprise", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRunners(value: js.Array[Double]): Self = StObject.set(x, "runners", value.asInstanceOf[js.Any])
    
    inline def setRunnersUndefined: Self = StObject.set(x, "runners", js.undefined)
    
    inline def setRunnersVarargs(value: Double*): Self = StObject.set(x, "runners", js.Array(value :_*))
    
    inline def setSelected_organization_ids(value: js.Array[Double]): Self = StObject.set(x, "selected_organization_ids", value.asInstanceOf[js.Any])
    
    inline def setSelected_organization_idsUndefined: Self = StObject.set(x, "selected_organization_ids", js.undefined)
    
    inline def setSelected_organization_idsVarargs(value: Double*): Self = StObject.set(x, "selected_organization_ids", js.Array(value :_*))
    
    inline def setVisibility(value: selected | all): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
    
    inline def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
  }
}
