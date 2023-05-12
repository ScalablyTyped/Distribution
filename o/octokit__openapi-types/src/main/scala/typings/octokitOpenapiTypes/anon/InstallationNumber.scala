package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.assigned
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstallationNumber extends StObject {
  
  /** @enum {string} */
  var action: assigned
  
  /** User */
  var assignee: Deleted | Null
  
  var enterprise: js.UndefOr[Htmlurl] = js.undefined
  
  var installation: js.UndefOr[NodeidString] = js.undefined
  
  /** @description The pull request number. */
  var number: Double
  
  var organization: js.UndefOr[Hooksurl] = js.undefined
  
  /** Pull Request */
  var pull_request: Mergeable
  
  var repository: Allowupdatebranch
  
  var sender: Avatarurl
}
object InstallationNumber {
  
  inline def apply(number: Double, pull_request: Mergeable, repository: Allowupdatebranch, sender: Avatarurl): InstallationNumber = {
    val __obj = js.Dynamic.literal(action = "assigned", number = number.asInstanceOf[js.Any], pull_request = pull_request.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], assignee = null)
    __obj.asInstanceOf[InstallationNumber]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InstallationNumber] (val x: Self) extends AnyVal {
    
    inline def setAction(value: assigned): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setAssignee(value: Deleted): Self = StObject.set(x, "assignee", value.asInstanceOf[js.Any])
    
    inline def setAssigneeNull: Self = StObject.set(x, "assignee", null)
    
    inline def setEnterprise(value: Htmlurl): Self = StObject.set(x, "enterprise", value.asInstanceOf[js.Any])
    
    inline def setEnterpriseUndefined: Self = StObject.set(x, "enterprise", js.undefined)
    
    inline def setInstallation(value: NodeidString): Self = StObject.set(x, "installation", value.asInstanceOf[js.Any])
    
    inline def setInstallationUndefined: Self = StObject.set(x, "installation", js.undefined)
    
    inline def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setOrganization(value: Hooksurl): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
    
    inline def setOrganizationUndefined: Self = StObject.set(x, "organization", js.undefined)
    
    inline def setPull_request(value: Mergeable): Self = StObject.set(x, "pull_request", value.asInstanceOf[js.Any])
    
    inline def setRepository(value: Allowupdatebranch): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    inline def setSender(value: Avatarurl): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
  }
}
