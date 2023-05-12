package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.created_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Requester extends StObject {
  
  /** @enum {string} */
  var action: created_
  
  var enterprise: js.UndefOr[Htmlurl] = js.undefined
  
  var installation: Contactemail
  
  var organization: js.UndefOr[Hooksurl] = js.undefined
  
  /** @description An array of repository objects that the installation can access. */
  var repositories: js.UndefOr[js.Array[Fullname]] = js.undefined
  
  var repository: js.UndefOr[Allowupdatebranch] = js.undefined
  
  /** User */
  var requester: js.UndefOr[Deleted | Null] = js.undefined
  
  var sender: Avatarurl
}
object Requester {
  
  inline def apply(installation: Contactemail, sender: Avatarurl): Requester = {
    val __obj = js.Dynamic.literal(action = "created", installation = installation.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[Requester]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Requester] (val x: Self) extends AnyVal {
    
    inline def setAction(value: created_): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setEnterprise(value: Htmlurl): Self = StObject.set(x, "enterprise", value.asInstanceOf[js.Any])
    
    inline def setEnterpriseUndefined: Self = StObject.set(x, "enterprise", js.undefined)
    
    inline def setInstallation(value: Contactemail): Self = StObject.set(x, "installation", value.asInstanceOf[js.Any])
    
    inline def setOrganization(value: Hooksurl): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
    
    inline def setOrganizationUndefined: Self = StObject.set(x, "organization", js.undefined)
    
    inline def setRepositories(value: js.Array[Fullname]): Self = StObject.set(x, "repositories", value.asInstanceOf[js.Any])
    
    inline def setRepositoriesUndefined: Self = StObject.set(x, "repositories", js.undefined)
    
    inline def setRepositoriesVarargs(value: Fullname*): Self = StObject.set(x, "repositories", js.Array(value*))
    
    inline def setRepository(value: Allowupdatebranch): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    inline def setRepositoryUndefined: Self = StObject.set(x, "repository", js.undefined)
    
    inline def setRequester(value: Deleted): Self = StObject.set(x, "requester", value.asInstanceOf[js.Any])
    
    inline def setRequesterNull: Self = StObject.set(x, "requester", null)
    
    inline def setRequesterUndefined: Self = StObject.set(x, "requester", js.undefined)
    
    inline def setSender(value: Avatarurl): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
  }
}
