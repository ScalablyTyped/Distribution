package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.deleted_
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrganizationRepositories extends StObject {
  
  /** @enum {string} */
  var action: deleted_
  
  var enterprise: js.UndefOr[Htmlurl] = js.undefined
  
  var installation: Contactemail
  
  var organization: js.UndefOr[Hooksurl] = js.undefined
  
  /** @description An array of repository objects that the installation can access. */
  var repositories: js.UndefOr[js.Array[Fullname]] = js.undefined
  
  var repository: js.UndefOr[Allowupdatebranch] = js.undefined
  
  var requester: js.UndefOr[(Record[String, Any]) | Null] = js.undefined
  
  var sender: Avatarurl
}
object OrganizationRepositories {
  
  inline def apply(installation: Contactemail, sender: Avatarurl): OrganizationRepositories = {
    val __obj = js.Dynamic.literal(action = "deleted", installation = installation.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrganizationRepositories]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OrganizationRepositories] (val x: Self) extends AnyVal {
    
    inline def setAction(value: deleted_): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
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
    
    inline def setRequester(value: Record[String, Any]): Self = StObject.set(x, "requester", value.asInstanceOf[js.Any])
    
    inline def setRequesterNull: Self = StObject.set(x, "requester", null)
    
    inline def setRequesterUndefined: Self = StObject.set(x, "requester", js.undefined)
    
    inline def setSender(value: Avatarurl): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
  }
}
