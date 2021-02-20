package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Description
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnterpriseAdminListOrgAccessToSelfHostedRunnerGroupInEnterpriseResponseData extends StObject {
  
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
  implicit class EnterpriseAdminListOrgAccessToSelfHostedRunnerGroupInEnterpriseResponseDataMutableBuilder[Self <: EnterpriseAdminListOrgAccessToSelfHostedRunnerGroupInEnterpriseResponseData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOrganizations(value: js.Array[Description]): Self = StObject.set(x, "organizations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganizationsVarargs(value: Description*): Self = StObject.set(x, "organizations", js.Array(value :_*))
    
    @scala.inline
    def setTotal_count(value: Double): Self = StObject.set(x, "total_count", value.asInstanceOf[js.Any])
  }
}
