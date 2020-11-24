package typings.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetGithubActionsBillingUser extends js.Object {
  
  var getGithubActionsBillingOrg: `651` = js.native
  
  var getGithubActionsBillingUser: `652` = js.native
  
  var getGithubPackagesBillingOrg: `653` = js.native
  
  var getGithubPackagesBillingUser: `654` = js.native
  
  var getSharedStorageBillingOrg: `655` = js.native
  
  var getSharedStorageBillingUser: `656` = js.native
}
object GetGithubActionsBillingUser {
  
  @scala.inline
  def apply(
    getGithubActionsBillingOrg: `651`,
    getGithubActionsBillingUser: `652`,
    getGithubPackagesBillingOrg: `653`,
    getGithubPackagesBillingUser: `654`,
    getSharedStorageBillingOrg: `655`,
    getSharedStorageBillingUser: `656`
  ): GetGithubActionsBillingUser = {
    val __obj = js.Dynamic.literal(getGithubActionsBillingOrg = getGithubActionsBillingOrg.asInstanceOf[js.Any], getGithubActionsBillingUser = getGithubActionsBillingUser.asInstanceOf[js.Any], getGithubPackagesBillingOrg = getGithubPackagesBillingOrg.asInstanceOf[js.Any], getGithubPackagesBillingUser = getGithubPackagesBillingUser.asInstanceOf[js.Any], getSharedStorageBillingOrg = getSharedStorageBillingOrg.asInstanceOf[js.Any], getSharedStorageBillingUser = getSharedStorageBillingUser.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetGithubActionsBillingUser]
  }
  
  @scala.inline
  implicit class GetGithubActionsBillingUserOps[Self <: GetGithubActionsBillingUser] (val x: Self) extends AnyVal {
    
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
    def setGetGithubActionsBillingOrg(value: `651`): Self = this.set("getGithubActionsBillingOrg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetGithubActionsBillingUser(value: `652`): Self = this.set("getGithubActionsBillingUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetGithubPackagesBillingOrg(value: `653`): Self = this.set("getGithubPackagesBillingOrg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetGithubPackagesBillingUser(value: `654`): Self = this.set("getGithubPackagesBillingUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetSharedStorageBillingOrg(value: `655`): Self = this.set("getSharedStorageBillingOrg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetSharedStorageBillingUser(value: `656`): Self = this.set("getSharedStorageBillingUser", value.asInstanceOf[js.Any])
  }
}
