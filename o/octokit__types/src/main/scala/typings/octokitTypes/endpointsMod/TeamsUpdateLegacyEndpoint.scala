package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.admin
import typings.octokitTypes.octokitTypesStrings.closed
import typings.octokitTypes.octokitTypesStrings.pull
import typings.octokitTypes.octokitTypesStrings.push
import typings.octokitTypes.octokitTypesStrings.secret
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TeamsUpdateLegacyEndpoint extends js.Object {
  
  /**
    * The description of the team.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * The name of the team.
    */
  var name: String = js.native
  
  /**
    * The ID of a team to set as the parent team.
    */
  var parent_team_id: js.UndefOr[Double] = js.native
  
  /**
    * **Deprecated**. The permission that new repositories will be added to the team with when none is specified. Can be one of:
    * \* `pull` - team members can pull, but not push to or administer newly-added repositories.
    * \* `push` - team members can pull and push, but not administer newly-added repositories.
    * \* `admin` - team members can pull, push and administer newly-added repositories.
    */
  var permission: js.UndefOr[pull | push | admin] = js.native
  
  /**
    * The level of privacy this team should have. Editing teams without specifying this parameter leaves `privacy` intact. The options are:
    * **For a non-nested team:**
    * \* `secret` - only visible to organization owners and members of this team.
    * \* `closed` - visible to all members of this organization.
    * **For a parent or child team:**
    * \* `closed` - visible to all members of this organization.
    */
  var privacy: js.UndefOr[secret | closed] = js.native
  
  var team_id: Double = js.native
}
object TeamsUpdateLegacyEndpoint {
  
  @scala.inline
  def apply(name: String, team_id: Double): TeamsUpdateLegacyEndpoint = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], team_id = team_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsUpdateLegacyEndpoint]
  }
  
  @scala.inline
  implicit class TeamsUpdateLegacyEndpointOps[Self <: TeamsUpdateLegacyEndpoint] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeam_id(value: Double): Self = this.set("team_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setParent_team_id(value: Double): Self = this.set("parent_team_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParent_team_id: Self = this.set("parent_team_id", js.undefined)
    
    @scala.inline
    def setPermission(value: pull | push | admin): Self = this.set("permission", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePermission: Self = this.set("permission", js.undefined)
    
    @scala.inline
    def setPrivacy(value: secret | closed): Self = this.set("privacy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrivacy: Self = this.set("privacy", js.undefined)
  }
}
