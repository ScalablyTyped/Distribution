package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.deleted_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstallationIssue extends StObject {
  
  /** @enum {string} */
  var action: deleted_
  
  /**
    * issue comment
    * @description The [comment](https://docs.github.com/rest/reference/issues#comments) itself.
    */
  var comment: IdIssueurl
  
  var enterprise: js.UndefOr[Htmlurl] = js.undefined
  
  var installation: js.UndefOr[NodeidString] = js.undefined
  
  /** @description The [issue](https://docs.github.com/rest/reference/issues) the comment belongs to. */
  var issue: ActivelockreasonAssignee
  
  var organization: js.UndefOr[Hooksurl] = js.undefined
  
  var repository: Allowupdatebranch
  
  var sender: Avatarurl
}
object InstallationIssue {
  
  inline def apply(
    comment: IdIssueurl,
    issue: ActivelockreasonAssignee,
    repository: Allowupdatebranch,
    sender: Avatarurl
  ): InstallationIssue = {
    val __obj = js.Dynamic.literal(action = "deleted", comment = comment.asInstanceOf[js.Any], issue = issue.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstallationIssue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InstallationIssue] (val x: Self) extends AnyVal {
    
    inline def setAction(value: deleted_): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setComment(value: IdIssueurl): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setEnterprise(value: Htmlurl): Self = StObject.set(x, "enterprise", value.asInstanceOf[js.Any])
    
    inline def setEnterpriseUndefined: Self = StObject.set(x, "enterprise", js.undefined)
    
    inline def setInstallation(value: NodeidString): Self = StObject.set(x, "installation", value.asInstanceOf[js.Any])
    
    inline def setInstallationUndefined: Self = StObject.set(x, "installation", js.undefined)
    
    inline def setIssue(value: ActivelockreasonAssignee): Self = StObject.set(x, "issue", value.asInstanceOf[js.Any])
    
    inline def setOrganization(value: Hooksurl): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
    
    inline def setOrganizationUndefined: Self = StObject.set(x, "organization", js.undefined)
    
    inline def setRepository(value: Allowupdatebranch): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    inline def setSender(value: Avatarurl): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
  }
}
