package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnterpriseAdminGetSharedStorageBillingGheDeprecatedEnterpriseIdEndpoint extends StObject {
  
  /**
    * The slug version of the enterprise name. You can also substitute this value with the enterprise id.
    *  @deprecated "enterprise_id" is deprecated. Use "enterprise" instead
    */
  var enterprise_id: js.UndefOr[String] = js.undefined
}
object EnterpriseAdminGetSharedStorageBillingGheDeprecatedEnterpriseIdEndpoint {
  
  @scala.inline
  def apply(): EnterpriseAdminGetSharedStorageBillingGheDeprecatedEnterpriseIdEndpoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnterpriseAdminGetSharedStorageBillingGheDeprecatedEnterpriseIdEndpoint]
  }
  
  @scala.inline
  implicit class EnterpriseAdminGetSharedStorageBillingGheDeprecatedEnterpriseIdEndpointMutableBuilder[Self <: EnterpriseAdminGetSharedStorageBillingGheDeprecatedEnterpriseIdEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnterprise_id(value: String): Self = StObject.set(x, "enterprise_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnterprise_idUndefined: Self = StObject.set(x, "enterprise_id", js.undefined)
  }
}
