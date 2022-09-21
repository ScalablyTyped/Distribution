package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.closed
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.pull
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.push
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.secret
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Maintainers extends StObject {
  
  /** @description The description of the team. */
  var description: js.UndefOr[String] = js.undefined
  
  /** @description List GitHub IDs for organization members who will become team maintainers. */
  var maintainers: js.UndefOr[js.Array[String]] = js.undefined
  
  /** @description The name of the team. */
  var name: String
  
  /** @description The ID of a team to set as the parent team. */
  var parent_team_id: js.UndefOr[Double] = js.undefined
  
  /**
    * @description **Deprecated**. The permission that new repositories will be added to the team with when none is specified.
    * @default pull
    * @enum {string}
    */
  var permission: js.UndefOr[pull | push] = js.undefined
  
  /**
    * @description The level of privacy this team should have. The options are:
    * **For a non-nested team:**
    * \* `secret` - only visible to organization owners and members of this team.
    * \* `closed` - visible to all members of this organization.
    * Default: `secret`
    * **For a parent or child team:**
    * \* `closed` - visible to all members of this organization.
    * Default for child team: `closed`
    * @enum {string}
    */
  var privacy: js.UndefOr[secret | closed] = js.undefined
  
  /** @description The full name (e.g., "organization-name/repository-name") of repositories to add the team to. */
  var repo_names: js.UndefOr[js.Array[String]] = js.undefined
}
object Maintainers {
  
  inline def apply(name: String): Maintainers = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Maintainers]
  }
  
  extension [Self <: Maintainers](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setMaintainers(value: js.Array[String]): Self = StObject.set(x, "maintainers", value.asInstanceOf[js.Any])
    
    inline def setMaintainersUndefined: Self = StObject.set(x, "maintainers", js.undefined)
    
    inline def setMaintainersVarargs(value: String*): Self = StObject.set(x, "maintainers", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setParent_team_id(value: Double): Self = StObject.set(x, "parent_team_id", value.asInstanceOf[js.Any])
    
    inline def setParent_team_idUndefined: Self = StObject.set(x, "parent_team_id", js.undefined)
    
    inline def setPermission(value: pull | push): Self = StObject.set(x, "permission", value.asInstanceOf[js.Any])
    
    inline def setPermissionUndefined: Self = StObject.set(x, "permission", js.undefined)
    
    inline def setPrivacy(value: secret | closed): Self = StObject.set(x, "privacy", value.asInstanceOf[js.Any])
    
    inline def setPrivacyUndefined: Self = StObject.set(x, "privacy", js.undefined)
    
    inline def setRepo_names(value: js.Array[String]): Self = StObject.set(x, "repo_names", value.asInstanceOf[js.Any])
    
    inline def setRepo_namesUndefined: Self = StObject.set(x, "repo_names", js.undefined)
    
    inline def setRepo_namesVarargs(value: String*): Self = StObject.set(x, "repo_names", js.Array(value*))
  }
}
