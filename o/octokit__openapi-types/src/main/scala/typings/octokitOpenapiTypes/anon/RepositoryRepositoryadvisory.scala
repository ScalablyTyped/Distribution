package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.reported
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RepositoryRepositoryadvisory extends StObject {
  
  /** @enum {string} */
  var action: reported
  
  var enterprise: js.UndefOr[Htmlurl] = js.undefined
  
  var installation: js.UndefOr[NodeidString] = js.undefined
  
  var organization: js.UndefOr[Hooksurl] = js.undefined
  
  var repository: Allowupdatebranch
  
  var repository_advisory: Creditsdetailed
  
  var sender: js.UndefOr[Avatarurl] = js.undefined
}
object RepositoryRepositoryadvisory {
  
  inline def apply(repository: Allowupdatebranch, repository_advisory: Creditsdetailed): RepositoryRepositoryadvisory = {
    val __obj = js.Dynamic.literal(action = "reported", repository = repository.asInstanceOf[js.Any], repository_advisory = repository_advisory.asInstanceOf[js.Any])
    __obj.asInstanceOf[RepositoryRepositoryadvisory]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RepositoryRepositoryadvisory] (val x: Self) extends AnyVal {
    
    inline def setAction(value: reported): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setEnterprise(value: Htmlurl): Self = StObject.set(x, "enterprise", value.asInstanceOf[js.Any])
    
    inline def setEnterpriseUndefined: Self = StObject.set(x, "enterprise", js.undefined)
    
    inline def setInstallation(value: NodeidString): Self = StObject.set(x, "installation", value.asInstanceOf[js.Any])
    
    inline def setInstallationUndefined: Self = StObject.set(x, "installation", js.undefined)
    
    inline def setOrganization(value: Hooksurl): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
    
    inline def setOrganizationUndefined: Self = StObject.set(x, "organization", js.undefined)
    
    inline def setRepository(value: Allowupdatebranch): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    inline def setRepository_advisory(value: Creditsdetailed): Self = StObject.set(x, "repository_advisory", value.asInstanceOf[js.Any])
    
    inline def setSender(value: Avatarurl): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
    
    inline def setSenderUndefined: Self = StObject.set(x, "sender", js.undefined)
  }
}
