package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.labeled
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IssueLabel extends StObject {
  
  /** @enum {string} */
  var action: labeled
  
  var enterprise: js.UndefOr[Htmlurl] = js.undefined
  
  var installation: js.UndefOr[NodeidString] = js.undefined
  
  /**
    * Issue
    * @description The [issue](https://docs.github.com/rest/reference/issues) itself.
    */
  var issue: CommentsurlCreatedat
  
  /** Label */
  var label: js.UndefOr[ColorDefaultDescription] = js.undefined
  
  var organization: js.UndefOr[Hooksurl] = js.undefined
  
  var repository: Allowupdatebranch
  
  var sender: Avatarurl
}
object IssueLabel {
  
  inline def apply(issue: CommentsurlCreatedat, repository: Allowupdatebranch, sender: Avatarurl): IssueLabel = {
    val __obj = js.Dynamic.literal(action = "labeled", issue = issue.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[IssueLabel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IssueLabel] (val x: Self) extends AnyVal {
    
    inline def setAction(value: labeled): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setEnterprise(value: Htmlurl): Self = StObject.set(x, "enterprise", value.asInstanceOf[js.Any])
    
    inline def setEnterpriseUndefined: Self = StObject.set(x, "enterprise", js.undefined)
    
    inline def setInstallation(value: NodeidString): Self = StObject.set(x, "installation", value.asInstanceOf[js.Any])
    
    inline def setInstallationUndefined: Self = StObject.set(x, "installation", js.undefined)
    
    inline def setIssue(value: CommentsurlCreatedat): Self = StObject.set(x, "issue", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: ColorDefaultDescription): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setOrganization(value: Hooksurl): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
    
    inline def setOrganizationUndefined: Self = StObject.set(x, "organization", js.undefined)
    
    inline def setRepository(value: Allowupdatebranch): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    inline def setSender(value: Avatarurl): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
  }
}
