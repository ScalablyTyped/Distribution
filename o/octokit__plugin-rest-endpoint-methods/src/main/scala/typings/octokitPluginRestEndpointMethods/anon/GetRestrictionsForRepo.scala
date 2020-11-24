package typings.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetRestrictionsForRepo extends js.Object {
  
  var getRestrictionsForOrg: `712` = js.native
  
  var getRestrictionsForRepo: `713` = js.native
  
  var removeRestrictionsForOrg: `714` = js.native
  
  var removeRestrictionsForRepo: `715` = js.native
  
  var setRestrictionsForOrg: `716` = js.native
  
  var setRestrictionsForRepo: `717` = js.native
}
object GetRestrictionsForRepo {
  
  @scala.inline
  def apply(
    getRestrictionsForOrg: `712`,
    getRestrictionsForRepo: `713`,
    removeRestrictionsForOrg: `714`,
    removeRestrictionsForRepo: `715`,
    setRestrictionsForOrg: `716`,
    setRestrictionsForRepo: `717`
  ): GetRestrictionsForRepo = {
    val __obj = js.Dynamic.literal(getRestrictionsForOrg = getRestrictionsForOrg.asInstanceOf[js.Any], getRestrictionsForRepo = getRestrictionsForRepo.asInstanceOf[js.Any], removeRestrictionsForOrg = removeRestrictionsForOrg.asInstanceOf[js.Any], removeRestrictionsForRepo = removeRestrictionsForRepo.asInstanceOf[js.Any], setRestrictionsForOrg = setRestrictionsForOrg.asInstanceOf[js.Any], setRestrictionsForRepo = setRestrictionsForRepo.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRestrictionsForRepo]
  }
  
  @scala.inline
  implicit class GetRestrictionsForRepoOps[Self <: GetRestrictionsForRepo] (val x: Self) extends AnyVal {
    
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
    def setGetRestrictionsForOrg(value: `712`): Self = this.set("getRestrictionsForOrg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetRestrictionsForRepo(value: `713`): Self = this.set("getRestrictionsForRepo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveRestrictionsForOrg(value: `714`): Self = this.set("removeRestrictionsForOrg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveRestrictionsForRepo(value: `715`): Self = this.set("removeRestrictionsForRepo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetRestrictionsForOrg(value: `716`): Self = this.set("setRestrictionsForOrg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetRestrictionsForRepo(value: `717`): Self = this.set("setRestrictionsForRepo", value.asInstanceOf[js.Any])
  }
}
