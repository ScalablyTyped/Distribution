package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.edited
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChangesComment extends StObject {
  
  /** @enum {string} */
  var action: edited
  
  /** @description The changes to the comment. */
  var changes: `527`
  
  /**
    * issue comment
    * @description The [comment](https://docs.github.com/rest/reference/issues#comments) itself.
    */
  var comment: IdIssueurl
  
  var enterprise: js.UndefOr[Htmlurl] = js.undefined
  
  var installation: js.UndefOr[NodeidString] = js.undefined
  
  /** @description The [issue](https://docs.github.com/rest/reference/issues) the comment belongs to. */
  var issue: AssigneeAssignees
  
  var organization: js.UndefOr[Hooksurl] = js.undefined
  
  var repository: Allowupdatebranch
  
  var sender: Avatarurl
}
object ChangesComment {
  
  inline def apply(
    changes: `527`,
    comment: IdIssueurl,
    issue: AssigneeAssignees,
    repository: Allowupdatebranch,
    sender: Avatarurl
  ): ChangesComment = {
    val __obj = js.Dynamic.literal(action = "edited", changes = changes.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], issue = issue.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangesComment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChangesComment] (val x: Self) extends AnyVal {
    
    inline def setAction(value: edited): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setChanges(value: `527`): Self = StObject.set(x, "changes", value.asInstanceOf[js.Any])
    
    inline def setComment(value: IdIssueurl): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setEnterprise(value: Htmlurl): Self = StObject.set(x, "enterprise", value.asInstanceOf[js.Any])
    
    inline def setEnterpriseUndefined: Self = StObject.set(x, "enterprise", js.undefined)
    
    inline def setInstallation(value: NodeidString): Self = StObject.set(x, "installation", value.asInstanceOf[js.Any])
    
    inline def setInstallationUndefined: Self = StObject.set(x, "installation", js.undefined)
    
    inline def setIssue(value: AssigneeAssignees): Self = StObject.set(x, "issue", value.asInstanceOf[js.Any])
    
    inline def setOrganization(value: Hooksurl): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
    
    inline def setOrganizationUndefined: Self = StObject.set(x, "organization", js.undefined)
    
    inline def setRepository(value: Allowupdatebranch): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    inline def setSender(value: Avatarurl): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
  }
}
