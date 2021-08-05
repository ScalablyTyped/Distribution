package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.admin
import typings.octokitTypes.octokitTypesStrings.closed
import typings.octokitTypes.octokitTypesStrings.pull
import typings.octokitTypes.octokitTypesStrings.push
import typings.octokitTypes.octokitTypesStrings.secret
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TeamsUpdateInOrgEndpoint extends StObject {
  
  /**
    * The description of the team.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the team.
    */
  var name: String
  
  @JSName("org")
  var org_ : String
  
  /**
    * The ID of a team to set as the parent team.
    */
  var parent_team_id: js.UndefOr[Double] = js.undefined
  
  /**
    * **Deprecated**. The permission that new repositories will be added to the team with when none is specified. Can be one of:
    * \* `pull` - team members can pull, but not push to or administer newly-added repositories.
    * \* `push` - team members can pull and push, but not administer newly-added repositories.
    * \* `admin` - team members can pull, push and administer newly-added repositories.
    */
  var permission: js.UndefOr[pull | push | admin] = js.undefined
  
  /**
    * The level of privacy this team should have. Editing teams without specifying this parameter leaves `privacy` intact. When a team is nested, the `privacy` for parent teams cannot be `secret`. The options are:
    * **For a non-nested team:**
    * \* `secret` - only visible to organization owners and members of this team.
    * \* `closed` - visible to all members of this organization.
    * **For a parent or child team:**
    * \* `closed` - visible to all members of this organization.
    */
  var privacy: js.UndefOr[secret | closed] = js.undefined
  
  var team_slug: String
}
object TeamsUpdateInOrgEndpoint {
  
  inline def apply(name: String, org_ : String, team_slug: String): TeamsUpdateInOrgEndpoint = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], team_slug = team_slug.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsUpdateInOrgEndpoint]
  }
  
  extension [Self <: TeamsUpdateInOrgEndpoint](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOrg_(value: String): Self = StObject.set(x, "org", value.asInstanceOf[js.Any])
    
    inline def setParent_team_id(value: Double): Self = StObject.set(x, "parent_team_id", value.asInstanceOf[js.Any])
    
    inline def setParent_team_idUndefined: Self = StObject.set(x, "parent_team_id", js.undefined)
    
    inline def setPermission(value: pull | push | admin): Self = StObject.set(x, "permission", value.asInstanceOf[js.Any])
    
    inline def setPermissionUndefined: Self = StObject.set(x, "permission", js.undefined)
    
    inline def setPrivacy(value: secret | closed): Self = StObject.set(x, "privacy", value.asInstanceOf[js.Any])
    
    inline def setPrivacyUndefined: Self = StObject.set(x, "privacy", js.undefined)
    
    inline def setTeam_slug(value: String): Self = StObject.set(x, "team_slug", value.asInstanceOf[js.Any])
  }
}
