package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.unassigned
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionAssigneeEnterprise extends StObject {
  
  /** @enum {string} */
  var action: unassigned
  
  /** User */
  var assignee: js.UndefOr[Organizationsurl | Null] = js.undefined
  
  var enterprise: js.UndefOr[Htmlurl] = js.undefined
  
  var installation: js.UndefOr[NodeidString] = js.undefined
  
  /** @description The pull request number. */
  var number: Double
  
  var organization: js.UndefOr[Hooksurl] = js.undefined
  
  /** Pull Request */
  var pull_request: CommentsurlCommits
  
  var repository: Allowupdatebranch
  
  var sender: js.UndefOr[Avatarurl] = js.undefined
}
object ActionAssigneeEnterprise {
  
  inline def apply(number: Double, pull_request: CommentsurlCommits, repository: Allowupdatebranch): ActionAssigneeEnterprise = {
    val __obj = js.Dynamic.literal(action = "unassigned", number = number.asInstanceOf[js.Any], pull_request = pull_request.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionAssigneeEnterprise]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ActionAssigneeEnterprise] (val x: Self) extends AnyVal {
    
    inline def setAction(value: unassigned): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setAssignee(value: Organizationsurl): Self = StObject.set(x, "assignee", value.asInstanceOf[js.Any])
    
    inline def setAssigneeNull: Self = StObject.set(x, "assignee", null)
    
    inline def setAssigneeUndefined: Self = StObject.set(x, "assignee", js.undefined)
    
    inline def setEnterprise(value: Htmlurl): Self = StObject.set(x, "enterprise", value.asInstanceOf[js.Any])
    
    inline def setEnterpriseUndefined: Self = StObject.set(x, "enterprise", js.undefined)
    
    inline def setInstallation(value: NodeidString): Self = StObject.set(x, "installation", value.asInstanceOf[js.Any])
    
    inline def setInstallationUndefined: Self = StObject.set(x, "installation", js.undefined)
    
    inline def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setOrganization(value: Hooksurl): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
    
    inline def setOrganizationUndefined: Self = StObject.set(x, "organization", js.undefined)
    
    inline def setPull_request(value: CommentsurlCommits): Self = StObject.set(x, "pull_request", value.asInstanceOf[js.Any])
    
    inline def setRepository(value: Allowupdatebranch): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    inline def setSender(value: Avatarurl): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
    
    inline def setSenderUndefined: Self = StObject.set(x, "sender", js.undefined)
  }
}
