package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnterpriseAdminGetSharedStorageBillingGheDeprecatedEnterpriseIdEndpoint extends js.Object {
  
  /**
    * The slug version of the enterprise name. You can also substitute this value with the enterprise id.
    *  @deprecated "enterprise_id" is deprecated. Use "enterprise" instead
    */
  var enterprise_id: js.UndefOr[String] = js.native
}
object EnterpriseAdminGetSharedStorageBillingGheDeprecatedEnterpriseIdEndpoint {
  
  @scala.inline
  def apply(): EnterpriseAdminGetSharedStorageBillingGheDeprecatedEnterpriseIdEndpoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnterpriseAdminGetSharedStorageBillingGheDeprecatedEnterpriseIdEndpoint]
  }
  
  @scala.inline
  implicit class EnterpriseAdminGetSharedStorageBillingGheDeprecatedEnterpriseIdEndpointOps[Self <: EnterpriseAdminGetSharedStorageBillingGheDeprecatedEnterpriseIdEndpoint] (val x: Self) extends AnyVal {
    
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
    def setEnterprise_id(value: String): Self = this.set("enterprise_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnterprise_id: Self = this.set("enterprise_id", js.undefined)
  }
}
