package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnterpriseAdminListProvisionedGroupsEnterpriseEndpoint extends StObject {
  
  /**
    * Used for pagination: the number of results to return.
    */
  var count: js.UndefOr[Double] = js.undefined
  
  /**
    * The slug version of the enterprise name. You can also substitute this value with the enterprise id.
    */
  var enterprise: String
  
  /**
    * Used for pagination: the index of the first result to return.
    */
  var startIndex: js.UndefOr[Double] = js.undefined
}
object EnterpriseAdminListProvisionedGroupsEnterpriseEndpoint {
  
  @scala.inline
  def apply(enterprise: String): EnterpriseAdminListProvisionedGroupsEnterpriseEndpoint = {
    val __obj = js.Dynamic.literal(enterprise = enterprise.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnterpriseAdminListProvisionedGroupsEnterpriseEndpoint]
  }
  
  @scala.inline
  implicit class EnterpriseAdminListProvisionedGroupsEnterpriseEndpointMutableBuilder[Self <: EnterpriseAdminListProvisionedGroupsEnterpriseEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    @scala.inline
    def setEnterprise(value: String): Self = StObject.set(x, "enterprise", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartIndex(value: Double): Self = StObject.set(x, "startIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartIndexUndefined: Self = StObject.set(x, "startIndex", js.undefined)
  }
}
