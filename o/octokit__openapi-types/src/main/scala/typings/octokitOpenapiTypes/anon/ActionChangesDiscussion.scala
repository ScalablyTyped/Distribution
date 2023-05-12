package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.transferred
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionChangesDiscussion extends StObject {
  
  /** @enum {string} */
  var action: transferred
  
  var changes: Newdiscussion
  
  var discussion: Answerchosenat
  
  var enterprise: js.UndefOr[Htmlurl] = js.undefined
  
  var installation: js.UndefOr[NodeidString] = js.undefined
  
  var organization: js.UndefOr[Hooksurl] = js.undefined
  
  var repository: Allowupdatebranch
  
  var sender: Avatarurl
}
object ActionChangesDiscussion {
  
  inline def apply(
    changes: Newdiscussion,
    discussion: Answerchosenat,
    repository: Allowupdatebranch,
    sender: Avatarurl
  ): ActionChangesDiscussion = {
    val __obj = js.Dynamic.literal(action = "transferred", changes = changes.asInstanceOf[js.Any], discussion = discussion.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionChangesDiscussion]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ActionChangesDiscussion] (val x: Self) extends AnyVal {
    
    inline def setAction(value: transferred): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setChanges(value: Newdiscussion): Self = StObject.set(x, "changes", value.asInstanceOf[js.Any])
    
    inline def setDiscussion(value: Answerchosenat): Self = StObject.set(x, "discussion", value.asInstanceOf[js.Any])
    
    inline def setEnterprise(value: Htmlurl): Self = StObject.set(x, "enterprise", value.asInstanceOf[js.Any])
    
    inline def setEnterpriseUndefined: Self = StObject.set(x, "enterprise", js.undefined)
    
    inline def setInstallation(value: NodeidString): Self = StObject.set(x, "installation", value.asInstanceOf[js.Any])
    
    inline def setInstallationUndefined: Self = StObject.set(x, "installation", js.undefined)
    
    inline def setOrganization(value: Hooksurl): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
    
    inline def setOrganizationUndefined: Self = StObject.set(x, "organization", js.undefined)
    
    inline def setRepository(value: Allowupdatebranch): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    inline def setSender(value: Avatarurl): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
  }
}
