package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TeamsCreateOrUpdateIdPGroupConnectionsInOrgParamsGroups extends js.Object {
  
  var group_description: String = js.native
  
  var group_id: String = js.native
  
  var group_name: String = js.native
}
object TeamsCreateOrUpdateIdPGroupConnectionsInOrgParamsGroups {
  
  @scala.inline
  def apply(group_description: String, group_id: String, group_name: String): TeamsCreateOrUpdateIdPGroupConnectionsInOrgParamsGroups = {
    val __obj = js.Dynamic.literal(group_description = group_description.asInstanceOf[js.Any], group_id = group_id.asInstanceOf[js.Any], group_name = group_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsCreateOrUpdateIdPGroupConnectionsInOrgParamsGroups]
  }
  
  @scala.inline
  implicit class TeamsCreateOrUpdateIdPGroupConnectionsInOrgParamsGroupsOps[Self <: TeamsCreateOrUpdateIdPGroupConnectionsInOrgParamsGroups] (val x: Self) extends AnyVal {
    
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
    def setGroup_description(value: String): Self = this.set("group_description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroup_id(value: String): Self = this.set("group_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroup_name(value: String): Self = this.set("group_name", value.asInstanceOf[js.Any])
  }
}
