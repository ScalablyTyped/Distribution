package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.milestoned
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MilestoneOrganization extends StObject {
  
  /** @enum {string} */
  var action: milestoned
  
  var enterprise: js.UndefOr[Htmlurl] = js.undefined
  
  var installation: js.UndefOr[NodeidString] = js.undefined
  
  var issue: CommentsurlCommentsurl
  
  /**
    * Milestone
    * @description A collection of related issues and pull requests.
    */
  var milestone: Openissues
  
  var organization: js.UndefOr[Hooksurl] = js.undefined
  
  var repository: Allowupdatebranch
  
  var sender: Avatarurl
}
object MilestoneOrganization {
  
  inline def apply(
    issue: CommentsurlCommentsurl,
    milestone: Openissues,
    repository: Allowupdatebranch,
    sender: Avatarurl
  ): MilestoneOrganization = {
    val __obj = js.Dynamic.literal(action = "milestoned", issue = issue.asInstanceOf[js.Any], milestone = milestone.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[MilestoneOrganization]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MilestoneOrganization] (val x: Self) extends AnyVal {
    
    inline def setAction(value: milestoned): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setEnterprise(value: Htmlurl): Self = StObject.set(x, "enterprise", value.asInstanceOf[js.Any])
    
    inline def setEnterpriseUndefined: Self = StObject.set(x, "enterprise", js.undefined)
    
    inline def setInstallation(value: NodeidString): Self = StObject.set(x, "installation", value.asInstanceOf[js.Any])
    
    inline def setInstallationUndefined: Self = StObject.set(x, "installation", js.undefined)
    
    inline def setIssue(value: CommentsurlCommentsurl): Self = StObject.set(x, "issue", value.asInstanceOf[js.Any])
    
    inline def setMilestone(value: Openissues): Self = StObject.set(x, "milestone", value.asInstanceOf[js.Any])
    
    inline def setOrganization(value: Hooksurl): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
    
    inline def setOrganizationUndefined: Self = StObject.set(x, "organization", js.undefined)
    
    inline def setRepository(value: Allowupdatebranch): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    inline def setSender(value: Avatarurl): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
  }
}
