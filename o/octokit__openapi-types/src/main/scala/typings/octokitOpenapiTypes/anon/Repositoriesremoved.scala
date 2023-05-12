package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.all
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.removed
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.selected
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Repositoriesremoved extends StObject {
  
  /** @enum {string} */
  var action: removed
  
  var enterprise: js.UndefOr[Htmlurl] = js.undefined
  
  var installation: Contactemail
  
  var organization: js.UndefOr[Hooksurl] = js.undefined
  
  /** @description An array of repository objects, which were added to the installation. */
  var repositories_added: js.Array[Fullname]
  
  /** @description An array of repository objects, which were removed from the installation. */
  var repositories_removed: js.Array[Fullname]
  
  var repository: js.UndefOr[Allowupdatebranch] = js.undefined
  
  /**
    * @description Describe whether all repositories have been selected or there's a selection involved
    * @enum {string}
    */
  var repository_selection: all | selected
  
  /** User */
  var requester: Deleted | Null
  
  var sender: Avatarurl
}
object Repositoriesremoved {
  
  inline def apply(
    installation: Contactemail,
    repositories_added: js.Array[Fullname],
    repositories_removed: js.Array[Fullname],
    repository_selection: all | selected,
    sender: Avatarurl
  ): Repositoriesremoved = {
    val __obj = js.Dynamic.literal(action = "removed", installation = installation.asInstanceOf[js.Any], repositories_added = repositories_added.asInstanceOf[js.Any], repositories_removed = repositories_removed.asInstanceOf[js.Any], repository_selection = repository_selection.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], requester = null)
    __obj.asInstanceOf[Repositoriesremoved]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Repositoriesremoved] (val x: Self) extends AnyVal {
    
    inline def setAction(value: removed): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setEnterprise(value: Htmlurl): Self = StObject.set(x, "enterprise", value.asInstanceOf[js.Any])
    
    inline def setEnterpriseUndefined: Self = StObject.set(x, "enterprise", js.undefined)
    
    inline def setInstallation(value: Contactemail): Self = StObject.set(x, "installation", value.asInstanceOf[js.Any])
    
    inline def setOrganization(value: Hooksurl): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
    
    inline def setOrganizationUndefined: Self = StObject.set(x, "organization", js.undefined)
    
    inline def setRepositories_added(value: js.Array[Fullname]): Self = StObject.set(x, "repositories_added", value.asInstanceOf[js.Any])
    
    inline def setRepositories_addedVarargs(value: Fullname*): Self = StObject.set(x, "repositories_added", js.Array(value*))
    
    inline def setRepositories_removed(value: js.Array[Fullname]): Self = StObject.set(x, "repositories_removed", value.asInstanceOf[js.Any])
    
    inline def setRepositories_removedVarargs(value: Fullname*): Self = StObject.set(x, "repositories_removed", js.Array(value*))
    
    inline def setRepository(value: Allowupdatebranch): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    inline def setRepositoryUndefined: Self = StObject.set(x, "repository", js.undefined)
    
    inline def setRepository_selection(value: all | selected): Self = StObject.set(x, "repository_selection", value.asInstanceOf[js.Any])
    
    inline def setRequester(value: Deleted): Self = StObject.set(x, "requester", value.asInstanceOf[js.Any])
    
    inline def setRequesterNull: Self = StObject.set(x, "requester", null)
    
    inline def setSender(value: Avatarurl): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
  }
}
