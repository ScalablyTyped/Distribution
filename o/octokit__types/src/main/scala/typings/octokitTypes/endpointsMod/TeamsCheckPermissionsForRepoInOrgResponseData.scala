package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Allowmergecommit
import typings.octokitTypes.anon.Avatarurl
import typings.octokitTypes.anon.Maintain
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TeamsCheckPermissionsForRepoInOrgResponseData extends js.Object {
  
  var organization: Avatarurl = js.native
  
  var parent: Allowmergecommit = js.native
  
  var permissions: Maintain = js.native
  
  var source: Allowmergecommit = js.native
}
object TeamsCheckPermissionsForRepoInOrgResponseData {
  
  @scala.inline
  def apply(organization: Avatarurl, parent: Allowmergecommit, permissions: Maintain, source: Allowmergecommit): TeamsCheckPermissionsForRepoInOrgResponseData = {
    val __obj = js.Dynamic.literal(organization = organization.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsCheckPermissionsForRepoInOrgResponseData]
  }
  
  @scala.inline
  implicit class TeamsCheckPermissionsForRepoInOrgResponseDataOps[Self <: TeamsCheckPermissionsForRepoInOrgResponseData] (val x: Self) extends AnyVal {
    
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
    def setOrganization(value: Avatarurl): Self = this.set("organization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: Allowmergecommit): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissions(value: Maintain): Self = this.set("permissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: Allowmergecommit): Self = this.set("source", value.asInstanceOf[js.Any])
  }
}
