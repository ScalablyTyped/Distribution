package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnterpriseAdminListSelfHostedRunnersForEnterpriseEndpoint extends StObject {
  
  /**
    * The slug version of the enterprise name. You can also substitute this value with the enterprise id.
    */
  var enterprise: String
  
  /**
    * Page number of the results to fetch.
    */
  var page: js.UndefOr[Double] = js.undefined
  
  /**
    * Results per page (max 100)
    */
  var per_page: js.UndefOr[Double] = js.undefined
}
object EnterpriseAdminListSelfHostedRunnersForEnterpriseEndpoint {
  
  @scala.inline
  def apply(enterprise: String): EnterpriseAdminListSelfHostedRunnersForEnterpriseEndpoint = {
    val __obj = js.Dynamic.literal(enterprise = enterprise.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnterpriseAdminListSelfHostedRunnersForEnterpriseEndpoint]
  }
  
  @scala.inline
  implicit class EnterpriseAdminListSelfHostedRunnersForEnterpriseEndpointMutableBuilder[Self <: EnterpriseAdminListSelfHostedRunnersForEnterpriseEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnterprise(value: String): Self = StObject.set(x, "enterprise", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    @scala.inline
    def setPer_page(value: Double): Self = StObject.set(x, "per_page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPer_pageUndefined: Self = StObject.set(x, "per_page", js.undefined)
  }
}
