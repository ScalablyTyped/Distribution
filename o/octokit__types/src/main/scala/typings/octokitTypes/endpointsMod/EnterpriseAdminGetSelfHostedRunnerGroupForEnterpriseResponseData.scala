package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnterpriseAdminGetSelfHostedRunnerGroupForEnterpriseResponseData extends js.Object {
  
  var default: Boolean = js.native
  
  var id: Double = js.native
  
  var name: String = js.native
  
  var runners_url: String = js.native
  
  var selected_organizations_url: String = js.native
  
  var visibility: String = js.native
}
object EnterpriseAdminGetSelfHostedRunnerGroupForEnterpriseResponseData {
  
  @scala.inline
  def apply(
    default: Boolean,
    id: Double,
    name: String,
    runners_url: String,
    selected_organizations_url: String,
    visibility: String
  ): EnterpriseAdminGetSelfHostedRunnerGroupForEnterpriseResponseData = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], runners_url = runners_url.asInstanceOf[js.Any], selected_organizations_url = selected_organizations_url.asInstanceOf[js.Any], visibility = visibility.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnterpriseAdminGetSelfHostedRunnerGroupForEnterpriseResponseData]
  }
  
  @scala.inline
  implicit class EnterpriseAdminGetSelfHostedRunnerGroupForEnterpriseResponseDataOps[Self <: EnterpriseAdminGetSelfHostedRunnerGroupForEnterpriseResponseData] (val x: Self) extends AnyVal {
    
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
    def setDefault(value: Boolean): Self = this.set("default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunners_url(value: String): Self = this.set("runners_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelected_organizations_url(value: String): Self = this.set("selected_organizations_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibility(value: String): Self = this.set("visibility", value.asInstanceOf[js.Any])
  }
}
