package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Description
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnterpriseAdminListOrgAccessToSelfHostedRunnerGroupInEnterpriseResponseData extends js.Object {
  
  var organizations: js.Array[Description] = js.native
  
  var total_count: Double = js.native
}
object EnterpriseAdminListOrgAccessToSelfHostedRunnerGroupInEnterpriseResponseData {
  
  @scala.inline
  def apply(organizations: js.Array[Description], total_count: Double): EnterpriseAdminListOrgAccessToSelfHostedRunnerGroupInEnterpriseResponseData = {
    val __obj = js.Dynamic.literal(organizations = organizations.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnterpriseAdminListOrgAccessToSelfHostedRunnerGroupInEnterpriseResponseData]
  }
  
  @scala.inline
  implicit class EnterpriseAdminListOrgAccessToSelfHostedRunnerGroupInEnterpriseResponseDataOps[Self <: EnterpriseAdminListOrgAccessToSelfHostedRunnerGroupInEnterpriseResponseData] (val x: Self) extends AnyVal {
    
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
    def setOrganizationsVarargs(value: Description*): Self = this.set("organizations", js.Array(value :_*))
    
    @scala.inline
    def setOrganizations(value: js.Array[Description]): Self = this.set("organizations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotal_count(value: Double): Self = this.set("total_count", value.asInstanceOf[js.Any])
  }
}
