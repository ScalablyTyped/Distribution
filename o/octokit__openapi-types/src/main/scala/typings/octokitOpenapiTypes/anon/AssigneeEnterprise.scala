package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.unassigned
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssigneeEnterprise extends StObject {
  
  /**
    * @description The action that was performed.
    * @enum {string}
    */
  var action: unassigned
  
  /** User */
  var assignee: js.UndefOr[Organizationsurl | Null] = js.undefined
  
  var enterprise: js.UndefOr[Htmlurl] = js.undefined
  
  var installation: js.UndefOr[NodeidString] = js.undefined
  
  /**
    * Issue
    * @description The [issue](https://docs.github.com/rest/reference/issues) itself.
    */
  var issue: AssigneesAuthorassociation
  
  var organization: js.UndefOr[Hooksurl] = js.undefined
  
  var repository: Allowupdatebranch
  
  var sender: Avatarurl
}
object AssigneeEnterprise {
  
  inline def apply(issue: AssigneesAuthorassociation, repository: Allowupdatebranch, sender: Avatarurl): AssigneeEnterprise = {
    val __obj = js.Dynamic.literal(action = "unassigned", issue = issue.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssigneeEnterprise]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AssigneeEnterprise] (val x: Self) extends AnyVal {
    
    inline def setAction(value: unassigned): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setAssignee(value: Organizationsurl): Self = StObject.set(x, "assignee", value.asInstanceOf[js.Any])
    
    inline def setAssigneeNull: Self = StObject.set(x, "assignee", null)
    
    inline def setAssigneeUndefined: Self = StObject.set(x, "assignee", js.undefined)
    
    inline def setEnterprise(value: Htmlurl): Self = StObject.set(x, "enterprise", value.asInstanceOf[js.Any])
    
    inline def setEnterpriseUndefined: Self = StObject.set(x, "enterprise", js.undefined)
    
    inline def setInstallation(value: NodeidString): Self = StObject.set(x, "installation", value.asInstanceOf[js.Any])
    
    inline def setInstallationUndefined: Self = StObject.set(x, "installation", js.undefined)
    
    inline def setIssue(value: AssigneesAuthorassociation): Self = StObject.set(x, "issue", value.asInstanceOf[js.Any])
    
    inline def setOrganization(value: Hooksurl): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
    
    inline def setOrganizationUndefined: Self = StObject.set(x, "organization", js.undefined)
    
    inline def setRepository(value: Allowupdatebranch): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    inline def setSender(value: Avatarurl): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
  }
}
